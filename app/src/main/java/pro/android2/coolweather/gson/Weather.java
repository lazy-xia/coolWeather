package pro.android2.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lazy_xia on 17/2/16.
 */

public class Weather {
    private static final String TAG = Weather.class.getSimpleName();
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
