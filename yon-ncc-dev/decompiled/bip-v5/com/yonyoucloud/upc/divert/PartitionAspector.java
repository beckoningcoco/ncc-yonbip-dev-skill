/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.aspectj.lang.ProceedingJoinPoint
 *  org.aspectj.lang.annotation.Around
 *  org.aspectj.lang.annotation.Aspect
 *  org.aspectj.lang.annotation.Before
 *  org.aspectj.lang.annotation.Pointcut
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.PartitionContext
 *  org.imeta.orm.base.PartitionObject
 *  org.imeta.orm.crud.IUpdateExistingDataFetcher
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.divert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.PartitionContext;
import org.imeta.orm.base.PartitionObject;
import org.imeta.orm.crud.IUpdateExistingDataFetcher;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PartitionAspector {
    @Pointcut(value="execution(public * org.imeta.orm.crud.UpdatePartitionSqlBuilder.buildSql(..)) && args(entity, data,isRoot) || execution(public * org.imeta.orm.crud.DeletePartitionSqlBuilder.buildSql(..)) && args(entity, data,isRoot) ")
    public void handle(Entity entity, PartitionObject data, boolean isRoot) {
    }

    @Pointcut(value="execution(public * org.imeta.orm.crud.ExtendDeletePartitionSqlBuilder.extBuild(..)) && args(entity, data)")
    public void handle(Entity entity, PartitionObject data) {
    }

    @Before(value="handle(entity, data,isRoot)")
    public void profile(Entity entity, PartitionObject data, boolean isRoot) {
        this.addShopPartition(entity, data);
    }

    @Before(value="handle(entity, data)")
    public void profile(Entity entity, PartitionObject data) {
        this.addShopPartition(entity, data);
    }

    private void addShopPartition(Entity entity, PartitionObject data) {
        if (entity != null && data != null && ("aa.merchant.Merchant".equalsIgnoreCase(entity.fullname()) || "aa.merchant.MerchantApplyRange".equalsIgnoreCase(entity.fullname()))) {
            data.getPartitionContext().put((Object)"isPotential", (Object)"*");
            data.getPartitionContext().put((Object)"shop", (Object)"*");
            data.getPartitionContext().put((Object)"shop", (Object)"*");
        }
    }

    @Pointcut(value="execution(public * org.imeta.orm.crud.ExtendUpdatePartitionSqlBuilder.extBuild(..))&& args(entity, data,fetcher) ")
    public void handle(Entity entity, PartitionObject data, IUpdateExistingDataFetcher fetcher) {
    }

    @Before(value="handle(entity, data,fetcher)")
    public void profile(Entity entity, PartitionObject data, IUpdateExistingDataFetcher fetcher) {
        this.addShopPartition(entity, data);
    }

    @Around(value="execution(* com.yonyou.ucf.mdd.ext.core.impl.MddExtPartitionServiceImpl.getDeleteAndUpdatePartitionContextData(..))")
    public Object addPropertiesToContextData(ProceedingJoinPoint joinPoint) throws Throwable {
        Entity entity;
        Object result = joinPoint.proceed();
        Object[] args = joinPoint.getArgs();
        Object firstArg = args[0];
        if (result instanceof PartitionContext && firstArg instanceof Entity && ("aa.merchant.Merchant".equalsIgnoreCase((entity = (Entity)firstArg).fullname()) || "aa.merchant.MerchantApplyRange".equalsIgnoreCase(entity.fullname()))) {
            PartitionContext resultPartition = (PartitionContext)result;
            resultPartition.put((Object)"isPotential", (Object)"*");
            resultPartition.put((Object)"shop", (Object)"*");
            return resultPartition;
        }
        return result;
    }
}

