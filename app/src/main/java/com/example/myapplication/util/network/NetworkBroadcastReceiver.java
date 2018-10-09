package com.example.myapplication.util.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.myapplication.base.activity.BaseActivity;
import com.example.myapplication.constant.Constants;

/**
 * Description:
 * Detail:
 * Create Time: 2018/8/10
 *
 * @author LiuFangQiang
 * @version 1.0
 * @see ...
 * History:
 * @since Since
 */
public class NetworkBroadcastReceiver extends BroadcastReceiver {
    public NetEvent eventActivity = BaseActivity.eventActivity;

    @Override
    public void onReceive(Context context, Intent intent) {
        // 如果相等的话就说明网络状态发生了变化
        if (intent.getAction().equals(Constants.NETWORK_BROADCAST)) {
            int netWorkState = NetUtils.getNetWorkState(context);
            // 接口回调传过去状态的类型
            eventActivity.onNetChange(netWorkState);
        }
    }

    // 自定义接口
    public interface NetEvent {
        void onNetChange(int netMobile);
    }

}
