/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.ncc.NCCEnv
 *  nc.bs.arap.actions.BillApproveBatchBSAction
 *  nc.bs.arap.actions.BillTempSaveBatchAction
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IPFBusiAction
 *  nc.itf.uap.pf.IWorkflowMachine
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.arap.receivable.IArapReceivableBillPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pub.workflownote.WorkflownoteVO
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nc.vo.pubapp.util.NCPfServiceUtils
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.pubimpl.arap.receivable;

import com.yonyou.cloud.ncc.NCCEnv;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.arap.actions.BillApproveBatchBSAction;
import nc.bs.arap.actions.BillTempSaveBatchAction;
import nc.bs.arap.actions.ReceivableBillApproveBatchBSAction;
import nc.bs.arap.actions.ReceivableBillEditBatchBSAction;
import nc.bs.arap.actions.ReceivableDeleteBatchBSAction;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.pf.IPFBusiAction;
import nc.itf.uap.pf.IWorkflowMachine;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.receivable.IArapReceivableBillPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.workflownote.WorkflownoteVO;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.pubapp.util.NCPfServiceUtils;
import org.apache.commons.collections4.CollectionUtils;

public class ReceivableBillPubServiceImpl
implements IArapReceivableBillPubService {
    public AggReceivableBillVO[] saveTemp(AggReceivableBillVO[] bills) throws BusinessException {
        new BillTempSaveBatchAction().insertVOs((AggregatedValueObject[])bills);
        return bills;
    }

    public void deleteBillBySourcePK(String[] keys) throws BusinessException {
        String condition = null;
        Collection bills = null;
        try {
            condition = SqlUtils.getInStr((String)"top_billid", (String[])keys, (boolean[])new boolean[]{true});
            String sql = "pk_recbill in( select ar_recitem.pk_recbill from ar_recitem where ar_recitem.dr=0 and (" + condition + ")) and ar_recbill.dr = 0";
            bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(AggReceivableBillVO.class, sql, false);
        }
        catch (SQLException e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
        if (bills != null && bills.size() > 0) {
            for (BaseAggVO bill : bills) {
                bill.setIsOtherModuleOriginate(Boolean.valueOf(true));
            }
            this.delete(bills.toArray(new AggReceivableBillVO[bills.size()]));
        }
    }

    public void deleteBillBySourceitemPK(String[] keys) throws BusinessException {
        String condition = null;
        Collection bills = null;
        try {
            condition = SqlUtils.getInStr((String)"top_itemid", (String[])keys, (boolean[])new boolean[]{true});
            String sql = "pk_recbill in( select ar_recitem.pk_recbill from ar_recitem where ar_recitem.dr = 0 and (" + condition + ")) and ar_recbill.dr = 0";
            bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(AggReceivableBillVO.class, sql, false);
        }
        catch (SQLException e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
        if (bills != null && bills.size() > 0) {
            ArrayList<BaseItemVO> rets = new ArrayList<BaseItemVO>();
            for (Object object : bills) {
                AggregatedValueObject bill = (AggregatedValueObject)object;
                for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                    if (Integer.valueOf(1).equals(item.getAttributeValue("dr"))) continue;
                    rets.add((BaseItemVO)item);
                }
                bill.setChildrenVO((CircularlyAccessibleValueObject[])rets.toArray(new BaseItemVO[0]));
                rets.clear();
            }
        }
        ArrayList<AggReceivableBillVO> editlst = new ArrayList<AggReceivableBillVO>();
        ArrayList<AggReceivableBillVO> dellst = new ArrayList<AggReceivableBillVO>();
        if (bills != null && bills.size() > 0) {
            List<String> key = Arrays.asList(keys);
            for (AggReceivableBillVO vo : bills) {
                boolean alldel = true;
                for (ReceivableBillItemVO item : vo.getBodyVOs()) {
                    if (key.contains(item.getTop_itemid())) {
                        item.setStatus(3);
                        continue;
                    }
                    item.setStatus(0);
                    alldel = false;
                }
                if (alldel) {
                    dellst.add(vo);
                    continue;
                }
                editlst.add(vo);
            }
            if (dellst.size() > 0) {
                this.delete(dellst.toArray(new AggReceivableBillVO[0]));
            }
            if (editlst.size() > 0) {
                this.update(editlst.toArray(new AggReceivableBillVO[0]));
            }
        }
    }

    public Map<String, Boolean> findBillBySourcePk(String[] keys) throws BusinessException {
        String condition = null;
        Collection bills = null;
        BaseDAO dao = new BaseDAO();
        HashSet<String> tmpfields = new HashSet<String>();
        HashMap<String, Boolean> answer = new HashMap<String, Boolean>();
        try {
            condition = SqlUtils.getInStr((String)"top_billid", (String[])keys, (boolean[])new boolean[]{true});
            bills = dao.retrieveByClause(ReceivableBillItemVO.class, condition, new String[]{"top_billid"});
        }
        catch (SQLException e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
        ReceivableBillItemVO[] fields = bills.toArray(new ReceivableBillItemVO[bills.size()]);
        if (keys.length == fields.length) {
            for (int i = 0; i < fields.length; ++i) {
                answer.put(fields[i].getTop_billid(), Boolean.TRUE);
                tmpfields.add(fields[i].getTop_billid());
            }
        } else {
            Set tmpkeys = (Set)((Object)Arrays.asList(keys));
            String[] subtract = CollectionUtils.subtract((Iterable)tmpkeys, tmpfields).toArray(new String[0]);
            for (int j = 0; j < subtract.length; ++j) {
                answer.put(subtract[j], Boolean.FALSE);
            }
        }
        return answer;
    }

    private ReceivableBillEditBatchBSAction getUpdateBSAction() {
        return new ReceivableBillEditBatchBSAction();
    }

    private ReceivableDeleteBatchBSAction getDeleteBSAction() {
        return new ReceivableDeleteBatchBSAction();
    }

    private BillApproveBatchBSAction getApproveBSAction() {
        return new ReceivableBillApproveBatchBSAction();
    }

    public void delete(AggReceivableBillVO bill) throws BusinessException {
        this.delete(new AggReceivableBillVO[]{bill});
    }

    public void delete(AggReceivableBillVO[] bills) throws BusinessException {
        this.getDeleteBSAction().deleteVOs((AggregatedValueObject[])bills);
        boolean merged = NCCEnv.isMerged();
        if (NCCEnv.isMerged()) {
            for (AggReceivableBillVO bill : bills) {
                ISuperVO parent = bill.getParent();
                ((IWorkflowMachine)NCLocator.getInstance().lookup(IWorkflowMachine.class)).deleteCheckFlow((String)parent.getAttributeValue("pk_tradetype"), parent.getPrimaryKey(), (AggregatedValueObject)bill, InvocationInfoProxy.getInstance().getUserId());
            }
        }
    }

    public AggReceivableBillVO save(AggReceivableBillVO bill) throws BusinessException {
        return (AggReceivableBillVO)ArrayUtil.getFirstInArrays((Object[])this.save(new AggReceivableBillVO[]{bill}));
    }

    public AggReceivableBillVO[] save(AggReceivableBillVO[] bills) throws BusinessException {
        return (AggReceivableBillVO[])ArrayUtil.convertSupers2Subs((Object[])((IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class)).processBatch("SAVE", "F0", (AggregatedValueObject[])bills, null, null, null), AggReceivableBillVO.class);
    }

    public AggReceivableBillVO update(AggReceivableBillVO bill) throws BusinessException {
        return (AggReceivableBillVO)ArrayUtil.getFirstInArrays((Object[])this.update(new AggReceivableBillVO[]{bill}));
    }

    public AggReceivableBillVO[] update(AggReceivableBillVO[] bills) throws BusinessException {
        return (AggReceivableBillVO[])ArrayUtil.convertSupers2Subs((Object[])this.getUpdateBSAction().updateVOs((AggregatedValueObject[])bills), AggReceivableBillVO.class);
    }

    public AggReceivableBillVO[] approve(AggReceivableBillVO[] bills) throws BusinessException {
        return (AggReceivableBillVO[])ArrayUtil.convertSupers2Subs((Object[])this.getApproveBSAction().approveVOs((AggregatedValueObject[])bills), AggReceivableBillVO.class);
    }

    public AggReceivableBillVO approve(AggReceivableBillVO bill) throws BusinessException {
        return (AggReceivableBillVO)ArrayUtil.getFirstInArrays((Object[])this.approve(new AggReceivableBillVO[]{bill}));
    }

    public AggReceivableBillVO insertVO(AggReceivableBillVO bill) throws BusinessException {
        AggReceivableBillVO res = (AggReceivableBillVO)ArrayUtil.getFirstInArrays((Object[])((Object[])NCPfServiceUtils.processBatch((String)"SAVE", (String)bill.getHeadVO().getPk_billtype(), (AggregatedValueObject[])new AggReceivableBillVO[]{bill}, (Object[])new PfUserObject[]{new PfUserObject()}, (WorkflownoteVO)new WorkflownoteVO())));
        return res;
    }
}

