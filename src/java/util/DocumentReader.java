package util;

import model.Major;
import model.MajorEnum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentReader {

    private static final String RELATIVE_PATH = "src/resources/szakok.txt";

    public static Map<MajorEnum, List<Major>> majorMap = new HashMap<>();

    public static void read() throws IOException {
        FileReader fileReader = new FileReader(RELATIVE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (String line; (line = bufferedReader.readLine()) != null;) {
            Major currentMajor = new Major(line.split(";"));

            majorMap.putIfAbsent(
                    currentMajor.getMajor(),
                    new ArrayList<>());
            majorMap.get(currentMajor.getMajor()).add(currentMajor);
        }
    }
}
