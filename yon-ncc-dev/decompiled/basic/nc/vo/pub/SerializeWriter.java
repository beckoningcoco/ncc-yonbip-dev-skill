/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import nc.bs.logging.Logger;
import nc.vo.pub.IAttributeMeta;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.IVOMetaStatisticInfo;
import nc.vo.pub.JavaType;
import nc.vo.pub.RuntimeInfoProxy;
import nc.vo.pub.UFDoubleSerializeTool;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;
import nc.vo.pub.lang.UFTime;

public class SerializeWriter {
    private IVOMetaStatisticInfo metaStatisticInfo = null;
    private ObjectOutputStream out = null;
    private ISuperVO vo = null;
    private IVOMeta voMeta = null;

    public SerializeWriter(ObjectOutputStream out, ISuperVO vo) {
        this.out = out;
        this.vo = vo;
        if (!RuntimeInfoProxy.isRunningOnCloud()) {
            this.voMeta = vo.getMetaData();
            if (this.voMeta != null) {
                this.metaStatisticInfo = this.voMeta.getStatisticInfo();
            }
        }
    }

    private byte calculateFlag(Map<String, Object> valueIndex, Set<String> defaultSet, Set<String> nullSet, int maxSize) {
        int notUsedSize;
        byte value = 0;
        if (valueIndex.size() > 0) {
            value = (byte)(value | 1);
        }
        if (defaultSet.size() > 0) {
            value = (byte)(value | 2);
        }
        if (nullSet.size() > 0) {
            value = (byte)(value | 4);
        }
        if ((notUsedSize = maxSize - valueIndex.size() - defaultSet.size() - nullSet.size()) > nullSet.size()) {
            value = (byte)(value | 8);
        } else if (notUsedSize == 0) {
            value = (byte)(value | 0x10);
        }
        return value;
    }

    private Set<String> calculateNullAttribute(Map<String, Object> valueIndex, Set<String> defaultSet, Set<String> nullSet, IAttributeMeta[] fields) throws IOException {
        HashSet<String> set = new HashSet();
        int maxSize = fields.length;
        int usedNotNullSize = valueIndex.keySet().size() + defaultSet.size();
        int notUsedSize = maxSize - usedNotNullSize - nullSet.size();
        if (notUsedSize > nullSet.size()) {
            set = nullSet;
        } else {
            for (IAttributeMeta field : fields) {
                if (valueIndex.containsKey(field.getName()) || defaultSet.contains(field.getName()) || nullSet.contains(field.getName())) continue;
                set.add(field.getName());
            }
        }
        return set;
    }

    private short getAttributeIndex(String name, boolean isPersistent) {
        short cursor = -1;
        cursor = isPersistent ? (short)this.metaStatisticInfo.getPeristentAttributeIndex(name) : (short)this.metaStatisticInfo.getSerializableAttributeIndex(name);
        return cursor;
    }

    private IAttributeMeta[] getAttributes(boolean isPersistent) {
        IAttributeMeta[] attributes = null;
        attributes = isPersistent ? this.metaStatisticInfo.getPerisistentAttributes() : this.metaStatisticInfo.getSerializableAttributes();
        return attributes;
    }

    private void splitData(Map<String, Object> persistentValueIndex, Set<String> persistentDefaultSet, Set<String> persistentNullSet, Map<String, Object> serializableValueIndex, Set<String> serializableDefaulSet, Set<String> serializableNullSet) {
        Set<String> set = this.vo.usedAttributeNames();
        for (String name : set) {
            boolean flag;
            Object value = this.vo.getAttributeValue(name);
            IAttributeMeta attribute = this.voMeta.getAttribute(name);
            if (value == null) {
                if (attribute.isPersistence()) {
                    persistentNullSet.add(name);
                    continue;
                }
                if (!attribute.isSerializable()) continue;
                serializableNullSet.add(name);
                continue;
            }
            Object defaultValue = attribute.getDefaultValue();
            boolean bl = flag = defaultValue != null;
            if (flag) {
                flag = value.equals(defaultValue);
            }
            if (flag) {
                if (attribute.isPersistence()) {
                    persistentDefaultSet.add(name);
                    continue;
                }
                if (!attribute.isSerializable()) continue;
                serializableDefaulSet.add(name);
                continue;
            }
            if (attribute.isPersistence()) {
                persistentValueIndex.put(name, value);
                continue;
            }
            if (!attribute.isSerializable()) continue;
            serializableValueIndex.put(name, value);
        }
    }

    public void write() throws IOException {
        this.out.defaultWriteObject();
        if (this.voMeta == null) {
            return;
        }
        HashSet<String> persistentDefaultSet = new HashSet<String>();
        HashSet<String> persistentNullSet = new HashSet<String>();
        HashSet<String> serializableNullSet = new HashSet<String>();
        HashSet<String> serializableDefaulSet = new HashSet<String>();
        HashMap<String, Object> persistentValueIndex = new HashMap<String, Object>();
        HashMap<String, Object> serializableValueIndex = new HashMap<String, Object>();
        this.splitData(persistentValueIndex, persistentDefaultSet, persistentNullSet, serializableValueIndex, serializableDefaulSet, serializableNullSet);
        try {
            this.write(persistentValueIndex, persistentDefaultSet, persistentNullSet, true);
            this.write(serializableValueIndex, serializableDefaulSet, serializableNullSet, false);
        }
        catch (IOException ex) {
            Logger.error((Object)ex);
            throw ex;
        }
        catch (RuntimeException ex) {
            Logger.error((Object)ex);
            throw ex;
        }
    }

    private void write(Map<String, Object> valueIndex, Set<String> defaultSet, Set<String> nullSet, boolean isPersistent) throws IOException {
        boolean isByte;
        IAttributeMeta[] attributes = this.getAttributes(isPersistent);
        int size = attributes.length;
        if (size == 0) {
            return;
        }
        byte flag = this.calculateFlag(valueIndex, defaultSet, nullSet, size);
        this.out.writeByte(flag);
        boolean bl = isByte = size <= 127;
        if (valueIndex.size() > 0) {
            this.writeValue(valueIndex, isByte, isPersistent);
        }
        if (defaultSet.size() > 0) {
            this.writeAttributeIndex(defaultSet, isByte, isPersistent);
        }
        if (nullSet.size() == 0) {
            return;
        }
        Set<String> set = this.calculateNullAttribute(valueIndex, defaultSet, nullSet, attributes);
        if (set.size() > 0) {
            this.writeAttributeIndex(set, isByte, isPersistent);
        }
    }

    private void writeAttributeIndex(Set<String> set, boolean isByte, boolean isPersistent) throws IOException {
        if (isByte) {
            byte size = (byte)set.size();
            this.out.writeByte(size);
            for (String name : set) {
                byte cusror = (byte)this.getAttributeIndex(name, isPersistent);
                this.out.writeByte(cusror);
            }
        } else {
            short size = (short)set.size();
            this.out.writeShort(size);
            for (String name : set) {
                short cusror = this.getAttributeIndex(name, isPersistent);
                this.out.writeShort(cusror);
            }
        }
    }

    private void writeUFDouble(UFDouble value) throws IOException {
        UFDoubleSerializeTool tool = new UFDoubleSerializeTool();
        tool.writeUFDouble(this.out, value);
    }

    private void writeValue(IAttributeMeta attribute, Object value) throws IOException {
        JavaType type = attribute.getJavaType();
        if (type == JavaType.UFDouble) {
            UFDouble ret = (UFDouble)value;
            this.writeUFDouble(ret);
        } else if (type == JavaType.String) {
            String ret = (String)value;
            this.out.writeObject(ret);
        } else if (type == JavaType.Integer) {
            Integer ret = (Integer)value;
            this.out.writeInt(ret);
        } else if (type == JavaType.UFBoolean) {
            UFBoolean ret = (UFBoolean)value;
            this.out.writeBoolean(ret.booleanValue());
        } else if (type == JavaType.UFDate) {
            UFDate ret = (UFDate)value;
            this.out.writeLong(ret.getMillis());
        } else if (type == JavaType.UFDateTime) {
            UFDateTime ret = (UFDateTime)value;
            this.out.writeLong(ret.getMillis());
        } else if (type == JavaType.UFTime) {
            UFTime ret = (UFTime)value;
            this.out.writeObject(ret);
        } else if (type == JavaType.BigDecimal) {
            this.out.writeObject(value);
        } else if (type == JavaType.Object) {
            this.out.writeObject(value);
        } else if (type == JavaType.UFStringEnum) {
            this.out.writeObject(value);
        } else if (type == JavaType.UFFlag) {
            Integer ret = (Integer)value;
            this.out.writeInt(ret);
        } else if (type == JavaType.UFLiteralDate) {
            UFLiteralDate ret = (UFLiteralDate)value;
            this.out.writeObject(ret.toPersisted());
        } else {
            String message = "Do not support the business, please check!!";
            throw new IOException(message);
        }
    }

    private void writeValue(Map<String, Object> valueIndex, boolean isByte, boolean isPersistent) throws IOException {
        Set<String> set = valueIndex.keySet();
        this.writeAttributeIndex(set, isByte, isPersistent);
        for (String name : set) {
            IAttributeMeta attribute = this.voMeta.getAttribute(name);
            Object value = valueIndex.get(name);
            this.writeValue(attribute, value);
        }
    }
}

