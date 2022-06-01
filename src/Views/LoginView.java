package src.Views;

import java.util.Scanner;
import src.*;
import src.Utils.Console;

public class LoginView {
    public static void show(App app, Scanner input) { 
        boolean menu = true;
        while (menu) {
            if (app.isLogged) { menu = false; break; }
            String userInput = Console.input("What would you like to do?:\n 0 -> exit\n 1 -> login\n 2 -> Sign up", input);
            if (userInput.isEmpty()) { Console.err("Type something!");; continue; }
            char option = userInput.charAt(0);

            switch (option) {
                case '1':
                    System.out.println("> Log in...");
        
                    String userName = Console.input("Type your name: ", input);
                    String userPass = Console.input("Type your password: ", input);
        
                    app.authUser(userName, userPass);
                    break;
                case '2':
                    System.out.println("> Sign up...");
            
                    String newName = Console.input("Type your name: ", input);     
                    String newPassword = Console.input("Type your password: ", input);
            
                    app.addUser(newName, newPassword);
                    break;
                case '0':
                    System.out.println("> Bye");
                    menu = false;
                    break;
                default:
                    System.out.println("> An error ocurred");
                    break;
            }
        }
    }
}
