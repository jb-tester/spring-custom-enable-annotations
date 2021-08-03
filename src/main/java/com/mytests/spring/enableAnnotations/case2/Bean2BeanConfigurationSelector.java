package com.mytests.spring.enableAnnotations.case2;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

public class Bean2BeanConfigurationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        AnnotationAttributes attributes =
                AnnotationAttributes.fromMap(
                        importingClassMetadata.getAnnotationAttributes(EnableBean2BeansSelector.class.getName(), false));
        assert attributes != null;
        String criteria = attributes.getString("criteria");
        if (criteria.equals("default")) {
            return new String[]{"com.mytests.spring.enableAnnotations.case2.Bean2BeanConfigurationDefault"};
        }else {
            return new String[]{"com.mytests.spring.enableAnnotations.case2.Bean2BeanConfigurationNonDefault"};
        }
    }
}