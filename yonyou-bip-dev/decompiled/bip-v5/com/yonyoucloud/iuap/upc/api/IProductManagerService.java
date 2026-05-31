/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.cloud.yts.annotation.YtsTransactional
 *  com.yonyou.cloud.yts.enums.TransactionMode
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.cloud.yts.annotation.YtsTransactional;
import com.yonyou.cloud.yts.enums.TransactionMode;
import com.yonyoucloud.iuap.upc.dto.MaterialClassDTO;
import com.yonyoucloud.iuap.upc.dto.ProducClasstDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;
import java.util.Map;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductManagerService {
    public List<String> listProductClasstDTOById(Long var1, List<String> var2) throws Exception;

    public List<ProducClasstDTO> listProductClasstDTOById(List<Long> var1, String var2);

    public void deleteShopByIds(Long var1, List<String> var2) throws Exception;

    public void deleteShopByIds(List<Long> var1, String var2);

    public void applyClass2ShopByIds(Long var1, List<String> var2) throws Exception;

    public void applyClass2ShopByIds(List<Long> var1, String var2);

    public void stopProductClasstByIds(List<Long> var1);

    public void unStopProductClasstByIds(List<Long> var1);

    public Map<Long, List<String>> queryShopByManagement(List<Long> var1) throws Exception;

    public List<String> checkShops(Long var1, List<String> var2) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> queryByID(Long var1) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> queryByIDList(List<Long> var1) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> queryByCode(String var1) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> queryByCodeList(List<String> var1) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> queryTree(ManagementClassQryDTO var1) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> queryTreeByParent(ManagementClassQryDTO var1) throws Exception;

    @YtsTransactional(mode=TransactionMode.TCC, confirm="addManagerClassConfirm", cancel="addManagerClassCancel")
    public CoreDocJsonResult<ManagementClassDTO> add(ManagementClassDTO var1) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> addManagerClassConfirm(ManagementClassDTO var1) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> addManagerClassCancel(ManagementClassDTO var1) throws Exception;

    @YtsTransactional(mode=TransactionMode.TCC, confirm="updateManagerClassConfirm", cancel="updateManagerClassCancel")
    public CoreDocJsonResult<ManagementClassDTO> update(ManagementClassDTO var1) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> updateManagerClassConfirm(ManagementClassDTO var1) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> updateManagerClassCancel(ManagementClassDTO var1) throws Exception;

    @YtsTransactional(mode=TransactionMode.TCC, confirm="batchAddManagerClassConfirm", cancel="batchAddManagerClassCancel")
    public CoreDocJsonResult<UPCResultList> batchAdd(List<ManagementClassDTO> var1) throws Exception;

    public CoreDocJsonResult<UPCResultList> batchAddManagerClassConfirm(List<ManagementClassDTO> var1) throws Exception;

    public CoreDocJsonResult<UPCResultList> batchAddManagerClassCancel(List<ManagementClassDTO> var1) throws Exception;

    @YtsTransactional(mode=TransactionMode.TCC, confirm="batchUpdateManagerClassConfirm", cancel="batchUpdateManagerClassCancel")
    public CoreDocJsonResult<UPCResultList> batchUpdate(List<ManagementClassDTO> var1) throws Exception;

    public CoreDocJsonResult<UPCResultList> batchUpdateManagerClassConfirm(List<ManagementClassDTO> var1) throws Exception;

    public CoreDocJsonResult<UPCResultList> batchUpdateManagerClassCancel(List<ManagementClassDTO> var1) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> queryOrgByIds(List<Long> var1) throws Exception;

    public CoreDocJsonResult<MaterialClassDTO> getProductClassLowerById(Long var1, String var2);
}

