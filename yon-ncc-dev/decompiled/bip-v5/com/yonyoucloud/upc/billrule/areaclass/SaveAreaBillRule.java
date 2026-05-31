/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.util.BillInfoUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.voucher.base.IAutoCode
 *  com.yonyou.ucf.mdd.ext.voucher.enums.Status
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.areaclass;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.util.BillInfoUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.voucher.base.IAutoCode;
import com.yonyou.ucf.mdd.ext.voucher.enums.Status;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.springframework.stereotype.Component;

@Component(value="saveAreaBillRule")
public class SaveAreaBillRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            boolean isInsert = false;
            boolean status = (Boolean)bill.get("stopstatus");
            if (EntityStatus.Insert == bill.getEntityStatus()) {
                isInsert = true;
                BillInfoUtils.setAddAuditInfo((BizObject)bill);
                BillInfoUtils.setTenant((BillContext)billContext, (BizObject)bill);
            } else {
                isInsert = false;
                BillInfoUtils.setEditAuditInfo((BizObject)bill);
            }
            BillInfoUtils.setStatusInfo((BizObject)bill, (Status)Status.newopen);
            if (!status) {
                bill.set("stopstatus", (Object)status);
                bill.set("stoptime", null);
            }
            try {
                Long oldParent = null;
                String oldPath = null;
                if (isInsert) {
                    MetaDaoHelper.insert((String)billContext.getFullname(), (BizObject)bill);
                } else {
                    Map oldTree = BillInfoUtils.getOldParent((String)billContext.getFullname(), (BizObject)bill);
                    if (null != oldTree && oldTree.size() > 0) {
                        oldParent = (Long)oldTree.get("parent");
                        oldPath = (String)oldTree.get("path");
                    }
                    MetaDaoHelper.update((String)billContext.getFullname(), (BizObject)bill);
                    if (status) {
                        HashMap<String, Object> params = new HashMap<String, Object>();
                        Entity entity = MetaDaoHelper.getEntity((String)billContext.getFullname());
                        params.put("stopstatus", status);
                        params.put("stoptime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                        params.put("id", bill.getId());
                        params.put("tableName", entity.getMainTableName());
                        SqlHelper.update((String)"com.yonyoucloud.uretail.bill.dao.AreaBillRuleDao.stopAreaTree", params);
                    }
                }
                BillInfoUtils.updateTree((BizObject)bill, (String)billContext.getFullname(), (Object)AppContext.getTenantId(), oldParent, oldPath);
            }
            catch (Exception zr) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_CONCURRENT_ERROR);
            }
        }
        if (null != bills && bills.size() > 0 && bills.get(0) instanceof IAutoCode) {
            this.putParam(paramMap, "refreshField", "code");
        }
        return new RuleExecuteResult();
    }
}

