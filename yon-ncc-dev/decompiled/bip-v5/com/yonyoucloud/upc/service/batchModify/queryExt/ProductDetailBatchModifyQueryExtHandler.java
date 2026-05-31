/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryFieldExtService
 *  com.yonyou.iuap.apdoc.coredoc.dao.batchModify.PubBatchModifyEntityDao
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Field
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel
 *  com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils
 *  com.yonyou.ucf.mdd.ext.enums.util.EnumUtil
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.ExtBusinessProperty
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityFieldVO
 *  com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntity
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.batchModify.queryExt;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryFieldExtService;
import com.yonyou.iuap.apdoc.coredoc.dao.batchModify.PubBatchModifyEntityDao;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Field;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel;
import com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils;
import com.yonyou.ucf.mdd.ext.enums.util.EnumUtil;
import com.yonyoucloud.upc.coredoc.batchentity.dto.ExtBusinessProperty;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryDTO;
import com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityFieldVO;
import com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntity;
import com.yonyoucloud.upc.service.batchModify.PubBatchModifyEntityServiceImpl;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductDetailBatchModifyQueryExtHandler
implements IPubBatchModifyQueryFieldExtService,
IPubBatchModifyQueryEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(ProductDetailBatchModifyQueryExtHandler.class);
    @Autowired
    private PubBatchModifyEntityDao pubBatchModifyEntityDao;
    @Autowired
    private PubBatchModifyEntityServiceImpl pubBatchModifyEntityService;

    public List<PubBatchModifyEntity> getPubBatchModifyEntityVO(PubBatchModifyEntityQueryDTO pubBatchModifyEntityQueryDTO) throws Exception {
        return this.pubBatchModifyEntityDao.getPubBatchModifyEntityByBillNum(pubBatchModifyEntityQueryDTO.getBillNum());
    }

    public void getBatchModifyExtendField(PubBatchModifyEntity pubBatchModifyEntity, List<PubBatchModifyEntityFieldVO> batchModifySaveFieldList, List<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList) throws Exception {
        try {
            this.setExtentBatchModifyField(pubBatchModifyEntity, batchModifySaveFieldList, batchModifyQueryFieldList);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u6863\u6848\u6279\u6539\u83b7\u53d6\u5ba2\u5f00\u5b57\u6bb5\u5f02\u5e38:{}", (Object)e.getMessage(), (Object)e);
        }
    }

    public void setExtentBatchModifyField(PubBatchModifyEntity pubBatchModifyEntity, List<PubBatchModifyEntityFieldVO> batchModifySaveFieldList, List<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList) throws Exception {
        List<ExtBusinessProperty> extBusinessPropertyList = this.pubBatchModifyEntityService.getMetaExtentProperty(pubBatchModifyEntity, batchModifySaveFieldList, batchModifyQueryFieldList);
        if (!CollectionUtils.isEmpty(extBusinessPropertyList)) {
            Map<String, Field> fieldExtentMap = this.getViewModelExtentField(pubBatchModifyEntity);
            if (CollectionUtils.isEmpty(fieldExtentMap)) {
                return;
            }
            for (ExtBusinessProperty extBusinessProperty : extBusinessPropertyList) {
                Field extendField = fieldExtentMap.get(extBusinessProperty.getName());
                for (Map.Entry<String, Field> stringFieldEntry : fieldExtentMap.entrySet()) {
                    String key = stringFieldEntry.getKey();
                    HashSet<String> hashSet = new HashSet<String>(Arrays.asList(key.split("\\.")));
                    if (!hashSet.contains(extBusinessProperty.getName())) continue;
                    extendField = fieldExtentMap.get(key);
                }
                if (extendField == null) continue;
                PubBatchModifyEntityFieldVO pubBatchModifyEntityFieldVO = this.initPubBatchModifyEntityExtendFieldVO(extBusinessProperty, extendField, pubBatchModifyEntity);
                if (!pubBatchModifyEntityFieldVO.isMultiple()) {
                    batchModifyQueryFieldList.add(pubBatchModifyEntityFieldVO);
                }
                batchModifySaveFieldList.add(pubBatchModifyEntityFieldVO);
            }
        }
    }

    public Map<String, Field> getViewModelExtentField(PubBatchModifyEntity pubBatchModifyEntity) throws Exception {
        Entity entity;
        List fields;
        Iterator iterator;
        LinkedHashSet entities;
        HashMap<String, Field> fieldExtentMap = new HashMap<String, Field>();
        ViewModel viewModel = UIMetaUtils.getViewModel((String)pubBatchModifyEntity.getBillNum(), null);
        if (viewModel != null && !CollectionUtils.isEmpty((Collection)(entities = viewModel.getEntities())) && (iterator = entities.iterator()).hasNext() && !CollectionUtils.isEmpty((Collection)(fields = (entity = (Entity)iterator.next()).getFields()))) {
            for (Field field : fields) {
                if (field.getiSystem() == null || field.getiSystem() != 0 || !BooleanUtil.isFalse((Object)field.getHidden()) || "rate".equals(field.getControlType()) || "map".equals(field.getControlType()) || "inputidentity".equals(field.getControlType()) || "filelist".equals(field.getControlType()) || "pictureupload".equals(field.getControlType())) continue;
                fieldExtentMap.put(field.getFieldName(), field);
            }
        }
        return fieldExtentMap;
    }

    public PubBatchModifyEntityFieldVO initPubBatchModifyEntityExtendFieldVO(ExtBusinessProperty extBusinessProperty, Field extendField, PubBatchModifyEntity pubBatchModifyEntity) {
        String suffix;
        PubBatchModifyEntityFieldVO pubBatchModifyEntityFieldVO = new PubBatchModifyEntityFieldVO();
        pubBatchModifyEntityFieldVO.setId(String.valueOf(extendField.getId()));
        pubBatchModifyEntityFieldVO.setBatchModifyEntityId((String)pubBatchModifyEntity.getId());
        pubBatchModifyEntityFieldVO.setBatchModifyEntityFullName(pubBatchModifyEntity.getFullName());
        pubBatchModifyEntityFieldVO.setFieldName(extBusinessProperty.getName());
        pubBatchModifyEntityFieldVO.setCItemName(extBusinessProperty.getName());
        String string = suffix = pubBatchModifyEntity.getEntityName() == null || !pubBatchModifyEntity.getEntityNameResId().contains("UID") ? "" : "\uff08" + InternationalUtils.getMessageWithDefault((String)pubBatchModifyEntity.getEntityNameResId(), (String)pubBatchModifyEntity.getEntityName()) + "\uff09";
        if (!StringUtils.isEmpty((CharSequence)extendField.getShowCaptionResid())) {
            pubBatchModifyEntityFieldVO.setFieldCaption(InternationalUtils.getMessageWithDefault((String)extendField.getShowCaptionResid(), (String)extendField.getShowCaption()));
        } else {
            pubBatchModifyEntityFieldVO.setFieldCaption(extendField.getShowCaption());
        }
        pubBatchModifyEntityFieldVO.setFieldCaptionResId(extendField.getShowCaptionResid());
        pubBatchModifyEntityFieldVO.setCName(extBusinessProperty.getName());
        pubBatchModifyEntityFieldVO.setIsCheck("1");
        pubBatchModifyEntityFieldVO.setControlType(extendField.getControlType());
        pubBatchModifyEntityFieldVO.setEnumType(extendField.getEnumType());
        if (!StringUtils.isEmpty((CharSequence)extendField.getEnumType())) {
            try {
                String enumString = EnumUtil.getEnumStr((String)extendField.getEnumType(), (boolean)false);
                pubBatchModifyEntityFieldVO.setEnumValue(enumString);
            }
            catch (Exception e) {
                log.error("\u8bbe\u7f6e\u679a\u4e3e\u4fe1\u606f\u5f02\u5e38 enumType:{} exception:{}", (Object)extendField.getEnumType(), (Object)e.getMessage());
            }
        }
        pubBatchModifyEntityFieldVO.setINumPoint(extendField.getNumPoint());
        if (!StringUtils.isEmpty((CharSequence)extendField.getRefType())) {
            pubBatchModifyEntityFieldVO.setRefType(extendField.getRefType());
            pubBatchModifyEntityFieldVO.setRefRetId("id");
            pubBatchModifyEntityFieldVO.setRefReturn(extendField.getrefReturn());
        }
        if (extendField.getMultiple() != null && extendField.getMultiple().booleanValue()) {
            pubBatchModifyEntityFieldVO.setMultiple(true);
            pubBatchModifyEntityFieldVO.setIsMultiple("1");
            pubBatchModifyEntityFieldVO.setIsMultipleSave("1");
        } else {
            pubBatchModifyEntityFieldVO.setMultiple(false);
            pubBatchModifyEntityFieldVO.setIsMultiple("0");
            pubBatchModifyEntityFieldVO.setIsMultipleSave("0");
        }
        pubBatchModifyEntityFieldVO.setIsCharacter("0");
        return pubBatchModifyEntityFieldVO;
    }
}

