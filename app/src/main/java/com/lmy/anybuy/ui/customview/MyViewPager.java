package com.lmy.anybuy.ui.customview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * ClassName:
 * Function:
 * Author: lmy
 * Date: 2017/3/25
 */

public class MyViewPager extends ViewPager{

    private boolean scrollble = true;

    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (scrollble) {
            return super.onTouchEvent(ev);
        }else {
            return false;
        }

    }

    public boolean isScrollble() {
        return scrollble;
    }

    public void setScrollble(boolean scrollble) {
        this.scrollble = scrollble;
    }

}
