/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.CostClassDTO;
import com.yonyoucloud.iuap.upc.dto.CostClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.MaterialClassDTO;
import com.yonyoucloud.iuap.upc.dto.MaterialClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.PresentationClassDTO;
import com.yonyoucloud.iuap.upc.dto.PresentationClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProducClasstDTO;
import com.yonyoucloud.iuap.upc.dto.ProductApplyRangeDTO;
import com.yonyoucloud.iuap.upc.dto.ProductAsistUnitDTO;
import com.yonyoucloud.iuap.upc.dto.ProductAttachDTO;
import com.yonyoucloud.iuap.upc.dto.ProductBusiUnitDTO;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import com.yonyoucloud.iuap.upc.dto.ProductQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSecDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTagDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplDTO;
import com.yonyoucloud.iuap.upc.dto.ResultMessageDTO;
import com.yonyoucloud.iuap.upc.dto.SyncProductAuthConditionDTO;
import com.yonyoucloud.iuap.upc.dto.SyncProductAuthDTO;
import com.yonyoucloud.iuap.upc.dto.TaxRevenueDTO;
import com.yonyoucloud.iuap.upc.dto.UserDefineDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.vo.ProductTagQueryVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductServiceV2 {
    public UPCPager listProductByPageV2(Integer var1, Integer var2, String[] var3) throws Exception;

    public UPCPager listProductIdByConditionV2(ProductQryDTO var1, Integer var2, Integer var3, String[] var4) throws Exception;

    public ProductDTO getProductById(Long var1, String[] var2) throws Exception;

    public ProductDTO getProductByCode(String var1, String[] var2) throws Exception;

    @Deprecated
    public ProductDTO getProductByIdAndOrg(Long var1, Long var2, String[] var3) throws Exception;

    public ProductDTO getProductByIdAndOrg(Long var1, String var2, String[] var3) throws Exception;

    public List<ProductDTO> getProductByIds(List<Long> var1, String[] var2) throws Exception;

    public List<ProductDTO> getProductGlobalFieldByIds(List<Long> var1, String[] var2) throws Exception;

    @Deprecated
    public List<ProductDTO> getProductByIdsAndOrg(List<Long> var1, Long var2, String[] var3) throws Exception;

    public List<ProductDTO> getProductByIdsAndOrg(List<Long> var1, String var2, String[] var3) throws Exception;

    public ProducClasstDTO getProducClasstByIdOrCode(Long var1, String var2, String[] var3) throws Exception;

    public MaterialClassDTO listRootMaterailDTO(String[] var1) throws Exception;

    public List<MaterialClassDTO> getMaterialClassByIdOrCode(MaterialClassQryDTO var1, String[] var2) throws Exception;

    public UPCPager listMaterialClassByPageV2(MaterialClassQryDTO var1, Integer var2, Integer var3, String[] var4) throws Exception;

    public List<ProductApplyRangeDTO> getProductApplyRange(Long var1) throws Exception;

    public List<ProductApplyRangeDTO> getProductApplyRange(List<Long> var1, Integer var2) throws Exception;

    public List<ProductApplyRangeDTO> getProductApplyRange(List<Long> var1, Integer var2, Integer var3) throws Exception;

    @Deprecated
    public List<ProductApplyRangeDTO> getProductApplyRangeByOrgIds(List<Long> var1, Integer var2, Integer var3) throws Exception;

    public List<ProductApplyRangeDTO> getProductApplyRangeByOrgIdsNew(List<String> var1, Integer var2, Integer var3) throws Exception;

    public List<ProductDTO> listProductInfo(ProductQryDTO var1, String[] var2) throws Exception;

    public List<ProductDTO> listOldProductInfo(ProductQryDTO var1, String[] var2) throws Exception;

    public List<ProductDTO> listOldProductInfoByDataAuth(ProductQryDTO var1, String[] var2) throws Exception;

    public UPCPager listProductByPageV2(ProductQryDTO var1, Integer var2, Integer var3, String[] var4) throws Exception;

    public UPCPager listOldProductByPageV2(ProductQryDTO var1, Integer var2, Integer var3, String[] var4) throws Exception;

    public UPCPager listOldProductByPageAndDataAuth(ProductQryDTO var1, Integer var2, Integer var3, String[] var4) throws Exception;

    @Deprecated
    public List<ProductApplyRangeDTO> getProductByOrgIds(List<Long> var1) throws Exception;

    public List<ProductApplyRangeDTO> getProductByOrgIdsNew(List<String> var1) throws Exception;

    @Deprecated
    public List<ProductApplyRangeDTO> listNotExistProductByOrgAndProductIds(List<Long> var1, List<Long> var2) throws Exception;

    public List<ProductApplyRangeDTO> listNotExistProductByOrgAndProductIdsNew(List<String> var1, List<Long> var2) throws Exception;

    @Deprecated
    public List<ProductApplyRangeDTO> getProductByOrgId(Long var1) throws Exception;

    public List<ProductApplyRangeDTO> getProductByOrgId(String var1) throws Exception;

    @Deprecated
    public List<ProductApplyRangeDTO> getProductByOrgId(Long var1, List<Long> var2) throws Exception;

    public List<ProductApplyRangeDTO> getProductByOrgId(String var1, List<Long> var2) throws Exception;

    @Deprecated
    public List<ProductApplyRangeDTO> getProductByOrgId(List<Long> var1, Long var2) throws Exception;

    public List<ProductApplyRangeDTO> getProductByOrgIdList(List<String> var1, Long var2) throws Exception;

    @Deprecated
    public ResultMessageDTO deleteApplyRangeInfo(Long var1, List<Long> var2) throws Exception;

    public ResultMessageDTO deleteApplyRangeInfo(String var1, List<Long> var2) throws Exception;

    @Deprecated
    public ResultMessageDTO deleteApplyRangeInfo(List<Long> var1, Long var2) throws Exception;

    public ResultMessageDTO deleteApplyRangeInfoNew(List<String> var1, Long var2) throws Exception;

    public List<ProductAsistUnitDTO> listProductUnit(List<Long> var1, Long var2) throws Exception;

    public List<ProductAsistUnitDTO> listProductAsistUnit(List<Long> var1, Long var2) throws Exception;

    @Deprecated
    public Set<Long> listSubPartProductByOrgId(Long var1) throws Exception;

    public Set<String> listSubPartProductByOrgId(String var1) throws Exception;

    public List<ProductAsistUnitDTO> listProductTplUnit(Long var1, List<Long> var2) throws Exception;

    public List<ProductTagDTO> listProductTagByProductId(Long var1, Long var2) throws Exception;

    public List<ProductSecDTO> listProductSpec(String var1, Boolean var2) throws Exception;

    public List<TaxRevenueDTO> getTaxRevenueByCode(List<String> var1, String[] var2) throws Exception;

    public List<ProductAttachDTO> listProductAttach(List<Long> var1, Integer var2) throws Exception;

    public List<PresentationClassDTO> getTemplateIdByPresentationId(List<Long> var1, String[] var2) throws Exception;

    public List<PresentationClassDTO> getPresentationByQryDTO(PresentationClassQryDTO var1) throws Exception;

    public List<PresentationClassDTO> getPresentationDataPermission(PresentationClassQryDTO var1) throws Exception;

    public SyncProductAuthDTO syncProductAuth(List<SyncProductAuthConditionDTO> var1) throws Exception;

    public List<CostClassDTO> listCostClass(CostClassQryDTO var1) throws Exception;

    public List<ProductTplDTO> listProductTpl(List<Long> var1) throws Exception;

    public List<Long> productEnableSku(List<Long> var1) throws Exception;

    public boolean existShopProdutApplyRangeInfo(Long var1);

    public HashMap<Long, List<UserDefineDTO>> getSensitiveByProductAndType(List<Long> var1, int var2) throws Exception;

    public List<Map<String, Object>> getSKUByProductIdList(List<Long> var1, Integer var2, Boolean var3, Integer var4) throws Exception;

    public ProductAsistUnitDTO getProductAsistUnit(Long var1, Long var2) throws Exception;

    public List<ProductBusiUnitDTO> getProductAsistUnit(List<Long> var1, String var2) throws Exception;

    @Deprecated
    public List<Map> getAssistUnitRateByOrg(List<Map> var1) throws Exception;

    public CoreDocJsonResult addProductTag(Long var1, String var2, List<Long> var3) throws Exception;

    public CoreDocJsonResult delProductTag(Long var1, String var2, List<Long> var3) throws Exception;

    public List<ProductTagDTO> batchQueryProductTags(List<ProductTagQueryVO> var1) throws Exception;

    public CoreDocJsonResult disableProduct(Long var1, String var2) throws Exception;

    public CoreDocJsonResult enableProduct(Long var1, String var2) throws Exception;

    public Boolean hasCharacterSku(Long var1) throws Exception;

    public List<ProductDTO> hasCharacterSkus(List<Long> var1) throws Exception;

    public int queryProductCountByDataAuth(ProductQryDTO var1) throws Exception;
}

