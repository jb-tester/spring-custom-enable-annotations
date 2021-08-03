package com.mytests.spring.enableAnnotations.case1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBean1Beans
@ComponentScan("com.mytests.spring.enableAnnotations.case1.components")
public class Case1Config {

}