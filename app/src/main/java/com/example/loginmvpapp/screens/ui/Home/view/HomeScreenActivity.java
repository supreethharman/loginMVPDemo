package com.example.loginmvpapp.screens.ui.Home.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.loginmvpapp.R;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
