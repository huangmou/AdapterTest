package com.example.dell.adaptertest;


import android.os.Bundle;
import android.widget.ListView;

import com.example.dell.adaptertest.Entity.TestInfo;
import com.example.dell.adaptertest.adapter.Myadapter;
import com.example.dell.adaptertest.base.DateUtil;
import com.jason.feick.AAAAcitivty;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AAAAcitivty {
    private ListView listview_my;

    private Myadapter myadapter;

    private List<TestInfo> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview_my = (ListView) findViewById(R.id.listview_my);
        getData();
        myadapter=new Myadapter(this,list,R.layout.myadpter_item);
        listview_my.setAdapter(myadapter);
    }
    //得到数据源
    public void getData(){
        list=new ArrayList<TestInfo>();
        for (int i=1;i<10;i++){
            TestInfo info=new TestInfo("xx"+i,"北京"+i, DateUtil.StringData());
            list.add(info);
        }

    }
}
