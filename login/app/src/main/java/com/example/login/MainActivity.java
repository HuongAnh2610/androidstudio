package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin=(Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,logim.class);
                //khai bao mang
                String[] name={"LanHuong","taehyung","NQA"};
                String[]password={"261001","301295","250698"};
                intent.putExtra("dulieu",name);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });
    }
}