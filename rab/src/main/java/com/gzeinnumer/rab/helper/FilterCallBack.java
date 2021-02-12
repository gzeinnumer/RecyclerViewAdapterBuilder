package com.gzeinnumer.rab.helper;

import java.util.List;

public interface FilterCallBack<T> {
    List<T> performFiltering(CharSequence constraint, List<T> listFilter);
}
