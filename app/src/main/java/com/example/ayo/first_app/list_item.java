package com.example.ayo.first_app;

public class list_item {
    private String hymn;
    private String desc;


    public list_item(String head, String desc) {
        this.hymn = head;
        this.desc = desc;
    }

    public String getHead() {
        return hymn;
    }

    public String getDesc() {
        return desc;
    }
}
