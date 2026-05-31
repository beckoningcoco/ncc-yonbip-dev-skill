/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.busilog.util.BusinessLogServiceUtil
 *  nc.bs.busilog.vo.BusinessLogContext
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.uap.IUAPQueryBS
 *  nc.itf.uap.ml.DataMultiLangAccessor
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.LanguageVO
 *  nc.vo.ml.MultiLangUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.sm.UserVO
 */
package nc.vo.pub.pa.busilog;

import nc.bs.busilog.util.BusinessLogServiceUtil;
import nc.bs.busilog.vo.BusinessLogContext;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.ml.DataMultiLangAccessor;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.LanguageVO;
import nc.vo.ml.MultiLangUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeVO;
import nc.vo.pub.pa.busilog.IPABusiLogConst;
import nc.vo.sm.UserVO;

public abstract class AbstractPABusiLogEntity
implements IPABusiLogConst {
    private BusinessLogContext createContext() {
        BusinessLogContext context = new BusinessLogContext();
        context.setHasjudged(true);
        return context;
    }

    private void writeBusiLog(BusinessLogContext context) throws BusinessException {
        Logger.debug((Object)NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AbstractPABusiLogEntity-000000", null, new String[]{context.getLogmsg()}));
        BusinessLogServiceUtil.insertBusilogInTransaction((BusinessLogContext)context);
    }

    public abstract BusinessLogContext fillBusiInfo(BusinessLogContext var1) throws BusinessException;

    public abstract String buildLogmsg() throws BusinessException;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write() throws BusinessException {
        LanguageVO langvo = DataMultiLangAccessor.getInstance().getDefaultLang();
        String defaultLangcode = langvo.getLangcode();
        String originLangcode = InvocationInfoProxy.getInstance().getLangCode();
        try {
            InvocationInfoProxy.getInstance().setLangCode(defaultLangcode);
            BusinessLogContext context = this.createContext();
            context = this.fillBusiInfo(context);
            context.setLogmsg(this.buildLogmsg());
            this.writeBusiLog(context);
        }
        catch (Throwable e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        finally {
            InvocationInfoProxy.getInstance().setLangCode(originLangcode);
        }
    }

    public static AlertregistryVO queryRegistryByPk(String pk_alertregistry) throws BusinessException {
        IUAPQueryBS qry = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);
        AlertregistryVO registry = (AlertregistryVO)((Object)qry.retrieveByPK(AlertregistryVO.class, pk_alertregistry));
        return registry;
    }

    public static UserVO queryUserName(String cuserid) throws BusinessException {
        IUAPQueryBS qry = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);
        String[] fields = new String[]{"user_name", "user_name2", "user_name3", "user_name4", "user_name5", "user_name6"};
        UserVO uvo = (UserVO)qry.retrieveByPK(UserVO.class, cuserid, fields);
        return uvo;
    }

    public static AlerttypeVO queryAlertTypeName(String pk_alerttype) throws BusinessException {
        IUAPQueryBS qry = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);
        String[] fields = new String[]{"type_name", "name_resid"};
        AlerttypeVO type = (AlerttypeVO)((Object)qry.retrieveByPK(AlerttypeVO.class, pk_alerttype, fields));
        return type;
    }

    public static String getAlertTypeNameString(String pk_alerttype) {
        StringBuffer sb = new StringBuffer();
        String alerttypeName = null;
        String str = null;
        try {
            AlerttypeVO alerttype = AbstractPABusiLogEntity.queryAlertTypeName(pk_alerttype);
            if (alerttype != null) {
                alerttypeName = alerttype.getType_nameML();
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        str = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryAddEntity-000003", null, new String[]{alerttypeName});
        sb.append(str);
        return sb.toString();
    }

    public static String getCategoryString(int type) {
        StringBuffer sb = new StringBuffer();
        String typeString = null;
        if (0 == type) {
            typeString = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryAddEntity-000000");
        } else if (2 == type) {
            typeString = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AbstractPABusiLogEntity-000001");
        } else if (1 == type) {
            typeString = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryAddEntity-000001");
        }
        String str = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AbstractPABusiLogEntity-000002");
        sb.append(str);
        sb.append(": [");
        sb.append(typeString);
        sb.append("]");
        return sb.toString();
    }

    public static String getRegistryNameString(AlertregistryVO registry) {
        String registryName = MultiLangUtil.getSuperVONameOfCurrentLang((SuperVO)registry, (String)"alertname", (String)registry.getAlertname());
        if (StringUtil.isEmptyWithTrim((String)registryName)) {
            registryName = registry.getAlertname();
        }
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryAddEntity-000004", null, new String[]{registryName});
    }

    public static String getFormattedString(String key, String value) {
        StringBuffer sb = new StringBuffer();
        sb.append(key);
        sb.append(": [");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }

    public static String getFormattedString(String key, String oldValue, String newValue) {
        String text = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AbstractPABusiLogEntity-000003", null, new String[]{oldValue, newValue});
        StringBuffer sb = new StringBuffer();
        sb.append(key);
        sb.append(": [");
        sb.append(text);
        sb.append("]");
        return sb.toString();
    }
}

