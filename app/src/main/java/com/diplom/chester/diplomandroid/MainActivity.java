package com.diplom.chester.diplomandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button mannButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mannButton=(Button)findViewById(R.id.buttonMann);

        mannButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_result_layout);



            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,Information_layout.class);

    }
}
