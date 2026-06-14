---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricedecision.PriceDecisionContractExt"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定标单履行方式子表 (`sourcing.pricedecision.PriceDecisionContractExt`)

> ycSouringInquiry | 物理表：`cpu_pricedecision_ctext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定标单履行方式子表 |
| 物理表 | `cpu_pricedecision_ctext` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:10:43.7430` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `settleType` | 结算方式编码 | `settle_type` | String |
| 2 | `settleTypeName` | 结算方式 | `settle_type_name` | String |
| 3 | `supplierCode` | 供应商编码 | `supplier_code` | String |
| 4 | `ctPayagreeCode` | 合同付款协议编码 | `ct_payagree_code` | String |
| 5 | `ctPayagreeName` | 合同付款协议名称 | `ct_payagree_name` | String |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `dr` | dr | `dr` | String |
| 8 | `id` | 主键 | `id` | Long |
| 9 | `pricedecisionId` | 定标单主表id | `pricedecision_id` | 4c65ba32-f884-44bd-ad0d-21414f32c012 |
| 10 | `pubts` | ts时间戳 | `pubts` | DateTime |
| 11 | `ts` | ts时间戳 | `ts` | DateTime |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `supplierName` | 供应商名称 | `supplier_name` | String |
| 14 | `supplierId` | 供应商id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 15 | `ctIsMaterialClass` | 采购合同是否分类合同 | `ct_ismaterial_class` | String |
| 16 | `ctTranstypeId` | 采购合同交易类型id | `ct_transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 17 | `ctControlType` | 采购合同签订形式 | `ct_control_type` | String |
| 18 | `ctPayAgreement` | 合同付款协议(不用) | `ct_pay_agreement` | String |
| 19 | `ctPayagreeId` | 合同付款协议id | `ct_payagree_id` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 20 | `ctInvoiceAgreement` | 合同发票协议 | `ct_invoice_agreement` | String |
| 21 | `settleTypeId` | 结算方式ID | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 22 | `shelfPeriod` | 质保期 | `shelf_period` | String |
| 23 | `PriceDecisionContractExtDefineCharacter` | 履行方式自定义项 | `define_character_id` | 9c7280e4-0d70-4a35-816f-8f830e728560 |
| 24 | `workPeriod` | 工期 | `work_period` | String |
| 25 | `buyofferType` | 履行方式 | `buyoffer_type` | String |
| 26 | `exedefine` | 履行方式自由自定义项 | `` | cc62c059-4772-446c-b24f-c9a68e2b684c |
| 27 | `payterms` | 定标单付款协议子表 | `` | 0444d4c1-8c95-4f17-a171-35d14753324f |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `PriceDecisionContractExtDefineCharacter` | 履行方式自定义项 | `sourcing.pricedecision.PriceDecisionContractExtDefineCharacter` | None |  |
| 2 | `supplierId` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 3 | `payterms` | 定标单付款协议子表 | `sourcing.pricedecision.PriceDecisionPayTerm` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `ctPayagreeId` | 合同付款协议id | `bd.payments.PayAgreement` | Service |  |
| 6 | `ctTranstypeId` | 采购合同交易类型id | `bd.bill.TransType` | Service |  |
| 7 | `pricedecisionId` | 定标单主表id | `sourcing.pricedecision.PriceDecision` | None | true |
| 8 | `settleTypeId` | 结算方式ID | `aa.settlemethod.SettleMethod` | Service |  |
| 9 | `exedefine` | 履行方式自由自定义项 | `sourcing.pricedecision.PriceDecisionContractExtDefine` | None | true |
