/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.framework.jmx;

import java.util.Hashtable;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

public class ObjectNameFactory {
    public static ObjectName create(String name) {
        try {
            return new ObjectName(name);
        }
        catch (MalformedObjectNameException e) {
            throw new Error("Invalid ObjectName: " + name + "; " + e);
        }
    }

    public static ObjectName create(String domain, String key, String value) {
        try {
            return new ObjectName(domain, key, value);
        }
        catch (MalformedObjectNameException e) {
            throw new Error("Invalid ObjectName: " + domain + "," + key + "," + value + "; " + e);
        }
    }

    public static ObjectName create(String domain, Hashtable table) {
        try {
            return new ObjectName(domain, table);
        }
        catch (MalformedObjectNameException e) {
            throw new Error("Invalid ObjectName: " + domain + "," + table + "; " + e);
        }
    }
}

