package com.geniusvjr.tweather.presenter.impl;

import com.geniusvjr.tclib.RxUtils;
import com.geniusvjr.tweather.presenter.BasePresenter;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by dream on 16/5/14.
 */
public class BasePresenterImpl implements BasePresenter{

    protected CompositeSubscription mSubscription = new CompositeSubscription();

    @Override
    public void onCreate() {
        mSubscription = RxUtils.getNewCompositeSubIfUnsubscribed(mSubscription);
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {
        mSubscription.unsubscribe();
    }

    protected  <T> Observable.Transformer<T, T> applyScheduler() {
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

}
