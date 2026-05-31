/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import nc.vo.jcom.util.AbstractQueue;

public class PriorityQueue
extends AbstractQueue
implements Serializable {
    private static final int DEFAULT_INITIAL_CAPACITY = 11;
    private transient Object[] queue;
    private int size = 0;
    private final Comparator comparator;
    private transient int modCount = 0;

    public PriorityQueue() {
        this(11, null);
    }

    public PriorityQueue(int initialCapacity) {
        this(initialCapacity, null);
    }

    public PriorityQueue(int initialCapacity, Comparator comparator) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException();
        }
        this.queue = new Object[initialCapacity + 1];
        this.comparator = comparator;
    }

    private void initializeArray(Collection c) {
        int sz = c.size();
        int initialCapacity = (int)Math.min((long)sz * 110L / 100L, 0x7FFFFFFEL);
        if (initialCapacity < 1) {
            initialCapacity = 1;
        }
        this.queue = new Object[initialCapacity + 1];
    }

    private void fillFromSorted(Collection c) {
        Iterator i = c.iterator();
        while (i.hasNext()) {
            this.queue[++this.size] = i.next();
        }
    }

    private void fillFromUnsorted(Collection c) {
        Iterator i = c.iterator();
        while (i.hasNext()) {
            this.queue[++this.size] = i.next();
        }
        this.heapify();
    }

    public PriorityQueue(Collection c) {
        this.initializeArray(c);
        if (c instanceof SortedSet) {
            SortedSet s = (SortedSet)c;
            this.comparator = s.comparator();
            this.fillFromSorted(s);
        } else if (c instanceof PriorityQueue) {
            PriorityQueue s = (PriorityQueue)c;
            this.comparator = s.comparator();
            this.fillFromSorted(s);
        } else {
            this.comparator = null;
            this.fillFromUnsorted(c);
        }
    }

    public PriorityQueue(PriorityQueue c) {
        this.initializeArray(c);
        this.comparator = c.comparator();
        this.fillFromSorted(c);
    }

    public PriorityQueue(SortedSet c) {
        this.initializeArray(c);
        this.comparator = c.comparator();
        this.fillFromSorted(c);
    }

    private void grow(int index) {
        int newlen = this.queue.length;
        if (index < newlen) {
            return;
        }
        if (index == Integer.MAX_VALUE) {
            throw new OutOfMemoryError();
        }
        while (newlen <= index) {
            if (newlen >= 0x3FFFFFFF) {
                newlen = Integer.MAX_VALUE;
                continue;
            }
            newlen <<= 2;
        }
        Object[] newQueue = new Object[newlen];
        System.arraycopy(this.queue, 0, newQueue, 0, this.queue.length);
        this.queue = newQueue;
    }

    @Override
    public boolean offer(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        ++this.modCount;
        ++this.size;
        if (this.size >= this.queue.length) {
            this.grow(this.size);
        }
        this.queue[this.size] = o;
        this.fixUp(this.size);
        return true;
    }

    @Override
    public Object peek() {
        if (this.size == 0) {
            return null;
        }
        return this.queue[1];
    }

    @Override
    public boolean add(Object o) {
        return this.offer(o);
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            return false;
        }
        if (this.comparator == null) {
            for (int i = 1; i <= this.size; ++i) {
                if (((Comparable)this.queue[i]).compareTo(o) != 0) continue;
                this.removeAt(i);
                return true;
            }
        } else {
            for (int i = 1; i <= this.size; ++i) {
                if (this.comparator.compare(this.queue[i], o) != 0) continue;
                this.removeAt(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        ++this.modCount;
        for (int i = 1; i <= this.size; ++i) {
            this.queue[i] = null;
        }
        this.size = 0;
    }

    @Override
    public Object poll() {
        if (this.size == 0) {
            return null;
        }
        ++this.modCount;
        Object result = this.queue[1];
        this.queue[1] = this.queue[this.size];
        this.queue[this.size--] = null;
        if (this.size > 1) {
            this.fixDown(1);
        }
        return result;
    }

    private Object removeAt(int i) {
        Object moved;
        ++this.modCount;
        this.queue[i] = moved = this.queue[this.size];
        this.queue[this.size--] = null;
        if (i <= this.size) {
            this.fixDown(i);
            if (this.queue[i] == moved) {
                this.fixUp(i);
                if (this.queue[i] != moved) {
                    return moved;
                }
            }
        }
        return null;
    }

    private void fixUp(int k) {
        if (this.comparator == null) {
            int j;
            while (k > 1 && ((Comparable)this.queue[j = k >> 1]).compareTo(this.queue[k]) > 0) {
                Object tmp = this.queue[j];
                this.queue[j] = this.queue[k];
                this.queue[k] = tmp;
                k = j;
            }
        } else {
            int j;
            while (k > 1 && this.comparator.compare(this.queue[j = k >>> 1], this.queue[k]) > 0) {
                Object tmp = this.queue[j];
                this.queue[j] = this.queue[k];
                this.queue[k] = tmp;
                k = j;
            }
        }
    }

    private void fixDown(int k) {
        if (this.comparator == null) {
            int j;
            while ((j = k << 1) <= this.size && j > 0) {
                if (j < this.size && ((Comparable)this.queue[j]).compareTo(this.queue[j + 1]) > 0) {
                    ++j;
                }
                if (((Comparable)this.queue[k]).compareTo(this.queue[j]) > 0) {
                    Object tmp = this.queue[j];
                    this.queue[j] = this.queue[k];
                    this.queue[k] = tmp;
                    k = j;
                    continue;
                }
                break;
            }
        } else {
            int j;
            while ((j = k << 1) <= this.size && j > 0) {
                if (j < this.size && this.comparator.compare(this.queue[j], this.queue[j + 1]) > 0) {
                    ++j;
                }
                if (this.comparator.compare(this.queue[k], this.queue[j]) > 0) {
                    Object tmp = this.queue[j];
                    this.queue[j] = this.queue[k];
                    this.queue[k] = tmp;
                    k = j;
                    continue;
                }
                break;
            }
        }
    }

    private void heapify() {
        for (int i = this.size / 2; i >= 1; --i) {
            this.fixDown(i);
        }
    }

    public Comparator comparator() {
        return this.comparator;
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeInt(this.queue.length);
        for (int i = 1; i <= this.size; ++i) {
            s.writeObject(this.queue[i]);
        }
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        int arrayLength = s.readInt();
        this.queue = new Object[arrayLength];
        for (int i = 1; i <= this.size; ++i) {
            this.queue[i] = s.readObject();
        }
    }

    private class Itr
    implements Iterator {
        private int cursor = 1;
        private int lastRet = 0;
        private int expectedModCount = PriorityQueue.access$100(PriorityQueue.this);
        private ArrayList forgetMeNot = null;
        private Object lastRetElt = null;

        private Itr() {
        }

        @Override
        public boolean hasNext() {
            return this.cursor <= PriorityQueue.this.size || this.forgetMeNot != null;
        }

        public Object next() {
            Object result;
            this.checkForComodification();
            if (this.cursor <= PriorityQueue.this.size) {
                result = PriorityQueue.this.queue[this.cursor];
                this.lastRet = this.cursor++;
            } else {
                if (this.forgetMeNot == null) {
                    throw new NoSuchElementException();
                }
                int remaining = this.forgetMeNot.size();
                result = this.forgetMeNot.remove(remaining - 1);
                if (remaining == 1) {
                    this.forgetMeNot = null;
                }
                this.lastRet = 0;
                this.lastRetElt = result;
            }
            return result;
        }

        @Override
        public void remove() {
            this.checkForComodification();
            if (this.lastRet != 0) {
                Object moved = PriorityQueue.this.removeAt(this.lastRet);
                this.lastRet = 0;
                if (moved == null) {
                    --this.cursor;
                } else {
                    if (this.forgetMeNot == null) {
                        this.forgetMeNot = new ArrayList();
                    }
                    this.forgetMeNot.add(moved);
                }
            } else if (this.lastRetElt != null) {
                PriorityQueue.this.remove(this.lastRetElt);
                this.lastRetElt = null;
            } else {
                throw new IllegalStateException();
            }
            this.expectedModCount = PriorityQueue.this.modCount;
        }

        final void checkForComodification() {
            if (PriorityQueue.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }
}

