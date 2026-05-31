/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.util;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import nc.vo.jcom.util.Queue;

public abstract class AbstractQueue
extends AbstractCollection
implements Queue {
    protected AbstractQueue() {
    }

    public boolean add(Object o) {
        if (this.offer(o)) {
            return true;
        }
        throw new IllegalStateException("Queue full");
    }

    @Override
    public Object remove() {
        Object x = this.poll();
        if (x != null) {
            return x;
        }
        throw new NoSuchElementException();
    }

    @Override
    public Object element() {
        Object x = this.peek();
        if (x != null) {
            return x;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void clear() {
        while (this.poll() != null) {
        }
    }

    public boolean addAll(Collection c) {
        if (c == null) {
            throw new NullPointerException();
        }
        if (c == this) {
            throw new IllegalArgumentException();
        }
        boolean modified = false;
        Iterator e = c.iterator();
        while (e.hasNext()) {
            if (!this.add(e.next())) continue;
            modified = true;
        }
        return modified;
    }
}

