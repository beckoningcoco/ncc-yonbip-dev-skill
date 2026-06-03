---
tags: [BIP, metadata, st, OthOutRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 其他出库单主表 (st.othoutrecord.OthOutRecord)

> Platform: BIP V5 | Module: st | Table: st_othoutrecord | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 其他出库单主表 |
| uri | st.othoutrecord.OthOutRecord |
| tableName | st_othoutrecord |
| domain | ustock |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (22)

| # | Name | URI |
|---|------|-----|
| 1 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 2 | 事项交换 (IMatterInfoAble) | st.matterinfo.IMatterInfoAble |
| 3 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 4 | 商家相关 (IShop) | base.itf.IShop |
| 5 | 库存表头抽取 (IHeadInfo) | voucher.st.IHeadInfo |
| 6 | 奇门相关字段 (QiMen) | voucher.st.QiMen |
| 7 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 8 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 9 | 收货人信息 (IReceiver) | st.voucher.IReceiver |
| 10 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 11 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 12 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 13 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 14 | 外部系统 (ExternalSystem) | st.externalsystem.ExternalSystem |
| 15 | 过账信息 (IPostAccountInfo) | gscm.itf.IPostAccountInfo |
| 16 | 会计事务过账信息-存货 (FiEventAccInfo) | gscm.interf.FiEventAccInfo |
| 17 | 库存移动记录版本 (ICertificateVersion) | st.billstate.ICertificateVersion |
| 18 | 财务过账相关信息记录 (FiInfoRecord) | gscm.interf.FiInfoRecord |
| 19 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 20 | 外部来源线索 (IOutSysObjClue) | base.itf.IOutSysObjClue |
| 21 | 奇门多次回传 (QiMenMultiplePostback) | voucher.st.QiMenMultiplePostback |
| 22 | 库存是否更新存量标识接口 (IStockUpdate) | st.stockupdate.IStockUpdate |

---

## All Fields (92)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | externalSystem | 外系统来源标识 | externalSystem | text | String |  |  | nullable |
| 2 | othOutRecordDefineCharacter | 自定义项特征属性组 | othOutRecordDefineCharacter | UserDefine | st.othoutrecord.OthOutRecordDefineCharacter |  |  | nullable |
| 3 | postAccountStatus | 过账状态 | postAccountStatus | short | Short |  |  | nullable |
| 4 | postAccountVersion | 过账版本 | postAccountVersion | long | Long |  |  | nullable |
| 5 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 6 | voucherType | 单据类型 | voucher_type | quote | bd.bill.BillTypeVO |  |  | nullable |
| 7 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 8 | isAssets | 是否来源资产单据 | isAssets | switch | Boolean |  |  | nullable |
| 9 | impactStockTiming | 更新存量时机 | impact_stock_timing | int | Integer |  |  | nullable |
| 10 | alreadyUpdateStock | 已更新存量 | already_update_stock | int | Integer |  |  | nullable |
| 11 | impactFinancialTiming | 传财务时机 | impact_financial_timing | int | Integer |  |  | nullable |
| 12 | alreadyUpdateFinancial | 已传财务 | already_update_financial | int | Integer |  |  | nullable |
| 13 | writeOffEnable | 启用冲销 | write_off_enable | short | Short |  |  | nullable |
| 14 | writeOffStatus | 冲销状态 | write_off_status | int | Integer |  |  | nullable |
| 15 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 16 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 17 | writeOffReason | 冲销原因 | write_off_reason | quote | aa.reason.Reason |  |  | nullable |
| 18 | sourceDomain | 来源领域 | sourcedomain | text | String |  |  | nullable |
| 19 | noPostReasonMsg | 不过账原因信息 | noPostReasonMsg | text | String |  |  | nullable |
| 20 | fiEventDataId | 会计事务数据ID | fiEventDataId | text | String |  |  | nullable |
| 21 | fiEventId | 会计事务类型ID | fiEventId | text | String |  |  | nullable |
| 22 | fiEventCode | 会计事务类型编码 | fiEventCode | text | String |  |  | nullable |
| 23 | fiEventAccountingDate | 会计事务记账日期 | fiEventAccountingDate | text | String |  |  | nullable |
| 24 | certificateVersion | 库存移动记录版本 | certificate_version | long | Long |  |  | nullable |
| 25 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 26 | out_sys_id | 外部来源线索 | out_sys_id | text | String |  |  | nullable |
| 27 | out_sys_code | 外部来源编码 | out_sys_code | text | String |  |  | nullable |
| 28 | out_sys_version | 外部来源版本 | out_sys_version | text | String |  |  | nullable |
| 29 | out_sys_type | 外部来源类型 | out_sys_type | text | String |  |  | nullable |
| 30 | wmsUnique | wms回传唯一标识 | wmsUnique | text | String |  |  | nullable |
| 31 | isUpdateStock | 是否更新存量 | isUpdateStock | switch | Boolean |  |  | nullable |
| 32 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 33 | org | 库存组织 | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isBusinessLog,isMasterOrg,nullable |
| 34 | code | 出库单编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 35 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 36 | bustype | 交易类型 | iBusType | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 37 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 38 | shop | 商家id | iShopID | long | Long |  | Y | nullable,reportHide |
| 39 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 40 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 41 | store | 门店id | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 42 | warehouse | 仓库 | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 43 | department | 部门 | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,isBusinessLog,nullable |
| 44 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 45 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 46 | operator | 业务员 | iOperatorId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,isBusinessLog,isSalesman,nullable |
| 47 | stockMgr | 库管员ID | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isBusinessLog,nullable |
| 48 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 49 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 50 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 51 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 52 | memo | 备注 | cMemo | text | String |  |  | isBusinessLog,nullable |
| 53 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 54 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 55 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 56 | modifierId | 修改人id | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 57 | auditorId | 审批人id | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 58 | lendType | 借用对象类型 | lend_type | short | Short |  |  | nullable |
| 59 | lendDept | 借出部门 | lend_dept | quote | aa.baseorg.DeptMV |  |  | nullable |
| 60 | lendCustom | 借出客户 | lend_custom | quote | aa.merchant.Merchant |  |  | nullable |
| 61 | isUpdateCost | 更新存货成本 | isUpdateCost | switch | Boolean |  |  | nullable |
| 62 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 63 | lendUser | 借出人员 | lend_user | quote | bd.staff.Staff |  |  | nullable |
| 64 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 65 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 66 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 67 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 68 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 69 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 70 | auditor | 提交人 | auditor | text | String |  |  | isGlobalization,nullable |
| 71 | auditTime | 提交时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 72 | auditDate | 提交日期 | audit_date | date | Date |  |  | nullable |
| 73 | srcType | 来源类型 | srcType | int | Integer |  |  | nullable |
| 74 | srcBillType | 来源单据类型 | cSrcBillType | text | String |  |  | bMakeBill,nullable |
| 75 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 76 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 77 | wmsBillno | WMS单号 | wmsbillno | text | String |  |  | nullable |
| 78 | wmsInStatus | WMS转入状态 | wmsinstatus | short | Short |  |  | nullable |
| 79 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short | Short |  |  | nullable |
| 80 | receiver | 收货人 | cReceiver | text | String |  |  | nullable |
| 81 | receivemobile | 收货人电话 | cReceiveMobile | text | String |  |  | nullable |
| 82 | receiveaddr | 收货人地址 | cReceiveAddr | text | String |  |  | nullable |
| 83 | receivezipcode | 邮编 | cReceiveZipCode | text | String |  |  | nullable |
| 84 | lendSupplier | 借用对象 | lend_supplier | quote | aa.vendor.Vendor |  |  | nullable |
| 85 | serviceNo | 服务单号 | service_no | text | String |  |  | nullable |
| 86 | barcodeRecord | 扫描 | - | - | st.othoutrecord.BarcodeRecord |  |  |  |
| 87 | defines | 其他出库单主表自由自定义项 | - | - | st.othoutrecord.OthOutRecordDefine |  |  |  |
| 88 | headItem | 其他出库单主表自定义项 | - | - | st.othoutrecord.OthOutRecordCustomItem |  |  |  |
| 89 | headParallel | 其他出库单主表平行表 | - | - | st.othoutrecord.OthOutRecordParallel |  |  |  |
| 90 | manageInTransit | 管理在途 | manageintransit | int | Integer |  |  | nullable |
| 91 | othOutRecords | 其他出库单子表 | - | - | st.othoutrecord.OthOutRecords |  |  |  |
| 92 | relatedMorphInCount | 拆卸其他入的单据个数 | related_morphin_count | int | Integer |  |  | nullable |

---

## Reference Fields (21)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 2 | voucherType | 单据类型 | voucher_type | bd.bill.BillTypeVO |
| 3 | writeOffReason | 冲销原因 | write_off_reason | aa.reason.Reason |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 5 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 6 | org | 库存组织 | iOrgid | aa.baseorg.InventoryOrgMV |
| 7 | bustype | 交易类型 | iBusType | bd.bill.TransType |
| 8 | store | 门店id | iStoreID | aa.store.Store |
| 9 | warehouse | 仓库 | iWarehouseId | aa.warehouse.Warehouse |
| 10 | department | 部门 | department | aa.baseorg.DeptMV |
| 11 | operator | 业务员 | iOperatorId | bd.staff.Staff |
| 12 | stockMgr | 库管员ID | stock_mgr | bd.staff.Staff |
| 13 | creatorId | 创建人 | creatorId | base.user.User |
| 14 | modifierId | 修改人id | modifierId | base.user.User |
| 15 | auditorId | 审批人id | auditorId | base.user.User |
| 16 | lendDept | 借出部门 | lend_dept | aa.baseorg.DeptMV |
| 17 | lendCustom | 借出客户 | lend_custom | aa.merchant.Merchant |
| 18 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |
| 19 | lendUser | 借出人员 | lend_user | bd.staff.Staff |
| 20 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 21 | lendSupplier | 借用对象 | lend_supplier | aa.vendor.Vendor |

---

## Number Fields (20)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | postAccountStatus | 过账状态 | postAccountStatus | short |
| 2 | impactStockTiming | 更新存量时机 | impact_stock_timing | int |
| 3 | alreadyUpdateStock | 已更新存量 | already_update_stock | int |
| 4 | impactFinancialTiming | 传财务时机 | impact_financial_timing | int |
| 5 | alreadyUpdateFinancial | 已传财务 | already_update_financial | int |
| 6 | writeOffEnable | 启用冲销 | write_off_enable | short |
| 7 | writeOffStatus | 冲销状态 | write_off_status | int |
| 8 | verifystate | 审批状态 | verifystate | short |
| 9 | returncount | 退回次数 | returncount | short |
| 10 | ownertype | 货权归属 | ownertype | int |
| 11 | status | 单据状态 | status | short |
| 12 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 13 | totalPieces | 整单件数 | total_pieces | number |
| 14 | printCount | 打印次数 | printCount | int |
| 15 | lendType | 借用对象类型 | lend_type | short |
| 16 | srcType | 来源类型 | srcType | int |
| 17 | wmsInStatus | WMS转入状态 | wmsinstatus | short |
| 18 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short |
| 19 | manageInTransit | 管理在途 | manageintransit | int |
| 20 | relatedMorphInCount | 拆卸其他入的单据个数 | related_morphin_count | int |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | vouchdate | 单据日期 | vouchdate | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | modifyDate | 修改日期 | modify_date | date |
| 4 | auditDate | 提交日期 | audit_date | date |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | headParallel | 其他出库单主表平行表 | st.othoutrecord.OthOutRecordParallel |
| 2 | othOutRecords | 其他出库单子表 | st.othoutrecord.OthOutRecords |
| 3 | barcodeRecord | 扫描 | st.othoutrecord.BarcodeRecord |
| 4 | headItem | 其他出库单主表自定义项 | st.othoutrecord.OthOutRecordCustomItem |
| 5 | defines | 其他出库单主表自由自定义项 | st.othoutrecord.OthOutRecordDefine |
