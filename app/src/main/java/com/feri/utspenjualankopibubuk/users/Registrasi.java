package com.feri.utspenjualankopibubuk.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.feri.utspenjualankopibubuk.R;

public class Registrasi extends AppCompatActivity {
    TextView btnKeLogin;
    Button btnRegistrasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        getSupportActionBar().hide();

        btnKeLogin = (TextView) findViewById(R.id.btnKeLogin);
        btnKeLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registrasi.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnRegistrasi = (Button) findViewById(R.id.btnRegistrasi);
        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registrasi.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}