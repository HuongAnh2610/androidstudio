package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class logim extends AppCompatActivity {
    Button btnhome;
    TextView txtname;
    TextView txtpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname=(TextView)findViewById(R.id.txtname);
        txtpassword=(TextView)findViewById(R.id.txtpssw);
        String[] bientam;

        Intent intent=getIntent();
        bientam = intent.getStringArrayExtra("dulieu");//lay du lieu tu man hinh main Activity
        //gan du lieu len textView
        txtname.setText(bientam.length+bientam[1]);
        txtpassword.setText(bientam.length+bientam[1]);
        btnhome =(Button) findViewById(R.id.btnhome);
        //code khi baams vao nut btnclick1
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(logim.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}