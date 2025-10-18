package com.example.ktragk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editUserName, edtPassword , edtEmailFromProfile;
    Button btnlogiin;
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        editUserName = findViewById(R.id.editUserName);
        edtPassword = findViewById(R.id.edtPassword);
        edtEmailFromProfile = findViewById(R.id.edtEmailFromProfile);
        btnlogiin = findViewById(R.id.btnLogin);

        btnlogiin.setOnClickListener(
                v->{
                    String username = editUserName.getText().toString();
                    String password =  edtPassword.getText().toString();

                    Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("username", username);
                    startActivityForResult(intent, 100);
                }
        );
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 100 && resultCode == RESULT_OK){
            String email = data.getStringExtra("email");
            if(email != null){
                edtEmailFromProfile.setText(email);
            }
        }
    }


}