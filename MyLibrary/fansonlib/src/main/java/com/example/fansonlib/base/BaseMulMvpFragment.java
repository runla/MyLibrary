package com.example.fansonlib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by：fanson
 * Created on：2017/3/31 9:34
 * Describe：
 */

public abstract class BaseMulMvpFragment <P1 extends BasePresenter,P2 extends BasePresenter> extends BaseFragment implements BaseView {

    protected P1 mPresenter1;
    protected P2 mPresenter2;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mPresenter1 = createPresenter1();
        mPresenter2 = createPresenter2();
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter1.onResume();
        mPresenter2.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
        mPresenter1.onStop();
        mPresenter2.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter1 != null)
            mPresenter1.detachView();
        if (mPresenter2 != null)
            mPresenter2.detachView();
    }

    /**
     * 实例化Presenter
     * @return
     */
    protected abstract P1 createPresenter1();

    protected abstract P2 createPresenter2();
}
