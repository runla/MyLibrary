package com.fanson.mylibrary.mvp;

import android.util.Log;

import com.example.fansonlib.base.BaseModel;
import com.example.fansonlib.http.HttpResponseCallback;
import com.example.fansonlib.http.HttpUtils;
import com.example.fansonlib.http.asynchttp.AsyncHttpStrategy;
import com.fanson.mylibrary.ApiStores;
import com.fanson.mylibrary.SimpleBean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fansonq on 2017/9/2.
 */

public class TestModel extends BaseModel{

    TestCallback callback;

    public TestModel() {
    }

    /**
     * 测试Mock网络操作
     */
    public void method(final TestCallback callback){
        this.callback = callback;
        Log.d("TTT","Test1Model发送的数据");
        Map<String,Object> maps = new HashMap<>();
        maps.put("key","fanson");
//        RetrofitClient.init(ApiStores.API_SERVER_URL);
//        RetrofitStrategy strategy = new RetrofitStrategy();
//        strategy.setApi(new ApiFactoryImpl());
//        HttpUtils.init(strategy);

        AsyncHttpStrategy.init(ApiStores.API_SERVER_URL);
        HttpUtils.init(new AsyncHttpStrategy());

        HttpUtils.getHttpUtils().post("getName",maps, new HttpResponseCallback<SimpleBean>() {
            @Override
            public void onSuccess(SimpleBean bean) {
                callback.successful(bean.getData().getName());
            }

            @Override
            public void onFailure(String errorMsg) {
                callback.failure(errorMsg);
            }
        });

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TTT",""+callback);
    }
}
