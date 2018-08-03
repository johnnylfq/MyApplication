package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.tencent.bugly.crashreport.CrashReport;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author ha
 */
public class MainActivity extends AppCompatActivity {
    @BindView(R.id.container_main)
    FrameLayout mContainer;

    @BindView(R.id.tab_layout_main)
    TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }

    /*@OnClick(R.id.tv_test)
    void onClick() {
        CrashReport.testJavaCrash();
    }*/
}
