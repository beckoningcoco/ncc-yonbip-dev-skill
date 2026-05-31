/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  org.apache.commons.beanutils.BeanUtils
 */
package nc.vo.jcom.bean;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.LinkedList;
import nc.bs.logging.Logger;
import org.apache.commons.beanutils.BeanUtils;

public class NCBeanUtils {
    public static Object[] cloneBeanArray(Object[] origin) {
        if (origin == null || origin.length == 0) {
            return null;
        }
        LinkedList<Object> list = new LinkedList<Object>();
        Class<?> cl = origin.getClass();
        if (!cl.isArray()) {
            return null;
        }
        Class<?> componentType = cl.getComponentType();
        try {
            for (int i = 0; i < origin.length; ++i) {
                Class<?> c = origin[i].getClass();
                Method m = c.getMethod("clone", new Class[0]);
                Object temp = null;
                int modifier = m.getModifiers();
                temp = m != null && modifier == 1 ? m.invoke(origin[i], new Object[0]) : BeanUtils.cloneBean((Object)origin[i]);
                if (temp == null) continue;
                list.add(temp);
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        Object[] objArray = (Object[])Array.newInstance(componentType, list.size());
        return list.toArray(objArray);
    }
}

