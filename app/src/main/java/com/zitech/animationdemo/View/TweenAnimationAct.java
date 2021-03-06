package com.zitech.animationdemo.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zitech.animationdemo.R;
import com.zitech.animationdemo.View.tween.AlphaAnimationAct;
import com.zitech.animationdemo.View.tween.AnimationSetAct;
import com.zitech.animationdemo.View.tween.CustomAnimationAct;
import com.zitech.animationdemo.View.tween.InterpolatorAct;
import com.zitech.animationdemo.View.tween.LayoutAnimationControllerAct;
import com.zitech.animationdemo.View.tween.RotateAnimationAct;
import com.zitech.animationdemo.View.tween.ScaleAnimationAct;
import com.zitech.animationdemo.View.tween.TranslateAnimationAct;

/**
 * Created by pepe on 2016/8/18 0018.
 */
public class TweenAnimationAct extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tween_animation);
    }



    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_btn0://
                startActivity(new Intent(this, AlphaAnimationAct.class));
                break;
            case R.id.main_btn1://
                startActivity(new Intent(this, ScaleAnimationAct.class));
                break;
            case R.id.main_btn2://
                startActivity(new Intent(this, RotateAnimationAct.class));
                break;
            case R.id.main_btn3://
                startActivity(new Intent(this, TranslateAnimationAct.class));
                break;
            case R.id.main_btn4://
                startActivity(new Intent(this, AnimationSetAct.class));
                break;
            case R.id.main_btn5://
                startActivity(new Intent(this, LayoutAnimationControllerAct.class));
                break;
            case R.id.main_btn6://
                startActivity(new Intent(this, InterpolatorAct.class));
                break;
            case R.id.main_btn7://
                startActivity(new Intent(this, CustomAnimationAct.class));
                break;

        }
    }
}
