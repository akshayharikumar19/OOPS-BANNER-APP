public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(
                String.join("   ", o[i], o[i], p[i], s[i])
            );
        }
    }

    // Method for letter O
    public static String[] getO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method for letter P
    public static String[] getP() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method for letter S
    public static String[] getS() {
        return new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}
