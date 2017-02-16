package pro.android2.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lazy_xia on 17/2/16.
 */

public class Now {
    private static final String TAG = Now.class.getSimpleName();
    @SerializedName("tmp")
    public String temperture;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
