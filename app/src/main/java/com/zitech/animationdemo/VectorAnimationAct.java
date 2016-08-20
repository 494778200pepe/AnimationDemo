package com.zitech.animationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zitech.animationdemo.View.FrameAnimationAct;
import com.zitech.animationdemo.View.TweenAnimationAct;

/**
 * Created by pepe on 2016/8/19 0019.
 */
public class VectorAnimationAct extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_vector_animation);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
        }
    }
}
