/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IPsndocPFQryService
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.sm.UserVO
 */
package uap.vo.prealert.engine.receiver;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.pf.IPsndocPFQryService;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.sm.UserVO;
import uap.vo.prealert.engine.receiver.AbstractNCReceiverType;
import uap.vo.prealert.util.PreAlertUtil;

public class PostType
extends AbstractNCReceiverType {
    @Override
    public Integer getId() {
        return 3;
    }

    @Override
    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertnc", "PostType-000");
    }

    @Override
    public String[] getActualReceiver(String pk_receiver) throws BusinessException {
        IPsndocPFQryService srv = (IPsndocPFQryService)NCLocator.getInstance().lookup(IPsndocPFQryService.class);
        HashMap map = srv.queryUsersByPost(pk_receiver);
        if (map != null) {
            HashSet<String> userSet = new HashSet<String>();
            for (UserVO[] uvos : map.values()) {
                if (uvos == null) continue;
                List<String> useridCol = PreAlertUtil.getFieldValuesAsList(String.class, (SuperVO[])uvos, "cuserid");
                userSet.addAll(useridCol);
            }
            return userSet.toArray(new String[0]);
        }
        return new String[0];
    }
}

