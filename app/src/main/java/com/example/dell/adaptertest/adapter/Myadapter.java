package com.example.dell.adaptertest.adapter;

import android.content.Context;

import com.example.dell.adaptertest.R;
import com.example.dell.adaptertest.base.CommonAdapter;
import com.example.dell.adaptertest.base.ViewHolder;

import java.util.List;

/**
 * Created by dell on 2015/12/4.
 *
 */
public class Myadapter extends CommonAdapter {

    public Myadapter(Context context, List mDatas, int itemLayoutId) {
        super(context, mDatas, itemLayoutId);
    }


    @Override
    public void convert(ViewHolder helper, Object item) {
        helper.getView(R.id.textView_name);
        helper.getView(R.id.textView_adress);
        helper.getView(R.id.textView_time);
        System.out.println("sfsdf");



    }


}
