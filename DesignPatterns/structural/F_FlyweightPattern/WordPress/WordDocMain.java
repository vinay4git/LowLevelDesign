package DesignPatterns.structural.F_FlyweightPattern.WordPress;

public class WordDocMain {
    public static void main(String[] args) {
        WordDoc charac = WordDocFlyweightFactory.getInstance('t', "Arieal", true, false);
        charac.displayChar(1,1);
    }
}
