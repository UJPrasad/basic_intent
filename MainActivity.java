package com.example.dell.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","Yayy a new tag created");
    }

    public void secondActivity(View view){
        Intent i = new Intent(this, SecondActivity.class);

        startActivity(i);
    }
}
