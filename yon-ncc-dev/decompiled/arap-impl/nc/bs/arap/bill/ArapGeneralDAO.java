/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.impl.pubapp.pattern.data.bill.BillOperator
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 */
package nc.bs.arap.bill;

import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import nc.impl.pubapp.pattern.data.bill.BillOperator;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;

public class ArapGeneralDAO {
    private static volatile ArapGeneralDAO arapGeneralDAO = null;
    private static Object lock = new Object();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ArapGeneralDAO getInstance() {
        if (null == arapGeneralDAO) {
            Object object = lock;
            synchronized (object) {
                arapGeneralDAO = new ArapGeneralDAO();
            }
        }
        return arapGeneralDAO;
    }

    public <E extends IBill> E[] query(Class<E> clazz, String[] pks) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for (String pk : pks) {
            set.add(pk);
        }
        return new BillOperator().query(clazz, set.toArray(new String[0]));
    }

    public <E extends IBill> E[] queryWithOrder(Class<E> clazz, String[] pks, String[] parentField, String[] childField) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for (String pk : pks) {
            set.add(pk);
        }
        return new BillOperator().query(clazz, set.toArray(new String[0]), parentField, childField);
    }

    public <E extends IBill> E[] insert(Class<E> clazz, E[] bills) {
        return new BillOperator().insert(bills);
    }

    public <E extends IBill> E[] update(Class<E> clazz, E[] bills, E[] originBills) {
        return new BillOperator().update(bills, originBills);
    }

    public <E extends IBill> E[] update(Class<E> clazz, E[] bills) {
        IBill[] originBills = (IBill[])Array.newInstance(clazz, bills.length);
        String[] pks = (String[])Array.newInstance(String.class, bills.length);
        for (int index = 0; index < originBills.length; ++index) {
            pks[index] = originBills[index].getParent().getPrimaryKey();
        }
        return new BillOperator().update(bills, originBills);
    }
}

