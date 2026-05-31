/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.character.utils.CharacterViewModelFunction
 *  com.yonyou.ucf.userdef.dto.CharacterDetailDto
 *  com.yonyou.ucf.userdef.dto.CharacterViewModelDto
 *  com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityFieldVO
 *  com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntityField
 *  org.jetbrains.annotations.NotNull
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.character.utils.CharacterViewModelFunction;
import com.yonyou.ucf.userdef.dto.CharacterDetailDto;
import com.yonyou.ucf.userdef.dto.CharacterViewModelDto;
import com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityFieldVO;
import com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntityField;
import com.yonyoucloud.upc.service.batchModify.PubBatchModifyEntityServiceImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="businessPartnerSyncService")
public class BusinessPartnerSyncService {
    @Autowired
    private PubBatchModifyEntityServiceImpl pubBatchModifyEntityService;

    @NotNull
    public List<PubBatchModifyEntityFieldVO> getPubBatchModifyEntityFieldVOS() throws Exception {
        ArrayList<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList = new ArrayList<PubBatchModifyEntityFieldVO>();
        ArrayList<String> bizUris = new ArrayList<String>();
        bizUris.add("base.businesspartner.BusinessPartner");
        List result = CharacterViewModelFunction.getCharacterViewModelByUriFunc(bizUris);
        PubBatchModifyEntityField pubBatchModifyEntityField = new PubBatchModifyEntityField();
        pubBatchModifyEntityField.setBatchModifyEntityFullName("base.businesspartner.BusinessPartner");
        pubBatchModifyEntityField.setFieldName("businessPartnerCharacterDef");
        pubBatchModifyEntityField.setIsCharacter("1");
        pubBatchModifyEntityField.setIsQueryFields("1");
        if (!CollectionUtils.isEmpty((Collection)result) && !CollectionUtils.isEmpty((Collection)((CharacterViewModelDto)result.get(0)).getCharacterDetailDtos())) {
            List characterDetailDtoList = ((CharacterViewModelDto)result.get(0)).getCharacterDetailDtos();
            for (CharacterDetailDto characterDetailDto : characterDetailDtoList) {
                if ("imagelist".equals(characterDetailDto.getControlType()) || "filelist".equals(characterDetailDto.getControlType())) continue;
                PubBatchModifyEntityFieldVO pubBatchModifyEntityFieldVO = this.pubBatchModifyEntityService.initPubBatchModifyEntityCharacterFieldVO(characterDetailDto, pubBatchModifyEntityField);
                if (!BooleanUtil.isTrue((Object)pubBatchModifyEntityField.getIsQueryFields())) continue;
                batchModifyQueryFieldList.add(pubBatchModifyEntityFieldVO);
            }
        }
        return batchModifyQueryFieldList;
    }
}

