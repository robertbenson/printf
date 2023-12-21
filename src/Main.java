import java.util.Date;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("'%1$,6.2f' %n", 42.54);         //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String format = "Hello %s%n";
        Object arguments = "World";
        System.out.printf(format, arguments);

        Locale locale = new Locale("en", "GB");
        System.out.printf(locale, format, arguments);

//        %[flags][width][.precision]conversion-character

        System.out.printf("'%s' %n", "foobar");         //                                    in single quotes
        System.out.printf("'%-10s' %n", "foobar");      //left justify , 10 character string, in single quotes
        System.out.printf("'%10s' %n", "foobar");       //right justify, 10 character string, in single quotes
        System.out.printf("'%10S' %n", "foobar");       //             , 10 character string, in single quotes, CAPITALS

        int intValue = 128;
        double doubleValue = 3.141592;
        String stringValue = "foo";

        // Using %d for integer, %f for floating-point, %s for string
        System.out.printf("Integer: %d, Floating-point: %.3f, String: %s%n", intValue, doubleValue, stringValue);
        System.out.printf("%3$d  %4$d  %2$d  %1$d\n", 1,  2,  3,  4);
        System.out.printf("%4$d  %3$d  %1$d  %2$d\n", 1,  2,  3,  4);


        Car car = new Car();
        car.setAutomatic(true);
        car.setFuel("Electric");
        car.setName("BobCar");
        car.setNumberWheels(5);

        System.out.printf("Car String: %s%n", car);

        double amount = 2456220.156;
        printfLocaleAmount(Locale.UK, amount);
        printfLocaleAmount(Locale.FRANCE, amount);
        printfLocaleAmount(Locale.GERMANY, amount);
        printfLocaleAmount(Locale.ITALY, amount);

        Date date = new Date();
        printfLocaleDate(Locale.UK,date);
        printfLocaleDate(Locale.FRANCE,date);
        printfLocaleDate(Locale.GERMANY,date);
        printfLocaleDate(Locale.ITALY,date);

        System.out.printf("%1$tA, %1$tB %1$tY %n", date);    //one argument, use in 3 placeholders
        System.out.printf("%1$td.%1$tm.%1$ty , day of year: %1$tj%n%n", date);
        
        printfFlags();
    }

    private static void printfFlags() {
        Integer number = 45;
        System.out.printf("Flags number  %d, right justified %6d%n", number, number);
        System.out.printf("Flags number  %d, +left justified %+d%n", number, number);
        System.out.printf("Flags number  %d, leading zeroes  %06d%n", number, number);
        Integer numberNegative = -45;
        System.out.printf("Flags number %d, negative        %(6d%n", numberNegative,numberNegative);
        System.out.printf("Flags number  %d, hexadecimal     %#x\n", number,number);
        System.out.printf("Flags number  %d, hexadecimal     %06X%n\n", number,number);

    }

    private static void printfLocaleDate(Locale locale, Date date) {
        System.out.printf(locale, "locale date in %s is %tc%n", locale.getCountry(), date);
    }

    private static void printfLocaleAmount(Locale locale, double amount) {
        System.out.printf(locale, "locale amount in %s is %,.2f%n", locale.getCountry(), amount);
    }
}