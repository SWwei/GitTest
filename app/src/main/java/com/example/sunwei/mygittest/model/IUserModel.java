package com.example.sunwei.mygittest.model;

/**
 *业务逻辑处理
 * Created by Administrator on 2017/9/12 0012.
 */

public interface IUserModel {
    /**
     *提取的一个方法，还可以有其他的方法，如获取数据，保存用户数据之类的。
     * @param userName
     * @param passWord
     * @param iLoginListener
     */
    public void Login(String userName, String passWord, ILoginListener iLoginListener);
}
