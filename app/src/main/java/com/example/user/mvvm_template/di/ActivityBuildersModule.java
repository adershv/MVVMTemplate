package com.example.user.mvvm_template.di;

import com.example.user.mvvm_template.di.auth.AuthViewModelModule;
import com.example.user.mvvm_template.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule  {

    @ContributesAndroidInjector(
            modules = {AuthViewModelModule.class}
    )
    abstract AuthActivity contributeAuthActivity();
}
