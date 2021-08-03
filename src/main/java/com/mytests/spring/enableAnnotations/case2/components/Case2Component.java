package com.mytests.spring.enableAnnotations.case2.components;

import com.mytests.spring.enableAnnotations.case2.Bean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 8/3/2021.</p>
 * <p>Project: spring-custom-enable-annotations</p>
 * *
 */
@Component
public class Case2Component {

    @Autowired
    Bean2 bean2;

    @Override
    public String toString() {
        return "Case2Component{" +
                "bean2=" + bean2.toString() +
                '}';
    }
}
