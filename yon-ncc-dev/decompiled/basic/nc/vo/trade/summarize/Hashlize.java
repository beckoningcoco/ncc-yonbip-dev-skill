/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.summarize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.trade.summarize.BillSourceRecorder;
import nc.vo.trade.summarize.ICombine;
import nc.vo.trade.summarize.IHashKey;
import nc.vo.trade.summarize.IIdentification;

public class Hashlize {
    public static HashMap[] hashlizeAggVOsAndRecordSource(AggregatedValueObject[] vos, IHashKey iHashKey, ICombine iCombine) throws Exception {
        if (vos == null || vos.length == 0) {
            throw new IllegalArgumentException("vos cann't be null");
        }
        if (iHashKey == null) {
            throw new IllegalArgumentException("iHashKey cann't be null");
        }
        for (int i = 0; i < vos.length; ++i) {
            if (vos[i].getParentVO() != null) continue;
            throw new IllegalArgumentException("bill's headVO cann't be null");
        }
        IIdentification ii = new IIdentification(){

            @Override
            public String getID(Object obj) throws Exception {
                AggregatedValueObject bill = (AggregatedValueObject)obj;
                return bill.getParentVO().getPrimaryKey();
            }
        };
        return Hashlize.hashlizeAndRecordSource(vos, iHashKey, iCombine, ii);
    }

    public static HashMap[] hashlizeAndRecordSource(Object[] objs, IHashKey iHashKey, ICombine iCombine, IIdentification iIdentification) throws Exception {
        if (objs == null || objs.length == 0) {
            throw new IllegalArgumentException("objs cann't be null");
        }
        if (iHashKey == null) {
            throw new IllegalArgumentException("iHashKey cann't be null");
        }
        HashMap[] result = new HashMap[2];
        HashMap<String, Object> objMap = new HashMap<String, Object>();
        HashMap<String, BillSourceRecorder> recordMap = new HashMap<String, BillSourceRecorder>();
        result[0] = objMap;
        result[1] = recordMap;
        for (int i = 0; i < objs.length; ++i) {
            if (objs[i] == null) continue;
            String key = iHashKey.getKey(objs[i]);
            Object oldObj = objMap.get(key);
            BillSourceRecorder oldRecorder = (BillSourceRecorder)recordMap.get(key);
            Object combinedObj = iCombine.combine(oldObj, objs[i]);
            BillSourceRecorder recorder = Hashlize.recordBillSource(key, oldRecorder, objs[i], iIdentification);
            recordMap.put(key, recorder);
            objMap.put(key, combinedObj);
        }
        return result;
    }

    public static HashMap hashlizeObjects(Object[] objs, IHashKey iHashKey) {
        if (objs == null || objs.length == 0) {
            throw new IllegalArgumentException("objs cann't be null");
        }
        if (iHashKey == null) {
            throw new IllegalArgumentException("iHashKey cann't be null");
        }
        HashMap<String, ArrayList<Object>> result = new HashMap<String, ArrayList<Object>>();
        for (int i = 0; i < objs.length; ++i) {
            String key = iHashKey.getKey(objs[i]);
            ArrayList<Object> al = (ArrayList<Object>)result.get(key);
            if (al == null) {
                al = new ArrayList<Object>();
                result.put(key, al);
            }
            al.add(objs[i]);
        }
        return result;
    }

    public static HashMap hashlizeObjects(Object[] objs, IHashKey iHashKey, ICombine iCombine) throws Exception {
        if (objs == null || objs.length == 0) {
            throw new IllegalArgumentException("objs cann't be null");
        }
        if (iHashKey == null) {
            throw new IllegalArgumentException("iHashKey cann't be null");
        }
        HashMap<String, Object> result = new HashMap<String, Object>();
        for (int i = 0; i < objs.length; ++i) {
            String key = iHashKey.getKey(objs[i]);
            Object o = result.get(key);
            result.put(key, iCombine.combine(o, objs[i]));
        }
        return result;
    }

    public static HashMap hashlizeVOs(CircularlyAccessibleValueObject[] vos, IHashKey iHashKey) {
        if (vos == null || vos.length == 0) {
            throw new IllegalArgumentException("vos cann't be null");
        }
        if (iHashKey == null) {
            throw new IllegalArgumentException("iHashKey cann't be null");
        }
        return Hashlize.hashlizeObjects(vos, iHashKey);
    }

    protected static BillSourceRecorder recordBillSource(String key, BillSourceRecorder oldRecorder, Object oldObj, IIdentification iIdentification) throws Exception {
        if (oldRecorder == null) {
            oldRecorder = new BillSourceRecorder();
            oldRecorder.setId(key);
        }
        ArrayList<String> al = new ArrayList<String>();
        al.addAll(Arrays.asList(oldRecorder.getSourceBillPKs()));
        al.add(iIdentification.getID(oldObj));
        oldRecorder.setSourceBillPKs(al.toArray(new String[0]));
        return oldRecorder;
    }
}

