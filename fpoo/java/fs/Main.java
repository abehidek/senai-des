package fs;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        System.out.println("Hello FS");
        String foo = "bar";

        Path path = Paths.get("./fpoo/java/fs/text.txt");

        byte[] strtobyte = foo.getBytes();
        Files.write(path, strtobyte);

        String read = Files.readAllLines(path).get(0);
        System.out.println(read);
    }    
}
