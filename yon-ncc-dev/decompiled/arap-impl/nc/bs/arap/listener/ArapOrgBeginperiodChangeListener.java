/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.businessevent.bd.BDCommonEvent
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.arap.bill.IArapBillPubQueryService
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.OrgModulePeriodVO
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.listener;

import java.util.ArrayList;
import java.util.HashSet;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.businessevent.bd.BDCommonEvent;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.arap.bill.IArapBillPubQueryService;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.OrgModulePeriodVO;
import nc.vo.pub.BusinessException;

public class ArapOrgBeginperiodChangeListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        IArapBillPubQueryService qryservice;
        boolean existbillFlag;
        Object[] vos = ((BDCommonEvent)event).getNewObjs();
        HashSet<String> pk_orgs = new HashSet<String>();
        boolean checkAR = false;
        boolean checkAP = false;
        if (vos != null && vos.length > 0) {
            for (Object vo : vos) {
                OrgModulePeriodVO orgModulePeriodVO = (OrgModulePeriodVO)vo;
                String moduleid = orgModulePeriodVO.getModuleid();
                if ("2006".equals(moduleid)) {
                    checkAR = true;
                    pk_orgs.add(orgModulePeriodVO.getPk_org());
                    continue;
                }
                if (!"2008".equals(moduleid)) continue;
                checkAP = true;
                pk_orgs.add(orgModulePeriodVO.getPk_org());
            }
        }
        if (!pk_orgs.isEmpty() && (existbillFlag = (qryservice = (IArapBillPubQueryService)NCLocator.getInstance().lookup(IArapBillPubQueryService.class)).isExistBill(pk_orgs.toArray(new String[0]), checkAR, checkAP))) {
            ArrayList<String> error = new ArrayList<String>();
            if (checkAR) {
                error.add(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1265"));
            } else if (checkAP) {
                error.add(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1266"));
            }
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0863", null, error.toArray(new String[0])));
        }
    }
}

