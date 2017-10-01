package com.android.gawiapp.model;

/**
 * Created by DangQuang on 10/2/17.
 **/

public class MenuModel {
    private Integer image;
    private String name;

    public MenuModel(Integer image, String name) {
        this.image = image;
        this.name = name;
    }

    public Integer getImage() {
        return image != null ? image : 0;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name != null ? name : "";
    }

    public void setName(String name) {
        this.name = name;
    }
}
