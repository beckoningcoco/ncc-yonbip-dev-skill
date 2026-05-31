/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.tb.control.IBusiSysExecDataProvider
 *  nc.itf.tb.control.IBusiSysGroupReg
 *  nc.itf.tb.control.IBusiSysNCcloudReg
 *  nc.itf.tb.control.IDateType
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.tb.control.ControlBillType
 *  nc.vo.tb.control.ControlObjectType
 *  nccloud.base.exception.ExceptionUtils
 *  nccloud.pubitf.platform.workbench.IAppPage
 *  nccloud.putitf.riart.billtype.IBilltypeService
 */
package nc.vo.arap.ntb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.bill.IArapBillService;
import nc.itf.tb.control.IBusiSysExecDataProvider;
import nc.itf.tb.control.IBusiSysGroupReg;
import nc.itf.tb.control.IBusiSysNCcloudReg;
import nc.itf.tb.control.IDateType;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.ntb.ArapBusiSysExecDataProvider;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.tb.control.ControlBillType;
import nc.vo.tb.control.ControlObjectType;
import nccloud.base.exception.ExceptionUtils;
import nccloud.pubitf.platform.workbench.IAppPage;
import nccloud.putitf.riart.billtype.IBilltypeService;

public class ArapBusiSysReg
implements IBusiSysGroupReg,
IDateType,
IBusiSysNCcloudReg {
    private HashMap<String, String> ctrlBillActions = new HashMap();

    public ArrayList<ControlBillType> getBillType() {
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        return this.getBillType(pk_group);
    }

    public ArrayList<ControlBillType> getBillType(String pk_group) {
        ArrayList<ControlBillType> ctrlBillType = new ArrayList<ControlBillType>();
        ArrayList<String> orgTypes = new ArrayList<String>();
        orgTypes.add(ArapConstant.ARAP_NTB_PK_ORG);
        orgTypes.add(ArapConstant.ARAP_NTB_PK_PCORG);
        orgTypes.add(ArapConstant.ARAP_NTB_PK_PROJECT);
        orgTypes.add(ArapConstant.ARAP_NTB_VIRTUALORG);
        ArapConstant constant = new ArapConstant();
        BilltypeVO[] billtypeVOs = null;
        String whereCond = " parentbilltype in ('F0','F1','F2','F3') and pk_group = '" + pk_group + "'";
        try {
            billtypeVOs = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryBillTypeByWhereStr(whereCond);
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        ArrayList<BilltypeVO> billtypeF0 = new ArrayList<BilltypeVO>();
        ArrayList<BilltypeVO> billtypeF1 = new ArrayList<BilltypeVO>();
        ArrayList<BilltypeVO> billtypeF2 = new ArrayList<BilltypeVO>();
        ArrayList<BilltypeVO> billtypeF3 = new ArrayList<BilltypeVO>();
        if (billtypeVOs != null) {
            for (BilltypeVO billtype : billtypeVOs) {
                if ("F0".equals(billtype.getParentbilltype())) {
                    billtypeF0.add(billtype);
                    continue;
                }
                if ("F1".equals(billtype.getParentbilltype())) {
                    billtypeF1.add(billtype);
                    continue;
                }
                if ("F2".equals(billtype.getParentbilltype())) {
                    billtypeF2.add(billtype);
                    continue;
                }
                if (!"F3".equals(billtype.getParentbilltype())) continue;
                billtypeF3.add(billtype);
            }
        }
        ControlBillType f0ControlBillType = new ControlBillType();
        f0ControlBillType.setPk_billType("F0");
        f0ControlBillType.setBillType_code("F0");
        f0ControlBillType.setBillType_name(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0158"));
        f0ControlBillType.setReadyBillType(true);
        f0ControlBillType.setRunBillType(true);
        f0ControlBillType.setPk_orgs(orgTypes);
        ctrlBillType.add(f0ControlBillType);
        ctrlBillType.addAll(this.getctrlBillType(billtypeF0, orgTypes));
        ControlBillType f1ControlBillType = new ControlBillType();
        f1ControlBillType.setPk_billType("F1");
        f1ControlBillType.setBillType_code("F1");
        f1ControlBillType.setBillType_name(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0160"));
        f1ControlBillType.setReadyBillType(true);
        f1ControlBillType.setRunBillType(true);
        f1ControlBillType.setPk_orgs(orgTypes);
        ctrlBillType.add(f1ControlBillType);
        ctrlBillType.addAll(this.getctrlBillType(billtypeF1, orgTypes));
        ControlBillType f2ControlBillType = new ControlBillType();
        f2ControlBillType.setPk_billType("F2");
        f2ControlBillType.setBillType_code("F2");
        f2ControlBillType.setBillType_name(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0159"));
        f2ControlBillType.setReadyBillType(false);
        f2ControlBillType.setRunBillType(true);
        f2ControlBillType.setPk_orgs(orgTypes);
        ctrlBillType.add(f2ControlBillType);
        ctrlBillType.addAll(this.getctrlBillType(billtypeF2, orgTypes));
        ControlBillType f3ControlBillType = new ControlBillType();
        f3ControlBillType.setPk_billType("F3");
        f3ControlBillType.setBillType_code("F3");
        f3ControlBillType.setBillType_name(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0161"));
        f3ControlBillType.setReadyBillType(true);
        f3ControlBillType.setRunBillType(true);
        f3ControlBillType.setPk_orgs(orgTypes);
        ctrlBillType.add(f3ControlBillType);
        ctrlBillType.addAll(this.getctrlBillType(billtypeF3, orgTypes));
        ControlBillType virtualBillTypeBal = new ControlBillType();
        virtualBillTypeBal.setPk_billType(constant.ARAP_NTB_BILLTYPE_KEY_BALANCE);
        virtualBillTypeBal.setBillType_code(constant.ARAP_NTB_BILLTYPE_KEY_BALANCE);
        virtualBillTypeBal.setBillType_name(constant.ARAP_NTB_BILLTYPE_VAULE_BALANCE);
        virtualBillTypeBal.setControlByParentBill(false);
        virtualBillTypeBal.setPk_orgs(orgTypes);
        virtualBillTypeBal.setRunBillType(false);
        virtualBillTypeBal.setReadyBillType(false);
        virtualBillTypeBal.setUseControl(false);
        virtualBillTypeBal.setUseUfind(true);
        ctrlBillType.add(virtualBillTypeBal);
        return ctrlBillType;
    }

    private List<ControlBillType> getctrlBillType(List<BilltypeVO> billtype, ArrayList<String> orgTypes) {
        ArrayList<ControlBillType> list = new ArrayList<ControlBillType>();
        for (BilltypeVO bt : billtype) {
            ControlBillType ctlBillType = new ControlBillType();
            ctlBillType.setPk_billType(bt.getPk_billtypecode());
            ctlBillType.setBillType_code(bt.getPk_billtypecode());
            ctlBillType.setBillType_name(bt.getBilltypenameOfCurrLang());
            ctlBillType.setParentBillType(bt.getParentbilltype());
            ctlBillType.setControlByParentBill(true);
            ctlBillType.setPk_orgs(orgTypes);
            ctlBillType.setActionList(this.getCtrlBillActions());
            ctlBillType.setRunBillType(true);
            if ("F2".equals(bt.getParentbilltype())) {
                ctlBillType.setReadyBillType(false);
            } else {
                ctlBillType.setReadyBillType(true);
            }
            ctlBillType.setUseControl(true);
            ctlBillType.setUseUfind(true);
            list.add(ctlBillType);
        }
        return list;
    }

    private HashMap<String, String> getCtrlBillActions() {
        ArapConstant constant = new ArapConstant();
        if (this.ctrlBillActions.size() == 0) {
            this.ctrlBillActions.put(constant.ARAP_NTB_SAVE_KEY, constant.ARAP_NTB_SAVE_VALUE);
            this.ctrlBillActions.put(constant.ARAP_NTB_EFFECT_KEY, constant.ARAP_NTB_EFFECT_VALUE);
            this.ctrlBillActions.put(constant.ARAP_NTB_UNEFFECT_KEY, constant.ARAP_NTB_UNEFFECT_VALUE);
            this.ctrlBillActions.put(constant.ARAP_NTB_DELETE_KEY, constant.ARAP_NTB_DELETE_VALUE);
        }
        return this.ctrlBillActions;
    }

    public String getBusiSysDesc() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0608");
    }

    public String getBusiSysID() {
        return ArapConstant.SYS_ID;
    }

    public String[] getBusiType() {
        return null;
    }

    public String[] getBusiTypeDesc() {
        return null;
    }

    public String[] getControlableDirections() {
        return new String[]{BillEnumCollection.Direction.DEBIT.VALUE.toString(), BillEnumCollection.Direction.CREDIT.VALUE.toString()};
    }

    public String[] getControlableDirectionsDesc() {
        return new String[]{NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0609"), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0610")};
    }

    private ArrayList<ControlObjectType> _getControlableObjects(String billType) {
        ArrayList<ControlObjectType> ctlList = new ArrayList<ControlObjectType>();
        ArapConstant constant = new ArapConstant();
        ControlObjectType occur = new ControlObjectType(constant.ARAP_NTB_CTL_KEY, constant.ARAP_NTB_CTL_KEY, constant.ARAP_NTB_CTL_VALUE);
        occur.setUseControl(true);
        occur.setUseUfind(true);
        ArrayList<ControlObjectType> ctlListChild = new ArrayList<ControlObjectType>();
        ControlObjectType objchild1 = new ControlObjectType(constant.ARAP_NTB_CTL_VALUE_KEY, constant.ARAP_NTB_CTL_VALUE_KEY, constant.ARAP_NTB_CTL_VALUE_NAME);
        objchild1.setUseControl(true);
        objchild1.setUseUfind(true);
        ctlListChild.add(objchild1);
        List parentbilltype = null;
        if (!StringUtil.isEmptyWithTrim((String)billType)) {
            String[] billtypes = billType.split("#");
            String pk_group = InvocationInfoProxy.getInstance().getGroupId();
            try {
                String sql = " select distinct PARENTBILLTYPE from BD_BILLTYPE where " + SqlUtils.getInStr((String)"PK_BILLTYPECODE", (String[])billtypes, (boolean)true) + " and pk_group = '" + pk_group + "'";
                parentbilltype = (List)((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
            }
            catch (BusinessException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        if (parentbilltype.contains("F0") || parentbilltype.contains("F1") || parentbilltype.contains("F2") || parentbilltype.contains("F3")) {
            ControlObjectType objchild2 = new ControlObjectType(constant.ARAP_NTB_CTL_NOTAX_KEY, constant.ARAP_NTB_CTL_NOTAX_KEY, constant.ARAP_NTB_CTL_NOTAX_NAME);
            objchild2.setUseControl(true);
            objchild2.setUseUfind(true);
            ctlListChild.add(objchild2);
            ControlObjectType objchild3 = new ControlObjectType(constant.ARAP_NTB_CTL_TAX_KEY, constant.ARAP_NTB_CTL_TAX_KEY, constant.ARAP_NTB_CTL_TAX_NAME);
            objchild3.setUseControl(true);
            objchild3.setUseUfind(true);
            ctlListChild.add(objchild3);
        }
        occur.setCotMember(ctlListChild.toArray(new ControlObjectType[0]));
        ctlList.add(occur);
        return ctlList;
    }

    public ArrayList<ControlObjectType> getControlableObjects() {
        ArrayList<ControlObjectType> ctlList = new ArrayList<ControlObjectType>();
        ArapConstant constant = new ArapConstant();
        ControlObjectType occur = new ControlObjectType(constant.ARAP_NTB_CTL_KEY, constant.ARAP_NTB_CTL_KEY, constant.ARAP_NTB_CTL_VALUE);
        occur.setUseControl(true);
        occur.setUseUfind(true);
        ArrayList<ControlObjectType> ctlListChild = new ArrayList<ControlObjectType>();
        ControlObjectType objchild1 = new ControlObjectType(constant.ARAP_NTB_CTL_VALUE_KEY, constant.ARAP_NTB_CTL_VALUE_KEY, constant.ARAP_NTB_CTL_VALUE_NAME);
        objchild1.setUseControl(true);
        objchild1.setUseUfind(true);
        ctlListChild.add(objchild1);
        ControlObjectType notax = new ControlObjectType(constant.ARAP_NTB_CTL_NOTAX_KEY, constant.ARAP_NTB_CTL_NOTAX_KEY, constant.ARAP_NTB_CTL_NOTAX_NAME);
        notax.setUseControl(true);
        notax.setUseUfind(true);
        ctlListChild.add(notax);
        ControlObjectType tax = new ControlObjectType(constant.ARAP_NTB_CTL_TAX_KEY, constant.ARAP_NTB_CTL_TAX_KEY, constant.ARAP_NTB_CTL_TAX_NAME);
        tax.setUseControl(true);
        tax.setUseUfind(true);
        ctlListChild.add(tax);
        occur.setCotMember(ctlListChild.toArray(new ControlObjectType[0]));
        ctlList.add(occur);
        ControlObjectType ctrlCustomer = new ControlObjectType(constant.ARAP_NTB_CTRLOBJ_KEY_CUSTOMER, constant.ARAP_NTB_CTRLOBJ_KEY_CUSTOMER, constant.ARAP_NTB_CTRLOBJ_VALUE_CUSTOMER);
        ctrlCustomer.setUseControl(false);
        ctrlCustomer.setUseUfind(true);
        ctlList.add(ctrlCustomer);
        ControlObjectType ctrlSupplier = new ControlObjectType(constant.ARAP_NTB_CTRLOBJ_KEY_SUPPLIER, constant.ARAP_NTB_CTRLOBJ_KEY_SUPPLIER, constant.ARAP_NTB_CTRLOBJ_VALUE_SUPPLIER);
        ctrlSupplier.setUseControl(false);
        ctrlSupplier.setUseUfind(true);
        ctlList.add(ctrlSupplier);
        ControlObjectType ctrlDept = new ControlObjectType(constant.ARAP_NTB_CTRLOBJ_KEY_DEPT, constant.ARAP_NTB_CTRLOBJ_KEY_DEPT, constant.ARAP_NTB_CTRLOBJ_VALUE_DEPT);
        ctrlDept.setUseControl(false);
        ctrlDept.setUseUfind(true);
        ctlList.add(ctrlDept);
        ControlObjectType ctrlBusiman = new ControlObjectType(constant.ARAP_NTB_CTRLOBJ_KEY_BUSIMAN, constant.ARAP_NTB_CTRLOBJ_KEY_BUSIMAN, constant.ARAP_NTB_CTRLOBJ_VALUE_BUSIMAN);
        ctrlBusiman.setUseControl(false);
        ctrlBusiman.setUseUfind(true);
        ctlList.add(ctrlBusiman);
        return ctlList;
    }

    public IBusiSysExecDataProvider getExecDataProvider() {
        return new ArapBusiSysExecDataProvider();
    }

    public boolean isBudgetControling() {
        return true;
    }

    public String getMainPkOrg() {
        return null;
    }

    public boolean isSupportMutiSelect() {
        return true;
    }

    public boolean isUseAccountDate(String arg0) {
        return false;
    }

    public String[] getDataType() {
        ArapConstant constant = new ArapConstant();
        return new String[]{constant.ARAP_NTB_BILLDATE_KEY, constant.ARAP_NTB_APPRDATE_KEY, constant.ARAP_NTB_EFFDATE_KEY};
    }

    public String[] getDateType(String billType) {
        ArapConstant constant = new ArapConstant();
        if (constant.ARAP_NTB_BILLTYPE_KEY_BALANCE.equals(billType)) {
            return new String[]{constant.ARAP_NTB_BILLDATE_KEY};
        }
        return new String[]{constant.ARAP_NTB_BILLDATE_KEY, constant.ARAP_NTB_APPRDATE_KEY, constant.ARAP_NTB_EFFDATE_KEY};
    }

    public String[] getDataTypeDesc() {
        ArapConstant constant = new ArapConstant();
        return new String[]{constant.ARAP_NTB_BILLDATE_VALUE, constant.ARAP_NTB_APPRDATE_VALUE, constant.ARAP_NTB_EFFDATE_VALUE};
    }

    public ArrayList<ControlObjectType> getControlableObjects(String billType) {
        ArrayList<ControlObjectType> ctrlObjList = new ArrayList<ControlObjectType>();
        ArapConstant constant = new ArapConstant();
        if (constant.ARAP_NTB_BILLTYPE_KEY_BALANCE.equals(billType)) {
            for (ControlObjectType ctrlObj : this.getControlableObjects()) {
                if (!constant.ARAP_NTB_CTRLOBJ_KEY_CUSTOMER.equals(ctrlObj.getM_pk_obj()) && !constant.ARAP_NTB_CTRLOBJ_KEY_SUPPLIER.equals(ctrlObj.getM_pk_obj()) && !constant.ARAP_NTB_CTRLOBJ_KEY_DEPT.equals(ctrlObj.getM_pk_obj()) && !constant.ARAP_NTB_CTRLOBJ_KEY_BUSIMAN.equals(ctrlObj.getM_pk_obj())) continue;
                ctrlObjList.add(ctrlObj);
            }
            return ctrlObjList;
        }
        return this._getControlableObjects(billType);
    }

    public String getLinkUrl(String billtype) {
        String url = null;
        ArapConstant constant = new ArapConstant();
        try {
            BilltypeVO billTypeVo;
            url = constant.ARAP_NTB_BILLTYPE_KEY_BALANCE.equals(billtype) ? ((IAppPage)NCLocator.getInstance().lookup(IAppPage.class)).queryPageUrl("20082005", "20082005_LIST") : ("F0".equals((billTypeVo = ((IBilltypeService)NCLocator.getInstance().lookup(IBilltypeService.class)).getBilltype(billtype)).getParentbilltype()) || "F2".equals(billTypeVo.getParentbilltype()) ? ((IAppPage)NCLocator.getInstance().lookup(IAppPage.class)).queryPageUrl("20062005", "20062005_LIST") : ((IAppPage)NCLocator.getInstance().lookup(IAppPage.class)).queryPageUrl("20082005", "20082005_LIST"));
        }
        catch (DAOException e) {
            ExceptionUtils.wrapException((Throwable)e);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrapException((Throwable)e);
        }
        return url;
    }

    public boolean getShowModel(String billtype) {
        return true;
    }

    public String getAppcode(String billtype) {
        String appCode = null;
        ArapConstant constant = new ArapConstant();
        try {
            BilltypeVO billTypeVo;
            appCode = constant.ARAP_NTB_BILLTYPE_KEY_BALANCE.equals(billtype) ? "20082005" : ("F0".equals((billTypeVo = ((IBilltypeService)NCLocator.getInstance().lookup(IBilltypeService.class)).getBilltype(billtype)).getParentbilltype()) || "F2".equals(billTypeVo.getParentbilltype()) ? "20062005" : "20082005");
        }
        catch (DAOException e) {
            ExceptionUtils.wrapException((Throwable)e);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrapException((Throwable)e);
        }
        return appCode;
    }

    public String getPagecode(String billtype) {
        String pageCode = null;
        ArapConstant constant = new ArapConstant();
        try {
            BilltypeVO billTypeVo;
            pageCode = constant.ARAP_NTB_BILLTYPE_KEY_BALANCE.equals(billtype) ? "20082005_LIST" : ("F0".equals((billTypeVo = ((IBilltypeService)NCLocator.getInstance().lookup(IBilltypeService.class)).getBilltype(billtype)).getParentbilltype()) || "F2".equals(billTypeVo.getParentbilltype()) ? "20062005_LIST" : "20082005_LIST");
        }
        catch (DAOException e) {
            ExceptionUtils.wrapException((Throwable)e);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrapException((Throwable)e);
        }
        return pageCode;
    }

    public String getBilltype(String billtype) {
        return billtype;
    }

    public String getAppType(String billtype) {
        return "1";
    }
}

