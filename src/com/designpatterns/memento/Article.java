package com.designpatterns.memento;

// Originator
public class Article {
    private String content;
    private String fontName;
    private String fontSize;

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
    public void setFontName(String fontName) {
        this.fontName = fontName;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public ContentState createContent(){
        return new ContentState(content);
    }

    public void restoreContent(ContentState state){
        content = state.getContent();
    }

    public FontNameState createFontName(){
        return  new FontNameState(fontName);
    }

    public void restoreFontName(FontNameState state){
        fontName = state.getFontName();
    }

    public FontSizeState createFontSize(){
        return  new FontSizeState(fontSize);
    }

    public void restoreFontSize(FontSizeState state){
        fontSize = state.getFontSize();
    }
}
