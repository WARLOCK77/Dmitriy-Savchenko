package ua.levelup.homework9;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class FileReaderForMap {

    public static final String FILE="FileHomework9.txt";

    public static String [] readFile(String fileName) {
        Map<String, String> map=new HashMap<>();
        byte[] file = ReadFromFile.fileReader(fileName);
        if (file.length > 0) {
            String str = new String(file, StandardCharsets.UTF_8);
            String[] lines = str.split(";");
            String[] s = new String[lines.length];
            for (int i = 0; i < lines.length; i++) {
                String[] sLine = lines[i].split(",");
                map.put(sLine[0], sLine[1]);
                s[i]= map.get(sLine[0]);
            }
            return s;
        }
        return new String[0];
    }
}
