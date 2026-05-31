/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.core.service.TimeService
 *  nc.md.data.access.NCObject
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.arap.utils;

import java.util.Date;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.core.service.TimeService;
import nc.md.data.access.NCObject;
import nc.vo.arap.BusiStatus;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;

public final class DataUtil {
    private static final String CREATE_TIME = "creationtime";
    private static final String CREATOR = "creator";
    private static final String MODIFIER = "modifier";
    private static final String MODIFIED_TIME = "modifiedtime";

    private DataUtil() {
    }

    public static void setUFDate(SuperVO bean, String[] datafieldName) {
        for (String name : datafieldName) {
            bean.setAttributeValue(name, (Object)DataUtil.getUFDate());
        }
    }

    public static void setUFDateTime(SuperVO bean, String[] dataTimeFieldName) {
        for (String name : dataTimeFieldName) {
            bean.setAttributeValue(name, (Object)DataUtil.getCurrentTime());
        }
    }

    public static void setPerson(SuperVO bean, String[] personFeildName) {
        for (String name : personFeildName) {
            bean.setAttributeValue(name, (Object)DataUtil.getCurrentUser());
        }
    }

    public static void setPerson(SuperVO[] beans, String[] personFeildName) {
        for (SuperVO bean : beans) {
            DataUtil.setPerson(bean, personFeildName);
        }
    }

    public static void setCreate(SuperVO bean) {
        bean.setAttributeValue(CREATE_TIME, (Object)DataUtil.getCurrentTime());
        bean.setAttributeValue(CREATOR, (Object)DataUtil.getCurrentUser());
    }

    public static void setCreate(SuperVO[] beans) {
        for (SuperVO bean : beans) {
            DataUtil.setCreate(bean);
        }
    }

    public static void setModify(SuperVO bean) {
        bean.setAttributeValue(MODIFIER, (Object)DataUtil.getCurrentUser());
        bean.setAttributeValue(MODIFIED_TIME, (Object)DataUtil.getCurrentTime());
    }

    public static void setModify(AggregatedValueObject aggVO) {
        String[] fieldcodes = new String[]{MODIFIER, MODIFIED_TIME};
        Object[] vals = new Object[]{DataUtil.getCurrentUser(), DataUtil.getCurrentTime()};
        DataUtil.setHeadVOSVals(aggVO, fieldcodes, vals);
        DataUtil.setBodyVOsVals(aggVO, fieldcodes, vals);
    }

    public static void setModify(NCObject bean) {
        SuperVO vo = (SuperVO)((AggregatedValueObject)bean.getContainmentObject()).getParentVO();
        DataUtil.setModify(vo);
    }

    public static void setModify(SuperVO[] beans) {
        for (SuperVO bean : beans) {
            DataUtil.setModify(bean);
        }
    }

    public static void setDelete(AggregatedValueObject aggVO) {
        DataUtil.setHeadVOSVals(aggVO, new String[]{"billstatus"}, new Object[]{BusiStatus.DELETED.getBillStatusKind()});
    }

    public static void setAduit(AggregatedValueObject aggVO) {
        DataUtil.setHeadVOSVals(aggVO, new String[]{"billstatus", "approvedate", "approver"}, new Object[]{BusiStatus.AUDIT.getBillStatusSubKind(), DataUtil.getUFDate(), DataUtil.getCurrentUser()});
    }

    public static void setHeadVOSVals(AggregatedValueObject aggVO, String[] fieldcodes, Object[] vals) {
        for (int index = 0; index < fieldcodes.length; ++index) {
            aggVO.getParentVO().setAttributeValue(fieldcodes[index], vals[index]);
        }
    }

    public static void setBodyVOsVals(AggregatedValueObject aggVO, String[] fieldcodes, Object[] vals) {
        for (int index = 0; index < fieldcodes.length; ++index) {
            for (CircularlyAccessibleValueObject child : aggVO.getChildrenVO()) {
                child.setAttributeValue(fieldcodes[index], vals[index]);
            }
        }
    }

    public static void setUnAduit(AggregatedValueObject aggVO) {
        DataUtil.setHeadVOSVals(aggVO, new String[]{"billstatus", "approvedate", "approver"}, new Object[]{BusiStatus.SAVE.getBillStatusKind(), null, null});
    }

    public static void setUFDateTime(SuperVO[] beans, String[] dataTimeFieldName) {
        for (SuperVO bean : beans) {
            DataUtil.setUFDateTime(bean, dataTimeFieldName);
        }
    }

    public static void setUFDate(SuperVO[] beans, String[] datafieldName) {
        for (SuperVO bean : beans) {
            DataUtil.setUFDate(bean, datafieldName);
        }
    }

    public static UFDateTime getCurrentTime() {
        return new UFDateTime();
    }

    public static String getCurrentUser() {
        return InvocationInfoProxy.getInstance().getUserId();
    }

    public static UFDate getUFDate() {
        return new UFDate(new Date(TimeService.getInstance().getTime()));
    }
}

