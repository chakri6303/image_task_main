package com.example.imagetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            }
    public void btn(View v)
    {
        Intent x=new Intent(MainActivity.this, MainActivity2.class);
        startActivity(x);
    }

}