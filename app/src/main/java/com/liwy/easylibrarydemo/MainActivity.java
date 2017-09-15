package com.liwy.easylibrarydemo;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.liwy.common.utils.ToastUtils;
import com.liwy.common.widget.tabindicator.EasyIndicator;
import com.liwy.common.widget.tabindicator.TabBean;
import com.liwy.common.widget.tabindicator.TabConfig;
import com.liwy.easylibrarydemo.adapter.MainAdapter;
import com.liwy.easylibrarydemo.entity.People;
import com.liwy.easylibrarydemo.ui.TestActivity;
import com.liwy.library.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.indictor_main)
    EasyIndicator indicator;
    @BindView(R.id.rv_list)
    RecyclerView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolbarTitle(TOOLBAR_MODE_CENTER,"主页");
        initEasyIndicator();
        initAdapter();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    public void initEasyIndicator(){
        TabConfig tabConfig = new TabConfig.Builder().setTextColorNor(R.color.white).setTextSize(15).setTextColorSel(R.color.colorPrimary).setDistance(8).setShowLine(false).builder();
        List<TabBean> tabs = new ArrayList<TabBean>();
        TabBean t1 = new TabBean("测试1");
        TabBean t2 = new TabBean("测试2");
        TabBean t3 = new TabBean("测试3");
        tabs.add(t1);
        tabs.add(t2);
        tabs.add(t3);
        indicator.setConfig(tabConfig);
        indicator.setTabs(tabs);// 如果不需绑定fragment,可单独传入tabs，如需绑定，可传入viewpager和tabs
        indicator.setOnTabClickListener(v -> turnToActivity(TestActivity.class));
    }

    public void initAdapter(){
        List<People> list = new ArrayList<>();
        list.add(new People("lisi","CEO"));
        list.add(new People("zhangsan","CTO"));
        list.add(new People("wangwu","boss"));
        list.add(new People("lilei","developer"));
        list.add(new People("hanmeimei","developer"));
        MainAdapter adapter = new MainAdapter(R.layout.item_main,list);
        listView.setLayoutManager(new LinearLayoutManager(this));
        listView.setAdapter(adapter);
        listView.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
                ToastUtils.showShortToast(adapter.getData().get(position).toString());
            }
        });
    }

}
