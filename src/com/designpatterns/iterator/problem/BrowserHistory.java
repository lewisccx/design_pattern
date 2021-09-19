package com.designpatterns.iterator.problem;

/*
* Problem
* web browser keep a copy of visited history in a List
* if developer going to decide to change the list to array
* the code is going to break
* Changing of internal structure should not affect its consumer
* */

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {


    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }

}
