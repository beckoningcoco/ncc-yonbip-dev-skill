/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Logger
 *  nc.bs.ml.NCLangResOnserver
 *  nc.message.Attachment
 *  nc.message.ByteArrayAttachment
 *  nc.message.templet.bs.AbstractBusiVarCalculater
 *  nc.message.templet.bs.IMsgVarCalculater
 *  nc.message.templet.bs.MsgContentCreator
 *  nc.message.vo.AttachmentSetting
 *  nc.message.vo.NCMessage
 *  nc.ui.pub.print.IDataSource
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.MultiLangText
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFTime
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.pub.pa.read;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Logger;
import nc.bs.ml.NCLangResOnserver;
import nc.bs.pub.pa.IBusiCalculater;
import nc.bs.pub.pa.IMobileDataSource;
import nc.bs.pub.pa.PaConstant;
import nc.bs.pub.pa.PreAlertDataSource;
import nc.bs.pub.pa.PreAlertObject;
import nc.bs.pub.pa.PreAlertReturnType;
import nc.bs.pub.pa.html.AlertMessageDataSource;
import nc.bs.pub.pa.html.DataSourceAlertMessage;
import nc.bs.pub.pa.html.HtmlCreater;
import nc.bs.pub.pa.html.IAlertMessage;
import nc.bs.pub.pa.read.MobileAppMsgCreator;
import nc.message.Attachment;
import nc.message.ByteArrayAttachment;
import nc.message.templet.bs.AbstractBusiVarCalculater;
import nc.message.templet.bs.IMsgVarCalculater;
import nc.message.templet.bs.MsgContentCreator;
import nc.message.vo.AttachmentSetting;
import nc.message.vo.NCMessage;
import nc.ui.pub.print.IDataSource;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.MultiLangText;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFTime;
import nc.vo.pub.pa.AlertmessageVO;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeconfigVO;
import nccloud.commons.lang.StringUtils;

@Deprecated
public class TaskBodyBase {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static Map<String, NCMessage> dealReturnObjUsingTemplet(NCMessage msg, String[] langcodes, AlertregistryVO info, PreAlertObject retObj, String fileName) throws BusinessException {
        Object datasource = null;
        switch (retObj.getReturnType()) {
            case RETURNFORMATMSG: {
                datasource = new AlertMessageDataSource((IAlertMessage)retObj.getReturnObj());
                break;
            }
            case RETURNDATASOURCE: {
                datasource = (IDataSource)retObj.getReturnObj();
                break;
            }
        }
        datasource = new PreAlertDataSource((IDataSource)datasource, info);
        Object busiObj = retObj.getBusiObj();
        PreAlertBusiVarCalculator calculator = new PreAlertBusiVarCalculator(info, retObj.getBusiCalculater());
        MsgContentCreator creator = new MsgContentCreator();
        creator.setAttachname(fileName);
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String originLang = InvocationInfoProxy.getInstance().getLangCode();
        try {
            Map map;
            Map map2 = map = creator.createMessageUsingTemp(info.getPk_messagetemplate(), pk_group, langcodes, msg, (IMsgVarCalculater)calculator, busiObj, datasource);
            return map2;
        }
        finally {
            InvocationInfoProxy.getInstance().setLangCode(originLang);
        }
    }

    private static Object generateAlertContent(PreAlertObject retObj, AlertregistryVO info) {
        Object alertContent = null;
        switch (retObj.getReturnType()) {
            case RETURNFORMATMSG: {
                IAlertMessage msgContent = (IAlertMessage)retObj.getReturnObj();
                if (msgContent == null) break;
                alertContent = HtmlCreater.getFormattedAlertMessageHTML(msgContent, info);
                break;
            }
            case RETURNDATASOURCE: {
                DataSourceAlertMessage msgDataSource = new DataSourceAlertMessage((IDataSource)retObj.getReturnObj(), retObj.getMsgTitle());
                if (msgDataSource == null) break;
                alertContent = HtmlCreater.getFormattedAlertMessageHTML(msgDataSource, info);
                break;
            }
            case RETURNOBJECT: {
                if (retObj.getReturnObj() == null) break;
                alertContent = retObj.getReturnObj();
                break;
            }
            case RETURNMESSAGE: {
                String strMsg;
                if (retObj.getReturnObj() == null || StringUtil.isEmptyWithTrim((String)(strMsg = (String)retObj.getReturnObj()))) break;
                alertContent = HtmlCreater.getStringAlertMessageHTML(strMsg);
                break;
            }
            case RETURNMULTILANGTEXT: {
                String msgStr;
                MultiLangText mlt;
                if (retObj.getReturnObj() == null || !(retObj.getReturnObj() instanceof MultiLangText) || (mlt = (MultiLangText)retObj.getReturnObj()) == null || StringUtil.isEmptyWithTrim((String)(msgStr = mlt.toString()))) break;
                alertContent = msgStr;
                break;
            }
        }
        return alertContent;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static Map<String, NCMessage> dealReturnObjWithoutTemplet(NCMessage msg, String[] langcodes, AlertregistryVO info, PreAlertObject retObj, String fileName) throws BusinessException {
        String originLangcode = InvocationInfoProxy.getInstance().getLangCode();
        try {
            HashMap<String, NCMessage> map = new HashMap<String, NCMessage>();
            for (String langcode : langcodes) {
                NCMessage curMsg;
                InvocationInfoProxy.getInstance().setLangCode(langcode);
                try {
                    curMsg = (NCMessage)msg.clone();
                }
                catch (CloneNotSupportedException e1) {
                    throw new BusinessException((Throwable)e1);
                }
                Object alertContent = TaskBodyBase.generateAlertContent(retObj, info);
                if (PreAlertReturnType.RETURNMULTILANGTEXT.equals((Object)retObj.getReturnType())) {
                    if (alertContent != null) {
                        curMsg.getMessage().setSubject(String.valueOf(alertContent));
                    }
                } else {
                    Attachment att = TaskBodyBase.generateAttachment(alertContent, fileName, curMsg);
                    if (att != null) {
                        if (curMsg.getAttachmentSetting() == null) {
                            curMsg.setAttachmentSetting(new AttachmentSetting());
                        }
                        curMsg.getAttachmentSetting().addAttachment(att);
                    }
                }
                map.put(langcode, curMsg);
            }
            HashMap<String, NCMessage> hashMap = map;
            return hashMap;
        }
        finally {
            InvocationInfoProxy.getInstance().setLangCode(originLangcode);
        }
    }

    private static Attachment generateAttachment(Object alertContent, String fileName, NCMessage ncmsg) {
        if (alertContent == null) {
            return null;
        }
        try {
            byte[] bytes = alertContent.toString().getBytes(PaConstant.getCharset());
            ByteArrayAttachment fileattach = new ByteArrayAttachment(fileName, bytes);
            fileattach.setSubject(ncmsg.getMessage().getSender() + "Message");
            fileattach.setDescription("PreAlert Message File");
            fileattach.setKeyword(ncmsg.getMessage().getMsgtype());
            fileattach.setPk_billitem(ncmsg.getMessage().getPk_message());
            return fileattach;
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            return null;
        }
    }

    public static Map<String, NCMessage> dealReturnObjML(NCMessage msg, String[] langcodes, AlertregistryVO info, PreAlertObject retObj, String fileName) throws BusinessException {
        boolean useTemplate;
        String pk_template = info.getPk_messagetemplate();
        boolean bl = useTemplate = !StringUtil.isEmptyWithTrim((String)pk_template);
        if (useTemplate) {
            return TaskBodyBase.dealReturnObjUsingTemplet(msg, langcodes, info, retObj, fileName);
        }
        return TaskBodyBase.dealReturnObjWithoutTemplet(msg, langcodes, info, retObj, fileName);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Map<String, Attachment> dealMobileAppMsg(String[] langcodes, PreAlertObject retObj) {
        HashMap<String, Attachment> map = new HashMap<String, Attachment>();
        if (langcodes == null || langcodes.length == 0) {
            return map;
        }
        if (!PreAlertReturnType.RETURNDATASOURCE.equals((Object)retObj.getReturnType())) {
            return map;
        }
        IDataSource ds = (IDataSource)retObj.getReturnObj();
        if (!(ds instanceof IMobileDataSource)) {
            return map;
        }
        String originLang = InvocationInfoProxy.getInstance().getLangCode();
        try {
            for (String lang : langcodes) {
                InvocationInfoProxy.getInstance().setLangCode(lang);
                String fileName = "mapp_plugin.mapp";
                Map<String, Object> created = new MobileAppMsgCreator((IMobileDataSource)ds, ds).createAsMap();
                long begin = System.currentTimeMillis();
                Logger.debug((Object)"serialization begin", TaskBodyBase.class, (String)"dealMobileAppMsg");
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(created);
                byte[] bs = baos.toByteArray();
                long elapsed = System.currentTimeMillis() - begin;
                Logger.debug((Object)("serialization ended, elapsed: " + elapsed), TaskBodyBase.class, (String)"dealMobileAppMsg");
                ByteArrayAttachment att = new ByteArrayAttachment(fileName, bs);
                map.put(lang, (Attachment)att);
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        finally {
            InvocationInfoProxy.getInstance().setLangCode(originLang);
        }
        return map;
    }

    @Deprecated
    public static NCMessage dealReturnObj(NCMessage msg, AlertregistryVO info, PreAlertObject retObj, String fileName) throws Exception {
        boolean useTemplate;
        boolean success = false;
        Object alertContent = null;
        String pk_template = info.getPk_messagetemplate();
        boolean bl = useTemplate = !StringUtil.isEmptyWithTrim((String)pk_template);
        if (useTemplate) {
            Object datasource = null;
            switch (retObj.getReturnType()) {
                case RETURNFORMATMSG: {
                    datasource = new AlertMessageDataSource((IAlertMessage)retObj.getReturnObj());
                    break;
                }
                case RETURNDATASOURCE: {
                    datasource = (IDataSource)retObj.getReturnObj();
                    break;
                }
            }
            datasource = new PreAlertDataSource((IDataSource)datasource, info);
            Object busiObj = retObj.getBusiObj();
            PreAlertBusiVarCalculator calculator = new PreAlertBusiVarCalculator(info, retObj.getBusiCalculater());
            MsgContentCreator creator = new MsgContentCreator();
            creator.setAttachname(fileName);
            String pk_group = InvocationInfoProxy.getInstance().getGroupId();
            String langcode = InvocationInfoProxy.getInstance().getLangCode();
            Map msgMap = creator.createMessageUsingTemp(pk_template, pk_group, new String[]{langcode}, msg, (IMsgVarCalculater)calculator, busiObj, datasource);
            msg = (NCMessage)msgMap.get(langcode);
            success = true;
        } else {
            switch (retObj.getReturnType()) {
                case RETURNFORMATMSG: {
                    IAlertMessage msgContent = (IAlertMessage)retObj.getReturnObj();
                    if (msgContent == null) break;
                    alertContent = HtmlCreater.getFormattedAlertMessageHTML(msgContent, info);
                    success = true;
                    break;
                }
                case RETURNDATASOURCE: {
                    DataSourceAlertMessage msgDataSource = new DataSourceAlertMessage((IDataSource)retObj.getReturnObj(), retObj.getMsgTitle());
                    if (msgDataSource == null) break;
                    alertContent = HtmlCreater.getFormattedAlertMessageHTML(msgDataSource, info);
                    success = true;
                    break;
                }
                case RETURNOBJECT: {
                    if (retObj.getReturnObj() == null) break;
                    alertContent = retObj.getReturnObj();
                    success = true;
                    break;
                }
                case RETURNMESSAGE: {
                    String strMsg;
                    if (retObj.getReturnObj() == null || StringUtil.isEmptyWithTrim((String)(strMsg = (String)retObj.getReturnObj()))) break;
                    alertContent = HtmlCreater.getStringAlertMessageHTML(strMsg);
                    success = true;
                    break;
                }
            }
            if (alertContent != null) {
                try {
                    byte[] bytes = alertContent.toString().getBytes(PaConstant.getCharset());
                    ByteArrayAttachment fileattach = new ByteArrayAttachment(fileName, bytes);
                    fileattach.setSubject(NCLangResOnserver.getInstance().getStrByID("prealertres", "TaskBodyBase-000000", null, new String[]{msg.getMessage().getSender()}));
                    fileattach.setDescription(NCLangResOnserver.getInstance().getStrByID("prealertres", "TaskBodyBase-000001"));
                    fileattach.setKeyword(msg.getMessage().getMsgtype());
                    fileattach.setPk_billitem(msg.getMessage().getPk_message());
                    msg.getAttachmentSetting().addAttachment((Attachment)fileattach);
                }
                catch (UnsupportedEncodingException e) {
                    Logger.error((Object)"Exception occured", (Throwable)e);
                }
            }
            success = true;
        }
        return msg;
    }

    private static AlertmessageVO newMetaMessage(Object retObj, AlertregistryVO registry, long CreateTime, long SendTime, String noPrefileName, String msgTitle) {
        AlertmessageVO metaMsg = new AlertmessageVO();
        metaMsg.setMessage(registry.getMessage());
        metaMsg.setGroupid(registry.getGroupId());
        if (!StringUtil.isEmptyWithTrim((String)msgTitle)) {
            metaMsg.setAlertname(msgTitle);
        } else {
            metaMsg.setAlertname(registry.getMultiLangAlertname());
        }
        metaMsg.setPk_alertregistry(registry.getPrimaryKey());
        metaMsg.setIstiming(registry.getIstiming());
        metaMsg.setIsnew(UFBoolean.TRUE);
        metaMsg.setBelong_system(registry.getAlertTypeVo().getBelong_system());
        metaMsg.setLanguage(registry.getCurlang());
        metaMsg.setCreatedate(PaConstant.getDate(new UFDate(CreateTime)));
        metaMsg.setCreatetime(PaConstant.getTime(new UFTime(CreateTime)));
        metaMsg.setSenddate(PaConstant.getDate(new UFDate(SendTime)));
        metaMsg.setSendtime(PaConstant.getTime(new UFTime(SendTime)));
        metaMsg.setSentdate(null);
        metaMsg.setSenttime(null);
        metaMsg.setDataSource(registry.getDataSource());
        if (noPrefileName != null && !noPrefileName.contains(".")) {
            metaMsg.setFilename(noPrefileName + ".html");
        } else {
            metaMsg.setFilename(noPrefileName);
        }
        if (registry.getAlertTypeVo().getTasktype() == null || registry.getAlertTypeVo().getTasktype() == 0) {
            metaMsg.setImplementtype(0);
        } else {
            metaMsg.setImplementtype(10);
        }
        Object[] content = new Object[]{registry, retObj};
        metaMsg.setFileContent(content);
        return metaMsg;
    }

    public static class PreAlertBusiVarCalculator
    extends AbstractBusiVarCalculater {
        Map<String, String> calculatorMap = new HashMap<String, String>();
        IBusiCalculater busiCalculater;

        public PreAlertBusiVarCalculator(AlertregistryVO registry, IBusiCalculater busiCalculater) {
            this.busiCalculater = busiCalculater;
            AlerttypeconfigVO[] cVOs = registry.getTypeConfigVo();
            if (cVOs == null || cVOs.length == 0) {
                return;
            }
            if (cVOs != null) {
                for (AlerttypeconfigVO vo : cVOs) {
                    String value = StringUtil.isEmptyWithTrim((String)vo.getRefervalue()) ? vo.getValue() : vo.getRefervalue();
                    String code = vo.getFieldname();
                    String name = vo.getVariablename();
                    this.calculatorMap.put(code, value);
                    this.calculatorMap.put(name, value);
                }
            }
        }

        public void setCalculatorMap(Map<String, String> calculatorMap) {
            this.calculatorMap = calculatorMap;
        }

        public String calculateValue(String express) {
            String busiValue;
            if (this.busiCalculater != null && !StringUtils.isBlank((CharSequence)(busiValue = this.busiCalculater.calculateValue(express)))) {
                return busiValue;
            }
            return this.calculatorMap.get(express);
        }
    }
}

