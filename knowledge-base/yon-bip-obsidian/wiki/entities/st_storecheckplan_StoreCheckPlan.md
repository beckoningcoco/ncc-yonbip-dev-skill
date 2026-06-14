---
tags: [BIP, metadata, st, StoreCheckPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点计划主表 (st.storecheckplan.StoreCheckPlan)

> Platform: BIP V5 | Module: st | Table: st_storecheckplan | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点计划主表 |
| uri | st.storecheckplan.StoreCheckPlan |
| tableName | st_storecheckplan |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.pubstorecheck.PubStoreCheck |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 2 | 商家相关 (IShop) | base.itf.IShop |
| 3 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 4 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 5 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (54)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | ownerscope | 货权归属范围 | ownerscope | short | Short |  |  | nullable |
| 2 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 3 | isGoodsPosition | 货位管理 | isGoodsPosition | switch | Boolean |  |  | nullable |
| 4 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 5 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 6 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 7 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 8 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 9 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 10 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 11 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 12 | shop | 商家 | iShopID | long | Long |  | Y | nullable,reportHide |
| 13 | storeCheckPlanDefineCharacter | 自定义项特征属性组 | storeCheckPlanDefineCharacter | UserDefine | st.storecheckplan.StoreCheckPlanDefineCharacter |  |  | nullable |
| 14 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 15 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 16 | vouchStatus | 单据状态 | status | - | st.storecheckplan.StoreCheckPlanStatus |  |  | nullable |
| 17 | stockOrg | 库存组织 | stock_org | quote | aa.baseorg.InventoryOrgMV |  |  | isMasterOrg,nullable |
| 18 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 19 | storeCheckRange | 盘点范围 | storecheckrange | - | st.pubstorecheck.PubStoreCheckPlanRange | Y |  |  |
| 20 | department | 部门 | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 21 | stockMgr | 库管员 | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,nullable |
| 22 | operator | 经办人 | ioperatorid | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isSalesman,nullable |
| 23 | code | 编码 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 24 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 25 | checkStartTime | 实盘开始时间 | checkStartTime | timestamp | Timestamp |  |  | nullable |
| 26 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 27 | store | 门店 | istoreid | quote | aa.store.Store |  | Y | nullable |
| 28 | warehouse | 仓库 | iwarehouseid | quote | aa.warehouse.Warehouse | Y |  | dataPowerFlag,data_auth,REF.PROPERTY |
| 29 | isFastStoreCheck | 是否快盘 | bIsFastStoreCheck | switch | Boolean |  |  | nullable |
| 30 | goodsPositionRange | 货位范围 | goodspositionrange | - | st.pubstorecheck.PubStoreCheckGoodsPositionRange |  |  | nullable |
| 31 | barCode | 条形码 | bar_code | text | String |  |  | nullable |
| 32 | memo | 备注 | cmemo | text | String |  |  | isBusinessLog,nullable |
| 33 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 34 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 35 | total_quantity | 整单数量 | total_quantity | number | Decimal |  |  | nullable |
| 36 | total_number | 整单件数 | total_number | number | Decimal |  |  | nullable |
| 37 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 38 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 39 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 40 | storeCheckInputMode | 盘点数据输入方式 | storecheckinputmode | - | st.pubstorecheck.PubStoreCheckInputMode |  |  | nullable |
| 41 | businesstype | 业务类型 | ibusinesstype | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 42 | creator | 创建人名称 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 43 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 44 | modifier | 修改人名称 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 45 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 46 | auditor | 审批人名称 | auditor | text | String |  |  | isGlobalization,nullable |
| 47 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 48 | defines | 盘点计划主表自由自定义项 | - | - | st.storecheckplan.StoreCheckPlanDefine |  |  |  |
| 49 | details | 盘点计划子表 | - | - | st.storecheckplan.StoreCheckPlanDetail |  |  |  |
| 50 | goodsPosition | 盘点货位 | - | - | st.storecheckplan.GoodsPosition |  |  |  |
| 51 | productClass | 盘点品类 | - | - | st.storecheckplan.ProductClass |  |  |  |
| 52 | resultdetails | 盘点结果子表 | - | - | st.storecheckplan.StoreCheckResultDetail |  |  |  |
| 53 | shareMo | 分摊生产订单 | - | - | st.storecheckplan.ShareMo |  |  |  |
| 54 | storeCheckPlanCustomItem | 盘点计划主表自定义项 | - | - | st.storecheckplan.StoreCheckPlanCustomItem |  |  |  |

---

## Reference Fields (14)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 2 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 3 | auditorId | 审批人 | auditorId | base.user.User |
| 4 | creatorId | 创建人 | creatorId | base.user.User |
| 5 | modifierId | 修改人 | modifierId | base.user.User |
| 6 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 7 | stockOrg | 库存组织 | stock_org | aa.baseorg.InventoryOrgMV |
| 8 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 9 | department | 部门 | department | aa.baseorg.DeptMV |
| 10 | stockMgr | 库管员 | stock_mgr | bd.staff.Staff |
| 11 | operator | 经办人 | ioperatorid | bd.staff.Staff |
| 12 | store | 门店 | istoreid | aa.store.Store |
| 13 | warehouse | 仓库 | iwarehouseid | aa.warehouse.Warehouse |
| 14 | businesstype | 业务类型 | ibusinesstype | bd.bill.TransType |

---

## Number Fields (6)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | ownerscope | 货权归属范围 | ownerscope | short |
| 2 | status | 单据状态 | status | short |
| 3 | total_quantity | 整单数量 | total_quantity | number |
| 4 | total_number | 整单件数 | total_number | number |
| 5 | verifystate | 审批状态 | verifystate | short |
| 6 | returncount | 退回次数 | returncount | short |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | auditDate | 审批日期 | audit_date | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | modifyDate | 修改日期 | modify_date | date |
| 4 | vouchdate | 单据日期 | vouchdate | date |

---

## Child Tables (7)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | shareMo | 分摊生产订单 | st.storecheckplan.ShareMo |
| 2 | productClass | 盘点品类 | st.storecheckplan.ProductClass |
| 3 | resultdetails | 盘点结果子表 | st.storecheckplan.StoreCheckResultDetail |
| 4 | details | 盘点计划子表 | st.storecheckplan.StoreCheckPlanDetail |
| 5 | storeCheckPlanCustomItem | 盘点计划主表自定义项 | st.storecheckplan.StoreCheckPlanCustomItem |
| 6 | goodsPosition | 盘点货位 | st.storecheckplan.GoodsPosition |
| 7 | defines | 盘点计划主表自由自定义项 | st.storecheckplan.StoreCheckPlanDefine |
