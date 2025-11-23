package com.kavuri.spring_ai_demo;

public class Strawberry implements Frosting, Syrup {
    public  static final String STRAWBERRY_SYRUP ="Strawberry";
    public  static final String STRAWBERRY_FROSTING ="Strawberry";

    @Override
    public String getFrostingType() {
        return STRAWBERRY_FROSTING;
    }

    @Override
    public String getSyrupType() {
        return STRAWBERRY_SYRUP;
    }
}
