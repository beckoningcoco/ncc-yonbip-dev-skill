/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillUnEffectBatchBSAction
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.logging.Log
 *  nc.itf.fi.pub.SysInit
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nccloud.commons.lang.StringUtils
 */
package nc.impl.arap.outer;

import java.util.List;
import nc.bs.arap.actions.BillUnEffectBatchBSAction;
import nc.bs.arap.actions.CommPayAndGatherBSAction;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.logging.Log;
import nc.impl.arap.outer.ArapBusi4CMPServcie;
import nc.itf.fi.pub.SysInit;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nccloud.commons.lang.StringUtils;

public class ArapBusi4CMPServcieRec
extends ArapBusi4CMPServcie {
    @Override
    public void notify4HandSettle(List<String> idList, boolean isOpp, UFDate operateDate, String operator) throws BusinessException {
        ArapBillDAO billDAO = new ArapBillDAO();
        if (isOpp) {
            for (String key : idList) {
                BaseAggVO vo = billDAO.queryBillByPrimaryKey(key, "F2");
                this.unHandSettle(vo);
                vo = billDAO.queryBillByPrimaryKey(key, "F2");
                this.UneffectBill(vo);
            }
        } else {
            BaseAggVO[] vos = (BaseAggVO[])billDAO.queryBillByPrimaryKeys(idList.toArray(new String[0]), "F2");
            this.HandSettle(vos, operateDate, operator);
        }
    }

    private void UneffectBill(BaseAggVO vo) throws BusinessException {
        BaseBillVO parent = (BaseBillVO)vo.getParentVO();
        Integer effectstatus = parent.getEffectstatus();
        String pkOrg = parent.getPk_org();
        String SettlementOfSuccess = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0867");
        if (this.getCMPSysint(pkOrg).equals(SettlementOfSuccess) && BillEnumCollection.InureSign.OKINURE.VALUE.equals(effectstatus)) {
            parent.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
            new BillUnEffectBatchBSAction().updateVO((AggregatedValueObject[])new BaseAggVO[]{vo});
        }
    }

    private String getCMPSysint(String pkOrg) {
        String cmpSysinit = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0866");
        String ParameterError = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0868");
        try {
            cmpSysinit = SysInit.getParaString((String)pkOrg, (String)"CMP36");
        }
        catch (BusinessException e) {
            Log.getInstance(this.getClass()).error((Object)("CMP36" + ParameterError));
            cmpSysinit = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0866");
        }
        if (StringUtils.isEmpty((CharSequence)cmpSysinit)) {
            Log.getInstance(this.getClass()).error((Object)("CMP36" + ParameterError));
            cmpSysinit = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0866");
        }
        return cmpSysinit;
    }

    private void unHandSettle(BaseAggVO vo) throws BusinessException {
        new CommPayAndGatherBSAction().unPayed(vo.getHeadVO(), vo.getItems());
    }

    private void HandSettle(BaseAggVO[] vos, UFDate operateDate, String operator) throws BusinessException {
        for (BaseAggVO vo : vos) {
            new CommPayAndGatherBSAction().reciveFinish(vo.getHeadVO(), vo.getItems(), operateDate, operator);
        }
    }
}

