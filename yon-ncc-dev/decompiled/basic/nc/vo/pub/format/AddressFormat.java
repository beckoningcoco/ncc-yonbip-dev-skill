/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.AbstractSplitFormat;
import nc.vo.pub.format.AddressObject;
import nc.vo.pub.format.IElement;
import nc.vo.pub.format.StringElement;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.format.meta.AddressFormatMeta;

public class AddressFormat
extends AbstractSplitFormat {
    protected AddressFormatMeta formatMeta = null;

    public AddressFormat(AddressFormatMeta formatMeta) {
        this.formatMeta = formatMeta;
    }

    @Override
    protected String getExpress() {
        return this.formatMeta.getExpress();
    }

    @Override
    protected String[] getReplaceds() {
        return new String[]{this.formatMeta.getSeparator()};
    }

    @Override
    protected String[] getSeperators() {
        return new String[]{"(\\s)+?"};
    }

    @Override
    protected IElement getVarElement(String express) {
        if (express.equals("C")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return ((AddressObject)obj).getCountry();
                }
            };
        }
        if (express.equals("S")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return ((AddressObject)obj).getState();
                }
            };
        }
        if (express.equals("T")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return ((AddressObject)obj).getCity();
                }
            };
        }
        if (express.equals("D")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return ((AddressObject)obj).getSection();
                }
            };
        }
        if (express.equals("R")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return ((AddressObject)obj).getRoad();
                }
            };
        }
        if (express.equals("P")) {
            return new IElement(){

                @Override
                public String getValue(Object obj) {
                    return ((AddressObject)obj).getPostcode();
                }
            };
        }
        return new StringElement(express);
    }

    @Override
    protected Object formatArgument(Object obj) throws FormatException {
        if (obj instanceof AddressObject) {
            return obj;
        }
        throw new FormatException("Do not support the formatted Address Object Type");
    }
}

