package com.liwy.easylibrarydemo.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.liwy.easylibrarydemo.R;
import com.liwy.easylibrarydemo.entity.People;

import java.util.List;

/**
 * Created by liwy on 2017/8/24.
 */

public class MainAdapter extends BaseQuickAdapter<People,BaseViewHolder> {
    public MainAdapter(@LayoutRes int layoutResId, @Nullable List<People> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, People item) {
        helper.setText(R.id.tv_name,item.getName());
        helper.setText(R.id.tv_title,item.getTitle());
    }
}
