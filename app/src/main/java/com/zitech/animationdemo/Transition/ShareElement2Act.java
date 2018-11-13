package com.zitech.animationdemo.Transition;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.zitech.animationdemo.R;

/**
 * @author wang
 * @date 2018/11/12.
 */

public class ShareElement2Act extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_transtion_share2);
        Fragment sharedElementFragment1 = new ShareElementsFragment1();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout_container, sharedElementFragment1)
                .commit();
    }
}