package com.example.dell.adaptertest.Entity;

/**
 * Created by dell on 2015/12/4.
 */
public class TestInfo {
    //姓名
    private  String name;
    //地址
    private String adress;
    //时间
    private String time;

    public TestInfo() {
    }

    public TestInfo(String name, String adress, String time) {
        this.name = name;
        this.adress = adress;
        this.time = time;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
