/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.itf.arap.reminder.IArapReminderBO
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.utils.fipub.MemoryResultSetProcessor
 *  nc.vo.arap.pub.BillEnumCollection$ObjType
 *  nc.vo.arap.reminder.AggReminderVO
 *  nc.vo.arap.reminder.ReminderBillVO
 *  nc.vo.arap.reminder.ReminderItemVO
 *  nc.vo.arap.reminder.ReminderQueryVO
 *  nc.vo.fipub.annotation.Business
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.rs.MemoryResultSet
 *  nc.vo.pub.rs.MemoryResultSetMetaData
 *  nccloud.commons.lang.StringUtils
 */
package nc.impl.arap.reminder;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nc.bs.arap.sql.ReminderSQLCreator;
import nc.bs.dao.BaseDAO;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.itf.arap.reminder.IArapReminderBO;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.utils.fipub.MemoryResultSetProcessor;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.reminder.AggReminderVO;
import nc.vo.arap.reminder.ReminderBillVO;
import nc.vo.arap.reminder.ReminderItemVO;
import nc.vo.arap.reminder.ReminderQueryVO;
import nc.vo.fipub.annotation.Business;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.rs.MemoryResultSet;
import nc.vo.pub.rs.MemoryResultSetMetaData;
import nccloud.commons.lang.StringUtils;

public class ArapReminderBOImpl
implements IArapReminderBO {
    @Business(business="\u8d26\u8868\u67e5\u8be2", subBusiness="\u50ac\u6b3e\u5355", description="\u50ac\u6b3e\u5355", type="\u666e\u901a\u4e1a\u52a1")
    public List<AggReminderVO> query(ReminderQueryVO queryVO) throws BusinessException {
        ReminderSQLCreator sqlCreator = new ReminderSQLCreator();
        sqlCreator.setParams(queryVO);
        try {
            String[] sqls = sqlCreator.getSQLs();
            BaseDAO dao = new BaseDAO();
            MemoryResultSetProcessor processor = new MemoryResultSetProcessor();
            int index = 0;
            dao.executeUpdate(sqls[0]);
            if (sqls.length == 4) {
                index = 1;
                dao.executeUpdate(sqls[index]);
            }
            MemoryResultSet resultSet = (MemoryResultSet)dao.executeQuery(sqls[1 + index], (ResultSetProcessor)processor);
            dao.executeUpdate(sqls[2 + index]);
            return this.arrangeResult(resultSet, queryVO);
        }
        catch (SQLException e) {
            Log.getInstance(this.getClass()).error((Object)e);
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
        return null;
    }

    private List<AggReminderVO> arrangeResult(MemoryResultSet resultSet, ReminderQueryVO qryCondVO) throws SQLException, BusinessException {
        int m;
        String[] fields = new String[]{"pk_billtype"};
        BilltypeVO billtypeVO = new BilltypeVO();
        String[] formulas = new String[]{"pk_billtype->getColValue(" + billtypeVO.getTableName() + ", pk_billtypeid, pk_billtypecode, " + "pk_billtype" + ")"};
        resultSet.setColumnByFormulate_type(fields, formulas);
        MemoryResultSetMetaData metaData = resultSet.getMetaData0();
        String dimenName = null;
        if (BillEnumCollection.ObjType.CUSTOMER.VALUE.toString().equals(qryCondVO.getQueryObj())) {
            dimenName = "customer";
        } else if (BillEnumCollection.ObjType.DEP.VALUE.toString().equals(qryCondVO.getQueryObj())) {
            dimenName = "pk_deptid";
        } else if (BillEnumCollection.ObjType.PERSON.VALUE.toString().equals(qryCondVO.getQueryObj())) {
            dimenName = "pk_psndoc";
        }
        int dimenIndex = metaData.getNameIndex(dimenName);
        String[] otherName = new String[]{"pk_group", "pk_currtype", "billdate", "billno", "pk_recbill", "expiredate", "anadate", "invoiceno", "material", "money_de", "money_bal", "money_done", "outstoreno", "pk_billtype", "pk_tradetype", "quantity_bal", "propertyid", "project", "unexpiremny", "expiredmny"};
        String[] otherName_string = new String[]{"pk_group", "pk_currtype", "billno", "invoiceno", "pk_recbill", "material", "outstoreno", "pk_billtype", "pk_tradetype", "propertyid", "project"};
        String[] otherName_ufdate = new String[]{"billdate", "expiredate", "anadate"};
        String[] otherName_ufdouble = new String[]{"money_de", "money_bal", "money_done", "quantity_bal", "unexpiremny", "expiredmny"};
        int[] otherIndex = new int[otherName.length];
        for (m = 0; m < otherName_string.length; ++m) {
            otherIndex[m] = metaData.getNameIndex(otherName_string[m]);
        }
        for (m = 0; m < otherName_ufdate.length; ++m) {
            otherIndex[m + otherName_string.length] = metaData.getNameIndex(otherName_ufdate[m]);
        }
        for (m = 0; m < otherName_ufdouble.length; ++m) {
            otherIndex[m + otherName_string.length + otherName_ufdate.length] = metaData.getNameIndex(otherName_ufdouble[m]);
        }
        String key = null;
        List oneLine = null;
        ArrayList<String> keyList = new ArrayList<String>();
        HashMap resultMap = new HashMap();
        ArrayList retList = resultSet.getResultArrayList();
        for (int i = 0; i < retList.size(); ++i) {
            oneLine = (List)retList.get(i);
            key = this.getKey(oneLine, dimenIndex);
            if (resultMap.get(key) == null) {
                keyList.add(key);
                resultMap.put(key, new ArrayList());
            }
            ((List)resultMap.get(key)).add(oneLine);
        }
        Object value = null;
        List oneObj = null;
        AggReminderVO aggVO = null;
        ReminderBillVO headVO = null;
        ReminderItemVO bodyVO = null;
        ArrayList<ReminderItemVO> bodyVOs = null;
        ArrayList<ReminderItemVO> resBodyVOs = null;
        ArrayList<AggReminderVO> resultVOList = new ArrayList<AggReminderVO>();
        for (int i = 0; i < keyList.size(); ++i) {
            oneObj = (List)resultMap.get(keyList.get(i));
            HashMap bodyMap = new HashMap();
            ArrayList<String> billNoList = new ArrayList<String>();
            int billNoIndex = metaData.getNameIndex("billno");
            for (Object e : oneObj) {
                String billNo = (String)((List)e).get(billNoIndex);
                if (bodyMap.get(billNo) == null) {
                    billNoList.add(billNo);
                    bodyMap.put(billNo, new ArrayList());
                }
                ((List)bodyMap.get(billNo)).add(e);
            }
            aggVO = new AggReminderVO();
            bodyVOs = new ArrayList<ReminderItemVO>();
            for (Object e : billNoList) {
                List itemList = (List)bodyMap.get(e);
                for (int m2 = 0; m2 < itemList.size(); ++m2) {
                    int j;
                    List itemVO = (List)itemList.get(m2);
                    bodyVO = new ReminderItemVO();
                    for (j = 0; j < otherName_string.length; ++j) {
                        value = itemVO.get(otherIndex[j]);
                        if (value == null || value instanceof String && StringUtils.isEmpty((CharSequence)value.toString())) {
                            bodyVO.setAttributeValue(otherName_string[j], null);
                            continue;
                        }
                        bodyVO.setAttributeValue(otherName_string[j], value);
                    }
                    for (j = 0; j < otherName_ufdate.length; ++j) {
                        value = itemVO.get(otherIndex[j + otherName_string.length]);
                        if (value == null || value instanceof String && StringUtils.isEmpty((CharSequence)value.toString())) {
                            bodyVO.setAttributeValue(otherName_ufdate[j], null);
                            continue;
                        }
                        bodyVO.setAttributeValue(otherName_ufdate[j], (Object)new UFDate(String.valueOf(value)));
                    }
                    for (j = 0; j < otherName_ufdouble.length; ++j) {
                        value = itemVO.get(otherIndex[j + otherName_ufdate.length + otherName_string.length]);
                        if (value == null || value instanceof String && StringUtils.isEmpty((CharSequence)value.toString())) {
                            bodyVO.setAttributeValue(otherName_ufdouble[j], null);
                            continue;
                        }
                        bodyVO.setAttributeValue(otherName_ufdouble[j], (Object)new UFDouble(String.valueOf(value)));
                    }
                    if (!StringUtils.isEmpty((CharSequence)qryCondVO.getAccageplan())) {
                        int propertyIDIndex = metaData.getNameIndex("propertyid");
                        int termMoneyIndex = metaData.getNameIndex("term_money_de");
                        String propertyId = (String)itemVO.get(propertyIDIndex);
                        String termMoney = itemVO.get(termMoneyIndex) == null ? null : itemVO.get(termMoneyIndex).toString();
                        bodyVO.getTime_money_bal().put(propertyId, new UFDouble(termMoney));
                    }
                    if (bodyVO.getAnadate() != null) {
                        bodyVO.setAccage(new UFDouble(UFDate.getDaysBetween((UFDate)bodyVO.getAnadate(), (UFDate)qryCondVO.getEnddate())));
                    }
                    if (bodyVO.getMoney_done() != null && bodyVO.getMoney_done().compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                        bodyVO.setMoney_done(null);
                    }
                    if (bodyVO.getQuantity_bal() != null && bodyVO.getQuantity_bal().compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                        bodyVO.setQuantity_bal(null);
                    }
                    bodyVOs.add(bodyVO);
                }
            }
            ReminderItemVO totalVO = new ReminderItemVO();
            totalVO.setMoney_de(UFDouble.ZERO_DBL);
            totalVO.setMoney_done(UFDouble.ZERO_DBL);
            totalVO.setMoney_bal(UFDouble.ZERO_DBL);
            totalVO.setQuantity_bal(UFDouble.ZERO_DBL);
            totalVO.setExpiredmny(UFDouble.ZERO_DBL);
            totalVO.setUnexpiremny(UFDouble.ZERO_DBL);
            Object var32_39 = null;
            for (int k = 0; k < bodyVOs.size(); ++k) {
                ReminderItemVO reminderItemVO = (ReminderItemVO)bodyVOs.get(k);
                totalVO.setMoney_bal(totalVO.getMoney_bal().add(reminderItemVO.getMoney_bal() == null ? UFDouble.ZERO_DBL : reminderItemVO.getMoney_bal()));
                totalVO.setExpiredmny(totalVO.getExpiredmny().add(reminderItemVO.getExpiredmny() == null ? UFDouble.ZERO_DBL : reminderItemVO.getExpiredmny()));
                totalVO.setUnexpiremny(totalVO.getUnexpiremny().add(reminderItemVO.getUnexpiremny() == null ? UFDouble.ZERO_DBL : reminderItemVO.getUnexpiremny()));
            }
            headVO = new ReminderBillVO();
            headVO.setPk_currtype(((ReminderItemVO)bodyVOs.get(0)).getPk_currtype());
            headVO.setYbye(totalVO.getMoney_bal());
            headVO.setExpiredmny(totalVO.getExpiredmny());
            headVO.setUnexpiremny(totalVO.getUnexpiremny());
            if (BillEnumCollection.ObjType.CUSTOMER.VALUE.toString().equals(qryCondVO.getQueryObj())) {
                headVO.setReminder_customer((String)keyList.get(i));
            } else if (BillEnumCollection.ObjType.DEP.VALUE.toString().equals(qryCondVO.getQueryObj())) {
                headVO.setReminder_dept((String)keyList.get(i));
            } else if (BillEnumCollection.ObjType.PERSON.VALUE.toString().equals(qryCondVO.getQueryObj())) {
                headVO.setReminder_psndoc((String)keyList.get(i));
            }
            aggVO.setParentVO((CircularlyAccessibleValueObject)headVO);
            resBodyVOs = new ArrayList<ReminderItemVO>();
            for (ReminderItemVO itemVO : bodyVOs) {
                if (UFDouble.ZERO_DBL.equals((Object)itemVO.getMoney_bal())) continue;
                resBodyVOs.add(itemVO);
            }
            aggVO.setChildrenVO(resBodyVOs.toArray(new CircularlyAccessibleValueObject[0]));
            resultVOList.add(aggVO);
        }
        return resultVOList;
    }

    private String getKey(List<?> oneLine, int index) {
        StringBuffer buff = new StringBuffer();
        if (oneLine.get(index) != null) {
            buff.append(oneLine.get(index));
        }
        return buff.toString();
    }
}

