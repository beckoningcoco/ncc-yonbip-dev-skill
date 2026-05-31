/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.impl.pubapp.pattern.data.bill.BillQuery
 *  nc.impl.pubapp.pattern.database.DataAccessUtils
 *  nc.impl.pubapp.pattern.database.IDQueryBuilder
 *  nc.impl.pubapp.pattern.database.TempTableDefine
 *  nc.pubitf.arap.receivable.IArapEstiReceivableBillPubServiceForSCM
 *  nc.pubitf.arap.receivable.IArapReceivableBillPubService
 *  nc.pubitf.arap.receivable.IArapReceivableBillPubServiceForSCM
 *  nc.vo.arap.itfvo.ReceivableBillInfoVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.query.ConditionVO
 *  nc.vo.pubapp.pattern.data.IRowSet
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.pubapp.pattern.pub.MapList
 *  nc.vo.pubapp.pattern.pub.MathTool
 *  nc.vo.so.report.multipleprofit.MultProfitSourceSystem
 *  nc.vo.so.report.multipleprofit.MultipleProfitViewVO
 *  nccloud.commons.lang.StringUtils
 */
package nc.pubimpl.arap.receivable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import nc.bs.arap.receiveablebp.RecBillBO;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.data.bill.BillQuery;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.impl.pubapp.pattern.database.IDQueryBuilder;
import nc.impl.pubapp.pattern.database.TempTableDefine;
import nc.pubitf.arap.receivable.IArapEstiReceivableBillPubServiceForSCM;
import nc.pubitf.arap.receivable.IArapReceivableBillPubService;
import nc.pubitf.arap.receivable.IArapReceivableBillPubServiceForSCM;
import nc.vo.arap.itfvo.ReceivableBillInfoVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.query.ConditionVO;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.pub.MapList;
import nc.vo.pubapp.pattern.pub.MathTool;
import nc.vo.so.report.multipleprofit.MultProfitSourceSystem;
import nc.vo.so.report.multipleprofit.MultipleProfitViewVO;
import nccloud.commons.lang.StringUtils;

public class ArapReceivableBillPubServiceForSCMImpl
implements IArapReceivableBillPubServiceForSCM {
    public void deleteBillsByDetailIDs(String[] detailIDs) throws BusinessException {
    }

    public Hashtable getArBillNum(String sOId) throws BusinessException {
        return null;
    }

    public UFDouble[] getBalanceByCreditTerms(String where, String date, String pkOrg, int iArbillstat, int iAgBillStat) throws BusinessException {
        return null;
    }

    public String queryAccountAgeAnalyzeInfo(String startdate, String enddate, String line, String ordercusBasdoc, String pkTimecontrol, String pkOrg, int iArbillstat, int iAgBillStat) throws BusinessException {
        return null;
    }

    public void deleteBodyVOs(String[] cSourceIDs, String[] pk_orgs) throws BusinessException {
        DataAccessUtils name = new DataAccessUtils();
        String temptable = new TempTableDefine().get(cSourceIDs, pk_orgs).toLowerCase();
        SqlBuilder sql = this.getDeletebodyVOsSql(temptable);
        IRowSet ret = name.query(sql.toString());
        if (ret.size() == 0) {
            String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006rec_0", "02006rec-0042");
            ExceptionUtils.wrappBusinessException((String)msg);
        }
        String[] cbillids = ret.toOneDimensionStringArray();
        BillQuery query = new BillQuery(AggReceivableBillVO.class);
        AggReceivableBillVO[] bills = (AggReceivableBillVO[])query.query(cbillids);
        MapList maplist = new MapList();
        for (int i = 0; i < cSourceIDs.length; ++i) {
            String key = cSourceIDs[i] + pk_orgs[i];
            maplist.put((Object)key, (Object)cSourceIDs[i]);
            maplist.put((Object)key, (Object)pk_orgs[i]);
        }
        StringBuilder msg = new StringBuilder();
        HashSet<Integer> isDelete = new HashSet<Integer>();
        LinkedList<AggReceivableBillVO> delbillvos = new LinkedList<AggReceivableBillVO>();
        LinkedList<AggReceivableBillVO> updvos = new LinkedList<AggReceivableBillVO>();
        for (AggReceivableBillVO bill : bills) {
            ReceivableBillItemVO[] items = bill.getBodyVOs();
            isDelete.clear();
            for (ReceivableBillItemVO item : items) {
                String top_itemid = item.getTop_itemid();
                if (StringUtils.isEmpty((CharSequence)top_itemid)) {
                    ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006rec_0", "02006rec-0043"));
                }
                String orgid = item.getPk_org();
                String itemkey = top_itemid + orgid;
                List list = maplist.get((Object)itemkey);
                if (list.size() == 0) {
                    msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006rec_0", "02006rec-0044"));
                } else if (list.size() == 1) {
                    msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006rec_0", "02006rec-0045") + (String)list.get(0)).append("),");
                } else if (list.size() == 2) {
                    item.setStatus(3);
                }
                isDelete.add(item.getStatus());
            }
            if (isDelete.size() == 1 && isDelete.contains(3)) {
                delbillvos.add(bill);
                continue;
            }
            updvos.add(bill);
        }
        if (msg.length() > 0) {
            msg.delete(msg.lastIndexOf(","), msg.length());
            ExceptionHandler.createAndThrowException((String)msg.toString());
        }
        IArapReceivableBillPubService service = (IArapReceivableBillPubService)NCLocator.getInstance().lookup(IArapReceivableBillPubService.class);
        service.delete(delbillvos.toArray(new AggReceivableBillVO[0]));
    }

    private SqlBuilder getDeletebodyVOsSql(String temptable) {
        SqlBuilder sql = new SqlBuilder();
        sql.append("select distinct(pk_recbill) from ");
        sql.append("ar_recitem");
        sql.append(", ");
        sql.append(temptable);
        sql.append(" where ");
        sql.append("top_itemid");
        sql.append(" = ");
        sql.append(temptable);
        sql.append(".id1 and ");
        sql.append("pk_org = ");
        sql.append(temptable);
        sql.append(".id2");
        sql.append(" and dr=0");
        return sql;
    }

    public Map<String, AggReceivableBillVO> queryReceivableBillBySource(String[] sourceHids) throws BusinessException {
        AggReceivableBillVO bill;
        IDQueryBuilder builder = new IDQueryBuilder();
        String sql = builder.buildSQL("top_billid", sourceHids);
        Collection bodys = new BaseDAO().retrieveByClause(ReceivableBillItemVO.class, sql);
        if (bodys == null || bodys.size() <= 0) {
            return new HashMap<String, AggReceivableBillVO>();
        }
        HashSet<String> hids = new HashSet<String>();
        Iterator iterator = bodys.iterator();
        while (iterator.hasNext()) {
            ReceivableBillItemVO receivableBillItemVO;
            ReceivableBillItemVO body = receivableBillItemVO = (ReceivableBillItemVO)iterator.next();
            hids.add(body.getPk_recbill());
        }
        sql = builder.buildSQL("pk_recbill", hids.toArray(new String[0]));
        Collection heads = new BaseDAO().retrieveByClause(ReceivableBillVO.class, sql);
        HashMap<String, AggReceivableBillVO> bills = new HashMap<String, AggReceivableBillVO>();
        for (ReceivableBillVO head : heads) {
            if (!hids.contains(head.getPrimaryKey())) continue;
            bill = new AggReceivableBillVO();
            bill.setParent((ISuperVO)head);
            bills.put(head.getPrimaryKey(), bill);
        }
        for (ReceivableBillItemVO body : bodys) {
            bill = (AggReceivableBillVO)bills.get(body.getPk_recbill());
            if (bill == null) continue;
            ArrayList<ReceivableBillItemVO> children = new ArrayList<ReceivableBillItemVO>();
            if (bill.getBodyVOs() != null) {
                for (ReceivableBillItemVO item : bill.getBodyVOs()) {
                    children.add(item);
                }
            }
            children.add(body);
            bill.setChildrenVO((CircularlyAccessibleValueObject[])children.toArray(new ReceivableBillItemVO[0]));
        }
        return bills;
    }

    public Map<String, Integer> queryReceivableBillStatusBySource(String[] sourceHids) throws BusinessException {
        return this.getRecBO().queryReceivableBillStatusBySource(sourceHids);
    }

    public Map<String, Boolean> verifySaleInvoice(String[] saleInvoice) throws BusinessException {
        return null;
    }

    public Map<String, UFDouble> getNotaxForSoorder(String[] srcbids) throws BusinessException {
        HashMap<String, UFDouble> result = new HashMap<String, UFDouble>();
        Map estMap = ((IArapEstiReceivableBillPubServiceForSCM)NCLocator.getInstance().lookup(IArapEstiReceivableBillPubServiceForSCM.class)).getNotaxForSoorder(srcbids);
        Map<String, UFDouble> notEstMap = this.getRecBO().getNotaxForSoorder(srcbids);
        for (String id : srcbids) {
            result.put(id, MathTool.add((UFDouble)((UFDouble)estMap.get(id)), (UFDouble)notEstMap.get(id)));
        }
        return result;
    }

    private RecBillBO getRecBO() {
        return new RecBillBO();
    }

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoByTopBill(String top_billType, String[] top_billids) throws BusinessException {
        return this.getRecBO().queryReceivableBillInfoByTopBill(top_billType, 1, true, top_billids, null);
    }

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoByTopBill(String top_billType, String[] top_billids, String[] top_itemids) throws BusinessException {
        return this.getRecBO().queryReceivableBillInfoByTopBill(top_billType, 1, true, top_billids, top_itemids);
    }

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoBySrcBill(String[] src_billids) throws BusinessException {
        return this.getRecBO().queryReceivableBillInfoByTopBill(null, 0, true, src_billids, null);
    }

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoBySrcBill(String[] src_billids, String[] src_itemids) throws BusinessException {
        return this.getRecBO().queryReceivableBillInfoByTopBill(null, 0, true, src_billids, src_itemids);
    }

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoBySrcBillExcludeTusun(String[] src_billids, String[] src_itemids) throws BusinessException {
        return this.getRecBO().queryReceivableBillInfoByTopBillExcludeTusun(null, 0, true, src_billids, src_itemids);
    }

    public MultipleProfitViewVO[] queryMultProfit(ConditionVO[] conditions, MultProfitSourceSystem sourSys, String[] sumKeys) throws BusinessException {
        return this.getRecBO().queryMultProfit(conditions, sourSys, sumKeys);
    }
}

