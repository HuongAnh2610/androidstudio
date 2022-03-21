package com.example.loginn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText txtname;
    EditText password;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        button1();
    }
    private void Anhxa() {
        txtname = (EditText) findViewById(R.id.txtname);
        password=(EditText) findViewById(R.id.txtpss);
        btn1=(Button) findViewById(R.id.btn1);
    }
    private void button1() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtname.getText().length()!=0 && password.getText().length() !=0){
                    if(txtname.getText().toString().equals("Huong") && password .getText().toString().equals("2610")){
                    Toast.makeText(MainActivity.this,"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Dangnhap.class);
                    startActivity(intent);
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Đăng nhập không thành công",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Mời nhập đủ thông tin",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}