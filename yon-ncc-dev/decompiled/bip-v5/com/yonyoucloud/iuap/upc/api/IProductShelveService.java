/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductShelveService {
    public RuleExecuteResult shelfUorderProduct(Long var1, List<String> var2) throws Exception;

    public RuleExecuteResult unShelfUorderProduct(Long var1, List<String> var2) throws Exception;

    public RuleExecuteResult shelfUmallProduct(Long var1, List<String> var2) throws Exception;

    public RuleExecuteResult unShelfUmallProduct(Long var1, List<String> var2) throws Exception;
}

