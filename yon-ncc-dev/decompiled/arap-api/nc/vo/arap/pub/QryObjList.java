/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.pub;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class QryObjList<E>
implements List<E>,
Serializable {
    private static final long serialVersionUID = 6550071893342594704L;
    private List<E> m_array = new ArrayList();
    private int m_fieldAttribute = 0;
    public static final int PK = 0;
    public static final int NAME = 1;
    public static final int CODE = 2;

    public String toString() {
        String str = "";
        for (int i = 0; i < this.m_array.size(); ++i) {
            E obj = this.m_array.get(i);
            if (obj == null) continue;
            if (i > 0) {
                str = str + ",";
            }
            str = str + obj.toString();
        }
        return str;
    }

    public void setArray(List<E> array) {
        this.m_array = array;
    }

    public List<E> getArray() {
        if (this.m_array == null) {
            this.m_array = new ArrayList(0);
        }
        return this.m_array;
    }

    public int getFieldAttribute() {
        return this.m_fieldAttribute;
    }

    public void setFieldAttribue(int fieldAttribute) {
        this.m_fieldAttribute = fieldAttribute;
    }

    public int getFieldAttribue() {
        return this.m_fieldAttribute;
    }

    @Override
    public int size() {
        return this.getArray().size();
    }

    @Override
    public void clear() {
        this.getArray().clear();
    }

    @Override
    public boolean isEmpty() {
        return this.getArray().isEmpty();
    }

    @Override
    public Object[] toArray() {
        return this.getArray().toArray();
    }

    @Override
    public E get(int arg0) {
        return this.getArray().get(arg0);
    }

    @Override
    public E remove(int arg0) {
        return this.getArray().remove(arg0);
    }

    @Override
    public void add(int arg0, E arg1) {
        this.getArray().add(arg0, arg1);
    }

    @Override
    public int indexOf(Object arg0) {
        return this.getArray().indexOf(arg0);
    }

    @Override
    public int lastIndexOf(Object arg0) {
        return this.getArray().lastIndexOf(arg0);
    }

    @Override
    public boolean add(E arg0) {
        return this.getArray().add(arg0);
    }

    @Override
    public boolean contains(Object arg0) {
        return this.getArray().contains(arg0);
    }

    @Override
    public boolean remove(Object arg0) {
        return this.getArray().remove(arg0);
    }

    @Override
    public boolean addAll(int arg0, Collection arg1) {
        return this.getArray().addAll(arg0, arg1);
    }

    @Override
    public boolean addAll(Collection arg0) {
        return this.getArray().addAll(arg0);
    }

    @Override
    public boolean containsAll(Collection arg0) {
        return this.getArray().containsAll(arg0);
    }

    @Override
    public boolean removeAll(Collection arg0) {
        return this.getArray().removeAll(arg0);
    }

    @Override
    public boolean retainAll(Collection arg0) {
        return this.getArray().retainAll(arg0);
    }

    @Override
    public Iterator<E> iterator() {
        return this.getArray().iterator();
    }

    @Override
    public List<E> subList(int arg0, int arg1) {
        return this.getArray().subList(arg0, arg1);
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.getArray().listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int arg0) {
        return this.getArray().listIterator(arg0);
    }

    @Override
    public E set(int arg0, E arg1) {
        return this.getArray().set(arg0, arg1);
    }

    @Override
    public Object[] toArray(Object[] arg0) {
        return this.getArray().toArray(arg0);
    }
}

