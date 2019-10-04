package com.example.user.mvvm_template.di;

import androidx.lifecycle.ViewModelProvider;


import com.example.user.mvvm_template.viewmodel.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);
}
