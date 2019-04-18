package day_six.java;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MillionLights {
    public static void main(String[] args) {
        int[][] grid = new int[1000][1000];
        Scanner data = new Scanner(Objects.requireNonNull(MillionLights.class.getClassLoader().getResourceAsStream("day_six/resources/input.txt")));
        Pattern p = Pattern.compile("^(.*) ([0-9]+,[0-9]+).* ([0-9]+,[0-9]+)$");
        while (data.hasNextLine()) {
            String s = data.nextLine();
            Matcher m = p.matcher(s);
            String change = null;
            String startCoords = null;
            String endCoords = null;
            if (m.matches()) {
                change = m.group(1);
                startCoords = m.group(2);
                endCoords = m.group(3);
            }
            String[] stcary = startCoords.split(",");
            String[] encary = endCoords.split(",");
            int sx = Integer.parseInt(stcary[0]);
            int sy = Integer.parseInt(stcary[1]);
            int ex = Integer.parseInt(encary[0]);
            int ey = Integer.parseInt(encary[1]);
            for (int i = sx; i <= ex; i++) {
                for (int q = sy; q <= ey; q++) {
                    if (change.contains("turn on")) {
                        grid[i][q] += 1;
                    }
                    if (change.contains("turn off")) {
                        if (grid[i][q] == 0) {

                        }
                        else {
                            grid[i][q] -= 1;
                        }
                    }
                    if (change.contains("toggle")) {

                            grid[i][q] += 2;

                    }

                }
            }

        }

        int sum = 0;
        for (int[] i: grid) {
            for (int q: i) {
                sum += q;
            }
        }


        System.out.println(Arrays.deepToString(grid).replace("], ", "]\n"));
        System.out.println(sum);


    }
}
