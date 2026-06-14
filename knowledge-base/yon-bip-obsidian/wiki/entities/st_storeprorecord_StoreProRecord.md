---
tags: [BIP, metadata, st, StoreProRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 产品入库主表 (st.storeprorecord.StoreProRecord)

> Platform: BIP V5 | Module: st | Table: st_storeprorecord | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 产品入库主表 |
| uri | st.storeprorecord.StoreProRecord |
| tableName | st_storeprorecord |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (20)

| # | Name | URI |
|---|------|-----|
| 1 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 2 | 事项交换 (IMatterInfoAble) | st.matterinfo.IMatterInfoAble |
| 3 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 4 | 商家相关 (IShop) | base.itf.IShop |
| 5 | 材料出和产品入公共头 (IMOHeadCommon) | st.materialout.IMOHeadCommon |
| 6 | 库存表头抽取 (IHeadInfo) | voucher.st.IHeadInfo |
| 7 | 库存接口_标识 (IInventorySign) | st.internaltransaction.IInventorySign |
| 8 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 9 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 10 | 过账信息 (IPostAccountInfo) | gscm.itf.IPostAccountInfo |
| 11 | 外部系统 (ExternalSystem) | st.externalsystem.ExternalSystem |
| 12 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 13 | 会计事务过账信息-存货 (FiEventAccInfo) | gscm.interf.FiEventAccInfo |
| 14 | 库存移动记录版本 (ICertificateVersion) | st.billstate.ICertificateVersion |
| 15 | 财务过账相关信息记录 (FiInfoRecord) | gscm.interf.FiInfoRecord |
| 16 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 17 | 外部来源线索 (IOutSysObjClue) | base.itf.IOutSysObjClue |
| 18 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 19 | 奇门相关字段 (QiMen) | voucher.st.QiMen |
| 20 | 奇门多次回传 (QiMenMultiplePostback) | voucher.st.QiMenMultiplePostback |

---

## All Fields (83)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | externalSystem | 外系统来源标识 | externalSystem | text | String |  |  | nullable |
| 2 | storeProRecordDefineCharacter | 自定义项特征属性组 | storeProRecordDefineCharacter | UserDefine | st.storeprorecord.StoreProRecordDefineCharacter |  |  | nullable |
| 3 | internalSign | 是否走内部交易的标识 | iInternalSign | switch | Boolean |  |  |  |
| 4 | postAccountStatus | 过账状态 | postAccountStatus | short | Short |  |  | nullable |
| 5 | postAccountVersion | 过账版本 | postAccountVersion | long | Long |  |  | nullable |
| 6 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 7 | noPostReasonMsg | 不过账原因信息 | noPostReasonMsg | text | String |  |  | nullable |
| 8 | isUpdateStock | 是否更新存量 | isUpdateStock | switch | Boolean |  |  | nullable |
| 9 | wmsBillno | WMS单号 | wmsbillno | text | String |  |  | nullable |
| 10 | wmsInStatus | WMS转入状态 | wmsinstatus | short | Short |  |  | nullable |
| 11 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short | Short |  |  | nullable |
| 12 | wmsUnique | wms回传唯一标识 | wmsUnique | text | String |  |  | nullable |
| 13 | impactStockTiming | 更新存量时机 | impact_stock_timing | int | Integer |  |  | nullable |
| 14 | alreadyUpdateStock | 已更新存量 | already_update_stock | int | Integer |  |  | nullable |
| 15 | impactFinancialTiming | 传财务时机 | impact_financial_timing | int | Integer |  |  | nullable |
| 16 | alreadyUpdateFinancial | 已传财务 | already_update_financial | int | Integer |  |  | nullable |
| 17 | writeOffEnable | 启用冲销 | write_off_enable | short | Short |  |  | nullable |
| 18 | writeOffStatus | 冲销状态 | write_off_status | short | Short |  |  | nullable |
| 19 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 20 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 21 | writeOffReason | 冲销原因 | write_off_reason | quote | aa.reason.Reason |  |  | nullable |
| 22 | fiEventDataId | 会计事务数据ID | fiEventDataId | text | String |  |  | nullable |
| 23 | fiEventId | 会计事务类型ID | fiEventId | text | String |  |  | nullable |
| 24 | fiEventCode | 会计事务类型编码 | fiEventCode | text | String |  |  | nullable |
| 25 | fiEventAccountingDate | 会计事务记账日期 | fiEventAccountingDate | text | String |  |  | nullable |
| 26 | certificateVersion | 库存移动记录版本 | certificate_version | long | Long |  |  | nullable |
| 27 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 28 | out_sys_id | 外部来源线索 | out_sys_id | text | String |  |  | nullable |
| 29 | out_sys_code | 外部来源编码 | out_sys_code | text | String |  |  | nullable |
| 30 | out_sys_version | 外部来源版本 | out_sys_version | text | String |  |  | nullable |
| 31 | out_sys_type | 外部来源类型 | out_sys_type | text | String |  |  | nullable |
| 32 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 33 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 34 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 35 | org | 库存组织 | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isBusinessLog,isMasterOrg,nullable |
| 36 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 37 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 38 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 39 | storeproBusType | 入库类型 | storeprorecord_type | text | String |  |  | nullable |
| 40 | store | 门店id | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 41 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 42 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 43 | voucherType | 单据类型(新架构) | voucherType | quote | bd.bill.BillTypeVO |  |  | nullable |
| 44 | warehouse | 仓库 | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 45 | factoryOrg | 完工组织ID | factory_org | quote | aa.baseorg.InventoryOrgMV |  |  | nullable,isFunShare |
| 46 | factoryFiOrg | 完工会计主体ID | factory_fi_Org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 47 | bustype | 交易类型 | iBusType | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 48 | shop | 商家 | iShopID | long | Long |  | Y | nullable,reportHide |
| 49 | department | 部门 | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,isBusinessLog,nullable |
| 50 | vouchtype | 单据类型 | vouch_type | - | st.storeprorecord.VouchType |  |  | nullable |
| 51 | isUpdateCost | 更新存货成本 | isUpdateCost | switch | Boolean |  |  | nullable |
| 52 | operator | 业务员 | iOperatorId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,isBusinessLog,isSalesman,nullable |
| 53 | stockMgr | 库管员ID | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isBusinessLog,nullable |
| 54 | memo | 备注 | cMemo | text | String |  |  | isBusinessLog,nullable |
| 55 | srcBillType | 来源类型 | csrcbilltype | text | String |  |  | bMakeBill,nullable |
| 56 | srcBill | 来源单据 | isrcbillid | text | String |  |  | nullable |
| 57 | srcBillNO | 来源单据号 | csrcbillno | text | String |  |  | nullable |
| 58 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 59 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 60 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 61 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 62 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 63 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 64 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 65 | totalMaterial | 已材料出 | ftotalMaterial | switch | Boolean |  |  | nullable |
| 66 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 67 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 68 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 69 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 70 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 71 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 72 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 73 | modifyDate | 最后修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 74 | auditor | 提交人 | auditor | text | String |  |  | isGlobalization,nullable |
| 75 | auditTime | 提交时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 76 | auditDate | 提交日期 | audit_date | date | Date |  |  | nullable |
| 77 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 78 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 79 | barcodeRecord | 扫描 | - | - | st.storeprorecord.BarcodeRecord |  |  |  |
| 80 | defines | 产品入库单主表自由自定义项 | - | - | st.storeprorecord.StoreProRecordDefine |  |  |  |
| 81 | headItem | 产品入库单主表自定义项 | - | - | st.storeprorecord.StoreProRecordCustomItem |  |  |  |
| 82 | headParallel | 产品入库单主表平行表 | - | - | st.storeprorecord.StoreProRecordParallel |  |  |  |
| 83 | storeProRecords | 产品入库子表 | - | - | st.storeprorecord.StoreProRecords |  |  |  |

---

## Reference Fields (18)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 2 | writeOffReason | 冲销原因 | write_off_reason | aa.reason.Reason |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 4 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 5 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 6 | org | 库存组织 | iOrgid | aa.baseorg.InventoryOrgMV |
| 7 | store | 门店id | iStoreID | aa.store.Store |
| 8 | voucherType | 单据类型(新架构) | voucherType | bd.bill.BillTypeVO |
| 9 | warehouse | 仓库 | iWarehouseId | aa.warehouse.Warehouse |
| 10 | factoryOrg | 完工组织ID | factory_org | aa.baseorg.InventoryOrgMV |
| 11 | factoryFiOrg | 完工会计主体ID | factory_fi_Org | aa.baseorg.FinanceOrgMV |
| 12 | bustype | 交易类型 | iBusType | bd.bill.TransType |
| 13 | department | 部门 | department | aa.baseorg.DeptMV |
| 14 | operator | 业务员 | iOperatorId | bd.staff.Staff |
| 15 | stockMgr | 库管员ID | stock_mgr | bd.staff.Staff |
| 16 | creatorId | 创建人 | creatorId | base.user.User |
| 17 | modifierId | 修改人 | modifierId | base.user.User |
| 18 | auditorId | 审批人 | auditorId | base.user.User |

---

## Number Fields (15)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | postAccountStatus | 过账状态 | postAccountStatus | short |
| 2 | wmsInStatus | WMS转入状态 | wmsinstatus | short |
| 3 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short |
| 4 | impactStockTiming | 更新存量时机 | impact_stock_timing | int |
| 5 | alreadyUpdateStock | 已更新存量 | already_update_stock | int |
| 6 | impactFinancialTiming | 传财务时机 | impact_financial_timing | int |
| 7 | alreadyUpdateFinancial | 已传财务 | already_update_financial | int |
| 8 | writeOffEnable | 启用冲销 | write_off_enable | short |
| 9 | writeOffStatus | 冲销状态 | write_off_status | short |
| 10 | verifystate | 审批状态 | verifystate | short |
| 11 | returncount | 退回次数 | returncount | short |
| 12 | status | 单据状态 | status | short |
| 13 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 14 | totalPieces | 整单件数 | total_pieces | number |
| 15 | printCount | 打印次数 | printCount | int |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | vouchdate | 单据日期 | vouchdate | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | modifyDate | 最后修改日期 | modify_date | date |
| 4 | auditDate | 提交日期 | audit_date | date |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | storeProRecords | 产品入库子表 | st.storeprorecord.StoreProRecords |
| 2 | headParallel | 产品入库单主表平行表 | st.storeprorecord.StoreProRecordParallel |
| 3 | barcodeRecord | 扫描 | st.storeprorecord.BarcodeRecord |
| 4 | headItem | 产品入库单主表自定义项 | st.storeprorecord.StoreProRecordCustomItem |
| 5 | defines | 产品入库单主表自由自定义项 | st.storeprorecord.StoreProRecordDefine |
