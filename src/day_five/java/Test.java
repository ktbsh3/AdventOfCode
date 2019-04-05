package day_five.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        //2 followed by 2 five times
        String test = "222222";
        String pattern = "(\\d\\d\\d\\d\\d)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(test);
        if (m.find( )) {
            System.out.println("Matched!");
        }else {
            System.out.println("not matched!");
        }
        //\1 as back reference to capturing group (\d)
        pattern = "(\\d)\\1{5}";
        r = Pattern.compile(pattern);
        m = r.matcher(test);
        if (m.find( )) {
            System.out.println("Matched!");
        }else {
            System.out.println("not matched!");
        }
    }
}
