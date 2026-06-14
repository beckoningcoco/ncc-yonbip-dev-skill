---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.project.AuctionSectionCurrency"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 标包币种 (`auction.project.AuctionSectionCurrency`)

> ycSouringAuction | 物理表：`cpu_section_currency`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标包币种 |
| 物理表 | `cpu_section_currency` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:26:00.6970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `currencyId` | 报价币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 2 | `currencyName` | 报价币种 | `currency_name` | String |
| 3 | `currencyCode` | 币种编码 | `currency_code` | String |
| 4 | `bidSectionId` | 标段包 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `exchangeRateValue` | 汇率值 | `exchange_rate_value` | Decimal |
| 9 | `exchangeRateValueOps` | 汇率折算方式 | `exchange_rate_value_ops` | ExchangeRateMethod |
| 10 | `id` | ID | `id` | Long |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `quotationCurrencyId` | 招标币种 | `quotation_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `quotationCurrencyId` | 招标币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 3 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `currencyId` | 报价币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 5 | `bidSectionId` | 标段包 | `auction.project.AuctionSection` | None | true |
