package pro.android2.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lazy_xia on 17/2/16.
 */

public class Suggestion {
    private static final String TAG = Suggestion.class.getSimpleName();
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
