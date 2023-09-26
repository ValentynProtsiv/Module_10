package TaskTwo;

import com.google.gson.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class TaskTwo {
    public static void main(String[] args){

        List<User> users = new LinkedList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(FileReader reader = new FileReader("src/main/java/TaskTwo/file.txt")){

        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        try (FileWriter fileWriter = new FileWriter("file.json")){

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}