package src.Utils;

import org.json.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Json {
    public static JSONArray readJson(Path path) throws IOException {
        List<String> readLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        String stringReadLines = "";
        for (String line:readLines) { stringReadLines += line; }
        return new JSONArray(stringReadLines);
    }
    public static void appendJSON(Path path, HashMap<String, String> map) throws IOException {
        JSONArray jsonArray = readJson(path);
        jsonArray.put(map);
        List<String> writeLines = new ArrayList<>();
        writeLines.add(jsonArray.toString());
        Files.write(path, writeLines, StandardCharsets.UTF_8);
    }

    public static void appendJSON(Path path, JSONObject jsonObject) throws IOException {
        JSONArray jsonArray = readJson(path);
        jsonArray.put(jsonObject);
        List<String> writeLines = new ArrayList<>();
        writeLines.add(jsonArray.toString());
        Files.write(path, writeLines, StandardCharsets.UTF_8);
    }
}
