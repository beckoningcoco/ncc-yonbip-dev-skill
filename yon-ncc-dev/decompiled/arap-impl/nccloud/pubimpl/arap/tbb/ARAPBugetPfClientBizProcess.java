/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  itf.approvecenter.util.CloudPFBizRetObj
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.tb.control.IAccessableBusiVO
 *  nc.itf.tb.control.IBudgetControl
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.ntb.ArapAccessableBusiVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.pf.PfClientBizProcessContext
 *  nc.vo.tb.control.DataRuleVO
 *  nc.vo.tb.control.NtbCtlInfoVO
 *  nc.vo.wfengine.core.data.BasicType
 *  nc.vo.wfengine.core.data.DataField
 *  nccloud.itf.uap.pf.ICloudPFActionBizProcess
 */
package nccloud.pubimpl.arap.tbb;

import itf.approvecenter.util.CloudPFBizRetObj;
import java.util.ArrayList;
import java.util.List;
import nc.bs.framework.common.NCLocator;
import nc.itf.tb.control.IAccessableBusiVO;
import nc.itf.tb.control.IBudgetControl;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.ntb.ArapAccessableBusiVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.pf.PfClientBizProcessContext;
import nc.vo.tb.control.DataRuleVO;
import nc.vo.tb.control.NtbCtlInfoVO;
import nc.vo.wfengine.core.data.BasicType;
import nc.vo.wfengine.core.data.DataField;
import nccloud.itf.uap.pf.ICloudPFActionBizProcess;

public class ARAPBugetPfClientBizProcess
implements ICloudPFActionBizProcess {
    private String budgetControl_id = "isBudgetControl";
    private String budgetControl_name = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0183");

    public CloudPFBizRetObj execute(PfClientBizProcessContext context) {
        CloudPFBizRetObj result = new CloudPFBizRetObj();
        List argsList = context.getArgsList();
        Object billvo = context.getBillvo();
        if (argsList == null || argsList.size() == 0) {
            return result;
        }
        for (DataField df : argsList) {
            if (!this.budgetControl_id.equals(df.getName())) continue;
            String value = df.getInitialValue();
            if (value == null || !UFBoolean.valueOf((String)value.toString()).booleanValue()) break;
            NtbCtlInfoVO tpcontrolvo = null;
            try {
                tpcontrolvo = this.checkNtb((BaseAggVO)billvo);
            }
            catch (BusinessException e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
            StringBuffer controlMsg = new StringBuffer();
            String[] seminfos = null;
            if (tpcontrolvo != null && tpcontrolvo.isControl()) {
                result.setShowPass(false);
                seminfos = tpcontrolvo.getControlInfos();
                for (int j = 0; j < seminfos.length; ++j) {
                    controlMsg.append("\n" + seminfos[j]);
                }
            } else if (tpcontrolvo != null && tpcontrolvo.isAlarm()) {
                seminfos = tpcontrolvo.getAlarmInfos();
                for (int j = 0; j < seminfos.length; ++j) {
                    controlMsg.append("\n" + seminfos[j]);
                }
            } else if (tpcontrolvo != null && tpcontrolvo.isMayBeControl()) {
                seminfos = tpcontrolvo.getFlexibleControlInfos();
                for (int j = 0; j < seminfos.length; ++j) {
                    controlMsg.append("\n" + seminfos[j]);
                }
            }
            result.setHintMessage(controlMsg.toString());
            break;
        }
        return result;
    }

    private NtbCtlInfoVO checkNtb(BaseAggVO vo) throws BusinessException {
        if (vo == null || vo.getParentVO() == null || vo.getChildrenVO() == null || vo.getChildrenVO().length == 0) {
            return null;
        }
        BaseBillVO head = vo.getHeadVO();
        if (!ARAPModuleEnableUtil.isTbbEnabled((String)head.getPk_group())) {
            return null;
        }
        IBudgetControl budgetControlServ = (IBudgetControl)NCLocator.getInstance().lookup(IBudgetControl.class);
        ArapConstant constant = new ArapConstant();
        DataRuleVO[] ruleVOs = budgetControlServ.queryControlTactics(head.getPk_billtype(), constant.ARAP_NTB_EFFECT_KEY, true);
        if (ruleVOs == null || ruleVOs.length == 0) {
            return null;
        }
        ArrayList<ArapAccessableBusiVO> list = new ArrayList<ArapAccessableBusiVO>();
        for (int j = 0; j < ruleVOs.length; ++j) {
            BaseItemVO[] items = vo.getItems();
            for (int i = 0; i < items.length; ++i) {
                ArapAccessableBusiVO temp = new ArapAccessableBusiVO(head, items[i]);
                temp.setDataType(ruleVOs[j].getDataType());
                temp.setAdd(ruleVOs[j].isAdd());
                list.add(temp);
            }
        }
        ArapAccessableBusiVO[] accessableBusiVOs = new ArapAccessableBusiVO[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            accessableBusiVOs[i] = (ArapAccessableBusiVO)list.get(i);
        }
        try {
            NtbCtlInfoVO tpcontrolvo = ((IBudgetControl)NCLocator.getInstance().lookup(IBudgetControl.class)).getCheckInfo((IAccessableBusiVO[])accessableBusiVOs);
            return tpcontrolvo;
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
    }

    public DataField[] getApplicationArgs() {
        DataField dataField1 = new DataField(this.budgetControl_id, this.budgetControl_name, BasicType.BOOLEAN);
        return new DataField[]{dataField1};
    }
}

