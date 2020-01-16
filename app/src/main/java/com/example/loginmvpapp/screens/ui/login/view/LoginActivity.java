package com.example.loginmvpapp.screens.ui.login.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginmvpapp.R;
import com.example.loginmvpapp.screens.ui.Home.view.HomeScreenActivity;
import com.example.loginmvpapp.screens.ui.LoginScreenContract;
import com.example.loginmvpapp.screens.ui.login.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginScreenContract.View {

    private LoginScreenContract.Presenter presenter;
    private EditText emailEditText, passwordEditText;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        presenter = new LoginPresenter();
        presenter.takeView(this);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.button);

        loginButton.setOnClickListener(v -> onLoginButtonSubmit(
                emailEditText.getText().toString(),
                passwordEditText.getText().toString()));
    }

    private void onLoginButtonSubmit(String email, String password) {
        presenter.onLoginButtonSubmit(email, password);
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show();
    }

    @Override
    public void navigate() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        presenter.dropView();
        super.onDestroy();
    }
}
