package clean.code.structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimizedFormattedText {
    private final String plainText;
    private final List<TextRange> formatting = new ArrayList<>();

    public OptimizedFormattedText(String plainText) {
        this.plainText = plainText;
    }

    public List<String> getSentence(String plainText)
    {
        // todo
        return  Arrays.stream(plainText.split(" ")).toList();
    }

    public TextRange getRange(int start, int end) {
        TextRange tr = new TextRange(start, end);
        formatting.add(tr);
        return tr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            for (TextRange form : formatting) {
                if (form.covers(i) && form.capitalize) {
                    c = Character.toUpperCase(c);
                }
            }
            sb.append(c);

        }
        return sb.toString();
    }

    public class TextRange {
        public boolean bold, italic, capitalize;
        private final int start;
        private final int end;

        public TextRange(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean covers(int pos) {
            return pos >= start && pos <= end;
        }
    }


}
