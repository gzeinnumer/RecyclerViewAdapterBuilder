package com.gzeinnumer.rab.helper;

import android.view.View;

import com.gzeinnumer.rab.singleType.AdapterCreator;

public interface BindViewHolder<T> {
    void bind(AdapterCreator<T> adapter, View holder, T data, int position);
}
