---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.CpuHallQuotationHistoryVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商报价历史表 (`bcsourcing.bidauctionHall.CpuHallQuotationHistoryVO`)

> ycSouring | 物理表：`cpu_hall_quotation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商报价历史表 |
| 物理表 | `cpu_hall_quotation` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:42:25.5780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（49个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 2 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 3 | `supEnterpriseName` | 竞拍方名称 | `sup_enterprise_name` | String |
| 4 | `id` | ID | `id` | String |
| 5 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | Long |
| 6 | `onlineStatus` | 在线状态 | `online_status` | String |
| 7 | `ts` | 默认值 | `ts` | DateTime |
| 8 | `bidTime` | 报价时间 | `bid_time` | DateTime |
| 9 | `dr` | dr | `dr` | Short |
| 10 | `purEnterpriseId` | 采购商租户id | `pur_enterprise_id` | Long |
| 11 | `bidSequence` | 出价轮次 | `bid_sequence` | Integer |
| 12 | `priceRange` | 幅度 | `price_range` | Decimal |
| 13 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 14 | `purEnterpriseName` | 采购商租户名称 | `pur_enterprise_name` | String |
| 15 | `latestTotalMoney` | 最新报价（元） | `latest_total_money` | Decimal |
| 16 | `bidRankNow` | 排名 | `bid_ranknow` | Integer |
| 17 | `roundStatus` | 当前是否为最新轮次 | `round_status` | Boolean |
| 18 | `initTotalMoney` | 初始报价（元） | `init_total_money` | Decimal |
| 19 | `hallId` | 竞拍大厅id | `hall_id` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 20 | `firstMoney` | 第一名出价（元） | `first_money` | Decimal |
| 21 | `taxTotalMoney` | 含税总价 | `tax_total_money` | Decimal |
| 22 | `totalMoney` | 无税总价 | `total_money` | Decimal |
| 23 | `billStatus` | 单据状态 | `bill_status` | String |
| 24 | `kickReason` | 踢出原因 | `kick_reason` | String |
| 25 | `supBiddingId` | 供应商业务单据id | `sup_bidding_id` | Long |
| 26 | `outReason` | 申请暂停理由 | `out_reason` | String |
| 27 | `totalPriceApportionmentRule` | 总价分摊明细规则 | `totalprice_apportionment_rule` | String |
| 28 | `automatedQuotation` | 自动报价 | `automated_quotation` | String |
| 29 | `taxTotalPrice` | 含税总单价 | `tax_total_price` | Decimal |
| 30 | `totalPrice` | 无税总单价 | `total_price` | Decimal |
| 31 | `delayBidSequence` | 延时报价次数 | `delay_bid_sequence` | Integer |
| 32 | `applyStatus` | 申请暂停 | `apply_status` | String |
| 33 | `biddingStatus` | 是否中标 | `bidding_status` | String |
| 34 | `randCode` | 随机码 | `rand_code` | String |
| 35 | `sortno` | 最终名次 | `sortno` | Integer |
| 36 | `bidIpAddress` | 供应商报价ip地址 | `bid_ip_address` | String |
| 37 | `bidderQuotationNum` | 报价数量 | `bidder_quotation_num` | Decimal |
| 38 | `billId` | 主单据id | `bill_id` | Long |
| 39 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 40 | `cpuHallQuotationDetailVOList` | 供应商报价明细历史表 | `` | 5ef924ef-ef92-4de8-8b4c-7016bc657a87 |
| 41 | `currency_id` | 报价币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 42 | `gatherHallId` | 主大厅id | `gather_hall_id` | 35362db2-287c-4497-8f9d-ae4ce4c9de77 |
| 43 | `hQuotationHistoryDefineCharacter` | 竞拍报价历史自定义特征 | `define_character_id` | 222a1d58-5c80-4405-b92f-c8aaceba749e |
| 44 | `pubts` | 时间戳 | `pubts` | DateTime |
| 45 | `quoteConfirm` | 报价是否确认 | `quote_confirm` | Boolean |
| 46 | `recentQuotationId` | 最新报价主表id | `recent_quotation_id` | 66390445-85fd-443a-9ef4-0e6b2ec2e908 |
| 47 | `reducedRatio` | 比率 | `reduced_ratio` | Decimal |
| 48 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String |
| 49 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuHallQuotationDetailVOList` | 供应商报价明细历史表 | `bcsourcing.bidauctionHall.CpuHallQuotationDetailHistoryVO` | None | true |
| 2 | `hallId` | 竞拍大厅id | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `gatherHallId` | 主大厅id | `bcsourcing.bidauctionHall.BidauctionMainHallVO` | None |  |
| 5 | `hQuotationHistoryDefineCharacter` | 竞拍报价历史自定义特征 | `bcsourcing.bidauctionHall.CpuHallQuotationHistoryDefineCharacter` | None |  |
| 6 | `currency_id` | 报价币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 7 | `recentQuotationId` | 最新报价主表id | `bcsourcing.bidauctionHall.CpuHallQuotationVO` | None |  |
