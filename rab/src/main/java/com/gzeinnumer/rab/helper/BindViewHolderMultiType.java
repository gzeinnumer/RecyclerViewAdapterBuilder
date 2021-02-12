package com.gzeinnumer.rab.helper;

import android.view.View;

import com.gzeinnumer.rab.model.TypeViewItem;
import com.gzeinnumer.rab.multiType.AdapterCreatorMultiType;

public interface BindViewHolderMultiType<T> {
    TypeViewItem getItemViewType(int position);

    void bind(AdapterCreatorMultiType<T> adapter, View holder, T data, int position, int viewType);
}
