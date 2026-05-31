/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.rbac.IUserPubService
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.sm.UserVO
 */
package uap.vo.prealert.engine.receiver;

import nc.bs.framework.common.NCLocator;
import nc.pubitf.rbac.IUserPubService;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.sm.UserVO;
import uap.vo.prealert.engine.receiver.AbstractNCReceiverType;

public class PersonType
extends AbstractNCReceiverType {
    @Override
    public Integer getId() {
        return 12;
    }

    @Override
    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertnc", "PersonType-000");
    }

    @Override
    public String[] getActualReceiver(String pk_receiver) throws BusinessException {
        IUserPubService srv = (IUserPubService)NCLocator.getInstance().lookup(IUserPubService.class);
        UserVO uvo = srv.queryUserVOByPsnDocID(pk_receiver);
        if (uvo != null) {
            return new String[]{uvo.getCuserid()};
        }
        return new String[0];
    }
}

