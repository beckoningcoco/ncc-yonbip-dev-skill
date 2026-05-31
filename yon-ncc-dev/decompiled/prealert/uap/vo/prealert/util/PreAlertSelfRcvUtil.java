/*
 * Decompiled with CFR 0.152.
 */
package uap.vo.prealert.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import nc.bs.pub.pa.PreAlertObject;
import nc.vo.pub.pa.AlertsendconfigVO;
import uap.vo.prealert.engine.EngineContext;

public class PreAlertSelfRcvUtil {
    public static void convertSelfDefRcvToUser(EngineContext context, PreAlertObject result) {
        AlertsendconfigVO[] configs = context.getAlertRegistry().getSendConfigVo();
        context.getAlertRegistry().setSendConfigVo(PreAlertSelfRcvUtil.convertSelfDefConfigToUserConfig(configs, result));
    }

    public static AlertsendconfigVO[] convertSelfDefConfigToUserConfig(AlertsendconfigVO[] configs, PreAlertObject result) {
        ArrayList<AlertsendconfigVO> configList = new ArrayList<AlertsendconfigVO>();
        for (AlertsendconfigVO config : configs) {
            if (PreAlertSelfRcvUtil.isSelfDefRcv(config)) {
                List<AlertsendconfigVO> userList = PreAlertSelfRcvUtil.generateUserConfig(config, result);
                if (userList.size() <= 0) continue;
                configList.addAll(userList);
                continue;
            }
            configList.add(config);
        }
        return configList.toArray(new AlertsendconfigVO[0]);
    }

    public static List<AlertsendconfigVO> generateUserConfig(AlertsendconfigVO config, PreAlertObject result) {
        String[] userpkAry;
        String selfDefRcvCode = config.getReceiverid().substring(config.getReceiverid().indexOf(93) + 1, config.getReceiverid().length());
        Set<String> userpkSet = result.getUserPkSetByCode(selfDefRcvCode);
        if (userpkSet.size() == 0) {
            return new ArrayList<AlertsendconfigVO>();
        }
        ArrayList<AlertsendconfigVO> userList = new ArrayList<AlertsendconfigVO>();
        for (String userpk : userpkAry = userpkSet.toArray(new String[0])) {
            AlertsendconfigVO clonedConfig = (AlertsendconfigVO)((Object)config.clone());
            clonedConfig.setReceiverid("[1]" + userpk);
            clonedConfig.setReceivername(userpk);
            userList.add(clonedConfig);
        }
        return userList;
    }

    public static boolean isSelfDefRcv(AlertsendconfigVO config) {
        if (config.getReceiverid() == null) {
            return false;
        }
        return config.getReceiverid().startsWith("[86]");
    }
}

