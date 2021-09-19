package com.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;
// Caretaker
public class ContentHistory extends History {

    private final List<ContentState> contentStates= new ArrayList<>();


    @Override
    public void push(Object state) {
        contentStates.add((ContentState) state);
    }

    @Override
    public Object pop() {
        int lastIndex = contentStates.size() - 1;
        ContentState lastState= contentStates.get(lastIndex);
        contentStates.remove(lastState);
        return  contentStates.get(contentStates.size()-1);
    }
}
