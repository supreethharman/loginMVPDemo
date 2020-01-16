package com.example.loginmvpapp.screens.ui.login.presenter;

import android.util.Patterns;

import com.example.loginmvpapp.screens.base.BasePresenter;
import com.example.loginmvpapp.screens.ui.LoginScreenContract;
import com.example.loginmvpapp.screens.ui.login.model.LoginModel;

public class LoginPresenter extends BasePresenter<LoginScreenContract.View> implements LoginScreenContract.Presenter {

    private LoginScreenContract.Model model;

    public LoginPresenter () {
        model = new LoginModel();
    }

    @Override
    public void onLoginButtonSubmit(String email, String password) {
        boolean emailMatches = Patterns.EMAIL_ADDRESS.matcher(email).matches();
        if (emailMatches && !password.isEmpty()) {
            view.navigate();
        } else {
            view.showError();
        }
    }
}
