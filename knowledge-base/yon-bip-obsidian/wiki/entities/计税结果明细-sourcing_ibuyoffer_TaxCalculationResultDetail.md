---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.TaxCalculationResultDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 计税结果明细 (`sourcing.ibuyoffer.TaxCalculationResultDetail`)

> ycSouringInquiry | 物理表：`tax_calc_result_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税结果明细 |
| 物理表 | `tax_calc_result_b` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:10:59.2920` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `calculationComponentFormula` | 计税组件公式 | `calculation_component_formula` | String |
| 2 | `calculationComponentId` | 计税组件 | `calculation_component_id` | String |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人 | `creator` | String |
| 5 | `currencyId` | 原币 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `exchangeRate` | 汇率 | `exchange_rate` | Decimal |
| 8 | `exchangeRateMethod` | 汇率折算方式 | `exchange_rate_method` | String |
| 9 | `hid` | 计税结果主表id | `hid` | 4ea06e52-7148-49d2-931d-c13665ec94c1 |
| 10 | `id` | 主键 | `id` | String |
| 11 | `localCurrencyId` | 本币 | `local_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 12 | `localTaxMny` | 本币税额 | `local_tax_mny` | Decimal |
| 13 | `modifier` | 修改人 | `modifier` | String |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `oriTaxMny` | 原币税额 | `ori_tax_mny` | Decimal |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `reliefAmount` | 减免额 | `relief_amount` | Decimal |
| 18 | `taxReliefBid` | 减免代码明细 | `tax_relief_bid` | String |
| 19 | `taxReliefId` | 减免代码 | `tax_relief_id` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `hid` | 计税结果主表id | `sourcing.ibuyoffer.TaxCalculationResult` | None | true |
| 2 | `localCurrencyId` | 本币 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `currencyId` | 原币 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
