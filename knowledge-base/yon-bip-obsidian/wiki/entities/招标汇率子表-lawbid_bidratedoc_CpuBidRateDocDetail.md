---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidratedoc.CpuBidRateDocDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 招标汇率子表 (`lawbid.bidratedoc.CpuBidRateDocDetail`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_rate_doc_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 招标汇率子表 |
| 物理表 | `cpu_bid_rate_doc_detail` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:49.9510` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:05:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidStage` | 招标阶段 | `bid_stage` | String |
| 2 | `id` | id | `id` | Long |
| 3 | `rateValueOps` | 汇率折算方式 | `rate_value_ops` | ExchangeRateMethod |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `zhaobiaoCurrencyId` | 招标币种ID | `zhaobiao_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 9 | `baojiaCurrencyId` | 报价币种ID | `baojia_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 10 | `rateTime` | 汇率日期 | `rate_time` | DateTime |
| 11 | `rateDocId` | 汇率主表ID | `rate_doc_id` | bd61a59c-01ee-47e5-966f-ef9afa20c801 |
| 12 | `sectionId` | 标段ID | `section_id` | Long |
| 13 | `multipleCurrentStage` | 当前阶段 | `multiple_current_stage` | Integer |
| 14 | `rateValue` | 汇率值 | `rate_value` | Decimal |
| 15 | `rateTypeId` | 汇率类型 | `rate_type_id` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `baojiaCurrencyId` | 报价币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `rateDocId` | 汇率主表ID | `lawbid.bidratedoc.CpuBidRateDoc` | None | true |
| 4 | `zhaobiaoCurrencyId` | 招标币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
