package com.devicedisk.pickmeup.WelcomeActivity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.devicedisk.pickmeup.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    //Arrays

    public int[] slider_background ={
        R.drawable.background,
        R.drawable.background,
        R.drawable.background

    };

    public int[] slider_images = {
            R.drawable.dutyfreeshops,
            R.drawable.dutyfreeshops,
            R.drawable.mall
    };

    public String[] slider_headings ={
            "Air India (First Feature Screen)",
            "Duty Free Shops",
            "Malls"
    };

    public String[] slider_description = {
            "When you set a default font, every new document you open will use the font settings that you selected and set as the default. The default font applies to new documents that are based on the active template, usually Normal.dotm.",
            "When you set a default font, every new document you open will use the font settings that you selected and set as the default. The default font applies to new documents that are based on the active template, usually Normal.dotm.",
            "When you set a default font, every new document you open will use the font settings that you selected and set as the default. The default font applies to new documents that are based on the active template, usually Normal.dotm."
    };




    @Override
    public int getCount() {

        return slider_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView sliderImageVIew = (ImageView) view.findViewById(R.id.firstSliderImageView);
        TextView headingTextView = (TextView) view.findViewById(R.id.headingTextView);
        TextView descriptionTextView = (TextView) view.findViewById(R.id.descriptionTextView);

        sliderImageVIew.setImageResource(slider_images[position]);
        headingTextView.setText(slider_headings[position]);
        descriptionTextView.setText(slider_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);

    }
}
