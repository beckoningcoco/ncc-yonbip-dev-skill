/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.pub.pf.CheckStatusCallbackContext
 *  nc.bs.pub.pf.ICheckStatusCallback
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.pf.change.IActionDriveChecker
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.pf.IPFSourceBillFinder
 *  nc.vo.pub.pf.SourceBillInfo
 */
package nc.bs.arap.global;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pub.pf.CheckStatusCallbackContext;
import nc.bs.pub.pf.ICheckStatusCallback;
import nc.itf.arap.fieldmap.IBillFieldGet;
import nc.itf.arap.prv.ICheckStatusCallBack;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pf.change.IActionDriveChecker;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.pf.IPFSourceBillFinder;
import nc.vo.pub.pf.SourceBillInfo;

public class ArapCheckStatusCallBackImpl
implements ICheckStatusCallback,
IPFSourceBillFinder,
IActionDriveChecker {
    public static final int NOSTATE = -1;
    public static final int COMMIT = 3;
    public static final String SAVE = "SAVE";
    public static final String BILLCOMMIT = "COMMIT";
    public static final String APPROVE = "APPROVE";
    public static final String START = "START";

    public void callCheckStatus(CheckStatusCallbackContext cscc) throws BusinessException {
        ((ICheckStatusCallBack)NCLocator.getInstance().lookup(ICheckStatusCallBack.class)).checkStatus(((BaseAggVO)((Object)cscc.getBillVo())).getHeadVO(), cscc);
    }

    public SourceBillInfo[] findSourceBill(String pkSrcBilltype, Object billEntity) throws BusinessException {
        String sql;
        String[] result;
        AggregatedValueObject vo = (AggregatedValueObject)billEntity;
        String topBillType = (String)vo.getChildrenVO()[0].getAttributeValue("top_billtype");
        String topBillid = (String)vo.getChildrenVO()[0].getAttributeValue("top_billid");
        String billMaker = (String)vo.getParentVO().getAttributeValue("billmaker");
        String approver = (String)vo.getParentVO().getAttributeValue("approver");
        List<String> arapBillType = Arrays.asList(IBillFieldGet.ARAPBILLTYPE);
        String table = null;
        String tablepk = null;
        if (arapBillType.contains(topBillType)) {
            table = ArapBillType2TableMapping.getParentTable(topBillType);
            tablepk = ArapBillType2TableMapping.getParentTablePK(topBillType);
        }
        if (table != null && tablepk != null && (result = (String[])new BaseDAO().executeQuery(sql = "select approver,billmaker from " + table + " where " + tablepk + " = '" + topBillid + "'", new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;
            String[] approver_billmaker = new String[2];

            public String[] handleResultSet(ResultSet rs) throws SQLException {
                while (rs.next()) {
                    this.approver_billmaker[0] = rs.getString(1);
                    this.approver_billmaker[1] = rs.getString(2);
                }
                return this.approver_billmaker;
            }
        })) != null && result.length == 2) {
            approver = result[0];
            billMaker = result[1];
        }
        ArrayList<SourceBillInfo> infos = new ArrayList<SourceBillInfo>();
        for (CircularlyAccessibleValueObject item : vo.getChildrenVO()) {
            SourceBillInfo info = new SourceBillInfo();
            info.setApprover(approver);
            info.setBillmaker(billMaker);
            info.setBillId((String)item.getAttributeValue("top_billid"));
            infos.add(info);
        }
        return infos.toArray(new SourceBillInfo[0]);
    }

    public boolean isEnableDrive(String srcBilltype, AggregatedValueObject srcBillVO, String srcAction, String destBillType, String beDrivedActionName) throws BusinessException {
        if (srcBillVO == null) {
            return false;
        }
        Integer approveStatus = (Integer)srcBillVO.getParentVO().getAttributeValue("approvestatus");
        if (this.isDrive(srcAction, beDrivedActionName, approveStatus)) {
            return false;
        }
        if (this.isDrive(srcBillVO, destBillType, beDrivedActionName)) {
            Logger.error((Object)"\u5185\u90e8\u63a8\u5355\uff0c\u4e0a\u6e38\u5355\u636e\u9884\u5360\u7528\u4e3a0\uff0c\u5bfc\u81f4\u751f\u6210\u4e0b\u6e38\u5355\u636e\u5931\u8d25\uff0c\u4e0d\u89e6\u53d1\u4e0b\u6e38\u5355\u636e\u4fdd\u5b58\u52a8\u4f5c\u7684\u9a71\u52a8\uff01");
            return false;
        }
        return true;
    }

    private boolean isDrive(String srcAction, String beDrivedActionName, Integer approveStatus) {
        if (approveStatus == -1) {
            return false;
        }
        if (SAVE.equals(srcAction) && BILLCOMMIT.equals(beDrivedActionName) || START.equals(beDrivedActionName)) {
            return true;
        }
        return SAVE.equals(srcAction) && APPROVE.equals(beDrivedActionName) && BillEnumCollection.ApproveStatus.PASSING.VALUE == approveStatus;
    }

    private boolean isDrive(AggregatedValueObject srcBillVO, String destBillType, String beDrivedActionName) throws DAOException {
        List<String> arapBillTypes = new ArapBillDAO().getArapBillTypes();
        Boolean flag = false;
        ArrayList<SuperVO> chilList = new ArrayList<SuperVO>();
        if (arapBillTypes.contains(destBillType) && SAVE.equals(beDrivedActionName)) {
            SuperVO[] childrenVO;
            for (SuperVO vo : childrenVO = (SuperVO[])srcBillVO.getChildrenVO()) {
                UFDouble ocmny = (UFDouble)vo.getAttributeValue("occupationmny");
                if (ocmny.compareTo((Object)UFDouble.ZERO_DBL) == 0) continue;
                chilList.add(vo);
            }
            if (chilList.size() == 0) {
                flag = true;
            }
        }
        return flag;
    }
}

