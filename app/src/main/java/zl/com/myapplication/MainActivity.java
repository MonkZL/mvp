package zl.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import zl.com.myapplication.bean.Person;
import zl.com.myapplication.presenter.Presenter;
import zl.com.myapplication.view.ViewInter;

public class MainActivity extends AppCompatActivity implements ViewInter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Presenter(this).load("http://tg.ctospace.com:11000/api/cateMenuTree?siteId=1");

    }

    @Override
    public void showData(Person person) {
        for (int i = 0; i < person.getList().size(); i++) {
            Log.e("TTT", person.getList().size() + "----" + person.getList().get(i).getChildren());
        }
    }
}
