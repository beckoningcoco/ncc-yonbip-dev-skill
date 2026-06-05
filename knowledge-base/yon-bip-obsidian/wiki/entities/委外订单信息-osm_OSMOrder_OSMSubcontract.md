---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.OSMSubcontract"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单信息 (`osm.OSMOrder.OSMSubcontract`)

> OSM | 物理表：`po_order_subcontract`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单信息 |
| 物理表 | `po_order_subcontract` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:43.3740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 823b74a3-0ec8-440f-91a3-fdf94ae2f1bd | 委外订单id |

---

## 直接属性（51个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 委外订单id | `id` | 823b74a3-0ec8-440f-91a3-fdf94ae2f1bd |
| 2 | `departmentId` | 委外部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 3 | `operatorId` | 业务员 | `operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 4 | `subcontractVendorId` | 委外供应商 | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 5 | `vendorAuth` | 委外供应商权限 | `subcontract_vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 6 | `invoiceVendorId` | 开票供应商 | `invoice_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 7 | `invoiceVendorAuth` | 开票供应商权限 | `invoice_vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 8 | `tcOrgId` | 收票组织 | `tc_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 |
| 9 | `isTaxPrice` | 价格含税 | `is_taxprice` | Boolean |
| 10 | `isRework` | 是否返工 | `is_rework` | Boolean |
| 11 | `totalMoneyTC` | 总金额(交易币种) | `totalmoney_tc` | Decimal |
| 12 | `taxTC` | 税额(交易币种) | `tax_tc` | Decimal |
| 13 | `netMoneyTC` | 未税金额(交易币种) | `netmoney_tc` | Decimal |
| 14 | `totalMoneyFC` | 总金额(本币) | `totalmoney_fc` | Decimal |
| 15 | `taxFC` | 税额(本币) | `tax_fc` | Decimal |
| 16 | `netMoneyFC` | 未税金额(本币) | `netmoney_fc` | Decimal |
| 17 | `tcId` | 交易币种 | `tc_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 18 | `fcId` | 本币 | `fc_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 19 | `taxRateId` | 税率 | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 20 | `subcontractVendorContactId` | 委外商联系人 | `subcontract_vendor_contact_id` | String |
| 21 | `osmVendorContactId` | 委外商联系人ID | `osm_vendor_contact_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 22 | `tcFCExchRateType` | 汇率类型 | `tcfc_exchrate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 23 | `tcFCExchRate` | 汇率 | `tcfc_exchrate` | Decimal |
| 24 | `exchRateOps` | 汇率换算方式 | `exchRateOps` | Integer |
| 25 | `exchDate` | 汇率日期 | `exch_date` | DateTime |
| 26 | `paymentBy` | 付款依据 | `payment_by` | PaymentBy |
| 27 | `requestedPaymentTC` | 累计付款申请金额(交易币) | `requested_payment_tc` | Decimal |
| 28 | `requestedPaymentFC` | 累计付款申请金额(本币) | `requested_payment_fc` | Decimal |
| 29 | `paymentagrement` | 付款协议 | `iPaymentagrement` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 30 | `expiredayConfirmType` | 到期日确定方式 | `expiredayConfirmType` | Integer |
| 31 | `oadayConfirmType` | 出账日确定方式 | `oadayConfirmType` | Integer |
| 32 | `purContractId` | 采购合同Id | `pur_contract_id` | Long |
| 33 | `purContractNo` | 采购合同号 | `pur_contract_no` | String |
| 34 | `osmBusiType` | 委外业务类型 | `osm_busi_type` | Integer |
| 35 | `costAccountingMethod` | 成本核算方式 | `cost_accounting_method` | Integer |
| 36 | `mixConsultRole` | 混合云协同角色 | `mix_consult_role` | Integer |
| 37 | `continuousOsmDealWay` | 连续委外处理方式 | `continuous_osm_deal_way` | Integer |
| 38 | `tradePath` | 贸易路径 | `trade_path` | c69f1d6a-783c-4f79-b446-b4da14cb7fff |
| 39 | `tcOrgAccount` | 跨组织委外结算 | `tc_org_account` | Short |
| 40 | `closeApply` | 关闭申请 | `close_apply` | Short |
| 41 | `expenseNatSum` | 本币费用含税金额 | `expense_nat_sum` | Decimal |
| 42 | `expenseNatMoney` | 本币费用无税金额 | `expense_nat_money` | Decimal |
| 43 | `expenseOriSum` | 原币费用含税金额 | `expense_ori_sum` | Decimal |
| 44 | `expenseOriMoney` | 原币费用无税金额 | `expense_ori_money` | Decimal |
| 45 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 46 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 47 | `isEndTrade` | 是否末级 | `isEndTrade` | Short |
| 48 | `tradeRouteID` | 贸易路径Id | `tradeRouteID` | c69f1d6a-783c-4f79-b446-b4da14cb7fff |
| 49 | `tradeRouteLineno` | 站点 | `tradeRouteLineno` | Decimal |
| 50 | `throwStatus` | 抛单状态 | `throw_status` | Integer |
| 51 | `ctTplId` | 合同模版ID | `ct_tpl_id` | 2a45fe2c-202e-46a1-ba09-2f4ea704ae2b |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `invoiceVendorAuth` | 开票供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 2 | `tcOrgId` | 收票组织 | `org.func.FinanceOrg` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `departmentId` | 委外部门 | `aa.baseorg.DeptMV` | Service |  |
| 5 | `vendorAuth` | 委外供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 6 | `osmVendorContactId` | 委外商联系人ID | `aa.vendor.VendorContacts` | Service |  |
| 7 | `tradeRouteID` | 贸易路径Id | `sccs.multitrade.TradeRoute` | Service |  |
| 8 | `tcFCExchRateType` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 9 | `subcontractVendorId` | 委外供应商 | `aa.vendor.Vendor` | Service |  |
| 10 | `ctTplId` | 合同模版ID | `DZHTFW.econtract.econtractTemplate` | Service |  |
| 11 | `fcId` | 本币 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 12 | `tradePath` | 贸易路径 | `sccs.multitrade.TradeRoute` | Service |  |
| 13 | `id` | 委外订单id | `osm.OSMOrder.OSMOrder` | None | true |
| 14 | `taxRateId` | 税率 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 15 | `tcId` | 交易币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 16 | `operatorId` | 业务员 | `bd.staff.Staff` | Service |  |
| 17 | `paymentagrement` | 付款协议 | `bd.payments.PayAgreement` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 19 | `invoiceVendorId` | 开票供应商 | `aa.vendor.Vendor` | Service |  |
