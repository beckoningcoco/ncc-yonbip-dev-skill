/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.thoughtworks.xstream.XStream
 *  com.thoughtworks.xstream.annotations.XStreamAlias
 *  nc.bs.logging.Logger
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.pub.pa.customquery;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import nc.bs.logging.Logger;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;

@XStreamAlias(value="datetimeconfig")
public class DatetimeConfigVO
implements Serializable {
    private static final long serialVersionUID = 2843692471215735762L;
    private String operator = null;
    private String days = null;

    public String toXML() {
        return new XStream().toXML((Object)this);
    }

    public static DatetimeConfigVO fromXML(String xml) {
        try {
            XStream xstream = new XStream();
            XStream.setupDefaultSecurity((XStream)xstream);
            xstream.allowTypes(new Class[]{DatetimeConfigVO.class});
            return (DatetimeConfigVO)xstream.fromXML(xml);
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            return null;
        }
    }

    public String toExpression() {
        if (StringUtil.isEmptyWithTrim((String)this.operator)) {
            return null;
        }
        try {
            Integer.parseInt(this.days);
        }
        catch (Exception e) {
            return null;
        }
        if (this.operator.trim().equals("+")) {
            String exp = "(datefmt(dateadd('dd'," + this.days + ",date()), 'yyyy-mm-dd'))";
            return exp;
        }
        if (this.operator.trim().equals("-")) {
            String exp = "(datefmt(dateadd('dd',-" + this.days + ",date()), 'yyyy-mm-dd'))";
            return exp;
        }
        return null;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDays() {
        return this.days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String toString() {
        if (this.operator == null || StringUtil.isEmptyWithTrim((String)this.operator) || StringUtil.isEmptyWithTrim((String)this.days)) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "DatetimeConfigVO-000000");
        }
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "DatetimeConfigVO-000001", null, new String[]{this.operator, this.days});
    }
}

