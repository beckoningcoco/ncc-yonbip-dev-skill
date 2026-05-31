/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.itf.arap.tally.ITallySourceData;
import nc.vo.bd.material.MaterialVO;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nccloud.commons.lang.StringUtils;

public class ArapMaterialUtils {
    public static void translateMaterial2NonVersion(CircularlyAccessibleValueObject[] vos, String materialFldName, String material_VFldName) throws BusinessException {
        String pk = null;
        ArrayList<String> pk_materials = new ArrayList<String>();
        for (CircularlyAccessibleValueObject vo : vos) {
            pk = (String)vo.getAttributeValue(materialFldName);
            if (!StringUtils.isNotEmpty((CharSequence)pk)) continue;
            pk_materials.add(pk);
        }
        if (!pk_materials.isEmpty()) {
            Map<String, String> pkMap = ArapMaterialUtils.contructMaterialPKMap(pk_materials);
            for (CircularlyAccessibleValueObject vo : vos) {
                vo.setAttributeValue(materialFldName, (Object)pkMap.get(vo.getAttributeValue(materialFldName)));
            }
        }
    }

    public static void translateMaterial2NonVersion(List<ITallySourceData> aggVOs, String materialFldName, String material_VFldName) throws BusinessException {
        String pk = null;
        ArrayList<String> pk_materials = new ArrayList<String>();
        for (ITallySourceData sourceData : aggVOs) {
            SuperVO[] bodyVOs;
            for (SuperVO vo : bodyVOs = sourceData.getChildVOs()) {
                pk = (String)vo.getAttributeValue(materialFldName);
                if (!StringUtils.isNotEmpty((CharSequence)pk)) continue;
                pk_materials.add(pk);
            }
        }
        Map<String, String> pkMap = ArapMaterialUtils.contructMaterialPKMap(pk_materials);
        for (ITallySourceData sourceData : aggVOs) {
            SuperVO[] bodyVOs;
            for (SuperVO vo : bodyVOs = sourceData.getChildVOs()) {
                vo.setAttributeValue(material_VFldName, vo.getAttributeValue(materialFldName));
                vo.setAttributeValue(materialFldName, (Object)pkMap.get(vo.getAttributeValue(materialFldName)));
            }
        }
    }

    public static void unTranslateMaterial2NonVersion(List<ITallySourceData> aggVOs, String materialFldName, String material_VFldName) throws BusinessException {
        for (ITallySourceData sourceData : aggVOs) {
            SuperVO[] bodyVOs;
            for (SuperVO vo : bodyVOs = sourceData.getChildVOs()) {
                vo.setAttributeValue(materialFldName, vo.getAttributeValue(material_VFldName));
            }
        }
    }

    private static Map<String, String> contructMaterialPKMap(List<String> pk_materials) throws BusinessException {
        HashMap<String, String> pkMap = new HashMap<String, String>();
        Collection materialVOs = new BaseDAO().retrieveByClause(MaterialVO.class, SqlUtils.getInStr((String)"pk_material", pk_materials, (boolean)true), new String[]{"pk_material", "pk_source"});
        for (MaterialVO materialVO : materialVOs) {
            pkMap.put(materialVO.getPk_material(), materialVO.getPk_source());
        }
        return pkMap;
    }
}

