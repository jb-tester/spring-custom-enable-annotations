package com.mytests.spring.enableAnnotations.case1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Bean1BeansConfiguration {

    @Bean
    public Bean1 aBean1() {
        return new Bean1("aBean1");
    }

    @Bean
    public Bean1 aBean2() {
        return new Bean1("aBean2");
    }
}