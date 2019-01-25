package com.example.pintu.mylistview.model;

public class RowData {

    private String main_titile,sub_title,version_title;
    private int img_title;

    public RowData(String main_titile,String sub_title,String version_title,int img_title){

        this.main_titile = main_titile;
        this.sub_title = sub_title;
        this.version_title =version_title;

        this.img_title =img_title;


    }

    public String getMain_titile() {
        return main_titile;
    }

    public void setMain_titile(String main_titile) {
        this.main_titile = main_titile;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public String getVersion_title() {
        return version_title;
    }

    public void setVersion_title(String version_title) {
        this.version_title = version_title;
    }

    public int getImg_title() {
        return img_title;
    }

    public void setImg_title(int img_title) {
        this.img_title = img_title;
    }




}
