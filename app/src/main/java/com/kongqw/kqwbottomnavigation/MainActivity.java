package com.kongqw.kqwbottomnavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.kongqw.bottomnavigationlib.KqwBottomNavigation;
import com.kongqw.bottomnavigationlib.OnBottomNavigationSelectedListener;
import com.kongqw.bottomnavigationlib.ToastUtil;

public class MainActivity extends AppCompatActivity implements OnBottomNavigationSelectedListener {

    private KqwBottomNavigation mKqwBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mKqwBottomNavigation = (KqwBottomNavigation) findViewById(R.id.kbn);

        mKqwBottomNavigation.setBottomNavigationSelectedListener(this);
    }

    @Override
    public void onValueSelected(int index) {
        ToastUtil.show(this, "index = " + index);
    }

//    public void rb1(View view){
//        mKqwBottomNavigation.setBottomNavigationClick(1);
//    }
}
