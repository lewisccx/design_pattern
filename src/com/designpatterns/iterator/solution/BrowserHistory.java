package com.designpatterns.iterator.solution;

/*
* Problem
* web browser keep a copy of visited history in a List
* if developer going to decide to change the list to array
* the code is going to break
* Changing of internal structure should not affect its consumer
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrowserHistory {


    //private List<String> urls = new ArrayList<>();
   private String[] urls = new String[10];
   private int count;
    public void push(String url){
        urls[count++] = url;
    }

    public String pop(){

//        int lastIndex = urls.size() - 1;
//        String lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
        return urls[--count];
    }

    public Iterator createIterator (){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {

        private BrowserHistory browserHistory;
        private int index;
        public ListIterator(BrowserHistory browserHistory){
            this.browserHistory = browserHistory;
        }

        @Override
        public boolean hasNext() {
            return (index < browserHistory.count);
        }

        @Override
        public Object current() {
            return browserHistory.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
