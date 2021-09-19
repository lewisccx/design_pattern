package com.designpatterns.strategy.solution;

public class ImageStoreMain {

    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a");
    }
}
