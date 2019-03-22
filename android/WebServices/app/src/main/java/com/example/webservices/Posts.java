package com.example.webservices;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Posts {

    @SerializedName("posts")
    private List<Model> list;

    public List<Model> getList() {
        return list;
    }
}
