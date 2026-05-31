/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.vo.pub.BusinessException
 */
package nc.bs.pub.taskcenter;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import nc.bs.logging.Logger;
import nc.bs.pub.pa.PreAlertObject;
import nc.bs.pub.pa.PreAlertReturnType;
import nc.bs.pub.taskcenter.BgWorkingContext;
import nc.bs.pub.taskcenter.IBackgroundWorkPlugin;
import nc.vo.pub.BusinessException;

public class SampleBackgroundPlugin
implements IBackgroundWorkPlugin {
    @Override
    public PreAlertObject executeTask(BgWorkingContext bgwc) throws BusinessException {
        LinkedHashMap<String, Object> km = bgwc.getKeyMap();
        Set name = ((HashMap)km).entrySet();
        for (Map.Entry entry : name) {
            Logger.debug((Object)((String)entry.getKey() + "=" + entry.getValue() + "\n"));
        }
        PreAlertObject retObj = new PreAlertObject();
        retObj.setReturnObj("backgroup task has finished.");
        retObj.setReturnType(PreAlertReturnType.RETURNMESSAGE);
        return retObj;
    }

    private void longtimeWork(int max) {
        int iCount = new SecureRandom().nextInt(10);
        for (int i = 0; i < iCount + 1; ++i) {
            this.getPrimes(max);
            try {
                Thread.sleep(2500L);
                continue;
            }
            catch (InterruptedException e) {
                Logger.error((Object)"Exception occured", (Throwable)e);
            }
        }
    }

    private void getPrimes(int max) {
        for (int i = 1; i < max; ++i) {
            for (int a = 2; a <= i / 2 && i % a != 0; ++a) {
            }
        }
    }
}

