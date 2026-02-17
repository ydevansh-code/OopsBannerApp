import java.util.HashMap;
import java.util.Map;

class LetterPattern {
    String[] lines;

    public LetterPattern(String[] lines) {
        this.lines = lines;
    }

    public void printLine(int index) {
        if (index < lines.length) {
            System.out.print(lines[index] + "  ");
        } else {
            System.out.print("      ");
        }
    }
}

public class BannerApp {
    public static void main(String[] args) {
        Map<Character, LetterPattern> dictionary = new HashMap<>();

        dictionary.put('O', new LetterPattern(new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*    *",
            " *** "
        }));

        dictionary.put('P', new LetterPattern(new String[]{
            "**** ",
            "*  *",
            "**** ",
            "* ",
            "* "
        }));

        dictionary.put('S', new LetterPattern(new String[]{
            " ****",
            " * ",
            " ****",
            "    *",
            " **** "
        }));

        String text = "OOPS";
        
        for (int i = 0; i < 5; i++) {
            for (char c : text.toCharArray()) {
                if (dictionary.containsKey(c)) {
                    dictionary.get(c).printLine(i);
                }
            }
            System.out.println();
        }
    }
}