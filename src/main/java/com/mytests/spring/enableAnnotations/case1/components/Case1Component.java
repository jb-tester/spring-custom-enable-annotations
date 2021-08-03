package com.mytests.spring.enableAnnotations.case1.components;

import com.mytests.spring.enableAnnotations.case1.Bean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 8/3/2021.</p>
 * <p>Project: spring-custom-enable-annotations</p>
 * *
 */
@Component
public class Case1Component {
    @Qualifier("aBean1")
    @Autowired
    Bean1 aBean1;

    @Override
    public String toString() {
        return "Case1Component{" +
                "aBean1=" + aBean1.toString() +
                '}';
    }
}
