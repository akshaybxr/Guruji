package com.example.guruji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.guruji.databinding.ActivityDashboardBinding;
import com.example.guruji.databinding.ActivitySigninBinding;

public class SigninActivity extends AppCompatActivity {
    ActivitySigninBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivitySigninBinding.inflate(getLayoutInflater());
        View view = b.getRoot();
        setContentView(view);
        b.mbSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SigninActivity.this, DashboardActivity.class));
            }
        });
    }
}