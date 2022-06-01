package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.io.IOException;
import java.nio.file.Path;
import org.json.*;
import src.Models.*;
import src.Utils.*;

public class App {
    private ArrayList<Product> stock = new ArrayList<>();
    private ArrayList<User> listUsers = new ArrayList<>();
    private User currentUser;
    public boolean isLogged = false;

    public App() throws IOException { updateListUsers(); updateStockList(); } // Sync ArrayList<User> listUsers with database on object init
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

    public void updateStockList() throws IOException {
        Log.log("Updating local stock");

        Path path = Paths.get("./db/stock.json");
        JSONArray jsonArray = Json.readJson(path);
        for (int i = 0; i < jsonArray.length(); i++) {
            stock.add(new Product(
                jsonArray.getJSONObject(i).getInt("id"), 
                jsonArray.getJSONObject(i).getString("name"),
                jsonArray.getJSONObject(i).getString("name"),
                jsonArray.getJSONObject(i).getInt("qtd")
            ));
        }
    }

    public void listProducts() {
        for (Product product:stock) {
            System.out.println(product.getName());
        }
    }

    public void addProduct(int id, String name, String type, int qtd) throws IOException {
        for (Product product:stock) {
            if (product.getName().equals(name)) { Console.err("Product name already exist"); return; }
            if (product.getId() == id) { Console.err("Product ID already exist"); return; }
        }

        // stock.add(new Product(id, name, type, qtd));

        Path path = Paths.get("./db/stock.json");
        HashMap<String, String> map = new HashMap<String, String>() {{  
            put("name", name);
            put("type", type);

        }};
        HashMap<String, Integer> map2 = new HashMap<String, Integer>() {{
            put("id", id);
            put("qtd", qtd);
        }};

        String stringJson = MessageFormat.format(" { \"id\": {0}, \"name\": {1}, \"type\": {2}, \"qtd\": {3}, }", id, name, type, qtd);

        System.out.println(stringJson);

        // Json.appendJSON(path, map);
        updateListUsers();
    }
}
