package com.lge.yeess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.hibtn);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();

    }
}