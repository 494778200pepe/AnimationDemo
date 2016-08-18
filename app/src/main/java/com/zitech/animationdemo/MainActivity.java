package com.zitech.animationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.main_btn0://视图动画
                startActivity(new Intent(this,ViewAnimationAct.class));
                break;
            case R.id.main_btn1://属性动画
                startActivity(new Intent(this,PropertyAnimationAct.class));
                break;

        }
    }


}
