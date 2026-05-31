/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.jcom.util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import nc.bs.logging.Logger;

public class Convertor {
    public static final Object addObjectToArray(Object[] array, Object newObject) {
        Vector<Object> v = new Vector<Object>();
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                v.add(array[i]);
            }
        }
        v.add(newObject);
        return Convertor.convertVectorToArray(v);
    }

    public static final Object addOrReplaceObjectToArray(Object[] array, String fieldNamed, Object newObject) {
        Vector<Object> v = new Vector<Object>();
        if (array == null) {
            v.addElement(newObject);
        } else {
            try {
                Field keyField = newObject.getClass().getField(fieldNamed);
                Object newKey = keyField.get(newObject);
                for (int i = 0; i < array.length; ++i) {
                    try {
                        Object key = keyField.get(array[i]);
                        if (newKey.equals(key)) continue;
                        v.addElement(array[i]);
                        continue;
                    }
                    catch (Exception e) {
                        Logger.error((Object)e.getMessage(), (Throwable)e);
                    }
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
            v.addElement(newObject);
        }
        return Convertor.convertVectorToArray(v);
    }

    public static final Vector convertArrayToVector(Object[] obj) {
        Vector<Object> v = new Vector<Object>();
        if (obj == null) {
            return v;
        }
        for (int i = 0; i < obj.length; ++i) {
            v.addElement(obj[i]);
        }
        return v;
    }

    public static final Object convertVectorToArray(Vector v) {
        if (v.size() == 0) {
            return null;
        }
        Class<?> classType = v.elementAt(0).getClass();
        Object o = Array.newInstance(classType, v.size());
        for (int i = 0; i < v.size(); ++i) {
            Array.set(o, i, v.elementAt(i));
        }
        return o;
    }

    public static final Object convertVectorToArray(Vector v, Class classType) {
        Object o = Array.newInstance(classType, v.size());
        for (int i = 0; i < v.size(); ++i) {
            Array.set(o, i, v.elementAt(i));
        }
        return o;
    }

    public static final Hashtable getHashtable(Object[] obj, Field keyField) {
        Hashtable<Object, Object> ha = new Hashtable<Object, Object>();
        if (obj == null) {
            return ha;
        }
        for (int i = 0; i < obj.length; ++i) {
            try {
                Object key = keyField.get(obj[i]);
                ha.put(key, obj[i]);
                continue;
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        return ha;
    }

    public static final Hashtable getHashtable(Object[] obj, String named) {
        Hashtable<Object, Object> ha = new Hashtable<Object, Object>();
        if (obj == null) {
            return ha;
        }
        Field keyField = null;
        for (int i = 0; i < obj.length; ++i) {
            try {
                if (keyField == null) {
                    keyField = obj[0].getClass().getField(named);
                }
                Object key = keyField.get(obj[i]);
                ha.put(key, obj[i]);
                continue;
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        return ha;
    }

    public static final Object getObjectFromArray(Object[] array, String fieldNamed, Object targetKey) {
        if (array == null) {
            return null;
        }
        try {
            Field keyField = null;
            for (int i = 0; i < array.length; ++i) {
                if (i == 0) {
                    keyField = array[0].getClass().getField(fieldNamed);
                }
                try {
                    Object key = keyField.get(array[i]);
                    if (!targetKey.equals(key)) continue;
                    return array[i];
                }
                catch (Exception e) {
                    Logger.error((Object)e.getMessage(), (Throwable)e);
                }
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return null;
    }

    public static final Vector getVector(Enumeration enu) {
        Vector v = new Vector();
        while (enu.hasMoreElements()) {
            v.add(enu.nextElement());
        }
        return v;
    }

    public static final Object removeObjectFromArray(Object[] array, String fieldNamed, Object keyObject) {
        if (array == null || array.length <= 0) {
            return null;
        }
        Vector<Object> v = new Vector<Object>();
        try {
            Class<?> itemClass = array[0].getClass();
            if (itemClass == String.class || itemClass == Integer.class || itemClass == Boolean.class || itemClass == Character.class || itemClass == Long.class || itemClass == Double.class || itemClass == Float.class) {
                for (int i = 0; i < array.length; ++i) {
                    if (array[i].equals(keyObject)) continue;
                    v.addElement(array[i]);
                }
            } else {
                Field keyField = array[0].getClass().getField(fieldNamed);
                Object removeKey = keyField.get(keyObject);
                for (int i = 0; i < array.length; ++i) {
                    Object key = keyField.get(array[i]);
                    if (key.equals(removeKey)) continue;
                    v.addElement(array[i]);
                }
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return Convertor.convertVectorToArray(v, array.getClass().getComponentType());
    }

    public static final boolean replaceObjectInArray(Object[] array, String fieldNamed, Object newObject) {
        if (array == null) {
            return false;
        }
        try {
            Field keyField = newObject.getClass().getField(fieldNamed);
            Object newKey = keyField.get(newObject);
            for (int i = 0; i < array.length; ++i) {
                try {
                    Object key = keyField.get(array[i]);
                    if (!newKey.equals(key)) continue;
                    array[i] = newObject;
                    return true;
                }
                catch (Exception e) {
                    Logger.error((Object)e.getMessage(), (Throwable)e);
                }
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return false;
    }
}

