package com.sirius.botasky.databindingdemo.dagger.qualifiter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by botasky on 28/12/2016.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForApplication {

}
