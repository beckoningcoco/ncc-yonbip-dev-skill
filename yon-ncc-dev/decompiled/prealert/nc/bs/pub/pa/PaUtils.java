/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.server.ServerConfiguration
 *  nc.bs.logging.Logger
 *  nc.itf.uap.ml.DataMultiLangAccessor
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.LanguageVO
 *  nc.vo.ml.MultiLangUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.lang.MultiLangText
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFTime
 */
package nc.bs.pub.pa;

import java.io.CharArrayWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.server.ServerConfiguration;
import nc.bs.logging.Logger;
import nc.itf.uap.ml.DataMultiLangAccessor;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.LanguageVO;
import nc.vo.ml.MultiLangUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.lang.MultiLangText;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFTime;
import nc.vo.pub.pa.AlertTypeCategoryEnum;
import nc.vo.pub.pa.AlertmessageVO;
import nc.vo.pub.pa.AlerttypeVO;

public class PaUtils {
    public static final String FS = System.getProperties().getProperty("file.separator");

    public static String bandFileName(String filename, UFDate date, UFTime time) {
        String buffer;
        if (filename == null) {
            filename = "AlertFile";
        }
        int end = filename.indexOf(".");
        String extentionName = "";
        if (end == -1) {
            buffer = filename.substring(0);
        } else {
            buffer = filename.substring(0, end);
            extentionName = filename.substring(filename.lastIndexOf(".") + 1);
        }
        buffer = buffer + "-" + date.getYear();
        buffer = buffer + "-" + (date.getMonth() < 10 ? "0" + date.getMonth() : "" + date.getMonth());
        buffer = buffer + "-" + (date.getDay() < 10 ? "0" + date.getDay() : "" + date.getDay());
        buffer = buffer + "-" + (time.getHour() < 10 ? "0" + time.getHour() : "" + time.getHour());
        buffer = buffer + "-" + (time.getMinute() < 10 ? "0" + time.getMinute() : "" + time.getMinute());
        buffer = buffer + "-" + (time.getSecond() < 10 ? "0" + time.getSecond() : "" + time.getSecond());
        if (extentionName != null && extentionName.trim().length() > 0) {
            buffer = buffer + "." + extentionName;
        }
        return buffer;
    }

    public static String getCycleSelector(boolean[] selectors, String cycSeperator, boolean isStartZero) {
        String selectorStr = "";
        if (selectors.length > 0) {
            for (int i = 0; i < selectors.length; ++i) {
                if (!selectors[i]) continue;
                selectorStr = isStartZero ? selectorStr + String.valueOf(i) + cycSeperator : selectorStr + String.valueOf(i + 1) + cycSeperator;
            }
        }
        if (selectorStr.trim().length() > 0) {
            selectorStr = selectorStr.substring(0, selectorStr.length() - cycSeperator.length());
        }
        return selectorStr;
    }

    public static boolean[] getSelectorArray(String selectorStr, int length, String cycSperator, boolean isStartZero) {
        boolean[] selectorArray = new boolean[length];
        StringTokenizer sb = new StringTokenizer(selectorStr, cycSperator);
        while (sb.hasMoreTokens()) {
            String token = sb.nextToken();
            int tokenInt = Integer.parseInt(token);
            if (tokenInt == -1) {
                tokenInt = 0;
            }
            if (tokenInt >= length + 1) continue;
            if (isStartZero) {
                selectorArray[tokenInt] = true;
                continue;
            }
            selectorArray[tokenInt - 1] = true;
        }
        return selectorArray;
    }

    public static boolean isLegalMessageForSend(AlertmessageVO message) {
        return message != null && (message.getSendmethod() == 1 || message.getSendmethod() == 6 || message.getSendmethod() == 7);
    }

    public static boolean isPreset(AlerttypeVO type) {
        return StringUtil.isEmptyWithTrim((String)type.getCategory()) || type.getCategoryEnum().equals((Object)AlertTypeCategoryEnum.PRESET);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String getStack(Throwable e) {
        while (e.getCause() != null) {
            e = e.getCause();
        }
        CharArrayWriter cw = null;
        try (PrintWriter pw = null;){
            String msg;
            cw = new CharArrayWriter();
            pw = new PrintWriter(cw);
            e.printStackTrace(pw);
            String string = msg = cw.toString();
            return string;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static MultiLangText translate(String productCode, String resId, String[] argValues) {
        MultiLangText mlt = new MultiLangText();
        String originLang = InvocationInfoProxy.getInstance().getLangCode();
        try {
            LanguageVO[] langvos;
            for (LanguageVO langvo : langvos = DataMultiLangAccessor.getInstance().getAllLangVOs()) {
                String langcode = langvo.getLangcode();
                InvocationInfoProxy.getInstance().setLangCode(langcode);
                int langIdx = MultiLangUtil.getCurrentLangSeq();
                String text = NCLangRes4VoTransl.getNCLangRes().getStrByID(productCode, resId, null, argValues);
                mlt.setText(langIdx - 1, text);
            }
        }
        catch (Throwable e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        finally {
            InvocationInfoProxy.getInstance().setLangCode(originLang);
        }
        return mlt;
    }

    public static boolean isMaster() {
        return !ServerConfiguration.getServerConfiguration().isSingle() && ServerConfiguration.getServerConfiguration().isMaster();
    }
}

