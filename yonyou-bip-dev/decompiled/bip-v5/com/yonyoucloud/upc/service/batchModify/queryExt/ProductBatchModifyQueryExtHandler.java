/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryFieldExtService
 *  com.yonyou.iuap.apdoc.coredoc.dao.batchModify.PubBatchModifyEntityDao
 *  com.yonyou.ucf.mdd.ext.dubbo.DubboReferenceUtils
 *  com.yonyou.ucf.userdef.api.IAccessCharacterEntitiesSeviceRPC
 *  com.yonyou.ucf.userdef.api.ICharacterViewModelService
 *  com.yonyou.ucf.userdef.dto.CharacterDetailDto
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityFieldVO
 *  com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntity
 *  com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntityField
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.batchModify.queryExt;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryFieldExtService;
import com.yonyou.iuap.apdoc.coredoc.dao.batchModify.PubBatchModifyEntityDao;
import com.yonyou.ucf.mdd.ext.dubbo.DubboReferenceUtils;
import com.yonyou.ucf.userdef.api.IAccessCharacterEntitiesSeviceRPC;
import com.yonyou.ucf.userdef.api.ICharacterViewModelService;
import com.yonyou.ucf.userdef.dto.CharacterDetailDto;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryDTO;
import com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityFieldVO;
import com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntity;
import com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntityField;
import com.yonyoucloud.upc.service.batchModify.PubBatchModifyEntityServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductBatchModifyQueryExtHandler
implements IPubBatchModifyQueryFieldExtService,
IPubBatchModifyQueryEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(ProductBatchModifyQueryExtHandler.class);
    @Autowired
    private PubBatchModifyEntityDao pubBatchModifyEntityDao;
    @Autowired
    private PubBatchModifyEntityServiceImpl pubBatchModifyEntityService;

    public List<PubBatchModifyEntity> getPubBatchModifyEntityVO(PubBatchModifyEntityQueryDTO pubBatchModifyEntityQueryDTO) throws Exception {
        return this.pubBatchModifyEntityDao.getPubBatchModifyEntityByBillNum(pubBatchModifyEntityQueryDTO.getBillNum());
    }

    public void getBatchModifyExtendField(PubBatchModifyEntity pubBatchModifyEntity, List<PubBatchModifyEntityFieldVO> batchModifySaveFieldList, List<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList) throws Exception {
        if ("pc.product.Product".equals(pubBatchModifyEntity.getFullName())) {
            this.setBatchModifyFieldForMaterialPropCT(pubBatchModifyEntity, batchModifySaveFieldList);
        }
        try {
            this.pubBatchModifyEntityService.setExtentBatchModifyField(pubBatchModifyEntity, batchModifySaveFieldList, batchModifyQueryFieldList);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u6863\u6848\u6279\u6539\u83b7\u53d6\u5ba2\u5f00\u5b57\u6bb5\u5f02\u5e38:{}", (Object)e.getMessage(), (Object)e);
        }
    }

    public void setBatchModifyFieldForMaterialPropCT(PubBatchModifyEntity pubBatchModifyEntity, List<PubBatchModifyEntityFieldVO> batchModifySaveFieldList) throws Exception {
        IAccessCharacterEntitiesSeviceRPC characterEntitiesServiceRPC = (IAccessCharacterEntitiesSeviceRPC)DubboReferenceUtils.getDubboService(IAccessCharacterEntitiesSeviceRPC.class, (String)"u8c-userdefine", null);
        String productPropCharacterJson = characterEntitiesServiceRPC.getCharacterEntitiesByCGType("MaterialPropCT");
        Map productPropCharacterMap = (Map)JSONObject.parseObject((String)productPropCharacterJson, Map.class);
        List productPropCharacters = new ArrayList();
        if (productPropCharacterMap != null && productPropCharacterMap.get("characters") != null) {
            List productPropCharacterList = (List)productPropCharacterMap.get("characters");
            Set characterCodes = productPropCharacterList.stream().filter(productPropCharacterItem -> !"11".equals(productPropCharacterItem.get("dataType").toString()) && !"12".equals(productPropCharacterItem.get("dataType").toString())).map(productPropCharacterItem -> productPropCharacterItem.get("cName").toString()).collect(Collectors.toSet());
            ICharacterViewModelService characterViewModelService = (ICharacterViewModelService)DubboReferenceUtils.getDubboService(ICharacterViewModelService.class, (String)"u8c-userdefine", null);
            productPropCharacters = characterViewModelService.getCharacterDetailsByCodes(characterCodes);
        }
        PubBatchModifyEntityField pubBatchModifyEntityField = new PubBatchModifyEntityField();
        pubBatchModifyEntityField.setBatchModifyEntityId((String)pubBatchModifyEntity.getId());
        pubBatchModifyEntityField.setBatchModifyEntityFullName("pc.product.Product");
        pubBatchModifyEntityField.setFieldName("productPropCharacterDefine");
        pubBatchModifyEntityField.setFieldCaption("\u7269\u6599\u5c5e\u6027\u7279\u5f81\u7ec4");
        pubBatchModifyEntityField.setFieldCaptionResId("UID:P_COREDOC-UI_17AA803205700359");
        pubBatchModifyEntityField.setIsChecks("1");
        pubBatchModifyEntityField.setIsCharacter("1");
        if (productPropCharacters != null && productPropCharacters.size() > 0) {
            for (CharacterDetailDto characterDetailDto : productPropCharacters) {
                PubBatchModifyEntityFieldVO pubBatchModifyEntityFieldVO = this.pubBatchModifyEntityService.initPubBatchModifyEntityCharacterFieldVO(characterDetailDto, pubBatchModifyEntityField);
                batchModifySaveFieldList.add(pubBatchModifyEntityFieldVO);
            }
        }
    }
}

