package src;

import java.io.IOException;
import java.util.Scanner;

import src.Views.LoginView;
import src.Views.MenuView;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("> Init");

        Scanner input = new Scanner(System.in);
        App app = new App();

        LoginView.show(app, input);
        if (app.isLogged) { MenuView.show(); }
        input.close();
    }
}