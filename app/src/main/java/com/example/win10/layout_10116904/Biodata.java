package com.example.win10.layout_10116904;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Biodata extends AppCompatActivity {

    public static final String Extra_message="com.example.win10.layout_10116904.Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void hai(View view) {
        Intent intentss = new Intent(this, SayHai.class);
        startActivity(intentss);
    }

}
