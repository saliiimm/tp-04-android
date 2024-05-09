package com.example.intenttp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sms);

    }

    public void MakeSMS(View view ) {
        EditText phonetextView = findViewById(R.id.text);
        EditText Message = findViewById(R.id.message);
        String recipientPhone = phonetextView.getText().toString();
        String recipientMessage = Message.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("sms:" + recipientPhone));
        intent.putExtra("sms_body", recipientMessage);
        startActivity(intent);
    }
}