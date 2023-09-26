package TaskThree;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("src/main/java/TaskThree/words.txt")) {
            Scanner scanner = new Scanner(fileReader);
            String text = "";
            while (scanner.hasNextLine()){
                text += scanner.nextLine().toString() + " ";
            }
            text = text.strip().toLowerCase().replaceAll("\n", "").replaceAll("\\s+", " ");
            String[] textArr = text.split(" ");
            Map<String, Integer> textMap = new HashMap<String, Integer>();
            for (String words: textArr) {
                if (!textMap.containsKey(words))
                    textMap.put(words, 0);
                textMap.put(words, textMap.get(words) + 1);
            }
            textMap.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
