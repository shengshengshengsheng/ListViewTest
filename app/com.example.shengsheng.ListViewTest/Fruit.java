package com.example.shengsheng.listviewtest;

/**
 * Created by XQS on 2017/10/3 0003.
 */

public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name,int imageId)
    {
        this.imageId=imageId;
        this.name=name;
    }
    public int getImageId()
    {
        return imageId;
    }
    public String getName()
    {
        return name;
    }


}
