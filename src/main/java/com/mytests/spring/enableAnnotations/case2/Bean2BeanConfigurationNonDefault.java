package com.mytests.spring.enableAnnotations.case2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Bean2BeanConfigurationNonDefault {

    @Bean
    public Bean2 bean2() {
        return new Bean2("foo");
    }

}