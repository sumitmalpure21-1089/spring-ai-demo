package com.kavuri.spring_ai_demo;

public class Choclate implements Frosting, Syrup{
    public  static final String CHOCLATE_SYRUP ="Choclate";
    public  static final String CHOCLATE_FROSTING ="Choclate";


    @Override
    public String getFrostingType() {
        return CHOCLATE_FROSTING;
    }

    @Override
    public String getSyrupType() {
        return CHOCLATE_SYRUP;
    }

}
