package day_five.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GoodOrBad {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get("C://Users/jan.samoel/Documents/GitHub/AdventOfCode/src/day_five/java/input.txt"))) {
        list = stream.collect(Collectors.toList());
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("what");
    }

        list.forEach(System.out::println);

    }


}
