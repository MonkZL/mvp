package zl.com.myapplication.presenter;

import com.google.gson.Gson;

import zl.com.myapplication.bean.Person;
import zl.com.myapplication.model.ModelImp;
import zl.com.myapplication.model.ModelInter;
import zl.com.myapplication.view.ViewInter;

/**
 * Created by Mon on 2016/11/29.
 */
public class Presenter {

    //模型层数据类型
    ModelInter modelInter;
    //视图层数据类型
    ViewInter viewInter;

    //这里只需要获得view层的数据类型即可
    public Presenter(ViewInter viewInter) {
        this.viewInter = viewInter;
        //同时创建模型层，主要是为了拿对应的数据
        modelInter = new ModelImp();
    }


    /**
     * 视图层需要数据时，只需要调用次方法就可以拿到对应的数据
     *
     * @param path 对应的json数据地址
     */
    public void load(String path) {
        /**
         * 通过模型层的getData方法拿对应的数据
         * 通过匿名内部类实现ModelInter.OnDataCompleteListener
         * 接口中的onLoadComplete方法，主要功能是解析
         * json数据到实体中，这里是用的Google的Gson解析Json
         */
        modelInter.getData(new ModelInter.OnDataCompleteListener() {
            @Override
            public void onLoadComplete(String s, String path) {
                //通过接口回调传过来的bytes转化为字符串
                //解析到对应的实体类
                Person person = new Gson().fromJson(s, Person.class);
                //将数据返回给view层
                viewInter.showData(person);
            }
        }, path);
    }


}
