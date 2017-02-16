package pro.android2.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        if (!TextUtils.isEmpty(prefs.getString("weather",null))){
            startActivity(new Intent(this,WeatherActivity.class));
            finish();
        }
    }
}
