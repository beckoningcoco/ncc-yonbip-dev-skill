/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import nc.vo.pub.BeanHelper;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.IAttributeMeta;
import nc.vo.pub.IColumnMeta;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.JavaType;
import nc.vo.pub.SerializeReader;
import nc.vo.pub.SerializeWriter;
import nc.vo.pub.ValidationException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;
import nc.vo.pub.lang.UFTime;

public abstract class SuperVO
extends CircularlyAccessibleValueObject
implements ISuperVO,
Serializable,
Cloneable {
    private static final long serialVersionUID = -5039331730754798103L;
    private Map<String, Object> valueIndex = new HashMap<String, Object>();
    private static transient Map<Class<? extends SuperVO>, String[]> map = new HashMap<Class<? extends SuperVO>, String[]>();
    private static transient ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private transient IVOMeta vometa = null;
    private String exTable;

    @Override
    public IVOMeta getMetaData() {
        return null;
    }

    private IVOMeta getMetaDataInner() {
        if (this.vometa == null) {
            this.vometa = this.getMetaData();
        }
        return this.vometa;
    }

    @Override
    public void setAttributeValue(String name, Object value) {
        if (this.getMetaDataInner() == null) {
            String key = name;
            String pkName = this.getPKFieldName();
            if (pkName != null && pkName.equals(name)) {
                key = "primarykey";
            }
            BeanHelper.setProperty(this, key, value);
        } else {
            IAttributeMeta attribute = this.getMetaDataInner().getAttribute(name);
            if (attribute == null) {
                this.valueIndex.put(name, value);
            } else {
                this.put(name, value, attribute);
            }
        }
    }

    private void put(String name, Object value, IAttributeMeta attribute) {
        Object ret = this.convert(attribute, value);
        if (attribute.isStatic()) {
            BeanHelper.setProperty(this, name, ret);
        } else {
            this.valueIndex.put(name, ret);
        }
    }

    private Object convert(IAttributeMeta field, Object value) {
        Object ret = null;
        if (value == null) {
            return null;
        }
        JavaType type = field.getJavaType();
        if (type == JavaType.UFDouble) {
            ret = value instanceof UFDouble ? value : new UFDouble(value.toString());
        } else if (type == JavaType.UFFlag || type == JavaType.Integer) {
            ret = value instanceof Integer ? value : Integer.valueOf(value.toString());
        } else if (type == JavaType.UFStringEnum || type == JavaType.String) {
            ret = value.toString();
        } else if (type == JavaType.UFBoolean) {
            UFBoolean flag = null;
            flag = value instanceof UFBoolean ? (UFBoolean)value : UFBoolean.valueOf(value.toString());
            ret = flag.booleanValue() ? UFBoolean.TRUE : UFBoolean.FALSE;
        } else if (type == JavaType.UFDate) {
            ret = value instanceof UFDate ? value : UFDate.fromPersisted(value.toString());
        } else if (type == JavaType.UFDateTime) {
            ret = value instanceof UFDateTime ? value : new UFDateTime(value.toString());
        } else if (type == JavaType.UFTime) {
            ret = value instanceof UFTime ? value : new UFTime(value.toString());
        } else if (type == JavaType.UFLiteralDate) {
            ret = value instanceof UFLiteralDate ? value : UFLiteralDate.fromPersisted(value.toString());
        } else if (type == JavaType.BigDecimal) {
            ret = value instanceof UFDouble ? value : new UFDouble(value.toString());
        } else if (type == JavaType.Object) {
            ret = value;
        } else {
            String message = "Do not support the business, please check!!";
            throw new IllegalArgumentException(message);
        }
        return ret;
    }

    @Override
    public Object getAttributeValue(String name) {
        if (this.getMetaDataInner() == null) {
            String key = name;
            String pkName = this.getPKFieldName();
            if (pkName != null && pkName.equals(name)) {
                key = "primarykey";
            }
            return BeanHelper.getProperty(this, key);
        }
        IAttributeMeta attribute = this.getMetaDataInner().getAttribute(name);
        if (attribute != null && attribute.isStatic()) {
            return BeanHelper.getProperty(this, name);
        }
        Object value = this.valueIndex.get(name);
        return value;
    }

    @Override
    public Object clone() {
        SuperVO vo = (SuperVO)super.clone();
        vo.valueIndex = new HashMap<String, Object>();
        vo.setStatus(this.getStatus());
        vo.setDirty(this.isDirty());
        IVOMeta voMeta = this.getMetaDataInner();
        if (voMeta == null) {
            String[] names;
            for (String name : names = this.getAttributeNames()) {
                Object value = this.getAttributeValue(name);
                vo.setAttributeValue(name, value);
            }
        } else {
            IAttributeMeta[] attributes;
            vo.valueIndex.putAll(this.valueIndex);
            for (IAttributeMeta attribute : attributes = voMeta.getStatisticInfo().getStaticAttributes()) {
                String name = attribute.getName();
                Object value = this.getAttributeValue(name);
                vo.setAttributeValue(name, value);
            }
        }
        return vo;
    }

    @Override
    public String getPrimaryKey() {
        if (this.getMetaDataInner() == null) {
            String pkName = this.getPKFieldName();
            if (pkName == null) {
                return null;
            }
            return (String)BeanHelper.getProperty(this, pkName);
        }
        IAttributeMeta keyAttribute = this.getMetaDataInner().getPrimaryAttribute();
        String name = keyAttribute.getName();
        if (keyAttribute.isStatic()) {
            return (String)BeanHelper.getProperty(this, name);
        }
        String key = (String)this.valueIndex.get(name);
        return key;
    }

    @Override
    public void setPrimaryKey(String key) {
        if (this.getMetaDataInner() == null) {
            String pkName = this.getPKFieldName();
            if (pkName == null) {
                return;
            }
            BeanHelper.setProperty(this, pkName, key);
            return;
        }
        IAttributeMeta keyAttribute = this.getMetaDataInner().getPrimaryAttribute();
        String name = keyAttribute.getName();
        if (keyAttribute.isStatic()) {
            BeanHelper.setProperty(this, name, key);
            return;
        }
        this.valueIndex.put(name, key);
    }

    @Override
    public Set<String> usedAttributeNames() {
        IAttributeMeta[] attributes;
        HashSet<String> usedSet = new HashSet<String>();
        if (this.getMetaDataInner() == null) {
            String[] names;
            for (String name : names = this.getAttributeNames()) {
                usedSet.add(name);
            }
            return usedSet;
        }
        Set<String> keySet = this.valueIndex.keySet();
        IVOMeta voMeta = this.getMetaDataInner();
        for (String name : keySet) {
            IAttributeMeta attribute = voMeta.getAttribute(name);
            if (attribute == null || !attribute.isSerializable()) continue;
            usedSet.add(name);
        }
        for (IAttributeMeta attribute : attributes = voMeta.getStatisticInfo().getStaticAttributes()) {
            usedSet.add(attribute.getName());
        }
        return usedSet;
    }

    public String toString() {
        String[] names;
        StringBuffer buffer = new StringBuffer();
        Set<String> set = this.usedAttributeNames();
        for (String name : names = this.getAttributeNames()) {
            boolean flag = set.contains(name);
            Object value = this.getAttributeValue(name);
            this.append(buffer, name, value);
            if (!flag) {
                buffer.append("[NOT SETTING]");
            }
            buffer.append("\r\n");
        }
        return buffer.toString();
    }

    private void append(StringBuffer buffer, String name, Object value) {
        buffer.append(name);
        buffer.append("=");
        if (this.getMetaDataInner() == null) {
            buffer.append(value);
            return;
        }
        IAttributeMeta attribute = this.getMetaDataInner().getAttribute(name);
        if (attribute == null) {
            buffer.append(value);
            return;
        }
        Object ret = value;
        if (ret == null && attribute.getDefaultValue() != null) {
            ret = attribute.getDefaultValue();
        }
        buffer.append(ret);
    }

    @Override
    public String[] getAttributeNames() {
        IVOMeta voMeta = this.getMetaDataInner();
        if (voMeta == null) {
            rwl.readLock().lock();
            try {
                String[] stringArray = this.getAttributeAryNoMetaData();
                return stringArray;
            }
            finally {
                rwl.readLock().unlock();
            }
        }
        IAttributeMeta[] attributes = voMeta.getAttributes();
        int length = attributes.length;
        String[] names = new String[length];
        for (int i = 0; i < length; ++i) {
            names[i] = attributes[i].getName();
        }
        return names;
    }

    @Override
    public String getEntityName() {
        if (this.getMetaDataInner() == null) {
            return null;
        }
        return this.getMetaDataInner().getClass().getName();
    }

    @Override
    public void validate() throws ValidationException {
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        IColumnMeta column;
        IVOMeta meta = this.getMetaDataInner();
        if (meta != null && (column = meta.getPrimaryAttribute().getColumn()) != null) {
            return column.getName();
        }
        return null;
    }

    public String getTableName() {
        IColumnMeta column;
        IVOMeta meta = this.getMetaDataInner();
        if (meta != null && (column = meta.getPrimaryAttribute().getColumn()) != null) {
            return column.getTable().getName();
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String[] getAttributeAryNoMetaData() {
        String[] arys = map.get(this.getClass());
        if (arys == null) {
            rwl.readLock().unlock();
            rwl.writeLock().lock();
            try {
                arys = map.get(this.getClass());
                if (arys == null) {
                    String[] strAry;
                    HashSet<String> set = new HashSet<String>();
                    for (String str : strAry = BeanHelper.getInstance().getPropertiesAry(this)) {
                        if (this.getPKFieldName() != null && str.equals("primarykey")) {
                            set.add(this.getPKFieldName());
                            continue;
                        }
                        if (str.equals("status") || str.equals("dirty") || str.equals("valueIndex") || str.equalsIgnoreCase("exTable")) continue;
                        set.add(str);
                    }
                    arys = set.toArray(new String[set.size()]);
                    map.put(this.getClass(), arys);
                }
            }
            finally {
                rwl.readLock().lock();
                rwl.writeLock().unlock();
            }
        }
        return arys;
    }

    public boolean equalsContent(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        return this.equalsContent((SuperVO)obj, this.getAttributeNames());
    }

    public boolean equalsContent(SuperVO vo, String[] attributes) {
        if (attributes == null || vo == null) {
            return false;
        }
        for (String attribute : attributes) {
            Object value2;
            Object value1 = this.getAttributeValue(attribute);
            boolean flag = this.isAttributeEquals(value1, value2 = vo.getAttributeValue(attribute));
            if (flag) continue;
            return false;
        }
        return true;
    }

    private boolean isAttributeEquals(Object attrOld, Object attrNew) {
        if (attrOld == attrNew) {
            return true;
        }
        if (attrOld == null || attrNew == null) {
            return false;
        }
        return attrOld.equals(attrNew);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        SerializeWriter writer = new SerializeWriter(out, this);
        writer.write();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        this.valueIndex = new HashMap<String, Object>();
        SerializeReader reader = new SerializeReader(in, this);
        reader.read();
    }

    public String getExTable() {
        return this.exTable;
    }

    public void setExTable(String exTable) {
        this.exTable = exTable;
    }
}

