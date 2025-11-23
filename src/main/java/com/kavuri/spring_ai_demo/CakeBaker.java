package com.kavuri.spring_ai_demo;

import org.springframework.beans.factory.annotation.Autowired;

public class CakeBaker {

    @Autowired
    Frosting frosting;

    @Autowired
    Syrup syrup;

    public void bakeCake(){
        System.out.println("Cake frostng is:  " + frosting.getFrostingType() + "& and syrup is: "+ syrup.getSyrupType());
    }
}
