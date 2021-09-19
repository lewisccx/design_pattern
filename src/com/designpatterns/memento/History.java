package com.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public  abstract class History {

    private List<State> states = new ArrayList<>();

    void push(Object state){
        states.add((State) state);
        };
    Object pop(){
        int lastIndex = states.size() - 1;
        State lastState= states.get(lastIndex);
        states.remove(lastState);
        return  states.get(states.size()-1);
    };
}
