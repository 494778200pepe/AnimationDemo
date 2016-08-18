package com.zitech.animationdemo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/8/18 0018.
 */
public class PropertyAnimationAct extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_property_animation);
        img = (ImageView) findViewById(R.id.img);
    }

    @Override
    /**
     * 点击menu按钮时
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 0, 0, "translationX");    //添加选项
        menu.add(Menu.NONE, 1, 0, "translationY");    //添加选项
        menu.add(Menu.NONE, 2, 0, "rotationX");    //添加选项
        menu.add(Menu.NONE, 3, 0, "rotationY");    //添加选项
        menu.add(Menu.NONE, 4, 0, "rotation");    //添加选项
        menu.add(Menu.NONE, 5, 0, "scaleX");    //添加选项
        menu.add(Menu.NONE, 6, 0, "scaleY");    //添加选项
        menu.add(Menu.NONE, 7, 0, "pivotX");    //添加选项
        menu.add(Menu.NONE, 8, 0, "pivotY");    //添加选项
        menu.add(Menu.NONE, 9, 0, "alpha");    //添加选项
        menu.add(Menu.NONE, 10, 0, "PropertyValuesHolder");    //添加选项
        menu.add(Menu.NONE, 11, 0, "ValueAnimator");    //添加选项
        menu.add(Menu.NONE, 12, 0, "AnimatorSet");    //添加选项
        return true;
    }

    @Override
    /**
     * 点击menu菜单中某一个选项时
     */
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 0:
                AlphaAnimation aa;
                ObjectAnimator animator0 = ObjectAnimator.ofFloat(img,"translationX",300).setDuration(300);
                animator0.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {

                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
                animator0.start();
                break;
            case 1:
                ObjectAnimator animator1 = ObjectAnimator.ofFloat(img,"translationY",300).setDuration(300);
                animator1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                    }
                });
                animator1.start();
                break;
            case 2:
                ObjectAnimator.ofFloat(img,"rotationX",300).setDuration(300).start();
                break;
            case 3:
                ObjectAnimator.ofFloat(img,"rotationY",300).setDuration(300).start();
                break;
            case 4:
                ObjectAnimator.ofFloat(img,"rotation",300).setDuration(300).start();
                break;
            case 5:
                ObjectAnimator.ofFloat(img,"scaleX",2).setDuration(300).start();
                break;
            case 6:
                ObjectAnimator.ofFloat(img,"scaleY",2).setDuration(300).start();
                break;
            case 7:
                ObjectAnimator.ofFloat(img,"pivotX",3).setDuration(300).start();
                break;
            case 8:
                ObjectAnimator.ofFloat(img,"pivotY",-5).setDuration(300).start();
                break;
            case 9:
                ObjectAnimator.ofFloat(img,"alpha",0.3f).setDuration(300).start();
                break;
            case 10:
                PropertyValuesHolder pvh1=PropertyValuesHolder.ofFloat("translationX",300f);
                PropertyValuesHolder pvh2=PropertyValuesHolder.ofFloat("scaleX",1f,0.5f);
                PropertyValuesHolder pvh3=PropertyValuesHolder.ofFloat("scaleY",1f,0.5f);
                ObjectAnimator.ofPropertyValuesHolder(img,pvh1,pvh2,pvh3).setDuration(1000).start();

                break;
            case 11:
                ValueAnimator animator=ValueAnimator.ofFloat(0,100);
                animator.setTarget(img);
                animator.setDuration(1000).start();
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        Float value=(Float) animation.getAnimatedValue();
                        Log.d("pepe","value:"+value);
                    }
                });

                break;
            case 12:
                ObjectAnimator animator2=ObjectAnimator.ofFloat(img,"translationX",300f);
                ObjectAnimator animator3=ObjectAnimator.ofFloat(img,"scaleX",1f,0f,1f);
                ObjectAnimator animator4=ObjectAnimator.ofFloat(img,"scaleY",1f,0f,1f);
                AnimatorSet set=new AnimatorSet();
                set.setDuration(1000);
                set.playTogether(animator2,animator3,animator4);
                set.start();

                break;
            default:

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
