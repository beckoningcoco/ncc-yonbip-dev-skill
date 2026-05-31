/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.org.IOrgRelationDataPubService
 *  nc.ui.vorg.ref.BusinessUnitVersionDefaultRefModel
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 */
package nc.ui.arap.ref;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.org.IOrgRelationDataPubService;
import nc.ui.vorg.ref.BusinessUnitVersionDefaultRefModel;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;

public class FiBusiunitVersionRefModel
extends BusinessUnitVersionDefaultRefModel {
    public Vector getQueryResultVO() {
        Vector vecData = super.getQueryResultVO();
        String pk_org = this.getPk_org();
        if (vecData == null || pk_org == null) {
            return null;
        }
        Vector filterVector = new Vector();
        ArrayList<String> orgPKs = new ArrayList<String>();
        orgPKs.add(pk_org);
        IOrgRelationDataPubService service = (IOrgRelationDataPubService)NCLocator.getInstance().lookup(IOrgRelationDataPubService.class);
        try {
            Map orgmap = service.queryOrgUnitByPkFinanceorg(new String[]{pk_org});
            if (orgmap != null && !((List)orgmap.get(pk_org)).isEmpty()) {
                orgPKs.addAll((Collection)orgmap.get(pk_org));
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        int pkIndex = this.getFieldIndex(this.getChildField());
        for (int i = 0; i < vecData.size(); ++i) {
            Object vecpk = ((Vector)vecData.elementAt(i)).elementAt(pkIndex);
            if (!orgPKs.contains(vecpk.toString())) continue;
            filterVector.add(vecData.elementAt(i));
        }
        return filterVector;
    }
}

