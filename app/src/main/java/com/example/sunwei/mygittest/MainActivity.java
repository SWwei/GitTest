package com.example.sunwei.mygittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sunwei.mygittest.model.ILoginListener;
import com.example.sunwei.mygittest.presenter.IUserPresenter;
import com.example.sunwei.mygittest.view.IUserView;

public class MainActivity extends AppCompatActivity implements IUserView {
    private EditText login_et_username, login_et_passeord;
    private Button bt_commit;
    private IUserPresenter iUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        initdata();

    }

    private void initview() {
        login_et_username = (EditText) findViewById(R.id.login_et_username);
        login_et_passeord = (EditText) findViewById(R.id.login_et_password);
        bt_commit = (Button) findViewById(R.id.login_bt_commit);
        iUserPresenter = new IUserPresenter(this);
        bt_commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iUserPresenter.Login(iLoginListener);
            }
        });
    }

    private void initdata() {

    }

    @Override
    public String GetUserName() {
        return login_et_username.getText().toString();
    }

    @Override
    public String GetUserPsw() {
        return login_et_passeord.getText().toString();
    }

    private ILoginListener iLoginListener = new ILoginListener() {
        @Override
        public void OnSucess() {
            Toast.makeText(getApplicationContext(),"成功啦！",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void OnError() {
            Toast.makeText(getApplicationContext(),"输入错误啦！",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void OnFail() {
            Toast.makeText(getApplicationContext(),"请求有误啦！",Toast.LENGTH_SHORT).show();
        }
    };
}
