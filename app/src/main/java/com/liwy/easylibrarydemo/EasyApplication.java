package com.liwy.easylibrarydemo;

import android.app.Activity;
import android.app.Application;

import com.liwy.common.utils.ActivityUtils;
import com.liwy.common.utils.BaseUtils;
import com.liwy.common.utils.ToastUtils;
import com.orhanobut.logger.Logger;
import com.squareup.leakcanary.LeakCanary;
import com.umeng.analytics.MobclickAgent;

import java.util.ArrayList;

/**
 * Created by liwy on 2017/3/14.
 */

public class EasyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init("日志");
        BaseUtils.init(getApplicationContext());// 初始化全局context
        ToastUtils.init(false);// 重复吐司只修改文本内容
        // 初始化友盟统计
//        initYM();
        // 内存泄漏监控插件
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }

        LeakCanary.install(this);
    }
    // 初始化友盟统计
    private void initYM(){
        MobclickAgent.UMAnalyticsConfig config = new MobclickAgent.UMAnalyticsConfig(getApplicationContext(),"58c7ad39bbea831db8001f59","pugongying", MobclickAgent.EScenarioType.E_UM_NORMAL,true);
        MobclickAgent.setCatchUncaughtExceptions(true);
        MobclickAgent.startWithConfigure(config);
        // 设置为集成模式，错误信息不会出现在正式数据里
        MobclickAgent.setDebugMode( true );
    }

}
