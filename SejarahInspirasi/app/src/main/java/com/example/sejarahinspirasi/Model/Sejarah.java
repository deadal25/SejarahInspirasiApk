package com.example.sejarahinspirasi.Model;

import android.net.Uri;

public class Sejarah {

    private String Sejarah;
    private String LatarBelakang;
    private String Pencapaian;
    private String IsiPencapaian;
    private int Thumbnail;
    private Uri thumnail_post;
    private int categoryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public Sejarah(int id, String sejarah, String latarBelakang, String pencapaian, String isiPencapaian, int thumbnail, int categoryId) {
        this.id = id;
        this.Sejarah = sejarah;
        this.LatarBelakang = latarBelakang;
        this.Pencapaian = pencapaian;
        this.IsiPencapaian = isiPencapaian;
        this.Thumbnail = thumbnail;
        this.categoryId = categoryId;
    }

    public Sejarah(int id, String sejarah, String latarBelakang, String pencapaian, String isiPencapaian, Uri thumbnail_post, int categoryId) {
        this.id = id;
        this.Sejarah = sejarah;
        this.LatarBelakang = latarBelakang;
        this.Pencapaian = pencapaian;
        this.IsiPencapaian = isiPencapaian;
        this.thumnail_post = thumbnail_post;
        this.categoryId = categoryId;
    }

    public String getSejarah() {
        return Sejarah;
    }

    public void setSejarah(String sejarah) {
        Sejarah = sejarah;
    }

    public String getLatarBelakang() {
        return LatarBelakang;
    }

    public void setLatarBelakang(String latarBelakang) {
        LatarBelakang = latarBelakang;
    }

    public String getPencapaian() {
        return Pencapaian;
    }

    public void setPencapaian(String pencapaian) {
        Pencapaian = pencapaian;
    }

    public String getIsiPencapaian() {
        return IsiPencapaian;
    }

    public void setIsiPencapaian(String isiPencapaian) {
        IsiPencapaian = isiPencapaian;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public Uri getThumnail_post() {
        return thumnail_post;
    }

    public void setThumnail_post(Uri thumnail_post) {
        this.thumnail_post = thumnail_post;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

}
