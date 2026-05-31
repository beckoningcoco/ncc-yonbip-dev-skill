/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.InitializingBean
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.cache;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class BizCache
implements InitializingBean {
    private static final String GROUP_KEY = "#group";
    public static final String ALGORITHM = "SHA256";
    private Logger logger = LoggerFactory.getLogger(BizCache.class);
    private static BizCache instance;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public boolean isEnalbed() {
        return this.ymsParamConfig.getBizCacheEnalbed();
    }

    public void afterPropertiesSet() throws Exception {
        instance = this;
    }

    public static BizCache instance() {
        return instance;
    }

    public String set(String bizName, Object bizId, Object bizObject) {
        if (!this.ymsParamConfig.getBizCacheEnalbed().booleanValue()) {
            return null;
        }
        String key = this.createKey(bizName, bizId);
        AppContext.cache().set(key, this.toJson(bizObject));
        AppContext.cache().expire(key, this.ymsParamConfig.getBizCachePersistentSecs());
        return key;
    }

    public String set(String bizName, Object bizId, Object bizObject, String bindTo) {
        if (!this.ymsParamConfig.getBizCacheEnalbed().booleanValue()) {
            return null;
        }
        String key = this.set(bizName, bizId, bizObject);
        if (StringUtils.hasText((String)bindTo)) {
            AppContext.cache().sadd(bindTo, new String[]{key});
        }
        return key;
    }

    public <T> T get(String bizName, Object bizId, Class<T> dataType) {
        if (!this.ymsParamConfig.getBizCacheEnalbed().booleanValue()) {
            return null;
        }
        String key = this.createKey(bizName, bizId);
        String json = AppContext.cache().get(key);
        if (StringUtils.hasText((String)json)) {
            return (T)JSONObject.parseObject((String)json, dataType);
        }
        return null;
    }

    public String createKey(String bizName, Object bizId) {
        return this.createKey(bizName, bizId, Level.TENANT);
    }

    public String createKey(String bizName, Object bizId, Level level) {
        return Arrays.asList(bizName, bizId == null ? null : bizId.toString(), this.getLevelValue(level)).stream().filter(s -> StringUtils.hasText((String)s)).collect(Collectors.joining("#"));
    }

    public String createHashKey(String bizName, Object bizParam, Level level) {
        return Arrays.asList(bizName, this.hash(bizParam), this.getLevelValue(level)).stream().filter(s -> StringUtils.hasText((String)s)).collect(Collectors.joining("#"));
    }

    public String createBindKey(String bizName, Object bizId) {
        return this.createKey(bizName, bizId) + GROUP_KEY;
    }

    public void set(String key, Object data) {
        if (!this.ymsParamConfig.getBizCacheEnalbed().booleanValue()) {
            return;
        }
        AppContext.cache().set(key, this.toJson(data), this.ymsParamConfig.getBizCachePersistentSecs());
    }

    public void setVolatile(String key, Object data) {
        if (!this.ymsParamConfig.getBizCacheEnalbed().booleanValue()) {
            return;
        }
        AppContext.cache().set(key, this.toJson(data), this.ymsParamConfig.getBizCacheVolatileSecs());
    }

    public String get(String key) {
        if (!this.ymsParamConfig.getBizCacheEnalbed().booleanValue()) {
            return null;
        }
        String data = AppContext.cache().get(key);
        return data;
    }

    public <T> T get(String key, Class<T> dataType) {
        if (!this.ymsParamConfig.getBizCacheEnalbed().booleanValue()) {
            return null;
        }
        String data = this.get(key);
        if (StringUtils.hasText((String)data)) {
            return (T)JSONObject.parseObject((String)data, dataType);
        }
        return null;
    }

    public void delete(String bizName, Object bizId) {
        String key = this.createKey(bizName, bizId);
        String groupKey = this.createBindKey(bizName, bizId);
        HashSet<String> items = new HashSet<String>();
        items.add(key);
        items.add(groupKey);
        this.delete(items.toArray(new String[items.size()]));
    }

    public void delete(String ... keys) {
        AppContext.cache().del(keys);
    }

    private String getLevelValue(Level level) {
        switch (level.ordinal()) {
            case 1: {
                return AppContext.getTenantId().toString();
            }
            case 2: {
                try {
                    return AppContext.getCurrentUser().getOrgId();
                }
                catch (Exception e) {
                    return AppContext.getCurrentUser().getId().toString();
                }
            }
            case 3: {
                return AppContext.getCurrentUser().getId().toString();
            }
        }
        return null;
    }

    private String hash(Object bizParam) {
        if (bizParam == null) {
            return null;
        }
        try {
            String data = this.toJson(bizParam);
            MessageDigest digest = MessageDigest.getInstance(ALGORITHM);
            digest.update(data.getBytes());
            return BizCache.getHexString(digest.digest());
        }
        catch (Exception e) {
            return null;
        }
    }

    private static String getHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; ++i) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }

    private String toJson(Object data) {
        return JSONObject.toJSONString((Object)data, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
    }

    public static enum Level {
        GLOBAL,
        TENANT,
        ORG,
        USER;

    }
}

