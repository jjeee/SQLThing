package com.example.bigosiris.sqlthing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.BaseKeyListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onLogin(){
        String type = "login";
        String username="123";
        String password="123";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,username,password);
    }
}
