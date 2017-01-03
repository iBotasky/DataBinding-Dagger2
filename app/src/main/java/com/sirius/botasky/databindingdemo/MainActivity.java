package com.sirius.botasky.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sirius.botasky.databindingdemo.dagger.component.DaggerActivityComponent;
import com.sirius.botasky.databindingdemo.dagger.module.ActivityModule;
import com.sirius.botasky.databindingdemo.databinding.ActivityMainBinding;
import com.sirius.botasky.databindingdemo.entity.DaggerRepositoryComponent;
import com.sirius.botasky.databindingdemo.entity.Repository;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    MainPresenter mainPresenter;

    @Inject
    MainViewModule mainViewModule;

    @Inject
    Repository mRepository;

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //这个是需要开放接口的方式
        DaggerActivityComponent.builder()
                .repositoryComponent(MyApplication.getInstance().getRepositoryComponent())
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);
//        MyApplication.getInstance().getRepositoryComponent()
//                .activityComponent()
//                .inject(this);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setPresenter(new ViewPresenter());
        mainBinding.setViewModule(mainViewModule);

    }


    public class ViewPresenter{
        public void onClick(){
            //这个是通难过注入到Module里面的名字拿到的
            //Toast.makeText(MainActivity.this, mainViewModule.getModuleName(), Toast.LENGTH_SHORT).show();
            //这个是通过注入Repositroy拿到的。
            Toast.makeText(MainActivity.this, mRepository.getApplication().getPackageName(), Toast.LENGTH_SHORT).show();
        }
    }
}
