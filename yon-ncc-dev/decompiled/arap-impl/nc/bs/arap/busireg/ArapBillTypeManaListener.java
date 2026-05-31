/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.logging.Logger
 *  nc.jdbc.framework.SQLParameter
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.IMDPersistenceQueryService
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.fip.billitem.BillItemVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.para.SysInitVO
 *  nc.vo.sm.createcorp.CreateOrgInfo
 *  nc.vo.sm.createcorp.CreatecorpVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.impl.platform.common.util.CollectionUtils
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nc.bs.arap.util.SqlUtils;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.logging.Logger;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.fip.billitem.BillItemVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.para.SysInitVO;
import nc.vo.sm.createcorp.CreateOrgInfo;
import nc.vo.sm.createcorp.CreatecorpVO;
import nccloud.commons.lang.ArrayUtils;
import nccloud.impl.platform.common.util.CollectionUtils;

public class ArapBillTypeManaListener
implements IBusinessListener {
    private static final Set<String> arDjxl = new HashSet<String>(Arrays.asList("D0", "D2", "23C0", "F0-Refund", "F2-Refund"));
    private static final Set<String> apDjxl = new HashSet<String>(Arrays.asList("D1", "D3", "23C1", "F1-Refund", "F3-Refund"));

    public void doAction(IBusinessEvent event) throws BusinessException {
        BusinessEvent e;
        CreateOrgInfo info;
        if (!"1032".equals(event.getEventType()) && "1031".equals(event.getEventType()) && (info = (CreateOrgInfo)(e = (BusinessEvent)event).getObject()) != null && !ArrayUtils.isEmpty((Object[])info.getCreatecorpVOs())) {
            HashSet<String> ar_groups = new HashSet<String>();
            HashSet<String> ap_groups = new HashSet<String>();
            HashSet<String> cmp_groups = new HashSet<String>();
            ArrayList<String> billtypes = new ArrayList<String>();
            for (CreatecorpVO vo : info.getCreatecorpVOs()) {
                if ("2006".equals(vo.getFunccode())) {
                    ar_groups.add(vo.getPk_org());
                    continue;
                }
                if ("2008".equals(vo.getFunccode())) {
                    ap_groups.add(vo.getPk_org());
                    continue;
                }
                if (!"3607".equals(vo.getFunccode())) continue;
                cmp_groups.add(vo.getPk_org());
            }
            if (ar_groups.size() > 0) {
                billtypes.add("F2");
                this.insertDJLXs(ar_groups.toArray(new String[0]), arDjxl);
            }
            if (ap_groups.size() > 0) {
                billtypes.add("F3");
                this.insertDJLXs(ap_groups.toArray(new String[0]), apDjxl);
            }
            if (cmp_groups.size() > 0) {
                if (!billtypes.contains("F2")) {
                    billtypes.add("F2");
                }
                if (!billtypes.contains("F3")) {
                    billtypes.add("F3");
                }
            }
            if (billtypes.size() > 0) {
                this.copyFipBilltype(billtypes);
            }
        }
    }

    void updateSysinit(String pk_tradetypeid, String pk_group, String initCode) {
        BaseDAO baseDAO = new BaseDAO();
        SysInitVO vo = new SysInitVO();
        String sql = " update " + vo.getTableName() + " set VALUE =?  where pk_org = ? and INITCODE = ?  ";
        SQLParameter parameter = new SQLParameter();
        parameter.addParam(pk_tradetypeid);
        parameter.addParam(pk_group);
        parameter.addParam(initCode);
        try {
            baseDAO.executeUpdate(sql, parameter);
        }
        catch (DAOException e) {
            ExceptionHandler.consume((Throwable)e);
        }
    }

    private void copyFipBilltype(List<String> billtypes) {
        List result = null;
        BaseDAO baseDAO = null;
        try {
            baseDAO = new BaseDAO();
            String checkSql = "select distinct pk_billtype from fip_billitem where pk_group ='GLOBLE00000000000000' and attrcode ='zb.settlenum'  and  " + SqlUtils.getInStr((String)"pk_billtype", (String[])billtypes.toArray(new String[0]));
            result = (List)baseDAO.executeQuery(checkSql, (ResultSetProcessor)new ColumnListProcessor());
        }
        catch (DAOException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        ArrayList<String> subtract = new ArrayList<String>();
        for (String billtype : billtypes) {
            if (result.contains(billtype)) continue;
            subtract.add(billtype);
        }
        if (subtract.size() > 0) {
            IMDPersistenceQueryService qryservice = MDPersistenceService.lookupPersistenceQueryService();
            try {
                String querysql = " pk_billtype = '2201'";
                Collection billitemvos = qryservice.queryBillOfVOByCond(BillItemVO.class, querysql, false);
                if (CollectionUtils.isEmpty((Collection)billitemvos)) {
                    String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0300");
                    Logger.debug((Object)msg, this.getClass(), (String)"\u590d\u5236\u7ed3\u7b97\u5355\u636e\u9879\u76ee");
                } else {
                    for (String billtype : subtract) {
                        this.insertByGroup(baseDAO, billitemvos, billtype);
                    }
                }
            }
            catch (MetaDataException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            catch (DAOException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
    }

    private void insertByGroup(BaseDAO baseDAO, Collection<BillItemVO> billitemvos, String billtype) throws DAOException {
        ArrayList<BillItemVO> list = new ArrayList<BillItemVO>();
        for (BillItemVO billItemVO : billitemvos) {
            if (billItemVO.getPosition() == 1 && !billItemVO.getAttrcode().startsWith("zb.")) {
                billItemVO.setAttrcode("zb." + billItemVO.getAttrcode());
            } else {
                if (billItemVO.getPosition() != 2 || billItemVO.getAttrcode().startsWith("fb.")) continue;
                billItemVO.setAttrcode("fb." + billItemVO.getAttrcode());
            }
            billItemVO.setPk_billtype(billtype);
            billItemVO.setPk_billitem(null);
            billItemVO.setStatus(2);
            list.add(billItemVO);
        }
        if (list.size() > 0) {
            baseDAO.insertVOArray((SuperVO[])list.toArray(new BillItemVO[0]));
        }
    }

    private void insertDJLXs(String[] pk_groups, Set<String> djxls) throws BusinessException {
        String djxlbm = null;
        BaseDAO baseDAO = new BaseDAO();
        djxlbm = SqlUtils.getInStr((String)"djlxbm", (String[])djxls.toArray(new String[0]));
        Collection sourcevos = baseDAO.retrieveByClause(DjLXVO.class, " pk_group ='GLOBLE00000000000000' and " + djxlbm + "");
        ArrayList<DjLXVO> indbs = new ArrayList<DjLXVO>();
        for (String pk_group : pk_groups) {
            DjLXVO[] copyOf;
            for (DjLXVO sysvo : copyOf = Arrays.copyOf(sourcevos.toArray(new DjLXVO[0]), sourcevos.size())) {
                sysvo.setPk_group(pk_group);
                sysvo.setPrimaryKey(null);
            }
            indbs.addAll(Arrays.asList(copyOf));
        }
        baseDAO.insertVOArray((SuperVO[])indbs.toArray(new DjLXVO[0]));
    }
}

