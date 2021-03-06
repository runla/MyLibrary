package com.example.fansonlib.http;

import java.util.Map;

/**
 * Created by：fanson
 * Created on：2017/9/12 13:23
 * Describe：加载网络框架的策略接口
 */

public interface IHttpStrategy<M> {

    /**
     * 标准形式的封装GET
     * @param url
     * @param callback
     */
    void get(String url, HttpResponseCallback callback);

    /**
     * 标准形式的封装POST
     * @param url
     * @param params
     * @param callback
     */
    void post(String url, Map  params, HttpResponseCallback<M> callback);

    /**
     * 取消当前的网络操作
     */
    void cancelCurrent();

    /**
     * 取消所有的网络操作
     */
    void cancelAll();

}
