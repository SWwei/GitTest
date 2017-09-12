package com.example.sunwei.mygittest.model;

/**
 * Created by Administrator on 2017/9/12 0012.
 */

public class UserModel implements IUserModel {

    @Override
    public void Login(String userName, String passWord, ILoginListener iLoginListener) {
        if (userName.equals("") || passWord.equals("")) {
            iLoginListener.OnFail();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (userName.equals("sunwei") && passWord.equals("123456")) {
                iLoginListener.OnSucess();
            } else {
                iLoginListener.OnError();
            }
        }
    }
}
