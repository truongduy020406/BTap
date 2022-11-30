package com.example.listviewnc;

public class item_tacpham {
    private  String maTP;
    private String nameTP;
    private String nd;

    public item_tacpham(String maTP, String nameTP,String nd) {
        this.maTP = maTP;
        this.nameTP = nameTP;
        this.nd =nd;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public String getMaTP() {
        return maTP;
    }

    public void setMaTP(String maTP) {
        this.maTP = maTP;
    }

    public String getNameTP() {
        return nameTP;
    }

    public void setNameTP(String nameTP) {
        this.nameTP = nameTP;
    }


}
