/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.ml.NCLangResOnserver
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.ArrayUtils
 */
package uap.bs.prealert.engine.executor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.ml.NCLangResOnserver;
import nc.bs.pub.pa.IAlertSelfDefRcvConvertor;
import nc.bs.pub.pa.PreAlertObject;
import nc.itf.uap.pa.IPreAlertSelfRveService;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertsfrcvVO;
import nc.vo.pub.pa.CurrEnvVO;
import nccloud.commons.lang.ArrayUtils;
import uap.vo.prealert.engine.EngineContext;

public class AlertsfrcvConvertUtil {
    static Map<String, AlertsfrcvVO[]> vosMap = new HashMap<String, AlertsfrcvVO[]>();

    public static Map<String, String> getAllSefCodesAndNames(String pk_alerttype) throws BusinessException {
        HashMap<String, String> map = new HashMap<String, String>();
        AlertsfrcvVO[] vos = AlertsfrcvConvertUtil.getVos(pk_alerttype);
        if (vos != null && vos.length > 0) {
            for (AlertsfrcvVO vo : vos) {
                String code = vo.getRcv_code();
                String disName = vo.getDisname_resid();
                String[] codes = code.split(",");
                String[] disNames = disName.split(",");
                int m = codes.length;
                for (int n = 0; n < m; ++n) {
                    map.put(codes[n], NCLangResOnserver.getInstance().getStrByID("prealertres", disNames[n]));
                }
            }
        }
        return map;
    }

    private static AlertsfrcvVO[] getVos(String typepk) throws BusinessException {
        IPreAlertSelfRveService srv = (IPreAlertSelfRveService)NCLocator.getInstance().lookup(IPreAlertSelfRveService.class);
        AlertsfrcvVO[] rcvvos = null;
        if (vosMap.get(typepk) == null) {
            rcvvos = srv.getConfigInfoByTypePK(typepk);
            vosMap.put(typepk, rcvvos);
        } else {
            rcvvos = vosMap.get(typepk);
        }
        return rcvvos;
    }

    public static void translateSelfrcv(EngineContext context, PreAlertObject retObj) throws BusinessException {
        CurrEnvVO pcontext = context.getExecutorContext();
        Object[] codes = pcontext.getSelfDefRcvCodes();
        AlertsfrcvVO[] vos = AlertsfrcvConvertUtil.getVos(context.getAlertType().getPk_alerttype());
        if (ArrayUtils.isEmpty((Object[])codes) || ArrayUtils.isEmpty((Object[])vos)) {
            return;
        }
        HashSet<String> implclassSet = new HashSet<String>();
        int j = codes.length;
        block2: for (int i = 0; i < j; ++i) {
            int m = vos.length;
            for (int n = 0; n < m; ++n) {
                if (vos[n].getRcv_code().indexOf((String)codes[i], 0) == -1) continue;
                implclassSet.add(vos[n].getImplfullpath());
                continue block2;
            }
        }
        Iterator it = implclassSet.iterator();
        while (it.hasNext()) {
            try {
                Object obj = Class.forName(((String)it.next()).toString().trim()).newInstance();
                if (!(obj instanceof IAlertSelfDefRcvConvertor)) continue;
                Map<String, Set<String>> returnMap = ((IAlertSelfDefRcvConvertor)obj).convert(pcontext);
                for (Map.Entry<String, Set<String>> entry : returnMap.entrySet()) {
                    retObj.addUserPks(entry.getKey(), entry.getValue());
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
                throw new BusinessException((Throwable)e);
            }
        }
    }
}

