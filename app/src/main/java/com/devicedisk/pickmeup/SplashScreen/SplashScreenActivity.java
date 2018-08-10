package com.devicedisk.pickmeup.SplashScreen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.devicedisk.pickmeup.MainActivity;
import com.devicedisk.pickmeup.R;
import com.devicedisk.pickmeup.WelcomeActivity.WelcomeFeaturesActivity;

public class SplashScreenActivity extends AppCompatActivity {

    private ImageView splashScreenImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splashScreenImageView= (ImageView) findViewById(R.id.splashScreenImageView);


        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        splashScreenImageView.setAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                finish();
                Intent mainActivity = new Intent(SplashScreenActivity.this, WelcomeFeaturesActivity.class);
                startActivity(mainActivity);


                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                if(!sharedPreferences.getBoolean("COMPLETED_ONBOARDING_PREF_NAME",false)){
                    Intent mainActivityIntent = new Intent(SplashScreenActivity.this,WelcomeFeaturesActivity.class);
                    startActivity(mainActivityIntent);
                }

                finish();


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
