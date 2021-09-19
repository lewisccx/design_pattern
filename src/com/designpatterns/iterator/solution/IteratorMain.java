package com.designpatterns.iterator.solution;

public class IteratorMain {

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.push("a");
        browserHistory.push("b");
        browserHistory.push("c");
        browserHistory.pop();


        Iterator iterator = browserHistory.createIterator();
        while (iterator.hasNext()){
            Object url= iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
