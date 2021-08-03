package com.mytests.spring.enableAnnotations.case2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableBean2BeansSelector(criteria = "foobar")
@ComponentScan("com.mytests.spring.enableAnnotations.case2.components")
@Configuration
public class Case2Config {


}