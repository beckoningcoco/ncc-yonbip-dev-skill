/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.summarize;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.trade.summarize.Hashlize;
import nc.vo.trade.summarize.IAggVOSummarizeInfo;
import nc.vo.trade.summarize.ICombine;
import nc.vo.trade.summarize.IHashKey;
import nc.vo.trade.summarize.VOCombine;
import nc.vo.trade.summarize.VOHashKeyAdapter;
import nc.vo.trade.voutils.VOUtil;

public class AggVOSummarize {
    private AggVOSummarize() {
    }

    public static HashMap[] summarizeAggVO(AggregatedValueObject[] vos, final String[] headGroupFields, final String[] headTotalFields, final String[] bodyGroupFields, final String[] bodyTotalFields) throws Exception {
        IHashKey iHashKey = new IHashKey(){
            public VOHashKeyAdapter adapter;
            {
                this.adapter = new VOHashKeyAdapter(headGroupFields);
            }

            @Override
            public String getKey(Object o) {
                AggregatedValueObject vo = (AggregatedValueObject)o;
                return this.adapter.getKey(vo.getParentVO());
            }
        };
        ICombine iCombine = new ICombine(){

            @Override
            public Object combine(Object o1, Object o2) throws Exception {
                AggregatedValueObject vo1 = (AggregatedValueObject)o1;
                AggregatedValueObject vo2 = (AggregatedValueObject)o2;
                if (vo2 == null) {
                    throw new Exception("o2 cann't be null");
                }
                AggregatedValueObject result = (AggregatedValueObject)vo2.getClass().newInstance();
                VOCombine ic = new VOCombine(headTotalFields);
                CircularlyAccessibleValueObject head1 = vo1 == null ? null : vo1.getParentVO();
                CircularlyAccessibleValueObject head2 = vo2.getParentVO();
                CircularlyAccessibleValueObject head = (CircularlyAccessibleValueObject)ic.combine(head1, head2);
                result.setParentVO(head);
                ArrayList<CircularlyAccessibleValueObject> al = new ArrayList<CircularlyAccessibleValueObject>();
                if (vo1 != null && vo1.getChildrenVO() != null && vo1.getChildrenVO().length != 0) {
                    al.addAll(Arrays.asList(vo1.getChildrenVO()));
                }
                if (vo2 != null && vo2.getChildrenVO() != null && vo2.getChildrenVO().length != 0) {
                    al.addAll(Arrays.asList(vo2.getChildrenVO()));
                }
                if (al.size() > 0) {
                    Object[] vos = (CircularlyAccessibleValueObject[])Array.newInstance(al.get(0).getClass(), 0);
                    vos = al.toArray(vos);
                    HashMap tmpHash = Hashlize.hashlizeObjects(vos, new VOHashKeyAdapter(bodyGroupFields), new VOCombine(bodyTotalFields));
                    vos = (CircularlyAccessibleValueObject[])Array.newInstance(al.get(0).getClass(), 0);
                    vos = (CircularlyAccessibleValueObject[])tmpHash.values().toArray(vos);
                    Arrays.sort(vos, new Comparator(){

                        public int compare(Object o1, Object o2) {
                            String key1 = VOUtil.getCombinesKey((CircularlyAccessibleValueObject)o1, bodyGroupFields);
                            String key2 = VOUtil.getCombinesKey((CircularlyAccessibleValueObject)o2, bodyGroupFields);
                            return key1.compareTo(key2);
                        }
                    });
                    result.setChildrenVO((CircularlyAccessibleValueObject[])vos);
                } else {
                    result.setChildrenVO(null);
                }
                return result;
            }
        };
        HashMap[] tmpHash = Hashlize.hashlizeAggVOsAndRecordSource(vos, iHashKey, iCombine);
        return tmpHash;
    }

    public static HashMap[] summarizeAggVO(AggregatedValueObject[] vos, IAggVOSummarizeInfo iInfo) throws Exception {
        return AggVOSummarize.summarizeAggVO(vos, iInfo.getHeadGroupFields(), iInfo.getHeadTotalFields(), iInfo.getBodyGroupFields(), iInfo.getBodyTotalFields());
    }
}

