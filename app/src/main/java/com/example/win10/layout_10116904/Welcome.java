package com.example.win10.layout_10116904;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


    }

    public void masuk(View view) {
        Intent intents = new Intent(Welcome.this, Biodata.class);
        startActivity(intents);
    }

}
