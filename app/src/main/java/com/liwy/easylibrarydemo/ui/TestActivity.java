package com.liwy.easylibrarydemo.ui;

import com.liwy.library.base.BaseMvpActivity;

import com.liwy.easylibrarydemo.R;


public class TestActivity extends BaseMvpActivity<TestPresenter> implements TestView {

    @Override
    public void initView() {

    }


    @Override
    protected void initPresenter() {
        mPresenter = new TestPresenter();
        mPresenter.init(this);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_test;

    }
}
