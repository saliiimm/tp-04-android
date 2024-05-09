package com.example.intenttp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText mdp,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=findViewById(R.id.login);
        mdp=findViewById(R.id.mdp);


    }
    public void login(View view){
        
        String log=login.getText().toString();
        String mdpp=mdp.getText().toString();
        if (log.equals("admin")&&mdpp.equals("admin")){
            Toast.makeText(login.this, "connected!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(login.this, MainActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(login.this, "info incorrect!", Toast.LENGTH_SHORT).show();

        }
    }
}