/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.yms.exception.DAOException
 *  com.yonyou.iuap.yms.exception.DbException
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.Partition
 *  com.yonyou.ucf.mdd.ext.core.impl.PartitionFromMdd
 *  org.aspectj.lang.annotation.Aspect
 *  org.aspectj.lang.annotation.Before
 *  org.aspectj.lang.annotation.Pointcut
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.context.annotation.EnableAspectJAutoProxy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.divert;

import com.yonyou.iuap.yms.exception.DAOException;
import com.yonyou.iuap.yms.exception.DbException;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.Partition;
import com.yonyou.ucf.mdd.ext.core.impl.PartitionFromMdd;
import java.util.List;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy(exposeProxy=true)
public class YmsPartitionAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut(value="execution(public * com.yonyou.iuap.yms.dao.AbstractDAO.updateByCondition(..)) && args(vos, partition) || execution(public * com.yonyou.iuap.yms.dao.AbstractDAO.deleteByCondition(..)) && args(vos, partition)", argNames="vos, partition")
    public <T extends BaseEntity> void handle(List<T> vos, Partition partition) throws DAOException, DbException {
    }

    @Before(value="handle(vos,partition)", argNames="vos,partition")
    public <T extends BaseEntity> void beforeHandle(List<T> vos, Partition partition) throws DAOException, DbException {
        try {
            if (vos != null && partition != null) {
                for (BaseEntity baseEntity : vos) {
                    if (!"aa.merchant.Merchant".equalsIgnoreCase(baseEntity._getMetaUri()) && !"aa.merchant.MerchantApplyRange".equalsIgnoreCase(baseEntity._getMetaUri())) continue;
                    ((PartitionFromMdd)partition).getContext().put((Object)"isPotential", (Object)"*");
                    ((PartitionFromMdd)partition).getContext().put((Object)"shop", (Object)"*");
                }
            }
        }
        catch (Exception e) {
            this.logger.error("\u9002\u914d\u6846\u67b6mdd.jdbc.yms\u5207\u9762\u5f02\u5e38\u4fe1\u606f{}", (Object)e.getMessage());
        }
    }
}

