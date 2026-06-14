---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmSubcontractChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单委外信息变更 (`po.subcontractchange.OsmSubcontractChange`)

> OSM | 物理表：`osm_order_subcontract_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单委外信息变更 |
| 物理表 | `osm_order_subcontract_change` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:19.6810` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | dadfc2eb-7638-4b21-95b9-e274fb4fe84d | id |

---

## 直接属性（53个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeOrderType` | 变更类型 | `change_order_type` | String |
| 2 | `closeApply` | 关闭申请 | `close_apply` | Short |
| 3 | `continuousOsmDealWay` | 连续委外处理方式 | `continuous_osm_deal_way` | Integer |
| 4 | `costAccountingMethod` | 成本核算方式 | `cost_accounting_method` | Integer |
| 5 | `ctTplId` | 合同模版ID | `ct_tpl_id` | 2a45fe2c-202e-46a1-ba09-2f4ea704ae2b |
| 6 | `departmentId` | 委外部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 7 | `exchDate` | 汇率日期 | `exch_date` | DateTime |
| 8 | `exchRateOps` | 汇率换算方式 | `exchRateOps` | Integer |
| 9 | `expenseNatMoney` | 本币费用无税金额 | `expense_nat_money` | Decimal |
| 10 | `expenseNatSum` | 本币费用含税金额 | `expense_nat_sum` | Decimal |
| 11 | `expenseOriMoney` | 原币费用无税金额 | `expense_ori_money` | Decimal |
| 12 | `expenseOriSum` | 原币费用含税金额 | `expense_ori_sum` | Decimal |
| 13 | `expiredayConfirmType` | 到期日确定方式 | `expiredayConfirmType` | Integer |
| 14 | `fcId` | 本币 | `fc_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 15 | `id` | id | `id` | dadfc2eb-7638-4b21-95b9-e274fb4fe84d |
| 16 | `invoiceVendorAuth` | 开票供应商权限 | `invoice_vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 17 | `invoiceVendorId` | 开票供应商 | `invoice_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 18 | `isEndTrade` | 是否末级 | `isEndTrade` | Short |
| 19 | `isRework` | 是否返工 | `is_rework` | Boolean |
| 20 | `isTaxPrice` | 价格含税 | `is_taxprice` | Boolean |
| 21 | `mixConsultRole` | 混合云协同角色 | `mix_consult_role` | Integer |
| 22 | `netMoneyFC` | 未税金额(本币) | `netmoney_fc` | Decimal |
| 23 | `netMoneyTC` | 未税金额(交易币种) | `netmoney_tc` | Decimal |
| 24 | `oadayConfirmType` | 出账日确定方式 | `oadayConfirmType` | Integer |
| 25 | `operatorId` | 业务员 | `operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 26 | `originalOrderId` | 原单id | `original_order_id` | 6b22debd-7902-4f3a-a7b6-c806b2f7e1d5 |
| 27 | `osmBusiType` | 委外业务类型 | `osm_busi_type` | Integer |
| 28 | `osmVendorContactId` | 委外商联系人ID | `osm_vendor_contact_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 29 | `paymentBy` | 付款依据 | `payment_by` | PaymentBy |
| 30 | `paymentagrement` | 付款协议 | `iPaymentagrement` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 31 | `purContractId` | 采购合同Id | `pur_contract_id` | Long |
| 32 | `purContractNo` | 采购合同号 | `pur_contract_no` | String |
| 33 | `requestedPaymentFC` | 累计付款申请金额(本币) | `requested_payment_fc` | Decimal |
| 34 | `requestedPaymentTC` | 累计付款申请金额(交易币) | `requested_payment_tc` | Decimal |
| 35 | `subcontractVendorContactId` | 委外商联系人 | `subcontract_vendor_contact_id` | String |
| 36 | `subcontractVendorId` | 委外供应商 | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 37 | `taxFC` | 税额(本币) | `tax_fc` | Decimal |
| 38 | `taxRateId` | 税率 | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 39 | `taxTC` | 税额(交易币种) | `tax_tc` | Decimal |
| 40 | `tcFCExchRate` | 汇率 | `tcfc_exchrate` | Decimal |
| 41 | `tcFCExchRateType` | 汇率类型 | `tcfc_exchrate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 42 | `tcId` | 交易币种 | `tc_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 43 | `tcOrgAccount` | 跨组织委外结算 | `tc_org_account` | Short |
| 44 | `tcOrgId` | 收票组织 | `tc_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 |
| 45 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 46 | `throwStatus` | 抛单状态 | `throw_status` | Integer |
| 47 | `totalMoneyFC` | 总金额(本币) | `totalmoney_fc` | Decimal |
| 48 | `totalMoneyTC` | 总金额(交易币种) | `totalmoney_tc` | Decimal |
| 49 | `tradePath` | 贸易路径 | `trade_path` | c69f1d6a-783c-4f79-b446-b4da14cb7fff |
| 50 | `tradeRouteID` | 贸易路径Id | `tradeRouteID` | c69f1d6a-783c-4f79-b446-b4da14cb7fff |
| 51 | `tradeRouteLineno` | 站点 | `tradeRouteLineno` | Decimal |
| 52 | `vendorAuth` | 委外供应商权限 | `subcontract_vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 53 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（20个）

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
| 10 | `originalOrderId` | 原单id | `po.order.Subcontract` | None |  |
| 11 | `ctTplId` | 合同模版ID | `DZHTFW.econtract.econtractTemplate` | Service |  |
| 12 | `fcId` | 本币 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 13 | `tradePath` | 贸易路径 | `sccs.multitrade.TradeRoute` | Service |  |
| 14 | `id` | id | `po.subcontractchange.OsmOrderChange` | None | true |
| 15 | `taxRateId` | 税率 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 16 | `tcId` | 交易币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 17 | `operatorId` | 业务员 | `bd.staff.Staff` | Service |  |
| 18 | `paymentagrement` | 付款协议 | `bd.payments.PayAgreement` | Service |  |
| 19 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 20 | `invoiceVendorId` | 开票供应商 | `aa.vendor.Vendor` | Service |  |
