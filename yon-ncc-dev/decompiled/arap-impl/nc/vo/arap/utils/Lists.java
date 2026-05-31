/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Lists {
    private Lists() {
    }

    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList();
    }

    public static <T> ArrayList<T> newArrayList(T ... args) {
        ArrayList<T> list = Lists.newArrayList();
        Collections.addAll(list, args);
        return list;
    }

    public static <T> ArrayList<T> newArrayList(Iterable<? extends T> iter) {
        if (iter instanceof Collection) {
            Collection c = (Collection)iter;
            return new ArrayList(c);
        }
        return Lists.newArrayList(iter.iterator());
    }

    public static <T> ArrayList<T> newArrayList(Iterator<? extends T> iter) {
        ArrayList<T> list = Lists.newArrayList();
        while (iter.hasNext()) {
            list.add(iter.next());
        }
        return list;
    }

    public static <T> LinkedList<T> newLinkedList() {
        return new LinkedList();
    }

    public static <T> LinkedList<T> newLinkedList(T ... args) {
        LinkedList<T> list = Lists.newLinkedList();
        Collections.addAll(list, args);
        return list;
    }

    public static <T> LinkedList<T> newLinkedList(Iterator<? extends T> iter) {
        LinkedList<T> list = Lists.newLinkedList();
        while (iter.hasNext()) {
            list.add(iter.next());
        }
        return list;
    }

    public static <T> LinkedList<T> newLinkedList(Iterable<? extends T> iter) {
        if (iter instanceof Collection) {
            Collection c = (Collection)iter;
            return new LinkedList(c);
        }
        return Lists.newLinkedList(iter.iterator());
    }
}

