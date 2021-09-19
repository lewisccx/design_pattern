package com.designpatterns.memento;

public class MainArticle {


    public static void toString(Article article){

        System.out.println("Article current content: " + article.getContent()
                + "\n" + "Article current fontSize: " + article.getFontSize()
                + "\n" + "Article current fontName:" + article.getFontName()
                + "\n");

    }


    public static void main(String[] args) {
        /*
         * Problem: An article has many versions, so how do you undo an
         * article to previous version
         * */
        Article article = new Article();
        ContentHistory contentHistory = new ContentHistory();
        FontSizeHistory fontSizeHistory = new FontSizeHistory();
        FontNameHistory fontNameHistory = new FontNameHistory();

        article.setContent("a");
        article.setFontName("Arial");
        article.setFontSize("12");
        contentHistory.push(article.createContent());
        fontNameHistory.push(article.createFontName());
        fontSizeHistory.push(article.createFontSize());


        article.setContent("b");
        article.setFontName("Native");
        article.setFontSize("15");
        contentHistory.push(article.createContent());
        fontNameHistory.push(article.createFontName());
        fontSizeHistory.push(article.createFontSize());


        article.setContent("aabb");
        article.setFontName("XingHua");
        article.setFontSize("2");
        contentHistory.push(article.createContent());
        fontNameHistory.push(article.createFontName());
        fontSizeHistory.push(article.createFontSize());
        toString(article);

        article.restoreFontName((FontNameState) fontNameHistory.pop());
        toString(article);

        article.restoreFontSize((FontSizeState) fontSizeHistory.pop());
        toString(article);
    }


}
