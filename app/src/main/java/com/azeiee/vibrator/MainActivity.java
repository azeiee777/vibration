package com.azeiee.vibrator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnVibrate;
     VibrateManager vibrateManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVibrate = findViewById(R.id.btnVibrate);

        btnVibrate.setOnClickListener(view ->  {
            //Toast.makeText(getApplicationContext(),"Button : Clicked",Toast.LENGTH_SHORT).show();
            vibrateManager = new VibrateManager(this);
            vibrateManager.vibrate();
        });
    }
//    private void vibrate() {
//        Vibrator vibrator;
//        vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            vibrator.vibrate(VibrationEffect.createOneShot(1000,VibrationEffect.DEFAULT_AMPLITUDE));
//        }else{
//            vibrator.vibrate(1000);
//        }
//    }
}