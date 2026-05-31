/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.arap.billconfer.IBConferMapService
 *  nc.itf.uap.rbac.IRoleManageQuery
 *  nc.md.data.access.NCObject
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.message.util.MessageCenter
 *  nc.message.vo.MessageVO
 *  nc.message.vo.NCMessage
 *  nc.pubitf.rbac.IPermissionDomainService
 *  nc.vo.arap.billconfer.BcMapVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.uap.rbac.UserRoleVO
 *  nccloud.bs.pub.pf.PfMessageUtil
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  nccloud.message.util.MessageCenter
 *  nccloud.message.vo.NCCMessage
 *  nccloud.pubitf.baseapp.apprbac.IPermissionDomainService4NCC
 */
package nc.impl.arap.billconfer;

import java.util.HashSet;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.billconfer.IBConferMapService;
import nc.itf.uap.rbac.IRoleManageQuery;
import nc.md.data.access.NCObject;
import nc.md.persist.framework.MDPersistenceService;
import nc.message.util.MessageCenter;
import nc.message.vo.MessageVO;
import nc.message.vo.NCMessage;
import nc.pubitf.rbac.IPermissionDomainService;
import nc.vo.arap.billconfer.BcMapVO;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.uap.rbac.UserRoleVO;
import nccloud.bs.pub.pf.PfMessageUtil;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import nccloud.message.vo.NCCMessage;
import nccloud.pubitf.baseapp.apprbac.IPermissionDomainService4NCC;

public class BConferMapServiceImpl
implements IBConferMapService {
    public void deleteBcMapVO(BcMapVO vo) throws BusinessException {
        vo.setStatus(3);
        MDPersistenceService.lookupPersistenceService().deleteBill((Object)vo);
    }

    public void deleteByDestBill(String[] pks, String pk_billtype) throws BusinessException {
        StringBuffer updSql = new StringBuffer();
        if (ArrayUtils.isEmpty((Object[])pks)) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0337"));
        }
        updSql.append("delete from  arap_bcmap").append(" where ");
        updSql.append(SqlUtils.getInStr((String)"dest_billid", (String[])pks, (boolean)true));
        if (StringUtils.isNotEmpty((CharSequence)pk_billtype)) {
            updSql.append(" and ");
            updSql.append("dest_billtype").append(" = '").append(pk_billtype).append("'");
        }
        new BaseDAO().executeUpdate(updSql.toString());
    }

    public void deleteByPks(String[] pks, String pk_billtype) throws BusinessException {
        StringBuffer updSql = new StringBuffer();
        if (ArrayUtils.isEmpty((Object[])pks)) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0337"));
        }
        updSql.append("delete from  arap_bcmap").append(" where ");
        updSql.append(SqlUtils.getInStr((String)"src_billid", (String[])pks, (boolean)true));
        if (StringUtils.isNotEmpty((CharSequence)pk_billtype)) {
            updSql.append(" and ");
            updSql.append("src_billtype").append(" = '").append(pk_billtype).append("'");
        }
        new BaseDAO().executeUpdate(updSql.toString());
    }

    public BcMapVO findBcMapVOByPK(String pkBcMap) throws BusinessException {
        return (BcMapVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(BcMapVO.class, pkBcMap, false);
    }

    public String insertBcMapVO(BcMapVO bcMapVO) throws BusinessException {
        try {
            if (bcMapVO.getReceiver() != null) {
                NCMessage message = new NCMessage();
                MessageVO msgvo = new MessageVO();
                String billType = bcMapVO.getDest_billtype();
                String appcode = null;
                String pageCode = null;
                if ("F0".equals(billType)) {
                    appcode = "20060RBC";
                    pageCode = "20060RBC_CARD";
                } else if ("F1".equals(billType)) {
                    appcode = "20080SPLC";
                    pageCode = "20080SPLC_CARD";
                } else if ("F2".equals(billType)) {
                    appcode = "20060GBC";
                    pageCode = "20060GBC_CARD";
                } else if ("F3".equals(billType)) {
                    appcode = "20080SPAC";
                    pageCode = "20080SPAC_CARD";
                }
                msgvo.setSubject(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0025"));
                msgvo.setSender(InvocationInfoProxy.getInstance().getUserId());
                IRoleManageQuery rmq = (IRoleManageQuery)NCLocator.getInstance().lookup(IRoleManageQuery.class);
                String pk_org = bcMapVO.getDest_org();
                String receiver = bcMapVO.getReceiver();
                String[] receivers = null;
                UserRoleVO[] users = null;
                if (receiver != null && receiver.length() > 0) {
                    receivers = bcMapVO.getReceiver().split(",");
                    users = rmq.queryUserRoleVOByRoleID(receivers);
                }
                HashSet<String> userSet = new HashSet<String>();
                String[] pk_users = ((IPermissionDomainService4NCC)NCLocator.getInstance().lookup(IPermissionDomainService4NCC.class)).getPkUserWithOrgPermission(appcode, pk_org, InvocationInfoProxy.getInstance().getGroupId());
                if (pk_users != null && pk_users.length > 0) {
                    for (String pk_user : pk_users) {
                        userSet.add(pk_user);
                    }
                }
                if ((pk_users = ((IPermissionDomainService)NCLocator.getInstance().lookup(IPermissionDomainService.class)).getPkUserWithOrgPermission(appcode, pk_org, InvocationInfoProxy.getInstance().getGroupId())) != null && pk_users.length > 0) {
                    for (String pk_user : pk_users) {
                        userSet.add(pk_user);
                    }
                }
                StringBuffer sb = new StringBuffer("");
                if (users != null) {
                    for (UserRoleVO user : users) {
                        if (!userSet.contains(user.getCuserid())) continue;
                        sb.append(user.getCuserid());
                        sb.append(",");
                    }
                }
                msgvo.setReceiver(sb.toString());
                msgvo.setContent(bcMapVO.getMessage());
                msgvo.setMsgsourcetype("notice");
                msgvo.setSendtime(new UFDateTime());
                msgvo.setBillid(bcMapVO.getDest_billid());
                msgvo.setBilltype(bcMapVO.getDest_billtype());
                msgvo.setPk_group(InvocationInfoProxy.getInstance().getGroupId());
                message.setMessage(msgvo);
                NCMessage cloneMsgVO = (NCMessage)message.clone();
                MessageCenter.sendMessage((NCMessage[])new NCMessage[]{message});
                String params = "pagecode=" + pageCode + "&id=" + bcMapVO.getDest_billid() + "&status=browse";
                NCCMessage nccMsg = PfMessageUtil.convertToNCCMsgVo((String)"notice", (String)appcode, (NCMessage)cloneMsgVO, (String)params);
                nccMsg.getMessage().setBillid(bcMapVO.getDest_billid());
                nccMsg.getMessage().setBilltype(bcMapVO.getDest_billtype());
                nccloud.message.util.MessageCenter.sendMessage((NCCMessage[])new NCCMessage[]{nccMsg});
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        bcMapVO.setStatus(2);
        return MDPersistenceService.lookupPersistenceService().saveBill(NCObject.newInstance((Object)bcMapVO));
    }

    public void updateConfer(BcMapVO voconfer) throws BusinessException {
        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0338"));
    }

    public void canelDeleteByPks(String[] pks, String pk_billtype) throws BusinessException {
        StringBuffer updSql = new StringBuffer();
        if (ArrayUtils.isEmpty((Object[])pks)) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0337"));
        }
        updSql.append("update arap_bcmap set dr = 0").append(" where ");
        updSql.append(SqlUtils.getInStr((String)"src_billid", (String[])pks, (boolean)true));
        if (StringUtils.isNotEmpty((CharSequence)pk_billtype)) {
            updSql.append(" and ");
            updSql.append("dest_billtype").append(" = '").append(pk_billtype).append("'");
        }
        new BaseDAO().executeUpdate(updSql.toString());
    }
}

