package com.damgeo.pt23;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BasketballLoginActivity extends AppCompatActivity {


    private EditText mEmail, mPasswoerd;
    private Button mLogin, mRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball_login);

        mEmail = (EditText) findViewById(R.id.email);
        mPasswoerd = (EditText) findViewById(R.id.password);
        mLogin = (Button) findViewById(R.id.login);
        mRegistration = (Button) findViewById(R.id.registration);



    }
}
