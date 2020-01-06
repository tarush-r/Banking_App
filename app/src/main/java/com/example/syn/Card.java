package com.example.syn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Card extends AppCompatActivity {
    Button cardbtn1, cardbtn2, cardbtn3, cardbtn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        cardbtn1=(Button)findViewById(R.id.buttons1);
        cardbtn2=(Button)findViewById(R.id.buttons2);
        cardbtn3=(Button)findViewById(R.id.buttons3);
        cardbtn4=(Button)findViewById(R.id.buttons4);


        cardbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbtn1();
            }
        });
        cardbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbtn2();
            }
        });
        cardbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbtn3();
            }
        });
        cardbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbtn4();
            }
        });

    }
    public void openbtn1(){

        Intent intent=new Intent(this, Cardbtn1.class);
        startActivity(intent);
    }
    public void openbtn2(){

        Intent intent=new Intent(this, Cardbtn2.class);
        startActivity(intent);
    }
    public void openbtn3(){

        Intent intent=new Intent(this, Cardbtn3.class);
        startActivity(intent);
    }
    public void openbtn4(){

        Intent intent=new Intent(this, Cardbtn4.class);
        startActivity(intent);
    }

}



