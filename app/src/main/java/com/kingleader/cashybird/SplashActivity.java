package com.kingleader.cashybird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class SplashActivity extends AppCompatActivity {

    ImageView cashyTxt,birdimg;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

//        rlSplash = findViewById(R.id.rl_splash);
//        rlSplash.setBackgroundResource(AppConstants.get());

        cashyTxt= findViewById(R.id.cashy_txt);
        birdimg = findViewById(R.id.birdimage);
        progressBar = findViewById(R.id.progress);

       new Handler(Looper.getMainLooper()).postDelayed(() -> {

            Intent intent = new Intent(this,MainActivity.class);
            this.startActivity(intent);
            finish();
        },4000);


                
                
                
    }
}