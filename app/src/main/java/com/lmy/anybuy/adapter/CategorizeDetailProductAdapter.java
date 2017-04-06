package com.lmy.anybuy.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.lmy.anybuy.logic.bean.ListProductContentModel;
import com.lmy.anybuy.ui.viewholder.CategorizeDetailProductViewHolder;

/**
 * ClassName:
 * Function: 打开一个类型产品 的适配器
 * Author: lmy
 * Date: 2017/3/30
 */

public class CategorizeDetailProductAdapter extends RecyclerArrayAdapter<ListProductContentModel> {

    public CategorizeDetailProductAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategorizeDetailProductViewHolder(parent);
    }


    public class TipSpanSizeLookUp extends GridSpanSizeLookup {

        public TipSpanSizeLookUp() {
            //列数默认为2
            super(2);
        }

        @Override
        public int getSpanSize(int position) {
            return 2;
        }
    }

    public TipSpanSizeLookUp obtainTipSpanSizeLookUp() {
        return new TipSpanSizeLookUp();
    }
}
