package com.example.myapplication;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

import static android.R.attr.duration;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebSite (View v)
    {

        EditText ed = (EditText) findViewById(R.id.httpLinkInp);
        String url = "http://" + ed.getText().toString();



        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));



        startActivity(i);

    }


    public void sendSMS(View V){

        EditText ed = (EditText) findViewById(R.id.phoneNumInp);
        String url = "smsto:"+ ed.getText().toString();
        Uri uri = Uri.parse(url);
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        startActivity(it);

    }





    public void dial (View V){

        EditText ed = (EditText) findViewById(R.id.phoneNumInp);
        String url = "tel://" + ed.getText().toString();
        Uri uri = Uri.parse(url);
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }


    public void showContactList(View V){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("content://contacts/people"));
        startActivity(intent);
    }


    public void srchTxt(View V){





        Intent intent = new Intent(

                   Intent.ACTION_WEB_SEARCH);
        EditText ed = (EditText) findViewById(R.id.srchInp);
        String url =  ed.getText().toString();

                intent.putExtra(SearchManager.QUERY,url);
                startActivity(intent);




    }





    public void showLoc(View V){

        Intent intent = new Intent(
                android.content.Intent.ACTION_VIEW,
                Uri.parse(
                        "http://maps.google.com/maps?"
                        +"saddr=9.938083,-84.054430&"
                        +"daddr=9.926392,-84.055964"));
        startActivity(intent);



    }

}