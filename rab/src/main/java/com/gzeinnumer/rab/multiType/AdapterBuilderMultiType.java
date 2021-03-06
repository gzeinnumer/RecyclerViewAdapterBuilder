package com.gzeinnumer.rab.multiType;

import com.gzeinnumer.rab.helper.BindViewHolderEmpty;
import com.gzeinnumer.rab.helper.BindViewHolderMultiType;

import java.util.List;

public class AdapterBuilderMultiType<T> {
    private final AdapterCreatorMultiType<T> adapterCreatorMultiType;

    public AdapterBuilderMultiType() {
        this.adapterCreatorMultiType = new AdapterCreatorMultiType<T>();
    }

    public AdapterBuilderMultiType<T> setCustomNoItem(int emptyViewContent) {
        adapterCreatorMultiType.setEmptyLayout(emptyViewContent);
        return this;
    }

    public AdapterBuilderMultiType<T> setCustomNoItem(int emptyViewContent, BindViewHolderEmpty bindViewHolderEmpty) {
        adapterCreatorMultiType.setEmptyLayout(emptyViewContent, bindViewHolderEmpty);
        return this;
    }

    public AdapterBuilderMultiType<T> setDivider(int divider) {
        adapterCreatorMultiType.setDivider(divider);
        adapterCreatorMultiType.setEnableDiffUtils(false);
        return this;
    }

    public AdapterBuilderMultiType<T> setAnimation(int animation) {
        adapterCreatorMultiType.setAnimation(animation);
        return this;
    }

    public AdapterBuilderMultiType<T> setList(List<T> list) {
        adapterCreatorMultiType.setList(list);
        return this;
    }

    public AdapterCreatorMultiType<T> onBind(BindViewHolderMultiType<T> bindViewHolderMultiType) {
        adapterCreatorMultiType.setBindViewHolderMultiType(bindViewHolderMultiType);
        return adapterCreatorMultiType;
    }
}
