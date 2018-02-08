package edu.yzk.cityhelper;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CityChooseActivity extends AppCompatActivity {

    public static void toCityChooseActivity(Context activity){
        activity.startActivity(new Intent(activity,CityChooseActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_choose);
    }
}
