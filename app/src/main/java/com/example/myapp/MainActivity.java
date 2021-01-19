package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btn);
        Button gestBtn = (Button)findViewById(R.id.gestures);
        TextView txt = (TextView)findViewById(R.id.txt);

        // Set click listener on the button
        btn.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        txt.setText("Who let the Dogs out?!");
                    }
                }
        );

        // Set on Long Click listener
        btn.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        txt.setText("Am long pressed!!");
                        return true;
                    }
                }
        );

        gestBtn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Gestures.class);
                startActivity(intent);
            }
        });
    }


}