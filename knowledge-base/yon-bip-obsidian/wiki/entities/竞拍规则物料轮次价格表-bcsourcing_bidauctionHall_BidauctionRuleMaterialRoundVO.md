---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.BidauctionRuleMaterialRoundVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍规则物料轮次价格表 (`bcsourcing.bidauctionHall.BidauctionRuleMaterialRoundVO`)

> ycSouring | 物理表：`cpu_bidauction_rule_round`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍规则物料轮次价格表 |
| 物理表 | `cpu_bidauction_rule_round` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:44:09.4140` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `currentRound` | 轮次 | `current_round` | Integer |
| 3 | `roundsStartPrice` | 起步价 | `rounds_start_price` | String |
| 4 | `guidePrice` | 指导价 | `guide_price` | Decimal |
| 5 | `lowPrice` | 最低限价 | `low_price` | Decimal |
| 6 | `highPrice` | 最高限价 | `high_price` | Decimal |
| 7 | `priceAdjustPattern` | 价格调整模式 | `price_adjust_pattern` | String |
| 8 | `priceAdjustMode` | 价格调整方式 | `price_adjust_mode` | String |
| 9 | `roundsStep` | 价格调整幅度 | `rounds_step` | String |
| 10 | `protectedPriceMode` | 保护价方式 | `protected_price_mode` | String |
| 11 | `priceRankingBasis` | 排名价格类型 | `price_ranking_basis` | String |
| 12 | `bidderCanQuantity` | 投标人可否报数量 | `bidder_can_quantity` | Integer |
| 13 | `realTimeAllocation` | 是否实时分摊 | `real_time_allocation` | String |
| 14 | `materialRankingBasis` | 明细排名方式 | `material_ranking_basis` | String |
| 15 | `bidStartTime` | 竞拍开始时间 | `bid_start_time` | DateTime |
| 16 | `biddingTime` | 竞拍时长 | `bidding_time` | Long |
| 17 | `countDownTime` | 倒计时时长 | `count_down_time` | Long |
| 18 | `bidDelayTime` | 延时时长 | `bid_delay_time` | Long |
| 19 | `maxBidSequence` | 每轮出价次数 | `max_bid_sequence` | Integer |
| 20 | `maxDelaySequence` | 最大延时次数 | `max_delay_sequence` | Integer |
| 21 | `delayBidquoteSequence` | 延时出价次数 | `delay_bidquote_sequence` | Integer |
| 22 | `bidRuleMaterialId` | 竞拍规则物料表id | `bid_rule_material_id` | 4e020ce8-293e-4091-a615-ad1729c786ba |
| 23 | `bidauctionRuleId` | 竞拍规则表主表id | `bidauction_rule_id` | Long |
| 24 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 25 | `dr` | dr | `dr` | Short |
| 26 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 27 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `ts` | 默认值 | `ts` | DateTime |
| 30 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 31 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidRuleMaterialId` | 竞拍规则物料表id | `bcsourcing.bidauctionHall.CpuBidauctionRuleMaterialVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
