package com.example.loginmvpapp.screens.base;

public interface BasePresenterInterface<V> {
    void takeView(V view);

    void dropView();
}