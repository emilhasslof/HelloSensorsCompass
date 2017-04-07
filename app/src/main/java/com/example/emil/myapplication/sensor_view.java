package com.example.emil.myapplication;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class sensor_view extends AppCompatActivity implements SensorEventListener{
    private SensorManager sm;
    private Sensor accelerometer;
    private int x;
    private int y;
    private int z;
    TextView tv1;
    TextView tv2;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_view);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        accelerometer = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(this, accelerometer, sm.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        x = (int)event.values[0];
        y = (int)event.values[1];
        z = (int)event.values[2];
        tv1.setText("X = " + String.valueOf(x));
        tv2.setText("Y = " + String.valueOf(y));
        tv3.setText("Z = " + String.valueOf(z));

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}
