public class BannerApp {

    public static String[] getO() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    public static String[] getP() {
        return new String[] {
            "**** ",
            "*  *",
            "**** ",
            "* ",
            "* "
        };
    }

    public static String[] getS() {
        return new String[] {
            " ****",
            " * ",
            " ****",
            "    *",
            " **** "
        };
    }

    public static void main(String[] args) {
        String[][] word = { getO(), getO(), getP(), getS() };

        for (int i = 0; i < 5; i++) {
            for (String[] letter : word) {
                System.out.print(letter[i] + "  ");
            }
            System.out.println();
        }
    }
}