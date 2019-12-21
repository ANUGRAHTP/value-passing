package com.anugrah.intentvaluepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Act2 extends AppCompatActivity {

    String a;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        textView=(TextView)findViewById(R.id.td);

        Intent intent=getIntent();
        a=intent.getStringExtra("name") ;

        textView.setText(a);
    }
}
