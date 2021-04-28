package com.feri.utspenjualankopibubuk.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.feri.utspenjualankopibubuk.R;
import com.feri.utspenjualankopibubuk.admin.HomeAdminActivity;

public class LoginActivity extends AppCompatActivity {
    TextView btnKeRegistrasi;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        btnKeRegistrasi = (TextView) findViewById(R.id.btnKeRegistrasi);
        btnKeRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, Registrasi.class);
                startActivity(i);
                finish();
            }
        });
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdminActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}