package com.designpatterns.strategy.solution;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("Applying black and white filter");
    }
}
