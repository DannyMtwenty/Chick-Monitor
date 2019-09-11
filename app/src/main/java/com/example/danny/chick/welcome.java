package com.example.danny.chick;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.Project.minimaltodo.R;
import com.example.danny.chick.Main.MainActivity;

import gr.net.maroulis.library.EasySplashScreen;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen welcome = new EasySplashScreen(welcome.this)
                .withFullScreen()
                .withTargetActivity(MainActivityPoultry.class)
                .withSplashTimeOut(5000)
                .withLogo(R.drawable.chick1)
                .withBackgroundColor(Color.parseColor("#FFFFFF"))
                .withHeaderText("Welcome to ChickMonitor!")
                .withAfterLogoText("Helping farmers Monitor their Chicks")
                .withFooterText("Copyright @ danny");

        welcome.getHeaderTextView().setTextColor(Color.BLUE);
        welcome.getHeaderTextView().setTextSize(15);
        welcome.getFooterTextView().setTextSize(15);
        welcome.getAfterLogoTextView().setTextSize(20);
        welcome.getFooterTextView().setTextColor(Color.DKGRAY);

        View view = welcome.create();
        setContentView(view);
    }
}
