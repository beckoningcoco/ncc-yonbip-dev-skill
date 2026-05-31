/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.bs.bd.businessevent.BatchEndAccMessage
 *  nc.bs.bd.businessevent.ErrorInfo
 *  nc.bs.bd.businessevent.ReportInfo
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.org.IBasicBatchCloseAcc
 *  nc.itf.org.IBatchEndAccManageService$BatchEndAccType
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.org.BatchCloseAccBookVO
 *  nc.vo.pub.BusinessException
 *  nccloud.framework.core.exception.ExceptionUtils
 *  nccloud.pubitf.arap.arappub.INccBatchCloseAccountService
 *  org.apache.commons.collections4.CollectionUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.bs.bd.businessevent.BatchEndAccMessage;
import nc.bs.bd.businessevent.ErrorInfo;
import nc.bs.bd.businessevent.ReportInfo;
import nc.bs.framework.common.NCLocator;
import nc.itf.org.IBasicBatchCloseAcc;
import nc.itf.org.IBatchEndAccManageService;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.org.BatchCloseAccBookVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.pubitf.arap.arappub.INccBatchCloseAccountService;
import org.apache.commons.collections4.CollectionUtils;

public abstract class ArapPubCloseAccCheckImpl
implements IBasicBatchCloseAcc {
    private static final String ACCCLOSEE = "Close";
    private static final String ACCCLOSEECHECK = "CloseCheck";

    public BatchEndAccMessage batchEndAccBook(Collection<BatchCloseAccBookVO> collection, IBatchEndAccManageService.BatchEndAccType eventType, BatchEndAccMessage message) throws BusinessException {
        HashMap<String, Object> map = this.getReportMap(collection, ACCCLOSEE);
        for (BatchCloseAccBookVO accbookvo : collection) {
            String pk_org = accbookvo.getPk_org();
            ArrayList<String> errormessage = new ArrayList<String>();
            String retmessage = " ";
            try {
                retmessage = ((INccBatchCloseAccountService)NCLocator.getInstance().lookup(INccBatchCloseAccountService.class)).closeAccountCheck(pk_org, this.getmodule(), this.getProid(), this.getPeriod(accbookvo.getPk_accperiodmonth()));
                if (map != null && map.size() > 0) {
                    List reportInfo = (List)map.get(pk_org);
                    for (ReportInfo rInfo : reportInfo) {
                        errormessage.add(rInfo.getCheckItem());
                    }
                }
                if (retmessage == null || retmessage == " ") {
                    if (!CollectionUtils.isEmpty(errormessage)) {
                        retmessage = String.join((CharSequence)",", errormessage);
                    }
                } else {
                    retmessage = retmessage + String.join((CharSequence)",", errormessage);
                }
            }
            catch (Exception e) {
                ArrayList<String> list = new ArrayList<String>();
                ErrorInfo info = new ErrorInfo();
                info.setPk_org(pk_org);
                info.setPk_closeaccbook(accbookvo.getPk_closeaccbook());
                info.setPk_accperiod(accbookvo.getPk_accperiodmonth());
                list.add(ExceptionUtils.unmarsh((Throwable)e).getMessage());
                info.setDetail(list);
                message.addErrorInfo((Object)accbookvo, info);
            }
            if (retmessage != null && !" ".equals(retmessage)) {
                ArrayList<String> list = new ArrayList<String>();
                ErrorInfo info = new ErrorInfo();
                info.setPk_org(pk_org);
                info.setPk_closeaccbook(accbookvo.getPk_closeaccbook());
                info.setPk_accperiod(accbookvo.getPk_accperiodmonth());
                list.add(retmessage);
                info.setDetail(list);
                message.addErrorInfo((Object)accbookvo, info);
                continue;
            }
            try {
                ((INccBatchCloseAccountService)NCLocator.getInstance().lookup(INccBatchCloseAccountService.class)).closeAccountOver(pk_org, this.getmodule(), this.getPeriod(accbookvo.getPk_accperiodmonth()), accbookvo.getPk_accperiodmonth());
            }
            catch (Exception e) {
                String messageStr = e.getMessage();
                messageStr = messageStr.replaceAll("@,", ",\n").replaceAll("@\uff0c", ",\n").trim();
                if (messageStr.endsWith(",")) {
                    messageStr = messageStr.substring(0, messageStr.length() - 1);
                }
                ArrayList<String> list = new ArrayList<String>();
                ErrorInfo info = new ErrorInfo();
                info.setPk_org(pk_org);
                info.setPk_closeaccbook(accbookvo.getPk_closeaccbook());
                info.setPk_accperiod(accbookvo.getPk_accperiodmonth());
                list.add(messageStr);
                info.setDetail(list);
                message.addErrorInfo((Object)accbookvo, info);
            }
        }
        return message;
    }

    public BatchEndAccMessage checkBatchEndAccBook(Collection<BatchCloseAccBookVO> paramCollection, IBatchEndAccManageService.BatchEndAccType paramBatchEndAccType, BatchEndAccMessage paramBatchEndAccMessage) throws BusinessException {
        HashMap<String, Object> map = this.getReportMap(paramCollection, ACCCLOSEECHECK);
        for (BatchCloseAccBookVO accbookvo : paramCollection) {
            String pk_org = accbookvo.getPk_org();
            List reportInfo = (List)map.get(pk_org);
            for (ReportInfo rInfo : reportInfo) {
                rInfo.setPk_org(accbookvo.getPk_org());
                rInfo.setPk_closeaccbook(accbookvo.getPk_closeaccbook());
                paramBatchEndAccMessage.addReportInfo(rInfo);
            }
        }
        return paramBatchEndAccMessage;
    }

    public abstract String getSfBillClass();

    public abstract String getmodule();

    public abstract String getProid();

    private HashMap<String, Object> getReportMap(Collection<BatchCloseAccBookVO> paramCollection, String flag) throws BusinessException {
        ArrayList<String> pkorgs = new ArrayList<String>();
        ArrayList<String> accperiodmonth = new ArrayList<String>();
        for (BatchCloseAccBookVO accbookvo : paramCollection) {
            pkorgs.add(accbookvo.getPk_org());
            accperiodmonth.add(accbookvo.getPk_accperiodmonth());
        }
        HashMap<String, Object> map = new HashMap();
        map = ACCCLOSEECHECK.equals(flag) ? this.getReportMap(pkorgs.toArray(new String[0]), accperiodmonth.toArray(new String[0]), ACCCLOSEECHECK) : this.getReportMap(pkorgs.toArray(new String[0]), accperiodmonth.toArray(new String[0]), ACCCLOSEE);
        return map;
    }

    private String getPeriod(String pk_accperiodmonth) throws InvalidAccperiodExcetion {
        AccountCalendar vo = AccountCalendar.getInstanceByAccperiodMonth((String)pk_accperiodmonth);
        String period = vo.getMonthVO().getYearmth();
        return period;
    }

    private HashMap<String, Object> getReportMap(String[] pk_org, String[] pkaccperiodmonth, String flag) throws BusinessException {
        HashMap info = ((INccBatchCloseAccountService)NCLocator.getInstance().lookup(INccBatchCloseAccountService.class)).initInfo(this.getSfBillClass(), pk_org, pkaccperiodmonth, null, 1);
        HashMap map = ((INccBatchCloseAccountService)NCLocator.getInstance().lookup(INccBatchCloseAccountService.class)).getBatchCloseAccountReports(info);
        if (ACCCLOSEE.equals(flag)) {
            HashMap<String, Object> mapError = new HashMap<String, Object>();
            ArrayList reportInfo = new ArrayList();
            for (String org : pk_org) {
                reportInfo.addAll((Collection)map.get(org));
            }
            for (ReportInfo index : reportInfo) {
                if (index.getIsPass().booleanValue()) continue;
                mapError.put(index.getPk_org(), index);
            }
            return mapError;
        }
        return map;
    }
}

