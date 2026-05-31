/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.rbac.IUserManageQuery
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.sm.UserVO
 */
package uap.vo.prealert.engine.receiver;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.rbac.IUserManageQuery;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.sm.UserVO;
import uap.vo.prealert.engine.receiver.AbstractNCReceiverType;
import uap.vo.prealert.util.PreAlertUtil;

public class RoleGroupType
extends AbstractNCReceiverType {
    @Override
    public Integer getId() {
        return 7;
    }

    @Override
    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertnc", "RoleGroupType-000");
    }

    @Override
    public String[] getActualReceiver(String pk_receiver) throws BusinessException {
        IUserManageQuery srv = (IUserManageQuery)NCLocator.getInstance().lookup(IUserManageQuery.class);
        UserVO[] uvos = srv.queryUsersRelateInRoleGroupForAlert(pk_receiver, true);
        if (uvos != null) {
            return PreAlertUtil.getFieldValues(String.class, (SuperVO[])uvos, "cuserid");
        }
        return new String[0];
    }
}

