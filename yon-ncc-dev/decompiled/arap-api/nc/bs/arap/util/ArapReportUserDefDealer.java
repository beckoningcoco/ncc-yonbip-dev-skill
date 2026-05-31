/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Logger
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.md.model.type.IEnumType
 *  nc.md.model.type.IType
 *  nc.md.persist.framework.IMDPersistenceQueryService
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.bd.userdefrule.UserdefitemVO
 *  nc.vo.bd.userdefrule.UserdefruleVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.fipub.report.PubCommonReportMethod
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.query.QueryConditionVO
 *  nc.vo.querytemplate.md.MDTemplateUtil
 *  nc.vo.querytemplate.md.MDType2QTTypeMapping
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Logger;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.md.model.type.IEnumType;
import nc.md.model.type.IType;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.bd.userdefrule.UserdefitemVO;
import nc.vo.bd.userdefrule.UserdefruleVO;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.fipub.report.PubCommonReportMethod;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.query.QueryConditionVO;
import nc.vo.querytemplate.md.MDTemplateUtil;
import nc.vo.querytemplate.md.MDType2QTTypeMapping;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class ArapReportUserDefDealer {
    public static final String[] positions = new String[]{"ARAP_H", "ARAP_B"};
    private Map<Integer, UserdefitemVO> headUserdefitemVOs = null;
    private Map<Integer, UserdefitemVO> bodyUserdefitemVOs = null;

    public ArapReportUserDefDealer() {
        this.initUserDefItem();
    }

    public QueryConditionVO[] dealUserDefCond(QueryConditionVO[] condVOs) {
        String fldCode = null;
        UserdefitemVO userdefitemVO = null;
        for (QueryConditionVO condVO : condVOs) {
            fldCode = condVO.getFieldCode();
            if (fldCode.toLowerCase().indexOf("h_def") >= 0) {
                userdefitemVO = this.headUserdefitemVOs.get(Integer.valueOf(fldCode.substring(fldCode.toLowerCase().indexOf("h_def") + 5)));
                ArapReportUserDefDealer.dealUserDefItem(condVO, userdefitemVO);
                continue;
            }
            if (!fldCode.toLowerCase().startsWith("def")) continue;
            userdefitemVO = this.bodyUserdefitemVOs.get(Integer.valueOf(fldCode.substring(fldCode.toLowerCase().indexOf("def") + 3)));
            ArapReportUserDefDealer.dealUserDefItem(condVO, userdefitemVO);
        }
        return condVOs;
    }

    public static void dealUserDefItem(QueryConditionVO condVO, UserdefitemVO userDefItemVO) {
        if (condVO == null || userDefItemVO == null) {
            return;
        }
        IType type = null;
        try {
            type = ArapReportUserDefDealer.getTypeByBeanID(userDefItemVO.getClassid());
        }
        catch (BusinessException e) {
            throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
        }
        if (type == null) {
            return;
        }
        condVO.setIsUserDef(UFBoolean.TRUE);
        String showName = (String)userDefItemVO.getAttributeValue("showname" + PubCommonReportMethod.getMultiLangIndex());
        showName = StringUtils.isEmpty((CharSequence)showName) ? userDefItemVO.getShowname() : showName;
        condVO.setFieldName(showName);
        if (userDefItemVO.getInputlength() != null) {
            condVO.setMaxLength(Integer.valueOf(userDefItemVO.getInputlength()));
        }
        condVO.setDataType(Integer.valueOf(MDType2QTTypeMapping.getQTType((int)type.getTypeType())));
        String valueEditorDescription = null;
        if (condVO.getDataType() == 1 || condVO.getDataType() == 2) {
            valueEditorDescription = userDefItemVO.getDigits() == null ? null : userDefItemVO.getDigits().toString();
        } else if (condVO.getDataType() == 5) {
            valueEditorDescription = ((IBean)type).getDefaultRefModelName();
            condVO.setReturnType(Integer.valueOf(2));
            condVO.setDispType(Integer.valueOf(1));
        } else if (condVO.getDataType() == 6) {
            IEnumType enumType = (IEnumType)type;
            valueEditorDescription = enumType.getReturnType().getTypeType() == 4 ? "IM," + type.getID() : "SM," + type.getID();
        }
        condVO.setConsultCode(valueEditorDescription);
        condVO.setOperaCode(MDTemplateUtil.getQTOperatorsByType((int)condVO.getDataType(), (int)condVO.getReturnType()));
    }

    private void initUserDefItem() {
        Collection userDefRules = null;
        try {
            userDefRules = this.getMDQueryService().queryBillOfVOByCondWithOrder(UserdefruleVO.class, SqlUtils.getInStr((String)"upper(code)", (String[])positions, (boolean)false), true, false, new String[0]);
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
        }
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        HashMap<Integer, UserdefitemVO> headItemVOs = new HashMap<Integer, UserdefitemVO>();
        HashMap<Integer, UserdefitemVO> bodyItemVOs = new HashMap<Integer, UserdefitemVO>();
        for (UserdefruleVO defrule : userDefRules) {
            Object[] userdefitemVOs = defrule.getUserdefitems();
            if (ArrayUtils.isEmpty((Object[])userdefitemVOs)) continue;
            if (positions[0].equalsIgnoreCase(defrule.getCode())) {
                for (Object itemVO : userdefitemVOs) {
                    if (!"GLOBLE00000000000000".equals(itemVO.getPk_org()) && !pk_group.equals(itemVO.getPk_org())) continue;
                    headItemVOs.put(itemVO.getPropindex(), (UserdefitemVO)itemVO);
                }
                continue;
            }
            if (!positions[1].equalsIgnoreCase(defrule.getCode())) continue;
            for (Object itemVO : userdefitemVOs) {
                if (!"GLOBLE00000000000000".equals(itemVO.getPk_org()) && !pk_group.equals(itemVO.getPk_org())) continue;
                bodyItemVOs.put(itemVO.getPropindex(), (UserdefitemVO)itemVO);
            }
        }
        this.headUserdefitemVOs = headItemVOs;
        this.bodyUserdefitemVOs = bodyItemVOs;
    }

    private static IType getTypeByBeanID(String id) throws BusinessException {
        return MDBaseQueryFacade.getInstance().getTypeByID(id, 300);
    }

    private IMDPersistenceQueryService getMDQueryService() {
        return MDPersistenceService.lookupPersistenceQueryService();
    }
}

