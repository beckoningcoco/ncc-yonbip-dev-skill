/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.IAttributeManager
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pf.pub.PfDataCache
 *  nc.itf.fi.pub.Currency
 *  nc.pubitf.fip.service.IFipBillProcessService
 *  nc.pubitf.fip.service.IFipMessageSagasCheckService
 *  nc.pubitf.fip.service.IFipMessageService
 *  nc.vo.fip.service.FipMessageVO
 *  nc.vo.fip.service.FipMsgResultVO
 *  nc.vo.fip.service.FipRelationInfoVO
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.util;

import nc.bs.arap.util.BillRetiveInfoUtils;
import nc.bs.framework.common.IAttributeManager;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.pf.pub.PfDataCache;
import nc.itf.fi.pub.Currency;
import nc.pubitf.fip.service.IFipBillProcessService;
import nc.pubitf.fip.service.IFipMessageSagasCheckService;
import nc.pubitf.fip.service.IFipMessageService;
import nc.vo.fip.service.FipMessageVO;
import nc.vo.fip.service.FipMsgResultVO;
import nc.vo.fip.service.FipRelationInfoVO;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.bs.arap.sagas.util.SagasUtils;
import org.apache.commons.lang3.ArrayUtils;

public class FipMessageUtils {
    public static void syncCheckBeforeSendMessage(FipMessageVO[] messageVOs) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])messageVOs) || SagasUtils.isMerged) {
            return;
        }
        IFipMessageSagasCheckService fipCheckService = (IFipMessageSagasCheckService)NCLocator.getInstance().lookup(IFipMessageSagasCheckService.class);
        int messagetype = messageVOs[0].getMessagetype();
        if (0 == messagetype) {
            fipCheckService.validateAddSagasCheck(messageVOs);
        } else if (1 == messagetype) {
            fipCheckService.validateDelSagasCheck(messageVOs);
        }
    }

    public static void syncCheckBeforeSendMessage(boolean isAdd, AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills) || SagasUtils.isMerged) {
            return;
        }
        FipMessageUtils.syncCheckBeforeSendMessage(FipMessageUtils.constructFipMessage((boolean)isAdd, (AggregatedValueObject[])bills));
    }

    public static FipMsgResultVO[] sendMessages(FipMessageVO[] messageVOs) throws BusinessException {
        if (SagasUtils.isCompensateStage()) {
            return new FipMsgResultVO[1];
        }
        if (!SagasUtils.isMerged) {
            FipMessageUtils.syncCheckBeforeSendMessage(messageVOs);
        }
        Object tabid = ((IAttributeManager)NCLocator.getInstance().lookup("nc.bs.framework.core.service.RequestAttributeManager")).getAttribute("tabid");
        Object[] result = ((IFipMessageService)NCLocator.getInstance().lookup(IFipMessageService.class)).sendMessages(messageVOs);
        if (ArrayUtils.isEmpty((Object[])result)) {
            result = new FipMsgResultVO[1];
        }
        return result;
    }

    public static void sendMessagesVO(FipRelationInfoVO[][] messageVOs) throws BusinessException {
        if (SagasUtils.isCompensateStage() || !SagasUtils.isMerged) {
            return;
        }
        ((IFipBillProcessService)NCLocator.getInstance().lookup(IFipBillProcessService.class)).generateSumBills(messageVOs);
    }

    private static <T extends AggregatedValueObject> FipMessageVO[] constructFipMessage(boolean isAdd, T[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        FipMessageVO[] messageVOs = new FipMessageVO[bills.length];
        new BillRetiveInfoUtils().retryInfos((AggregatedValueObject[])bills);
        for (int i = 0; i < bills.length; ++i) {
            CircularlyAccessibleValueObject head = bills[i].getParentVO();
            UFDate effectdate = (UFDate)head.getAttributeValue("effectdate");
            String pk_tradetype = (String)head.getAttributeValue("pk_tradetype");
            String pk_group = (String)head.getAttributeValue("pk_group");
            FipRelationInfoVO reVO = new FipRelationInfoVO();
            reVO.setPk_group((String)head.getAttributeValue("pk_group"));
            reVO.setPk_org((String)head.getAttributeValue("pk_org"));
            reVO.setRelationID(head.getPrimaryKey());
            reVO.setPk_system(PfDataCache.getBillTypeInfo((String)pk_group, (String)pk_tradetype).getSystemcode());
            reVO.setBusidate(effectdate == null ? new UFDate() : effectdate);
            reVO.setPk_billtype(pk_tradetype);
            reVO.setPk_operator(InvocationInfoProxy.getInstance().getUserId());
            reVO.setFreedef1((String)head.getAttributeValue("billno"));
            String scomment = (String)head.getAttributeValue("scomment");
            if (StringUtil.isEmptyWithTrim((String)scomment)) {
                CircularlyAccessibleValueObject childrenVO;
                CircularlyAccessibleValueObject[] childrenVOs;
                CircularlyAccessibleValueObject[] circularlyAccessibleValueObjectArray = childrenVOs = bills[i].getChildrenVO();
                int n = circularlyAccessibleValueObjectArray.length;
                for (int j = 0; j < n && StringUtil.isEmptyWithTrim((String)(scomment = (String)(childrenVO = circularlyAccessibleValueObjectArray[j]).getAttributeValue("scomment"))); ++j) {
                }
            }
            reVO.setFreedef2(scomment);
            UFDouble money = (UFDouble)head.getAttributeValue("money");
            if (null == head.getAttributeValue("pk_currtype")) {
                head.setAttributeValue("pk_currtype", bills[i].getChildrenVO()[0].getAttributeValue("pk_currtype"));
            }
            money = Currency.getFormaUfValue((String)((String)head.getAttributeValue("pk_currtype")), (UFDouble)money);
            reVO.setFreedef3(money.toString());
            reVO.setDefdoc1((String)head.getAttributeValue("pk_busitype"));
            FipMessageVO messageVO = new FipMessageVO();
            messageVO.setBillVO(bills[i]);
            messageVO.setMessagetype(isAdd ? 0 : 1);
            messageVO.setMessageinfo(reVO);
            messageVOs[i] = messageVO;
        }
        return messageVOs;
    }
}

