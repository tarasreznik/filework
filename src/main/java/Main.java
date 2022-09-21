import tasks_impl.CountWordFrequency;
import tasks_impl.PhoneRegexCheck;
import tasks_impl.WriteJSON;

public class Main {
    public static void main(String[] args) {
        PhoneRegexCheck checker = new PhoneRegexCheck();
        checker.check();

        WriteJSON writer = new WriteJSON();
        writer.write();

        CountWordFrequency counter = new CountWordFrequency();
        counter.count();

    }
}
