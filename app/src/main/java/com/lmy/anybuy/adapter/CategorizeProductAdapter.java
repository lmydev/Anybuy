package com.lmy.anybuy.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lmy.anybuy.fragment.CategorizeListContentFragment;

/**
 * ClassName:
 * Function: 分类页右边Viewpaper的适配器
 * Author: lmy
 * Date: 2017/3/28
 */

public class CategorizeProductAdapter extends FragmentStatePagerAdapter {


    private String[] list;

    public CategorizeProductAdapter(FragmentManager fm, String[] array) {
        super(fm);
        list = array;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new CategorizeListContentFragment();
        Bundle bundle = new Bundle();
        // 把选中的index指针传入过去
        bundle.putInt("index", position);
        // 设定在fragment当中去
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return list.length;
    }
}
