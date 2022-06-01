package src.Views;

import java.util.Scanner;
import src.*;
import src.Utils.*;

public class MenuView {
    public static void show(App app, Scanner input) {
        System.out.println("Hello "+app.getCurrentUser().getName());

        boolean menu = true;
        while (menu) {
            String userInput = Console.input("What would you like to do?:\n 0 -> exit\n 1 -> List product\n 2 -> Add Product\n 3 -> Remove product\n 4 -> Edit product", input);
            if (userInput.isEmpty()) { Console.err("Type something!");; continue; }
            char option = userInput.charAt(0);

            switch (option) {
                case '1':
                    break;
                case '2':
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
