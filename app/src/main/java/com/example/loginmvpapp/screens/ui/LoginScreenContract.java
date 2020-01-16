package com.example.loginmvpapp.screens.ui;

import com.example.loginmvpapp.screens.base.BasePresenterInterface;

public interface LoginScreenContract {
    interface Model {

    }

    interface View {
        void showError();

        void navigate();
    }

    interface Presenter extends BasePresenterInterface<View> {
        void onLoginButtonSubmit(String email, String password);
    }
}
