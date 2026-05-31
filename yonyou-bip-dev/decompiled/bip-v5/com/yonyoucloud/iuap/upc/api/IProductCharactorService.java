/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.ucf.CharacterDTO
 *  com.yonyou.ucf.userdef.dto.SyncCharacterResult
 *  com.yonyou.ucf.userdef.dto.SyncCharacteristicsDto
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.ucf.CharacterDTO;
import com.yonyou.ucf.userdef.dto.SyncCharacterResult;
import com.yonyou.ucf.userdef.dto.SyncCharacteristicsDto;
import com.yonyoucloud.iuap.upc.dto.CharacterValueDTO;
import com.yonyoucloud.iuap.upc.dto.ProductCharacterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import com.yonyoucloud.iuap.upc.dto.ProductFreeCharacterItemQryDto;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplCharacterDTO;
import com.yonyoucloud.iuap.upc.dto.SensitiveInfoAndProduct;
import com.yonyoucloud.iuap.upc.dto.SkuMatchDTO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductCharactorService {
    public ProductDTO getCharactorByProductId(Long var1, String[] var2) throws Exception;

    public ProductSkuDTO skuMatchByProductAndCharactor(Long var1, List<CharacterValueDTO> var2, String[] var3) throws Exception;

    public List<SkuMatchDTO> skuMatchByProductAndCharacter(List<SkuMatchDTO> var1) throws Exception;

    public List<Long> getSkuIdByCharactorInfo(Long var1, List<CharacterValueDTO> var2) throws Exception;

    public List<CharacterDTO> listCharactorByProductId(Long var1);

    public List<ProductCharacterDTO> listUsedCharactorByProductId(Long var1) throws Exception;

    public List<CharacterDTO> listCharactorBySkuId(Long var1) throws Exception;

    public Map<Long, List<CharacterDTO>> listCharactorBySkuIds(List<Long> var1) throws Exception;

    public Map<Long, List<CharacterDTO>> listCharactorBySkuIds(List<Long> var1, Boolean var2) throws Exception;

    public List<String> listCharactorValueByProductId(Long var1, String var2) throws Exception;

    public List<Long> getProductIdsByCharactor(List<CharacterValueDTO> var1) throws Exception;

    public List<CharacterDTO> getCharactorBySencitiveType(Integer var1, Integer var2) throws Exception;

    public List<CharacterDTO> getCharacterBaseInfoBySensitiveType(Integer var1, Integer var2) throws Exception;

    public HashMap<Long, List<CharacterDTO>> getCharactorByProductAndSencitiveType(List<Long> var1, Integer var2, Integer var3) throws Exception;

    public HashMap<Long, List<CharacterDTO>> getCharacterBaseInfoByProductAndSensitiveType(List<Long> var1, Integer var2, Integer var3) throws Exception;

    public SyncCharacterResult updateProductTplCharacter(SyncCharacteristicsDto var1) throws Exception;

    public List<ProductTplCharacterDTO> getSensitiveInfoByProduct(List<Long> var1, Long var2) throws Exception;

    public List<ProductTplCharacterDTO> getSensitiveInfoByProductTpl(List<Long> var1, Long var2) throws Exception;

    public List<Long> getCharacterIdsByProductAndSensitive(Long var1, Long var2, String var3) throws Exception;

    public HashMap<String, List<Long>> listProductTplIdByCharactristicIds(List<String> var1) throws Exception;

    public SensitiveInfoAndProduct getSensitiveInfoAndProduct(List<Long> var1, Long var2);

    public List<ProductFreeCharacterItemQryDto> listrFreeCharacterItemAndAlbums(List<ProductFreeCharacterItemQryDto> var1) throws Exception;
}
