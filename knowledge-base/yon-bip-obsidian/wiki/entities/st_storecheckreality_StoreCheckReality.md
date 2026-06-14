---
tags: [BIP, metadata, st, StoreCheckReality]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 实盘主表 (st.storecheckreality.StoreCheckReality)

> Platform: BIP V5 | Module: st | Table: st_storecheckreality | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 实盘主表 |
| uri | st.storecheckreality.StoreCheckReality |
| tableName | st_storecheckreality |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.pubstorecheck.PubStoreCheck |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (7)

| # | Name | URI |
|---|------|-----|
| 1 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 2 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 3 | 商家相关 (IShop) | base.itf.IShop |
| 4 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 5 | 外部系统 (ExternalSystem) | st.externalsystem.ExternalSystem |
| 6 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 7 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (55)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 2 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 3 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 4 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 5 | isGoodsPosition | 货位管理 | isGoodsPosition | switch | Boolean |  |  | nullable |
| 6 | ownerscope | 货权归属范围 | ownerscope | short | Short |  |  | nullable |
| 7 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 8 | externalSystem | 外系统来源标识 | externalSystem | text | String |  |  | nullable |
| 9 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 10 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 11 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 12 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 13 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 14 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 15 | storeCheckRealityDefineCharacter | 自定义项特征属性组 | storeCheckRealityDefineCharacter | UserDefine | st.storecheckreality.StoreCheckRealityDefineCharacter |  |  | nullable |
| 16 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 17 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 18 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 19 | stockOrg | 库存组织 | stock_org | quote | aa.baseorg.InventoryOrgMV |  |  | isMasterOrg,nullable |
| 20 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 21 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 22 | vouchdate | 实盘时间 | vouchdate | timestamp | Timestamp | Y |  | isBusinessLog,nullable |
| 23 | checkStartTime | 盘点开始时间 | checkStartTime | timestamp | Timestamp |  |  | nullable |
| 24 | status | 单据状态 | status | - | st.storecheckreality.StoreCheckRealityStatus |  |  | isBusinessLog,nullable |
| 25 | storeCheckInputMode | 盘点数据输入方式 | storecheckinputmode | - | st.pubstorecheck.PubStoreCheckInputMode |  |  | nullable |
| 26 | businesstype | 交易类型 | ibusinesstype | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 27 | shop | 商家id | iShopID | long | Long |  | Y | nullable,reportHide |
| 28 | store | 门店ID | istoreid | quote | aa.store.Store |  | Y | nullable |
| 29 | warehouse | 仓库 | iwarehouseid | quote | aa.warehouse.Warehouse | Y |  | dataPowerFlag,data_auth,REF.PROPERTY |
| 30 | storecheckplan | 实盘计划ID | storecheckplan | quote | st.storecheckplan.StoreCheckPlan |  |  | nullable |
| 31 | storeCheckRange | 实盘范围 | storecheckrange | - | st.pubstorecheck.PubStoreCheckPlanRange | Y |  |  |
| 32 | department | 部门 | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 33 | stockMgr | 库管员ID | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,nullable |
| 34 | operator | 业务员 | ioperatorid | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isSalesman,nullable |
| 35 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 36 | isMaterial | 是否材料盘点 | bIsMaterial | switch | Boolean |  |  | nullable |
| 37 | isFastStoreCheck | 是否快盘 | bIsFastStoreCheck | switch | Boolean |  |  | nullable |
| 38 | goodsPositionRange | 货位范围 | goodspositionrange | - | st.pubstorecheck.PubStoreCheckGoodsPositionRange |  |  | nullable |
| 39 | total_number | 整单件数 | total_number | number | Decimal |  |  | nullable |
| 40 | total_quantity | 整单数量 | total_quantity | number | Decimal |  |  | nullable |
| 41 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 42 | memo | 备注 | cmemo | text | String |  |  | isBusinessLog,nullable |
| 43 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 44 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 45 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 46 | auditor | 审批人 | auditor | text | String |  |  | isGlobalization,nullable |
| 47 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 48 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 49 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 50 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | nullable |
| 51 | defines | 实盘单主表自由自定义项 | - | - | st.storecheckreality.StoreCheckRealityDefine |  |  |  |
| 52 | details | 实盘子表 | - | - | st.storecheckreality.StoreCheckRealityDetail |  |  |  |
| 53 | realityGoodsPosition | 盘点货位 | - | - | st.storecheckreality.RealityGoodsPosition |  |  |  |
| 54 | realityProductClass | 实盘品类 | - | - | st.storecheckreality.RealityProductClass |  |  |  |
| 55 | storeCheckRealityCustomItem | 实盘主表自定义项 | - | - | st.storecheckreality.StoreCheckRealityCustomItem |  |  |  |

---

## Reference Fields (15)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditorId | 审批人 | auditorId | base.user.User |
| 2 | creatorId | 创建人 | creatorId | base.user.User |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 4 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 5 | modifierId | 修改人 | modifierId | base.user.User |
| 6 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 7 | stockOrg | 库存组织 | stock_org | aa.baseorg.InventoryOrgMV |
| 8 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 9 | businesstype | 交易类型 | ibusinesstype | bd.bill.TransType |
| 10 | store | 门店ID | istoreid | aa.store.Store |
| 11 | warehouse | 仓库 | iwarehouseid | aa.warehouse.Warehouse |
| 12 | storecheckplan | 实盘计划ID | storecheckplan | st.storecheckplan.StoreCheckPlan |
| 13 | department | 部门 | department | aa.baseorg.DeptMV |
| 14 | stockMgr | 库管员ID | stock_mgr | bd.staff.Staff |
| 15 | operator | 业务员 | ioperatorid | bd.staff.Staff |

---

## Number Fields (6)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | ownerscope | 货权归属范围 | ownerscope | short |
| 2 | returncount | 退回次数 | returncount | short |
| 3 | verifystate | 审批状态 | verifystate | short |
| 4 | total_number | 整单件数 | total_number | number |
| 5 | total_quantity | 整单数量 | total_quantity | number |
| 6 | totalQuantity | 整单数量 | fTotalQuantity | number |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | auditDate | 审批日期 | audit_date | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | modifyDate | 修改日期 | modify_date | date |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | storeCheckRealityCustomItem | 实盘主表自定义项 | st.storecheckreality.StoreCheckRealityCustomItem |
| 2 | details | 实盘子表 | st.storecheckreality.StoreCheckRealityDetail |
| 3 | realityGoodsPosition | 盘点货位 | st.storecheckreality.RealityGoodsPosition |
| 4 | realityProductClass | 实盘品类 | st.storecheckreality.RealityProductClass |
| 5 | defines | 实盘单主表自由自定义项 | st.storecheckreality.StoreCheckRealityDefine |
