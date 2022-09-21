package tasks_impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CountWordFrequency {
    private final File file = new File("C:\\Users\\taras\\IdeaProjects\\file-homework\\textWord.txt");

    public void count() {
        Map<String, Integer> countWords = new HashMap<>();
        List<String> allWords = new ArrayList<>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String next = sc.next();
                allWords.add(next);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
        }

        for (String w : allWords) {
            countWords.merge(w, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> m : countWords.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
