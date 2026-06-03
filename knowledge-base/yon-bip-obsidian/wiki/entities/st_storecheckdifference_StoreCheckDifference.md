---
tags: [BIP, metadata, st, StoreCheckDifference]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点差异单主表 (st.storecheckdifference.StoreCheckDifference)

> Platform: BIP V5 | Module: st | Table: st_storecheckdifference | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点差异单主表 |
| uri | st.storecheckdifference.StoreCheckDifference |
| tableName | st_storecheckdifference |
| domain | ustock |
| applicationCode | ST |
| superUri | st.pubstorecheckdifference.PubStoreCheckDifference |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 2 | 商家相关 (IShop) | base.itf.IShop |
| 3 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (49)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 2 | checkStartTime | 实盘开始时间 | checkStartTime | timestamp | Timestamp |  |  | nullable |
| 3 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 4 | goodsPositionRange | 货位范围 | goodspositionrange | - | st.pubstorecheckdifference.PubStoreCheckDifferenceGoodsPositionRange |  |  | nullable |
| 5 | outBizCode | 外部业务编码 | outBizCode | text | String |  |  | nullable |
| 6 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 7 | isFastStoreCheck | 是否快盘 | bIsFastStoreCheck | switch | Boolean |  |  | nullable |
| 8 | isGoodsPosition | 货位管理 | isGoodsPosition | switch | Boolean |  |  | nullable |
| 9 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 10 | shop | 商家 | iShopID | long | Long |  | Y | nullable,reportHide |
| 11 | storeCheckDifferenceDefineCharacter | 自定义项特征属性组 | storeCheckDifferenceDefineCharacter | UserDefine | st.storecheckdifference.StoreCheckDifferenceDefineCharacter |  |  | nullable |
| 12 | storeCheckInputMode | 盘点数据输入方式 | storecheckinputmode | - | st.pubstorecheckdifference.PubStoreCheckDifferenceInputMode |  |  | nullable |
| 13 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 14 | total_number | 整单件数 | total_number | number | Decimal |  |  | nullable |
| 15 | total_quantity | 整单数量 | total_quantity | number | Decimal |  |  | nullable |
| 16 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 17 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 18 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 19 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 20 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 21 | status | 单据状态 | status | - | st.storecheckdifference.StoreCheckDifferenceStatus |  |  | isBusinessLog,nullable |
| 22 | stockOrg | 库存组织 | stock_org | quote | aa.baseorg.InventoryOrgMV |  |  | isMasterOrg,nullable |
| 23 | store | 门店ID | iStoreID | quote | aa.store.Store |  | Y | nullable |
| 24 | warehouse | 仓库ID | iwarehouseid | quote | aa.warehouse.Warehouse | Y |  | dataPowerFlag,data_auth,nullable |
| 25 | businesstype | 业务类型 | ibusinesstype | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 26 | operator | 业务员ID | ioperatorid | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,isSalesman,nullable |
| 27 | stockMgr | 库管员ID | stock_mgr | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 28 | department | 部门ID | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 29 | memo | 备注 | cmemo | text | String |  |  | isBusinessLog,nullable |
| 30 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 31 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 32 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 33 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 34 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 35 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 36 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 37 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 38 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 39 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 40 | auditor | 审批人 | auditor | text | String |  |  | isGlobalization,nullable |
| 41 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 42 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 43 | storecheckplan | 盘点计划ID | storecheckplan | quote | st.storecheckplan.StoreCheckPlan |  |  | nullable |
| 44 | wmsBillno | WMS单号 | wmsbillno | text | String |  |  | nullable |
| 45 | defines | 盘点差异主表自由自定义项 | - | - | st.storecheckdifference.StoreCheckDifferenceDefine |  |  |  |
| 46 | details | 盘点差异单子表 | - | - | st.storecheckdifference.StoreCheckDifferenceDetail |  |  |  |
| 47 | goodsPosition | 盘点货位 | - | - | st.storecheckdifference.GoodsPositionDifference |  |  |  |
| 48 | productClass | 盘点品类 | - | - | st.storecheckdifference.ProductClassDifference |  |  |  |
| 49 | storeCheckDifferenceCustomItem | 盘点差异单主表自定义项 | - | - | st.storecheckdifference.StoreCheckDifferenceCustomItem |  |  |  |

---

## Reference Fields (14)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditorId | 审批人 | auditorId | base.user.User |
| 2 | creatorId | 创建人 | creatorId | base.user.User |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 4 | modifierId | 修改人 | modifierId | base.user.User |
| 5 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 6 | stockOrg | 库存组织 | stock_org | aa.baseorg.InventoryOrgMV |
| 7 | store | 门店ID | iStoreID | aa.store.Store |
| 8 | warehouse | 仓库ID | iwarehouseid | aa.warehouse.Warehouse |
| 9 | businesstype | 业务类型 | ibusinesstype | bd.bill.TransType |
| 10 | operator | 业务员ID | ioperatorid | bd.staff.Staff |
| 11 | stockMgr | 库管员ID | stock_mgr | bd.staff.Staff |
| 12 | department | 部门ID | department | aa.baseorg.DeptMV |
| 13 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 14 | storecheckplan | 盘点计划ID | storecheckplan | st.storecheckplan.StoreCheckPlan |

---

## Number Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | total_number | 整单件数 | total_number | number |
| 2 | total_quantity | 整单数量 | total_quantity | number |
| 3 | verifystate | 审批状态 | verifystate | short |
| 4 | returncount | 退回次数 | returncount | short |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | vouchdate | 单据日期 | vouchdate | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | modifyDate | 修改日期 | modify_date | date |
| 4 | auditDate | 审批日期 | audit_date | date |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | productClass | 盘点品类 | st.storecheckdifference.ProductClassDifference |
| 2 | storeCheckDifferenceCustomItem | 盘点差异单主表自定义项 | st.storecheckdifference.StoreCheckDifferenceCustomItem |
| 3 | details | 盘点差异单子表 | st.storecheckdifference.StoreCheckDifferenceDetail |
| 4 | goodsPosition | 盘点货位 | st.storecheckdifference.GoodsPositionDifference |
| 5 | defines | 盘点差异主表自由自定义项 | st.storecheckdifference.StoreCheckDifferenceDefine |
