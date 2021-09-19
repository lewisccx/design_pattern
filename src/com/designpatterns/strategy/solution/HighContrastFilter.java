package com.designpatterns.strategy.solution;

public class HighContrastFilter implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("Applying high contrast filter");
    }
}
