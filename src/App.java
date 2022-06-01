package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Path;
import org.json.*;
import src.Models.*;
import src.Utils.*;

public class App {
    private ArrayList<User> listUsers = new ArrayList<>();
    private User currentUser;
    public boolean isLogged = false;

    public App() throws IOException { updateListUsers(); } // Sync ArrayList<User> listUsers with database on object init

    public User getCurrentUser() { return currentUser; }
    public void setCurrentUser(User user) { this.currentUser = user; }

    public void updateListUsers() throws IOException { // Retrieve data from ./db/users.json and sync with listUsers
        Log.log("Updating local list of users");

        Path path = Paths.get("./db/users.json");
        JSONArray jsonArray = Json.readJson(path);
        for (int i = 0; i < jsonArray.length(); i++) {
            listUsers.add(new User(jsonArray.getJSONObject(i).getString("name"), jsonArray.getJSONObject(i).getString("password")));
        }
    }

    public void addUser(String name, String password) throws IOException {
        Log.log("Adding new user");

        for (User user:listUsers) {
            if (user.getName().equals(name)) { Console.err("User already taken"); return; }
        }

        Path path = Paths.get("./db/users.json");
        HashMap<String, String> map = new HashMap<String, String>() {{ put("name", name); put("password", password);  }};
        Json.appendJSON(path, map);
        updateListUsers();
    }

    public void authUser(String name, String password) throws IOException {
        Log.log("Autheticating user");

        if (listUsers.size() == 0) { Console.err("No user created"); }
        for (User user:listUsers) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) { 
                setCurrentUser(user);
                isLogged = true;
                Log.log("User succefully authenticated");
                Console.print("\nAuthenticated!\n");
                return;
            }
        }
        Log.log("Invalid user or password");
        Console.err("\nUser or password incorrect\n");
    }

    public void logoutUser() throws IOException {
        Log.log("User logout");
        isLogged = false;
        currentUser = null;
    }
}
