package day_three.java;

import java.util.*;

public class Nogg {

    public static void main(String[] args) {

        String instructions = data();

        int x = 0;
        int y = 0;
        Map houses = new LinkedHashMap();

        for (int i=0; i < instructions.length(); i++) {
            char c = instructions.charAt(i);
            switch (c) {
                case '^':
                    y++;
                    break;

                case 'v':
                    y--;
                    break;
                case '>':
                    x++;
                    break;
                case '<':
                    x--;
                    break;
            }
            String coords = Integer.toString(x) + " " + Integer.toString(y);
            houses.put(coords, 1);
        }


        System.out.println(houses.toString());
        System.out.println(houses.size() + 1);


    }



    private static String data () {
        Scanner data = new Scanner(Nogg.class.getClassLoader().getResourceAsStream("day_three/resources/input.txt"));

        return data.next();

    }

}
