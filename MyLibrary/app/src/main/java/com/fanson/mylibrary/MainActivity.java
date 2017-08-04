package com.fanson.mylibrary;

import android.Manifest;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.example.fansonlib.base.BaseActivity;
import com.example.fansonlib.base.SwipeBackActivity;
import com.example.fansonlib.function.imagepicker.ImagePicker;
import com.example.fansonlib.utils.MyPermissionHelper;
import com.example.fansonlib.widget.loading.MyLoadingView;

public class MainActivity extends SwipeBackActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
//    private ImageView iv_pic;
//    private MyPermissionHelper myPermissionHelper;


    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        View view = this.getLayoutInflater().inflate(R.layout.view_loading, null);
        MyLoadingView myLoadingView = (MyLoadingView) this.findViewById(R.id.loadingView);
        myLoadingView.setLoadingTextColor(R.color.colorAccent);
        myLoadingView.setProgressWheelColor(R.color.colorAccent);
//        myLoadingView.setCustomLoadingView(view);
        myLoadingView.setLoadingModel(MyLoadingView.MODEL_ALERT);
        myLoadingView.loading();
//        iv_pic = (ImageView)findViewById(R.id.iv_pic);
//        String picUrl = "http://img02.tooopen.com/images/20140504/sy_60294738471.jpg";
////        ImageLoaderUtils.loadCircleImage(this,iv_pic,picUrl);
//        ImageLoaderUtils.loadImageWithListener(this, iv_pic, picUrl, new OnUniversalListener() {
//            @Override
//            public void loadStart() {
//                Log.d(TAG, "loadStart");
//            }
//
//            @Override
//            public void loadSuccess() {
//                Log.d(TAG, "loadSuccess");
//            }
//
//            @Override
//            public void loadFailed() {
//                Log.d(TAG, "loadFailed");
//            }
//        }, new OnUniversalProgress() {
//            @Override
//            public void onProgressUpdate(int current, int total) {
//                Log.d(TAG,"onProgress :　"+current%total);
//            }
//        });

//        addFragmentWithTag(R.id.fl_main,new TestFragment(),R.anim.slide_from_top,R.anim.slide_to_bottom,null);

//        myPermissionHelper = new MyPermissionHelper(this);
//        myPermissionHelper.requestPermissions("paizhao", new MyPermissionHelper.PermissionListener() {
//            @Override
//            public void doAfterGrand(String... permission) {
//                ImagePicker.getInstance().takePicture(MainActivity.this,100);
//            }
//
//            @Override
//            public void doAfterDenied(String... permission) {
//
//            }
//        }, Manifest.permission.CAMERA);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        if (myPermissionHelper != null) {
//            myPermissionHelper.handleRequestPermissionsResult(requestCode, permissions, grantResults);
//        }
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void listenEvent() {

    }
}
