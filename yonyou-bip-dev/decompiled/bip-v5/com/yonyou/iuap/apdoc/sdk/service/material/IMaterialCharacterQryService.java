/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.ucf.userdef.dto.enums.CharacteristicsTypeEnum
 */
package com.yonyou.iuap.apdoc.sdk.service.material;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.sdk.constant.SensitiveEnum;
import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialCharacterQryDTO;
import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialCharacterRpcDTO;
import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialCharacterStructureDTO;
import com.yonyou.ucf.userdef.dto.enums.CharacteristicsTypeEnum;
import com.yonyoucloud.iuap.upc.dto.ProductTplCharacterDTO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMaterialCharacterQryService {
    public List<MaterialCharacterStructureDTO> getMaterialCharacterStructureById(List<Long> var1, List<CharacteristicsTypeEnum> var2) throws Exception;

    public List<ProductTplCharacterDTO> getCharacterBySensitive(List<SensitiveEnum> var1) throws Exception;

    public List<MaterialCharacterRpcDTO> getSkuCharacterById(List<Long> var1, int var2, int var3) throws Exception;

    public List<MaterialCharacterRpcDTO> getMaterialCharacterById(List<Long> var1) throws Exception;

    public List<MaterialCharacterRpcDTO> listMaterialByCharacter(MaterialCharacterQryDTO var1) throws Exception;

    public List<MaterialCharacterRpcDTO> listSkuByCharacter(MaterialCharacterQryDTO var1) throws Exception;
}

