package com.tranxit.enterprise.ui.activity.change_password;

import com.tranxit.enterprise.base.MvpView;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface ChangePasswordIView extends MvpView {
    void onSuccess(Object object);
    void onError(Throwable e);
}
