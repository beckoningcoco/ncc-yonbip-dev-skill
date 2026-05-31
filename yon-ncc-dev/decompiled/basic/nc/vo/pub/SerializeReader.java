/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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

public class SerializeReader {
    private ObjectInputStream in = null;
    private IVOMetaStatisticInfo metaStatisticInfo = null;
    private ISuperVO vo = null;
    private IVOMeta voMeta = null;

    public SerializeReader(ObjectInputStream in, ISuperVO vo) {
        this.in = in;
        this.vo = vo;
        if (!RuntimeInfoProxy.isRunningOnCloud()) {
            this.voMeta = vo.getMetaData();
            if (this.voMeta != null) {
                this.metaStatisticInfo = this.voMeta.getStatisticInfo();
            }
        }
    }

    private String getAttributeName(short cursor, boolean isPersistent) {
        String name = null;
        name = isPersistent ? this.metaStatisticInfo.getPersistentAttribute(cursor).getName() : this.metaStatisticInfo.getSerializableAttribute(cursor).getName();
        return name;
    }

    private IAttributeMeta[] getAttributes(boolean isPersistent) {
        IAttributeMeta[] attributes = null;
        attributes = isPersistent ? this.metaStatisticInfo.getPerisistentAttributes() : this.metaStatisticInfo.getSerializableAttributes();
        return attributes;
    }

    private boolean hasDefaultValue(byte flag) {
        byte value = (byte)(flag & 2);
        return value == 2;
    }

    private boolean hasNullValue(byte flag) {
        byte value = (byte)(flag & 4);
        return value == 4;
    }

    private boolean hasValueIndex(byte flag) {
        byte value = (byte)(flag & 1);
        return value == 1;
    }

    private boolean isAllAttributeBeSetted(byte flag) {
        byte value = (byte)(flag & 0x10);
        return value == 16;
    }

    private boolean isNullAttribute(byte flag) {
        byte value = (byte)(flag & 8);
        return value == 8;
    }

    public void read() throws IOException, ClassNotFoundException {
        this.in.defaultReadObject();
        if (this.voMeta == null) {
            return;
        }
        HashSet<String> persistentDefaultSet = new HashSet<String>();
        HashSet<String> persistentNullSet = new HashSet<String>();
        HashSet<String> serializableNullSet = new HashSet<String>();
        HashSet<String> serializableDefaulSet = new HashSet<String>();
        HashMap<String, Object> persistentValueIndex = new HashMap<String, Object>();
        HashMap<String, Object> serializableValueIndex = new HashMap<String, Object>();
        try {
            this.read(persistentValueIndex, persistentDefaultSet, persistentNullSet, true);
            this.read(serializableValueIndex, serializableDefaulSet, serializableNullSet, false);
        }
        catch (IOException ex) {
            Logger.error((Object)ex);
            throw ex;
        }
        catch (ClassNotFoundException ex) {
            Logger.error((Object)ex);
            throw ex;
        }
        catch (RuntimeException ex) {
            Logger.error((Object)ex);
            throw ex;
        }
        this.setDefaultValue(persistentDefaultSet);
        this.setDefaultValue(serializableDefaulSet);
        this.setNullValue(persistentNullSet);
        this.setNullValue(serializableNullSet);
        this.setValue(persistentValueIndex);
        this.setValue(serializableValueIndex);
    }

    private void read(Map<String, Object> valueIndex, Set<String> defaultSet, Set<String> nullSet, boolean isPersistent) throws IOException, ClassNotFoundException {
        boolean isByte;
        IAttributeMeta[] attributes = this.getAttributes(isPersistent);
        int size = attributes.length;
        if (size == 0) {
            return;
        }
        byte flag = this.in.readByte();
        boolean bl = isByte = size <= 127;
        if (this.hasValueIndex(flag)) {
            this.readAttribute(valueIndex, isByte, isPersistent);
        }
        if (this.hasDefaultValue(flag)) {
            this.readAttributeIndex(defaultSet, isByte, isPersistent);
        }
        if (!this.hasNullValue(flag)) {
            return;
        }
        boolean isNull = this.isNullAttribute(flag);
        boolean isAllAttributeBeSetted = this.isAllAttributeBeSetted(flag);
        HashSet<String> set = new HashSet<String>();
        if (!isAllAttributeBeSetted) {
            this.readAttributeIndex(set, isByte, isPersistent);
        }
        this.setNullAttribute(valueIndex, defaultSet, nullSet, set, isNull, attributes);
    }

    private void readAttribute(Map<String, Object> valueIndex, boolean isByte, boolean isPersistent) throws IOException, ClassNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        this.readAttributeIndex(list, isByte, isPersistent);
        int size = list.size();
        for (int i = 0; i < size; ++i) {
            String name = (String)list.get(i);
            IAttributeMeta attribute = this.voMeta.getAttribute(name);
            Object value = this.readValue(attribute);
            valueIndex.put(name, value);
        }
    }

    private void readAttributeIndex(List<String> list, boolean isByte, boolean isPersistent) throws IOException {
        if (isByte) {
            byte size = this.in.readByte();
            for (byte i = 0; i < size; i = (byte)(i + 1)) {
                byte cursor = this.in.readByte();
                String name = this.getAttributeName(cursor, isPersistent);
                list.add(name);
            }
        } else {
            short size = this.in.readShort();
            for (short i = 0; i < size; i = (short)(i + 1)) {
                short cursor = this.in.readShort();
                String name = this.getAttributeName(cursor, isPersistent);
                list.add(name);
            }
        }
    }

    private void readAttributeIndex(Set<String> set, boolean isByte, boolean isPersistent) throws IOException {
        if (isByte) {
            byte size = this.in.readByte();
            for (byte i = 0; i < size; i = (byte)(i + 1)) {
                byte cursor = this.in.readByte();
                String name = this.getAttributeName(cursor, isPersistent);
                set.add(name);
            }
        } else {
            short size = this.in.readShort();
            for (short i = 0; i < size; i = (short)(i + 1)) {
                short cursor = this.in.readShort();
                String name = this.getAttributeName(cursor, isPersistent);
                set.add(name);
            }
        }
    }

    private UFDouble readUFDouble(ObjectInputStream in) throws IOException, ClassNotFoundException {
        UFDoubleSerializeTool tool = new UFDoubleSerializeTool();
        return tool.readUFDouble(this.in);
    }

    private Object readValue(IAttributeMeta attribute) throws IOException, ClassNotFoundException {
        Object value = null;
        JavaType type = attribute.getJavaType();
        if (type == JavaType.UFDouble) {
            value = this.readUFDouble(this.in);
        } else if (type == JavaType.String) {
            value = this.in.readObject();
        } else if (type == JavaType.Integer) {
            int ret = this.in.readInt();
            value = ret;
        } else if (type == JavaType.UFBoolean) {
            boolean ret = this.in.readBoolean();
            value = UFBoolean.valueOf(ret);
        } else if (type == JavaType.UFDate) {
            long ret = this.in.readLong();
            value = new UFDate(ret);
        } else if (type == JavaType.UFDateTime) {
            long ret = this.in.readLong();
            value = new UFDateTime(ret);
        } else if (type == JavaType.UFTime) {
            value = this.in.readObject();
        } else if (type == JavaType.BigDecimal) {
            value = this.in.readObject();
        } else if (type == JavaType.Object) {
            value = this.in.readObject();
        } else if (type == JavaType.UFStringEnum) {
            value = this.in.readObject();
        } else if (type == JavaType.UFFlag) {
            int ret = this.in.readInt();
            value = ret;
        } else if (type == JavaType.UFLiteralDate) {
            Object obj = this.in.readObject();
            value = UFLiteralDate.fromPersisted(obj.toString());
        } else {
            String message = "Do not support the business, please check!!";
            throw new IOException(message);
        }
        return value;
    }

    private void setDefaultValue(Set<String> set) {
        for (String name : set) {
            IAttributeMeta attribute = this.voMeta.getAttribute(name);
            Object defaultValue = attribute.getDefaultValue();
            this.vo.setAttributeValue(name, defaultValue);
        }
    }

    private void setNullAttribute(Map<String, Object> valueIndex, Set<String> defaultSet, Set<String> nullSet, Set<String> set, boolean flag, IAttributeMeta[] attributes) {
        if (flag) {
            nullSet.addAll(set);
        } else {
            for (IAttributeMeta attribute : attributes) {
                if (valueIndex.containsKey(attribute.getName()) || defaultSet.contains(attribute.getName()) || set.contains(attribute.getName())) continue;
                nullSet.add(attribute.getName());
            }
        }
    }

    private void setNullValue(Set<String> set) {
        for (String name : set) {
            this.vo.setAttributeValue(name, null);
        }
    }

    private void setValue(Map<String, Object> valueIndex) {
        Set<String> set = valueIndex.keySet();
        for (String name : set) {
            Object value = valueIndex.get(name);
            this.vo.setAttributeValue(name, value);
        }
    }
}

