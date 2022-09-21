package tasks_impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PhoneRegexCheck {
    private final File file = new File("C:\\Users\\taras\\IdeaProjects\\file-homework\\text.txt");

    public void check()  {
        String phonePattern1 = "^[(]\\d{3}[)] \\d{3}[-]\\d{4}$";
        String phonePattern2 = "^\\d{3}[-]\\d{3}[-]\\d{4}$";

        List<String> strings = new ArrayList<>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String next = sc.nextLine();
                if (next.matches(phonePattern1) ||
                        next.matches(phonePattern2)) {
                    strings.add(next);
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
        }

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
