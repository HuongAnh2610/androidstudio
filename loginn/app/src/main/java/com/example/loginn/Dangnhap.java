package com.example.loginn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dangnhap extends AppCompatActivity {
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        anhxa();
        thoat();
    }
    private void anhxa() {
        btn2=(Button) findViewById(R.id.btn2);
    }
    private void thoat() {
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dangnhap.this,MainActivity.class);
                    startActivity(intent);
                }
            });
        }
    }