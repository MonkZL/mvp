package zl.com.myapplication.model;

import com.lzy.okhttputils.OkHttpUtils;
import com.lzy.okhttputils.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Mon on 2016/11/29.
 */
public class ModelImp implements ModelInter {

    @Override
    public void getData(final OnDataCompleteListener listener, final String url) {

        OkHttpUtils.get(url).execute(new StringCallback() {
            @Override
            public void onSuccess(String s, Call call, Response response) {
                listener.onLoadComplete(s, url);
            }
        });
    }
}
