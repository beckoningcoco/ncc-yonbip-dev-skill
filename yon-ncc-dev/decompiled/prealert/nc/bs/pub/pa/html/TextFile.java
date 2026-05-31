/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.bs.pub.pa.html;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import nc.bs.logging.Logger;

@Deprecated
public class TextFile {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Object read(String filename) {
        BufferedReader in = null;
        String buffer = null;
        try {
            in = new BufferedReader(new FileReader(filename));
            String a = null;
            while ((a = in.readLine()) != null) {
                if (buffer == null) {
                    buffer = a + System.getProperty("line.separator");
                    continue;
                }
                buffer = buffer + a + System.getProperty("line.separator");
            }
            Logger.info((Object)("[\u9884\u8b66\u5e73\u53f0] \u6210\u529f\u4ece\u6587\u4ef6 '" + filename + "' \u4e2d\u8bfb\u53d6\u6587\u672c."));
        }
        catch (IOException e) {
            Logger.error((Object)("[\u9884\u8b66\u5e73\u53f0] \u4ece\u6587\u672c\u6587\u4ef6\u4e2d\u8bfb\u53d6\u6301\u4e45\u5316" + filename + "\u7684\u5b57\u7b26\u4e32\u65f6\u53d1\u751f IO \u5f02\u5e38!"), (Throwable)e);
        }
        finally {
            try {
                in.close();
            }
            catch (Exception e) {
                Logger.error((Object)("[\u9884\u8b66\u5e73\u53f0] \u4ece\u6587\u672c\u6587\u4ef6" + filename + "\u8bfb\u53d6\u6301\u4e45\u5316\u7684\u5b57\u7b26\u4e32\u65f6\u53d1\u751f\u5173\u95ed\u5f02\u5e38!"), (Throwable)e);
            }
        }
        return buffer;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean write(String string, String filename) {
        boolean bSucceed = true;
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileOutputStream(filename));
            out.print(string);
            Logger.info((Object)("[\u9884\u8b66\u5e73\u53f0] \u6210\u529f\u5c06\u6587\u672c\u5199\u5165 '" + filename + "' \u6587\u4ef6."));
        }
        catch (IOException e) {
            Logger.error((Object)"[\u9884\u8b66\u5e73\u53f0] \u5c06\u5b57\u7b26\u4e32\u6301\u4e45\u5316\u5230\u6587\u672c\u6587\u4ef6\u65f6\u53d1\u751f IO \u5f02\u5e38!", (Throwable)e);
            bSucceed = false;
        }
        finally {
            try {
                out.close();
            }
            catch (Exception e) {
                Logger.error((Object)"[\u9884\u8b66\u5e73\u53f0] \u5c06\u5b57\u7b26\u4e32\u6301\u4e45\u5316\u5230\u6587\u672c\u6587\u4ef6\u65f6\u53d1\u751f\u5173\u95ed\u5f02\u5e38!", (Throwable)e);
                bSucceed = false;
            }
        }
        return bSucceed;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean write(String string, String filename, String charset) {
        boolean bSucceed = true;
        PrintWriter out = null;
        try {
            out = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(filename), charset));
            out.print(string);
            Logger.info((Object)("[\u9884\u8b66\u5e73\u53f0] \u6210\u529f\u5c06\u6587\u672c\u5199\u5165 '" + filename + "' \u6587\u4ef6."));
        }
        catch (IOException e) {
            Logger.error((Object)("[\u9884\u8b66\u5e73\u53f0] \u5c06\u5b57\u7b26\u4e32\u6301\u4e45\u5316\u5230\u6587\u672c\u6587\u4ef6" + filename + "\u65f6\u53d1\u751f IO \u5f02\u5e38!"), (Throwable)e);
            bSucceed = false;
        }
        finally {
            try {
                out.close();
            }
            catch (Exception e) {
                Logger.error((Object)"[\u9884\u8b66\u5e73\u53f0] \u5c06\u5b57\u7b26\u4e32\u6301\u4e45\u5316\u5230\u6587\u672c\u6587\u4ef6\u65f6\u53d1\u751f\u5173\u95ed\u5f02\u5e38!", (Throwable)e);
                bSucceed = false;
            }
        }
        return bSucceed;
    }
}

