package pro.android2.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lazy_xia on 17/2/16.
 */

public class Basic {
    private static final String TAG = Basic.class.getSimpleName();

    @SerializedName("coyu")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
