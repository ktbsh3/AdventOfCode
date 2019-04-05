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
                String filtered = str;
                if (filtered.matches(".*(.)\\1.*")){
                    String doubleFiltered = filtered;
                    if (doubleFiltered.matches(".*(ab|cd|pq|xy).*")) {
                        System.out.println("cancer: " + doubleFiltered);
                    }

                    else {
                        counter++;
                        System.out.println("FOUND: " + doubleFiltered);
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
            if (str.matches("")){
                System.out.println(str);
            }
        }

    }
}
