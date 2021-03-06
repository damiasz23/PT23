package com.damgeo.pt23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBasketball, mFootball, mRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBasketball = (Button) findViewById(R.id.basketball);
        mFootball = (Button) findViewById(R.id.football);
        mRunning = (Button) findViewById(R.id.running);

        mBasketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BasketballLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mBasketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FootballLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        mRunning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RunningLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
