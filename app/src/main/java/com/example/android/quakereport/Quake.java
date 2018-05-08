package com.example.android.quakereport;

/** {@link Quake} represents the model for the row information that we show to the user.
        * It contains the magnitude String, the place string  and the date string
        */
public class Quake {

    private String mag;
    private String place;
    private String date;


    Quake(String magnitude, String location, String time) {
        mag = magnitude;
        place = location;
        date = time;

    }

    public String getMagnitude() {
        return mag;
    }

    public String getLocation() {
        return place;
    }


    public String getTime() {
        return date;
    }



}

