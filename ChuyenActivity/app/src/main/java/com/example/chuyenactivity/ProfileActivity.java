package com.example.chuyenactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView txtProfileName, btnSetting, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txtProfileName = findViewById(R.id.txtProfileName);
        btnSetting = findViewById(R.id.btnSetting);
        btnBack = findViewById(R.id.btnBack);
        btnSetting.setOnClickListener(v -> backToLogin());
        btnBack.setOnClickListener(v -> backToLogin());
    }

    private void backToLogin() {
        Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
