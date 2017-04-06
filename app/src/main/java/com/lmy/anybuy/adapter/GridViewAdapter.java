package com.lmy.anybuy.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lmy.anybuy.R;
import com.lmy.anybuy.logic.bean.ProductTypeModel;

import java.util.ArrayList;

/**
 * ClassName:
 * Function: 分类页面，右面显示gridview的适配器
 * Author: lmy
 * Date: 2017/3/30
 */

public class GridViewAdapter extends BaseAdapter {

    private ProductTypeModel productType;

    private ArrayList<ProductTypeModel> listProductType;

    private Context context;

    private Holder holder;


    public GridViewAdapter(Context context, ArrayList<ProductTypeModel> listProductType) {
        this.context = context;
        this.listProductType = listProductType;
    }


    @Override
    public int getCount() {
        if (listProductType != null && listProductType.size() > 0) {
            return listProductType.size();
        } else {
            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        return listProductType.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = convertView.inflate(context, R.layout.itemview_gridview, null);
            holder = new Holder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        if (listProductType != null && listProductType.size() > 0) {
            productType = listProductType.get(position);
            holder.imageView.setBackgroundResource(productType.getIcon());
            holder.textView.setText(productType.getTitleName());
        }
        return convertView;
    }

    private static class Holder {
        private TextView textView;
        private ImageView imageView;
        public Holder(View view) {
            textView = (TextView) view.findViewById(R.id.productName_gridView);
            imageView = (ImageView) view.findViewById(R.id.icon_gridView);
        }
    }
}