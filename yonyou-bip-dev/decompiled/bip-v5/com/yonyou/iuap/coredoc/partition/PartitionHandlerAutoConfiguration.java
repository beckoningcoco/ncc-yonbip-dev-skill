/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdf.query.core.partition.PartitionHandler
 *  com.yonyou.ucf.mdf.query.partition.PartitionHandlerRegistration
 *  org.jetbrains.annotations.NotNull
 *  org.springframework.context.annotation.Bean
 */
package com.yonyou.iuap.coredoc.partition;

import com.yonyou.iuap.coredoc.partition.ProductCenterPartitionHandler;
import com.yonyou.ucf.mdf.query.core.partition.PartitionHandler;
import com.yonyou.ucf.mdf.query.partition.PartitionHandlerRegistration;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;

public class PartitionHandlerAutoConfiguration {
    @Bean(value={"productCenterPartitionHandlerRegistration"})
    public PartitionHandlerRegistration registration() {
        return new PartitionHandlerRegistration(){

            @NotNull
            public String getDomain() {
                return "productcenter";
            }

            @NotNull
            public PartitionHandler getPartitionHandler() {
                return new ProductCenterPartitionHandler();
            }
        };
    }
}

