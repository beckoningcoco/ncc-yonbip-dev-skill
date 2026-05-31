/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.jdbc.framework.processor.MapProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.ui.dbcache.DBCacheQueryFacade
 *  nc.ui.pub.print.IMetaDataDataSource
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.arap.utils.ArapPrintDigitUtil
 *  nc.vo.arap.verify.VerifyDetailVO
 *  nc.vo.arap.verify.VerifyMainVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nc.web.arap.util.VerifyVOScaleUtil
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.jdbc.framework.processor.MapProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.ui.dbcache.DBCacheQueryFacade;
import nc.ui.pub.print.IMetaDataDataSource;
import nc.util.fi.pub.SqlUtils;
import nc.vo.arap.termitem.TermVO;
import nc.vo.arap.utils.ArapPrintDigitUtil;
import nc.vo.arap.verify.VerifyDetailVO;
import nc.vo.arap.verify.VerifyMainVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.web.arap.util.VerifyVOScaleUtil;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class ArapDocPrintVerifyMainDatasource<V>
implements IMetaDataDataSource {
    private static final long serialVersionUID = 1L;
    private final String[] pk_bills;

    public ArapDocPrintVerifyMainDatasource(String[] pk_bills, String billType) {
        this.pk_bills = pk_bills;
    }

    public String[] getAllDataItemExpress() {
        return null;
    }

    public String[] getAllDataItemNames() {
        return null;
    }

    public String[] getDependentItemExpressByExpress(String itemExpress) {
        return null;
    }

    public String[] getItemValuesByExpress(String itemExpress) {
        return null;
    }

    public Object[] getMDObjects() {
        try {
            Collection busiDataVOList = new BaseDAO().retrieveByClause(VerifyMainVO.class, SqlUtils.getInStr((String)"pk_verify", (String[])this.pk_bills));
            VerifyMainVO[] verifyMainVOList = new VerifyMainVO[busiDataVOList.size()];
            busiDataVOList.toArray(verifyMainVOList);
            String[] materials = new String[verifyMainVOList.length];
            Collection verifydetailVOList = new BaseDAO().retrieveByClause(VerifyDetailVO.class, SqlUtils.getInStr((String)"pk_verify", (String[])this.pk_bills));
            for (VerifyDetailVO verifyDetailVO : verifydetailVOList) {
                String pk_verify = verifyDetailVO.getPk_verify();
                int index = Arrays.binarySearch(this.pk_bills, pk_verify);
                if (index < 0 || materials[index] == null || !StringUtils.isNotBlank((CharSequence)verifyDetailVO.getMaterial()) || "~".equals(verifyDetailVO.getMaterial())) continue;
                materials[index] = verifyDetailVO.getMaterial();
            }
            Object[] verifyMainVOScale = new VerifyVOScaleUtil().verifyMainVOScale(verifyMainVOList, materials);
            return verifyMainVOScale;
        }
        catch (DAOException e1) {
            Logger.error((Object)e1.getMessage(), (Throwable)e1);
        }
        catch (BusinessException e1) {
            Logger.error((Object)e1.getMessage(), (Throwable)e1);
        }
        return null;
    }

    public String getModuleName() {
        return null;
    }

    public boolean isNumber(String itemExpress) {
        return false;
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
                TermVO vo = (TermVO)data;
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
                datas = ArapPrintDigitUtil.getDatas((Object[])datas, fieldsMap, (String)"pk_org", (String)"pk_currtype", (String)"material");
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

