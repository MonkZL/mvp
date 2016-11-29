package zl.com.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import zl.com.myapplication.R;
import zl.com.myapplication.bean.Person;

/**
 * Created by Mon on 2016/11/29.
 */
public class MyAdapter extends MyBaseAdpter {
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Person person = getData().get(i);
        ViewHodler hodler = null;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
            hodler = new ViewHodler();
            hodler.name = ((TextView) view.findViewById(R.id.name));
            hodler.age = ((TextView) view.findViewById(R.id.age));
            hodler.sex = ((TextView) view.findViewById(R.id.sex));
            view.setTag(hodler);
        }


        hodler = (ViewHodler) view.getTag();
//        hodler.name.setText(person.getName());
//        hodler.age.setText(person.getAge());
//        hodler.sex.setText(person.isSex() + "");

        return view;
    }


    static class ViewHodler {

        TextView name, age, sex;

    }
}
