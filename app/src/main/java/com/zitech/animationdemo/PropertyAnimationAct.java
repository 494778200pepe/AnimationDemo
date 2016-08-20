package com.zitech.animationdemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

/**
 * Created by pepe on 2016/8/18 0018.
 */
public class PropertyAnimationAct extends AppCompatActivity {

    ImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.act_property_animation);
        image = (ImageView) findViewById(R.id.image);
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
        menu.add(Menu.NONE, 9, 0, "X");    //添加选项
        menu.add(Menu.NONE, 10, 0, "Y");    //添加选项
        menu.add(Menu.NONE, 11, 0, "alpha");    //添加选项
        menu.add(Menu.NONE, 12, 0, "PropertyValuesHolder");    //添加选项
        menu.add(Menu.NONE, 13, 0, "ValueAnimator");    //添加选项
        menu.add(Menu.NONE, 14, 0, "AnimatorSet");    //添加选项
        return true;
    }

    @Override
    /**
     * 点击menu菜单中某一个选项时
     */
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
//            ofFloat()方法的第一个参数表示动画操作的对象（可以是任意对象），
//            第二个参数表示操作对象的属性名字（只要是对象有的属性都可以），
//            第三个参数之后就是动画过渡值。当然过度值可以有一个到N个，
//            如果是一个值的话默认这个值是动画过渡值的结束值。如果有N个值，动画就在这N个值之间过渡。
            case 0:
                ObjectAnimator.ofFloat(image, "translationX", 0.0f, 350.0f, 0f).setDuration(2500).start();
                break;
            case 1:
                ObjectAnimator.ofFloat(image, "translationY", 100.0f, 350.0f, 0f).setDuration(2500).start();
                break;
            case 2:
                ObjectAnimator.ofFloat(image,"rotationX",0.0f, 90.0f,0.0F).setDuration(2500).start();
                break;
            case 3:
                ObjectAnimator.ofFloat(image,"rotationY",0.0f, 90.0f,0.0F).setDuration(2500).start();
                break;
            case 4:
                ObjectAnimator.ofFloat(image,"rotation",0.0f, 90.0f,0.0F).setDuration(4000).start();
                break;
            case 5:
                ObjectAnimator.ofFloat(image,"scaleX",1.0f, 2.0f,1.0f).setDuration(2500).start();
                break;
            case 6:
                ObjectAnimator.ofFloat(image,"scaleY",1.0f, 2.0f,1.0f).setDuration(2500).start();
                break;
            case 7:
                ObjectAnimator.ofFloat(image,"pivotX",0,300,0).setDuration(4000).start();
                ObjectAnimator.ofFloat(image,"rotation",0.0f, 90.0f,0.0F).setDuration(4000).start();
                break;
            case 8:
                ObjectAnimator.ofFloat(image,"pivotY",300).setDuration(4000).start();
                ObjectAnimator.ofFloat(image,"rotation",0.0f, 90.0f,0.0F).setDuration(4000).start();
                break;
            case 9:
                ObjectAnimator.ofFloat(image,"X",0,300,0).setDuration(3000).start();
                break;
            case 10:
                ObjectAnimator.ofFloat(image,"Y",0,300,0).setDuration(3000).start();
                break;
            case 11:
                ObjectAnimator.ofFloat(image,"alpha",1.0f, 0.3f, 1.0f).setDuration(2500).start();
                break;
            case 12:
                PropertyValuesHolder pvh1=PropertyValuesHolder.ofFloat("translationX",300f);
                PropertyValuesHolder pvh2=PropertyValuesHolder.ofFloat("scaleX",1f,0.5f);
                PropertyValuesHolder pvh3=PropertyValuesHolder.ofFloat("scaleY",1f,0.5f);
                ObjectAnimator.ofPropertyValuesHolder(image,pvh1,pvh2,pvh3).setDuration(1000).start();

                break;
            case 13:
                ValueAnimator animator=ValueAnimator.ofFloat(0,100);
                animator.setTarget(image);
                animator.setDuration(1000).start();
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        Float value=(Float) animation.getAnimatedValue();
                        Log.d("pepe","value:"+value);
                    }
                });

                break;
            case 14:
                ObjectAnimator animator2=ObjectAnimator.ofFloat(image,"translationX",300f);
                ObjectAnimator animator3=ObjectAnimator.ofFloat(image,"scaleX",1f,0f,1f);
                ObjectAnimator animator4=ObjectAnimator.ofFloat(image,"scaleY",1f,0f,1f);
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
