package com.example.dell.adaptertest.adapter;

import android.content.Context;

import com.example.dell.adaptertest.Entity.TestInfo;
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
        helper.setText(R.id.textView_name,((TestInfo)item).getName());
        helper.setText(R.id.textView_adress, ((TestInfo) item).getAdress());
        helper.setText(R.id.textView_time,((TestInfo)item).getTime());



    }


}
