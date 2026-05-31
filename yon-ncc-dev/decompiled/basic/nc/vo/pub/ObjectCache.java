/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import java.util.LinkedHashMap;
import java.util.Map;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public class ObjectCache {
    private static final int SIZE = 50;
    private RLRUMap<Integer, UFDate> read_date_map = new RLRUMap(50);
    private RLRUMap<Integer, UFDateTime> read_datet_map = new RLRUMap(50);
    private RLRUMap<Integer, UFDouble> read_dbl_map = new RLRUMap(50);
    private WLRUMap<UFDate, Integer> date_map = new WLRUMap(50);
    private WLRUMap<UFDateTime, Integer> datet_map = new WLRUMap(50);
    private WLRUMap<UFDouble, Integer> dbl_map = new WLRUMap(50);
    private static final int TEMP_READKEY = 1000;

    public int getWriteUFDate(UFDate date) {
        return this.date_map.get(date) == null ? -1 : (Integer)this.date_map.get(date);
    }

    public void putWriteUFDate(UFDate date) {
        this.date_map.put(date, this.date_map.size());
    }

    public int getWriteUFDateTime(UFDateTime datet) {
        return this.datet_map.get(datet) == null ? -1 : (Integer)this.datet_map.get(datet);
    }

    public void putWriteUFDateTime(UFDateTime datet) {
        this.datet_map.put(datet, this.datet_map.size());
    }

    public int getWriteUFDouble(UFDouble dbl) {
        return this.dbl_map.get(dbl) == null ? -1 : (Integer)this.dbl_map.get(dbl);
    }

    public void putWriteUFDouble(UFDouble dbl) {
        this.dbl_map.put(dbl, this.dbl_map.size());
    }

    public UFDate getReadUFDate(int index) {
        return (UFDate)this.read_date_map.get(index);
    }

    public void putReadUFDate(UFDate date) {
        if (this.read_date_map.size() == 50) {
            this.read_date_map.put(1000, date);
        } else {
            this.read_date_map.put(this.read_date_map.size(), date);
        }
    }

    public UFDateTime getReadUFDateTime(int index) {
        return (UFDateTime)this.read_datet_map.get(index);
    }

    public void putReadUFDateTime(UFDateTime datet) {
        if (this.read_datet_map.size() == 50) {
            this.read_datet_map.put(1000, datet);
        } else {
            this.read_datet_map.put(this.read_datet_map.size(), datet);
        }
    }

    public UFDouble getReadUFDouble(int index) {
        return (UFDouble)this.read_dbl_map.get(index);
    }

    public void putReadUFDouble(UFDouble dbl) {
        if (this.read_dbl_map.size() == 50) {
            this.read_dbl_map.put(1000, dbl);
        } else {
            this.read_dbl_map.put(this.read_dbl_map.size(), dbl);
        }
    }

    private class RLRUMap<K, V>
    extends LinkedHashMap<K, V> {
        private static final long serialVersionUID = 2L;
        private int intCapacity;
        private K removedKey;

        RLRUMap(int initialCapacity) {
            super(initialCapacity, 0.75f, true);
            this.intCapacity = 10;
            this.intCapacity = initialCapacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            if (this.size() > this.intCapacity) {
                this.removedKey = eldest.getKey();
                return true;
            }
            return false;
        }

        @Override
        public V put(K key, V value) {
            super.put(key, value);
            if (this.removedKey != null) {
                Object tmpVal = super.get(1000);
                super.remove(1000);
                super.put(this.removedKey, tmpVal);
            }
            return null;
        }
    }

    private class WLRUMap<K, V>
    extends LinkedHashMap<K, V> {
        private static final long serialVersionUID = 1L;
        private int intCapacity;
        private V removeValue;

        WLRUMap(int initialCapacity) {
            super(initialCapacity, 0.75f, true);
            this.intCapacity = 10;
            this.intCapacity = initialCapacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            if (this.size() > this.intCapacity) {
                this.removeValue = eldest.getValue();
                return true;
            }
            return false;
        }

        @Override
        public V put(K key, V value) {
            super.put(key, value);
            if (this.removeValue != null) {
                super.put(key, this.removeValue);
            }
            return null;
        }
    }
}

