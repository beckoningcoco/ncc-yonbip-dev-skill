---
tags: [BIP, metadata, st, MaterialOut]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 材料出库单主表 (st.materialout.MaterialOut)

> Platform: BIP V5 | Module: st | Table: st_materialout | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 材料出库单主表 |
| uri | st.materialout.MaterialOut |
| tableName | st_materialout |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |
| description | 材料出库单主表 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (21)

| # | Name | URI |
|---|------|-----|
| 1 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 2 | 事项交换 (IMatterInfoAble) | st.matterinfo.IMatterInfoAble |
| 3 | 库存表头抽取 (IHeadInfo) | voucher.st.IHeadInfo |
| 4 | 商家相关 (IShop) | base.itf.IShop |
| 5 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 6 | 材料出和产品入公共头 (IMOHeadCommon) | st.materialout.IMOHeadCommon |
| 7 | 库存接口_标识 (IInventorySign) | st.internaltransaction.IInventorySign |
| 8 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 9 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 10 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 11 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 12 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 13 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 14 | 过账信息 (IPostAccountInfo) | gscm.itf.IPostAccountInfo |
| 15 | 外部系统 (ExternalSystem) | st.externalsystem.ExternalSystem |
| 16 | 会计事务过账信息-存货 (FiEventAccInfo) | gscm.interf.FiEventAccInfo |
| 17 | 奇门相关字段 (QiMen) | voucher.st.QiMen |
| 18 | 库存移动记录版本 (ICertificateVersion) | st.billstate.ICertificateVersion |
| 19 | 财务过账相关信息记录 (FiInfoRecord) | gscm.interf.FiInfoRecord |
| 20 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 21 | 外部来源线索 (IOutSysObjClue) | base.itf.IOutSysObjClue |

---

## All Fields (92)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | certificateVersion | 库存移动记录版本 | certificate_version | long | Long |  |  | nullable |
| 2 | fiEventAccountingDate | 会计事务记账日期 | fiEventAccountingDate | text | String |  |  | nullable |
| 3 | fiEventCode | 会计事务类型编码 | fiEventCode | text | String |  |  | nullable |
| 4 | fiEventDataId | 会计事务数据ID | fiEventDataId | text | String |  |  | nullable |
| 5 | fiEventId | 会计事务类型ID | fiEventId | text | String |  |  | nullable |
| 6 | isBeginning | 期初标识 | isBeginning | switch | Boolean |  |  | nullable |
| 7 | costAccountingMethod | 委外成本核算方式 | cost_accounting_method | int | Integer |  |  | nullable |
| 8 | impactStockTiming | 更新存量时机 | impact_stock_timing | int | Integer |  |  | nullable |
| 9 | purpose | 用途 | purpose | text | String |  |  | nullable |
| 10 | bustypeIsUpdateStock | 交易类型是否更新存量 | bustypeIsUpdateStock | switch | Boolean |  |  | nullable |
| 11 | alreadyUpdateStock | 已更新存量 | already_update_stock | int | Integer |  |  | nullable |
| 12 | impactFinancialTiming | 传财务时机 | impact_financial_timing | int | Integer |  |  | nullable |
| 13 | alreadyUpdateFinancial | 已传财务 | already_update_financial | int | Integer |  |  | nullable |
| 14 | writeOffEnable | 启用冲销 | write_off_enable | short | Short |  |  | nullable |
| 15 | writeOffStatus | 冲销状态 | write_off_status | short | Short |  |  | nullable |
| 16 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 17 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 18 | writeOffReason | 冲销原因 | write_off_reason | quote | aa.reason.Reason |  |  | nullable |
| 19 | tcOrgAccount | 跨组织委外结算 | tc_org_account | short | Short |  |  | nullable |
| 20 | collaborationType | 材料协同方式 | collaboration_type | short | Short |  |  | nullable |
| 21 | noPostReasonMsg | 不过账原因信息 | noPostReasonMsg | text | String |  |  | nullable |
| 22 | out_sys_id | 外部来源线索 | out_sys_id | text | String |  |  | nullable |
| 23 | out_sys_code | 外部来源编码 | out_sys_code | text | String |  |  | nullable |
| 24 | out_sys_version | 外部来源版本 | out_sys_version | text | String |  |  | nullable |
| 25 | out_sys_type | 外部来源类型 | out_sys_type | text | String |  |  | nullable |
| 26 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 27 | externalSystem | 外系统来源标识 | externalSystem | text | String |  |  | nullable |
| 28 | materialOutDefineCharacter | 自定义项特征属性组 | materialOutDefineCharacter | UserDefine | st.materialout.MaterialOutDefineCharacter |  |  | nullable |
| 29 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 30 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 31 | internalSign | 是否走内部交易的标识 | iInternalSign | switch | Boolean |  |  |  |
| 32 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 33 | postAccountStatus | 过账状态 | postAccountStatus | short | Short |  |  | nullable |
| 34 | postAccountVersion | 过账版本 | postAccountVersion | long | Long |  |  | nullable |
| 35 | stockDirection | 库存方向 | istockdirection | text | String |  |  | isRedundant,nullable |
| 36 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 37 | org | 库存组织 | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isBusinessLog,isMasterOrg,nullable |
| 38 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 39 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 40 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 41 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 42 | shop | 商家id | iShopID | long | Long |  | Y | nullable,reportHide |
| 43 | store | 门店id | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 44 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 45 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 46 | factoryOrg | 领用组织ID | factory_org | quote | org.func.BaseOrg |  |  | isFunShare,nullable |
| 47 | warehouse | 仓库 | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 48 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 49 | osmInRecordsId | 委外入库行id | iOsmInRecordsId | quote | st.osminrecord.OsmInRecords |  |  | nullable |
| 50 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 51 | vendor | 委外供应商id | iVendorId | quote | aa.vendor.Vendor |  |  | dataPowerFlag,data_auth,nullable |
| 52 | isBackflush | 是否倒冲生成 | is_backflush | switch | Boolean |  |  | nullable |
| 53 | isOsm | 是否委外材料 | iisOsm | switch | Boolean |  |  | nullable |
| 54 | bustype | 交易类型 | iBusType | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 55 | vouchtype | 单据类型 | vouch_type | - | st.materialout.VouchType |  |  | nullable |
| 56 | factoryFiOrg | 领用会计主体ID | factory_fi_Org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 57 | department | 部门 | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,isBusinessLog,nullable |
| 58 | operator | 业务员 | iOperatorId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,isBusinessLog,isSalesman,nullable |
| 59 | stockMgr | 库管员ID | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isBusinessLog,nullable |
| 60 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 61 | memo | 备注 | cMemo | text | String |  |  | isBusinessLog,nullable |
| 62 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 63 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 64 | srcBill | 来源单据 | isrcbillid | text | String |  |  | nullable |
| 65 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 66 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 67 | srcBillNO | 来源单据号 | csrcbillno | text | String |  |  | nullable |
| 68 | srcBillType | 来源上级单据类型 | csrcbilltype | text | String |  |  | bMakeBill,nullable |
| 69 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 70 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 71 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 72 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 73 | voucherType | 单据类型(新架构) | voucherType | quote | bd.bill.BillTypeVO |  |  | nullable |
| 74 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 75 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 76 | auditor | 审批人 | auditor | text | String |  |  | isGlobalization,nullable |
| 77 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 78 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 79 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 80 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 81 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 82 | isUpdateCost | 更新存货成本 | isUpdateCost | switch | Boolean |  |  | nullable |
| 83 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 84 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 85 | materialBusType | 出库类型 | material_bus_type | text | String |  |  | nullable |
| 86 | wmsBillno | WMS单号 | wmsbillno | text | String |  |  | nullable |
| 87 | wmsInStatus | WMS转入状态 | wmsinstatus | short | Short |  |  | nullable |
| 88 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short | Short |  |  | nullable |
| 89 | barcodeRecord | 扫描 | - | - | st.materialout.BarcodeRecord |  |  |  |
| 90 | defines | 材料出库单主表自由自定义项 | - | - | st.materialout.MaterialOutDefine |  |  |  |
| 91 | headItem | 材料出库单主表自定义项 | - | - | st.materialout.MaterialOutCustomItem |  |  |  |
| 92 | materOuts | 材料出库单子表 | - | - | st.materialout.MaterialOuts |  |  |  |

---

## Reference Fields (21)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | writeOffReason | 冲销原因 | write_off_reason | aa.reason.Reason |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 3 | auditorId | 审批人 | auditorId | base.user.User |
| 4 | creatorId | 创建人 | creatorId | base.user.User |
| 5 | modifierId | 修改人 | modifierId | base.user.User |
| 6 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 7 | org | 库存组织 | iOrgid | aa.baseorg.InventoryOrgMV |
| 8 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 9 | store | 门店id | iStoreID | aa.store.Store |
| 10 | factoryOrg | 领用组织ID | factory_org | org.func.BaseOrg |
| 11 | warehouse | 仓库 | iWarehouseId | aa.warehouse.Warehouse |
| 12 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |
| 13 | osmInRecordsId | 委外入库行id | iOsmInRecordsId | st.osminrecord.OsmInRecords |
| 14 | vendor | 委外供应商id | iVendorId | aa.vendor.Vendor |
| 15 | bustype | 交易类型 | iBusType | bd.bill.TransType |
| 16 | factoryFiOrg | 领用会计主体ID | factory_fi_Org | aa.baseorg.FinanceOrgMV |
| 17 | department | 部门 | department | aa.baseorg.DeptMV |
| 18 | operator | 业务员 | iOperatorId | bd.staff.Staff |
| 19 | stockMgr | 库管员ID | stock_mgr | bd.staff.Staff |
| 20 | voucherType | 单据类型(新架构) | voucherType | bd.bill.BillTypeVO |
| 21 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |

---

## Number Fields (19)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | costAccountingMethod | 委外成本核算方式 | cost_accounting_method | int |
| 2 | impactStockTiming | 更新存量时机 | impact_stock_timing | int |
| 3 | alreadyUpdateStock | 已更新存量 | already_update_stock | int |
| 4 | impactFinancialTiming | 传财务时机 | impact_financial_timing | int |
| 5 | alreadyUpdateFinancial | 已传财务 | already_update_financial | int |
| 6 | writeOffEnable | 启用冲销 | write_off_enable | short |
| 7 | writeOffStatus | 冲销状态 | write_off_status | short |
| 8 | tcOrgAccount | 跨组织委外结算 | tc_org_account | short |
| 9 | collaborationType | 材料协同方式 | collaboration_type | short |
| 10 | postAccountStatus | 过账状态 | postAccountStatus | short |
| 11 | verifystate | 审批状态 | verifystate | short |
| 12 | returncount | 退回次数 | returncount | short |
| 13 | ownertype | 货权归属 | ownertype | int |
| 14 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 15 | totalPieces | 整单件数 | total_pieces | number |
| 16 | status | 单据状态 | status | short |
| 17 | printCount | 打印次数 | printCount | int |
| 18 | wmsInStatus | WMS转入状态 | wmsinstatus | short |
| 19 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | vouchdate | 单据日期 | vouchdate | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | modifyDate | 修改日期 | modify_date | date |
| 4 | auditDate | 审批日期 | audit_date | date |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | barcodeRecord | 扫描 | st.materialout.BarcodeRecord |
| 2 | headItem | 材料出库单主表自定义项 | st.materialout.MaterialOutCustomItem |
| 3 | materOuts | 材料出库单子表 | st.materialout.MaterialOuts |
| 4 | defines | 材料出库单主表自由自定义项 | st.materialout.MaterialOutDefine |
