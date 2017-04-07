package com.example.emil.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
     *  Called when "Sensor View" button is pressed
     */
    public void goToValues(View view){
        startActivity(new Intent(this, sensor_view.class));
    }
    public void goToCompass(View view){
        startActivity(new Intent(this, sensor_compass.class));
    }
}
