package clean.code.structural.flyweight;

public class FormattedText {
    private String plainText;
    private boolean[] capitalize;

    public FormattedText(String plainText) {
        this.plainText = plainText;
        this.capitalize = new boolean[plainText.length()];
    }
    public void capitalize(int start,int end)
    {
        for (int i = start; i <= end ; i++) {
            capitalize[i]=true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char chr = plainText.charAt(i);
            sb.append(capitalize[i]?Character.toUpperCase(chr):Character.toLowerCase(chr));
        }
        return sb.toString();
    }
}
