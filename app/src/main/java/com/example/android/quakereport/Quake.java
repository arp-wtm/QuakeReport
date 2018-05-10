package com.example.android.quakereport;

/** {@link Quake} represents the model for the row information that we show to the user.
        * It contains the magnitude String, the place string  and the date string
        */
public class Quake {

    private Double mag;
    private String place;

    /** Time of the earthquake */
    private long date;
    /**
     * Constructs a new {@link Quake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    Quake(Double magnitude, String location, long timeInMilliseconds) {
        mag = magnitude;
        place = location;
        date = timeInMilliseconds;

    }

    public double getMagnitude() {
        return mag;
    }

    public String getLocation() {
        return place;
    }


    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return date;
    }



}

