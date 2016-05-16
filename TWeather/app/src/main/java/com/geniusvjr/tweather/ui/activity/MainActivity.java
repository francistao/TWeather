package com.geniusvjr.tweather.ui.activity;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.geniusvjr.tweather.R;
import com.geniusvjr.tweather.presenter.MainPresenter;
import com.geniusvjr.tweather.ui.view.MainView;

import butterknife.Bind;

public class MainActivity extends BaseActivity implements MainView{

    @Bind(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @Bind(R.id.rv_place)
    RecyclerView mRvPlace;
    @Bind(R.id.rv_weather_data) RecyclerView mRvWeatherData;
    @Bind(R.id.recyvler_view) RecyclerView mRvWeatherExtra;
    @Bind(R.id.progress_bar)
    ProgressBar mProgressBar;
    @Bind(R.id.tv_city)
    TextView mTvCity;
    @Bind(R.id.tv_pm25) TextView mTvPm25;
    @Bind(R.id.fab)
    FloatingActionButton mFloatingActionBar;
    @Bind(R.id.tv_empty_data) TextView mTvEmptyData;

    private MainPresenter mMainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setupPlaceData() {

    }
}
