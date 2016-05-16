package com.geniusvjr.tweather.ui.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.geniusvjr.tweather.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by dream on 16/5/14.
 */
public class BaseActivity extends AppCompatActivity{

    @Bind(R.id.toolbar)
    Toolbar mToolBar;
    @Bind(R.id.tv_title)
    TextView mTvTitle;

    private boolean mAutoBindView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        setContentView(layoutResID, false);
    }

    public void setContentView(int layoutResID, boolean hideBackButton){
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
        initToolBar(hideBackButton);
        mAutoBindView = true;
    }


    private void initToolBar(boolean hideBackButton){
        if(mToolBar == null){
            return;
        }
        setTitle("");

        setSupportActionBar(mToolBar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);

        if(!hideBackButton){
            mToolBar.setNavigationIcon(R.mipmap.back);
            mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }

    protected void setTitleText(String title){
        mTvTitle.setVisibility(View.VISIBLE);
        mTvTitle.setText(title);
    }

    protected void setTitleRes(int resId){
        mTvTitle.setVisibility(View.VISIBLE);
        mTvTitle.setText(resId);
    }

    protected void hideTitle(){
        mTvTitle.setVisibility(View.GONE);
    }
}
