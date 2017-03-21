package com.example.android.inclassassignment07_katieb;

/**
 * Created by katie on 3/20/17.
 */

public class RoadTrip {

    private String place;
    private int miles;
    private boolean beenThere;

    public RoadTrip(String place, int weather, boolean beenThere) {
        this.place = place;
        this.miles = weather;
        this.beenThere = beenThere;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getWeather() {
        return miles;
    }

    public void setWeather(int weather) {
        this.miles = weather;
    }

    public boolean isBeenThere() {
        return beenThere;
    }

    public void setBeenThere(boolean beenThere) {
        this.beenThere = beenThere;
    }

    @Override
    public String toString() {
        return "My Road Trip: " + "\n" +
                "place: " + place + '\n' +
                "miles: " + miles + '\n' +
                "I have been there: " + beenThere;
    }


}
