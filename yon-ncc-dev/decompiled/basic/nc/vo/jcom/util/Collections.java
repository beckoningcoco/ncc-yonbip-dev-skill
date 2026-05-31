/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import nc.vo.jcom.util.Queue;

public class Collections {
    private Collections() {
    }

    public static Queue synchronizedQueue(Queue queue) {
        return new SynchronizedQueue(queue);
    }

    static Queue synchronizedList(Queue queue, Object mutex) {
        return new SynchronizedQueue(queue, mutex);
    }

    static class SynchronizedQueue
    extends SynchronizedCollection
    implements Queue {
        Queue queue;

        SynchronizedQueue(Queue queue) {
            super(queue);
            this.queue = queue;
        }

        SynchronizedQueue(Queue queue, Object mutex) {
            super(queue, mutex);
            this.queue = queue;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean equals(Object o) {
            Object object = this.mutex;
            synchronized (object) {
                return this.queue.equals(o);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public int hashCode() {
            Object object = this.mutex;
            synchronized (object) {
                return this.queue.hashCode();
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean offer(Object o) {
            Object object = this.mutex;
            synchronized (object) {
                return this.queue.offer(o);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public Object poll() {
            Object object = this.mutex;
            synchronized (object) {
                return this.queue.poll();
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public Object remove() {
            Object object = this.mutex;
            synchronized (object) {
                return this.queue.remove();
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public Object peek() {
            Object object = this.mutex;
            synchronized (object) {
                return this.queue.peek();
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public Object element() {
            Object object = this.mutex;
            synchronized (object) {
                return this.queue.element();
            }
        }
    }

    static class SynchronizedCollection
    implements Collection,
    Serializable {
        Collection c;
        Object mutex;

        SynchronizedCollection(Collection c) {
            if (c == null) {
                throw new NullPointerException();
            }
            this.c = c;
            this.mutex = this;
        }

        SynchronizedCollection(Collection c, Object mutex) {
            this.c = c;
            this.mutex = mutex;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public int size() {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.size();
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean isEmpty() {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.isEmpty();
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean contains(Object o) {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.contains(o);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public Object[] toArray() {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.toArray();
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public Object[] toArray(Object[] a) {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.toArray(a);
            }
        }

        @Override
        public Iterator iterator() {
            return this.c.iterator();
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public boolean add(Object o) {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.add(o);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean remove(Object o) {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.remove(o);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public boolean containsAll(Collection coll) {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.containsAll(coll);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public boolean addAll(Collection coll) {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.addAll(coll);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public boolean removeAll(Collection coll) {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.removeAll(coll);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public boolean retainAll(Collection coll) {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.retainAll(coll);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void clear() {
            Object object = this.mutex;
            synchronized (object) {
                this.c.clear();
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public String toString() {
            Object object = this.mutex;
            synchronized (object) {
                return this.c.toString();
            }
        }
    }
}

