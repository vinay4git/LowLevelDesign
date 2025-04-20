package DesignPatterns.structural.F_FlyweightPattern.WordPress;

public class WordDocImpl implements WordDoc{
    private final char character;
    private final String font;
    private final boolean isBold;
    private final boolean isItalic;

    public WordDocImpl(char character, String font, boolean isBold, boolean isItalic) {
        this.character = character;
        this.font = font;
        this.isBold = isBold;
        this.isItalic = isItalic;
    }

    @Override
    public void displayChar(int row, int column) {
        System.out.println("Display char " + character + " with font: " + font + " And bold:"+ isBold + " and isItalic:" + isItalic + " at position:" + row +"," + column);
    }
}
