/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.vo.logging.Debug
 */
package nc.vo.jcom.lang;

import java.awt.FontMetrics;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.SwingUtilities;
import nc.bs.logging.Logger;
import nc.vo.jcom.lang.WildcardMatcher;
import nc.vo.logging.Debug;

public class StringUtil {
    private static final String FOLDER_SEPARATOR = "/";
    private static final String WINDOWS_FOLDER_SEPARATOR = "\\\\";
    private static final String TOP_PATH = "..";
    private static final String CURRENT_PATH = ".";
    public static final String HYPHEN = " ";
    private static final String DEFAUL_WAY = "SHA";

    public static String substringBetween(String source, String strBegin, String strEnd) {
        if (null == source) {
            return null;
        }
        int index = source.indexOf(strBegin);
        int indexEnd = source.indexOf(strEnd);
        if (index < 0) {
            index = 0 - strBegin.length();
        }
        if (indexEnd < 0) {
            indexEnd = source.length();
        }
        return source.substring(index + strBegin.length(), indexEnd);
    }

    public static String removeStringBetween(String source, String strBegin, String strEnd) {
        int index = source.indexOf(strBegin);
        int indexEnd = source.indexOf(strEnd);
        return source.substring(0, index) + source.substring(indexEnd + strEnd.length());
    }

    public static String replaceAllString(String source, String strReplaced, String strReplace) {
        if (StringUtil.isEmpty(source) || StringUtil.isEmpty(strReplaced) || strReplace == null) {
            return source;
        }
        StringBuffer buf = new StringBuffer(source.length());
        int start = 0;
        int end = 0;
        while ((end = source.indexOf(strReplaced, start)) != -1) {
            buf.append(source.substring(start, end)).append(strReplace);
            start = end + strReplaced.length();
        }
        buf.append(source.substring(start));
        return buf.toString();
    }

    public static String replaceIgnoreCase(String source, String strBeReplace, String strReplaced) {
        if (StringUtil.isEmpty(source) || StringUtil.isEmpty(strBeReplace) || strReplaced == null) {
            return source;
        }
        StringBuffer buf = new StringBuffer(source.length());
        int start = 0;
        int end = 0;
        String strReplacedCopy = strBeReplace.toUpperCase();
        String sourceCopy = source.toUpperCase();
        while ((end = sourceCopy.indexOf(strReplacedCopy, start)) != -1) {
            buf.append(source.substring(start, end)).append(strReplaced);
            start = end + strReplacedCopy.length();
        }
        buf.append(source.substring(start));
        return buf.toString();
    }

    public static String replaceFromTo(String source, String strBegin, String strEnd, String replaced) {
        if (null == source) {
            return null;
        }
        int index = source.indexOf(strBegin);
        int index1 = source.indexOf(strEnd);
        return source.substring(0, index) + replaced + source.substring(index1 + strEnd.length());
    }

    public static String[] gb2Unicode(String[] srcAry) {
        String[] strOut = new String[srcAry.length];
        for (int i = 0; i < srcAry.length; ++i) {
            strOut[i] = StringUtil.gb2Unicode(srcAry[i]);
        }
        return strOut;
    }

    public static String gb2Unicode(String src) {
        if ((src = StringUtil.spaceToNull(src)) == null) {
            return null;
        }
        char[] c = src.toCharArray();
        int n = c.length;
        byte[] b = new byte[n];
        for (int i = 0; i < n; ++i) {
            b[i] = (byte)c[i];
        }
        return new String(b);
    }

    public static String[] unicode2Gb(String[] srcAry) {
        String[] strOut = new String[srcAry.length];
        for (int i = 0; i < srcAry.length; ++i) {
            strOut[i] = StringUtil.uniCode2Gb(srcAry[i]);
        }
        return strOut;
    }

    public static String uniCode2Gb(String src) {
        if ((src = StringUtil.spaceToNull(src)) == null) {
            return null;
        }
        byte[] b = src.getBytes();
        int n = b.length;
        char[] c = new char[n];
        for (int i = 0; i < n; ++i) {
            c[i] = (char)((short)b[i] & 0xFF);
        }
        return new String(c);
    }

    public static boolean match(String reg, String str) {
        return WildcardMatcher.match(reg, str);
    }

    public static boolean matchIgnoreCase(String reg, String str) {
        return WildcardMatcher.match(reg, str);
    }

    public static List<String> toList(String inputstring, String splitstr) {
        StringTokenizer st = new StringTokenizer(inputstring, splitstr, false);
        ArrayList<String> reslist = new ArrayList<String>(st.countTokens());
        while (st.hasMoreTokens()) {
            reslist.add(st.nextToken().trim());
        }
        return reslist;
    }

    public static String getUnionStr(String[] strAry, String unionChar, String appendChar) {
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < strAry.length; ++i) {
            if (i != 0) {
                ret.append(unionChar);
            }
            ret.append(appendChar + strAry[i] + appendChar);
        }
        return ret.toString();
    }

    public static String getPYIndexStr(String strChinese, boolean bUpCase) {
        try {
            StringBuffer buffer = new StringBuffer();
            byte[] b = strChinese.getBytes("GBK");
            for (int i = 0; i < b.length; ++i) {
                if ((b[i] & 0xFF) > 128) {
                    int char1 = b[i++] & 0xFF;
                    int chart = (char1 <<= 8) + (b[i] & 0xFF);
                    buffer.append(StringUtil.getPYIndexChar((char)chart, bUpCase));
                    continue;
                }
                char c = (char)b[i];
                if (!Character.isJavaIdentifierPart(c)) {
                    c = 'A';
                }
                buffer.append(c);
            }
            return buffer.toString();
        }
        catch (Exception e) {
            Debug.error((Object)("ERRORs happen when get Chinese Pinyin!" + e.getMessage()));
            return null;
        }
    }

    private static char getPYIndexChar(char strChinese, boolean bUpCase) {
        char charGBK = strChinese;
        int result = charGBK >= '\ub0a1' && charGBK <= '\ub0c4' ? 65 : (charGBK >= '\ub0c5' && charGBK <= '\ub2c0' ? 66 : (charGBK >= '\ub2c1' && charGBK <= '\ub4ed' ? 67 : (charGBK >= '\ub4ee' && charGBK <= '\ub6e9' ? 68 : (charGBK >= '\ub6ea' && charGBK <= '\ub7a1' ? 69 : (charGBK >= '\ub7a2' && charGBK <= '\ub8c0' ? 70 : (charGBK >= '\ub8c1' && charGBK <= '\ub9fd' ? 71 : (charGBK >= '\ub9fe' && charGBK <= '\ubbf6' ? 72 : (charGBK >= '\ubbf7' && charGBK <= '\ubfa5' ? 74 : (charGBK >= '\ubfa6' && charGBK <= '\uc0ab' ? 75 : (charGBK >= '\uc0ac' && charGBK <= '\uc2e7' ? 76 : (charGBK >= '\uc2e8' && charGBK <= '\uc4c2' ? 77 : (charGBK >= '\uc4c3' && charGBK <= '\uc5b5' ? 78 : (charGBK >= '\uc5b6' && charGBK <= '\uc5bd' ? 79 : (charGBK >= '\uc5be' && charGBK <= '\uc6d9' ? 80 : (charGBK >= '\uc6da' && charGBK <= '\uc8ba' ? 81 : (charGBK >= '\uc8bb' && charGBK <= '\uc8f5' ? 82 : (charGBK >= '\uc8f6' && charGBK <= '\ucbf9' ? 83 : (charGBK >= '\ucbfa' && charGBK <= '\ucdd9' ? 84 : (charGBK >= '\ucdda' && charGBK <= '\ucef3' ? 87 : (charGBK >= '\ucef4' && charGBK <= '\ud1b8' ? 88 : (charGBK >= '\ud1b9' && charGBK <= '\ud4d0' ? 89 : (charGBK >= '\ud4d1' && charGBK <= '\ud7f9' ? 90 : (int)((char)(65 + new Random().nextInt(25)))))))))))))))))))))))));
        if (!bUpCase) {
            result = Character.toLowerCase((char)result);
        }
        return (char)result;
    }

    public static String[] toArray(String str, String delim) {
        return StringUtil.toArray(str, delim, false, false);
    }

    public static String[] toArray(String s) {
        return StringUtil.toArray(s, ",", false, false);
    }

    public static String[] split(String str, String token) {
        return StringUtil.toArray(str, token);
    }

    public static String replaceQuotMark(String strValue) {
        String oldMark = "'";
        String strResult = strValue;
        if (strValue != null && strValue.length() > 0 && strValue.indexOf(oldMark) >= 0) {
            boolean hasOneQuoMard = true;
            int pos = 0;
            while (hasOneQuoMard && (pos = strResult.indexOf(oldMark, pos)) >= 0) {
                if (pos >= strResult.length() - 1) {
                    strResult = strResult.substring(0, strResult.length()) + oldMark;
                    hasOneQuoMard = false;
                    continue;
                }
                if (strResult.substring(pos + 1, pos + 2).equals(oldMark)) {
                    pos += 2;
                    continue;
                }
                strResult = strResult.substring(0, pos + 1) + oldMark + strResult.substring(pos + 1);
                pos += 2;
            }
        }
        return strResult;
    }

    public static String spaceToNull(String str) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }
        return str.trim();
    }

    public static String removeCharFromString(String value, char removeChar) {
        if (value == null) {
            return null;
        }
        String regular = value.trim();
        String removestr = String.valueOf(removeChar);
        int index = regular.indexOf(removestr);
        while (index > 0) {
            String temp = regular.substring(0, index);
            regular = temp + regular.substring(index + 1);
            index = regular.indexOf(removestr);
        }
        return regular;
    }

    public static String addCharToString(String value, char addChar) {
        if (value == null) {
            return null;
        }
        String regular = value;
        String sign = "";
        if (regular.substring(0, 1).equals("-")) {
            sign = "-";
            regular = regular.substring(1, regular.length());
        }
        int index = regular.indexOf(CURRENT_PATH);
        String fracTemp = "";
        if (index > 0) {
            fracTemp = CURRENT_PATH + regular.substring(index + 1);
            regular = regular.substring(0, index);
        }
        String after = null;
        String strAdd = String.valueOf(addChar);
        while (regular.length() > 3) {
            String temp = regular.substring(regular.length() - 3, regular.length());
            regular = regular.substring(0, regular.length() - 3);
            if (after == null) {
                after = temp;
                continue;
            }
            after = temp + strAdd + after;
        }
        regular = after == null ? sign + regular + fracTemp : sign + regular + strAdd + after + fracTemp;
        return regular;
    }

    public static int computeStringWidth(FontMetrics fontMetrics, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int width = 10 + SwingUtilities.computeStringWidth(fontMetrics, str);
        int bytesLen = str.getBytes().length;
        if (bytesLen >= 10) {
            width += (bytesLen - 10) * 2 + 5;
        }
        return width;
    }

    public static String convExpoToRegular(String value) {
        int index1;
        if (value == null) {
            return "0";
        }
        String regular = value.toUpperCase();
        String sign = "";
        if (regular.substring(0, 1).equals("-")) {
            sign = "-";
            regular = regular.substring(1, regular.length());
        }
        if ((index1 = regular.indexOf("E")) > 0) {
            String temp = regular.substring(0, index1);
            String strExep = regular.substring(index1 + 1);
            int exep = Integer.parseInt(strExep);
            int index2 = temp.indexOf(CURRENT_PATH);
            if (exep >= 0) {
                if (index2 > 0) {
                    String inteTemp = temp.substring(0, index2);
                    String fracTemp = temp.substring(index2 + 1);
                    if (fracTemp.length() > exep) {
                        regular = inteTemp + fracTemp.substring(0, exep) + CURRENT_PATH + fracTemp.substring(exep);
                    } else {
                        int diff = exep - fracTemp.length();
                        for (int l = 0; l < diff; ++l) {
                            fracTemp = fracTemp + "0";
                        }
                        regular = inteTemp + fracTemp + ".0";
                    }
                } else {
                    for (int l = 0; l < exep; ++l) {
                        temp = temp + "0";
                    }
                    regular = temp;
                }
            } else {
                String inteTemp = temp;
                String fracTemp = "";
                exep = -exep;
                if (index2 > 0) {
                    inteTemp = temp.substring(0, index2);
                    fracTemp = temp.substring(index2 + 1);
                }
                if (inteTemp.length() > exep) {
                    int diff = inteTemp.length() - exep;
                    regular = inteTemp.substring(0, diff) + CURRENT_PATH + inteTemp.substring(diff) + fracTemp;
                } else {
                    int diff = exep - inteTemp.length();
                    for (int l = 0; l < diff; ++l) {
                        inteTemp = "0" + inteTemp;
                    }
                    regular = "0." + inteTemp + fracTemp;
                }
            }
        }
        return sign + regular;
    }

    public static String formatFloat(String str, int precision) {
        if (str == null) {
            return "0";
        }
        if (str.indexOf("E") > -1) {
            str = StringUtil.convExpoToRegular(str);
        }
        String preStr = "";
        String numStr = "";
        if (precision < 0) {
            precision = 0;
        }
        try {
            int index = str.indexOf(CURRENT_PATH);
            if (index > -1) {
                if (index == 0) {
                    preStr = "0";
                } else {
                    preStr = str.substring(0, index);
                    if (preStr.equals("-")) {
                        preStr = preStr + "0";
                    }
                }
                numStr = str.substring(index + 1);
            } else {
                preStr = str;
            }
            if (precision > 0) {
                preStr = preStr + CURRENT_PATH;
                int len = numStr.length();
                if (len < precision) {
                    for (int i = 0; i < precision - len; ++i) {
                        numStr = numStr + "0";
                    }
                    preStr = preStr + numStr;
                } else if (len > precision) {
                    String s = numStr.substring(precision, precision + 1);
                    String temp = numStr.substring(0, precision);
                    preStr = Integer.parseInt(s) >= 5 ? StringUtil.addOne(preStr, temp, "") : preStr + temp;
                } else {
                    preStr = preStr + numStr;
                }
            }
        }
        catch (NumberFormatException e) {
            return null;
        }
        return preStr;
    }

    public static boolean stringToBoolean(String str) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("Y");
    }

    public static String getObjectCode(String obj) {
        int index;
        String code = null;
        if (obj != null && (index = obj.indexOf(HYPHEN)) > -1) {
            code = obj.substring(0, index);
        }
        return code;
    }

    public static String getObjectName(String obj) {
        int index;
        String name = null;
        if (obj != null && (index = obj.indexOf(HYPHEN)) > -1) {
            name = obj.substring(index + 1);
        }
        return name;
    }

    public static String[] getReservedWords() {
        return new String[]{HYPHEN, "`", "#", "&", "*", "\"", "'", "?", "+", "-", "!"};
    }

    private static String addOne(String preStr, String numStr, String afterStr) {
        String result = "";
        if (numStr.length() > 0) {
            String s = numStr.substring(numStr.length() - 1);
            numStr = numStr.substring(0, numStr.length() - 1);
            int value = Integer.parseInt(s);
            if (value == 9) {
                afterStr = "0" + afterStr;
                result = StringUtil.addOne(preStr, numStr, afterStr);
            } else {
                result = preStr + numStr + Integer.toString(value + 1) + afterStr;
            }
        } else if (preStr.length() > 0) {
            String s = preStr.substring(preStr.length() - 1);
            preStr = preStr.substring(0, preStr.length() - 1);
            if (s.equals(CURRENT_PATH)) {
                afterStr = s + afterStr;
                result = StringUtil.addOne(preStr, numStr, afterStr);
            } else {
                int value = Integer.parseInt(s);
                if (value == 9) {
                    afterStr = "0" + afterStr;
                    result = StringUtil.addOne(preStr, numStr, afterStr);
                } else {
                    result = preStr + numStr + Integer.toString(value + 1) + afterStr;
                }
            }
        } else {
            result = preStr + "1" + numStr + afterStr;
        }
        return result;
    }

    public static int compareByByte(Object o1, Object o2) {
        if (null == o1) {
            return null == o2 ? 0 : -1;
        }
        if (null == o2) {
            return 1;
        }
        boolean isBytes = o1 instanceof byte[];
        byte[] bAry1 = isBytes ? (byte[])o1 : o1.toString().getBytes();
        byte[] bAry2 = isBytes ? (byte[])o2 : o2.toString().getBytes();
        int len1 = bAry1.length;
        int len2 = bAry2.length;
        int n = Math.min(len1, len2);
        int i = 0;
        int j = 0;
        int r = 0;
        while (n-- != 0 && (r = bAry1[i++] - bAry2[j++]) == 0) {
        }
        if (r == 0) {
            r = len1 - len2;
        }
        if (r == 0) {
            return 0;
        }
        if (r > 0) {
            return 1;
        }
        return -1;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isEmptyWithTrim(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isContainChinese(String str) {
        if (StringUtil.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); ++i) {
            if (!str.substring(i, i + 1).matches("[\\u4e00-\\u9fa5]+")) continue;
            return true;
        }
        return false;
    }

    public static int lenOfChinesString(String str) {
        int len = 0;
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (c >= '\u4e00' && c <= '\u9fa5') {
                len += 2;
                continue;
            }
            ++len;
        }
        return len;
    }

    public static String subChineseString(String str, int from, int len) {
        if (str == null || from < 0 || len <= 0) {
            throw new IllegalArgumentException();
        }
        int splitedLen = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = from; i < str.length() && i < from + len; ++i) {
            char c = str.charAt(i);
            splitedLen = c >= '\u4e00' && c <= '\u9fa5' ? (splitedLen += 2) : ++splitedLen;
            if (splitedLen > len) break;
            sb.append(c);
        }
        return sb.toString();
    }

    public static String recoverWrapLineChar(String msg) {
        if (msg == null) {
            return "";
        }
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < msg.length(); ++i) {
            char aChar = msg.charAt(i);
            if (aChar == '\\' && i < msg.length() - 1) {
                int aCharNext;
                if ((aCharNext = msg.charAt(++i)) == 116) {
                    aCharNext = 9;
                } else if (aCharNext == 114) {
                    aCharNext = 13;
                } else if (aCharNext == 110) {
                    aCharNext = 10;
                } else if (aCharNext == 102) {
                    aCharNext = 12;
                } else {
                    dest.append(aChar);
                }
                dest.append((char)aCharNext);
                continue;
            }
            dest.append(aChar);
        }
        return dest.toString();
    }

    public static char[] toHexChar(byte[] bArray) {
        char[] digitChars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] charDigest = new char[bArray.length * 2];
        for (int i = 0; i < bArray.length; ++i) {
            charDigest[i * 2] = digitChars[bArray[i] >>> 4 & 0xF];
            charDigest[i * 2 + 1] = digitChars[bArray[i] & 0xF];
        }
        return charDigest;
    }

    public static int compare(String str1, String str2) {
        String t1 = "";
        String t2 = "";
        try {
            if (str1 != null) {
                t1 = new String(str1.getBytes(), "ISO-8859-1");
            }
            if (str2 != null) {
                t2 = new String(str2.getBytes(), "ISO-8859-1");
            }
        }
        catch (Exception e) {
            Logger.error((Object)"error", (Throwable)e);
        }
        return t1.compareTo(t2);
    }

    public static String[] toArray(String s, String delimiters, boolean trimTokens, boolean ignoreEmptyTokens) {
        if (s == null) {
            return new String[0];
        }
        StringTokenizer st = new StringTokenizer(s, delimiters);
        ArrayList<String> tokens = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (trimTokens) {
                token = token.trim();
            }
            if (ignoreEmptyTokens && token.length() == 0) continue;
            tokens.add(token);
        }
        return tokens.toArray(new String[tokens.size()]);
    }

    public static boolean nstartsWith(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return true;
        }
        for (int i = 0; i < str2.length(); ++i) {
            if (str2.charAt(i) == str1.charAt(i)) continue;
            return true;
        }
        return false;
    }

    public static boolean nendsWith(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return true;
        }
        int indexSrc = str1.length() - 1;
        for (int i = str2.length() - 1; i > 0; --i) {
            if (str2.charAt(i) == str1.charAt(indexSrc--)) continue;
            return true;
        }
        return false;
    }

    public static boolean nequals(String str1, String str2) {
        if (str2.length() != str1.length()) {
            return true;
        }
        for (int i = 0; i < str2.length(); ++i) {
            if (str2.charAt(i) == str1.charAt(i)) continue;
            return true;
        }
        return false;
    }

    public static boolean hasText(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return false;
        }
        for (int i = 0; i < strLen; ++i) {
            if (Character.isWhitespace(str.charAt(i))) continue;
            return true;
        }
        return false;
    }

    public static String digest(String strSource) {
        StringBuffer digest = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance(DEFAUL_WAY);
            byte[] sourBytes = strSource.getBytes();
            byte[] digestBytes = md.digest(sourBytes);
            if (digestBytes != null) {
                int n = digestBytes.length;
                for (int i = 0; i < n; ++i) {
                    digest.append(digestBytes[i]);
                }
            }
        }
        catch (NoSuchAlgorithmException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return digest.toString();
    }

    public static String digest(URL[] urls) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < urls.length; ++i) {
            long lastModified = -1L;
            if (i > 1) {
                buffer.append(";");
            }
            buffer.append(urls[i]);
            if ("file".equals(urls[i].getProtocol())) {
                File file = new File(urls[i].getPath().replace('/', File.separatorChar).replace('|', ':'));
                lastModified = file.lastModified();
            } else {
                try {
                    URLConnection connection = urls[i].openConnection();
                    lastModified = connection.getLastModified();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            buffer.append('!').append(lastModified);
        }
        return StringUtil.digest(buffer.toString());
    }

    public static String toString(Object[] arr) {
        return StringUtil.toString(arr, ",");
    }

    public static String toString(Object value, String delim) {
        if (value instanceof String) {
            return (String)value;
        }
        if (value.getClass().isArray()) {
            return StringUtil.toString((Object[])value, delim);
        }
        if (value instanceof Iterable) {
            return StringUtil.toString((Iterable)value, delim);
        }
        return value.toString();
    }

    public static String toString(Iterable c, String delim, String prefix, String suffix) {
        if (c == null) {
            return "null";
        }
        StringBuffer sb = new StringBuffer();
        Iterator it = c.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i++ > 0) {
                sb.append(delim);
            }
            sb.append(prefix + it.next() + suffix);
        }
        return sb.toString();
    }

    public static String toString(Iterable c, String delim) {
        return StringUtil.toString(c, delim, "", "");
    }

    public static String toString(Object value) {
        return StringUtil.toString(value, ",");
    }

    public static String toString(Object[] arr, String delim) {
        if (arr == null) {
            return "null";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; ++i) {
            if (i > 0) {
                sb.append(delim);
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static String unqualify(String qualifiedName, char separator) {
        return qualifiedName.substring(qualifiedName.lastIndexOf(separator) + 1);
    }

    public static String capitalize(String str) {
        return StringUtil.changeFirstCharacterCase(true, str);
    }

    public static String uncapitalize(String str) {
        return StringUtil.changeFirstCharacterCase(false, str);
    }

    private static String changeFirstCharacterCase(boolean capitalize, String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return str;
        }
        StringBuffer buf = new StringBuffer(strLen);
        if (capitalize) {
            buf.append(Character.toUpperCase(str.charAt(0)));
        } else {
            buf.append(Character.toLowerCase(str.charAt(0)));
        }
        buf.append(str.substring(1));
        return buf.toString();
    }

    public static String unqualify(String qualifiedName) {
        return StringUtil.unqualify(qualifiedName, '.');
    }

    public static String getFilename(String path) {
        int separatorIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        return separatorIndex != -1 ? path.substring(separatorIndex + 1) : path;
    }

    public static String normalizePath(String path) {
        String p = path.replaceAll(WINDOWS_FOLDER_SEPARATOR, FOLDER_SEPARATOR);
        String[] pArray = StringUtil.toArray(p, FOLDER_SEPARATOR);
        LinkedList<String> pList = new LinkedList<String>();
        int tops = 0;
        for (int i = pArray.length - 1; i >= 0; --i) {
            if (CURRENT_PATH.equals(pArray[i])) continue;
            if (TOP_PATH.equals(pArray[i])) {
                ++tops;
                continue;
            }
            if (tops > 0) {
                --tops;
                continue;
            }
            pList.add(0, pArray[i]);
        }
        return StringUtil.toString(pList, FOLDER_SEPARATOR);
    }

    public static boolean pathEquals(String path1, String path2) {
        return StringUtil.normalizePath(path1).equals(StringUtil.normalizePath(path2));
    }

    public static URL[] pathToURLs(String path) {
        StringTokenizer st = new StringTokenizer(path, File.pathSeparator);
        URL[] urls = new URL[st.countTokens()];
        int count = 0;
        while (st.hasMoreTokens()) {
            File file = new File(st.nextToken());
            URL url = null;
            try {
                url = file.toURI().toURL();
            }
            catch (MalformedURLException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
            if (url == null) continue;
            urls[count++] = url;
        }
        if (urls.length != count) {
            URL[] tmp = new URL[count];
            System.arraycopy(urls, 0, tmp, 0, count);
            urls = tmp;
        }
        return urls;
    }

    public static String removeLastFileSeperator(String path) {
        if (path == null) {
            return null;
        }
        while (path.endsWith("\\") || path.endsWith(FOLDER_SEPARATOR)) {
            path = path.substring(0, path.length() - 1);
        }
        return StringUtil.spaceToNull(path.trim());
    }

    public static String getTimeStampString(long l) {
        Calendar cl = Calendar.getInstance();
        cl.setTimeInMillis(l);
        int[] ia = new int[5];
        int year = cl.get(1);
        ia[0] = cl.get(2) + 1;
        ia[1] = cl.get(5);
        ia[2] = cl.get(11);
        ia[3] = cl.get(12);
        ia[4] = cl.get(13);
        byte[] ba = new byte[19];
        ba[7] = 45;
        ba[4] = 45;
        ba[10] = 32;
        ba[16] = 58;
        ba[13] = 58;
        ba[0] = (byte)(year / 1000 + 48);
        ba[1] = (byte)(year / 100 % 10 + 48);
        ba[2] = (byte)(year / 10 % 10 + 48);
        ba[3] = (byte)(year % 10 + 48);
        for (int i = 0; i < 5; ++i) {
            ba[i * 3 + 5] = (byte)(ia[i] / 10 + 48);
            ba[i * 3 + 6] = (byte)(ia[i] % 10 + 48);
        }
        return new String(ba);
    }

    public static String replace(String s, Properties p) {
        String regex = "\\$\\w+\\W|\\$\\{[^}]+\\}";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);
        while (m.find()) {
            String temp = m.group();
            String key = null;
            key = temp.indexOf("{") != -1 ? temp.substring(temp.indexOf("{") + 1, temp.length() - 1) : temp.substring(1, temp.length() - 1);
            String value = p.getProperty(key);
            if (value == null) continue;
            s = s.replace(temp, value);
            m = pattern.matcher(s);
        }
        return s;
    }
}

