package com.example.countbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class addCounter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_counter);
    }
    public void Done(){
        //finish();
        //moveTaskToBack(true);
        onBackPressed();
        //finishActivity(1);
        //super.onBackPressed();
    }
}