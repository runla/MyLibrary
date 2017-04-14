package com.example.fansonlib.base;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by：fanson
 * Created on：2016/10/4 10:34
 * Describe：Recyclerview的ViewHolder封装
 */
public class BaseHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> viewArray;

    /**
     * 构造ViewHolder
     *
     * @param parent 父类容器
     * @param resId  布局资源文件id
     */
    public BaseHolder(ViewGroup parent, @LayoutRes int resId) {
        super(LayoutInflater.from(parent.getContext()).inflate(resId, parent, false));
        viewArray = new SparseArray<>();
    }

    /**
     * 构建ViewHolder
     *
     * @param view 布局View
     */
    public BaseHolder(View view) {
        super(view);
        viewArray = new SparseArray<>();
    }

    /**
     * 获取布局中的View
     *
     * @param viewId view的Id
     * @param <T>    View的类型
     * @return view
     */
    protected <T extends View> T getView(@IdRes int viewId) {
        View view = viewArray.get(viewId);
        if (view == null) {
            view = itemView.findViewById(viewId);
            viewArray.put(viewId, view);
        }
        return (T) view;
    }

    /**
     * 获取Context实例
     *
     * @return context
     */
    protected Context getContext() {
        return itemView.getContext();
    }




//    private ViewHolder viewHolder;
//
//    public BaseHolder(View itemView) {
//        super(itemView);
//        viewHolder = ViewHolder.getViewHolder(itemView);
//    }
//
//    public ViewHolder getViewHolder(){
//        return viewHolder;
//    }
}
