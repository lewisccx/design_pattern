package com.designpatterns.memento;
// Memento
public class FontNameState extends  State {
    private final String fontName;

    public FontNameState(String fontName) {
        this.fontName = fontName;
    }

    public String getFontName() {
        return fontName;
    }
}
