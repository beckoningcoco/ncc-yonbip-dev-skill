/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.bs.bd.businessevent.BatchEndAccMessage
 *  nc.bs.bd.businessevent.ErrorInfo
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.org.IBasicBatchCloseAcc
 *  nc.itf.org.IBatchEndAccManageService$BatchEndAccType
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.org.BatchCloseAccBookVO
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.arappub.INccBatchCloseAccountService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.Collection;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.bs.bd.businessevent.BatchEndAccMessage;
import nc.bs.bd.businessevent.ErrorInfo;
import nc.bs.framework.common.NCLocator;
import nc.itf.org.IBasicBatchCloseAcc;
import nc.itf.org.IBatchEndAccManageService;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.org.BatchCloseAccBookVO;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.arappub.INccBatchCloseAccountService;

public abstract class ArapPubUnCloseAccCheckImpl
implements IBasicBatchCloseAcc {
    public BatchEndAccMessage checkBatchEndAccBook(Collection<BatchCloseAccBookVO> var1, IBatchEndAccManageService.BatchEndAccType var2, BatchEndAccMessage var3) throws BusinessException {
        return var3;
    }

    public BatchEndAccMessage batchEndAccBook(Collection<BatchCloseAccBookVO> accbookVOs, IBatchEndAccManageService.BatchEndAccType var2, BatchEndAccMessage accmessage) throws BusinessException {
        for (BatchCloseAccBookVO vo : accbookVOs) {
            String pk_org = vo.getPk_org();
            String pk_accperiodmonth = vo.getPk_accperiodmonth();
            String message = null;
            try {
                message = ((INccBatchCloseAccountService)NCLocator.getInstance().lookup(INccBatchCloseAccountService.class)).onCancelCloseAccount(pk_org, this.getmodule(), this.getProid(), this.getPeriod(vo.getPk_accperiodmonth()), pk_accperiodmonth);
                if (message == null) continue;
                ArrayList<String> list = new ArrayList<String>();
                ErrorInfo info = new ErrorInfo();
                info.setPk_org(pk_org);
                info.setPk_closeaccbook(vo.getPk_closeaccbook());
                info.setPk_accperiod(vo.getPk_accperiodmonth());
                list.add(message);
                info.setDetail(list);
                accmessage.addErrorInfo((Object)vo, info);
            }
            catch (Exception e) {
                ArrayList<String> list = new ArrayList<String>();
                ErrorInfo info = new ErrorInfo();
                info.setPk_org(pk_org);
                info.setPk_closeaccbook(vo.getPk_closeaccbook());
                info.setPk_accperiod(vo.getPk_accperiodmonth());
                list.add(e.getMessage());
                info.setDetail(list);
                accmessage.addErrorInfo((Object)vo, info);
            }
        }
        return accmessage;
    }

    public abstract String getSfBillClass();

    public abstract String getmodule();

    public abstract String getProid();

    private String getPeriod(String pk_accperiodmonth) throws InvalidAccperiodExcetion {
        AccountCalendar vo = AccountCalendar.getInstanceByAccperiodMonth((String)pk_accperiodmonth);
        String period = vo.getMonthVO().getYearmth();
        return period;
    }
}

