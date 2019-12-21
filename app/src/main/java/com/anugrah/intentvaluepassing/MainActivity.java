package com.anugrah.intentvaluepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText a;
    Button b;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText)findViewById(R.id.et);
        b=(Button) findViewById(R.id.bt);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s=a.getText().toString();

                Intent intent=new Intent(getApplicationContext(),Act2.class);
                startActivity(intent);
                intent.putExtra("name",s);


            }
        });
    }
}
