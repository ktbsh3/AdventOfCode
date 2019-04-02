package day_four.java;

public class Hash {
    public static void main(String[] args) {
        String key = "yzbqklnj";
        String booty = "empty";

        for (int i = 0; i < 2147483647; i++) {
            booty = Emdee5.getMD5(key + i);
            System.out.println(i);
            if (booty.startsWith("000000")) {
                System.out.println("MD5: \n\n" + booty + "\n");
                System.out.println("ASCII: \n\n" + key+i + "\n");
                break;
            }
        }
    }
}
