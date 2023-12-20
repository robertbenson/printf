# printf using Java

In Java, printf is a method used for formatted output. It is part of the PrintStream class and is typically used to format and print data to the console. The printf method allows you to specify a format string, which can include placeholders for different data types (e.g., integers, floating-point numbers, strings), you provide the values to be inserted into the placeholders.

`printf(format, arguments);`

`%[index][flags][width][.precision]conversion-character`


![printf.png](images%2Fprintf.png)

## output:

`' 42.54'`

format is the fortmatted string, arguments are the values that are provided to the formatted string.
## placeholder %

`%n` is the same as `\n`, ie newline



In the printf function, the `%` character is used as a format specifier to indicate where and how to insert values into the formatted string

e.g. `"Hello %s %s";`   has two placeholders, that are strings.


`%d `is used as a placeholder for an integer, 

`%f` for a floating-point number, 

`%s` for a string, and so on.

`System.out.printf("Hello %s %s", "foo", "bar");` foo is allocated to the first placeholder, bar is allocated to the second.

### output 
`Hello foo bar`
## `System.out.printf(format, arguments);`



    String format = "Hello %s%n";    // placeholder for a string  %n is newline
    Object arguments = "World";
    System.out.printf(format, arguments);

    output: Hello World

### The order of arguments, default or index:
#### default
    int intValue = 128;
    double doubleValue = 3.141;
    String stringValue = "foo";

    // Using %d for integer, %f for floating-point, %s for string
    System.out.printf("Integer: %d, Floating-point: %.2f, String: %s%n", intValue, doubleValue, stringValue);   // the double value has 2 dp precision added .2
    
    output: Integer: 128, Floating-point: 3.14, String: foo

#### index 

specify explicitly, using an index, which argument to use with placeholder:
```
System.out.printf("%3$d  %4$d  %2$d  %1$d\n", 1,  2,  3,  4);     //3,4,2,1
System.out.printf("%4$d  %3$d  %1$d  %2$d\n", 1,  2,  3,  4);     //4,3,1,2
```
output:
```
3  4  2  1
4  3  1  2
```

## System.out.printf(locale, format, arguments);
## locale
A locale represents a specic geographical, political or cultural region.
    
It is primarily used for formatting and parsing dates, numbers in a _locale-sensitive_ manner.

### locale amount

The same amount, displayed in _locale-sensitive_ format;
```
double amount = 2456220.156;
printfLocaleAmount(Locale.UK, amount);
printfLocaleAmount(Locale.FRANCE, amount);
printfLocaleAmount(Locale.GERMANY, amount);
printfLocaleAmount(Locale.ITALY, amount);
```

```
private static void printfLocaleAmount(Locale locale, double amount) {
    System.out.printf(locale, "locale amount in %s is %,.2f%n", locale.getCountry(), amount);
}
```


#### output:

```
locale amount in GB is 2,456,220.16
locale amount in FR is 2 456 220,16
locale amount in DE is 2.456.220,16
locale amount in IT is 2.456.220,16
```


### locale date


```
Date date = new Date();
printfLocaleDate(Locale.UK,date);
printfLocaleDate(Locale.FRANCE,date);
printfLocaleDate(Locale.GERMANY,date);
printfLocaleDate(Locale.ITALY,date);
```

```
private static void printfLocaleDate(Locale locale, Date date) {
    System.out.printf(locale, "locale date in %s is %tc%n", locale.getCountry(), date);
}
```

#### output:
The same date, displayed in _locale-sensitive_ format;
```
locale date in GB is Wed Dec 20 10:54:27 GMT 2023
locale date in FR is mer. déc. 20 10:54:27 GMT 2023
locale date in DE is Mi. Dez. 20 10:54:27 GMT 2023
locale date in IT is mer dic 20 10:54:27 GMT 2023
```
## flags

Flags are used within the format string to modify the output format.