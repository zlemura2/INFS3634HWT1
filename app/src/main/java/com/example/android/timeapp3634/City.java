package com.example.android.timeapp3634;

public class City {

    String cityName;
    String cityTimezone;
    int resID;


    //won't let me use this. and keep same variable names
    City(String name, String timezone, int refResID){
        cityName = name;
        cityTimezone=timezone;
        resID = refResID;
    }
}
