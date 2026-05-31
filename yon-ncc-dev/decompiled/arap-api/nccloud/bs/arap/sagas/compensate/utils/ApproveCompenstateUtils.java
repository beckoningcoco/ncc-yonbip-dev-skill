/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.impl.pubapp.env.BSContext
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.utils;

import java.util.ArrayList;
import nc.impl.pubapp.env.BSContext;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.info.ApproveInfo;

public class ApproveCompenstateUtils {
    public static final String COMPENSATE_APPROVE_INFOS = "COMPENSATE_APPROVE_INFOS";

    public static void recordApproveInfo(ApproveInfo approveInfo) throws BusinessException {
        if (approveInfo == null) {
            return;
        }
        ArrayList<ApproveInfo> infoList = new ArrayList<ApproveInfo>();
        infoList.add(approveInfo);
        BSContext.getInstance().setSession(COMPENSATE_APPROVE_INFOS, infoList);
    }

    public static ArrayList<ApproveInfo> fetchApproveInfos() {
        return (ArrayList)BSContext.getInstance().getSession(COMPENSATE_APPROVE_INFOS);
    }
}

