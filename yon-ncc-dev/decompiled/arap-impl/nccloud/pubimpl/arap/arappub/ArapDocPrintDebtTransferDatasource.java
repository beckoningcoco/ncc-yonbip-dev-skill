/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.processor.ArrayProcessor
 *  nc.jdbc.framework.processor.MapProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.para.SysInitQuery
 *  nc.ui.dbcache.DBCacheQueryFacade
 *  nc.ui.pub.print.IMetaDataDataSource
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.arap.debttransfer.DebtTransferVO
 *  nc.vo.arap.sysinit.SysinitConst
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.arap.utils.ArapPrintDigitUtil
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.MultiLangContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nc.web.arap.util.VerifyVOScaleUtil
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.dto.arap.arappub.ArapBillMulTime
 */
package nccloud.pubimpl.arap.arappub;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ArrayProcessor;
import nc.jdbc.framework.processor.MapProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.para.SysInitQuery;
import nc.ui.dbcache.DBCacheQueryFacade;
import nc.ui.pub.print.IMetaDataDataSource;
import nc.util.fi.pub.SqlUtils;
import nc.vo.arap.debttransfer.DebtTransferVO;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.termitem.TermVO;
import nc.vo.arap.utils.ArapPrintDigitUtil;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.MultiLangContext;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.web.arap.util.VerifyVOScaleUtil;
import nccloud.commons.lang.ArrayUtils;
import nccloud.dto.arap.arappub.ArapBillMulTime;

public class ArapDocPrintDebtTransferDatasource<V>
implements IMetaDataDataSource {
    private static final long serialVersionUID = 1L;
    private final String[] pk_bills;
    private final String billType;

    public ArapDocPrintDebtTransferDatasource(String[] pk_bills, String billType) {
        this.pk_bills = pk_bills;
        this.billType = billType;
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
            Collection busiDataVOList = new BaseDAO().retrieveByClause(DebtTransferVO.class, SqlUtils.getInStr((String)"pk_debtstransfer", (String[])this.pk_bills));
            if (busiDataVOList != null && busiDataVOList.size() > 0) {
                Object[] aggDebtTransferVOList = new DebtTransferVO[busiDataVOList.size()];
                busiDataVOList.toArray(aggDebtTransferVOList);
                boolean isDoc = false;
                String initcode = "";
                initcode = this.billType.equals("Yf") || this.billType.equals("Fk") ? "AP2" : "AR2";
                String HxMode = SysInitQuery.getParaString((String)aggDebtTransferVOList[0].getPk_org(), (String)initcode);
                if (HxMode.equals(SysinitConst.VERIFY_BILL)) {
                    isDoc = true;
                }
                this.createHisDataVO((DebtTransferVO[])aggDebtTransferVOList, isDoc);
                this.setObjName((DebtTransferVO[])aggDebtTransferVOList);
                Boolean isSensitiveTimeZone = InvocationInfoProxy.getInstance().getSensitiveTimeZone();
                if (isSensitiveTimeZone.booleanValue()) {
                    ArapBillMulTime.processTimeZone((Object[])aggDebtTransferVOList);
                }
                Object[] verifyDebtTransferVOScale = new VerifyVOScaleUtil().verifyDebtTransferVOScale((DebtTransferVO[])aggDebtTransferVOList);
                return verifyDebtTransferVOScale;
            }
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage());
        }
        return null;
    }

    public Map<String, DebtTransferVO> createHisDataVO(DebtTransferVO[] dataArr, boolean isDocument) {
        HashMap<String, DebtTransferVO> showMap = new HashMap<String, DebtTransferVO>();
        if (isDocument) {
            for (DebtTransferVO vo : dataArr) {
                String pk_bill = vo.getPk_bill();
                String busino = vo.getBusino();
                UFDouble money = vo.getMoney();
                UFDouble local_money = vo.getLocal_money();
                UFDouble gr_local_money = vo.getGroup_money();
                UFDouble gl_local_money = vo.getGlobal_money();
                if (showMap.containsKey(pk_bill + "_" + busino)) {
                    ((DebtTransferVO)showMap.get(pk_bill + "_" + busino)).setSum_money(((DebtTransferVO)showMap.get(pk_bill + "_" + busino)).getSum_money().add(money));
                    ((DebtTransferVO)showMap.get(pk_bill + "_" + busino)).setSum_local_money(((DebtTransferVO)showMap.get(pk_bill + "_" + busino)).getSum_local_money().add(local_money));
                    ((DebtTransferVO)showMap.get(pk_bill + "_" + busino)).setSum_gr_money(((DebtTransferVO)showMap.get(pk_bill + "_" + busino)).getSum_gr_money().add(gr_local_money));
                    ((DebtTransferVO)showMap.get(pk_bill + "_" + busino)).setSum_gl_money(((DebtTransferVO)showMap.get(pk_bill + "_" + busino)).getSum_gl_money().add(gl_local_money));
                    continue;
                }
                vo.setSum_money(money);
                vo.setSum_local_money(local_money);
                vo.setSum_gr_money(gr_local_money);
                vo.setSum_gl_money(gl_local_money);
                showMap.put(pk_bill + "_" + busino, vo);
            }
        } else {
            for (DebtTransferVO vo : dataArr) {
                String pk_item = vo.getPk_item();
                String busino = vo.getBusino();
                UFDouble money = vo.getMoney();
                UFDouble local_money = vo.getLocal_money();
                UFDouble gr_local_money = vo.getGroup_money();
                UFDouble gl_local_money = vo.getGlobal_money();
                if (showMap.containsKey(pk_item + "_" + busino)) {
                    ((DebtTransferVO)showMap.get(pk_item + "_" + busino)).setSum_money(((DebtTransferVO)showMap.get(pk_item + "_" + busino)).getSum_money().add(money));
                    ((DebtTransferVO)showMap.get(pk_item + "_" + busino)).setSum_local_money(((DebtTransferVO)showMap.get(pk_item + "_" + busino)).getSum_local_money().add(local_money));
                    ((DebtTransferVO)showMap.get(pk_item + "_" + busino)).setSum_gr_money(((DebtTransferVO)showMap.get(pk_item + "_" + busino)).getSum_gr_money().add(gr_local_money));
                    ((DebtTransferVO)showMap.get(pk_item + "_" + busino)).setSum_gl_money(((DebtTransferVO)showMap.get(pk_item + "_" + busino)).getSum_gl_money().add(gl_local_money));
                    continue;
                }
                vo.setSum_money(money);
                vo.setSum_local_money(local_money);
                vo.setSum_gr_money(gr_local_money);
                vo.setSum_gl_money(gl_local_money);
                showMap.put(pk_item + "_" + busino, vo);
            }
        }
        return showMap;
    }

    public void setObjName(DebtTransferVO[] aggDebtTransferVOList) {
        for (DebtTransferVO debtTransferVO : aggDebtTransferVOList) {
            int inobjType = debtTransferVO.getInobjtype();
            int outobjType = debtTransferVO.getOutobjtype();
            String name = this.getMultypename();
            try {
                Object[] inobj = null;
                Object[] outobj = null;
                inobj = inobjType == 2 ? (Object[])((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery("SELECT " + name + " FROM org_dept where pk_dept ='" + debtTransferVO.getInobj() + "'", (ResultSetProcessor)new ArrayProcessor()) : (inobjType == 3 ? (Object[])((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery("SELECT " + name + " FROM bd_psndoc where pk_psndoc ='" + debtTransferVO.getInobj() + "'", (ResultSetProcessor)new ArrayProcessor()) : (Object[])((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery("SELECT " + name + " FROM bd_customer where pk_customer='" + debtTransferVO.getInobj() + "'", (ResultSetProcessor)new ArrayProcessor()));
                outobj = outobjType == 2 ? (Object[])((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery("SELECT " + name + " FROM org_dept where pk_dept ='" + debtTransferVO.getOutobj() + "'", (ResultSetProcessor)new ArrayProcessor()) : (outobjType == 3 ? (Object[])((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery("SELECT " + name + " FROM bd_psndoc where pk_psndoc ='" + debtTransferVO.getOutobj() + "'", (ResultSetProcessor)new ArrayProcessor()) : (Object[])((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery("SELECT " + name + " FROM bd_customer where pk_customer='" + debtTransferVO.getOutobj() + "'", (ResultSetProcessor)new ArrayProcessor()));
                if (inobj != null) {
                    debtTransferVO.setInobjname((String)inobj[0]);
                }
                if (outobj == null) continue;
                debtTransferVO.setOutobjname((String)outobj[0]);
            }
            catch (BusinessException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
        }
    }

    private String getMultypename() {
        int i = MultiLangContext.getInstance().getCurrentLangSeq();
        if (i == 0 || i == 1) {
            return "name";
        }
        return "name" + i;
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

