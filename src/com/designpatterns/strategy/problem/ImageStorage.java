package com.designpatterns.strategy.problem;


/*
* Problem:
* too many responsibilities: compress and filter
* class get bigger if there are more file format accepted by the app
* class also get bigger if there are more filter function added to the app
* */
public class ImageStorage {

    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        if(compressor == "jpeg")
            System.out.println("Compressing using JPEG");
        else if(compressor == "png")
            System.out.println("Compressing using PNG");

        if (filter == "b&w")
            System.out.println("Applying b&w filter");
        else if(filter == "highContrast")
            System.out.println("Applying high contrast filter");

    }
}
