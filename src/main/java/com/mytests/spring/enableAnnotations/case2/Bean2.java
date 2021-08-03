package com.mytests.spring.enableAnnotations.case2;

/**
 * *
 * <p>Created by irina on 8/3/2021.</p>
 * <p>Project: spring-custom-enable-annotations</p>
 * *
 */
public class Bean2 {
    public Bean2(String s) {
        this.id= s;
    }
    private final String id;

    @Override
    public String toString() {
        return "Bean2{" +
                "id='" + id + '\'' +
                '}';
    }
}
