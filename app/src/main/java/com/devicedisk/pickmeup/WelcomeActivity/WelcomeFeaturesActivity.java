package com.devicedisk.pickmeup.WelcomeActivity;

import android.Manifest;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.annotation.ColorInt;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.devicedisk.pickmeup.Login.LoginActiity;
import com.devicedisk.pickmeup.MainActivity;
import com.devicedisk.pickmeup.R;
import com.devicedisk.pickmeup.Register.RegisterActivity;

public class WelcomeFeaturesActivity extends AppCompatActivity {

    private ViewPager slideViewPager;
    private LinearLayout dotsLinearLayout;
    private SliderAdapter sliderAdapter;
    private TextView[] mDots;

    private TextView loginTextView;
    private TextView signupTextView;

    private SharedPreferences sharedPreferences;
    private Boolean firstTime;
    private int currentPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_features);

//navigation bar color
        if (Build.VERSION.SDK_INT >= 21)
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorred));

        sharedPreferences = getSharedPreferences("Pickmeup",MODE_PRIVATE);
        firstTime =  sharedPreferences.getBoolean("firstTime",true);
        slideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        dotsLinearLayout = (LinearLayout) findViewById(R.id.dotsLinearLayout);

//        nextButton = (Button) findViewById(R.id.nextButton);
//        previousButton = (Button) findViewById(R.id.previousButton);
////
        loginTextView = (TextView) findViewById(R.id.loginTextView);
        signupTextView = (TextView) findViewById(R.id.signupTextView);




             sliderAdapter = new SliderAdapter(this);
            slideViewPager.setAdapter(sliderAdapter);
            addDotsIndicator(0);


            slideViewPager.addOnPageChangeListener(viewListener);


            loginTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(WelcomeFeaturesActivity.this, LoginActiity.class);
                    startActivity(intent);
                }
            });


            signupTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(WelcomeFeaturesActivity.this, RegisterActivity.class);
                    startActivity(intent);
                }
            });
    }


    public void addDotsIndicator(int position){
        mDots = new TextView[3];
        dotsLinearLayout.removeAllViews();


        for (int i=0; i< mDots.length;i++){
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorred));
            dotsLinearLayout.addView(mDots[i]);

        }

        if(mDots.length > 0 ){
            mDots[position].setTextColor(getResources().getColor(R.color.colorBlack));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int position) {

            addDotsIndicator(position);
//            currentPage = position;
//
//            if(currentPage == 0 ){
//             //   nextButton.setEnabled(true);
//          //      previousButton.setEnabled(false);
//         //       previousButton.setVisibility(View.INVISIBLE);
//         //       nextButton.setText("Next");
//          //      previousButton.setText("");
//            }else if(currentPage == mDots.length - 1){
//
//           //     nextButton.setEnabled(true);
//            //    previousButton.setEnabled(true);
//             //   previousButton.setVisibility(View.VISIBLE);
//            //    nextButton.setText("Finish");
//             //   previousButton.setText("Back");
//            }else{
//
//            //    nextButton.setEnabled(true);
//            //    previousButton.setEnabled(true);
//             //   previousButton.setVisibility(View.VISIBLE);
//            //    nextButton.setText("Next");
//            //    previousButton.setText("Back");
//            }
//
//            if (position == 2)
//            {
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                firstTime = false;
//                editor.putBoolean("firstTime",firstTime);
//                editor.apply();
//
//                nextButton.setEnabled(true);
//                nextButton.setOnClickListener(new View.OnClickListener()
//                { @Override public void onClick(View v) {
//                    startActivity(new Intent(WelcomeFeaturesActivity.this, MainActivity.class));
//                    nextButton.setSaveEnabled(false);
//                }
//                });
//            }

        }



        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    @Override
    public void onBackPressed() {
      //  super.onBackPressed(); // this line close the  app on backpress
        moveTaskToBack(true);
    }

}
