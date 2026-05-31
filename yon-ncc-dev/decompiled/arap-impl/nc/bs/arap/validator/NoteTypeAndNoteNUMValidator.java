/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.pubitf.fbm.api.ecds.pub.IFbmPubQueryService
 *  nc.pubitf.para.SysInitQuery
 *  nc.vo.fibd.RecpaytypeVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.pubitf.fbm.api.ecds.pub.IFbmPubQueryService;
import nc.pubitf.para.SysInitQuery;
import nc.vo.fibd.RecpaytypeVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class NoteTypeAndNoteNUMValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;
    public static final String ISSETTLE = "issettle";
    public static final String FBMPRAM = "FBM2002";
    private static final String PKRECPAYTYPE = "pk_recpaytype";

    public ValidationFailure validate(Object obj) {
        if (this.checkObj(obj).booleanValue() && this.chekSysParm(obj)) {
            AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
            Object[] childrenVO = aggVOs[0].getChildrenVO();
            if (ArrayUtils.isEmpty((Object[])childrenVO)) {
                return null;
            }
            int childLength = childrenVO.length;
            HashMap<String, String> parmMap = new HashMap<String, String>();
            String pk_notetype = null;
            String checkno = null;
            String key = null;
            for (int i = 0; i < childLength; ++i) {
                pk_notetype = (String)childrenVO[i].getAttributeValue("checktype");
                checkno = (String)childrenVO[i].getAttributeValue("checkno");
                if (pk_notetype == null || checkno == null) continue;
                key = i + 1 + "-" + checkno;
                parmMap.put(key, pk_notetype);
            }
            try {
                String msg = this.checkAssSettlement(parmMap, (CircularlyAccessibleValueObject[])childrenVO);
                return msg == null ? null : new ValidationFailure(msg);
            }
            catch (BusinessException e) {
                throw new BusinessRuntimeException(e.getMessage());
            }
        }
        return null;
    }

    @Override
    public UFBoolean checkObj(Object obj) {
        if (null != obj && obj instanceof AggregatedValueObject[]) {
            AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
            String billType = (String)aggVOs[0].getParentVO().getAttributeValue("pk_billtype");
            if (billType != null && (billType.equals("F2") || billType.equals("F3"))) {
                return UFBoolean.TRUE;
            }
            return UFBoolean.FALSE;
        }
        return UFBoolean.FALSE;
    }

    private String checkAssSettlement(Map<String, String> parmMap, CircularlyAccessibleValueObject[] childrenVO) throws BusinessException {
        Map resultMap = ((IFbmPubQueryService)NCLocator.getInstance().lookup(IFbmPubQueryService.class)).belongsFBMBillByNotetypePk(parmMap);
        ArrayList<String> numList = new ArrayList<String>();
        ArrayList<String> recpaytypeList = new ArrayList<String>();
        Map<String, String> recpayMap = Collections.synchronizedMap(new IdentityHashMap());
        ArapBillDAO dao = new ArapBillDAO();
        String pkrecpaytype = null;
        String no = null;
        HashSet sortlist = new HashSet();
        for (Map.Entry parm : resultMap.entrySet()) {
            String key = (String)parm.getKey();
            Boolean value = (Boolean)parm.getValue();
            no = key.split("-")[0];
            if (!value.booleanValue()) continue;
            numList.add(no);
        }
        if (CollectionUtils.isEmpty(numList)) {
            return null;
        }
        for (String row : numList.toArray(new String[0])) {
            int rownum = Integer.parseInt(row) - 1;
            pkrecpaytype = (String)childrenVO[rownum].getAttributeValue(PKRECPAYTYPE);
            recpaytypeList.add(pkrecpaytype);
            recpayMap.put(pkrecpaytype, row);
        }
        RecpaytypeVO[] recpayVOs = dao.queryRecpaytypeVOByPK(recpaytypeList.toArray(new String[0]), new String[]{PKRECPAYTYPE, ISSETTLE});
        for (Map.Entry parm : recpayMap.entrySet()) {
            for (RecpaytypeVO recpayvo : recpayVOs) {
                UFBoolean issettle = (UFBoolean)recpayvo.getAttributeValue(ISSETTLE);
                if (issettle.booleanValue() || parm.getKey() == null || !((String)parm.getKey()).equals(recpayvo.getPk_recpaytype())) continue;
                sortlist.add(parm.getValue());
            }
        }
        if (!sortlist.isEmpty()) {
            String rownum = String.join((CharSequence)",", sortlist);
            String message = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1226", null, new String[]{rownum});
            return message;
        }
        return null;
    }

    private boolean chekSysParm(Object obj) {
        AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
        String pk_org = (String)aggVOs[0].getParentVO().getAttributeValue("pk_org");
        UFBoolean flag = null;
        try {
            flag = SysInitQuery.getParaBoolean((String)pk_org, (String)FBMPRAM);
        }
        catch (BusinessException e) {
            Logger.error((Object)(e.getMessage() + " From nc.bs.arap.validator.NoteTypeAndNoteNUMValidator"));
        }
        return flag == null ? false : flag.booleanValue();
    }
}

