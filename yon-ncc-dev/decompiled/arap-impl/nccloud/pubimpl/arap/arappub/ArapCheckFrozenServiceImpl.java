/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.AccperiodmonthAccessor
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.sec.esapi.NCESAPI
 *  nc.impl.pubapp.pattern.database.DataAccessUtils
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.arap.agiotage.AgiotageBzVO
 *  nc.vo.arap.agiotage.AgiotageMainVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pattern.pub.SqlBuilder
 *  nc.web.arap.util.AgiotageUtil
 *  nccloud.dto.arap.arappub.info.CommonInfo
 *  nccloud.itf.arap.pub.IArapCheckFrozenService
 *  nccloud.vo.arap.bdloss.BdLossVO
 *  nccloud.vo.arap.bdrecovery.BdRecoveryVO
 */
package nccloud.pubimpl.arap.arappub;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import nc.bd.accperiod.AccperiodmonthAccessor;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.sec.esapi.NCESAPI;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.arap.agiotage.AgiotageBzVO;
import nc.vo.arap.agiotage.AgiotageMainVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pattern.pub.SqlBuilder;
import nc.web.arap.util.AgiotageUtil;
import nccloud.dto.arap.arappub.info.CommonInfo;
import nccloud.itf.arap.pub.IArapCheckFrozenService;
import nccloud.vo.arap.bdloss.BdLossVO;
import nccloud.vo.arap.bdrecovery.BdRecoveryVO;

public class ArapCheckFrozenServiceImpl
implements IArapCheckFrozenService {
    private String FROZEN_ERROR;

    public ArapCheckFrozenServiceImpl() {
        this.FROZEN_ERROR = new ArapConstant().ARAP_SAGA_FROZEN_ONE;
    }

    public int findFrozenBills(String pk_org, String accperiod, String[] pkBilltypes) throws BusinessException {
        AccperiodmonthVO accperiodvo = AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByPk(accperiod);
        UFDate begintime = accperiodvo.getBegindate();
        UFDate endtime = accperiodvo.getEnddate();
        DataAccessUtils utils = new DataAccessUtils();
        SqlBuilder sql = new SqlBuilder();
        int count = 0;
        for (String billtype : pkBilltypes) {
            sql.append(" select count(");
            sql.append("saga_frozen");
            sql.append(") from ");
            sql.append(ArapBillTypeInfo.getInstance((Object)billtype).getTableNameBill());
            sql.append(" where '");
            sql.append(NCESAPI.clientSqlEncode((String)begintime.toString()));
            sql.append("' < billdate ");
            sql.append(" and  '");
            sql.append(NCESAPI.clientSqlEncode((String)endtime.toString()));
            sql.append("' >billdate ");
            sql.append(" and ");
            sql.append("pk_org");
            sql.append(" ='");
            sql.append(NCESAPI.clientSqlEncode((String)pk_org));
            sql.append("'");
            sql.append(" and ");
            sql.append("saga_frozen", 1);
            sql.append(" and ");
            sql.append(" isnull(dr,0)=0 ");
            String[] c2 = utils.query(sql.toString()).toOneDimensionStringArray();
            sql.reset();
            count += Integer.parseInt(c2[0]);
        }
        return count;
    }

    public SuperVO[] findFrozenLossAndRecByDate(String pk_org, UFDate beginDate, UFDate endDate) throws BusinessException {
        if (pk_org == null || beginDate == null || endDate == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006baddebts_0", "02006baddebts-0053"));
        }
        BaseDAO dao = new BaseDAO();
        SqlBuilder sql = new SqlBuilder();
        sql.append("pk_org");
        sql.append("='");
        sql.append(NCESAPI.clientSqlEncode((String)pk_org));
        sql.append("'");
        sql.append(" and ");
        sql.append("billdate");
        sql.append(" >= ");
        sql.append(" '");
        sql.append(NCESAPI.clientSqlEncode((String)beginDate.toString()));
        sql.append("' ");
        sql.append(" and ");
        sql.append("billdate");
        sql.append(" <= ");
        sql.append(" '");
        sql.append(NCESAPI.clientSqlEncode((String)endDate.toString()));
        sql.append("' ");
        sql.append(" and ");
        sql.append("saga_frozen", 1);
        sql.append(" and ");
        sql.append(" isnull(dr,0)=0 ");
        Collection bdlossVOs = dao.retrieveByClause(BdLossVO.class, sql.toString());
        Collection bdrecoveryVOs = dao.retrieveByClause(BdRecoveryVO.class, sql.toString());
        if (bdlossVOs == null) {
            return bdrecoveryVOs == null ? null : bdrecoveryVOs.toArray(new SuperVO[0]);
        }
        bdlossVOs.addAll(bdrecoveryVOs);
        return bdlossVOs.toArray(new SuperVO[0]);
    }

    public boolean checkFrozenForCloseAccount(String pk_org, String period, String prodId, String moudleId) throws BusinessException {
        String[] tables;
        String[] c;
        String[] tablename1;
        SqlBuilder sql = new SqlBuilder();
        DataAccessUtils utils = new DataAccessUtils();
        int billperiod = Integer.parseInt(period.substring(5, 7));
        AccountCalendar calendar = AccountCalendar.getInstanceByPk_org((String)pk_org);
        calendar.set(period.substring(0, 4), period.substring(5, 7));
        AccperiodmonthVO monthVO = calendar.getMonthVO();
        UFDate begintime = monthVO.getBegindate();
        UFDate endtime = monthVO.getEnddate();
        int count = 0;
        if ("AR".equals(prodId) && "2006".equals(moudleId)) {
            tablename1 = new String[]{"ar_recbill", "ar_gatherbill", "ar_estirecbill", "arap_indiprovision", "arap_bdprovision"};
            for (String table : tablename1) {
                sql.append(" select count(");
                sql.append("saga_frozen");
                sql.append(") from ");
                sql.append(table);
                sql.append(" where ");
                sql.append("saga_frozen", 1);
                sql.append(" and ");
                sql.append("pk_org");
                sql.append(" ='");
                sql.append(NCESAPI.clientSqlEncode((String)pk_org));
                sql.append("'");
                sql.append(" and ");
                sql.append("billdate");
                sql.append(" between '");
                sql.append((Object)begintime);
                sql.append("' and '");
                sql.append((Object)endtime);
                sql.append("' and isnull(dr,0)=0 ");
                c = utils.query(sql.toString()).toOneDimensionStringArray();
                sql.reset();
                count += Integer.parseInt(c[0]);
            }
        } else if ("AP".equals(prodId) && "2008".equals(moudleId)) {
            tablename1 = new String[]{"ap_payablebill", "ap_paybill", "ap_estipayablebill"};
            for (String table : tablename1) {
                sql.append(" select count(saga_frozen) from ");
                sql.append(table);
                sql.append(" where ");
                sql.append("saga_frozen", 1);
                sql.append(" and ");
                sql.append("pk_org");
                sql.append(" ='");
                sql.append(NCESAPI.clientSqlEncode((String)pk_org));
                sql.append("'");
                sql.append(" and ");
                sql.append("billdate");
                sql.append(" between '");
                sql.append((Object)begintime);
                sql.append("' and '");
                sql.append((Object)endtime);
                sql.append("' and isnull(dr,0)=0 ");
                c = utils.query(sql.toString()).toOneDimensionStringArray();
                sql.reset();
                count += Integer.parseInt(c[0]);
            }
        }
        for (String table : tables = new String[]{"arap_verify", "arap_agiotage", "arap_transfer_h"}) {
            sql.append(" select count(");
            sql.append("saga_frozen");
            sql.append(") from ");
            sql.append(table);
            sql.append(" where ");
            sql.append("saga_frozen", 1);
            sql.append(" and ");
            sql.append("pk_org");
            sql.append(" ='");
            sql.append(NCESAPI.clientSqlEncode((String)pk_org));
            sql.append("'");
            sql.append(" and ");
            if (table.equals("arap_transfer_h")) {
                sql.append("busiperiod", billperiod);
                sql.append(" and isnull(dr,0)=0 ");
            } else if (table.equals("arap_agiotage")) {
                sql.append("busidate");
                sql.append(" between '");
                sql.append((Object)begintime);
                sql.append("' and '");
                sql.append((Object)endtime);
                sql.append("' and isnull(dr,0)=0 ");
            } else if (table.equals("arap_verify")) {
                sql.append("busidate");
                sql.append(" between '");
                sql.append((Object)begintime);
                sql.append("' and '");
                sql.append((Object)endtime);
                sql.append("' and isnull(dr,0)=0 ");
            }
            c = utils.query(sql.toString()).toOneDimensionStringArray();
            sql.reset();
            count += Integer.parseInt(c[0]);
        }
        return count == 0;
    }

    public boolean checkFrozenForAgiotage(String pk_org, String date, String sfbz, AgiotageBzVO[] vos) throws BusinessException {
        DataAccessUtils utils = new DataAccessUtils();
        SqlBuilder sql = new SqlBuilder();
        String[] bzbm = new String[vos.length];
        int i = 0;
        UFBoolean flag = AgiotageUtil.getZgyfMode((String)pk_org, (Integer)(sfbz.equals("Ys") ? 0 : 1));
        sql.append(" select ");
        sql.append("billno");
        sql.append(" from arap_busidata where ");
        sql.append("pk_org");
        sql.append(" ='");
        sql.append(NCESAPI.clientSqlEncode((String)pk_org));
        sql.append("'");
        for (AgiotageBzVO vo : vos) {
            bzbm[i] = vo.getBzbm();
            ++i;
        }
        sql.append(" and ");
        sql.append("pk_currtype", bzbm);
        sql.append(" and ");
        sql.append("saga_frozen", 1);
        sql.append(" and ");
        sql.append(" billdate <='");
        sql.append(NCESAPI.clientSqlEncode((String)date));
        sql.append("'");
        sql.append(" and billclass in ");
        if (flag.booleanValue()) {
            if ("Ys".equals(sfbz)) {
                sql.append("('");
                sql.append("ys");
                sql.append("','");
                sql.append("sk");
                sql.append("','");
                sql.append("zs");
                sql.append("')");
            } else {
                sql.append("('");
                sql.append("yf");
                sql.append("','");
                sql.append("fk");
                sql.append("','");
                sql.append("zf");
                sql.append("')");
            }
        } else if ("Ys".equals(sfbz)) {
            sql.append("('");
            sql.append("ys");
            sql.append("','");
            sql.append("sk");
            sql.append("')");
        } else {
            sql.append("('");
            sql.append("yf");
            sql.append("','");
            sql.append("fk");
            sql.append("')");
        }
        sql.append(" and dr=0 ");
        CharSequence[] billno = utils.query(sql.toString()).toOneDimensionStringArray();
        int count = billno.length;
        if (count == 0) {
            return true;
        }
        if (0 < count && count < 10) {
            String msg = String.join((CharSequence)",", billno);
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1082") + msg);
        }
        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1083") + count);
    }

    public CommonInfo[] checkFrozenBadDebtsBills(CommonInfo[] infos) throws BusinessException {
        if (infos == null || infos.length < 1) {
            return null;
        }
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select ");
        sql.append("pk_bill");
        sql.append(" from ");
        DataAccessUtils utils = new DataAccessUtils();
        String billtype = infos[0].getBillType();
        if ("BDP".equals(billtype)) {
            CommonInfo[] infosfilter = this.checkFrozenInBadDebtsProvisionBill(infos, billtype);
            return infosfilter;
        }
        Map<String, String> map = this.adaptTablenameByBilltype(billtype);
        if (map.isEmpty()) {
            return null;
        }
        if (infos.length == 1) {
            sql.append(map.get("table_child") + " where ");
            sql.append(map.get("pk"), infos[0].getPk_bill());
            String pkrec = utils.query(sql.toString()).toOneDimensionStringArray()[0];
            sql.reset();
            sql.append(" select count(");
            sql.append("saga_frozen");
            sql.append(")");
            sql.append(" from arap_busidata where ");
            sql.append("pk_bill", pkrec);
            sql.append(" and ");
            sql.append("saga_frozen", 1);
            sql.append(" and ");
            sql.append("billclass", "ys");
            int frozen = Integer.parseInt(utils.query(sql.toString()).toOneDimensionStringArray()[0]);
            if (frozen == 1) {
                throw new BusinessException(this.FROZEN_ERROR);
            }
            return infos;
        }
        String[] pkbill = new String[infos.length];
        sql.append(map.get("table_child") + " where ");
        for (int i = 0; i < infos.length; ++i) {
            pkbill[i] = infos[i].getPk_bill();
        }
        sql.append(map.get("pk"), pkbill);
        String[] pkrec = utils.query(sql.toString()).toOneDimensionStringArray();
        sql.reset();
        sql.append(" select ");
        sql.append("billno");
        sql.append(" from ");
        sql.append("arap_busidata where ");
        sql.append(SqlUtils.getInStr((String)"pk_bill", (String[])pkrec));
        sql.append(" and ");
        sql.append("saga_frozen", 1);
        sql.append(" and ");
        sql.append("billclass", "ys");
        String[] billno = utils.query(sql.toString()).toOneDimensionStringArray();
        if (billno.length == infos.length) {
            throw new BusinessException(this.FROZEN_ERROR);
        }
        if (billno.length == 0) {
            return infos;
        }
        if (billno.length < infos.length) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0019") + billno.toString() + this.FROZEN_ERROR);
        }
        return null;
    }

    public Map<String, String> adaptTablenameByBilltype(String billtype) {
        HashMap<String, String> map = new HashMap<String, String>();
        if ("BDL".equals(billtype)) {
            map.put("table_child", "arap_bdloss_d");
            map.put("pk", "pk_bdloss");
            return map;
        }
        if ("BDR".equals(billtype)) {
            map.put("table_child", "arap_bdrecovery_sk");
            map.put("pk", "pk_bdrecovery");
            return map;
        }
        if ("BDPI".equals(billtype)) {
            map.put("table_child", "arap_indiprovision_d");
            map.put("pk", "pk_indiprovision");
            return map;
        }
        if ("BDP".equals(billtype)) {
            map.put("table_child", "arap_bdprovision");
            map.put("pk", "pk_bdprovision");
            return map;
        }
        return null;
    }

    public CommonInfo[] checkFrozenInBadDebtsProvisionBill(CommonInfo[] infos, String billtype) throws BusinessException {
        Map<String, String> map = this.adaptTablenameByBilltype(billtype);
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select ");
        sql.append("pk_bill");
        sql.append(" from ");
        DataAccessUtils utils = new DataAccessUtils();
        if (infos.length == 1) {
            sql.append(map.get("table_child") + " where ");
            sql.append(map.get("pk"), infos[0].getPk_bill());
            sql.append(" and ");
            sql.append("saga_frozen", 1);
            String[] pkrec = utils.query(sql.toString()).toOneDimensionStringArray();
            if (pkrec.length != 0) {
                throw new BusinessException(this.FROZEN_ERROR);
            }
            return infos;
        }
        String[] pkbill = new String[infos.length];
        sql.append(map.get("table_child") + " where ");
        for (int i = 0; i < infos.length; ++i) {
            pkbill[i] = infos[i].getPk_bill();
        }
        sql.append(SqlUtils.getInStr((String)map.get("pk"), (String[])pkbill));
        sql.append(" and ");
        sql.append("saga_frozen", 1);
        String[] pkrec = utils.query(sql.toString()).toOneDimensionStringArray();
        if (pkrec.length == infos.length) {
            throw new BusinessException(this.FROZEN_ERROR);
        }
        if (pkrec.length == 0) {
            return infos;
        }
        if (pkrec.length < infos.length) {
            throw new BusinessException(this.FROZEN_ERROR);
        }
        return null;
    }

    public String[] filterMainTableFrozen(String[] billno) throws BusinessException {
        if (billno == null || billno.length == 0) {
            return null;
        }
        DataAccessUtils utils = new DataAccessUtils();
        SqlBuilder wheresql = new SqlBuilder();
        wheresql.append(" select distinct ");
        wheresql.append("billno");
        wheresql.append(" from arap_busidata where ");
        wheresql.append(SqlUtils.getInStr((String)"billno", (String[])billno));
        wheresql.append(" and ");
        wheresql.append("saga_frozen", 1);
        String[] frozenbillno = utils.query(wheresql.toString()).toOneDimensionStringArray();
        return frozenbillno;
    }

    public boolean checkFrozenForCancelAgiotage(String pk_org, AgiotageMainVO[] vos) throws BusinessException {
        if (vos.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1084"));
        }
        SqlBuilder sql = new SqlBuilder();
        sql.append("saga_frozen", 1);
        sql.append(" and ");
        sql.append("pk_org");
        sql.append(" ='");
        sql.append(NCESAPI.clientSqlEncode((String)pk_org));
        sql.append("'");
        sql.append(" and ");
        String[] dealno = new String[vos.length];
        for (int i = 0; i < vos.length; ++i) {
            dealno[i] = vos[i].getDealno();
        }
        sql.append(SqlUtils.getInStr((String)"dealno", (String[])dealno));
        sql.append("and dr=0");
        Collection rets = new BaseDAO().retrieveByClause(AgiotageMainVO.class, sql.toString());
        return rets.size() == 0;
    }
}

