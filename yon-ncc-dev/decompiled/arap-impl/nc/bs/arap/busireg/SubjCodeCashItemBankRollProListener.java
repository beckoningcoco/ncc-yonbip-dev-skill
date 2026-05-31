/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.resource.NotSupportedException
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.businessevent.CheckEvent
 *  nc.bs.businessevent.CheckEvent$CheckUserObject
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.bd.cashflow.CashflowUseVO
 *  nc.vo.bd.fundplan.FundPlanUseVO
 *  nc.vo.bd.inoutbusiclass.InoutUseVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.resource.NotSupportedException;
import nc.bs.arap.util.SqlUtils;
import nc.bs.businessevent.CheckEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.bd.cashflow.CashflowUseVO;
import nc.vo.bd.fundplan.FundPlanUseVO;
import nc.vo.bd.inoutbusiclass.InoutUseVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;

public class SubjCodeCashItemBankRollProListener
implements IBusinessListener {
    Map<String, Object> dataMap = new HashMap<String, Object>();

    public void doAction(IBusinessEvent event) throws BusinessException {
        String eventType = event.getEventType();
        if ("1010".equals(eventType)) {
            String[] tabnames;
            Object userObject = event.getUserObject();
            Object[] userObjects = ((CheckEvent.CheckUserObject)userObject).getUserObjects();
            ArrayList<String> pklist = new ArrayList<String>();
            for (String tabname : tabnames = new String[]{"ar_recitem", "ar_gatheritem", "ap_payitem", "ap_payableitem", "ar_estirecitem", "ap_estipayableitem"}) {
                this.checkBillRef(event, userObjects, pklist, tabname);
            }
        }
    }

    private void checkBillRef(IBusinessEvent event, Object[] userObjects, List<String> pklist, String tabname) throws DAOException, BusinessException {
        StringBuffer checkSql = new StringBuffer("SELECT DISTINCT ");
        if (userObjects[0] instanceof InoutUseVO) {
            checkSql.append("pk_subjcode").append(" FROM " + tabname + " WHERE dr=0 and pk_org='" + ((InoutUseVO)userObjects[0]).getPk_org() + "' and ");
            for (Object useVO : userObjects) {
                String pkInoutbusiclass = ((InoutUseVO)useVO).getPk_inoutbusiclass();
                pklist.add(pkInoutbusiclass);
                this.dataMap.put(pkInoutbusiclass, useVO);
            }
            checkSql.append(SqlUtils.getInStr((String)"pk_subjcode", (String[])pklist.toArray(new String[0])));
            this.checkBillRef(checkSql, (CheckEvent)event);
        } else if (userObjects[0] instanceof CashflowUseVO) {
            checkSql.append("cashitem").append(" FROM " + tabname + " WHERE dr=0 and pk_org='" + ((CashflowUseVO)userObjects[0]).getPk_org() + "' and ");
            for (Object useVO : userObjects) {
                String pkCashflow = ((CashflowUseVO)useVO).getPk_cashflow();
                pklist.add(pkCashflow);
                this.dataMap.put(pkCashflow, useVO);
            }
            checkSql.append(SqlUtils.getInStr((String)"cashitem", (String[])pklist.toArray(new String[0])));
            this.checkBillRef(checkSql, (CheckEvent)event);
        } else if (userObjects[0] instanceof FundPlanUseVO) {
            checkSql.append("bankrollprojet").append(" FROM " + tabname + " WHERE dr=0 and pk_org='" + ((FundPlanUseVO)userObjects[0]).getPk_org() + "' and ");
            for (Object useVO : userObjects) {
                String pkFundplan = ((FundPlanUseVO)useVO).getPk_fundplan();
                pklist.add(pkFundplan);
                this.dataMap.put(pkFundplan, useVO);
            }
            checkSql.append(SqlUtils.getInStr((String)"bankrollprojet", (String[])pklist.toArray(new String[0])));
            this.checkBillRef(checkSql, (CheckEvent)event);
        }
    }

    private void checkBillRef(StringBuffer checkSql, CheckEvent event) throws DAOException, BusinessException {
        List executeQuery = (List)new BaseDAO().executeQuery(checkSql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        if (executeQuery != null && !executeQuery.isEmpty()) {
            String mess = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0370");
            try {
                for (int i = 0; i < executeQuery.size(); ++i) {
                    event.addErrorMsg(this.dataMap.get(executeQuery.get(i)), mess);
                }
            }
            catch (NotSupportedException e) {
                ExceptionHandler.handleException((Exception)((Object)e));
            }
        }
    }
}

