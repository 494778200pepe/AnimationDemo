package com.zitech.animationdemo.Transition;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Gravity;
import android.widget.ImageView;

import com.zitech.animationdemo.R;

/**
 * @author wang
 * @date 2018/11/12.
 */

public class ActivityTransition2Act extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_transtion_activity2);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        Intent intent = getIntent();
        String transition = intent.getStringExtra("transition");
        switch (transition) {
            case "explode":
                imageView.setBackgroundColor(Color.RED);
                Explode explode = new Explode();
                explode.setDuration(1000L);
                getWindow().setEnterTransition(explode);
                break;
            case "slide":
                imageView.setBackgroundColor(Color.GREEN);
                Slide slide = new Slide(Gravity.BOTTOM);
                slide.setDuration(1000L);
                getWindow().setEnterTransition(slide);
                break;
            case "fade":
                imageView.setBackgroundColor(Color.BLUE);
                Fade fade = new Fade();
                fade.setDuration(1000L);
                getWindow().setEnterTransition(fade);
                break;
        }
    }


}
