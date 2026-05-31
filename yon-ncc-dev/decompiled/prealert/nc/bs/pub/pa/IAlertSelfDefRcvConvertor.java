/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.bs.pub.pa;

import java.util.Map;
import java.util.Set;
import nc.bs.pub.pa.PreAlertContext;
import nc.vo.pub.BusinessException;

public interface IAlertSelfDefRcvConvertor {
    public Map<String, Set<String>> convert(PreAlertContext var1) throws BusinessException;
}

