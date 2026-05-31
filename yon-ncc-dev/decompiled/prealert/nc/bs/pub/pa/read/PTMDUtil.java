/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.MDBaseQueryFacade
 *  nc.md.data.access.DASFacade
 *  nc.md.data.access.NCObject
 *  nc.md.model.IAttribute
 *  nc.md.model.IBean
 *  nc.md.model.IBusinessEntity
 *  nc.md.model.MetaDataException
 *  nc.md.model.type.IType
 *  nc.md.util.MDUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.bs.pub.pa.read;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import nc.md.MDBaseQueryFacade;
import nc.md.data.access.DASFacade;
import nc.md.data.access.NCObject;
import nc.md.model.IAttribute;
import nc.md.model.IBean;
import nc.md.model.IBusinessEntity;
import nc.md.model.MetaDataException;
import nc.md.model.type.IType;
import nc.md.util.MDUtil;
import nc.vo.ml.NCLangRes4VoTransl;

public class PTMDUtil {
    public static IType getTypeByID(String id) {
        IType type = null;
        try {
            type = MDBaseQueryFacade.getInstance().getTypeByID(id, 300);
        }
        catch (MetaDataException e) {
            throw new RuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("_Template", "UPP_Template-000610") + id);
        }
        return type;
    }

    public static IBean getOwnerBean(IAttribute attr) {
        return attr.getOwnerBean();
    }

    public static IBean getAssociationBean(IAttribute attr) {
        return attr.getAssociation().getEndBean();
    }

    public static boolean is1LevelAttr(String attrpath, IBean bean) {
        return !attrpath.contains(".");
    }

    public static boolean is1LevelAttr2(String attrpath, IBean bean) {
        if (!attrpath.contains(".")) {
            return true;
        }
        String[] paths = PTMDUtil.splitPath(attrpath);
        if (paths.length == 2) {
            IAttribute parentAttr = bean.getAttributeByPath(paths[0]);
            if (parentAttr == null) {
                return false;
            }
            return PTMDUtil.isCollection(parentAttr);
        }
        return false;
    }

    public static String[] splitPath(String attrpath) {
        return attrpath.split("\\.");
    }

    public static boolean isCollection(IAttribute attr) {
        return MDUtil.isCollectionType((IType)attr.getDataType());
    }

    public static boolean isBoolean(IType type) {
        return 32 == type.getTypeType();
    }

    public static boolean isEnum(IType type) {
        return MDUtil.isEnumType((IType)type);
    }

    public static boolean isUFDate(IType type) {
        return MDUtil.isUFDate((IType)type) || MDUtil.isUFDateBegin((IType)type) || MDUtil.isUFDateEND((IType)type);
    }

    public static boolean isUFDateTime(IType type) {
        return 34 == type.getTypeType();
    }

    public static boolean isUFTime(IType type) {
        return 36 == type.getTypeType();
    }

    public static boolean isUFLiteralDate(IType type) {
        return 39 == type.getTypeType();
    }

    public static boolean isNumeric(IType type) {
        return MDUtil.isNumericType((int)type.getTypeType());
    }

    public static Map<String, Object[]> getAttrpath_Values_Map(IBean bean, List<String> pks, List<String> attrpaths) {
        return DASFacade.getAttributeValues((IBean)bean, (String[])pks.toArray(new String[0]), (String[])attrpaths.toArray(new String[0]));
    }

    public static String extractPK(NCObject ncObject) {
        if (ncObject == null) {
            return null;
        }
        IAttribute pkAttribute = ((IBusinessEntity)ncObject.getRelatedBean()).getKeyAttribute();
        Object pk = ncObject.getAttributeValue(pkAttribute);
        return String.valueOf(pk);
    }

    public static List<String> extractPKs(NCObject[] ncObjects) {
        if (ncObjects == null) {
            return null;
        }
        ArrayList<String> pks = new ArrayList<String>();
        for (NCObject ncObject : ncObjects) {
            pks.add(PTMDUtil.extractPK(ncObject));
        }
        return pks;
    }

    public static List<String> extractChildVOPKs(NCObject[] ncObjects, String childBeanPath) {
        if (ncObjects == null) {
            return null;
        }
        IBean bean = ncObjects[0].getRelatedBean();
        IAttribute collectionAttr = bean.getAttributeByPath(childBeanPath);
        IBean childBean = PTMDUtil.getAssociationBean(collectionAttr);
        ArrayList<String> pks = new ArrayList<String>();
        IAttribute pkAttribute = ((IBusinessEntity)childBean).getKeyAttribute();
        String pkpath = childBeanPath + "." + pkAttribute.getName();
        for (NCObject ncObject : ncObjects) {
            Object[] pkArray = (Object[])ncObject.getAttributeValue(pkpath);
            if (pkArray == null) continue;
            for (Object object : pkArray) {
                if (object == null) continue;
                pks.add(object.toString());
            }
        }
        return pks;
    }
}

