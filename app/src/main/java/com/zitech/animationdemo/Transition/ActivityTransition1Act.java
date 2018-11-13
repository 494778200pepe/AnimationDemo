package com.zitech.animationdemo.Transition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.zitech.animationdemo.R;

/**
 * @author wang
 * @date 2018/11/12.
 */

public class ActivityTransition1Act extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_transtion_activity1);
    }

    @Override
    public void onClick(View view) {
        Intent mIntent = new Intent();
        switch (view.getId()) {
            case R.id.main_btn0://Explode
                Canvas canvas = new Canvas();
                Matrix oldMatrix = canvas.getMatrix();
                Log.d("pepe", "oldMatrix = " + oldMatrix);
                Matrix useMatrix = new Matrix();
                useMatrix.setScale(2, 2);
                Log.d("pepe", "useMatrix = " + useMatrix);
                canvas.setMatrix(useMatrix);
                Matrix newMatrix = canvas.getMatrix();
                Log.d("pepe", "newMatrix = " + newMatrix);

                canvas = new Canvas();
                Log.d("pepe", "oldMatrix1 = " + oldMatrix);
                canvas.concat(useMatrix);
                newMatrix = canvas.getMatrix();
                Log.d("pepe", "newMatrix2 = " + newMatrix);

                mIntent.setClass(this, ActivityTransition2Act.class);
                mIntent.putExtra("transition", "explode");
                startActivity(mIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.main_btn1://Slide
                mIntent.setClass(this, ActivityTransition2Act.class);
                mIntent.putExtra("transition", "slide");
                startActivity(mIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.main_btn2://Fade
                mIntent.setClass(this, ActivityTransition2Act.class);
                mIntent.putExtra("transition", "fade");
                startActivity(mIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            default:
                break;
        }
    }
}
