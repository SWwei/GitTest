package com.example.sunwei.mygittest.model;

/**
 * Created by Administrator on 2017/9/12 0012.
 */

public interface ILoginListener {
    /**
     * 监听登录接口，方便我们在view层中控制，给出相应的提示。
     */
    public  void OnSucess();
    public  void OnError();
    public  void OnFail();

}
