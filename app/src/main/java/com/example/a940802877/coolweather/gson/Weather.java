package com.example.a940802877.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now Now;
    public Suggestion suggustion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
