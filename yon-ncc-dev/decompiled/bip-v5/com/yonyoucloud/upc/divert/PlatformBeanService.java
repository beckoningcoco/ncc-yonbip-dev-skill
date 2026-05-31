/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.beans.BeansException
 *  org.springframework.beans.factory.config.BeanDefinition
 *  org.springframework.beans.factory.config.ConfigurableListableBeanFactory
 *  org.springframework.beans.factory.support.BeanDefinitionBuilder
 *  org.springframework.beans.factory.support.BeanDefinitionRegistry
 *  org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.divert;

import com.yonyoucloud.upc.billrule.common.ReferenceCheckRule;
import com.yonyoucloud.upc.billrule.merchant.MyHierarchyControlCheckingImpl;
import com.yonyoucloud.upc.billrule.merchant.MyMasterOrgControlCheckingImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PlatformBeanService
implements BeanDefinitionRegistryPostProcessor {
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        BeanDefinitionBuilder refCheckBean = BeanDefinitionBuilder.genericBeanDefinition(ReferenceCheckRule.class);
        beanDefinitionRegistry.registerBeanDefinition("referenceCheckRule", (BeanDefinition)refCheckBean.getBeanDefinition());
        BeanDefinitionBuilder DefaultMasterOrgControlCheckingImpl2 = BeanDefinitionBuilder.genericBeanDefinition(MyMasterOrgControlCheckingImpl.class);
        beanDefinitionRegistry.registerBeanDefinition("defaultMasterOrgControlCheckingImpl", (BeanDefinition)DefaultMasterOrgControlCheckingImpl2.getBeanDefinition());
        BeanDefinitionBuilder MyHierarchyControlCheckingImpl2 = BeanDefinitionBuilder.genericBeanDefinition(MyHierarchyControlCheckingImpl.class);
        beanDefinitionRegistry.registerBeanDefinition("defaultHierarchyControlCheckingImpl", (BeanDefinition)MyHierarchyControlCheckingImpl2.getBeanDefinition());
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory defaultListableBeanFactory) throws BeansException {
    }
}

