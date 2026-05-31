/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.logging.Logger
 *  nc.md.MDBaseQueryFacade
 *  nc.md.data.access.NCObject
 *  nc.md.model.IBean
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pubapp.pattern.model.entity.bill.AbstractBill
 *  nc.vo.trade.sqlutil.IInSqlBatchCallBack
 *  nc.vo.trade.sqlutil.InSqlBatchCaller
 *  nc.vo.trade.voutils.VOUtil
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.businessevent.bd;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.bd.BDCommonEvent;
import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.MDBaseQueryFacade;
import nc.md.data.access.NCObject;
import nc.md.model.IBean;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.trade.sqlutil.IInSqlBatchCallBack;
import nc.vo.trade.sqlutil.InSqlBatchCaller;
import nc.vo.trade.voutils.VOUtil;
import nccloud.commons.lang.StringUtils;

public class BDCommonEventUtil {
    private IBean ibean = null;
    private Object[] oldObjs = null;
    private String sourceID = null;

    public BDCommonEventUtil() {
    }

    public BDCommonEventUtil(String sourceID) {
        this.sourceID = sourceID;
    }

    public BDCommonEventUtil(String sourceID, IBean ibean, Object ... oldObj) {
        this.sourceID = sourceID;
        this.ibean = ibean;
        this.oldObjs = oldObj;
    }

    public BDCommonEventUtil(String sourceID, Object ... oldObj) {
        this.sourceID = sourceID;
        this.oldObjs = oldObj;
    }

    private Object[] checkAndSortOldObjs(String[] newPks, Object[] oldObjects) throws BusinessException {
        if (newPks.length != oldObjects.length) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("ref", "BDCommonEventUtil-0000"));
        }
        String[] oldPks = this.getPks(oldObjects);
        HashMap<String, Object> pk_oldObj_map = new HashMap<String, Object>();
        for (int i = 0; i < oldObjects.length; ++i) {
            pk_oldObj_map.put(oldPks[i], oldObjects[i]);
        }
        ArrayList sortedList = new ArrayList();
        for (int i = 0; i < newPks.length; ++i) {
            sortedList.add(pk_oldObj_map.get(newPks[i]));
        }
        return sortedList.toArray((Object[])Array.newInstance(oldObjects[0].getClass(), 0));
    }

    public void dispatchDeleteAfterEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1006", obj));
    }

    public void dispatchDeleteBeforeEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1005", obj));
    }

    public void dispatchInitToEnableAfterEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1067", obj));
    }

    public void dispatchInitToEnableBeforeEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1066", obj));
    }

    public void dispatchEnableToDisableAfterEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1069", obj));
    }

    public void dispatchEnableToDisableBeforeEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1068", obj));
    }

    public void dispatchInsertAfterEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1002", obj));
    }

    public void dispatchInsertBeforeEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1001", obj));
    }

    public void dispatchDisableToEnableAfterEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1071", obj));
    }

    public void dispatchDisableToEnableBeforeEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1070", obj));
    }

    public void dispatchUpdateAfterEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        Object[] oldObjects = this.getOldObj(obj);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1004", oldObjects, obj));
    }

    public void dispatchUpdateBeforeEvent(Object ... obj) throws BusinessException {
        if (obj == null || obj.length == 0) {
            return;
        }
        String sid = this.getSourceID(obj[0]);
        Object[] oldObjects = this.getOldObj(obj);
        EventDispatcher.fireEvent(new BDCommonEvent(sid, "1003", oldObjects, obj));
    }

    public IBean getIbean(Object ... obj) throws BusinessException {
        if (this.ibean == null && obj != null && obj.length > 0) {
            if (!StringUtil.isEmptyWithTrim((String)this.sourceID)) {
                this.ibean = MDBaseQueryFacade.getInstance().getBeanByID(this.sourceID);
            } else if (obj[0] instanceof AbstractBill) {
                String entityName = ((AbstractBill)obj[0]).getParent().getMetaData().getEntityName();
                this.ibean = MDBaseQueryFacade.getInstance().getBeanByFullName(entityName);
            } else {
                this.ibean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(obj[0].getClass().getName());
            }
            if (this.ibean == null) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("ref", "BDCommonEventUtil-0001", null, new String[]{obj[0].getClass().getName()}));
            }
        }
        return this.ibean;
    }

    public Object[] getOldObj(final Object ... obj) throws BusinessException {
        if (this.oldObjs == null && obj != null && obj.length > 0) {
            String[] newPks = this.getPks(obj);
            String[] newNotNullPk = null;
            if (newPks == null || newPks.length == 0) {
                throw new RuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("ref", "BDCommonEventUtil-0002"));
            }
            ArrayList<String> notNullPkList = new ArrayList<String>();
            for (String newPk : newPks) {
                if (!StringUtils.isNotBlank((CharSequence)newPk)) continue;
                notNullPkList.add(newPk);
            }
            newNotNullPk = notNullPkList.toArray(new String[0]);
            if (newNotNullPk != null && newNotNullPk.length > 0) {
                if (obj instanceof SuperVO[]) {
                    InSqlBatchCaller caller = new InSqlBatchCaller(newNotNullPk);
                    final ArrayList oldVOList = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    sb.append(((SuperVO)obj[0]).getPKFieldName());
                    sb.append(" in ");
                    final String where = sb.toString();
                    final BaseDAO baseDAO = new BaseDAO();
                    try {
                        caller.execute(new IInSqlBatchCallBack(){

                            public Object doWithInSql(String inSql) throws BusinessException, SQLException {
                                oldVOList.addAll(baseDAO.retrieveByClause(obj[0].getClass(), where + inSql));
                                return null;
                            }
                        });
                    }
                    catch (SQLException e) {
                        Logger.error((Object)e.getMessage());
                        throw new BusinessException(e.getMessage(), (Throwable)e);
                    }
                    this.oldObjs = oldVOList.toArray((Object[])Array.newInstance(obj[0].getClass(), 0));
                } else {
                    Collection c = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(obj[0].getClass(), newNotNullPk, true);
                    this.oldObjs = c.toArray((Object[])Array.newInstance(obj[0].getClass(), 0));
                }
            }
            this.oldObjs = this.checkAndSortOldObjs(newPks, this.oldObjs);
        }
        return this.oldObjs;
    }

    private String[] getPks(Object ... objs) throws BusinessException {
        if (objs == null || objs.length == 0) {
            return null;
        }
        String[] pks = null;
        if (objs instanceof SuperVO[]) {
            SuperVO[] vos = (SuperVO[])objs;
            List pkList = VOUtil.extractFieldValues((CircularlyAccessibleValueObject[])vos, (String)vos[0].getPKFieldName(), null);
            pks = pkList.toArray(new String[0]);
        } else {
            String pkFieldName = this.getIbean(objs[0]).getTable().getPrimaryKeyName();
            pks = new String[objs.length];
            for (int i = 0; i < objs.length; ++i) {
                NCObject ncObj = NCObject.newInstance((IBean)this.getIbean(objs[i]), (Object)objs[i]);
                pks[i] = (String)ncObj.getAttributeValue(this.getIbean(objs[i]).getAttributeByName(pkFieldName));
            }
        }
        return pks;
    }

    public String getSourceID(Object ... obj) throws BusinessException {
        if (this.sourceID == null && obj != null && obj.length > 0) {
            this.sourceID = this.getIbean(obj).getID();
        }
        return this.sourceID;
    }

    public void setIbean(IBean ibean) {
        this.ibean = ibean;
    }

    public void setOldObjs(Object[] oldObjs) {
        this.oldObjs = oldObjs;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }
}

