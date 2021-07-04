package com.yaser.javatest.models;

import org.immutables.value.Value;

@Value.Immutable
public abstract class PersonTest {

    abstract String getName();
    abstract Integer getAge();

}