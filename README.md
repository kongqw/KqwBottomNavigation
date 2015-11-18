#Android底部导航栏
> 今天简单写了一个底部导航栏，封装了一个库，用法比较简单

##效果图

![这里写图片描述](http://img.blog.csdn.net/20151118144959424)

> [博客地址：http://blog.csdn.net/q4878802/article/details/49907145](http://blog.csdn.net/q4878802/article/details/49907145)


##导入库
![P2](http://img.blog.csdn.net/20151118145018620)

![P3](http://img.blog.csdn.net/20151118145032489)

##XML布局

```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <com.kongqw.bottomnavigationlib.KqwBottomNavigation
        android:id="@+id/kbn"
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:layout_alignParentBottom="true" />

</RelativeLayout>
```

##使用

```
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
}
```

##API

* 添加底部按钮点击的监听

```
public void setBottomNavigationSelectedListener(OnBottomNavigationSelectedListener l)
```
 
> 点击后的回调如下

```
@Override
public void onValueSelected(int index) {
    ToastUtil.show(this, "index = " + index);
}
```

* 设置底部栏某个功能为选中状态

```
public void setBottomNavigationClick(int index)
```

> 我这里为了方便，只设定了0~3，依次代表底部四个按钮，可以使用枚举，只允许传入特定的值

