package com.softbankrobotics.qisdktutorials.ui.splashscreen;

import android.content.Intent;
import android.os.Bundle;

import com.aldebaran.qi.sdk.design.activity.RobotActivity;
import com.aldebaran.qi.sdk.design.activity.conversationstatus.SpeechBarDisplayStrategy;
import com.softbankrobotics.qisdktutorials.R;
import com.softbankrobotics.qisdktutorials.ui.categories.CategoriesActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * The splashscreen activity.
 */
public class SplashScreenActivity extends RobotActivity {

    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setSpeechBarDisplayStrategy(SpeechBarDisplayStrategy.OVERLAY);
        setContentView(R.layout.activity_splash_screen);
    }

    @Override
    protected void onResume() {
        super.onResume();

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                goToCategories();
            }
        }, 1500);
    }

    @Override
    protected void onPause() {
        timer.cancel();
        super.onPause();
    }

    private void goToCategories() {
        Intent intent = new Intent(this, CategoriesActivity.class);
        startActivity(intent);

        finish();
    }
}
