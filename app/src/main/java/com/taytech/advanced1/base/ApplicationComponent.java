package com.taytech.advanced1.base;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
        ApplicationModule.class,
})

public interface ApplicationComponent {


}
