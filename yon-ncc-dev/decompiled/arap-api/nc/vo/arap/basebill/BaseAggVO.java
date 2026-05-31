/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pubapp.pattern.model.entity.bill.AbstractBill
 *  nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.vo.arap.basebill;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.vo.arap.basebill.ArapVOFactory;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;
import nccloud.commons.lang.ArrayUtils;

public abstract class BaseAggVO
extends AbstractBill {
    public boolean isUpdateForSignal = false;
    private static final long serialVersionUID = 1L;
    private boolean isNeedFixInfo = false;
    private boolean isFromClient = false;
    private boolean isSaveorSaveAndCommit = false;
    private String conferReceiver;
    private String conferMessageInfo;
    private String sagaErrorMsg = null;
    private String tbbMsg = null;
    private boolean isAlarmPassed = false;
    private boolean isCrossCheckPassed = false;
    private boolean isFromCmpSignEffect = false;
    private boolean isFromCmpSettleEffect = false;
    private boolean isFromCmpSignAndAutoSettleEffect = false;
    private Map<String, String> cmpMap = new HashMap<String, String>();
    private List<String> settlementAccountList = null;
    private AggregatedValueObject settlevo = null;
    private UFBoolean cashPlanCheck = UFBoolean.FALSE;
    private UFBoolean budgetCheck = UFBoolean.FALSE;
    private Boolean isOtherModuleOriginate = false;
    private UFBoolean loadRelationItemValue = UFBoolean.FALSE;
    private List<String> loadRelationItems = null;

    public String getSagaErrorMsg() {
        return this.sagaErrorMsg;
    }

    public void setSagaErrorMsg(String sagaErrorMsg) {
        this.sagaErrorMsg = sagaErrorMsg;
    }

    public String getConferReceiver() {
        return this.conferReceiver;
    }

    public void setConferReceiver(String conferReceiver) {
        this.conferReceiver = conferReceiver;
    }

    public String getConferMessageInfo() {
        return this.conferMessageInfo;
    }

    public boolean isSaveorSaveAndCommit() {
        return this.isSaveorSaveAndCommit;
    }

    public void setSaveorSaveAndCommit(boolean isSaveorSaveAndCommit) {
        this.isSaveorSaveAndCommit = isSaveorSaveAndCommit;
    }

    public void setConferMessageInfo(String conferMessageInfo) {
        this.conferMessageInfo = conferMessageInfo;
    }

    public boolean isNeedFixInfo() {
        return this.isNeedFixInfo;
    }

    public void setNeedFixInfo(boolean isNeedFixInfo) {
        this.isNeedFixInfo = isNeedFixInfo;
    }

    public String getTbbMsg() {
        return this.tbbMsg;
    }

    public void setTbbMsg(String tbbMsg) {
        this.tbbMsg = tbbMsg;
    }

    public boolean isAlarmPassed() {
        return this.isAlarmPassed;
    }

    public void setAlarmPassed(boolean isAlarmPassed) {
        this.isAlarmPassed = isAlarmPassed;
    }

    public boolean isCrossCheckPassed() {
        return this.isCrossCheckPassed;
    }

    public void setCrossCheckPassed(boolean isCrossCheckPassed) {
        this.isCrossCheckPassed = isCrossCheckPassed;
    }

    public boolean isFromCmpSignEffect() {
        return this.isFromCmpSignEffect;
    }

    public void setFromCmpSignEffect(boolean isFromCmpSignEffect) {
        this.isFromCmpSignEffect = isFromCmpSignEffect;
    }

    public boolean isFromCmpSettleEffect() {
        return this.isFromCmpSettleEffect;
    }

    public void setFromCmpSettleEffect(boolean isFromCmpSettleEffect) {
        this.isFromCmpSettleEffect = isFromCmpSettleEffect;
    }

    public boolean isFromCmpSignAndAutoSettleEffect() {
        return this.isFromCmpSignAndAutoSettleEffect;
    }

    public void setFromCmpSignAndAutoSettleEffect(boolean isFromCmpSignAndAutoSettleEffect) {
        this.isFromCmpSignAndAutoSettleEffect = isFromCmpSignAndAutoSettleEffect;
    }

    public UFBoolean getLoadRelationItemValue() {
        return this.loadRelationItemValue;
    }

    public void setLoadRelationItemValue(UFBoolean loadRelationItemValue) {
        this.loadRelationItemValue = loadRelationItemValue;
    }

    public List<String> getLoadRelationItems() {
        return this.loadRelationItems;
    }

    public void setLoadRelationItems(List<String> loadRelationItems) {
        this.loadRelationItems = loadRelationItems;
    }

    public UFBoolean getBudgetCheck() {
        return this.budgetCheck;
    }

    public void setBudgetCheck(UFBoolean budgetCheck) {
        this.budgetCheck = budgetCheck;
    }

    public UFBoolean getCashPlanCheck() {
        return this.cashPlanCheck;
    }

    public void setCashPlanCheck(UFBoolean cashPlanCheck) {
        this.cashPlanCheck = cashPlanCheck;
    }

    public AggregatedValueObject getSettlevo() {
        return this.settlevo;
    }

    public void setSettlevo(AggregatedValueObject settlevo) {
        this.settlevo = settlevo;
    }

    public Map<String, String> getCmpMap() {
        return this.cmpMap;
    }

    public void setCmpMap(Map<String, String> cmpMap) {
        this.cmpMap = cmpMap;
    }

    public List<String> getSettlementAccountList() {
        return this.settlementAccountList;
    }

    public void setSettlementAccountList(List<String> settlementAccountList) {
        this.settlementAccountList = settlementAccountList;
    }

    public Boolean getIsOtherModuleOriginate() {
        return this.isOtherModuleOriginate;
    }

    public void setIsOtherModuleOriginate(Boolean isOtherModuleOriginate) {
        this.isOtherModuleOriginate = isOtherModuleOriginate;
    }

    public Object clone(String billType) {
        BaseAggVO vo = ArapVOFactory.getAggVOInstance(billType);
        if (this.getParentVO() != null) {
            vo.setParentVO((CircularlyAccessibleValueObject)((BaseBillVO)this.getParentVO().clone()));
        }
        BaseItemVO[] children = new BaseItemVO[this.getChildrenVO().length];
        for (int i = 0; i < this.getChildrenVO().length; ++i) {
            children[i] = (BaseItemVO)this.getChildrenVO()[i].clone();
        }
        vo.setChildrenVO((CircularlyAccessibleValueObject[])children);
        return vo;
    }

    public BaseBillVO getHeadVO() {
        return (BaseBillVO)this.getParent();
    }

    public BaseItemVO[] getItems() {
        try {
            return (BaseItemVO[])super.getChildrenVO();
        }
        catch (ClassCastException e) {
            int length = super.getChildrenVO().length;
            BaseItemVO[] ret = new BaseItemVO[length];
            System.arraycopy(super.getChildrenVO(), 0, ret, 0, length);
            return ret;
        }
    }

    public CircularlyAccessibleValueObject[] getTableVO(String tableCode) {
        AbstractBillMeta meta = (AbstractBillMeta)this.getMetaData();
        IVOMeta vometa = meta.getVOMeta(tableCode);
        ISuperVO[] vos = this.getChildren(vometa);
        return (CircularlyAccessibleValueObject[])vos;
    }

    public static String[] getParentPks(AggregatedValueObject ... bills) {
        String[] pks = new String[]{};
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return pks;
        }
        pks = new String[bills.length];
        int i = 0;
        for (AggregatedValueObject bill : bills) {
            pks[i++] = ((BaseAggVO)bill).getHeadVO().getPrimaryKey();
        }
        return pks;
    }

    public boolean isFromClient() {
        return this.isFromClient;
    }

    public void setFromClient(boolean isFromClient) {
        this.isFromClient = isFromClient;
    }
}

