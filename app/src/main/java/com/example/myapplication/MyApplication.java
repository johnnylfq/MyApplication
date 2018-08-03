package com.example.myapplication;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Description:
 * Detail:
 * Create Time: 2018/7/24
 *
 * @author LiuFangQiang
 * @version 1.0
 * @see ...
 * History:
 * @since Since
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /* Bugly SDK初始化
         * 参数1：上下文对象
         * 参数2：APPID，平台注册时得到,注意替换成你的appId
         * 参数3：是否开启调试模式，调试模式下会输出'CrashReport'tag的日志
         */
//        CrashReport.initCrashReport(getApplicationContext(), "959e7a2b08", false);

        CrashReport.initCrashReport(getApplicationContext());
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //不加这句模拟器会崩溃(bugly)
        MultiDex.install(this);
    }
}
