package com.example.fansonlib;

import android.app.Application;

import com.example.fansonlib.image.ImageLoaderConfig;
import com.example.fansonlib.image.ImageLoaderUtils;
import com.example.fansonlib.image.universalloader.UniversalLoaderStrategy;

/**
 * Created by：fanson
 * Created on：2016/11/19 14:17
 * Describe：
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        //图片框架使用方式，策略模式
        ImageLoaderConfig loaderConfig = new ImageLoaderConfig.Builder().client(new UniversalLoaderStrategy(getApplicationContext()))
                .setMaxDiskCache(1024 * 1024 * 50)
                .setMaxMemoryCache(1024 * 1024 * 10)
                .build();
        ImageLoaderUtils.init(loaderConfig);
    }
}
