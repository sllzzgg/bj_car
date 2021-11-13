package com.yydd.bj_car.entity;

/**
 * @description:
 * @author: zhangjj
 * @createDate: 2021/10/24
 */
public class MapData {
    private String name;
    private String lng;
    private String lat;
    private String aa;
    private String time;
    private String pref;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPref() {
        return pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }

    @Override
    public String toString() {
        return "MapData{" +
                "name='" + name + '\'' +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                ", aa='" + aa + '\'' +
                ", time='" + time + '\'' +
                ", pref='" + pref + '\'' +
                '}';
    }
}
