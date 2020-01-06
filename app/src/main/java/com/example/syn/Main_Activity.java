package com.example.syn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Activity extends AppCompatActivity {
    Button btn_profile, btn_card, btn_deposit,btn_health,btn_settings,btn_transfer,btn_chatbot,
            btn_investment,btn_scan_and_pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);
        btn_profile = (Button) findViewById(R.id.button_profile);
        btn_card = (Button) findViewById(R.id.button_card);
        btn_deposit = (Button) findViewById(R.id.button_deposit);
        btn_health = (Button) findViewById(R.id.button_health);
        btn_settings = (Button) findViewById(R.id.button_settings);
        btn_transfer = (Button) findViewById(R.id.button_transfer);
        btn_chatbot = (Button) findViewById(R.id.button_chat_bot);
        btn_investment = (Button) findViewById(R.id.button_investment);
        btn_scan_and_pay = (Button) findViewById(R.id.button_scan_and_pay);

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openprofile();
            }
        });
        btn_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencard();
            }
        });
        btn_deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendeposit();
            }
        });

        btn_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhealth();
            }
        });

        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensettings();
            }
        });

        btn_transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentransfer();
            }
        });
        btn_investment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openinvestment();
            }
        });
        btn_scan_and_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openscan();
            }
        });
        btn_chatbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openchatbot();
            }
        });



    }








    public void openprofile(){

        Intent intent=new Intent(this,Profile.class);
        startActivity(intent);
    }
    public void opencard(){

        Intent intent=new Intent(this,Card.class);
        startActivity(intent);
    }
    public void openhealth(){

        Intent intent=new Intent(this,Health.class);
        startActivity(intent);
    }
    public void opendeposit(){

        Intent intent=new Intent(this,Deposit.class);
        startActivity(intent);
    }public void opensettings(){

        Intent intent=new Intent(this,Settings.class);
        startActivity(intent);
    }
    public void opentransfer(){

        Intent intent=new Intent(this,Transfer.class);
        startActivity(intent);
    }
    public void openinvestment(){

        Intent intent=new Intent(this,Investment.class);
        startActivity(intent);
    }
    public void openscan(){

        Intent intent=new Intent(this,ScanAndPay.class);
        startActivity(intent);
    }
    public void openchatbot(){

        Intent intent=new Intent(this,Chatbot.class);
        startActivity(intent);
    }
}
