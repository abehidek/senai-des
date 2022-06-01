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

    public App() {}

    public User getCurrentUser() { return currentUser; }
    public void setCurrentUser(User user) { this.currentUser = user; }

    public void addUser(String name, String password) throws IOException {
        for (User user:listUsers) {
            if (user.getName().equals(name)) { Console.err("User already taken"); return; }
        }

        this.listUsers.add(new User(name, password));
        Path path = Paths.get("./db/users.json");
        // Json.appendJSON(path, new HashMap<String, String>());
    }

    public void authUser(String name, String password) {
        if (listUsers.size() == 0) { Console.err("No user created"); }
        for (User user:listUsers) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) { 
                setCurrentUser(user);
                isLogged = true;
                Console.print("Authenticated!");
                Console.print("Current user: "+currentUser.getName());
            }
            else { Console.err("> User or password incorrect"); }
        }
    }

    public void logoutUser() {
        isLogged = false;
        currentUser = null;
    }
}
