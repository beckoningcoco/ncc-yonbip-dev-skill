/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.jdbc.framework.processor.BeanListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.arap.termitem.IArapTermItemPubQueryService
 *  nc.vo.arap.agiotage.ArapBusiDataVO
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubimpl.arap.termitem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.termitem.IArapTermItemPubQueryService;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public class TermItemPubQueryService
implements IArapTermItemPubQueryService {
    public TermVO[] queryTermVOByBillParentPK(String[] pks) throws BusinessException {
        List vos = null;
        try {
            vos = (List)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(TermVO.class, SqlUtils.getInStr((String)"pk_bill", (String[])pks), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (null != vos && vos.size() > 0) {
            TermVO[] retVos = new TermVO[vos.size()];
            for (int i = 0; i < retVos.length; ++i) {
                retVos[i] = (TermVO)vos.get(i);
            }
            return retVos;
        }
        return new TermVO[0];
    }

    public Map<String, List<TermVO>> queryTermVOMapByBillItemPKForPayApply(String[] itemPKs) throws BusinessException {
        HashMap<String, List<TermVO>> map = new HashMap<String, List<TermVO>>();
        List vos = null;
        try {
            vos = (List)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(ArapBusiDataVO.class, SqlUtils.getInStr((String)"pk_item", (String[])itemPKs), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (null != vos && vos.size() > 0) {
            ArapBusiDataVO[] busiDataVOs = new ArapBusiDataVO[vos.size()];
            for (int i = 0; i < busiDataVOs.length; ++i) {
                busiDataVOs[i] = (ArapBusiDataVO)vos.get(i);
            }
            for (ArapBusiDataVO vo : busiDataVOs) {
                TermVO termVO = new TermVO();
                termVO.setExpiredate(vo.getExpiredate());
                termVO.setMoney_bal(vo.getMoney_bal());
                termVO.setOccupationmny(vo.getOccupationmny());
                termVO.setGlobalbalance(vo.getGlobal_money_bal());
                termVO.setGroupbalance(vo.getGroup_money_bal());
                termVO.setLocal_money_bal(vo.getLocal_money_bal());
                termVO.setPk_org(vo.getPk_org());
                termVO.setPk_group(vo.getPk_group());
                termVO.setPk_billtype(vo.getPk_billtype());
                termVO.setInsurance(vo.getInsurance());
                Integer prepay = vo.getPrepay();
                termVO.setPrepay(prepay != null && prepay == 1 ? UFBoolean.TRUE : UFBoolean.FALSE);
                termVO.setPk_bill(vo.getPk_bill());
                termVO.setPk_item(vo.getPk_item());
                termVO.setPk_termitem(vo.getPk_termitem());
                termVO.setSupplier(vo.getSupplier());
                termVO.setQuantity_bal(vo.getQuantity_bal());
                ArrayList<TermVO> termvoList = (ArrayList<TermVO>)map.get(vo.getPk_item());
                if (termvoList == null) {
                    termvoList = new ArrayList<TermVO>();
                    map.put(vo.getPk_item(), termvoList);
                }
                termvoList.add(termVO);
            }
            return map;
        }
        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("20062006v61013_0", "020062006v61013-0005"));
    }

    public TermVO[] queryTermVOByBillItemPKForPayApply(String[] itemPKs) throws BusinessException {
        List vos = null;
        ArrayList<TermVO> termvoList = new ArrayList<TermVO>();
        try {
            vos = (List)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(ArapBusiDataVO.class, SqlUtils.getInStr((String)"pk_item", (String[])itemPKs), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (null != vos && vos.size() > 0) {
            ArapBusiDataVO[] busiDataVOs = new ArapBusiDataVO[vos.size()];
            TermVO[] retVos = new TermVO[vos.size()];
            for (int i = 0; i < busiDataVOs.length; ++i) {
                busiDataVOs[i] = (ArapBusiDataVO)vos.get(i);
            }
            for (ArapBusiDataVO vo : busiDataVOs) {
                TermVO termVO = new TermVO();
                termVO.setExpiredate(vo.getExpiredate());
                termVO.setMoney_bal(vo.getMoney_bal());
                termVO.setOccupationmny(vo.getOccupationmny());
                termVO.setGlobalbalance(vo.getGlobal_money_bal());
                termVO.setGroupbalance(vo.getGroup_money_bal());
                termVO.setLocal_money_bal(vo.getLocal_money_bal());
                termVO.setPk_org(vo.getPk_org());
                termVO.setPk_group(vo.getPk_group());
                termVO.setPk_billtype(vo.getPk_billtype());
                termVO.setInsurance(vo.getInsurance());
                Integer prepay = vo.getPrepay();
                termVO.setPrepay(prepay != null && prepay == 1 ? UFBoolean.TRUE : UFBoolean.FALSE);
                termVO.setPk_bill(vo.getPk_bill());
                termVO.setPk_item(vo.getPk_item());
                termVO.setPk_termitem(vo.getPk_termitem());
                termVO.setSupplier(vo.getSupplier());
                termVO.setQuantity_bal(vo.getQuantity_bal());
                termvoList.add(termVO);
            }
            termvoList.toArray(retVos);
            return retVos;
        }
        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("20062006v61013_0", "020062006v61013-0005"));
    }

    public TermVO[] queryTermVOByBillParentPKForPayApply(String[] pks) throws BusinessException {
        List vos = null;
        ArrayList<TermVO> termvoList = new ArrayList<TermVO>();
        try {
            vos = (List)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(ArapBusiDataVO.class, SqlUtils.getInStr((String)"pk_bill", (String[])pks), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (null != vos && vos.size() > 0) {
            ArapBusiDataVO[] busiDataVOs = new ArapBusiDataVO[vos.size()];
            TermVO[] retVos = new TermVO[vos.size()];
            for (int i = 0; i < busiDataVOs.length; ++i) {
                busiDataVOs[i] = (ArapBusiDataVO)vos.get(i);
            }
            for (ArapBusiDataVO vo : busiDataVOs) {
                TermVO termVO = new TermVO();
                termVO.setExpiredate(vo.getExpiredate());
                termVO.setMoney_bal(vo.getMoney_bal());
                termVO.setOccupationmny(vo.getOccupationmny());
                termVO.setGlobalbalance(vo.getGlobal_money_bal());
                termVO.setGroupbalance(vo.getGroup_money_bal());
                termVO.setLocal_money_bal(vo.getLocal_money_bal());
                termVO.setPk_org(vo.getPk_org());
                termVO.setPk_group(vo.getPk_group());
                termVO.setPk_billtype(vo.getPk_billtype());
                termVO.setInsurance(vo.getInsurance());
                termVO.setPk_bill(vo.getPk_bill());
                termVO.setPk_item(vo.getPk_item());
                termVO.setPk_termitem(vo.getPk_termitem());
                termVO.setSupplier(vo.getSupplier());
                termVO.setQuantity_bal(vo.getQuantity_bal());
                termvoList.add(termVO);
            }
            termvoList.toArray(retVos);
            return retVos;
        }
        return null;
    }

    public TermVO[] queryTermVOByTermPK(String[] pkTerm) throws BusinessException {
        List vos = null;
        vos = (List)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(TermVO.class, SqlUtils.getInStr((String)"pk_termitem", (String[])pkTerm), false);
        if (null != vos && vos.size() > 0) {
            return vos.toArray(new TermVO[0]);
        }
        return null;
    }

    public TermVO[] queryTermVOByTermPKAndWhere(String[] pkTerm, String whereSql) throws BusinessException {
        List vos = null;
        String sql = SqlUtils.getInStr((String)"pk_termitem", (String[])pkTerm) + (StringUtil.isEmpty((String)whereSql) ? "" : " and " + whereSql);
        vos = (List)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(TermVO.class, sql, false);
        if (null != vos && vos.size() > 0) {
            TermVO[] res = new TermVO[vos.size()];
            for (int i = 0; i < res.length; ++i) {
                res[i] = (TermVO)vos.get(i);
            }
            return res;
        }
        return null;
    }

    public TermVO[] queryTermVOByBillItemPK(String[] pkBillItem, boolean paySystem) throws BusinessException {
        List vos = null;
        String joinTable = " BD_INCOMECH";
        if (paySystem) {
            joinTable = " BD_PAYMENTCH";
        }
        StringBuffer colName = new StringBuffer(" accRate, ");
        colName.append("expiredate, ");
        colName.append("globalbalance, ");
        colName.append("globalcredit, ");
        colName.append("globaldebit, ");
        colName.append("globallocal, ");
        colName.append("globallocal, ");
        colName.append("groupbalance, ");
        colName.append("groupcredit, ");
        colName.append("groupdebit, ");
        colName.append("grouplocal, ");
        colName.append("innerctldeferdays, ");
        colName.append("insurance, ");
        colName.append("lastdiscount, ");
        colName.append("lastdiscountdate, ");
        colName.append("local_money_bal, ");
        colName.append("local_money_cr, ");
        colName.append("local_money_de, ");
        colName.append("money_bal, ");
        colName.append("money_cr, ");
        colName.append("money_de, ");
        colName.append("pk_bill, ");
        colName.append("pk_group, ");
        colName.append("pk_item, ");
        colName.append("pk_org, ");
        colName.append("pk_termitem, ");
        colName.append("quantity_bal, ");
        colName.append("quantity_cr, ");
        colName.append("quantity_de, ");
        colName.append("prepay , ");
        colName.append("showorder");
        StringBuffer sql = new StringBuffer("select ");
        sql.append(colName);
        sql.append(" from arap_termitem left join");
        sql.append(joinTable);
        sql.append(" on arap_termitem.PK_TERM_B = ");
        sql.append(joinTable + ".PK_PAYMENTCH");
        sql.append(" where ");
        sql.append(SqlUtils.getInStr((String)"pk_item", (String[])pkBillItem));
        sql.append(" order by showorder , expiredate");
        vos = (List)new BaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new BeanListProcessor(TermVO.class));
        TermVO[] retVos = null;
        if (null != vos && vos.size() > 0) {
            retVos = new TermVO[vos.size()];
            HashMap<String, UFDouble> itemTotalRate = new HashMap<String, UFDouble>();
            for (int i = 0; i < retVos.length; ++i) {
                retVos[i] = (TermVO)vos.get(i);
                String pk_item = retVos[i].getPk_item();
                UFDouble totalRate = itemTotalRate.get(pk_item) == null ? UFDouble.ZERO_DBL : (UFDouble)itemTotalRate.get(pk_item);
                totalRate = totalRate.add(new UFDouble(retVos[i].getAccRate()));
                itemTotalRate.put(pk_item, totalRate);
            }
            this.reComputAccRate(retVos);
            return retVos;
        }
        return retVos;
    }

    private void reComputAccRate(TermVO[] retVos) {
        UFDouble totalAmount;
        String pk_item;
        HashMap<String, UFDouble> itemTotalAmount = new HashMap<String, UFDouble>();
        HashMap<String, ArrayList<TermVO>> itemMap = new HashMap<String, ArrayList<TermVO>>();
        for (int i = 0; i < retVos.length; ++i) {
            TermVO termVO = retVos[i];
            pk_item = termVO.getPk_item();
            totalAmount = itemTotalAmount.get(pk_item) == null ? UFDouble.ZERO_DBL : (UFDouble)itemTotalAmount.get(pk_item);
            totalAmount = totalAmount.add(termVO.getMoney_cr().add(termVO.getMoney_de()));
            itemTotalAmount.put(pk_item, totalAmount);
            ArrayList<TermVO> list = (ArrayList<TermVO>)itemMap.get(pk_item);
            if (list == null) {
                list = new ArrayList<TermVO>();
                itemMap.put(pk_item, list);
            }
            list.add(termVO);
        }
        for (Map.Entry termentry : itemMap.entrySet()) {
            pk_item = (String)termentry.getKey();
            totalAmount = (UFDouble)itemTotalAmount.get(pk_item);
            List termvos = (List)termentry.getValue();
            UFDouble totalRate = UFDouble.ZERO_DBL;
            for (int i = 0; i < termvos.size() - 1; ++i) {
                TermVO vo = (TermVO)termvos.get(i);
                UFDouble rate = vo.getMoney_cr().add(vo.getMoney_de()).div(totalAmount).multiply(100.0).setScale(2, 0);
                vo.setAccRate("" + rate);
                totalRate = totalRate.add(rate);
            }
            ((TermVO)termvos.get(termvos.size() - 1)).setAccRate("" + new UFDouble(100).sub(totalRate, 2));
        }
    }

    public TermVO[] queryTermVOByBillItemPK(String[] pkBillItem) throws BusinessException {
        List vos = null;
        try {
            vos = (List)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(TermVO.class, SqlUtils.getInStr((String)"pk_item", (String[])pkBillItem), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        TermVO[] retVos = null;
        if (null != vos && vos.size() > 0) {
            retVos = new TermVO[vos.size()];
            for (int i = 0; i < retVos.length; ++i) {
                retVos[i] = (TermVO)vos.get(i);
            }
            return retVos;
        }
        return retVos;
    }
}

