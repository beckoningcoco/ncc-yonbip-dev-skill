/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.poi.model.CellData
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassMethodDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.upc.coredoc.pub.BatchUpdateDTO
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.cls.PresentationClass
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.poi.model.CellData;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassMethodDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.coredoc.pub.BatchUpdateDTO;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.cls.PresentationClass;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productClsService")
public class ProductClsService {
    private static final Logger log = LoggerFactory.getLogger(ProductClsService.class);
    @Autowired
    private EventService2 eventService2;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ResultList syncManageclaToProductclass(Map<String, List<Long>> map) throws Exception {
        block11: {
            String lockKey = "SYNC_PRESENTATION_LOCKMANAGEMENT_CLASS" + AppContext.getYTenantId();
            String lockValue = UUID.randomUUID().toString();
            try {
                if (RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)1200)) {
                    int i;
                    List<Long> ids;
                    ArrayList<Map> manageClss;
                    List<Long> ids2;
                    QuerySchema schema = QuerySchema.create().addSelect("id,code,name,template,sort,erpCode,order,stopstatus,productClass,level").addCondition((ConditionExpression)QueryCondition.name((String)"stopstatus").eq((Object)0));
                    if (null != map && null != (ids2 = map.get("ids")) && ids2.size() != 0) {
                        schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(ids2)}));
                    }
                    if ((manageClss = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema)) == null || manageClss.size() == 0) {
                        ResultList resultList = new ResultList();
                        return resultList;
                    }
                    if (null != map && null != (ids = map.get("ids")) && ids.size() != 0) {
                        for (i = 0; i < manageClss.size(); ++i) {
                            if (Integer.parseInt(((Map)manageClss.get(i)).get("level").toString()) <= 3) continue;
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801497);
                        }
                    }
                    if (map == null || map.get("ids") == null) {
                        ArrayList<Map> newManageClass = new ArrayList<Map>();
                        for (i = 0; i < manageClss.size(); ++i) {
                            if (Integer.parseInt(((Map)manageClss.get(i)).get("level").toString()) >= 4) continue;
                            newManageClass.add((Map)manageClss.get(i));
                        }
                        manageClss = newManageClass;
                    }
                    this.dealData((List<Map>)manageClss);
                    break block11;
                }
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801498);
            }
            finally {
                RedisTool.releaseLock((String)lockKey, (String)lockValue);
            }
        }
        return new ResultList();
    }

    private void dealData(List<Map> managementClassList) throws Exception {
        HashSet<String> codeSet = new HashSet<String>();
        HashSet<Long> idSet = new HashSet<Long>();
        HashMap<String, Long> codeIdMap = new HashMap<String, Long>();
        for (Map managementClass : managementClassList) {
            if (managementClass.get("level") != null && Integer.valueOf(managementClass.get("level").toString()) > 3) continue;
            if (managementClass.get("code") != null) {
                codeSet.add(managementClass.get("code").toString());
            }
            if (managementClass.get("id") != null) {
                idSet.add(Long.valueOf(managementClass.get("id").toString()));
            }
            if (managementClass.get("code") == null || managementClass.get("id") == null) continue;
            codeIdMap.put(managementClass.get("code").toString(), Long.valueOf(managementClass.get("id").toString()));
        }
        Set<Long> mIdExistSet = this.updatePresentationByManage(codeSet, idSet, codeIdMap);
        Set<Long> mIdNotExistSet = this.insertPresentationByManage(mIdExistSet, managementClassList);
        if (!CollectionUtils.isEmpty(mIdNotExistSet)) {
            this.updateManageByPresentation(mIdNotExistSet);
            this.updatePresentationParent(idSet, mIdNotExistSet);
        }
    }

    private Set<Long> updatePresentationByManage(Set<String> codeSet, Set<Long> idSet, Map<String, Long> codeIdMap) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,manageClass");
        QueryConditionGroup conditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(codeSet), QueryCondition.name((String)"manageClass").in(idSet)});
        schema.addCondition((ConditionExpression)conditionGroup);
        List presentationClassList = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        ArrayList<ManagementClass> managementUpdateList = new ArrayList<ManagementClass>();
        ArrayList<PresentationClass> presentationUpdateList = new ArrayList<PresentationClass>();
        HashSet<Long> mIdExistSet = new HashSet<Long>();
        if (!CollectionUtils.isEmpty((Collection)presentationClassList)) {
            for (Map presentationClass : presentationClassList) {
                ManagementClass mcls;
                Long mclsId = null;
                String pclsCode = null;
                if (presentationClass.get("manageClass") != null) {
                    mclsId = (Long)presentationClass.get("manageClass");
                }
                if (presentationClass.get("code") != null) {
                    pclsCode = presentationClass.get("code").toString();
                }
                if (mclsId != null && idSet.contains(mclsId)) {
                    mIdExistSet.add(mclsId);
                    mcls = new ManagementClass();
                    mcls.setId((Object)mclsId);
                    mcls.setProductClass(Long.valueOf(presentationClass.get("id").toString()));
                    mcls.setEntityStatus(EntityStatus.Update);
                    mcls.setModifier(AppContext.getCurrentUser().getName());
                    mcls.setModifyTime(new Date());
                    managementUpdateList.add(mcls);
                    continue;
                }
                if (pclsCode == null || !codeSet.contains(pclsCode)) continue;
                mIdExistSet.add(codeIdMap.get(pclsCode));
                mcls = new ManagementClass();
                mcls.setId((Object)codeIdMap.get(pclsCode));
                mcls.setProductClass(Long.valueOf(presentationClass.get("id").toString()));
                mcls.setModifier(AppContext.getCurrentUser().getName());
                mcls.setModifyTime(new Date());
                mcls.setEntityStatus(EntityStatus.Update);
                managementUpdateList.add(mcls);
                PresentationClass pcls = new PresentationClass();
                pcls.setId((Object)Long.valueOf(presentationClass.get("id").toString()));
                pcls.setManageClass(codeIdMap.get(pclsCode));
                pcls.setModifier(AppContext.getCurrentUser().getName());
                pcls.setModifyTime(new Date());
                pcls.setEntityStatus(EntityStatus.Update);
                presentationUpdateList.add(pcls);
            }
            MetaDaoHelper.update((String)"pc.cls.PresentationClass", presentationUpdateList);
            MetaDaoHelper.update((String)"pc.cls.ManagementClass", managementUpdateList);
        }
        return mIdExistSet;
    }

    private Set<Long> insertPresentationByManage(Set<Long> mIdExistSet, List<Map> managementClassList) throws Exception {
        HashSet<Long> mIdNotExistSet = new HashSet<Long>();
        ArrayList<PresentationClass> presentationInsertList = new ArrayList<PresentationClass>();
        for (Map managementClass : managementClassList) {
            if (mIdExistSet.contains(Long.valueOf(managementClass.get("id").toString()))) continue;
            PresentationClass pcls = new PresentationClass();
            pcls.setId((Object)IdManager.getInstance().nextId());
            pcls.setManageClass(Long.valueOf(managementClass.get("id").toString()));
            pcls.set("template", managementClass.get("template"));
            pcls.set("code", managementClass.get("code"));
            pcls.set("sort", managementClass.get("sort"));
            pcls.put("name", managementClass.get("name"));
            pcls.set("erpCode", managementClass.get("erpCode"));
            pcls.set("order", managementClass.get("order"));
            pcls.set("stopstatus", managementClass.get("stopstatus"));
            pcls.set("creator", (Object)AppContext.getCurrentUser().getName());
            pcls.set("createTime", (Object)new Date());
            pcls.setEntityStatus(EntityStatus.Insert);
            mIdNotExistSet.add(Long.valueOf(managementClass.get("id").toString()));
            presentationInsertList.add(pcls);
        }
        MetaDaoHelper.insert((String)"pc.cls.PresentationClass", presentationInsertList);
        return mIdNotExistSet;
    }

    private void updateManageByPresentation(Set<Long> mIdNotExistSet) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,manageClass");
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"manageClass").in(mIdNotExistSet)});
        schema.addCondition((ConditionExpression)conditionGroup);
        List presentationClassInsetList = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        ArrayList<ManagementClass> manageUpdateList = new ArrayList<ManagementClass>();
        if (!CollectionUtils.isEmpty((Collection)presentationClassInsetList)) {
            for (Map presentationClassInset : presentationClassInsetList) {
                if (presentationClassInset.get("manageClass") == null || presentationClassInset.get("id") == null) continue;
                ManagementClass mcls = new ManagementClass();
                mcls.setId((Object)Long.valueOf(presentationClassInset.get("manageClass").toString()));
                mcls.setProductClass(Long.valueOf(presentationClassInset.get("id").toString()));
                mcls.setModifier(AppContext.getCurrentUser().getName());
                mcls.setModifyTime(new Date());
                mcls.setEntityStatus(EntityStatus.Update);
                manageUpdateList.add(mcls);
            }
        }
        MetaDaoHelper.update((String)"pc.cls.ManagementClass", manageUpdateList);
    }

    private void updatePresentationParent(Set<Long> idSet, Set<Long> mIdNotExistSet) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,parent,productClass");
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idSet)});
        schema.addCondition((ConditionExpression)conditionGroup);
        List mclsParentList = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        schema = QuerySchema.create().addSelect("id,code,name,manageClass");
        conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"manageClass").in(mIdNotExistSet)});
        schema.addCondition((ConditionExpression)conditionGroup);
        List pclsParentList = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        HashMap<Long, Long> mIdParent = new HashMap<Long, Long>();
        HashMap<Long, Long> mIdpId = new HashMap<Long, Long>();
        if (!CollectionUtils.isEmpty((Collection)mclsParentList) && !CollectionUtils.isEmpty((Collection)pclsParentList)) {
            for (Map mclsParent : mclsParentList) {
                if (mclsParent.get("id") != null && mclsParent.get("parent") != null) {
                    mIdParent.put(Long.valueOf(mclsParent.get("id").toString()), Long.valueOf(mclsParent.get("parent").toString()));
                }
                if (mclsParent.get("id") == null || mclsParent.get("productClass") == null) continue;
                mIdpId.put(Long.valueOf(mclsParent.get("id").toString()), Long.valueOf(mclsParent.get("productClass").toString()));
            }
        }
        if (!CollectionUtils.isEmpty((Collection)pclsParentList)) {
            ArrayList<PresentationClass> pclsList = new ArrayList<PresentationClass>();
            HashMap<Long, Long> pIdParent = new HashMap<Long, Long>();
            HashSet<Long> pParentSet = new HashSet<Long>();
            for (Map pclsParent : pclsParentList) {
                Long mId = Long.valueOf(pclsParent.get("manageClass").toString());
                if (mIdParent == null || mIdParent.get(mId) == null) continue;
                Long mParent = (Long)mIdParent.get(mId);
                Long pParent = (Long)mIdpId.get(mParent);
                pclsParent.put("parent", pParent);
                pParentSet.add(pParent);
                pIdParent.put(Long.valueOf(pclsParent.get("id").toString()), pParent);
            }
            for (Map pclsParent : pclsParentList) {
                Long id = Long.valueOf(pclsParent.get("id").toString());
                if (!pParentSet.contains(id)) {
                    pclsParent.put("isEnd", true);
                } else {
                    pclsParent.put("isEnd", false);
                }
                String path = "";
                for (int count = 0; count < 4 && id != null; ++count) {
                    path = id + "|" + path;
                    id = (Long)pIdParent.get(id);
                }
                String fullPath = "|" + path;
                String[] levelIds = path.split("\\|");
                int level = levelIds.length;
                PresentationClass pcls = (PresentationClass)JSON.parseObject((String)JSON.toJSONString((Object)pclsParent), PresentationClass.class);
                pcls.setPath(path);
                pcls.setLevel(Integer.valueOf(level));
                pcls.setFullPath(fullPath);
                pcls.setFirstLevel(Long.valueOf(levelIds[0]));
                if (level == 2) {
                    pcls.setSecondLevel(Long.valueOf(levelIds[1]));
                } else if (level == 3) {
                    pcls.setSecondLevel(Long.valueOf(levelIds[1]));
                    pcls.setThirdLevel(Long.valueOf(levelIds[2]));
                }
                pcls.setModifier(AppContext.getCurrentUser().getName());
                pcls.setModifyTime(new Date());
                pcls.setEntityStatus(EntityStatus.Update);
                pclsList.add(pcls);
            }
            MetaDaoHelper.update((String)"pc.cls.PresentationClass", pclsList);
        }
    }

    private Map<String, Object> getParentManageclsExistInProcls(Object parent) throws Exception {
        if (parent != null) {
            HashMap<String, Object> param = new HashMap<String, Object>();
            param.put("parent", parent);
            param.put("ytenantId", AppContext.getCurrentUser().getYTenantId());
            List proclss = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.getParentManageclsExistInProcls", param);
            if (proclss != null && proclss.size() > 0) {
                Map map = (Map)proclss.get(0);
                return map;
            }
        }
        return null;
    }

    private Map<String, Object> isManageclsExistInProcls(Object code, Object id) throws Exception {
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("code", code);
        param.put("id", id);
        param.put("ytenantId", AppContext.getCurrentUser().getYTenantId());
        List proclss = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.isManageclsExistInProcls", param);
        if (proclss != null && proclss.size() > 0) {
            Map map = (Map)proclss.get(0);
            return map;
        }
        return null;
    }

    public void clearManagement(ManagementClassMethodDTO dto) throws Exception {
        List manageClss;
        LoginUser user = AppContext.getCurrentUser();
        Long tenantId = null;
        if (user != null && user.getTenant() != null) {
            tenantId = (Long)user.getTenant();
        }
        HashMap<String, Long> params = new HashMap<String, Long>();
        params.put("tenantId", tenantId);
        List queryIds = null;
        QuerySchema schema = QuerySchema.create().addSelect("id, code").addCondition((ConditionExpression)QueryCondition.name((String)"stopstatus").eq((Object)0));
        if (null != dto && null != (queryIds = dto.getIds()) && queryIds.size() != 0) {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)queryIds)}));
        }
        if ((manageClss = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema)) == null || manageClss.size() == 0) {
            return;
        }
        ArrayList<Long> managementClassIdList = new ArrayList<Long>();
        if (!CollectionUtils.isEmpty((Collection)queryIds)) {
            for (Map manageCls : manageClss) {
                if (manageCls.get("id") == null) continue;
                managementClassIdList.add(Long.valueOf(manageCls.get("id").toString()));
            }
        }
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("managementClassIdList", managementClassIdList);
        param.put("ytenantId", AppContext.getCurrentUser().getYTenantId());
        param.put("modifier", AppContext.getCurrentUser().getName());
        param.put("modifyTime", new Date());
        if (!CollectionUtils.isEmpty(managementClassIdList)) {
            SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.clearProClsForManagecls", param);
        }
        List<Long> productClassIdList = this.getProductClassIds(managementClassIdList);
        param.put("productClassIdList", productClassIdList);
        if (!CollectionUtils.isEmpty(productClassIdList)) {
            SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.clearManageclsForProCls", param);
        }
    }

    private List<Long> getProductClassIds(List<Long> managementClassIdList) throws Exception {
        if (CollectionUtils.isEmpty(managementClassIdList)) {
            return null;
        }
        QuerySchema schema = QuerySchema.create().addSelect("id, code").addCondition((ConditionExpression)QueryCondition.name((String)"manageClass").in(managementClassIdList));
        List productClassList = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        ArrayList<Long> productClassIdList = new ArrayList<Long>();
        if (!CollectionUtils.isEmpty((Collection)productClassList)) {
            for (Map productClass : productClassList) {
                if (productClass == null || productClass.get("id") == null) continue;
                productClassIdList.add(Long.valueOf(productClass.get("id").toString()));
            }
        }
        return productClassIdList;
    }

    public Set<String> checkManagementOrg(ManagementClassMethodDTO dto) throws Exception {
        HashSet<String> orgIdSet = new HashSet<String>();
        if (dto.getId() == null) {
            return orgIdSet;
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,code,orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"manageClass").eq((Object)dto.getId()), QueryCondition.name((String)"orgId").in((Collection)dto.getOrgIds())}));
        List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)productList)) {
            for (Map product : productList) {
                if (product.get("orgId") == null) continue;
                orgIdSet.add(product.get("orgId").toString());
            }
        }
        return orgIdSet;
    }

    public Set<String> checkPurchaseOrg(ManagementClassMethodDTO dto) throws Exception {
        HashSet<String> orgIdSet = new HashSet<String>();
        if (dto.getId() == null) {
            return orgIdSet;
        }
        QuerySchema schema = QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"purchaseClass").eq((Object)dto.getId()), QueryCondition.name((String)"orgId").in((Collection)dto.getOrgIds())}));
        List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)productList)) {
            for (Map product : productList) {
                if (product.get("orgId") == null) continue;
                orgIdSet.add(product.get("orgId").toString());
            }
        }
        return orgIdSet;
    }

    public boolean checkParent(Long id, Long parent, String fullname) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"path", "id"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)parent)}));
        Map path = MetaDaoHelper.queryOne((String)fullname, (QuerySchema)schema);
        return CollectionUtils.isEmpty((Map)path) || path.get("path") == null || !path.get("path").toString().contains(id.toString());
    }

    public void checkIsEnd(BizObject bill, String fullName) throws Exception {
        if (bill != null && bill.getId() != null) {
            Long id = Long.valueOf(bill.getId().toString());
            if (bill.get("isEnd") == null || BooleanUtil.isFalse((Object)bill.get("isEnd"))) {
                ArrayList<QueryCondition> queryConditionList = new ArrayList<QueryCondition>();
                queryConditionList.add(QueryCondition.name((String)"parent").eq((Object)id));
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])((ConditionExpression[])queryConditionList.toArray(new QueryCondition[0])));
                QuerySchema getWarehouseById = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                List query = MetaDaoHelper.query((String)fullName, (QuerySchema)getWarehouseById);
                if (query != null && query.size() > 0) {
                    String code = null;
                    if (bill.get("code") != null) {
                        code = bill.get("code").toString();
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800326, new Object[]{code});
                }
            }
        }
    }

    public List<Map<String, Object>> sortTree(List<Map<String, Object>> dataList) {
        ArrayList<Map<String, Object>> sortResult = new ArrayList<Map<String, Object>>();
        if (!CollectionUtils.isEmpty(dataList)) {
            HashMap parentAndData = new HashMap();
            HashSet<Long> idset = new HashSet<Long>();
            for (Map<String, Object> data : dataList) {
                idset.add((Long)data.get("id"));
            }
            for (Map<String, Object> data : dataList) {
                Long parent = data.get("parent") == null ? 0L : (Long)data.get("parent");
                if (parentAndData.get(parent = Long.valueOf(idset.contains(parent) ? parent : 0L)) == null) {
                    ArrayList<Map<String, Object>> datas = new ArrayList<Map<String, Object>>();
                    datas.add(data);
                    parentAndData.put(parent, datas);
                    continue;
                }
                ((List)parentAndData.get(parent)).add(data);
            }
            sortResult.addAll(this.sortList((List)parentAndData.get(0L)));
            for (int i = 0; i < dataList.size(); ++i) {
                Long id;
                if (i >= sortResult.size() || parentAndData.get(id = (Long)((Map)sortResult.get(i)).get("id")) == null) continue;
                List<Map<String, Object>> sorted = this.sortList((List)parentAndData.get(id));
                sortResult.addAll(i + 1, sorted);
            }
        }
        return sortResult;
    }

    public List<Map<String, Object>> sortList(List<Map<String, Object>> dataList) {
        List<Map<String, Object>> sorted = dataList.stream().sorted((a, b) -> {
            int aOrder = 0;
            if (a.get("order") != null && a.get("order") instanceof CellData) {
                aOrder = Integer.valueOf(((CellData)a.get("order")).getValue().toString());
            } else if (a.get("order") != null) {
                aOrder = Integer.valueOf(a.get("order").toString());
            }
            int bOrder = 0;
            if (b.get("order") != null && b.get("order") instanceof CellData) {
                bOrder = Integer.valueOf(((CellData)b.get("order")).getValue().toString());
            } else if (b.get("order") != null) {
                bOrder = Integer.valueOf(b.get("order").toString());
            }
            int result = Integer.compare(aOrder, bOrder);
            if (result == 0) {
                result = StringUtils.compare((String)((String)a.get("code")), (String)((String)b.get("code")));
            }
            return result;
        }).collect(Collectors.toList());
        return sorted;
    }

    public UPCResultList batchStopProductClass(List<BatchUpdateDTO> dataList, String entityName) throws Exception {
        HashSet<String> pathSet = new HashSet<String>();
        UPCResultList resultList = new UPCResultList();
        int successCount = 0;
        int failCount = 0;
        ArrayList<String> failInfo = new ArrayList<String>();
        if (!CollectionUtils.isEmpty(dataList)) {
            for (BatchUpdateDTO data : dataList) {
                if (data == null || data.getPath() == null) continue;
                if (data.getOrgId() != null && data.getRangeOrgId() != null && !data.getOrgId().equals(data.getRangeOrgId())) {
                    String message = MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C0516FC04E0000B", (String)"\u7f16\u7801:{0},\u8bf7\u9009\u62e9\u7ba1\u7406\u7ec4\u7ec7\u4e0e\u4f7f\u7528\u7ec4\u7ec7\u76f8\u540c\u7684\u8bb0\u5f55\uff01"), data.getCode());
                    failInfo.add(message);
                    ++failCount;
                    continue;
                }
                pathSet.add(data.getPath());
                ++successCount;
            }
            resultList.setFailInfos(failInfo);
            resultList.setCount(Integer.valueOf(failCount + successCount));
            resultList.setFailCount(Integer.valueOf(failCount));
            resultList.setSucessCount(Integer.valueOf(successCount));
        }
        if (!CollectionUtils.isEmpty(pathSet)) {
            QuerySchema schema = QuerySchema.create();
            ArrayList<QueryField> qryFields = new ArrayList<QueryField>();
            qryFields.add(new QueryField("id", "id"));
            qryFields.add(new QueryField("code", "code"));
            ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
            for (String path : pathSet) {
                conditionExpressions.add(QueryCondition.name((String)"path").left_like((Object)path));
            }
            ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
            QueryConditionGroup condition = QueryConditionGroup.or((ConditionExpression[])conditionExpressions.toArray(ces));
            schema.selectFields(qryFields);
            schema.addCondition((ConditionExpression)condition);
            schema.distinct();
            List queryList = MetaDaoHelper.query((String)entityName, (QuerySchema)schema);
            ArrayList<BizObject> billDataList = new ArrayList<BizObject>();
            if (!CollectionUtils.isEmpty((Collection)queryList)) {
                Date date = new Date();
                for (Map query : queryList) {
                    BizObject data = new BizObject();
                    data.setId((Object)Long.valueOf(query.get("id").toString()));
                    data.put("stopstatus", (Object)true);
                    data.put("stoptime", (Object)date);
                    data.setEntityStatus(EntityStatus.Update);
                    billDataList.add(data);
                }
            }
            if ("pc.cls.ManagementClass".equals(entityName)) {
                EventType eventType = EventType.PC_MANAGEMENTCLASS_BATCH_STOP;
                try {
                    HashMap<String, Object> data = new HashMap<String, Object>();
                    data.put("data", JSON.toJSONString(dataList));
                    data.put("fullname", entityName);
                    this.eventService2.sendEvent("YXYBASEDOC", eventType.toString(), data);
                }
                catch (Exception e) {
                    String SENDFAIL = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408043F", (String)"\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25");
                    log.error(eventType.getDesc() + SENDFAIL + e.getMessage(), (Throwable)e);
                }
            }
            MetaDaoHelper.update((String)entityName, billDataList);
        }
        return resultList;
    }

    public UPCResultList batchUnStopProductClass(List<BatchUpdateDTO> dataList, String entityName) throws Exception {
        UPCResultList resultList = new UPCResultList();
        Set<Long> targetIds = this.unStopCheck(dataList, entityName, resultList);
        if (!CollectionUtils.isEmpty(targetIds)) {
            ArrayList<BizObject> billDataList = new ArrayList<BizObject>();
            for (Long id : targetIds) {
                BizObject data = new BizObject();
                data.setId((Object)id);
                data.put("stopstatus", (Object)false);
                data.put("stoptime", null);
                data.setEntityStatus(EntityStatus.Update);
                billDataList.add(data);
            }
            if ("pc.cls.ManagementClass".equals(entityName)) {
                EventType eventType = EventType.PC_MANAGEMENTCLASS_BATCH_UNSTOP;
                try {
                    HashMap<String, Object> data = new HashMap<String, Object>();
                    data.put("archive", JSON.toJSONString(dataList));
                    data.put("fullname", entityName);
                    this.eventService2.sendEvent("YXYBASEDOC", eventType.toString(), data);
                }
                catch (Exception e) {
                    String SENDFAIL = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408043F", (String)"\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25");
                    log.error(eventType.getDesc() + SENDFAIL + e.getMessage(), (Throwable)e);
                }
            }
            MetaDaoHelper.update((String)entityName, billDataList);
        }
        return resultList;
    }

    private Set<Long> unStopCheck(List<BatchUpdateDTO> dataList, String entityName, UPCResultList resultList) throws Exception {
        HashSet<Long> ids = new HashSet<Long>();
        int failCount = 0;
        ArrayList<String> failInfo = new ArrayList<String>();
        HashSet<Long> targetIds = new HashSet<Long>();
        HashSet<Long> parentIds = new HashSet<Long>();
        HashMap<Long, String> idCodeMap = new HashMap<Long, String>();
        HashMap<Long, String> idPathMap = new HashMap<Long, String>();
        if (!CollectionUtils.isEmpty(dataList)) {
            QuerySchema schema;
            List queryList;
            for (BatchUpdateDTO data : dataList) {
                if (data == null || data.getPath() == null || data.getId() == null) continue;
                if (data.getOrgId() != null && data.getRangeOrgId() != null && !data.getOrgId().equals(data.getRangeOrgId())) {
                    String message = MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C0516FC04E0000B", (String)"\u7f16\u7801:{0},\u8bf7\u9009\u62e9\u7ba1\u7406\u7ec4\u7ec7\u4e0e\u4f7f\u7528\u7ec4\u7ec7\u76f8\u540c\u7684\u8bb0\u5f55\uff01"), data.getCode());
                    failInfo.add(message);
                    ++failCount;
                    targetIds.remove(data.getId());
                    continue;
                }
                targetIds.add(data.getId());
                idCodeMap.put(data.getId(), data.getCode());
                idPathMap.put(data.getId(), data.getPath());
                ids.add(data.getId());
                List<String> idList = Arrays.asList(data.getPath().split("\\|"));
                if (CollectionUtils.isEmpty(idList)) continue;
                for (String id : idList) {
                    if (id == null || id.length() <= 0) continue;
                    ids.add(Long.valueOf(id));
                }
            }
            if (!CollectionUtils.isEmpty(ids)) {
                for (Long id : ids) {
                    if (id == null || targetIds.contains(id)) continue;
                    parentIds.add(id);
                }
            }
            if (!CollectionUtils.isEmpty(parentIds) && !CollectionUtils.isEmpty((Collection)(queryList = MetaDaoHelper.query((String)entityName, (QuerySchema)(schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(parentIds), QueryCondition.name((String)"stopstatus").eq((Object)1)}))))))) {
                for (Map query : queryList) {
                    if (query == null || query.get("id") == null) continue;
                    String stopId = query.get("id").toString();
                    for (Long id : ids) {
                        if (idPathMap.get(id) == null || !((String)idPathMap.get(id)).contains(stopId)) continue;
                        String message = MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C3819CE0448000A", (String)"\u7f16\u7801\u3010{0}\u3011\uff0c\u4e0a\u7ea7\u5206\u7c7b\u662f\u505c\u7528\u72b6\u6001\uff0c\u4e0d\u80fd\u542f\u7528\uff01"), idCodeMap.get(id));
                        failInfo.add(message);
                        targetIds.remove(id);
                        ++failCount;
                    }
                    ids = new HashSet();
                    ids.addAll(targetIds);
                }
            }
            resultList.setFailInfos(failInfo);
            resultList.setCount(Integer.valueOf(failCount + targetIds.size()));
            resultList.setFailCount(Integer.valueOf(failCount));
            resultList.setSucessCount(Integer.valueOf(targetIds.size()));
        }
        return targetIds;
    }
}

