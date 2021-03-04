package com.example;

import io.micronaut.aop.Adapter;
import io.micronaut.core.annotation.Indexed;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ANNOTATION_TYPE, METHOD})
@Adapter(Parser.class)
@Indexed(Parser.class)
public @interface Parse {}