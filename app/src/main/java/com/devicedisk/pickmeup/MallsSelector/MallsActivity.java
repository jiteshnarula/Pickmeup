package com.devicedisk.pickmeup.MallsSelector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.devicedisk.pickmeup.AirportSelector.AirportActivity;
import com.devicedisk.pickmeup.R;
import com.devicedisk.pickmeup.Selector.SelectorActivity;

public class MallsActivity extends AppCompatActivity {


    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);


        mToolbar = (Toolbar) findViewById(R.id.tabs);
//        rootView = (View) findViewById(R.id.rootView);
//        buttonView = (View) findViewById(R.id.buttonView);
//        createAccountView = (View) findViewById(R.id.createAccountView);


        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToolbar.setNavigationIcon(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);


        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MallsActivity.this, SelectorActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MallsActivity.this, SelectorActivity.class);
        startActivity(intent);
        finish();
        }
}
