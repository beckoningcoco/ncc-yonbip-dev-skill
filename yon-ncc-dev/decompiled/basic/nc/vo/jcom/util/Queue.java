/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.util;

import java.util.Collection;

public interface Queue
extends Collection {
    public boolean offer(Object var1);

    public Object poll();

    public Object remove();

    public Object peek();

    public Object element();
}

