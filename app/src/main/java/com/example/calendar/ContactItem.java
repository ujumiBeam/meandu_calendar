package com.example.calendar;

import android.graphics.drawable.Drawable;

public class ContactItem {
    private Drawable iconDrawable ;
    private String nameStr ;
    private String numberStr ;
    private String genderStr ;
    private String ageStr ;

    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setName(String name) {nameStr = name ;}
    public void setNumber(String number) {
        numberStr = number ;
    }
    public void setGender(String gender) { genderStr = gender ;}
    public void setAge(String age) {
        ageStr = age ;
    }

    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getName() { return this.nameStr ;
    }
    public String getNumber() {return this.numberStr ;}
    public String getGender() {return this.genderStr ;}
    public String getAge() {return this.ageStr ;}
}
