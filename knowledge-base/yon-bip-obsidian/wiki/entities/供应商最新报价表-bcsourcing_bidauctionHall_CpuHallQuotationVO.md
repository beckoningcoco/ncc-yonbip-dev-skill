---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.CpuHallQuotationVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商最新报价表 (`bcsourcing.bidauctionHall.CpuHallQuotationVO`)

> ycSouring | 物理表：`cpu_hall_quotation_recent`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商最新报价表 |
| 物理表 | `cpu_hall_quotation_recent` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:43:12.2180` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（58个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `version` | 版本号 | `version` | Integer |
| 2 | `id` | ID | `id` | String |
| 3 | `ts` | 默认值 | `ts` | DateTime |
| 4 | `dr` | dr | `dr` | Short |
| 5 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 6 | `biddingStatus` | 是否中标 | `bidding_status` | String |
| 7 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 10 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | Long |
| 11 | `supEnterpriseName` | 竞拍方名称 | `sup_enterprise_name` | String |
| 12 | `purEnterpriseId` | 采购商租户id | `pur_enterprise_id` | Long |
| 13 | `purEnterpriseName` | 采购商租户名称 | `pur_enterprise_name` | String |
| 14 | `bidSequence` | 每轮报价次数 | `bid_sequence` | Integer |
| 15 | `roundStatus` | 当前是否为最新轮次 | `round_status` | Boolean |
| 16 | `hallId` | 竞拍大厅id | `hall_id` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 17 | `billId` | 标包id | `bill_id` | Long |
| 18 | `gatherHallId` | 汇总大厅id | `gather_hall_id` | 35362db2-287c-4497-8f9d-ae4ce4c9de77 |
| 19 | `sortno` | 最终名次 | `sortno` | Integer |
| 20 | `totalPriceApportionmentRule` | 总价分摊明细规则 | `totalprice_apportionment_rule` | String |
| 21 | `automatedQuotation` | 自动报价 | `automated_quotation` | String |
| 22 | `taxTotalMoney` | 含税总价 | `tax_total_money` | Decimal |
| 23 | `totalMoney` | 无税总价 | `total_money` | Decimal |
| 24 | `billStatus` | 单据状态 | `bill_status` | String |
| 25 | `kickReason` | 踢出原因 | `kick_reason` | String |
| 26 | `bidTime` | 报价时间 | `bid_time` | DateTime |
| 27 | `quoteConfirm` | 报价确认 | `quote_confirm` | Boolean |
| 28 | `priceRange` | 报价幅度 | `price_range` | Decimal |
| 29 | `supBiddingId` | 供应商业务单据id | `sup_bidding_id` | Long |
| 30 | `outReason` | 淘汰理由 | `out_reason` | String |
| 31 | `initTotalMoney` | 初始报价 | `init_total_money` | Decimal |
| 32 | `latestTotalMoney` | 竞拍大厅最新报价 | `latest_total_money` | Decimal |
| 33 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String |
| 34 | `cpuHallQuotationDefineCharacter` | 表头自定义项特征 | `define_character_id` | 8a235a46-e1f1-4de4-ab1f-5b873725354c |
| 35 | `randCode` | 随机码 | `rand_code` | String |
| 36 | `applyStatus` | 是否允许进入新一轮竞拍 | `apply_status` | String |
| 37 | `bidIpAddress` | 供应商报价ip地址 | `bid_ip_address` | String |
| 38 | `bidRankNow` | 供应商出价时的排名 | `bid_ranknow` | Integer |
| 39 | `bidderQuotationNum` | 报价数量 | `bidder_quotation_num` | Decimal |
| 40 | `cpuHallQuotationDetailVOList` | 供应商最新报价明细表 | `` | da829e48-cdb2-4ad8-b83a-3e9d892200fe |
| 41 | `currencyId` | 报价币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 42 | `decryptionPersonId` | 解密监督人id | `decryption_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 43 | `decryptionPersonName` | 解密监督人姓名 | `decryption_person_name` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 44 | `delayBidSequence` | 延时报价次数 | `delay_bid_sequence` | Integer |
| 45 | `delayedQuoteCount` | 延时已报价次数 | `delayed_quote_count` | Integer |
| 46 | `firstMoney` | 第一名出价 | `first_money` | Decimal |
| 47 | `headdefines` | 供应商最新报价自定义项自定义项 | `` | da69dfd2-7e1c-4310-8fb8-43a6894b6646 |
| 48 | `historyQuotationId` | 历史报价主表id | `history_quotation_id` | Long |
| 49 | `onlineStatus` | 是否在线 | `online_status` | String |
| 50 | `pubts` | 时间戳 | `pubts` | DateTime |
| 51 | `reducedRatio` | 比率 | `reduced_ratio` | Decimal |
| 52 | `sourceId` | 来源数据id | `source_id` | Long |
| 53 | `sourceType` | 来源数据类型 | `source_type` | Integer |
| 54 | `taxTotalPrice` | 含税总单价 | `tax_total_price` | Decimal |
| 55 | `totalPrice` | 无税总单价 | `total_price` | Decimal |
| 56 | `totalQuoteCount` | 已报价总次数 | `total_quote_count` | Integer |
| 57 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 58 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `decryptionPersonName` | 解密监督人姓名 | `bd.staff.Staff` | Service |  |
| 2 | `cpuHallQuotationDetailVOList` | 供应商最新报价明细表 | `bcsourcing.bidauctionHall.CpuHallQuotationDetailVO` | None | true |
| 3 | `cpuHallQuotationDefineCharacter` | 表头自定义项特征 | `bcsourcing.bidauctionHall.CpuHallQuotationDefineCharacter` | None |  |
| 4 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 5 | `hallId` | 竞拍大厅id | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None | true |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `headdefines` | 供应商最新报价自定义项自定义项 | `bcsourcing.bidauctionHall.CpuHallQuotationFreedefine` | None | true |
| 8 | `gatherHallId` | 汇总大厅id | `bcsourcing.bidauctionHall.BidauctionMainHallVO` | None |  |
| 9 | `currencyId` | 报价币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 10 | `decryptionPersonId` | 解密监督人id | `bd.staff.Staff` | Service |  |
