package src.Utils;

import java.util.Scanner;

public class Console {
    public static void print(String string) {
        System.out.println(">> "+string);
    }

    public static void err(String error) {
        System.out.println(">! "+error);
    }

    public static String input(String string, Scanner input) {
        System.out.println(">? "+string);
        String userinput = input.nextLine();
        return userinput;
    }
}
