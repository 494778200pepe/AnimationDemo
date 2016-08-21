package com.zitech.animationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zitech.animationdemo.Property.AnimatorSetAct;
import com.zitech.animationdemo.Property.LayoutAnimaAct;
import com.zitech.animationdemo.Property.ObjectAnimatorAct;
import com.zitech.animationdemo.Property.PropertyValuesHolderAct;
import com.zitech.animationdemo.Property.ValueAnimatorAct;

/**
 * Created by pepe on 2016/8/18 0018.
 */
public class PropertyAnimationAct extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_property_animation);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.main_btn0://ObjectAnimator
                startActivity(new Intent(this,ObjectAnimatorAct.class));
                break;
            case R.id.main_btn1://ValueAnimator
                startActivity(new Intent(this,ValueAnimatorAct.class));
                break;
            case R.id.main_btn2://AnimatorSet
                startActivity(new Intent(this,AnimatorSetAct.class));
                break;
            case R.id.main_btn3://AnimatorSet
                startActivity(new Intent(this,PropertyValuesHolderAct.class));
            case R.id.main_btn4://Layout Animations
                startActivity(new Intent(this,LayoutAnimaAct.class));
                break;

        }
    }
}
