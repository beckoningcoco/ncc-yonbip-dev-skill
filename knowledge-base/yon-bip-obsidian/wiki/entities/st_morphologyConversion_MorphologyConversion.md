---
tags: [BIP, metadata, st, MorphologyConversion]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 形态转换单主表 (st.morphologyConversion.MorphologyConversion)

> Platform: BIP V5 | Module: st | Table: st_morphologyconversion | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 形态转换单主表 |
| uri | st.morphologyConversion.MorphologyConversion |
| tableName | st_morphologyconversion |
| domain | ustock |
| applicationCode | ST |
| superUri | voucher.base.Vouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (11)

| # | Name | URI |
|---|------|-----|
| 1 | 库存表头抽取 (IHeadInfo) | voucher.st.IHeadInfo |
| 2 | 审计信息 (IAuditInfo) | base.itf.IAuditInfo |
| 3 | 审批信息 (IApprovalInfo) | base.itf.IApprovalInfo |
| 4 | 商家相关 (IShop) | base.itf.IShop |
| 5 | 门店 (IRetailStore) | retail.voucher.IRetailStore |
| 6 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 7 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 8 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 9 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 10 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 11 | 奇门相关字段 (QiMen) | voucher.st.QiMen |

---

## All Fields (57)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 2 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 3 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 4 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 5 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short | Short |  |  | nullable |
| 6 | writeOffEnable | 启用冲销 | write_off_enable | short | Short |  |  | nullable |
| 7 | writeOffStatus | 冲销状态 | write_off_status | short | Short |  |  | nullable |
| 8 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 9 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 10 | writeOffReason | 冲销原因 | write_off_reason | quote | aa.reason.Reason |  |  | nullable |
| 11 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 12 | wmsInStatus | WMS转入状态 | wmsinstatus | short | Short |  |  | nullable |
| 13 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 14 | wmsBillno | WMS单号 | wmsbillno | text | String |  |  | nullable |
| 15 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 16 | morphologyConversionDefineCharacter | 自定义项特征属性组 | morphologyConversionDefineCharacter | UserDefine | st.morphologyConversion.MorphologyConversionDefineCharacter |  |  | nullable |
| 17 | srcBill | 来源上级单据 | csrcbillid | text | String |  |  | nullable |
| 18 | srcBillType | 来源上级单据类型 | csrcbilltype | - | st.morphologyConversion.SrcBillType |  |  | nullable |
| 19 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 20 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 21 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 22 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 23 | warehouse | 仓库id | warehouse | quote | aa.warehouse.Warehouse |  |  | nullable |
| 24 | org | 库存组织 | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isBusinessLog,isMasterOrg,nullable |
| 25 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 26 | srcBillNO | 来源单号 | csrcbillno | text | String |  |  | nullable |
| 27 | businesstypeId | 交易类型 | businesstype_id | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 28 | conversionType | 转换类型 | conversion_type | - | st.morphologyConversion.ConversionType |  |  | nullable |
| 29 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 30 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 31 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 32 | shop | 商家id | iShopID | long | Long |  | Y | nullable,reportHide |
| 33 | store | 门店 | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 34 | beforeWarehouse | 转换前仓库id | beforewarehouse | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 35 | afterWarehouse | 转换后仓库id | afterwarehouse | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 36 | department | 部门 | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,isBusinessLog,nullable |
| 37 | stockMgr | 库管员id | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isBusinessLog,nullable |
| 38 | operator | 业务员 | iOperatorId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,isBusinessLog,isSalesman,nullable |
| 39 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 40 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 41 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 42 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 43 | remark | 备注 | remark | text | String |  |  | nullable |
| 44 | creator | 制单人 | creator | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 45 | createDate | 制单日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 46 | createTime | 制单时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 47 | auditor | 审核人 | auditor | text | String |  |  | isGlobalization,nullable |
| 48 | auditDate | 审核日期 | audit_date | date | Date |  |  | nullable |
| 49 | auditTime | 审核时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 50 | modifier | 修改人 | modifier | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 51 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 52 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 53 | bill_defined_checkBatchno | 批次属性转换调整 | bill_defined_checkBatchno | switch | Boolean |  |  | nullable |
| 54 | defines | 形态转换单主表自由自定义项 | - | - | st.morphologyConversion.MorphologyConversionDefine |  |  |  |
| 55 | diffProductReturn | 异物料归还 | diffproductreturn | int | Integer |  |  | nullable |
| 56 | headItem | 形态转换单主表自定义项 | - | - | st.morphologyConversion.MorphologyConversionCustomItem |  |  |  |
| 57 | morphologyconversiondetail | 形态转换单明细表 | - | - | st.morphologyConversion.MorphologyConversionDetail |  |  |  |

---

## Reference Fields (16)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditorId | 审批人 | auditorId | base.user.User |
| 2 | creatorId | 创建人 | creatorId | base.user.User |
| 3 | modifierId | 修改人 | modifierId | base.user.User |
| 4 | writeOffReason | 冲销原因 | write_off_reason | aa.reason.Reason |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 6 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 7 | warehouse | 仓库id | warehouse | aa.warehouse.Warehouse |
| 8 | org | 库存组织 | iOrgid | aa.baseorg.InventoryOrgMV |
| 9 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 10 | businesstypeId | 交易类型 | businesstype_id | bd.bill.TransType |
| 11 | store | 门店 | iStoreID | aa.store.Store |
| 12 | beforeWarehouse | 转换前仓库id | beforewarehouse | aa.warehouse.Warehouse |
| 13 | afterWarehouse | 转换后仓库id | afterwarehouse | aa.warehouse.Warehouse |
| 14 | department | 部门 | department | aa.baseorg.DeptMV |
| 15 | stockMgr | 库管员id | stock_mgr | bd.staff.Staff |
| 16 | operator | 业务员 | iOperatorId | bd.staff.Staff |

---

## Number Fields (11)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short |
| 2 | writeOffEnable | 启用冲销 | write_off_enable | short |
| 3 | writeOffStatus | 冲销状态 | write_off_status | short |
| 4 | printCount | 打印次数 | printCount | int |
| 5 | wmsInStatus | WMS转入状态 | wmsinstatus | short |
| 6 | totalPieces | 整单件数 | total_pieces | number |
| 7 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 8 | status | 单据状态 | status | short |
| 9 | verifystate | 审批状态 | verifystate | short |
| 10 | returncount | 退回次数 | returncount | short |
| 11 | diffProductReturn | 异物料归还 | diffproductreturn | int |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | modifyDate | 修改日期 | modify_date | date |
| 2 | vouchdate | 单据日期 | vouchdate | date |
| 3 | createDate | 制单日期 | create_date | date |
| 4 | auditDate | 审核日期 | audit_date | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | headItem | 形态转换单主表自定义项 | st.morphologyConversion.MorphologyConversionCustomItem |
| 2 | morphologyconversiondetail | 形态转换单明细表 | st.morphologyConversion.MorphologyConversionDetail |
| 3 | defines | 形态转换单主表自由自定义项 | st.morphologyConversion.MorphologyConversionDefine |
