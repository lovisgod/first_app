package com.example.ayo.first_app;

public class list_item {
    private String hymn;
    private String desc;

//constructor for listItem for us to be ablr to use an object of it
    public list_item(String head, String desc) {
        this.hymn = head;
        this.desc = desc;
    }
//getter for head and desc
    public String getHead() {
        return hymn;
    }

    public String getDesc() {
        return desc;
    }
}
