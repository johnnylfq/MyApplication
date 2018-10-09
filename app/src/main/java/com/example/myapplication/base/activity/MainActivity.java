package com.example.myapplication.base.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;

import com.example.myapplication.R;
import com.example.myapplication.base.presenter.AbsPresenter;

/**
 * Description:
 * Detail:
 * Create Time: 2018/8/14
 *
 * @author LiuFangQiang
 * @version 1.0
 * @see ...
 * History:
 * @since Since
 */
public class MainActivity extends BaseRootActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected AbsPresenter getPresenter() {
        return null;
    }

    @Override
    protected void initData() {

    }
}
