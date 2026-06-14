---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricedecision.PriceDecisionPayTerm"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定标单付款协议子表 (`sourcing.pricedecision.PriceDecisionPayTerm`)

> ycSouringInquiry | 物理表：`cpu_pricedecision_payterm`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定标单付款协议子表 |
| 物理表 | `cpu_pricedecision_payterm` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:11:05.1700` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 付款协议子表ID |

---

## 直接属性（51个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 付款协议子表ID | `id` | Long |
| 2 | `pricedecisionId` | 定标单主表id | `pricedecision_id` | 4c65ba32-f884-44bd-ad0d-21414f32c012 |
| 3 | `supplierId` | 供应商id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 4 | `payName` | 付款名称 | `pay_name` | String |
| 5 | `payPeriod` | 付款阶段 | `pay_period` | Integer |
| 6 | `payPointName` | 付款起点名称 | `pay_point_name` | String |
| 7 | `isProgressConfirm` | 需进度确认 | `is_progress_confirm` | String |
| 8 | `prePayType` | 预付折算方式 | `pre_pay_type` | String |
| 9 | `delayDay` | 延迟天数 | `delay_day` | Integer |
| 10 | `delayMonth` | 延迟月份 | `delay_month` | Integer |
| 11 | `accountingUnit` | 账期单位 | `accounting_unit` | String |
| 12 | `initialDate` | 起算日 | `initial_date` | DateTime |
| 13 | `outDayType` | 出账日确定方式 | `out_day_type` | String |
| 14 | `outDay` | 出账日 | `out_day` | DateTime |
| 15 | `fixedoutDay` | 固定出账日 | `fixedout_day` | Integer |
| 16 | `fixedoutDay1` | 固定出账日1 | `fixedout_day1` | Integer |
| 17 | `fixedoutDay2` | 固定出账日2 | `fixedout_day2` | Integer |
| 18 | `fixedoutDay3` | 固定出账日3 | `fixedout_day3` | Integer |
| 19 | `fixedoutDay4` | 固定出账日4 | `fixedout_day4` | Integer |
| 20 | `dueDateType` | 到期日确定方式 | `due_date_type` | String |
| 21 | `dueDate` | 到期日 | `due_date` | DateTime |
| 22 | `fixedexpireDay` | 固定到期日 | `fixedexpire_day` | Integer |
| 23 | `fixedexpireDay1` | 固定到期日1 | `fixedexpire_day1` | Integer |
| 24 | `fixedexpireDay2` | 固定到期日2 | `fixedexpire_day2` | Integer |
| 25 | `fixedexpireDay3` | 固定到期日3 | `fixedexpire_day3` | Integer |
| 26 | `fixedexpireDay4` | 固定到期日4 | `fixedexpire_day4` | Integer |
| 27 | `isUserDefinePeyterm` | 是否自定义付款协议 | `is_userdefine_payterm` | String |
| 28 | `payPoint` | 付款起点编码 | `pay_point` | String |
| 29 | `payPointId` | 付款起点id | `pay_point_id` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 |
| 30 | `payRatio` | 付款比例 | `pay_ratio` | Decimal |
| 31 | `payPointAfterDay` | 账期天数 | `pay_point_after_day` | Integer |
| 32 | `payTaxMoney` | 付款金额 | `pay_tax_money` | Decimal |
| 33 | `advancePay` | 是否预付款 | `advance_pay` | Integer |
| 34 | `settleTypeName` | 结算方式 | `settle_type_name` | String |
| 35 | `settleType` | 结算方式编码 | `settle_type` | String |
| 36 | `settleTypeId` | 结算方式ID | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 37 | `shelf` | 是否质保金 | `shelf` | Integer |
| 38 | `memo` | 备注 | `memo` | String |
| 39 | `PriceDecisionPayTermDefineCharacter` | 付款协议自定义项 | `define_character_id` | 100fe2e4-459c-4d33-a3a7-ee623e7e687d |
| 40 | `currencyNameDiwork` | 币种名称 | `currency_name_diwork` | String |
| 41 | `currency_code` | 币种编码 | `currency_code_diwork` | String |
| 42 | `currency_id` | 币种id | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 43 | `contractinfoId` | 合同履行方式 | `contractinfo_id` | 26d9222f-a0fc-45fd-87e6-244bc3256cd6 |
| 44 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 45 | `defaultValueEditable` | 默认值是否可编辑 | `default_value_editable` | Integer |
| 46 | `dr` | dr | `dr` | Integer |
| 47 | `enterpriseId` | 采购商租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 48 | `pubts` | pubts时间戳 | `pubts` | DateTime |
| 49 | `ts` | ts时间戳 | `ts` | DateTime |
| 50 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 51 | `paytermdefine` | 付款协议自由自定义项 | `` | a5e83cbc-d456-4c90-9520-4bb9f9d54fe1 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `PriceDecisionPayTermDefineCharacter` | 付款协议自定义项 | `sourcing.pricedecision.PriceDecisionPayTermDefineCharacter` | None |  |
| 2 | `supplierId` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 3 | `contractinfoId` | 合同履行方式 | `sourcing.pricedecision.PriceDecisionContractExt` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `payPointId` | 付款起点id | `bd.payments.PayStartBase` | Service |  |
| 6 | `pricedecisionId` | 定标单主表id | `sourcing.pricedecision.PriceDecision` | None |  |
| 7 | `settleTypeId` | 结算方式ID | `aa.settlemethod.SettleMethod` | Service |  |
| 8 | `enterpriseId` | 采购商租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `paytermdefine` | 付款协议自由自定义项 | `sourcing.pricedecision.PriceDecisionPayTermDefine` | None | true |
| 10 | `currency_id` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
