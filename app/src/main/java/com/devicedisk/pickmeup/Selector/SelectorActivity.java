package com.devicedisk.pickmeup.Selector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.devicedisk.pickmeup.AirportSelector.AirportActivity;
import com.devicedisk.pickmeup.MallsSelector.MallsActivity;
import com.devicedisk.pickmeup.R;

public class SelectorActivity extends AppCompatActivity {


    Button airportButton;
    Button mallsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        airportButton = (Button) findViewById(R.id.airportsButton);
        mallsButton = (Button) findViewById(R.id.mallsButton);

        airportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectorActivity.this, AirportActivity.class);
                startActivity(intent);
                finish();
            }
        });

        mallsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectorActivity.this, MallsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
