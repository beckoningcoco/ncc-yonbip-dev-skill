/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Log
 *  nc.jdbc.framework.processor.MapProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.ui.dbcache.DBCacheQueryFacade
 *  nc.ui.pub.print.IMetaDataDataSource
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.wf;

import java.util.HashMap;
import java.util.Map;
import nc.bs.logging.Log;
import nc.jdbc.framework.processor.MapProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.ui.dbcache.DBCacheQueryFacade;
import nc.ui.pub.print.IMetaDataDataSource;
import nc.vo.arap.termitem.TermVO;
import nc.vo.arap.utils.ArapPrintDigitUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;

public class ARAPBsWFPrDataSource
implements IMetaDataDataSource {
    private static final long serialVersionUID = 1L;
    private Object busiObject;

    public Object getBusiObject() {
        return this.busiObject;
    }

    public void setBusiObject(Object busiObject) {
        this.busiObject = busiObject;
    }

    public ARAPBsWFPrDataSource(Object busiObject) {
        this.busiObject = busiObject;
    }

    public String[] getAllDataItemExpress() {
        return null;
    }

    public String[] getAllDataItemNames() {
        return null;
    }

    public String[] getDependentItemExpressByExpress(String arg0) {
        return null;
    }

    public String[] getItemValuesByExpress(String arg0) {
        return null;
    }

    public String getModuleName() {
        return null;
    }

    public boolean isNumber(String arg0) {
        return false;
    }

    public Object[] getMDObjects() {
        Object[] objectArray;
        if (this.getBusiObject() == null) {
            Object[] objectArray2 = new Object[1];
            objectArray = objectArray2;
            objectArray2[0] = this.busiObject;
        } else {
            objectArray = this.adjustDatasByCurrDigit(new Object[]{this.busiObject});
        }
        return objectArray;
    }

    protected Object[] adjustDatasByCurrDigit(Object[] datas) {
        if (!ArrayUtils.isEmpty((Object[])datas)) {
            String[] global_de = new String[]{"globallocal", "globaldebit", "globalbalance", "globaltax_de", "globalnotax_de"};
            String[] group_de = new String[]{"grouplocal", "groupdebit", "groupbalance", "grouptax_de", "groupnotax_de"};
            String[] local_de = new String[]{"local_money", "local_money_de", "local_money_bal", "local_tax_de", "local_notax_de"};
            String[] money_de = new String[]{"money", "money_de", "money_bal", "notax_de", "money_done", "ybye"};
            String[] global_cr = new String[]{"globallocal", "globalcrebit", "globalbalance", "globaltax_cr", "globalnotax_cr"};
            String[] group_cr = new String[]{"grouplocal", "groupcrebit", "groupbalance", "grouptax_cr", "groupnotax_cr"};
            String[] local_cr = new String[]{"local_money", "local_money_cr", "local_money_bal", "local_tax_cr", "local_notax_cr"};
            String[] money_cr = new String[]{"money", "money_cr", "money_bal", "notax_cr"};
            String[] global_rate = new String[]{"globalrate"};
            String[] group_rate = new String[]{"grouprate"};
            String[] local_rate = new String[]{"rate"};
            String[] quantity = new String[]{"quantity_bal", "quantity_cr", "quantity_de"};
            String[] price = new String[]{"price", "taxprice"};
            String[] taxrate = new String[]{"taxrate"};
            HashMap<String, String[]> fieldsMap = new HashMap<String, String[]>();
            Object data = datas[0];
            if (data instanceof AggregatedValueObject) {
                AggregatedValueObject aggVo = (AggregatedValueObject)data;
                if (!ArrayUtils.isEmpty((Object[])aggVo.getChildrenVO())) {
                    String pk_billtype = (String)aggVo.getChildrenVO()[0].getAttributeValue("pk_billtype");
                    if (!("F0".equals(pk_billtype) || "F3".equals(pk_billtype) || "23E0".equals(pk_billtype) || "F1".equals(pk_billtype) || "F2".equals(pk_billtype) || "23E1".equals(pk_billtype))) {
                        Map runQuery = (Map)DBCacheQueryFacade.runQuery((String)("select pk_billtypecode from bd_billtype where pk_billtypeid = '" + pk_billtype + "'"), (ResultSetProcessor)new MapProcessor());
                        String string = pk_billtype = runQuery == null ? pk_billtype : (String)runQuery.get("pk_billtypecode");
                    }
                    if ("F0".equals(pk_billtype) || "F3".equals(pk_billtype) || "23E0".equals(pk_billtype)) {
                        fieldsMap.put("field_global_money", global_de);
                        fieldsMap.put("field_group_money", group_de);
                        fieldsMap.put("field_local_currtype", local_de);
                        fieldsMap.put("field_money", money_de);
                    } else if ("F1".equals(pk_billtype) || "F2".equals(pk_billtype) || "23E1".equals(pk_billtype)) {
                        fieldsMap.put("field_global_money", global_cr);
                        fieldsMap.put("field_group_money", group_cr);
                        fieldsMap.put("field_local_currtype", local_cr);
                        fieldsMap.put("field_money", money_cr);
                    }
                }
            } else if (data instanceof TermVO) {
                TermVO vo = (TermVO)((Object)data);
                if (vo.getMoney_de().compareTo((Object)UFDouble.ZERO_DBL) != 0) {
                    fieldsMap.put("field_global_money", global_de);
                    fieldsMap.put("field_group_money", group_de);
                    fieldsMap.put("field_local_currtype", local_de);
                    fieldsMap.put("field_money", money_de);
                } else {
                    fieldsMap.put("field_global_money", global_cr);
                    fieldsMap.put("field_group_money", group_cr);
                    fieldsMap.put("field_local_currtype", local_cr);
                    fieldsMap.put("field_money", money_cr);
                }
            }
            fieldsMap.put("field_global_rate", global_rate);
            fieldsMap.put("field_group_rate", group_rate);
            fieldsMap.put("field_local_rate", local_rate);
            fieldsMap.put("field_quantity", quantity);
            fieldsMap.put("field_price", price);
            fieldsMap.put("field_taxrate", taxrate);
            try {
                datas = ArapPrintDigitUtil.getDatas(datas, fieldsMap, "pk_org", "pk_currtype", "material");
            }
            catch (NumberFormatException e) {
                Log.getInstance(this.getClass()).error((Object)e);
            }
            catch (IllegalArgumentException e) {
                Log.getInstance(this.getClass()).error((Object)e);
            }
            catch (IllegalAccessException e) {
                Log.getInstance(this.getClass()).error((Object)e);
            }
            catch (BusinessException e) {
                Log.getInstance(this.getClass()).error((Object)e);
            }
        }
        return datas;
    }
}

