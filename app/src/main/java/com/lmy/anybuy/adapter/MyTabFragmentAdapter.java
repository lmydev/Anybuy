package com.lmy.anybuy.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lmy.anybuy.R;

import java.util.HashMap;

/**
 * ClassName:
 * Function: 首页中顶部分类，多个fragment的适配器
 * Author: lmy
 * Date: 2017/3/25
 */

public class MyTabFragmentAdapter extends FragmentStatePagerAdapter {

    private static HashMap<String, Fragment> fragments;

    public static String[] tabs;


    public MyTabFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        tabs = context.getResources().getStringArray(R.array.tab);
        fragments = new HashMap<String, Fragment>();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        Bundle bundle = new Bundle();
        switch (position) {
            case 0:
                fragment = new RecommendFragment();
                break;
            case 1:
                //0为全新手机
                fragment = new ListProductFragment();
                bundle.putInt("type", 0);
                break;
            case 2:
                //1为二手良品
                fragment = new ListProductFragment();
                bundle.putInt("type", 1);

                break;
            case 3:
                //2为手机配件
                fragment = new ListProductFragment();
                bundle.putInt("type", 2);
                break;
            case 4:
                //3为手机壳/膜
                fragment = new ListProductFragment();
                bundle.putInt("type", 3);

                break;
            case 5:
                fragment = new RepairFragment();
                break;
            default:
                fragment = new RecommendFragment();
        }
        fragment.setArguments(bundle);
        fragments.put(String.valueOf(position), fragment);
        return fragment;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }


    public static Fragment getFragment(int position) {
        return fragments.get(String.valueOf(position));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
