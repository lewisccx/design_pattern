package com.designpatterns.memento;
// Memento
public class ContentState extends State {
    private final String content;

    public ContentState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
