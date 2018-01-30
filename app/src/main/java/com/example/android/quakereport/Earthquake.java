package com.example.android.quakereport;

class Earthquake {

    private Double magnitude;

    private String location;

    private long timeInMillis;

    private String url;

    Earthquake(Double magnitude, String location, long date, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMillis = date;
        this.url = url;
    }


    public Double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMillis() {
        return timeInMillis;
    }

    public String getUrl() {
        return url;
    }
}
