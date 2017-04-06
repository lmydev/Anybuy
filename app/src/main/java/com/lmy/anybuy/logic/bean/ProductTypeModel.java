package com.lmy.anybuy.logic.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * ClassName:
 * Function: 分类页右边显示的产品模型
 * Author: lmy
 * Date: 2017/3/30
 */

public class ProductTypeModel implements Parcelable {
    private String productName;
    private int id;
    private int icon;
    private String titleName;


    public ProductTypeModel(int id, int icon, String productName, String titleName) {
        this.id = id;
        this.icon = icon;
        this.productName = productName;
        this.titleName = titleName;
    }

    protected ProductTypeModel(Parcel in) {
        productName = in.readString();
        id = in.readInt();
        icon = in.readInt();
        titleName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(productName);
        dest.writeInt(id);
        dest.writeInt(icon);
        dest.writeString(titleName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ProductTypeModel> CREATOR = new Creator<ProductTypeModel>() {
        @Override
        public ProductTypeModel createFromParcel(Parcel in) {
            return new ProductTypeModel(in);
        }

        @Override
        public ProductTypeModel[] newArray(int size) {
            return new ProductTypeModel[size];
        }
    };

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }
}
