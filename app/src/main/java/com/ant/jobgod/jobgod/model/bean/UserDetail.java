package com.ant.jobgod.jobgod.model.bean;

import java.io.Serializable;

/**
 * Created by alien on 2015/7/10.
 */
public class UserDetail implements Serializable{

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    /**
     * specialty : 编程
     * address : 重庆邮电大学
     * gender : 1
     * eduLevel : 本科
     * like : 写代码
     * sign : 呵呵哒
     * certificate : 无
     * face : https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1501688796,3410507415&fm=111&gp=0.jpg
     * character : 脾气温和
     * award : 无
     * major : 计算机
     * school : 重庆邮电大学
     * intro : 记录良好
     * name : alien
     * id : 1
     * height : 170
     */

    private long birthday;
    private String specialty;
    private String gender;
    private String eduLevel;
    private String like;
    private String sign;
    private String certificate;
    private String face;
    private String character;
    private String award;
    private String major;
    private String school;
    private String intro;
    private String name;
    private String id;
    private String height;
    private int avgAbility;
    private int avgAttitude;
    private int avgCredit;

    public int getAvgAbility() {
        return avgAbility;
    }

    public void setAvgAbility(int avgAbility) {
        this.avgAbility = avgAbility;
    }

    public int getAvgAttitude() {
        return avgAttitude;
    }

    public void setAvgAttitude(int avgAttitude) {
        this.avgAttitude = avgAttitude;
    }

    public int getAvgCredit() {
        return avgCredit;
    }

    public void setAvgCredit(int avgCredit) {
        this.avgCredit = avgCredit;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getGender() {
        return gender;
    }

    public String getEduLevel() {
        return eduLevel;
    }

    public String getLike() {
        return like;
    }

    public String getSign() {
        return sign;
    }

    public String getCertificate() {
        return certificate;
    }

    public String getFace() {
        return face;
    }

    public String getCharacter() {
        return character;
    }

    public String getAward() {
        return award;
    }

    public String getMajor() {
        return major;
    }

    public String getSchool() {
        return school;
    }

    public String getIntro() {
        return intro;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getHeight() {
        return height;
    }
}
