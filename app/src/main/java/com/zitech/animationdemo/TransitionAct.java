package com.zitech.animationdemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zitech.animationdemo.Transition.ActivityTransition1Act;
import com.zitech.animationdemo.Transition.ShareElement1Act;
import com.zitech.animationdemo.Transition.ViewTransformationAct;

/**
 * @author wang
 * @date 2018/11/12.
 */

public class TransitionAct extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_transtion);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_btn0://Activity transition
                startActivity(new Intent(this, ActivityTransition1Act.class));
                break;
            case R.id.main_btn1://Share element
                startActivity(new Intent(this, ShareElement1Act.class));
                break;
            case R.id.main_btn2://View transformation
                Intent mIntent = new Intent();
                mIntent.setClass(this, ViewTransformationAct.class);
                ActivityOptions transitionActivityOptions2 = ActivityOptions.makeSceneTransitionAnimation(TransitionAct.this, findViewById(R.id.main_btn2), "share");
                //5.0以下兼容
                //ActivityOptionsCompat activityOptionsCompat2 = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, findViewById(R.id.img_reveal_share), "share");
                startActivity(mIntent, transitionActivityOptions2.toBundle());
                break;
            case R.id.main_btn3://
                break;
        }
    }
}
