package DesignPatterns.structural.F_FlyweightPattern.WordDoc;

import java.util.HashMap;
import java.util.Map;

public class WordDocFlyweightFactory {
    private static final Map<String,WordDoc> charChache = new HashMap<>();

    private WordDocFlyweightFactory() {
    }

    public static WordDoc getInstance(char c, String font, boolean isBold, boolean isItalic) {
        String key = font + c + isBold + isItalic;

        if (charChache.get(key) == null) {
            WordDocImpl wordDoc = new WordDocImpl(c, font, isBold, isItalic);
            charChache.put(key, wordDoc);
        }
        return charChache.get(key);
    }
}
