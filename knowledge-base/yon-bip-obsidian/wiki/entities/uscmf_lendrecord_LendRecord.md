---
tags: [BIP, metadata, uscmf, LendRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 借用未还单主表 (uscmf.lendrecord.LendRecord)

> Platform: BIP V5 | Module: uscmf | Table: uscmf_lendrecord | Schema: uscmf

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 借用未还单主表 |
| uri | uscmf.lendrecord.LendRecord |
| tableName | uscmf_lendrecord |
| domain | uscmf |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (9)

| # | Name | URI |
|---|------|-----|
| 1 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 2 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 3 | 商家相关 (IShop) | base.itf.IShop |
| 4 | 表头整单合计信息 (IHeadTotalData) | retail.voucher.IHeadTotalData |
| 5 | 奇门相关字段 (QiMen) | voucher.st.QiMen |
| 6 | 租户相关 (ITenant) | base.itf.ITenant |
| 7 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 8 | 库存表头抽取 (IHeadInfo) | voucher.st.IHeadInfo |
| 9 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |

---

## All Fields (56)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | borrowName | 借用对象名称 | borrowName | text | String |  |  | nullable |
| 2 | borrowStaff | 借用对象-人员 | borrowStaff | quote | bd.staff.Staff |  |  | nullable |
| 3 | lendRecordCharacter | 自定义项特征属性组 | lendRecordCharacter | UserDefine | uscmf.lendrecord.LendRecordCharacter |  |  | nullable |
| 4 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 5 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 6 | writeOffStatus | 冲销状态 | write_off_status | int | Integer |  |  | nullable |
| 7 | returnDifferenceStatus | 差异归还状态 | return_difference_status | short | Short |  |  | nullable |
| 8 | serviceNo | 服务单号 | service_no | text | String |  |  | nullable |
| 9 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 10 | store | 门店id | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 11 | warehouse | 仓库id | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 12 | bustype | 业务类型id | iBusType | quote | bd.bill.TransType |  |  | nullable |
| 13 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 14 | operator | 经办人id | iOperatorId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,isBusinessLog,isSalesman,nullable |
| 15 | memo | 备注 | cMemo | text | String |  |  | isBusinessLog,nullable |
| 16 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 17 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 18 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 19 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 20 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 21 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 22 | auditor | 提交人 | auditor | text | String |  |  | isGlobalization,nullable |
| 23 | auditTime | 提交时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 24 | auditDate | 提交日期 | audit_date | date | Date |  |  | nullable |
| 25 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 26 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 27 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 28 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 29 | borrowCusType | 借用对象类型 | borrowCusType | - | uscmf.lendrecord.UscmfBorrowCusType |  |  | nullable |
| 30 | borrowCustomer | 借用对象 | borrowCustomer | quote | aa.merchant.Merchant |  |  | nullable |
| 31 | borrowDept | 借用部门 | borrowDept | quote | aa.baseorg.DeptMV |  |  | nullable |
| 32 | department | 部门 | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,isBusinessLog,nullable |
| 33 | org | 库存组织 | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isBusinessLog,isMasterOrg,nullable |
| 34 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 35 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 36 | lendDirection | 借用方向 | lendDirection | - | uscmf.lendrecord.UscmfLendDirection |  |  | nullable |
| 37 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 38 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short | Short |  |  | nullable |
| 39 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 40 | stockMgr | 库管员 | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isBusinessLog,nullable |
| 41 | srcBillType | 来源单据类型 | cSrcBillType | text | String |  |  | nullable |
| 42 | srcType | 来源类型id | srcType | int | Integer |  |  | nullable |
| 43 | barCode | 条形码 | bar_code | text | String |  |  | nullable |
| 44 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 45 | isUpdateCost | 更新存货成本 | isUpdateCost | switch | Boolean |  |  | nullable |
| 46 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 47 | shop | 商家 | iShopID | long | Long |  | Y | nullable,reportHide |
| 48 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 49 | wmsInStatus | WMS转入状态 | wmsinstatus | short | Short |  |  | nullable |
| 50 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 51 | wmsBillno | WMS单号 | wmsbillno | text | String |  |  | nullable |
| 52 | borrowUser | 借用对象-用户 | borrowUser | quote | aa.baseorg.DeptMV |  |  | nullable |
| 53 | borrowSupplier | 借用对象-供应商 | borrowSupplier | quote | aa.vendor.Vendor |  |  | nullable |
| 54 | defines | 借用未还单主表自由自定义项 | - | - | uscmf.lendrecord.LendRecordDefine |  |  |  |
| 55 | headItem | 借用未还单主表自定义项 | - | - | uscmf.lendrecord.LendRecordCustomItem |  |  |  |
| 56 | lendRecords | 借用未还单子表 | - | - | uscmf.lendrecord.LendRecords |  |  |  |

---

## Reference Fields (19)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | borrowStaff | 借用对象-人员 | borrowStaff | bd.staff.Staff |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 3 | store | 门店id | iStoreID | aa.store.Store |
| 4 | warehouse | 仓库id | iWarehouseId | aa.warehouse.Warehouse |
| 5 | bustype | 业务类型id | iBusType | bd.bill.TransType |
| 6 | operator | 经办人id | iOperatorId | bd.staff.Staff |
| 7 | borrowCustomer | 借用对象 | borrowCustomer | aa.merchant.Merchant |
| 8 | borrowDept | 借用部门 | borrowDept | aa.baseorg.DeptMV |
| 9 | department | 部门 | department | aa.baseorg.DeptMV |
| 10 | org | 库存组织 | iOrgid | aa.baseorg.InventoryOrgMV |
| 11 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 12 | modifierId | 修改人 | modifierId | base.user.User |
| 13 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 14 | stockMgr | 库管员 | stock_mgr | bd.staff.Staff |
| 15 | auditorId | 审批人 | auditorId | base.user.User |
| 16 | creatorId | 创建人 | creatorId | base.user.User |
| 17 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 18 | borrowUser | 借用对象-用户 | borrowUser | aa.baseorg.DeptMV |
| 19 | borrowSupplier | 借用对象-供应商 | borrowSupplier | aa.vendor.Vendor |

---

## Number Fields (8)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | writeOffStatus | 冲销状态 | write_off_status | int |
| 2 | returnDifferenceStatus | 差异归还状态 | return_difference_status | short |
| 3 | status | 单据状态 | status | short |
| 4 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 5 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short |
| 6 | srcType | 来源类型id | srcType | int |
| 7 | totalPieces | 整单件数 | total_pieces | number |
| 8 | wmsInStatus | WMS转入状态 | wmsinstatus | short |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | vouchdate | 单据日期 | vouchdate | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | modifyDate | 修改日期 | modify_date | date |
| 4 | auditDate | 提交日期 | audit_date | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | lendRecords | 借用未还单子表 | uscmf.lendrecord.LendRecords |
| 2 | headItem | 借用未还单主表自定义项 | uscmf.lendrecord.LendRecordCustomItem |
| 3 | defines | 借用未还单主表自由自定义项 | uscmf.lendrecord.LendRecordDefine |
