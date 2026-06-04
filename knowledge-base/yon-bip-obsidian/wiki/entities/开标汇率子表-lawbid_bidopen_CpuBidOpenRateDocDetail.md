---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidopen.CpuBidOpenRateDocDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标汇率子表 (`lawbid.bidopen.CpuBidOpenRateDocDetail`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bidopen_rate_doc_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标汇率子表 |
| 物理表 | `cpu_bidopen_rate_doc_detail` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:38.6010` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:22:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `bidopenId` | 开标记录主表 | `bidopen_id` | d9b08ed7-bb49-4184-bf86-23970f6dcb80 |
| 3 | `rateTime` | 汇率日期 | `rate_time` | DateTime |
| 4 | `rateValue` | 汇率值 | `rate_value` | Decimal |
| 5 | `baojiaCurrencyId` | 报价币种ID | `baojia_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 6 | `bidSectionId` | 标段（包） | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 7 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `rateTypeId` | 汇率类型 | `rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 11 | `rateValueOps` | 汇率折算方式 | `rate_value_ops` | ExchangeRateMethod |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `zhaobiaoCurrencyId` | 招标币种ID | `zhaobiao_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `rateTypeId` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 2 | `bidopenId` | 开标记录主表 | `lawbid.bidopen.CpuBidOpenVO` | None | true |
| 3 | `baojiaCurrencyId` | 报价币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `zhaobiaoCurrencyId` | 招标币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 6 | `bidSectionId` | 标段（包） | `lawbid.section.LawbidSection` | None |  |
