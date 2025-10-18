package com.example.ktragk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {
    TextView txtProfileName, edtEmail;
    Button btnSend;


    private void sendEmail(){
        String email = edtEmail.getText().toString().trim();
        Intent intent = new Intent();
        intent.putExtra("email", email);
        setResult(RESULT_OK, intent);
        finish();
    }

    private  void backtoLogin(){
        finish();
    }


}
