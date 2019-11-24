package com.example.pemasukandanpengeluaranlrv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imageIncome = (ImageView) findViewById(R.id.incomeImage);
        imageIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second.this,IncomePEmasukan.class);
                startActivity(intent);
            }
        });

        ImageView imageExpens = (ImageView) findViewById(R.id.expenseimage);
        imageExpens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second.this,ExpenseBiaya.class);
                startActivity(intent);
            }
        });

        ImageView imagehistory = (ImageView)findViewById(R.id.Imagerecord);
        imagehistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second.this,History.class);
                startActivity(intent);
            }
        });
    }
}
