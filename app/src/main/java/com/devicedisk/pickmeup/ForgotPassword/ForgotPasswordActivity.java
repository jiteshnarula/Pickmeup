package com.devicedisk.pickmeup.ForgotPassword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.devicedisk.pickmeup.Login.LoginActiity;
import com.devicedisk.pickmeup.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        mToolbar = (Toolbar) findViewById(R.id.tabs);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToolbar.setNavigationIcon(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);


        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgotPasswordActivity.this,LoginActiity.class);
                startActivity(intent);
                finish();
            }
        });


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed(); // this line close the  app on backpress
        Intent intent = new Intent(ForgotPasswordActivity.this,LoginActiity.class);
        startActivity(intent);
        finish();
         }

}
