package com.example.android.quakereport;

/**
 * Created by uzuri17 on 8/25/2016.
 */
public class Earthquake {
    //Earthquake magnitude
    private String mMagnitude;
    //Earthquake location
    private String mLocation;
    //Earthquake date
    private String mDate;

    public Earthquake (String magnitude, String location, String date){

        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public String getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public String getDate(){
        return mDate;
    }

}
