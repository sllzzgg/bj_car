package com.yydd.bj_car.entity;

public class Fruits {

    private String url;
    private String title;
    private String textName;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title.replace("\\\"","").replace("n","").replace("\\","").replace(".jpg/",".jpg");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextName() {
        return textName
                .replace("\\\"","")
                .replace("n","")
                .replace("\\","")
                .replace(".jpg/",".jpg")
                .replace("src=/static","src=https://www.sgzmt.com/static")
                .replace(".pg",".jpg");
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }
}
