/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nc.vo.pub.format.AbstractFormat;
import nc.vo.pub.format.FormatResult;
import nc.vo.pub.format.IElement;
import nc.vo.pub.format.StringElement;
import nc.vo.pub.format.exception.FormatException;

public abstract class AbstractSplitFormat
extends AbstractFormat {
    protected List<IElement> elements = new ArrayList<IElement>();

    @Override
    protected FormatResult innerFormat(Object obj) throws FormatException {
        this.doSplit();
        StringBuffer result = new StringBuffer();
        for (IElement element : this.elements) {
            String elementValue = element.getValue(obj);
            if (elementValue == null) continue;
            result.append(elementValue);
        }
        return new FormatResult(result.toString());
    }

    protected abstract String getExpress();

    protected abstract String[] getSeperators();

    protected abstract String[] getReplaceds();

    protected void doSplit() {
        String express = this.getExpress();
        if (this.elements == null || this.elements.size() == 0) {
            this.elements = this.doQuotation(express, this.getSeperators(), this.getReplaceds(), 0);
        }
    }

    protected List<IElement> doQuotation(String express, String[] seperators, String[] replaced, int curSeperator) {
        List<IElement> childElements;
        if (express.length() == 0) {
            return null;
        }
        ArrayList<IElement> elements = new ArrayList<IElement>();
        Pattern pattern = Pattern.compile("\".*?\"");
        Matcher matcher = pattern.matcher(express);
        int fromIndex = 0;
        while (matcher.find()) {
            List<IElement> childElements2;
            int j;
            int i = matcher.start();
            if (i == (j = matcher.end())) continue;
            if (fromIndex < i && (childElements2 = this.doSeperator(express.substring(fromIndex, i), seperators, replaced, curSeperator)) != null && childElements2.size() > 0) {
                elements.addAll(childElements2);
            }
            elements.add(new StringElement(express.substring(i + 1, j - 1)));
            fromIndex = j;
        }
        if (fromIndex < express.length() && (childElements = this.doSeperator(express.substring(fromIndex, express.length()), seperators, replaced, curSeperator)) != null && childElements.size() > 0) {
            elements.addAll(childElements);
        }
        return elements;
    }

    protected List<IElement> doSeperator(String express, String[] seperators, String[] replaced, int curSeperator) {
        List<IElement> childElements;
        if (curSeperator >= seperators.length) {
            ArrayList<IElement> elements = new ArrayList<IElement>();
            elements.add(this.getVarElement(express));
            return elements;
        }
        if (express.length() == 0) {
            return null;
        }
        ArrayList<IElement> elements = new ArrayList<IElement>();
        Pattern pattern = Pattern.compile(seperators[curSeperator]);
        Matcher matcher = pattern.matcher(express);
        int fromIndex = 0;
        while (matcher.find()) {
            List<IElement> childElements2;
            int j;
            int i = matcher.start();
            if (i == (j = matcher.end())) continue;
            if (fromIndex < i && (childElements2 = this.doSeperator(express.substring(fromIndex, i), seperators, replaced, curSeperator + 1)) != null && childElements2.size() > 0) {
                elements.addAll(childElements2);
            }
            if (replaced[curSeperator] != null) {
                elements.add(new StringElement(replaced[curSeperator]));
            } else {
                elements.add(new StringElement(express.substring(i, j)));
            }
            fromIndex = j;
        }
        if (fromIndex < express.length() && (childElements = this.doSeperator(express.substring(fromIndex, express.length()), seperators, replaced, curSeperator + 1)) != null && childElements.size() > 0) {
            elements.addAll(childElements);
        }
        return elements;
    }

    protected abstract IElement getVarElement(String var1);
}

