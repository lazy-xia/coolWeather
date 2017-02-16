package pro.android2.coolweather.gson;

/**
 * Created by lazy_xia on 17/2/16.
 */

public class AQI {
    private static final String TAG = AQI.class.getSimpleName();
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }

}
