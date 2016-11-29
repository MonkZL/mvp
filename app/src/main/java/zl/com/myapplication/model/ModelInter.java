package zl.com.myapplication.model;

import zl.com.myapplication.view.ViewInter;

/**
 * Created by Mon on 2016/11/29.
 */
public interface ModelInter {


    void getData(OnDataCompleteListener listener, String url);

    public interface OnDataCompleteListener {
        void onLoadComplete(String s, String path);
    }

}
