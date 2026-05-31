/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.logging.Log
 *  nc.jdbc.framework.mapping.IMappingMeta
 *  nc.vo.arap.badacc.BadAccDstlDetailVO
 *  nc.vo.arap.badacc.BadAccDstlVO
 *  nc.vo.arap.badacc.DstlCaseDetailVO
 *  nc.vo.arap.badacc.DstlCaseRateVO
 *  nc.vo.arap.badacc.DstlCaseVO
 *  nc.vo.arap.badacc.DstlCaseVOMeta
 *  nc.vo.arap.baddebts.BaddebtsOccuVO
 *  nc.vo.arap.global.ArapBillDealVOConsts
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.initdata.update;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.logging.Log;
import nc.jdbc.framework.mapping.IMappingMeta;
import nc.vo.arap.badacc.BadAccDstlDetailVO;
import nc.vo.arap.badacc.BadAccDstlVO;
import nc.vo.arap.badacc.DstlCaseDetailVO;
import nc.vo.arap.badacc.DstlCaseRateVO;
import nc.vo.arap.badacc.DstlCaseVO;
import nc.vo.arap.badacc.DstlCaseVOMeta;
import nc.vo.arap.baddebts.BaddebtsOccuVO;
import nc.vo.arap.global.ArapBillDealVOConsts;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.StringUtils;

public class BadAccDstlUpdate4V602V61 {
    private BaseDAO dao = null;

    public void doUpdate(String oldVersion, String newVersion) throws BusinessException {
        String[] delSqls;
        this.doBackup();
        this.mergeBadAccount();
        Collection dstlCaseVOs = this.getDAO().retrieveByClause(DstlCaseVO.class, (IMappingMeta)new DstlCaseVOMeta(), "startflag = 1 ");
        HashMap<String, DstlCaseVO> dstlCaseVOMap = new HashMap<String, DstlCaseVO>();
        for (DstlCaseVO dstlCaseVO : dstlCaseVOs) {
            dstlCaseVOMap.put(dstlCaseVO.getPk_org() + this.getSplitor() + dstlCaseVO.getPk_dstlcase(), dstlCaseVO);
        }
        for (String updateKey : dstlCaseVOMap.keySet()) {
            this.doUpdateByOrg(updateKey, dstlCaseVOMap);
        }
        for (String delSql : delSqls = new String[]{"delete from " + new BadAccDstlVO().getTableName() + " where dr = 2", "delete from " + new BadAccDstlDetailVO().getTableName() + " where dr = 2"}) {
            this.executeSql(delSql);
        }
    }

    private void executeSql(String delSql) throws DAOException {
        this.getDAO().executeUpdate(delSql);
    }

    private void mergeBadAccount() throws BusinessException {
        String[] mergeSqls;
        for (String mergeSql : mergeSqls = new String[]{"insert into arap_baddebts_occh (BILLMAKER, BUSIDATE, BUSIFLAG, BUSINO, BUSIPERIOD, BUSIYEAR, DR, GLOBAL_MONEY, GROUP_MONEY, LOCAL_MONEY, MONEY, PK_BADDEBTS_OCCH, PK_BILLTYPE, PK_GROUP, PK_ORG, QUANTITY, SCOMMENT, TS) select BILLMAKER, BUSIDATE, BUSIFLAG, BUSINO, BUSIPERIOD, BUSIYEAR, DR, GLOBAL_MONEY, GROUP_MONEY, LOCAL_MONEY, MONEY, PK_BADDEBTS_RECH, PK_BILLTYPE, PK_GROUP, PK_ORG, QUANTITY, SCOMMENT, TS from arap_baddebts_rech ", "insert into arap_baddebts_occu (BILLCLASS, BILLDATE, BILLMAKER, BILLNO, BUSIDATE, BUSIFLAG, BUSINO, BUSIPERIOD, BUSIYEAR, CUSTOMER, DR, EXPIREDATE, GLOBAL_MONEY, GLOBALRATE, GROUP_MONEY, GROUPRATE, INNERCTLDEFERDAYS, LOCAL_MONEY, MONEY, OBJTYPE, ORDERCUBASDOC, PK_BADDEBTS_OCCH, PK_BADDEBTS_OCCU, PK_BILL, PK_BILLTYPE, PK_BUSIDATA, PK_CURRTYPE, PK_DEPTID, PK_DSTLCASE_B, PK_GROUP, PK_ITEM, PK_ORG, PK_PSNDOC, PK_TERMITEM, QUANTITY, RATE, SCOMMENT, SUPPLIER, TS) select BILLCLASS, BILLDATE, BILLMAKER, BILLNO, BUSIDATE, BUSIFLAG, BUSINO, BUSIPERIOD, BUSIYEAR, CUSTOMER, DR, EXPIREDATE, GLOBAL_MONEY, GLOBALRATE, GROUP_MONEY, GROUPRATE, INNERCTLDEFERDAYS, LOCAL_MONEY, MONEY, OBJTYPE, ORDERCUBASDOC, PK_BADDEBTS_RECH, PK_BADDEBTS_RECE, PK_BILL, PK_BILLTYPE, PK_BUSIDATA, PK_CURRTYPE, PK_DEPTID, PK_DSTLCASE_B, PK_GROUP, PK_ITEM, PK_ORG, PK_PSNDOC, PK_TERMITEM, QUANTITY, RATE, SCOMMENT, SUPPLIER, TS from arap_baddebts_rece ", "update arap_baddebts_occh set busiflag = 3 where busiflag = 0", "update arap_baddebts_occh set busiflag = 4 where busiflag = 1", "update arap_baddebts_occu set busiflag = 3 where busiflag = 0", "update arap_baddebts_occu set busiflag = 4 where busiflag = 1", "delete from arap_baddebts_rech", "delete from arap_baddebts_rece"}) {
            this.executeSql(mergeSql);
        }
    }

    private void doUpdateInitDate(BadAccDstlVO dstl, Collection<BadAccDstlDetailVO> dstlDetailVOs) throws BusinessException {
        if (dstlDetailVOs.size() > 0) {
            ArrayList<BadAccDstlDetailVO> newTimeDetails = new ArrayList<BadAccDstlDetailVO>();
            for (BadAccDstlDetailVO vo : dstlDetailVOs) {
                UFDouble inimoney = this.getDstlcaseInitMoney(dstl.getPk_badaccdstl(), vo.getPk_badaccdstl_b());
                vo.setPreleftmoney(inimoney);
                if (null == vo.getPk_dstlcase_b_b()) {
                    vo.setPk_dstlcase_b_b(ArapBillDealVOConsts.DEFAULTNULL);
                }
                newTimeDetails.add(vo);
            }
            this.dao.updateVOArray((SuperVO[])newTimeDetails.toArray(new BadAccDstlDetailVO[0]));
        }
    }

    private void doUpdateByOrg(String updateKey, Map<String, DstlCaseVO> dstlCaseVOMap) throws BusinessException {
        String pk_org = updateKey.split(this.getSplitor())[0];
        String pk_dstlCase = updateKey.split(this.getSplitor())[1];
        String whereSql = "pk_org = '" + pk_org + "' and " + "pk_dstlcase" + " = '" + pk_dstlCase + "' and dr != 2 ";
        Collection dstlVOs = this.getDAO().retrieveByClause(BadAccDstlVO.class, whereSql);
        if (dstlVOs.size() > 0) {
            BaseDAO dao = this.getDAO();
            for (BadAccDstlVO oldDstlVO : dstlVOs) {
                this.updateByAccDstl(updateKey, dstlCaseVOMap, pk_org, pk_dstlCase, whereSql, dao, oldDstlVO);
            }
        }
    }

    private void updateByAccDstl(String updateKey, Map<String, DstlCaseVO> dstlCaseVOMap, String pk_org, String pk_dstlCase, String whereSql, BaseDAO dao, BadAccDstlVO oldDstlVO) throws DAOException, BusinessException {
        String sql = "pk_badaccdstl = '" + oldDstlVO.getPk_badaccdstl() + "' ";
        Collection dstlDetailVOs = this.getDAO().retrieveByClause(BadAccDstlDetailVO.class, sql);
        if (oldDstlVO.getDistillor() == null && oldDstlVO.getDstlyr() == null && oldDstlVO.getDuration() == null) {
            oldDstlVO.setDstlmoneys(null);
            oldDstlVO.setLastdistillor(ArapBillDealVOConsts.DEFAULTNULL);
            oldDstlVO.setLastdrt(null);
            oldDstlVO.setDstldt(null);
            oldDstlVO.setLastyr(null);
            oldDstlVO.setLastdstlmoney(null);
            dao.updateVO((SuperVO)oldDstlVO);
            this.doUpdateInitDate(oldDstlVO, dstlDetailVOs);
        } else {
            List<BadAccDstlDetailVO> resultVOs = this.getUpdateDstlBody(pk_org, oldDstlVO, dstlCaseVOMap.get(updateKey), dstlDetailVOs);
            BadAccDstlVO dstlVO = this.getUpdateDstlHead(pk_org, pk_dstlCase, oldDstlVO, resultVOs);
            if (dstlVO.getDistillor() != null && !ArapBillDealVOConsts.DEFAULTNULL.equals(dstlVO.getDistillor())) {
                dstlVO.setLastdistillor(dstlVO.getDistillor());
                dstlVO.setLastdstlmoney(dstlVO.getDstlmoney());
                dstlVO.setLastyr(dstlVO.getDstlyr());
                dstlVO.setLastdrt(dstlVO.getDuration() == null ? null : dstlVO.getDuration());
            }
            dao.deleteByClause(BadAccDstlVO.class, whereSql + " and " + "pk_badaccdstl" + " = '" + oldDstlVO.getPk_badaccdstl() + "' ");
            dao.deleteByClause(BadAccDstlDetailVO.class, "pk_badaccdstl = '" + oldDstlVO.getPk_badaccdstl() + "' ");
            dao.insertVOWithPK((SuperVO)dstlVO);
            dao.insertVOArrayWithPK((SuperVO[])resultVOs.toArray(new BadAccDstlDetailVO[0]));
        }
    }

    private BadAccDstlVO getUpdateDstlHead(String pk_org, String pk_dstlCase, BadAccDstlVO dstlVO, List<BadAccDstlDetailVO> dstlDetailVOs) {
        BadAccDstlVO newDstlVO = (BadAccDstlVO)dstlVO.clone();
        newDstlVO.setDstlmoney(UFDouble.ZERO_DBL);
        newDstlVO.setPremoney(UFDouble.ZERO_DBL);
        for (BadAccDstlDetailVO detailVO : dstlDetailVOs) {
            newDstlVO.setDstlmoney(newDstlVO.getDstlmoney().add(this.nvl(detailVO.getDstlmoney())));
            newDstlVO.setPremoney(newDstlVO.getPremoney().add(this.nvl(detailVO.getPremoney())));
        }
        return newDstlVO;
    }

    private Map<String, DstlCaseRateVO> countPremoney(BadAccDstlVO dstlVO, DstlCaseVO dstlCaseVO) throws DAOException {
        String sql = null;
        HashMap<String, DstlCaseRateVO> rateMap = new HashMap<String, DstlCaseRateVO>();
        sql = " dstlyear = '" + dstlVO.getDstlyr() + "' and pk_dstlcase = '" + dstlVO.getPk_dstlcase() + "'";
        if (dstlCaseVO.getDstlfrq() != 0) {
            sql = sql + " and dstldrt = '" + dstlVO.getDuration() + "'";
        }
        Collection rateVOs = this.getDAO().retrieveByClause(DstlCaseRateVO.class, sql);
        for (DstlCaseRateVO vo : rateVOs) {
            if (dstlCaseVO.getDstltype() != 2) {
                rateMap.put(vo.getPk_dstlcase_b(), vo);
                continue;
            }
            rateMap.put(vo.getPk_dstlcase_b_b(), vo);
        }
        return rateMap;
    }

    private List<BadAccDstlDetailVO> getUpdateDstlBody(String pk_org, BadAccDstlVO dstlVO, DstlCaseVO dstlCaseVO, Collection<BadAccDstlDetailVO> dstlDetailVOs) throws BusinessException {
        UFDouble percnt = null;
        String baddebtSql = null;
        BadAccDstlDetailVO newDstlDetailVO = null;
        Map<String, DstlCaseRateVO> caseRateMap = this.countPremoney(dstlVO, dstlCaseVO);
        ArrayList<BadAccDstlDetailVO> newDstlDetailVOs = new ArrayList<BadAccDstlDetailVO>();
        for (BadAccDstlDetailVO dstlDetailVO : dstlDetailVOs) {
            newDstlDetailVO = (BadAccDstlDetailVO)dstlDetailVO.clone();
            newDstlDetailVOs.add(newDstlDetailVO);
            baddebtSql = "pk_org = '" + pk_org + "' and " + "pk_dstlcase_b" + " = '" + dstlDetailVO.getPk_dstlcase_b() + "' ";
            Collection occuVOs = this.getDAO().retrieveByClause(BaddebtsOccuVO.class, baddebtSql);
            if (dstlCaseVO.getDstltype() != 2) {
                DstlCaseRateVO dstlCaseRateVO = caseRateMap.get(dstlDetailVO.getPk_dstlcase_b());
                percnt = dstlCaseRateVO == null ? null : dstlCaseRateVO.getPercnt();
            } else if (dstlDetailVO.getPk_dstlcase_b_b() != null && !ArapBillDealVOConsts.DEFAULTNULL.equals(dstlDetailVO.getPk_dstlcase_b_b())) {
                percnt = caseRateMap.get(dstlDetailVO.getPk_dstlcase_b_b()).getPercnt();
            }
            newDstlDetailVO.setPercnt(percnt);
            newDstlDetailVO.setRcvmoeny(percnt == null || UFDouble.ZERO_DBL.equals((Object)percnt) ? newDstlDetailVO.getRcvmoeny() : this.nvl(dstlDetailVO.getPremoney()).multiply(100.0).div(percnt));
            if (dstlCaseVO.getDstltype() == 0) {
                newDstlDetailVO.setPreleftmoney(this.nvl(dstlDetailVO.getPreleftmoney()));
            } else {
                newDstlDetailVO.setPreleftmoney(this.nvl(dstlDetailVO.getPremoney()).sub(this.nvl(dstlDetailVO.getDstlmoney())));
            }
            if (null == dstlDetailVO.getPk_dstlcase_b_b()) {
                newDstlDetailVO.setPk_dstlcase_b_b(ArapBillDealVOConsts.DEFAULTNULL);
            }
            for (BaddebtsOccuVO occuVO : occuVOs) {
                if (dstlCaseVO.getDstltype() == 2 && !StringUtils.isEmpty((CharSequence)dstlDetailVO.getPk_dstlcase_b_b()) && dstlDetailVO.getPk_dstlcase_b_b().trim().length() >= 2) continue;
                if (dstlCaseVO.getDstlfrq() == 0) {
                    if (occuVO.getPk_org().equals(pk_org) && occuVO.getBusiflag() == 3 && occuVO.getBusiyear().equals(dstlVO.getDstlyr())) {
                        newDstlDetailVO.setPreleftmoney(newDstlDetailVO.getPreleftmoney().sub(occuVO.getLocal_money()));
                        continue;
                    }
                    newDstlDetailVO.setPreleftmoney(newDstlDetailVO.getPreleftmoney().add(occuVO.getLocal_money()));
                    continue;
                }
                if (occuVO.getPk_org().equals(pk_org) && occuVO.getBusiflag() == 3 && occuVO.getBusiperiod().equals(dstlVO.getDuration()) && occuVO.getBusiyear().equals(dstlVO.getDstlyr())) {
                    newDstlDetailVO.setPreleftmoney(newDstlDetailVO.getPreleftmoney().sub(occuVO.getLocal_money()));
                    continue;
                }
                newDstlDetailVO.setPreleftmoney(newDstlDetailVO.getPreleftmoney().add(occuVO.getLocal_money()));
            }
        }
        return newDstlDetailVOs;
    }

    private UFDouble getDstlcaseInitMoney(String pk_dstlcase, String pk_dstlcase_b) throws BusinessException {
        String cond = "pk_dstlcase = '" + pk_dstlcase + "' and " + "pk_dstlcase_b" + " = '" + pk_dstlcase_b + "' ";
        Collection dstlCaseDetailVOs = this.getDAO().retrieveByClause(DstlCaseDetailVO.class, cond);
        if (dstlCaseDetailVOs == null || dstlCaseDetailVOs.size() == 0) {
            return UFDouble.ZERO_DBL;
        }
        UFDouble inimoney = ((DstlCaseDetailVO)dstlCaseDetailVOs.iterator().next()).getInimoney();
        return inimoney == null ? UFDouble.ZERO_DBL : inimoney;
    }

    private UFDouble nvl(UFDouble dbl) {
        return dbl == null ? UFDouble.ZERO_DBL : dbl;
    }

    private void doBackup() throws BusinessException {
        String[] bckSqls = new String[]{" create table arap_badaccdstl_2 as select * from arap_badaccdstl ", " create table arap_badaccdstl_b_2 as select * from arap_badaccdstl_b ", " create table arap_baddebts_occh_2 as select * from arap_baddebts_occh ", " create table arap_baddebts_occu_2 as select * from arap_baddebts_occu ", " create table arap_baddebts_rech_2 as select * from arap_baddebts_rech ", " create table arap_baddebts_rece_2 as select * from arap_baddebts_rece "};
        try {
            for (String sql : bckSqls) {
                this.executeSql(sql);
            }
        }
        catch (Exception e) {
            String errMsg = "ARAP Bad Account Dstl Backup Error, If Ever Done Update, Neglect It.";
            Log.getInstance(this.getClass()).error((Object)errMsg, (Throwable)e);
        }
    }

    private String getSplitor() {
        return "#_#_#";
    }

    private BaseDAO getDAO() {
        if (this.dao == null) {
            this.dao = new BaseDAO();
        }
        return this.dao;
    }
}

