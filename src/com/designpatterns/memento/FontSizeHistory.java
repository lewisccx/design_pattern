package com.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class FontSizeHistory extends History {


    private List<FontSizeState> fontSizeStates = new ArrayList<>();

 /*   @Override
    public void push(Object state) {
        fontSizeStates.add((FontSizeState) state);
    }

    @Override
    public Object pop() {
        int lastIndex = fontSizeStates.size() - 1;
        FontSizeState lastState= fontSizeStates.get(lastIndex);
        fontSizeStates.remove(lastState);
        return  fontSizeStates.get(fontSizeStates.size()-1);
    }*/
}
