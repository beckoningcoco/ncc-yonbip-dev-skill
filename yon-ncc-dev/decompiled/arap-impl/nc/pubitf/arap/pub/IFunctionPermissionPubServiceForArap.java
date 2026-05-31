/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.org.OrgVO
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.pub;

import nc.vo.org.OrgVO;
import nc.vo.pub.BusinessException;

public interface IFunctionPermissionPubServiceForArap {
    public OrgVO[] getUserPermissionOrg(String var1, String var2, String var3) throws BusinessException;
}

