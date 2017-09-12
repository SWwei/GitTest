package com.example.sunwei.mygittest.presenter;

import com.example.sunwei.mygittest.model.ILoginListener;
import com.example.sunwei.mygittest.model.IUserModel;
import com.example.sunwei.mygittest.model.UserModel;
import com.example.sunwei.mygittest.view.IUserView;

/**
 * Created by Administrator on 2017/9/12 0012.
 */

public class IUserPresenter {
    private IUserView iUserView;
    private IUserModel iUserModel;

    public IUserPresenter(IUserView iUserView) {
        this.iUserView = iUserView;
        iUserModel = new UserModel();

    }

    /**
     *
     * 对M、V层的关系建立
     *
     * @param iLoginListener
     */
    public void Login(ILoginListener iLoginListener) {
        iUserModel.Login(iUserView.GetUserName(), iUserView.GetUserPsw(), iLoginListener);
    }
}
