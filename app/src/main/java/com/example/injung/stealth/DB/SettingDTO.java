package com.example.injung.stealth.DB;

/**
 * Created by ij kim on 2015-11-09.
 */
public class SettingDTO {
    int seq;
    String app_name;
    String app_package;
    String app_icon;
    int layout_seq;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getApp_package() {
        return app_package;
    }

    public void setApp_package(String app_package) {
        this.app_package = app_package;
    }

    public String getApp_icon() {
        return app_icon;
    }

    public void setApp_icon(String app_icon) {
        this.app_icon = app_icon;
    }

    public int getLayout_seq() {
        return layout_seq;
    }

    public void setLayout_seq(int layout_seq) {
        this.layout_seq = layout_seq;
    }
}
