---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.CpuBidopenSupplier"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标单供应商 (`sourcing.ibuyoffer.CpuBidopenSupplier`)

> ycSouringInquiry | 物理表：`cpu_bidopen_supplier`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标单供应商 |
| 物理表 | `cpu_bidopen_supplier` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:13.9130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `bidopenId` | 主表主键 | `bidopen_id` | 11518c81-6f1b-4338-b394-5f8dbe97ad7f |
| 3 | `supbidHid` | 投标单主表id | `supbid_hid` | Long |
| 4 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 5 | `pubts` | 时间戳 | `ts` | DateTime |
| 6 | `biddingEnterprise` | 报价企业 | `bidding_enterprise` | String |
| 7 | `bidTotalprice` | 现金报价总额 | `bid_totalprice` | Decimal |
| 8 | `bidStartTime` | 报价时间 | `bid_start_time` | DateTime |
| 9 | `bidRange` | 供应商投标范围 | `bid_range` | String |
| 10 | `status` | 状态 | `STATUS` | Integer |
| 11 | `reason` | 淘汰理由 | `reason` | String |
| 12 | `biddingEnterpriseId` | 投标企业_id | `bidding_enterprise_id` | Long |
| 13 | `acceptanceTotalMny` | 报价单创建时间 | `acceptance_total_mny` | Decimal |
| 14 | `paymentTotalMny` | pr业务标识 | `payment_total_mny` | Decimal |
| 15 | `failReason` | 淘汰理由 | `fail_reason` | String |
| 16 | `totalFullMoney` | 全额预付总价 | `total_full_money` | Decimal |
| 17 | `totalPartialMoney` | 部分预付总价 | `total_partial_money` | Decimal |
| 18 | `avgBidPrice` | 期货单价 | `avg_bid_price` | Decimal |
| 19 | `avgFullPrice` | 全额预付平均值 | `avg_full_price` | Decimal |
| 20 | `avgPartialPrice` | 部分预付平均值 | `avg_partial_price` | Decimal |
| 21 | `totalNum` | 需求总数量 | `total_num` | String |
| 22 | `bidtotalNum` | 投标总数量 | `bidtotal_num` | String |
| 23 | `supplydocId` | 供应商档案id | `supplydoc_id` | Long |
| 24 | `bidTotalnotaxprice` | 投标无税总金额 | `bid_totalnotaxprice` | Decimal |
| 25 | `currencyIdDiwork` | 报价币种id | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 26 | `currencyCodeDiwork` | 报价币种code | `currency_code_diwork` | String |
| 27 | `currencyNameDiwork` | 报价币种 | `currency_name_diwork` | String |
| 28 | `currencyTypeSignDiwork` | 报价币种符号 | `currency_type_sign_diwork` | String |
| 29 | `rateTypeDiwork` | 汇率类型 | `rate_type_diwork` | String |
| 30 | `exchangeRate` | 汇率 | `exchange_rate` | Decimal |
| 31 | `ytenant` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidopenId` | 主表主键 | `sourcing.ibuyoffer.CpuBidopen` | None | true |
| 2 | `ytenant` | ytenantId | `yht.tenant.YhtTenant` | Service |  |
| 3 | `currencyIdDiwork` | 报价币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
