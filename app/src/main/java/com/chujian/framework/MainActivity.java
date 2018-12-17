package com.chujian.framework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.chujian.firstmeet_andsdk_ups_00framework.R;
import com.chujian.framework.app.App;
import com.chujian.sdk.framework.callback.ExitCallback;
import com.chujian.sdk.framework.callback.LoginCallback;
import com.chujian.sdk.framework.callback.PayCallBack;
import com.chujian.sdk.framework.callback.SwitchAccountCallback;
import com.chujian.sdk.framework.client.CJSDK;
import com.chujian.sdk.framework.parameter.ExitParams;
import com.chujian.sdk.framework.parameter.LoginParams;
import com.chujian.sdk.framework.parameter.PayParams;
import com.chujian.sdk.framework.parameter.PersonalCenterParams;
import com.chujian.sdk.framework.parameter.SwitchAccountParams;

public class MainActivity extends AppCompatActivity {


    private Button
            buttonLogin,
            buttonSwitchAccount,
            buttonPay,
            buttonExit,
    buttonMyCenter
                    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CJSDK cjsdk =
                App.getCjsdk();

        buttonLogin = findViewById(R.id.buttonLogin);
        buttonSwitchAccount = findViewById(R.id.buttonSwitchAccount);
        buttonPay = findViewById(R.id.buttonPay);
        buttonExit = findViewById(R.id.buttonExit);
        buttonMyCenter=findViewById(R.id.buttonMyCenter);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                LoginParams loginParams = LoginParams.Builder.bulider().callBack(new LoginCallback() {
                    @Override
                    public void onSuccess(Object o) {

                    }

                    @Override
                    public void onFailure(Object o) {

                    }

                    @Override
                    public void onCancel(Object o) {

                    }
                }).activity(MainActivity.this).build();




                cjsdk.login(loginParams);

            }
        });


        buttonPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PayParams pay = PayParams.Builder.bulider().callBack(new PayCallBack() {
                    @Override
                    public void onSuccess(Object o) {

                    }

                    @Override
                    public void onFailure(Object o) {

                    }

                    @Override
                    public void onCancel(Object o) {

                    }
                }).build();

                cjsdk.pay(pay);
            }
        });

        buttonSwitchAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SwitchAccountParams switchAccountParams = SwitchAccountParams.Builder.bulider().callBack(new SwitchAccountCallback() {
                    @Override
                    public void onSwitchAccount(Object o) {

                    }
                }).build();


                cjsdk.switchAccount(switchAccountParams);

            }
        });

        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ExitParams exitParams = ExitParams.Builder.bulider().callBack(new ExitCallback() {
                    @Override
                    public void exit(Object o) {

                    }
                }).build();
                cjsdk.exit(exitParams);


            }
        });


        buttonMyCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PersonalCenterParams personalCenterParams = PersonalCenterParams.Builder.bulider().build();
                cjsdk.personalCenter(personalCenterParams);
            }
        });

    }
}
