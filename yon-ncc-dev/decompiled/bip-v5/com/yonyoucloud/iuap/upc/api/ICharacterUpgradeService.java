/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.ProductFieldMapper;
import com.yonyoucloud.iuap.upc.dto.UpgradeCharacterDTO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface ICharacterUpgradeService {
    public List<UpgradeCharacterDTO> listProductCharacterByIds(List<Long> var1) throws Exception;

    public List<UpgradeCharacterDTO> listSkuCharacterByIds(List<Long> var1) throws Exception;

    public List<UpgradeCharacterDTO> listSkuCharacterByIdsAndSensitiveType(int var1, List<Long> var2) throws Exception;

    public void characterUpgradeRollbackStart(String var1) throws Exception;

    public boolean characterUpgradeRollbackResult() throws Exception;

    public List<ProductFieldMapper> listProductFieldMapper() throws Exception;
}

