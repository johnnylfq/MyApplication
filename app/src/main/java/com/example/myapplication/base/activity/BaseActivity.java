package com.example.myapplication.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.myapplication.base.app.MyApplication;
import com.example.myapplication.base.presenter.AbsPresenter;
import com.example.myapplication.base.view.AbstractView;
import com.example.myapplication.constant.MessageEvent;
import com.example.myapplication.util.network.NetUtils;
import com.example.myapplication.util.network.NetworkBroadcastReceiver;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Description:
 * Detail:
 * Create Time: 2018/8/8
 *
 * @author LiuFangQiang
 * @version 1.0
 * @see ...
 * History:
 * @since Since
 */
public abstract class BaseActivity<T extends AbsPresenter> extends SupportActivity implements AbstractView, NetworkBroadcastReceiver.NetEvent {
    protected MyApplication context;
    protected BaseActivity activity;
    public static NetworkBroadcastReceiver.NetEvent eventActivity;
    private int netMobile;
    protected T mPresenter;

    /**
     * 获取当前activity的布局id
     */
    protected abstract int getLayoutId();

    /**
     * 获取当前activity的presenter
     */
    protected abstract T getPresenter();

    /**
     * 初始化toolbar
     */
    protected abstract void initToolbar();

    /**
     * 初始化界面数据
     */
    protected abstract void initData();

    /**
     * 初始化UI界面
     */
    protected abstract void initUI();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        context = (MyApplication) getApplicationContext();
        activity = this;
        eventActivity = this;
        initPresenter();
        initBind();
        initToolbar();
        initUI();
        initData();
    }

    /**
     * 初始化presenter
     */
    protected void initPresenter() {
        mPresenter = getPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    protected void initBind() {
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent messageEvent){

    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
            mPresenter = null;
        }
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void showNormal() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void showNeteaseLoading() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void setVisible(View... view) {

    }

    @Override
    public void setInvisible(View... view) {

    }

    @Override
    public void setGone(View... view) {

    }

    /**
     * 网络变化的监听
     */
    @Override
    public void onNetChange(int netMobile) {
        this.netMobile = netMobile;
        isNetConnect();
    }

    /**
     * 判断有无网络
     */
    public boolean isNetConnect() {
        if (netMobile == NetUtils.NETWORK_WIFI || netMobile == NetUtils.NETWORK_MOBILE) {
            return true;
        } else if (netMobile == NetUtils.NETWORK_NONE) {
            return false;
        }
        return false;
    }
}
