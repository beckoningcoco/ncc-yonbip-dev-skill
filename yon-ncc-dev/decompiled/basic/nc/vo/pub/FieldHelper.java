/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class FieldHelper {
    private static HashMap<String, Map<String, Field>> cache = new HashMap();
    private static FieldHelper bhelp = new FieldHelper();
    private Map<String, Field[]> declaredMap = new HashMap<String, Field[]>();
    ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    private FieldHelper() {
    }

    public static FieldHelper getInstance() {
        return bhelp;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Map<String, Field> cacheField(Class beanCls) {
        String key = beanCls.getName();
        Map<String, Field> cFields = cache.get(key);
        if (cFields == null) {
            this.rwl.readLock().unlock();
            this.rwl.writeLock().lock();
            try {
                cFields = cache.get(key);
                if (cFields == null) {
                    Field[] fields;
                    cFields = new HashMap<String, Field>();
                    for (Field field : fields = this.getField(beanCls)) {
                        if (field.getName().startsWith("m_")) {
                            cFields.put(field.getName().substring(2).toLowerCase(), field);
                            continue;
                        }
                        cFields.put(field.getName().toLowerCase(), field);
                    }
                }
                cache.put(key, cFields);
            }
            finally {
                this.rwl.readLock().lock();
                this.rwl.writeLock().unlock();
            }
        }
        return cFields;
    }

    public Field[] getCacheFields(Class c) {
        Map<String, Field> cField = null;
        this.rwl.readLock().lock();
        try {
            cField = this.cacheField(c);
        }
        finally {
            this.rwl.readLock().unlock();
        }
        return cField.values().toArray(new Field[cField.size()]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Field getField(Class c, String propName) {
        Map<String, Field> cField = null;
        this.rwl.readLock().lock();
        try {
            cField = this.cacheField(c);
        }
        finally {
            this.rwl.readLock().unlock();
        }
        return cField.get(propName);
    }

    private Field[] getField(Class c) {
        Field[] f = this.getSerialField(c);
        for (Class cl = c.getSuperclass(); cl != Object.class; cl = cl.getSuperclass()) {
            Field[] f1 = this.getSerialField(cl);
            if (f1 == null) continue;
            Field[] tf = f;
            f = new Field[tf.length + f1.length];
            this.shallowCopy(tf, f, 0);
            this.shallowCopy(f1, f, tf.length);
        }
        return f;
    }

    private void shallowCopy(Field[] src, Field[] dest, int from) {
        for (int i = 0; i < src.length; ++i) {
            dest[from + i] = src[i];
        }
    }

    private Field[] getSerialField(Class c) {
        Field[] f = this.declaredMap.get(c.getName());
        if (f == null) {
            ArrayList<Field> al = new ArrayList<Field>();
            for (Field field : f = c.getDeclaredFields()) {
                if (Modifier.isTransient(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) continue;
                field.setAccessible(true);
                al.add(field);
            }
            f = al.toArray(new Field[al.size()]);
            this.declaredMap.put(c.getName().intern(), f);
        }
        return f;
    }
}

