package com.designpatterns.memento;
// Memento
public class FontSizeState  extends  State{
    private final String fontSize;

    public FontSizeState(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontSize() {
        return fontSize;
    }
}
