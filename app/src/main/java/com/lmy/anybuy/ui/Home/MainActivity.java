package com.lmy.anybuy.ui.Home;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lmy.anybuy.R;
import com.lmy.anybuy.adapter.MyTabFragmentAdapter;

import java.util.ArrayList;

import butterknife.BindView;


public class MainActivity extends Activity {


    private Context mContext;

    protected FragmentTabHost tabHost;

    private MyTabFragmentAdapter myTabFragmentAdapter;

    private TypedArray mNavMenuIconsTypeArray;

    private TypedArray mNavMenuIconTintTypeArray;

    private ListView mDrawerMenu;

    private String[] mNavMenuTitles;

    private ArrayList<NavDrawerItemModel> mDrawerItems;

    private NavDrawerListAdapter mNavDrawerAdapter;

    public static FloatingActionButton floatBtn;

    public static MyViewPager staticViewPager;

    public static boolean selectTab = false;

    private FragmentManager fragmentManager;

    private FragmentTransaction fragmentTransaction;


    private ExitUtils exit = new ExitUtils();


    @BindView(R.id.tab_toolbar)
    Toolbar tab_toolbar;

    @BindView(R.id.tab_bar_layout)
    RelativeLayout tab_bar_layout;


    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.nav_drawer_layout)
    LinearLayout nav_drawer_layout;


    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    @BindView(R.id.content_viewPager)
    MyViewPager viewPager;


    @BindView(R.id.tab_AppBarLayout)
    AppBarLayout tab_AppBarLayout;

    @BindView(R.id.appBarLayout)
    AppBarLayout appBarLayout;

    @BindView(R.id.search_view)
    MaterialSearchView searchView;


    @BindView(R.id.fab)
    FloatingActionButton fab;


    @BindView(R.id.user_img)
    SimpleDraweeView user_img;

    @BindView(R.id.tv_name)
    TextView userName;

    @BindView(R.id.tv_signName)
    TextView signName;

    @BindView(R.id.login_tip)
    TextView loginTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

}
