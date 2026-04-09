import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> map = buildPatternMap();

        renderBanner("OOPS", map);
    }

    // Build map of patterns
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    // Render function
    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(map.get(c)[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}