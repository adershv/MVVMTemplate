package com.example.user.mvvm_template.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.user.mvvm_template.R;
import com.example.user.mvvm_template.viewmodel.ViewModelProviderFactory;

import javax.inject.Inject;

public class AuthActivity extends AppCompatActivity {

    @Inject
    ViewModelProviderFactory ProviderFactory;

    @Inject
    AuthViewModel authViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        authViewModel = ViewModelProviders.of(this,ProviderFactory).get(AuthViewModel.class);
    }
}
