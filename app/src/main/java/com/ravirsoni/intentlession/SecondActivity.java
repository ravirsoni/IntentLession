package com.ravirsoni.intentlession;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void openFirstPage (View view){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openThirstPage (View view){

        Intent i = new Intent(this, ThirdActivity.class);
        startActivity(i);
    }
}
