/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.UnitDTO;
import com.yonyoucloud.iuap.upc.dto.UnitGroupDTO;
import java.math.BigDecimal;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IUnitService {
    public UnitDTO getUnitById(Long var1, String[] var2) throws Exception;

    public List<UnitDTO> getUnitByIds(List<Long> var1, String[] var2) throws Exception;

    public List<UnitDTO> getUnitByCode(List<String> var1, String[] var2) throws Exception;

    public List<UnitDTO> getUnitByErpCode(List<String> var1, String[] var2) throws Exception;

    public List<UnitDTO> getUnitByUnitGroupId(Long var1, Boolean var2, String[] var3) throws Exception;

    public List<UnitGroupDTO> getUnitGroupByCode(List<String> var1) throws Exception;

    public String unitConversion(Long var1, Double var2, Long var3) throws Exception;

    public Long saveUnit(UnitDTO var1) throws Exception;

    public Long cloudImportByCode(String var1) throws Exception;

    public BigDecimal getTargetUnitNum(Long var1, Long var2, BigDecimal var3) throws Exception;

    public Long getIdByNameOrCode(String var1, String var2) throws Exception;
}

