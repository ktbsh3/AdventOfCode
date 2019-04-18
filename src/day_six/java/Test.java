package day_six.java;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] ary = new int[1000][1000];
        int startX = 0;
        int startY = 0;
        int endX = 999;
        int endY = 999;
        for (int i = startX; i <= endX; i++) {
            for (int q = startY; q <= endY; q++) {
                ary[i][q] += 2;
            }
        }
        int sum = 0;
        for (int[] i: ary) {
            for (int q: i) {
                sum += q;
            }
        }
        //System.out.println(Arrays.deepToString(ary).replace("], ", "]\n"));
        //System.out.println(sum);
    }
}
