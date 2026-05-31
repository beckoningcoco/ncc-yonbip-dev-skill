/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.bd.audit.IAuditContext
 *  nc.itf.bd.audit.IAuditExportNewTask
 *  nc.itf.bd.audit.IAuditExportTask
 *  nc.itf.bd.audit.IExportContext
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.uapbd.IAccountPubService
 *  nc.vo.bd.account.AccountVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 */
package nc.itf.arap.audit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.audit.ApAuditIterator;
import nc.itf.arap.audit.IArapAuditExportTask;
import nc.itf.bd.audit.IAuditContext;
import nc.itf.bd.audit.IAuditExportNewTask;
import nc.itf.bd.audit.IAuditExportTask;
import nc.itf.bd.audit.IExportContext;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.uapbd.IAccountPubService;
import nc.vo.arap.audit.APDetailVO;
import nc.vo.bd.account.AccountVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;

public class ApDetailAuditExportTaskImpl
implements IAuditExportTask,
IAuditExportNewTask {
    private String statusMsg;

    public SuperVO[] getExportData(IAuditContext context, IExportContext exportcontext, String pkOrg) throws Exception {
        SuperVO[] result = null;
        String apsubj = context.getAPsubj();
        String year = context.getYear();
        String startmonth = context.getStartmonth();
        String endmonth = context.getEndmonth();
        UFDate begindate = new UFDate();
        UFDate enddate = new UFDate();
        AccountCalendar accountCalendar = AccountCalendar.getInstanceByPk_org((String)pkOrg);
        accountCalendar.set(year, startmonth);
        begindate = accountCalendar.getMonthVO().getBegindate();
        accountCalendar.set(year, endmonth);
        enddate = accountCalendar.getMonthVO().getEnddate();
        boolean hasjun = "01".equals(startmonth.substring(startmonth.length() - 2, startmonth.length()));
        IArapAuditExportTask auditTask = (IArapAuditExportTask)NCLocator.getInstance().lookup(IArapAuditExportTask.class);
        ArrayList<String> pks = new ArrayList<String>();
        List<APDetailVO> apdetailList = auditTask.getApDetailVOs(pkOrg, begindate, enddate, hasjun, pks);
        this.statusMsg = this.resetAPSubject(apdetailList, apsubj);
        if (apdetailList != null && apdetailList.size() > 0) {
            for (int i = 0; i < apdetailList.size(); ++i) {
                APDetailVO apDetailVO = apdetailList.get(i);
                if (apDetailVO.getAccvoucherdate() != null) {
                    apDetailVO.setAccvoucherdate(apDetailVO.getAccvoucherdate().replace("-", ""));
                }
                if (apDetailVO.getTallydate() != null) {
                    apDetailVO.setTallydate(apDetailVO.getTallydate().replace("-", ""));
                }
                if (apDetailVO.getExperidate() != null) {
                    apDetailVO.setExperidate(apDetailVO.getExperidate().replace("-", ""));
                }
                if (apDetailVO.getVerifydate() != null) {
                    apDetailVO.setVerifydate(apDetailVO.getVerifydate().replace("-", ""));
                }
                if (apDetailVO.getRecdate() == null) continue;
                apDetailVO.setRecdate(apDetailVO.getRecdate().replace("-", ""));
            }
            result = apdetailList.toArray(new APDetailVO[0]);
        }
        return result;
    }

    private String resetAPSubject(List<APDetailVO> detailList, String subj) throws BusinessException {
        int i;
        String statusMsg = "";
        if (detailList == null || detailList.size() <= 0) {
            return statusMsg;
        }
        HashSet<String> subjSet = new HashSet<String>();
        HashMap<String, String> subjMap = new HashMap<String, String>();
        if (subj != null && !"".equals(subj)) {
            subjSet.add(subj);
        }
        for (int i2 = 0; i2 < detailList.size(); ++i2) {
            String subjcode = detailList.get(i2).getSubjectcode();
            if (subjcode == null || "".equals(subjcode)) continue;
            subjSet.add(subjcode);
        }
        List<Object> subjList = new ArrayList();
        subjList = Arrays.asList(subjSet.toArray(new String[0]));
        IAccountPubService accpubService = (IAccountPubService)NCLocator.getInstance().lookup(IAccountPubService.class);
        AccountVO[] accountVOs = accpubService.queryAccountVOsByPks(subjSet.toArray(new String[0]), detailList.get(0).getTallydate());
        if (accountVOs != null && accountVOs.length > 0 && subjList.size() == accountVOs.length) {
            for (i = 0; i < subjList.size(); ++i) {
                subjMap.put(accountVOs[i].getPk_accasoa(), accountVOs[i].getCode());
            }
        }
        for (i = 0; i < detailList.size(); ++i) {
            String subjcode = detailList.get(i).getSubjectcode();
            if (subjcode == null || "".equals(subjcode)) {
                if (subj != null && !"".equals(subj)) {
                    detailList.get(i).setSubjectcode((String)subjMap.get(subj));
                    continue;
                }
                String billno = detailList.get(i).getBillno();
                statusMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0893", null, new String[]{billno});
                detailList.clear();
                return statusMsg;
            }
            detailList.get(i).setSubjectcode((String)subjMap.get(subjcode));
        }
        statusMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0894", null, new String[]{String.valueOf(detailList.size())});
        return statusMsg;
    }

    public void clearStatuMsg() {
        this.statusMsg = null;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public Iterator<SuperVO[]> getResDatas(IAuditContext context, IExportContext exportcontext, String pkOrg) throws BusinessException {
        return new ApAuditIterator(context, pkOrg);
    }
}

