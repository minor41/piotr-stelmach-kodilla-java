package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String abc, PoemDecorator poemDecorator) {
        String addBeauty = poemDecorator.decorate(abc);
        System.out.println(" my name is Peter " + addBeauty);
    }

}
