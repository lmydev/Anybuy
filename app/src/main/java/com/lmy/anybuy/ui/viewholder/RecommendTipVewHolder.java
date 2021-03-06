package com.lmy.anybuy.ui.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.lmy.anybuy.R;
import com.lmy.anybuy.logic.bean.RecommendContentModel;

/**
 * ClassName:
 * Function:
 * Author: lmy
 * Date: 2017/3/26
 */

public class RecommendTipVewHolder extends BaseViewHolder<RecommendContentModel> implements View.OnClickListener {

    private TextView tip;

    private Button btn;

    private RecommendContentModel data;


    public RecommendTipVewHolder(ViewGroup parent) {
        super(parent, R.layout.itemview_recommend_tip);
        tip = $(R.id.recommend_tip);
        btn = $(R.id.recommend_btn);
    }


    @Override
    public void setData(RecommendContentModel data) {
        super.setData(data);
        this.data = data;
        tip.setText(data.getTip());
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        for (int i = 0; i < Config.recommdendTips.length; i++) {
            if (data.getTip().equals(Config.recommdendTips[i])) {
                MainActivity.staticViewPager.setCurrentItem(i + 1);
                break;
            }
        }
    }
}