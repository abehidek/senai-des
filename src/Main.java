package src;

import java.io.IOException;
import java.util.Scanner;

import src.Utils.Log;
import src.Views.LoginView;
import src.Views.MenuView;

public class Main {
    public static void main(String[] args) {
        try {
            Log.log("Init program");
            Scanner input = new Scanner(System.in);
            App app = new App();
            LoginView.show(app, input);
            if (app.isLogged) { MenuView.show(app, input); }
            input.close();
            Log.log("Exiting");
        } catch (Exception e) {
            try {
                Log.log(e.toString());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}