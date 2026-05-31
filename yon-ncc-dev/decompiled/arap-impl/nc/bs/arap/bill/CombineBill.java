/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nc.vo.pubapp.pattern.pub.Constructor
 *  nc.vo.pubapp.pattern.pub.ListToArrayTool
 *  nc.vo.pubapp.pattern.pub.MapList
 */
package nc.bs.arap.bill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.pubapp.pattern.pub.Constructor;
import nc.vo.pubapp.pattern.pub.ListToArrayTool;
import nc.vo.pubapp.pattern.pub.MapList;

public class CombineBill<E extends IBill> {
    private List<String> keyList = new ArrayList<String>();
    private List<String> dateKeyList = new ArrayList<String>();
    private List<Integer> intervalList = new ArrayList<Integer>();

    public void appendDateKey(String dateKey, int interval) {
        this.dateKeyList.add(dateKey);
        this.intervalList.add(interval);
    }

    public void appendKey(String itemKey) {
        this.keyList.add(itemKey);
    }

    private void combine(E bill, MapList<String, ISuperVO> childIndex, Map<String, ISuperVO> parentIndex) {
        ISuperVO[] vos;
        ISuperVO parent = bill.getParent();
        String key = this.getKey(parent);
        if (!parentIndex.containsKey(key)) {
            parentIndex.put(key, parent);
        }
        IVOMeta childMeta = bill.getMetaData().getChildren()[0];
        for (ISuperVO vo : vos = bill.getChildren(childMeta)) {
            childIndex.put((Object)key, (Object)vo);
        }
    }

    public E[] combine(E[] bills) {
        Object[] ret = null;
        if (this.keyList.size() == 0 && this.dateKeyList.size() == 0) {
            ret = bills;
        } else if (bills.length < 2) {
            ret = bills;
        } else {
            MapList childIndex = new MapList();
            HashMap<String, ISuperVO> parentIndex = new HashMap<String, ISuperVO>();
            for (E bill : bills) {
                this.combine(bill, (MapList<String, ISuperVO>)childIndex, parentIndex);
            }
            ret = this.construct(childIndex, parentIndex, bills[0].getClass());
        }
        return ret;
    }

    private E[] construct(MapList<String, ISuperVO> childIndex, Map<String, ISuperVO> parentIndex, Class<? extends IBill> clazz) {
        ArrayList<IBill> billList = new ArrayList<IBill>();
        ListToArrayTool tool = new ListToArrayTool();
        Set<Map.Entry<String, ISuperVO>> entrySet = parentIndex.entrySet();
        for (Map.Entry<String, ISuperVO> entry : entrySet) {
            String key = entry.getKey();
            ISuperVO header = entry.getValue();
            List list = childIndex.get((Object)key);
            ISuperVO[] children = (ISuperVO[])tool.convertToArray(list);
            IBill newBill = (IBill)Constructor.construct(clazz);
            newBill.setParent(header);
            newBill.setChildren(children[0].getMetaData(), children);
            billList.add(newBill);
        }
        ListToArrayTool tool2 = new ListToArrayTool();
        return (IBill[])tool2.convertToArray(billList);
    }

    private String getKey(ISuperVO vo) {
        StringBuffer buffer = new StringBuffer();
        for (String key : this.keyList) {
            Object value = vo.getAttributeValue(key);
            buffer.append(value == null ? "" : value.toString());
            buffer.append(";");
        }
        return buffer.toString();
    }
}

