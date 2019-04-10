package day_five.java;

import java.util.Objects;
import java.util.Scanner;

public class GoodOrBad {
    public static void main(String[] args) {

        two();



    }

    private static void one() {
        Scanner data = new Scanner(Objects.requireNonNull(GoodOrBad.class.getClassLoader().getResourceAsStream("day_five/resources/input.txt")));
        int counter = 0;
        while (data.hasNext()) {
            String str = data.next();
            if (str.matches("(.*[aeiou].*){3,}")) {
                if (str.matches(".*(.)\\1.*")){
                    if (str.matches(".*(ab|cd|pq|xy).*")) {
                        System.out.println("cancer: " + str);
                    }

                    else {
                        counter++;
                        System.out.println("FOUND: " + str);
                    }

                }
            }
        }
        System.out.println(counter);
    }

    static void two() {
        Scanner data = new Scanner(Objects.requireNonNull(GoodOrBad.class.getClassLoader().getResourceAsStream("day_five/resources/input.txt")));
        int counter = 0;
        while (data.hasNext()){
            String str = data.next();
            if (str.matches(".*(..).*\\1.*")){
                if (str.matches(".*(.).\\1.*")) {
                    System.out.println(str);
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
