/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.busilog.util.BusinessLogServiceUtil
 *  nc.bs.busilog.vo.BusinessLogContext
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Logger
 *  nc.itf.fi.pub.Currency
 *  nc.vo.arap.debttransfer.AggDebtTransferVO
 *  nc.vo.arap.debttransfer.DebtTransferVO
 *  nc.vo.arap.transaction.NumberFormat
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.List;
import nc.bs.arap.util.ArapBillVOUtils;
import nc.bs.busilog.util.BusinessLogServiceUtil;
import nc.bs.busilog.vo.BusinessLogContext;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Logger;
import nc.itf.fi.pub.Currency;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.debttransfer.AggDebtTransferVO;
import nc.vo.arap.debttransfer.DebtTransferVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.transaction.NumberFormat;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class ArapBusiLogUtils {
    public static void insertSmartBusiLogs(String id, String dateId, List<AggDebtTransferVO> aggdebtList) throws BusinessException {
        try {
            ArrayList<BusinessLogContext> listvo = new ArrayList<BusinessLogContext>();
            BusinessLogContext smartlog = new BusinessLogContext();
            smartlog.setBusiobjname(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0040"));
            StringBuffer logmsg = new StringBuffer(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0041"));
            int i = 0;
            for (AggDebtTransferVO vo : aggdebtList) {
                DebtTransferVO[] childrenVO;
                if (i++ >= 1) {
                    logmsg.append("###");
                }
                for (DebtTransferVO svo : childrenVO = (DebtTransferVO[])vo.getChildrenVO()) {
                    UFDouble money = svo.getMoney();
                    int MoneyDig = Currency.getCurrDigit((String)svo.getPk_currtype());
                    money = NumberFormat.onFormatRate((UFDouble)money, (int)MoneyDig);
                    logmsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0042") + svo.getBillno());
                    logmsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0043") + money);
                }
            }
            smartlog.setLogmsg(logmsg.toString());
            smartlog.setOrgpk_busiobj(InvocationInfoProxy.getInstance().getGroupId());
            smartlog.setPk_busiobj(id);
            smartlog.setPk_operation(dateId);
            smartlog.setTypepk_busiobj(id);
            listvo.add(smartlog);
            BusinessLogServiceUtil.insertBatchBusiLogAsynch(listvo);
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage());
        }
    }

    public static void insertSmartBusiLogs(String id, String dateId, String[] billnos) throws BusinessException {
        try {
            ArrayList<BusinessLogContext> listvo = new ArrayList<BusinessLogContext>();
            BusinessLogContext smartlog = new BusinessLogContext();
            smartlog.setBusiobjname(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0044"));
            StringBuffer logmsg = new StringBuffer(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0045"));
            int i = 0;
            for (String billno : billnos) {
                if (i++ >= 1) {
                    logmsg.append(",");
                }
                logmsg.append(billno);
            }
            smartlog.setLogmsg(logmsg.toString());
            smartlog.setOrgpk_busiobj(InvocationInfoProxy.getInstance().getGroupId());
            smartlog.setPk_busiobj(id);
            smartlog.setPk_operation(dateId);
            smartlog.setTypepk_busiobj(id);
            listvo.add(smartlog);
            BusinessLogServiceUtil.insertBatchBusiLogAsynch(listvo);
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage());
        }
    }

    public static void insertSmartBusiLogs(String action, BaseAggVO bill, BaseAggVO billOld, String busiObjCode) throws BusinessException {
        try {
            BaseAggVO billOld_clone;
            ArrayList<BusinessLogContext> listvo = new ArrayList<BusinessLogContext>();
            if (null == bill || null == bill.getHeadVO() || null == bill.getChildrenVO() || bill.getChildrenVO().length == 0) {
                return;
            }
            BaseAggVO bill_clone = (BaseAggVO)((Object)bill.clone());
            BusinessLogContext createLogvo = ArapBusiLogUtils.createLogvo(action, bill_clone, billOld_clone = (BaseAggVO)((Object)billOld.clone()), busiObjCode);
            if (createLogvo != null) {
                listvo.add(createLogvo);
            }
            BusinessLogServiceUtil.insertBatchBusiLogAsynch(listvo);
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage());
        }
    }

    public static void insertSmartBusiLogs(String action, Object[] bills, String busiObjCode) throws BusinessException {
        try {
            ArrayList<BusinessLogContext> listvo = new ArrayList<BusinessLogContext>();
            for (Object obj : bills) {
                BaseAggVO bill = (BaseAggVO)((Object)obj);
                if (null == bill || null == bill.getHeadVO() || null == bill.getChildrenVO() || bill.getChildrenVO().length == 0) continue;
                listvo.add(ArapBusiLogUtils.createLogvo(action, bill, null, busiObjCode));
            }
            BusinessLogServiceUtil.insertBatchBusiLogAsynch(listvo);
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage());
        }
    }

    private static BusinessLogContext createLogvo(String action, BaseAggVO bill, BaseAggVO oldvo, String busiObjCode) throws BusinessException {
        String billType = bill.getHeadVO().getPk_billtype();
        String billNo = bill.getHeadVO().getBillno();
        String busiObjPk = ArapBusiLogUtils.getBusiObjPkByCode(busiObjCode);
        String typepk_busiobj = ArapBusiLogUtils.getMdIdByBillType(billType);
        String pk_org = bill.getHeadVO().getPk_org();
        String md_name = ArapBusiLogUtils.getMdNameByBillType(billType);
        BusinessLogContext smartlog = new BusinessLogContext();
        smartlog.setBusiobjcode(billNo);
        smartlog.setBusiobjname(md_name);
        boolean isEdit = action.equals(ArapConstant.ARAP_ACTION_EDIT);
        ArapBillVOUtils.dealVoScaleAndHtb(oldvo);
        ArapBillVOUtils.dealVoScaleAndHtb(bill);
        if (isEdit) {
            smartlog.setBusiobjvo((Object)bill);
            smartlog.setOldbusiobjvo((Object)oldvo);
        } else {
            smartlog.setBusiobjvo((Object)oldvo);
            smartlog.setOldbusiobjvo((Object)bill);
        }
        smartlog.setOrgpk_busiobj(pk_org);
        smartlog.setPk_busiobj(busiObjPk);
        smartlog.setPk_operation(ArapBusiLogUtils.getPk_operByBillType(bill.getHeadVO().getPk_billtype(), isEdit));
        smartlog.setTypepk_busiobj(typepk_busiobj);
        return smartlog;
    }

    private static String getPk_operByBillType(String billType, boolean ismodify) {
        String mdId = null;
        if ("F0".equals(billType)) {
            mdId = ismodify ? "aed17704-f223-47db-ab82-b67908474682" : "660e2476-34f6-471c-a051-190c44f92a5f";
        } else if ("F1".equals(billType)) {
            mdId = ismodify ? "d61a79cd-f3f1-4a11-b8bc-1cdddff655fe" : "31fbd837-75ca-4dc3-b4b4-2fbe049a45d7";
        } else if ("F2".equals(billType)) {
            mdId = ismodify ? "82ae4c94-7309-42f8-997e-abc8ecd1e1a9" : "768402b2-80be-4cec-a6db-b15aaff3a480";
        } else if ("F3".equals(billType)) {
            mdId = ismodify ? "ffa475ab-f4e2-49f6-b5f9-8e7b5ed5de34" : "87cb101a-b51d-4451-9c53-23da98ac1d46";
        }
        return mdId;
    }

    private static String getMdIdByBillType(String billType) {
        String mdId = null;
        if ("F0".equals(billType)) {
            mdId = ArapConstant.ARAP_MDID_RECBILL;
        } else if ("F1".equals(billType)) {
            mdId = ArapConstant.ARAP_MDID_PAYABLEBILL;
        } else if ("F2".equals(billType)) {
            mdId = ArapConstant.ARAP_MDID_GATHERBILL;
        } else if ("F3".equals(billType)) {
            mdId = ArapConstant.ARAP_MDID_PAYBILL;
        }
        return mdId;
    }

    private static boolean reserveOldCodes() {
        return true;
    }

    private static String getBusiObjPkByCode(String busiObjCode) {
        String busiObjId = null;
        if (ArapConstant.ARAP_FUNCODE_RECBILL.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_RECBILL;
        } else if (ArapConstant.ARAP_FUNCODE_GATHERBILL.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_GATHERBILL;
        } else if (ArapConstant.ARAP_FUNCODE_PAYABLEBILL.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_PAYABLEBILL;
        } else if (ArapConstant.ARAP_FUNCODE_PAYBILL.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_PAYBILL;
        } else if (ArapConstant.ARAP_FUNCODE_RECBILL_R.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_RECBILL_R;
        } else if (ArapConstant.ARAP_FUNCODE_RECBILL_M.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_RECBILL_M;
        } else if (ArapConstant.ARAP_FUNCODE_RECBILL_C.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_RECBILL_C;
        } else if (ArapConstant.ARAP_FUNCODE_RECBILL_I.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_RECBILL_I;
        } else if (ArapConstant.ARAP_FUNCODE_GATHERBILL_R.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_GATHERBILL_R;
        } else if (ArapConstant.ARAP_FUNCODE_GATHERBILL_M.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_GATHERBILL_M;
        } else if (ArapConstant.ARAP_FUNCODE_GATHERBILL_C.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_GATHERBILL_C;
        } else if (ArapConstant.ARAP_FUNCODE_GATHERBILL_I.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_GATHERBILL_I;
        } else if (ArapConstant.ARAP_FUNCODE_PAYABLEBILL_R.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_PAYABLEBILL_R;
        } else if (ArapConstant.ARAP_FUNCODE_PAYABLEBILL_M.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_PAYABLEBILL_M;
        } else if (ArapConstant.ARAP_FUNCODE_PAYABLEBILL_C.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_PAYABLEBILL_C;
        } else if (ArapConstant.ARAP_FUNCODE_PAYABLEBILL_I.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_PAYABLEBILL_I;
        } else if (ArapConstant.ARAP_FUNCODE_PAYBILL_R.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_PAYBILL_R;
        } else if (ArapConstant.ARAP_FUNCODE_PAYBILL_M.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_PAYBILL_M;
        } else if (ArapConstant.ARAP_FUNCODE_PAYBILL_C.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_PAYBILL_C;
        } else if (ArapConstant.ARAP_FUNCODE_PAYBILL_I.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_PAYBILL_I;
        } else if (ArapConstant.ARAP_FUNCODE_ARAP.equals(busiObjCode)) {
            busiObjId = ArapConstant.ARAP_FUNID_ARAP;
        }
        return busiObjId;
    }

    private static String getMdNameByBillType(String billType) {
        ArapConstant constant = new ArapConstant();
        String mdName = null;
        if ("F0".equals(billType)) {
            mdName = constant.ARAP_MDNAME_RECBILL;
        } else if ("F1".equals(billType)) {
            mdName = constant.ARAP_MDNAME_PAYABLEBILL;
        } else if ("F2".equals(billType)) {
            mdName = constant.ARAP_MDNAME_GATHERBILL;
        } else if ("F3".equals(billType)) {
            mdName = constant.ARAP_MDNAME_PAYBILL;
        }
        return mdName;
    }
}

