package com.example.user.mvvm_template.di.auth;

import androidx.lifecycle.ViewModel;

import com.example.user.mvvm_template.di.ViewModelKey;
import com.example.user.mvvm_template.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel authViewModel);
}
