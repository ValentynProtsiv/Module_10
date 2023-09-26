package TaskOne;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskOne {
    static File file = new File("src/main/java/TaskOne/file.txt");
    public static void readFile() {
        final String phoneFormat1 = "(\\(\\d{3}\\)) \\d{3}-\\d{4}";
        final String phoneFormat2 = "\\d{3}-\\d{3}-\\d{4}";

        List<String> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null){
                numbers.add(line.trim());
            }
            List<String> correctNumbers = new ArrayList<>();
            for (String a : numbers) {
                if (a.matches(phoneFormat1) || a.matches(phoneFormat2)){
                    correctNumbers.add(a);
                }
            }
            for (String b : correctNumbers) {
                System.out.println(b);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        readFile();
    }
}
