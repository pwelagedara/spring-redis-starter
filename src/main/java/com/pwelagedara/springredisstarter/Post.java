package com.pwelagedara.springredisstarter;

import java.io.Serializable;

public class Post implements Serializable {

    private String id;
    private String text;

    public Post() {
    }

    public Post(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}