package Utils;

public class Console {
    public static void print(String string) {
        System.out.println(">> "+string);
    }

    public static void err(String error) {
        System.out.println(">! "+error);
    }
}
