package com.kongqw.bottomnavigationlib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import com.example.kongqw.bottomnavigationlib.R;

/**
 * Created by kongqw on 2015/11/18.
 */
public class KqwBottomNavigation extends RelativeLayout {

    protected OnBottomNavigationSelectedListener mSelectionListener;
    private RadioButton mRadioButton1;
    private RadioButton mRadioButton2;
    private RadioButton mRadioButton3;
    private RadioButton mRadioButton4;

    public KqwBottomNavigation(Context context) {
        super(context);
        initView(context);
    }

    public KqwBottomNavigation(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public KqwBottomNavigation(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    /**
     * 初始化页面
     */
    private void initView(Context context) {

        View view = View.inflate(getContext(), R.layout.bottom_navigation, this);
        mRadioButton1 = (RadioButton) view.findViewById(R.id.rb1);
        mRadioButton2 = (RadioButton) view.findViewById(R.id.rb2);
        mRadioButton3 = (RadioButton) view.findViewById(R.id.rb3);
        mRadioButton4 = (RadioButton) view.findViewById(R.id.rb4);

        mRadioButton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mSelectionListener.onValueSelected(1);
            }
        });
        mRadioButton2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mSelectionListener.onValueSelected(2);
            }
        });
        mRadioButton3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mSelectionListener.onValueSelected(3);
            }
        });
        mRadioButton4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mSelectionListener.onValueSelected(4);
            }
        });
    }

    public void setBottomNavigationSelectedListener(OnBottomNavigationSelectedListener l) {
        this.mSelectionListener = l;
    }

    public void setBottomNavigationClick(int index) {
        switch (index) {
            case 0:
                mRadioButton1.setChecked(true);
                // mSelectionListener.onValueSelected(1);
                break;
            case 1:
                mRadioButton2.setChecked(true);
                // mSelectionListener.onValueSelected(2);
                break;
            case 2:
                mRadioButton3.setChecked(true);
                // mSelectionListener.onValueSelected(3);
                break;
            case 3:
                mRadioButton4.setChecked(true);
                // mSelectionListener.onValueSelected(4);
                break;
        }
    }
}
