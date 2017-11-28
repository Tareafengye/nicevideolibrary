package com.nicevideolibrary;

/**
 * 清晰度
 */
public class Clarity {
    public String grade;    // 清晰度等级
    public String p;        // 270P、480P、720P、1080P、4K ...
    public String videoUrl; // 视频链接地址

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String title;
    public long length;

    public String getImgeurl() {
        return imgeurl;
    }

    public void setImgeurl(String imgeurl) {
        this.imgeurl = imgeurl;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    private String imgeurl;
    public Clarity(String grade, String p, String videoUrl) {
        this.grade = grade;
        this.p = p;
        this.videoUrl = videoUrl;
    }


}