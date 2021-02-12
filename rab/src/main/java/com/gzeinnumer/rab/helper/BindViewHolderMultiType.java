package com.gzeinnumer.rab.helper;

import android.view.View;

import com.gzeinnumer.rab.model.TypeViewItem;

public interface BindViewHolderMultiType<T> {
    TypeViewItem getItemViewType(int position);

    void bind(View holder, T data, int position, int viewType);
}
