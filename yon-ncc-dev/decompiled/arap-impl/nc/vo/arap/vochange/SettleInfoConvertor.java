/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.gathering.GatheringBillItemVO
 *  nc.vo.arap.gathering.GatheringBillVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.pay.PayBillItemVO
 *  nc.vo.arap.pay.PayBillVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$Direction
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.cmp.settlement.SettleEnumCollection$Direction
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.cmp.settlement.SettlementBodyVO
 *  nc.vo.cmp.settlement.SettlementHeadVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.ISuperVO
 */
package nc.vo.arap.vochange;

import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.gathering.GatheringBillItemVO;
import nc.vo.arap.gathering.GatheringBillVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.arap.pay.PayBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.cmp.settlement.SettleEnumCollection;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.cmp.settlement.SettlementBodyVO;
import nc.vo.cmp.settlement.SettlementHeadVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;

public class SettleInfoConvertor {
    public static AggGatheringBillVO[] convertF2BusiAggToMeta(SettlementAggVO[] settlevos, String trade_type) throws BusinessException {
        if (settlevos == null || settlevos.length < 1) {
            throw new IllegalArgumentException("settlevos are null or length of  settlevos is 0");
        }
        AggGatheringBillVO[] billAggVOs = new AggGatheringBillVO[settlevos.length];
        for (int index = 0; index < settlevos.length; ++index) {
            SettlementAggVO settAggVO = settlevos[index];
            SettlementHeadVO settHeadVO = (SettlementHeadVO)settAggVO.getParentVO();
            billAggVOs[index] = new AggGatheringBillVO();
            GatheringBillVO billVO = new GatheringBillVO();
            billVO.setPk_billtype(settHeadVO.getPk_billtype());
            billVO.setPk_tradetype(settHeadVO.getTradertypecode());
            billVO.setBillno(settHeadVO.getBillcode());
            billVO.setPk_gatherbill(settHeadVO.getPk_settlement());
            billVO.setModifier(settHeadVO.getModifier());
            billVO.setBillmaker(settHeadVO.getCreator());
            billVO.setBilldate(settHeadVO.getBusi_billdate());
            billVO.setApprover(settHeadVO.getPk_auditor() == null ? null : settHeadVO.getPk_auditor());
            billVO.setMoney(settHeadVO.getPrimal());
            billVO.setLocal_money(settHeadVO.getOrglocal());
            billVO.setPk_org(settHeadVO.getPk_org());
            billVO.setPk_group(settHeadVO.getPk_group());
            billVO.setModifier(settHeadVO.getModifier());
            billVO.setBillstatus(BillEnumCollection.BillSatus.TEMPEORARY.VALUE);
            billVO.setModifiedtime(settHeadVO.getModifiedtime());
            billVO.setCreator(settHeadVO.getCreator());
            billVO.setCreationtime(settHeadVO.getCreationtime());
            billVO.setPk_tradetype(trade_type);
            billVO.setBillclass("sk");
            billVO.setPk_billtype("F2");
            billVO.setStatus(2);
            billVO.setSrc_syscode(BillEnumCollection.FromSystem.CMP.VALUE);
            billAggVOs[index].setParent((ISuperVO)billVO);
            SettlementBodyVO[] settBodyVOs = (SettlementBodyVO[])settAggVO.getChildrenVO();
            GatheringBillItemVO[] billDtlVOs = new GatheringBillItemVO[settBodyVOs.length];
            for (int j = 0; j < settBodyVOs.length; ++j) {
                billDtlVOs[j] = new GatheringBillItemVO();
                SettlementBodyVO detail = settBodyVOs[j];
                GatheringBillItemVO billitemVO = billDtlVOs[j];
                billitemVO.setObjtype(settBodyVOs[j].getTradertype());
                billitemVO.setBillno(detail.getBillcode());
                billitemVO.setBilldate(detail.getBilldate());
                billitemVO.setDirection(Integer.valueOf(SettleInfoConvertor.getDirection(detail)));
                billitemVO.setRate(detail.getLocalrate());
                billitemVO.setScomment(detail.getMemo());
                billitemVO.setCheckno(detail.getNotenumber());
                billitemVO.setMoney_cr(detail.getReceive());
                billitemVO.setLocal_money_cr(detail.getReceivelocal());
                billitemVO.setGroupcrebit(detail.getGroupreceivelocal());
                billitemVO.setGroupbalance(detail.getGroupreceivelocal());
                billitemVO.setGrouprate(detail.getGrouprate());
                billitemVO.setGlobalcrebit(detail.getGlobalreceivelocal());
                billitemVO.setGlobalbalance(detail.getGlobalreceivelocal());
                billitemVO.setGlobalrate(detail.getGlobalrate());
                billitemVO.setRecaccount(detail.getPk_account());
                billitemVO.setPayaccount(detail.getPk_oppaccount());
                billitemVO.setTop_billid(settHeadVO.getPrimaryKey());
                billitemVO.setTop_itemid(detail.getPrimaryKey());
                billitemVO.setTop_billtype(detail.getPk_billtype());
                billitemVO.setPk_balatype(detail.getPk_balatype());
                billitemVO.setPk_currtype(detail.getPk_currtype());
                billitemVO.setPk_group(detail.getPk_group());
                billitemVO.setPk_org(detail.getPk_org());
                billitemVO.setPk_org_v(billVO.getPk_org_v());
                billitemVO.setStatus(2);
                billitemVO.setPk_billtype("F2");
                billitemVO.setPk_tradetype(trade_type);
                billitemVO.setBillclass("sk");
                billitemVO.setBankrelated_code(detail.getBankrelated_code());
                billitemVO.setCheckno(detail.getNotenumber());
                billitemVO.setChecktype(detail.getPk_notetype());
                billitemVO.setCheckdirection(String.valueOf(detail.getNotedirection()));
                billitemVO.setRowno(Integer.valueOf(j));
                billitemVO.setDef1(detail.getDef1());
                billitemVO.setDef2(detail.getDef2());
                billitemVO.setDef3(detail.getDef3());
                billitemVO.setDef4(detail.getDef4());
                billitemVO.setDef5(detail.getDef5());
                billitemVO.setDef6(detail.getDef6());
                billitemVO.setDef7(detail.getDef7());
                billitemVO.setDef8(detail.getDef8());
                billitemVO.setDef9(detail.getDef9());
                billitemVO.setDef10(detail.getDef10());
                billitemVO.setDef11(detail.getDef11());
                billitemVO.setDef12(detail.getDef12());
                billitemVO.setDef13(detail.getDef14());
                billitemVO.setDef15(detail.getDef15());
                billitemVO.setDef16(detail.getDef17());
                billitemVO.setDef18(detail.getDef18());
                billitemVO.setDef19(detail.getDef19());
                billitemVO.setDef20(detail.getDef20());
                billitemVO.setProject(detail.getPk_job());
                billitemVO.setCashitem(detail.getPk_cashflow());
                billitemVO.setMaterial(detail.getPk_invbasdoc());
            }
            billAggVOs[index].setChildrenVO((CircularlyAccessibleValueObject[])billDtlVOs);
            billAggVOs[index].setSettlementInfo(settlevos[index]);
        }
        return billAggVOs;
    }

    public static AggPayBillVO[] convertF3BusiAggToMeta(SettlementAggVO[] settlevos, String trade_type) {
        if (settlevos == null || settlevos.length < 1) {
            throw new IllegalArgumentException("settlevos are null or length of  settlevos is 0");
        }
        AggPayBillVO[] billAggVOs = new AggPayBillVO[settlevos.length];
        for (int index = 0; index < settlevos.length; ++index) {
            SettlementAggVO settAggVO = settlevos[index];
            SettlementHeadVO settHeadVO = (SettlementHeadVO)settAggVO.getParentVO();
            billAggVOs[index] = new AggPayBillVO();
            PayBillVO billVO = new PayBillVO();
            billVO.setPk_billtype(settHeadVO.getPk_billtype());
            billVO.setPk_tradetype(settHeadVO.getTradertypecode());
            billVO.setBillno(settHeadVO.getBillcode());
            billVO.setPk_paybill(settHeadVO.getPk_settlement());
            billVO.setModifier(settHeadVO.getModifier());
            billVO.setBillmaker(settHeadVO.getCreator());
            billVO.setBilldate(settHeadVO.getBusi_billdate());
            billVO.setApprover(settHeadVO.getPk_auditor() == null ? null : settHeadVO.getPk_auditor());
            billVO.setMoney(settHeadVO.getPrimal());
            billVO.setLocal_money(settHeadVO.getOrglocal());
            billVO.setPk_org(settHeadVO.getPk_org());
            billVO.setPk_group(settHeadVO.getPk_group());
            billVO.setModifier(settHeadVO.getModifier());
            billVO.setBillstatus(BillEnumCollection.BillSatus.TEMPEORARY.VALUE);
            billVO.setModifiedtime(settHeadVO.getModifiedtime());
            billVO.setCreator(settHeadVO.getCreator());
            billVO.setCreationtime(settHeadVO.getCreationtime());
            billVO.setPk_tradetype(trade_type);
            billVO.setBillclass("fk");
            billVO.setPk_billtype("F3");
            billVO.setStatus(2);
            billVO.setSrc_syscode(BillEnumCollection.FromSystem.CMP.VALUE);
            billAggVOs[index].setParent((ISuperVO)billVO);
            SettlementBodyVO[] settBodyVOs = (SettlementBodyVO[])settAggVO.getChildrenVO();
            PayBillItemVO[] billDtlVOs = new PayBillItemVO[settBodyVOs.length];
            for (int j = 0; j < settBodyVOs.length; ++j) {
                billDtlVOs[j] = new PayBillItemVO();
                SettlementBodyVO detail = settBodyVOs[j];
                PayBillItemVO billitemVO = billDtlVOs[j];
                billitemVO.setObjtype(settBodyVOs[j].getTradertype());
                billitemVO.setBillno(detail.getBillcode());
                billitemVO.setBilldate(detail.getBilldate());
                billitemVO.setDirection(Integer.valueOf(SettleInfoConvertor.getDirection(detail)));
                billitemVO.setRate(detail.getLocalrate());
                billitemVO.setScomment(detail.getMemo());
                billitemVO.setCheckno(detail.getNotenumber());
                billitemVO.setMoney_de(detail.getPay());
                billitemVO.setLocal_money_de(detail.getPaylocal());
                billitemVO.setGroupdebit(detail.getGrouppaylocal());
                billitemVO.setGroupbalance(detail.getGrouppaylocal());
                billitemVO.setGrouprate(detail.getGrouprate());
                billitemVO.setGlobaldebit(detail.getGlobalpaylocal());
                billitemVO.setGlobalbalance(detail.getGlobalpaylocal());
                billitemVO.setGlobalrate(detail.getGlobalrate());
                billitemVO.setRecaccount(detail.getPk_account());
                billitemVO.setPayaccount(detail.getPk_oppaccount());
                billitemVO.setTop_billid(settHeadVO.getPrimaryKey());
                billitemVO.setTop_itemid(detail.getPrimaryKey());
                billitemVO.setTop_billtype(detail.getPk_billtype());
                billitemVO.setPk_balatype(detail.getPk_balatype());
                billitemVO.setPk_currtype(detail.getPk_currtype());
                billitemVO.setPk_group(detail.getPk_group());
                billitemVO.setPk_org(detail.getPk_org());
                billitemVO.setPk_org_v(billVO.getPk_org_v());
                billitemVO.setStatus(2);
                billitemVO.setPk_billtype("F3");
                billitemVO.setPk_tradetype(trade_type);
                billitemVO.setBillclass("fk");
                billitemVO.setBankrelated_code(detail.getBankrelated_code());
                billitemVO.setCheckno(detail.getNotenumber());
                billitemVO.setChecktype(detail.getPk_notetype());
                billitemVO.setChecktype(detail.getPk_notetype());
                billitemVO.setCheckdirection(String.valueOf(detail.getNotedirection()));
                billitemVO.setRowno(Integer.valueOf(j));
                billitemVO.setDef1(detail.getDef1());
                billitemVO.setDef2(detail.getDef2());
                billitemVO.setDef3(detail.getDef3());
                billitemVO.setDef4(detail.getDef4());
                billitemVO.setDef5(detail.getDef5());
                billitemVO.setDef6(detail.getDef6());
                billitemVO.setDef7(detail.getDef7());
                billitemVO.setDef8(detail.getDef8());
                billitemVO.setDef9(detail.getDef9());
                billitemVO.setDef10(detail.getDef10());
                billitemVO.setDef11(detail.getDef11());
                billitemVO.setDef12(detail.getDef12());
                billitemVO.setDef13(detail.getDef14());
                billitemVO.setDef15(detail.getDef15());
                billitemVO.setDef16(detail.getDef17());
                billitemVO.setDef18(detail.getDef18());
                billitemVO.setDef19(detail.getDef19());
                billitemVO.setDef20(detail.getDef20());
                billitemVO.setProject(detail.getPk_job());
                billitemVO.setCashitem(detail.getPk_cashflow());
                billitemVO.setMaterial(detail.getPk_invbasdoc());
            }
            billAggVOs[index].setChildrenVO((CircularlyAccessibleValueObject[])billDtlVOs);
            billAggVOs[index].setSettlementInfo(settlevos[index]);
        }
        return billAggVOs;
    }

    private static int getDirection(SettlementBodyVO detail) {
        Integer i = detail.getDirection();
        if (i.equals(SettleEnumCollection.Direction.REC.VALUE)) {
            return BillEnumCollection.Direction.CREDIT.VALUE;
        }
        return BillEnumCollection.Direction.DEBIT.VALUE;
    }
}

