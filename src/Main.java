import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String format = "Hello %s%n";
        Object arguments = "World";
        System.out.printf(format, arguments);

        Locale locale = new Locale("en", "GB");
        System.out.printf(locale, format, arguments);

//        %[flags][width][.precision]conversion-character
    }
}