package com.feri.utspenjualankopibubuk.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.feri.utspenjualankopibubuk.R;
import com.feri.utspenjualankopibubuk.users.LoginActivity;
import com.feri.utspenjualankopibubuk.users.Registrasi;

public class HomeAdminActivity extends AppCompatActivity {
    LinearLayout btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);
        getSupportActionBar().hide();

        btnLogout = (LinearLayout) findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeAdminActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}