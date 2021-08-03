package com.mytests.spring.enableAnnotations.case1;

/**
 * *
 * <p>Created by irina on 8/3/2021.</p>
 * <p>Project: spring-custom-enable-annotations</p>
 * *
 */
public class Bean1 {
    private final String id;

    @Override
    public String toString() {
        return "Bean1{" +
                "id='" + id + '\'' +
                '}';
    }

    public Bean1(String id) {
        this.id = id;
    }
}
