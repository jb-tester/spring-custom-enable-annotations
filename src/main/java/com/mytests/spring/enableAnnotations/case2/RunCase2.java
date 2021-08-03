package com.mytests.spring.enableAnnotations.case2;

import com.mytests.spring.enableAnnotations.case2.components.Case2Component;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * *
 * <p>Created by irina on 8/3/2021.</p>
 * <p>Project: spring-custom-enable-annotations</p>
 * *
 */
public class RunCase2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Case2Config.class);
        Case2Component compo= ctx.getBean(Case2Component.class);
        System.out.println(compo.toString());
    }

}