/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 */
package nc.bs.arap.bill;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;

public class ArapBillBO {
    private static ArapBillBO instance = null;

    public static ArapBillBO getInstance() {
        if (null == instance) {
            instance = new ArapBillBO();
        }
        return instance;
    }

    public PaginationQueryVO queryPaginationQueryVO(String condition, Integer billCount, String billType) throws BusinessException {
        try {
            List<BaseBillVO> allvos = ArapBillDAO.getInstance().queryByCondition(condition, billType);
            PaginationQueryVO vo = null;
            if (allvos != null && allvos.size() > 0) {
                vo = new PaginationQueryVO();
                ArrayList<String> pks = new ArrayList<String>();
                HashMap<String, BaseBillVO> map = new HashMap<String, BaseBillVO>();
                String key = ArapBillType2TableMapping.getPK_bill(billType);
                for (BaseBillVO baseBillVO : allvos) {
                    String pk = (String)baseBillVO.getAttributeValue(key);
                    pks.add(pk);
                    map.put(pk, baseBillVO);
                }
                vo.setAllpks(pks.toArray(new String[0]));
                vo.setBillmap(map);
            }
            return vo;
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public BaseAggVO[] queryVOsByWhere(String condition, Class<?> voClass) throws BusinessException {
        try {
            Collection c = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(voClass, condition, false);
            return c.toArray(new BaseAggVO[0]);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public Object[] queryBillByPKForPageQry(String[] keys, String billType) throws BusinessException {
        return ArapBillDAO.getInstance().queryBillByPKForPageQry(keys, billType);
    }

    public AggregatedValueObject[] queryBillByPrimaryKeys(String[] pks, String billtype) throws BusinessException {
        return ArapBillDAO.getInstance().queryBillByPrimaryKeys(pks, billtype);
    }

    public AggregatedValueObject[] queryBillByPrimaryKeysWithOrder(String[] pks, String billtype, String[] parentField, String[] childField) throws BusinessException {
        return ArapBillDAO.getInstance().queryBillByPrimaryKeysWithOrder(pks, billtype, parentField, childField);
    }

    public BaseAggVO queryBillByPrimaryKey(String pk, String billtype) throws BusinessException {
        BaseAggVO vo = null;
        try {
            vo = ArapBillDAO.getInstance().queryBillByPrimaryKey(pk, billtype);
        }
        catch (Exception e) {
            ExceptionHandler.createException((Throwable)e);
        }
        return vo;
    }

    public void updateCooperateFlag(List<String> topBillPKs, Integer flag) throws BusinessException {
        ArapBillDAO.getInstance().updateCooperateFlag(topBillPKs, flag);
    }

    public void updateSourceBillIsReded(BaseAggVO bill, boolean del) throws BusinessException {
        BaseBillVO parent = (BaseBillVO)bill.getParentVO();
        BaseItemVO[] items = (BaseItemVO[])bill.getChildrenVO();
        if (null != parent.getIsreded() && !parent.getIsreded().booleanValue()) {
            int originNum = 0;
            int deleteNum = 0;
            String vouchid = null;
            for (int i = 0; i < items.length; ++i) {
                if (!StringUtil.isEmptyWithTrim((String)items[i].getTop_billid())) {
                    ++originNum;
                    vouchid = items[i].getTop_billid();
                }
                if (items[i].getStatus() != 3) continue;
                ++deleteNum;
            }
            if (originNum != 0 && (originNum == deleteNum || del)) {
                ArapBillDAO.getInstance().updateSourceBillIsReded(vouchid);
            }
        }
    }

    public void updateSourceBillBatchIsReded(BaseAggVO[] bills, boolean del) throws BusinessException {
        ArrayList<String> vouchids = new ArrayList<String>();
        for (BaseAggVO bill : bills) {
            BaseBillVO parent = (BaseBillVO)bill.getParentVO();
            BaseItemVO[] items = (BaseItemVO[])bill.getChildrenVO();
            if (null == parent.getIsreded() || parent.getIsreded().booleanValue()) continue;
            String vouchid = null;
            for (int i = 0; i < items.length; ++i) {
                if (StringUtil.isEmptyWithTrim((String)items[i].getTop_billid())) continue;
                vouchid = items[i].getTop_billid();
            }
            vouchids.add(vouchid);
        }
        ArapBillDAO.getInstance().updateSourceBillBatchIsReded(vouchids);
    }
}

