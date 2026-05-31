/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.arap.bill.IArapBillService
 *  nc.itf.arap.billconfer.IBillConferService
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.arap.billconfer.BillconferVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.uap.rbac.role.RoleVO
 *  nccloud.pubitf.arap.arappub.IBillConferWebService
 */
package nccloud.pubimpl.arap.arappub;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.bill.IArapBillService;
import nc.itf.arap.billconfer.IBillConferService;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.billconfer.BillconferVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.uap.rbac.role.RoleVO;
import nccloud.pubitf.arap.arappub.IBillConferWebService;

public class BillConferWebServiceImpl
implements IBillConferWebService {
    public void deleteConfer(BillconferVO vo) throws BusinessException {
        IBillConferService service = (IBillConferService)NCLocator.getInstance().lookup(IBillConferService.class);
        service.deleteConfer(vo);
    }

    public BillconferVO findConferByPK(String pk_confer) throws BusinessException {
        IBillConferService service = (IBillConferService)NCLocator.getInstance().lookup(IBillConferService.class);
        return service.findConferByPK(pk_confer);
    }

    public void insertConfer(BillconferVO voConfer) throws BusinessException {
        String pk_corp = InvocationInfoProxy.getInstance().getGroupId();
        voConfer.setCreator(InvocationInfoProxy.getInstance().getGroupId());
        voConfer.setPk_group(pk_corp);
        UFDateTime creationtime = new UFDateTime(new Date());
        voConfer.setCreationtime(creationtime);
        voConfer.setPk_bconfer("");
        this.check(voConfer);
        IBillConferService service = (IBillConferService)NCLocator.getInstance().lookup(IBillConferService.class);
        service.insertConfer(voConfer);
    }

    public BillconferVO[] queryConferByCorpPk() throws BusinessException {
        String pk_corp = InvocationInfoProxy.getInstance().getGroupId();
        IBillConferService service = (IBillConferService)NCLocator.getInstance().lookup(IBillConferService.class);
        BillconferVO[] vo = service.queryConferByCorpPk(pk_corp);
        if (vo == null || vo.length == 0) {
            return null;
        }
        StringBuffer str = new StringBuffer("(");
        String[] ser = null;
        Boolean isNoReceivers = true;
        for (BillconferVO billvo : vo) {
            if (billvo.getReceivers() == null) continue;
            for (String pk : ser = billvo.getReceivers().split(",")) {
                isNoReceivers = false;
                str.append("'" + pk + "',");
            }
        }
        if (isNoReceivers.booleanValue()) {
            return vo;
        }
        String whereSql = str.substring(0, str.length() - 1) + ")";
        final ArrayList result = new ArrayList();
        String sql = "select role_code,role_name,pk_role from sm_role where pk_role in " + whereSql;
        BaseDAO dao = new BaseDAO();
        try {
            dao.executeQuery(sql, new ResultSetProcessor(){
                private static final long serialVersionUID = 1L;

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    while (rs.next()) {
                        RoleVO roleVo = new RoleVO();
                        roleVo.setRole_code(rs.getString("role_code"));
                        roleVo.setRole_name(rs.getString("role_name"));
                        roleVo.setPk_role(rs.getString("pk_role"));
                        result.add(roleVo);
                    }
                    return rs;
                }
            });
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        StringBuffer buffer = new StringBuffer();
        for (BillconferVO billVO : vo) {
            if (billVO.getReceivers() == null) continue;
            for (RoleVO role : result) {
                if (!billVO.getReceivers().contains(role.getPk_role())) continue;
                buffer.append(role.getRole_name() + ",");
            }
            if (buffer != null && buffer.length() > 0) {
                billVO.setReceiversName(buffer.substring(0, buffer.length() - 1));
            }
            buffer.setLength(0);
        }
        return vo;
    }

    public void updateConfer(BillconferVO voconfer) throws BusinessException {
        this.check(voconfer);
        IBillConferService service = (IBillConferService)NCLocator.getInstance().lookup(IBillConferService.class);
        service.updateConfer(voconfer);
    }

    public void check(BillconferVO vo1) throws BusinessException {
        if (null != vo1.getReceivers() && vo1.getReceivers().toString().length() > 500) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0138"));
        }
        if (null != vo1.getScomment() && vo1.getScomment().toString().length() > 101) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0911", null, new String[]{vo1.getScomment().toString().length() + ""}));
        }
        this.checkData(vo1);
    }

    private void checkData(BillconferVO vo) throws BusinessException {
        HashMap<String, String> typeRules = new HashMap<String, String>();
        typeRules.put("F0", "F1");
        typeRules.put("F1", "F0");
        typeRules.put("F2", "F3");
        typeRules.put("F3", "F2");
        if (vo.getSourceorg() != null && vo.getTargetorg() != null && vo.getSourceorg().equals(vo.getTargetorg())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0873"));
        }
        String sourceBill = vo.getSourcebill();
        String targetBill = vo.getTargetbill();
        if (sourceBill != null && targetBill != null && !(sourceBill = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).getParentBillTypeByTradeType(sourceBill, InvocationInfoProxy.getInstance().getGroupId())).equals(typeRules.get(targetBill = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).getParentBillTypeByTradeType(targetBill, InvocationInfoProxy.getInstance().getGroupId())))) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0874"));
        }
    }
}

