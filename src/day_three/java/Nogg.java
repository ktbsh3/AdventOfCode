package day_three.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Nogg {

    static Map<String, Integer> houses = new LinkedHashMap<>();
    private static String instructions = data();

    public static void main(String[] args) {

        Santa santa = new Santa(instructions, false);
        Santa robosanta = new Santa(instructions, true);

        System.out.println(houses);
        System.out.println(houses.size());

    }







    private static String data () {

        Scanner data = new Scanner(Objects.requireNonNull(Nogg.class.getClassLoader().getResourceAsStream("day_three/resources/input.txt")));

        return data.next();

    }

}
