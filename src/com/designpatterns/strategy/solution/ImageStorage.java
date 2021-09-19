package com.designpatterns.strategy.solution;
/*
* Applying strategy pattern
* difference between strategy and state pattern
* both patterns are used to change the behaviour of the object
* strategy:
* in strategy pattern, a class can have multiple attribute: ImageStore class has compressor and filter,
* ImageStore class behave differently depends on type of compressor and filter that passed in.
* state:
* in state pattern,  a class only can have one attribute: currentTool, and currentTool behaves differently
* depends on type of tool used: selection or brush
* */
public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        compressor.compress(fileName);

       filter.filter(fileName);
    }
}
