/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.bd.audit.IAuditContext
 *  nc.itf.bd.audit.IAuditMessageService
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.uapbd.IAccountPubService
 *  nc.vo.bd.account.AccountVO
 *  nc.vo.bd.audit.AuditassMessageVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nccloud.commons.lang.StringUtils
 */
package nc.itf.arap.audit;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.audit.IArapAuditExportTask;
import nc.itf.bd.audit.IAuditContext;
import nc.itf.bd.audit.IAuditMessageService;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.uapbd.IAccountPubService;
import nc.vo.arap.audit.APDetailVO;
import nc.vo.bd.account.AccountVO;
import nc.vo.bd.audit.AuditassMessageVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nccloud.commons.lang.StringUtils;

public class ApAuditIterator
implements Iterator<SuperVO[]>,
Serializable {
    private static final long serialVersionUID = 1L;
    private IAuditContext context;
    private String pk_org;
    private List<String> pks = new ArrayList<String>();
    private List<List<String>> pklist = new ArrayList<List<String>>();
    int cursor = 0;
    private UFDate begindate = new UFDate();
    private UFDate enddate = new UFDate();
    private boolean hasjun = false;
    private String apsubj;
    private boolean issubjnvl;
    private String userid;

    public ApAuditIterator(IAuditContext context, String pk_org) throws BusinessException {
        this.context = context;
        this.pk_org = pk_org;
        this.apsubj = context.getAPsubj();
        this.userid = context.getPk_userid();
        this.init();
    }

    private void init() throws BusinessException {
        this.initPKs();
        this.issubjnvl();
        this.constructPKs();
    }

    private void initPKs() throws BusinessException {
        String year = this.context.getYear();
        String startmonth = this.context.getStartmonth();
        String endmonth = this.context.getEndmonth();
        AccountCalendar accountCalendar = AccountCalendar.getInstanceByPk_org((String)this.pk_org);
        accountCalendar.set(year, startmonth);
        this.begindate = accountCalendar.getMonthVO().getBegindate();
        accountCalendar.set(year, endmonth);
        this.enddate = accountCalendar.getMonthVO().getEnddate();
        this.hasjun = "01".equals(startmonth.substring(startmonth.length() - 2, startmonth.length()));
        String sql = "select distinct pk_bill from arap_tally ";
        sql = this.hasjun ? sql + " where billdate <= '" + this.enddate + "' and pk_org = '" + this.pk_org + "' and pk_billtype in ( 'F1','F3')" : sql + " where billdate >= '" + this.begindate + "' and billdate <= '" + this.enddate + "' and arap_tally.pk_org = '" + this.pk_org + "' and pk_billtype in ( 'F1','F3')";
        BaseDAO dao = new BaseDAO();
        this.pks = (List)dao.executeQuery(sql, (ResultSetProcessor)new ColumnSetProcessor());
    }

    private void constructPKs() {
        int count = this.pks.size();
        int startindex = 0;
        int endindex = 100;
        while (startindex < count) {
            if (endindex < count) {
                this.groupPks(startindex, endindex);
            } else {
                this.groupPks(startindex, count - 1);
            }
            startindex = endindex + 1;
            endindex += endindex;
        }
    }

    private void groupPks(int startindex, int endindex) {
        ArrayList<String> idlist = new ArrayList<String>();
        for (int i = startindex; i <= endindex; ++i) {
            idlist.add(this.pks.get(i));
        }
        this.pklist.add(idlist);
    }

    @Override
    public boolean hasNext() {
        return this.cursor < this.pklist.size();
    }

    @Override
    public SuperVO[] next() {
        if (this.issubjnvl) {
            return new APDetailVO[0];
        }
        List<String> currpks = this.pklist.get(this.cursor);
        ++this.cursor;
        if (currpks == null || currpks.size() == 0) {
            return new APDetailVO[0];
        }
        IArapAuditExportTask auditTask = (IArapAuditExportTask)NCLocator.getInstance().lookup(IArapAuditExportTask.class);
        SuperVO[] result = null;
        try {
            List<APDetailVO> apdetailList = auditTask.getApDetailVOs(this.pk_org, this.begindate, this.enddate, this.hasjun, currpks);
            this.resetAPSubject(apdetailList, this.apsubj);
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
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return result;
    }

    private void issubjnvl() {
        UFBoolean issubjnull = UFBoolean.FALSE;
        IArapAuditExportTask auditTask = (IArapAuditExportTask)NCLocator.getInstance().lookup(IArapAuditExportTask.class);
        IAuditMessageService auditmsgSev = (IAuditMessageService)NCLocator.getInstance().lookup(IAuditMessageService.class);
        try {
            List<Object> subjList = auditTask.getApDetailSubjs(this.pk_org, this.begindate, this.enddate, this.hasjun, this.pks);
            issubjnull = (UFBoolean)subjList.get(0);
            if (StringUtils.isEmpty((CharSequence)this.apsubj) && UFBoolean.TRUE.equals((Object)issubjnull)) {
                String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0893", null, new String[]{subjList.get(1).toString()});
                AuditassMessageVO msgVO = new AuditassMessageVO();
                msgVO.setMessage(msg);
                msgVO.setPk_userid(this.userid);
                msgVO.setPk_org(this.pk_org);
                auditmsgSev.insert(msgVO);
            }
        }
        catch (Exception e1) {
            Logger.error((Object)e1.getMessage(), (Throwable)e1);
        }
        this.issubjnvl = StringUtils.isEmpty((CharSequence)this.apsubj) && UFBoolean.TRUE.equals((Object)issubjnull);
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

    @Override
    public void remove() {
    }

    class ColumnSetProcessor
    implements ResultSetProcessor {
        private static final long serialVersionUID = 6143310746164612517L;

        ColumnSetProcessor() {
        }

        public Object handleResultSet(ResultSet rs) throws SQLException {
            ArrayList<String> ls = new ArrayList<String>();
            while (rs.next()) {
                ls.add(rs.getString(1));
            }
            return ls;
        }
    }
}

