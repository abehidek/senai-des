package src.Utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Log {
    public static void log(String action) throws IOException {
        LocalDateTime logDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        Path path = Paths.get("./logs/dev.log");
        List<String> logLines = new ArrayList<String>() {{ 
            add(
                "["+logDateTime.format(formatter)+"] "+action
            ); 
        }};
        Files.write(path, logLines, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }
}
