package com.geniusvjr.tclib;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by dream on 16/5/14.
 */
public class RxUtils {

    public static void unsubscribeIfNotNull(Subscription subscription){
        if(subscription != null){
            subscription.unsubscribe();
        }
    }

    public static CompositeSubscription getNewCompositeSubIfUnsubscribed(CompositeSubscription subscription){
        if(subscription == null || subscription.isUnsubscribed()){
            return new CompositeSubscription();
        }
        return subscription;
    }
}
