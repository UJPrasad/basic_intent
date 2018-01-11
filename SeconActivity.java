package com.example.dell.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.example.dell.intents.SendToast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SendToast toastobj = new SendToast();

        TextView txtobj = (TextView) findViewById(R.id.text1);

        txtobj.setOnClickListener(toastobj);

        Uri uri = Uri.parse("http://www.google.com");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}

