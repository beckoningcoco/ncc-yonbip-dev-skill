---
tags: [BIP, metadata, st, OsmInRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 委外入库单主表 (st.osminrecord.OsmInRecord)

> Platform: BIP V5 | Module: st | Table: st_osminrecord | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 委外入库单主表 |
| uri | st.osminrecord.OsmInRecord |
| tableName | st_osminrecord |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |
| description | 委外入库单主表 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (21)

| # | Name | URI |
|---|------|-----|
| 1 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 2 | 商家相关 (IShop) | base.itf.IShop |
| 3 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 4 | 事项交换 (IMatterInfoAble) | st.matterinfo.IMatterInfoAble |
| 5 | 库存表头抽取 (IHeadInfo) | voucher.st.IHeadInfo |
| 6 | 单据回写 (IHeadWriteBack) | st.voucher.IHeadWriteBack |
| 7 | 内部交易交换信息接口 (IIntTradeinfo) | st.inttradeinfo.IIntTradeinfo |
| 8 | 库存接口_标识 (IInventorySign) | st.internaltransaction.IInventorySign |
| 9 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 10 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 11 | 奇门相关字段 (QiMen) | voucher.st.QiMen |
| 12 | 过账信息 (IPostAccountInfo) | gscm.itf.IPostAccountInfo |
| 13 | 外部系统 (ExternalSystem) | st.externalsystem.ExternalSystem |
| 14 | 会计事务过账信息-存货 (FiEventAccInfo) | gscm.interf.FiEventAccInfo |
| 15 | 会计事务过账信息-应付 (FiEventAccInfoAp) | gscm.interf.FiEventAccInfoAp |
| 16 | 库存移动记录版本 (ICertificateVersion) | st.billstate.ICertificateVersion |
| 17 | 财务过账相关信息记录 (FiInfoRecord) | gscm.interf.FiInfoRecord |
| 18 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 19 | 库存是否更新存量标识接口 (IStockUpdate) | st.stockupdate.IStockUpdate |
| 20 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 21 | 汇率信息 (IExchangeRate) | voucher.base.IExchangeRate |

---

## All Fields (117)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | certificateVersion | 库存移动记录版本 | certificate_version | long | Long |  |  | nullable |
| 2 | fiEventAccountingDate | 会计事务记账日期 | fiEventAccountingDate | text | String |  |  | nullable |
| 3 | fiEventAccountingDateAp | 会计事务记账日期_应付 | fiEventAccountingDateAp | text | String |  |  | nullable |
| 4 | fiEventCode | 会计事务类型编码 | fiEventCode | text | String |  |  | nullable |
| 5 | fiEventCodeAp | 会计事务类型编码_应付 | fiEventCodeAp | text | String |  |  | nullable |
| 6 | fiEventDataId | 会计事务数据ID | fiEventDataId | text | String |  |  | nullable |
| 7 | fiEventDataIdAp | 会计事务数据ID_应付 | fiEventDataIdAp | text | String |  |  | nullable |
| 8 | fiEventId | 会计事务类型ID | fiEventId | text | String |  |  | nullable |
| 9 | fiEventIdAp | 会计事务类型ID_应付 | fiEventIdAp | text | String |  |  | nullable |
| 10 | costAccountingMethod | 委外成本核算方式 | cost_accounting_method | int | Integer |  |  | nullable |
| 11 | impactStockTiming | 更新存量时机 | impact_stock_timing | int | Integer |  |  | nullable |
| 12 | expenseNatSum | 费用本币含税金额 | expense_nat_sum | number | Decimal |  |  | nullable |
| 13 | expenseNatMoney | 费用本币无税金额 | expense_nat_money | number | Decimal |  |  | nullable |
| 14 | expenseOriSum | 费用含税金额 | expense_ori_sum | number | Decimal |  |  | nullable |
| 15 | expenseOriMoney | 费用无税金额 | expense_ori_money | number | Decimal |  |  | nullable |
| 16 | exchRateOps | 汇率折算方式 | exchRateOps | - | unitfyEnum.GZTBDM.ExchangeRateMethod |  |  | nullable |
| 17 | alreadyUpdateStock | 已更新存量 | already_update_stock | int | Integer |  |  | nullable |
| 18 | impactFinancialTiming | 传财务时机 | impact_financial_timing | int | Integer |  |  | nullable |
| 19 | alreadyUpdateFinancial | 已传财务 | already_update_financial | int | Integer |  |  | nullable |
| 20 | writeOffEnable | 启用冲销 | write_off_enable | short | Short |  |  | nullable |
| 21 | writeOffStatus | 冲销状态 | write_off_status | short | Short |  |  | nullable |
| 22 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 23 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 24 | writeOffReason | 冲销原因 | write_off_reason | quote | aa.reason.Reason |  |  | nullable |
| 25 | specialBizType | 特殊业务类型 | special_biz_type | text | String |  |  | nullable |
| 26 | osmBusiType | 委外业务类型 | osm_busi_type | int | Integer |  |  | nullable |
| 27 | isUpdateStock | 是否更新存量 | isUpdateStock | switch | Boolean |  |  | nullable |
| 28 | noPostReasonMsg | 不过账原因信息 | noPostReasonMsg | text | String |  |  | nullable |
| 29 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 30 | isContract | 需要与供应商协同 | is_contract | switch | Boolean |  |  | nullable |
| 31 | costStart | 成本期初 | costStart | short | Short |  |  | isRedundant,nullable |
| 32 | currencyId | 币种 | currency_id | quote | bd.currencytenant.CurrencyTenantVO |  |  | isRedundant,nullable |
| 33 | custom | 所属客户 | iCustomId | long | Long |  |  | nullable |
| 34 | exchRateDate | 汇率日期 | exch_rate_date | date | Date |  |  | nullable |
| 35 | externalSystem | 外系统来源标识 | externalSystem | text | String |  |  | nullable |
| 36 | internalSign | 是否走内部交易的标识 | iInternalSign | switch | Boolean |  |  |  |
| 37 | localCurrencyId | 本币 | local_currency_id | quote | bd.currencytenant.CurrencyTenantVO |  |  | isRedundant,nullable |
| 38 | moneysum | 金额 | fMoneySum | number | Decimal |  |  | nullable |
| 39 | osmInRecordDefineCharacter | 自定义项特征属性组 | osmInRecordDefineCharacter | UserDefine | st.osminrecord.OsmInRecordDefineCharacter |  |  | nullable |
| 40 | paymentstatus | 付款状态 | cPaymentStatus | text | String |  |  | isRedundant,nullable |
| 41 | paymentsum | 付款金额 | fPaymentSum | number | Decimal |  |  | isRedundant,nullable |
| 42 | payor | 付款人 | iPayor | quote | base.user.User |  |  | isRedundant,nullable |
| 43 | paytime | 付款时间 | dPayTime | timestamp | Timestamp |  |  | isRedundant,nullable |
| 44 | postAccountStatus | 过账状态 | postAccountStatus | short | Short |  |  | nullable |
| 45 | postAccountVersion | 过账版本 | postAccountVersion | long | Long |  |  | nullable |
| 46 | stockDirection | 库存方向 | istockdirection | text | String |  |  | nullable |
| 47 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 48 | voucherType | 单据类型(新架构) | voucherType | quote | bd.bill.BillTypeVO |  |  | nullable |
| 49 | wbTime | 单据回写时间 | wbTime | text | String |  |  | nullable |
| 50 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 51 | org | 收货组织ID | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isBusinessLog,isMasterOrg,nullable |
| 52 | accountOrg | 会计主体ID | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 53 | osmOrg | 委外组织ID | iOsmId | quote | aa.baseorg.OrgMV |  |  | isFunShare,isRedundant,nullable |
| 54 | inInvoiceOrg | 收票组织ID | in_invoice_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 55 | warehouse | 仓库id | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 56 | bustype | 业务类型id | iBusType | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 57 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 58 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 59 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 60 | store | 门店id | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 61 | shop | 商家id | iShopID | long | Long |  | Y | nullable,reportHide |
| 62 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 63 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 64 | vendor | 委外供应商ID | iVendorId | quote | aa.vendor.Vendor |  |  | dataPowerFlag,data_auth,nullable |
| 65 | invoiceVendor | 开票供应商ID | invoice_vendor | quote | aa.vendor.Vendor |  |  | nullable |
| 66 | department | 委外部门ID | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,isBusinessLog,nullable |
| 67 | paymentagrement | 付款协议档案ID | iPaymentagrement | quote | bd.payments.PayAgreement |  |  | isRedundant,nullable |
| 68 | currency | 币种ID | iCurrencyID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 69 | natCurrency | 本币ID | iNatCurrencyID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 70 | exchRateType | 汇率类型ID | cExchangeRateTypeId | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 71 | exchRate | 汇率 | exchRate | number | Decimal |  |  | nullable |
| 72 | taxRate | 税率 | tax_rate | number | Decimal |  |  | nullable |
| 73 | taxitems | 税目id | iTaxItems | quote | archive.taxArchives.TaxRateArchive |  |  | nullable |
| 74 | isUpdateCost | 更新存货成本 | isUpdateCost | switch | Boolean |  |  | nullable |
| 75 | contact | 联系人 | cContact | text | String |  |  | nullable |
| 76 | contactTel | 联系人电话 | cContactTel | text | String |  |  | nullable |
| 77 | operator | 业务员id | iOperatorId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,isBusinessLog,isSalesman,nullable |
| 78 | receiptDocEntryAndMgmt | 入库立账方式 | receiptDocEntryAndMgmt | text | String |  |  | nullable |
| 79 | invoicingDocEntryAndMgmt | 立账开票依据 | invoicingDocEntryAndMgmt | text | String |  |  | nullable |
| 80 | stockMgr | 库管员ID | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isBusinessLog,nullable |
| 81 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 82 | isBeginning | 期初标识 | isBeginning | switch | Boolean |  |  | nullable |
| 83 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 84 | memo | 备注 | cmemo | text | String |  |  | isBusinessLog,nullable |
| 85 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 86 | srcBillType | 来源类型 | csrcbilltype | text | String |  |  | nullable |
| 87 | srcBill | 来源单据id | isrcbillid | text | String |  |  | nullable |
| 88 | srcBillNO | 来源单据号 | csrcbillno | text | String |  |  | bMakeBill,nullable |
| 89 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 90 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 91 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 92 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 93 | isInvBack | 红票标识 | iIsInvBack | switch | Boolean |  |  | isRedundant,nullable |
| 94 | payAgreement | 立账规则 | iPayAgreement | long | Long |  |  | isRedundant,nullable |
| 95 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 96 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 97 | isAutomaticVerify | 是否自动核销 | is_automatic_verify | switch | Boolean |  |  | nullable |
| 98 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 99 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 100 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 101 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 102 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 103 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 104 | auditor | 提交人 | auditor | text | String |  |  | isGlobalization,nullable |
| 105 | auditTime | 提交时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 106 | auditDate | 提交日期 | audit_date | date | Date |  |  | nullable |
| 107 | creatorId | 创建人id | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 108 | modifierId | 修改人id | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 109 | auditorId | 审批人id | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 110 | wmsBillno | WMS单号 | wmsbillno | text | String |  |  | nullable |
| 111 | wmsInStatus | WMS转入状态 | wmsinstatus | short | Short |  |  | nullable |
| 112 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short | Short |  |  | nullable |
| 113 | barcodeRecord | 扫描 | - | - | st.osminrecord.BarcodeRecord |  |  |  |
| 114 | defines | 委外入库单主表自由自定义项 | - | - | st.osminrecord.OsmInRecordDefine |  |  |  |
| 115 | headItem | 委外入库单主表自定义项 | - | - | st.osminrecord.OsmInRecordCustomItem |  |  |  |
| 116 | osmInRecordExtend | 委外入库单主表平行表 | - | - | st.osminrecord.OsmInRecordExtend |  |  |  |
| 117 | osmInRecords | 委外入库单子表 | - | - | st.osminrecord.OsmInRecords |  |  |  |

---

## Reference Fields (28)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | writeOffReason | 冲销原因 | write_off_reason | aa.reason.Reason |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 3 | currencyId | 币种 | currency_id | bd.currencytenant.CurrencyTenantVO |
| 4 | localCurrencyId | 本币 | local_currency_id | bd.currencytenant.CurrencyTenantVO |
| 5 | payor | 付款人 | iPayor | base.user.User |
| 6 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 7 | voucherType | 单据类型(新架构) | voucherType | bd.bill.BillTypeVO |
| 8 | org | 收货组织ID | iOrgid | aa.baseorg.InventoryOrgMV |
| 9 | accountOrg | 会计主体ID | account_org | aa.baseorg.FinanceOrgMV |
| 10 | osmOrg | 委外组织ID | iOsmId | aa.baseorg.OrgMV |
| 11 | inInvoiceOrg | 收票组织ID | in_invoice_org | aa.baseorg.FinanceOrgMV |
| 12 | warehouse | 仓库id | iWarehouseId | aa.warehouse.Warehouse |
| 13 | bustype | 业务类型id | iBusType | bd.bill.TransType |
| 14 | store | 门店id | iStoreID | aa.store.Store |
| 15 | vendor | 委外供应商ID | iVendorId | aa.vendor.Vendor |
| 16 | invoiceVendor | 开票供应商ID | invoice_vendor | aa.vendor.Vendor |
| 17 | department | 委外部门ID | department | aa.baseorg.DeptMV |
| 18 | paymentagrement | 付款协议档案ID | iPaymentagrement | bd.payments.PayAgreement |
| 19 | currency | 币种ID | iCurrencyID | bd.currencytenant.CurrencyTenantVO |
| 20 | natCurrency | 本币ID | iNatCurrencyID | bd.currencytenant.CurrencyTenantVO |
| 21 | exchRateType | 汇率类型ID | cExchangeRateTypeId | bd.exchangeRate.ExchangeRateTypeVO |
| 22 | taxitems | 税目id | iTaxItems | archive.taxArchives.TaxRateArchive |
| 23 | operator | 业务员id | iOperatorId | bd.staff.Staff |
| 24 | stockMgr | 库管员ID | stock_mgr | bd.staff.Staff |
| 25 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 26 | creatorId | 创建人id | creatorId | base.user.User |
| 27 | modifierId | 修改人id | modifierId | base.user.User |
| 28 | auditorId | 审批人id | auditorId | base.user.User |

---

## Number Fields (26)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | costAccountingMethod | 委外成本核算方式 | cost_accounting_method | int |
| 2 | impactStockTiming | 更新存量时机 | impact_stock_timing | int |
| 3 | expenseNatSum | 费用本币含税金额 | expense_nat_sum | number |
| 4 | expenseNatMoney | 费用本币无税金额 | expense_nat_money | number |
| 5 | expenseOriSum | 费用含税金额 | expense_ori_sum | number |
| 6 | expenseOriMoney | 费用无税金额 | expense_ori_money | number |
| 7 | alreadyUpdateStock | 已更新存量 | already_update_stock | int |
| 8 | impactFinancialTiming | 传财务时机 | impact_financial_timing | int |
| 9 | alreadyUpdateFinancial | 已传财务 | already_update_financial | int |
| 10 | writeOffEnable | 启用冲销 | write_off_enable | short |
| 11 | writeOffStatus | 冲销状态 | write_off_status | short |
| 12 | osmBusiType | 委外业务类型 | osm_busi_type | int |
| 13 | costStart | 成本期初 | costStart | short |
| 14 | moneysum | 金额 | fMoneySum | number |
| 15 | paymentsum | 付款金额 | fPaymentSum | number |
| 16 | postAccountStatus | 过账状态 | postAccountStatus | short |
| 17 | verifystate | 审批状态 | verifystate | short |
| 18 | returncount | 退回次数 | returncount | short |
| 19 | exchRate | 汇率 | exchRate | number |
| 20 | taxRate | 税率 | tax_rate | number |
| 21 | status | 单据状态 | status | short |
| 22 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 23 | printCount | 打印次数 | printCount | int |
| 24 | totalPieces | 整单件数 | total_pieces | number |
| 25 | wmsInStatus | WMS转入状态 | wmsinstatus | short |
| 26 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short |

---

## Date Fields (5)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | exchRateDate | 汇率日期 | exch_rate_date | date |
| 2 | vouchdate | 单据日期 | vouchdate | date |
| 3 | createDate | 创建日期 | create_date | date |
| 4 | modifyDate | 修改日期 | modify_date | date |
| 5 | auditDate | 提交日期 | audit_date | date |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | osmInRecordExtend | 委外入库单主表平行表 | st.osminrecord.OsmInRecordExtend |
| 2 | osmInRecords | 委外入库单子表 | st.osminrecord.OsmInRecords |
| 3 | barcodeRecord | 扫描 | st.osminrecord.BarcodeRecord |
| 4 | headItem | 委外入库单主表自定义项 | st.osminrecord.OsmInRecordCustomItem |
| 5 | defines | 委外入库单主表自由自定义项 | st.osminrecord.OsmInRecordDefine |
