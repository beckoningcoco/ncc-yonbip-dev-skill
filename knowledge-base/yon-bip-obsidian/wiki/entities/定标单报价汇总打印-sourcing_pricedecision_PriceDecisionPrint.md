---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricedecision.PriceDecisionPrint"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定标单报价汇总打印 (`sourcing.pricedecision.PriceDecisionPrint`)

> ycSouringInquiry | 物理表：`cpu_pricedecision_print`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定标单报价汇总打印 |
| 物理表 | `cpu_pricedecision_print` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:10:53.9160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 定标单报价打印id |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `priceReduction` | 降价幅度 | `price_reduction` | String |
| 2 | `id` | 定标单报价打印id | `id` | Long |
| 3 | `qtofferId` | 报价单id | `qtoffer_id` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 4 | `pricedecisionId` | 定标单id | `pricedecision_id` | 4c65ba32-f884-44bd-ad0d-21414f32c012 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `buyofferDetailId` | 询价单子表id | `buyoffer_detail_id` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 7 | `buyofferId` | 询价单id | `buyoffer_id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `lowestMoney` | 本次最低报价含税金额 | `loest_money` | Decimal |
| 10 | `lowestPrice` | 本次最低报价含税单价 | `loest_price` | Decimal |
| 11 | `openMoney` | 开标价格 | `open_money` | Decimal |
| 12 | `pdqueryid` | 定标单id | `pdquery_id` | 4c65ba32-f884-44bd-ad0d-21414f32c012 |
| 13 | `pricedecisionDetailId` | 定标单子表id | `pricedecision_detail_id` | 5ad37a5c-0251-495d-8791-6c08a9d69254 |
| 14 | `pritemid` | 采购需求id | `pritemid` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `qtofferDetailId` | 报价单子表id | `qtoffer_detail_id` | 52035a4f-aa8a-4ec4-8b75-858a5396cca4 |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `buyofferId` | 询价单id | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `pricedecisionDetailId` | 定标单子表id | `sourcing.pricedecision.PriceDecisionDetail` | None |  |
| 4 | `qtofferDetailId` | 报价单子表id | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetail` | None |  |
| 5 | `qtofferId` | 报价单id | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None |  |
| 6 | `pricedecisionId` | 定标单id | `sourcing.pricedecision.PriceDecision` | None |  |
| 7 | `pritemid` | 采购需求id | `sourcing.pureq.IpuPuReq` | None |  |
| 8 | `pdqueryid` | 定标单id | `sourcing.pricedecision.PriceDecision` | None | true |
| 9 | `buyofferDetailId` | 询价单子表id | `sourcing.ibuyoffer.BuyOfferBodyVO` | None |  |
