/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.pub.IArapBillService
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.itf.arap.sagas.compensate.itface.IArapBillForCMPRedBackSagasCompenstate
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.impl.arap.sagas.compensate.itface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.pub.IArapBillService;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nccloud.itf.arap.sagas.compensate.itface.IArapBillForCMPRedBackSagasCompenstate;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class ArapBillForCMPRedBackSagasCompenstateimpl
implements IArapBillForCMPRedBackSagasCompenstate {
    public static final String SAGAS_REDVO_BILLDATA = "SAGAS_REDVO_BILLDATA";
    public static final String SAGAS_MAP_TERMDATA = "SAGAS_MAP_TERMDATA";

    public void doCompensate(Map<String, Serializable> map) throws BusinessException {
        HashMap hashMap = (HashMap)map.get("SAGAS_CALL_DATA");
        Map isRedMap = (Map)hashMap.get(SAGAS_MAP_TERMDATA);
        List<String> topBillPk = this.ResetOrginVO(isRedMap);
        if (CollectionUtils.isEmpty(topBillPk)) {
            return;
        }
    }

    private List<String> ResetOrginVO(Map<String, UFBoolean> isRedMap) throws BusinessException {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, UFBoolean> parm : isRedMap.entrySet()) {
            list.add(parm.getKey());
        }
        Object[] vos = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(list.toArray(new String[0]), "F3");
        if (ArrayUtils.isEmpty((Object[])vos)) {
            return null;
        }
        SuperVO[] headVOs = new SuperVO[vos.length];
        int index = 0;
        for (Object vo : vos) {
            vo.getHeadVO().setIsreded(isRedMap.get(vo.getHeadVO().getPrimaryKey()));
            headVOs[index] = vo.getHeadVO();
            ++index;
        }
        new BaseDAO().updateVOArray(headVOs, new String[]{"isreded"});
        return list;
    }
}

