package com.example.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class webBrowser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);

        Toast.makeText(getApplicationContext(),"Web Browser App",Toast.LENGTH_LONG).show();

        String msg ="This was (only) a demonstration for who to use Intent filters"
                +"to make an app component respond to the user , so the user can choose"
                + "which pp to use ";
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }
}
