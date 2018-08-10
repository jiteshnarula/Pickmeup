package com.devicedisk.pickmeup.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.devicedisk.pickmeup.ForgotPassword.ForgotPasswordActivity;
import com.devicedisk.pickmeup.R;

public class LoginActiity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView forgotPasswordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_actiity);

        forgotPasswordTextView = (TextView) findViewById(R.id.forgotPasswordTextView);

        mToolbar = (Toolbar) findViewById(R.id.tabs);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToolbar.setNavigationIcon(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);


        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotPasswordIntent = new Intent(LoginActiity.this, ForgotPasswordActivity.class);
                startActivity(forgotPasswordIntent);
                finish();
            }
        });


    }
}
