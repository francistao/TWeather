package com.geniusvjr.tweather.ui.adapter;

import com.geniusvjr.domain.model.WeatherData;

import java.util.List;

/**
 * Created by dream on 16/5/16.
 */
public class WeatherDataAdapter extends BaseListAdapter<WeatherData>{

    public WeatherDataAdapter(List<WeatherData> mDataList) {
        super(mDataList);
    }
}
