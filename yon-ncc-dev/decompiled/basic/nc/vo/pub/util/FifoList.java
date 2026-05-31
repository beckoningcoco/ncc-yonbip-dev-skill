/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util;

import java.util.LinkedList;

public class FifoList
extends LinkedList {
    int capacity;

    public FifoList(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(int index, Object element) {
        if (this.size() > this.capacity) {
            this.removeFirst();
        }
        super.add(index, element);
    }
}

