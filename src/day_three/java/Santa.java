package day_three.java;

 class Santa {

     Santa (String instructions, boolean robot) {
        int x = 0;
        int y = 0;
        Nogg.houses.put("0 0", 1);
        if (robot) {
            for (int i = 0; i < instructions.length(); i += 2) {
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
                String coords = x + " " + y;
                int count = Nogg.houses.getOrDefault(coords, 0);
                Nogg.houses.put(coords, count + 1);
            }
        }
        else {
            for (int i = 1; i < instructions.length(); i += 2) {
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
                String coords = x + " " + y;
                int count = Nogg.houses.getOrDefault(coords, 0);
                Nogg.houses.put(coords, count + 1);
            }
        }
    }

}
