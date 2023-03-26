package com.example.homework3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button Send;
    private EditText gmail,message,header;



    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Send = findViewById(R.id.Send);
        gmail = findViewById(R.id.Gmail);
        header = findViewById(R.id.Header);
        message = findViewById(R.id.Text);
        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{gmail.getText().toString()});
                intent.putExtra(Intent.EXTRA_SUBJECT, header.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, message.getText().toString());
                intent.setType("message/BitCoin777");
                startActivity(Intent.createChooser(intent,"BitCoin"));

            }
        });





    }
}
