/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.itf.arap.goldentax.IConfigQuery
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 */
package nc.impl.arap.goldentax;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import nc.bs.framework.common.RuntimeEnv;
import nc.itf.arap.goldentax.IConfigQuery;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class ConfigQueryImpl
implements IConfigQuery {
    private static final String APATH_PREFIX = RuntimeEnv.getInstance().getNCHome() + File.separatorChar;
    private static final String CONFIG_PATH = APATH_PREFIX + "modules/arap/config/customerconfig.xml";
    private Properties properties;

    public UFBoolean getParaBoolean(String paraName) {
        return UFBoolean.valueOf((String)this.getParaString(paraName));
    }

    public UFDouble getParaDouble(String paraName) {
        return new UFDouble(this.getParaString(paraName));
    }

    public String getParaString(String paraName) {
        return this.getProperties().getProperty(paraName);
    }

    private Properties getProperties() {
        if (null == this.properties || this.properties.size() == 0) {
            this.properties = new Properties();
            try (FileInputStream in = new FileInputStream(CONFIG_PATH);){
                this.properties.loadFromXML(in);
            }
            catch (Exception e) {
                ExceptionUtils.wrappException((Exception)e);
            }
        }
        return this.properties;
    }
}

