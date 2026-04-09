import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Inner class to store character and pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create map to store patterns
        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        map.put('P', new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        map.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(map.get(c).getPattern()[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}