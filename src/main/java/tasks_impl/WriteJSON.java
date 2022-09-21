package tasks_impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteJSON {
    private final File file = new File("C:\\Users\\taras\\IdeaProjects\\file-homework\\textJSON.txt");

    public void write() {
        List<User> users = new ArrayList<>();

        try (Scanner sc = new Scanner(file);
             Writer writer = Files.newBufferedWriter(Paths.get("user.json"))) {
            sc.nextLine();
            while (sc.hasNextLine()) {
                String name = sc.next();
                int age = sc.nextInt();
                users.add(new User(name, age));
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(users, writer);
        } catch (IOException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
        }
    }
}


