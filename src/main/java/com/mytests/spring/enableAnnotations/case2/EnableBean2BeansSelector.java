package com.mytests.spring.enableAnnotations.case2;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(Bean2BeanConfigurationSelector.class)
public @interface EnableBean2BeansSelector {
    String criteria() default "default";
}