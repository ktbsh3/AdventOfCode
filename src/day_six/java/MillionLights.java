package day_six.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MillionLights {
    public static void main(String[] args) {
        boolean[][] grid = new boolean[1000][1000];
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
                //System.out.println("STATE CHANGE: " + change + " STARTER COORDS: " + startCoords + " END COORDS: " + endCoords);

            }
            String[] stcary = startCoords.split(",");
            String[] encary = endCoords.split(",");
            int sx = Integer.parseInt(stcary[0]);
            int sy = Integer.parseInt(stcary[1]);
            int ex = Integer.parseInt(encary[0]);
            int ey = Integer.parseInt(encary[1]);
            System.out.println("sX: " + sx + "\nsY: " + sy);
            //System.out.println(Integer.parseInt(stcary[0]));






        }
        for (int i = 0; i < 999; i++) {
            for (int q = 0; q < 999; q++) {
                System.out.println("nqr" + "i :" + i + " q: " +q);
            }
        }
        //System.out.println(Arrays.deepToString(grid).replace("], ", "]\n"));

    }
}
