package src.Utils;

import src.*;
import src.Models.*;
import org.json.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.List;

public class Json {
    public static JSONArray readJson(Path path) throws IOException {
        List<String> readLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        String stringReadLines = "";
        for (String line:readLines) { stringReadLines += line; }
        return new JSONArray(stringReadLines);
    }
    public static void appendJSON(Path path, Map map) throws IOException {
        JSONArray jsonArray = readJson(path);
        // jsonArray.put("name", );
        jsonArray.put(map);
        List<String> writeLines = new ArrayList<>();
        writeLines.add(jsonArray.toString());
        Files.write(path, writeLines, StandardCharsets.UTF_8);
    }
}
