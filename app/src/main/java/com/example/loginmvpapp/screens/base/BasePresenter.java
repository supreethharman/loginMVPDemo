package com.example.loginmvpapp.screens.base;

public class BasePresenter<V> implements BasePresenterInterface<V> {
    public V view;
    @Override
    public void takeView(V view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        view = null;
    }
}