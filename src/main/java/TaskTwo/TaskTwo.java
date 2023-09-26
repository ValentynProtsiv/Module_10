package TaskTwo;
import com.google.gson.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class TaskTwo {
    public static void main(String[] args){

        List<User> users = new LinkedList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try(FileReader reader = new FileReader("src/main/java/TaskTwo/file.txt")){

            Scanner scanner = new Scanner(reader);
            scanner.nextLine();

            while (scanner.hasNextLine()){
                String[] lineArr = scanner.nextLine().split(" ");
                User user = new User(lineArr[0], Integer.parseInt(lineArr[1]));
                users.add(user);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileWriter fileWriter = new FileWriter("src/main/java/TaskTwo/user.json")){
            gson.toJson(users, fileWriter);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}