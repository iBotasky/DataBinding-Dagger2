package com.sirius.botasky.databindingdemo.dagger.component;


import com.sirius.botasky.databindingdemo.MainActivity;
import com.sirius.botasky.databindingdemo.dagger.module.ActivityModule;
import com.sirius.botasky.databindingdemo.dagger.scope.ActivityScope;
import com.sirius.botasky.databindingdemo.entity.RepositoryComponent;


import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by botasky on 28/12/2016.
 */

@ActivityScope
@Component(dependencies = RepositoryComponent.class, modules = ActivityModule.class)
//@Subcomponent
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
