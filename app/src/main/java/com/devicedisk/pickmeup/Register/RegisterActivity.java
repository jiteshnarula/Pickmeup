package com.devicedisk.pickmeup.Register;

import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.devicedisk.pickmeup.R;
import com.devicedisk.pickmeup.Selector.SelectorActivity;

public class RegisterActivity extends AppCompatActivity {

    Toolbar mToolbar;

    TextView signupTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mToolbar = (Toolbar) findViewById(R.id.tabs);
//        rootView = (View) findViewById(R.id.rootView);
//        buttonView = (View) findViewById(R.id.buttonView);
//        createAccountView = (View) findViewById(R.id.createAccountView);


        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToolbar.setNavigationIcon(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);


        signupTextView = (TextView) findViewById(R.id.signupTextView);

        signupTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, SelectorActivity.class);
                startActivity(intent);
                finish();
            }
        });


//         rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//             @Override
//             public void onGlobalLayout() {
//                Rect r = new Rect();
//                 rootView.getWindowVisibleDisplayFrame(r);
//                int heightDiff = rootView.getRootView().getHeight() - (r.bottom - r.top);
//
//                if (heightDiff > 100) { // if more than 100 pixels, its probably a keyboard...
//                    //ok now we know the keyboard is up...
//                    buttonView.setVisibility(View.GONE);
//                    createAccountView.setVisibility(View.GONE);
//
//                }else{
//                    //ok now we know the keyboard is down...
//                    buttonView.setVisibility(View.VISIBLE);
//                    createAccountView.setVisibility(View.VISIBLE);
//
//                }
//            }
//        });






    }


}
