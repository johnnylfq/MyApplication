package com.example.myapplication.util.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

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
public class NetUtils {
    /**
     * 没有连接网络
     */
    public static final int NETWORK_NONE = -1;
    /**
     * 移动网络
     */
    public static final int NETWORK_MOBILE = 0;
    /**
     * 无线网络
     */
    public static final int NETWORK_WIFI = 1;


    public static int getNetWorkState(Context context) {
        if (context == null) {
            throw new UnsupportedOperationException("please use NetUtils before init it");
        }
        // 得到连接管理器对象
        ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        //获取所有网络连接的信息
        Network[] networks = connMgr.getAllNetworks();
        //通过循环将网络信息逐个取出来
        for (int i = 0; i < networks.length; i++) {
            //获取ConnectivityManager对象对应的NetworkInfo对象
            NetworkInfo networkInfo = connMgr.getNetworkInfo(networks[i]);
            if (networkInfo.isConnected()) {
                if (networkInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
                    return NETWORK_MOBILE;
                } else {
                    return NETWORK_WIFI;
                }
            }
        }
        return NETWORK_NONE;
    }
}
