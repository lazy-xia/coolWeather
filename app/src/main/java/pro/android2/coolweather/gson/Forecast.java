package pro.android2.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lazy_xia on 17/2/16.
 */

public class Forecast {
    private static final String TAG = Forecast.class.getSimpleName();
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}