package zl.com.myapplication.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import zl.com.myapplication.bean.Person;

/**
 * Created by Mon on 2016/11/29.
 */
public abstract class MyBaseAdpter extends BaseAdapter {

    private List<Person> data;

    public MyBaseAdpter() {
    }

    public MyBaseAdpter(List<Person> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    public List<Person> getData() {
        return data;
    }
}
