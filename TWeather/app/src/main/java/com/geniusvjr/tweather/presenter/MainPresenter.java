package com.geniusvjr.tweather.presenter;

/**
 * Created by dream on 16/5/14.
 */
public interface MainPresenter extends BasePresenter{

    void getWeatherData(String place);
    void getPlaceData();
    void getPlaceAndWeatherData(String place);
    void onRefresh();
}
