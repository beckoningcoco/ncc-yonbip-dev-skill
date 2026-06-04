---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.CpuBidauctionRuleVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍项目规则 (`bcsourcing.bidauctionHall.CpuBidauctionRuleVO`)

> ycSouring | 物理表：`cpu_bidauction_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍项目规则 |
| 物理表 | `cpu_bidauction_rule` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:43:05.2830` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（69个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 3 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 4 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 5 | `bidSchemeId` | 竞拍方案id | `bid_scheme_id` | 5a2c2392-d09a-4209-ae16-dd1e1ede3947 |
| 6 | `bidSchemeName` | 竞拍方案名称 | `bid_scheme_name` | String |
| 7 | `countDownTime` | 倒计时时长 | `count_down_time` | Long |
| 8 | `bidDelayTime` | 延时时长 | `bid_delay_time` | Long |
| 9 | `maxBidSequence` | 每轮出价次数 | `max_bid_sequence` | Integer |
| 10 | `maxDelaySequence` | 最大延时次数 | `max_delay_sequence` | Integer |
| 11 | `delayRank` | 延时名次 | `delay_rank` | Integer |
| 12 | `delayBidquoteSequence` | 延时出价次数 | `delay_bidquote_sequence` | Integer |
| 13 | `bidStartTime` | 竞拍开始时间 | `bid_start_time` | DateTime |
| 14 | `biddingTime` | 竞拍时长 | `bidding_time` | Long |
| 15 | `triedStartTime` | 试竞拍开始时间 | `tried_start_time` | DateTime |
| 16 | `triedEndTime` | 试竞拍结束时间 | `tried_end_time` | DateTime |
| 17 | `currency_id` | 币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 18 | `bidStartPrice` | 起步价 | `bid_start_price` | Decimal |
| 19 | `guidePrice` | 指导价 | `guide_price` | Decimal |
| 20 | `highPrice` | 最高限价 | `high_price` | Decimal |
| 21 | `lowPrice` | 最低限价 | `low_price` | Decimal |
| 22 | `priceAdjustPattern` | 价格调整模式 | `price_adjust_pattern` | String |
| 23 | `maxinumStepSize` | 幅度最大倍数 | `maxinum_step_size` | Decimal |
| 24 | `priceAdjustMode` | 价格调整方式 | `price_adjust_mode` | String |
| 25 | `lowBiddingStep` | 价格调整幅度 | `low_bidding_step` | Decimal |
| 26 | `protectedPriceMode` | 保护价方式 | `protected_price_mode` | String |
| 27 | `protectedPriceType` | 保护价类型 | `protected_price_type` | String |
| 28 | `protectedPrice` | 保护价 | `protected_price` | Decimal |
| 29 | `priceRankingBasis` | 排名价格类型 | `price_ranking_basis` | String |
| 30 | `rankingAmountSummaryType` | 排名金额汇总方式 | `ranking_amount_summary_type` | String |
| 31 | `bidderCanQuantity` | 投标人可否报数量 | `bidder_can_quantity` | Integer |
| 32 | `realTimeAllocation` | 是否实时分摊 | `real_time_allocation` | String |
| 33 | `materialRankingBasis` | 明细排名方式 | `material_ranking_basis` | String |
| 34 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | Long |
| 35 | `billId` | 主单据id | `bill_id` | Long |
| 36 | `billSource` | 单据来源 | `bill_source` | String |
| 37 | `billSegment` | 单据环节 | `bill_segment` | String |
| 38 | `lastroundBid` | 是否有效报价 | `lastround_bid` | Integer |
| 39 | `promotionRule` | 晋级规则 | `promotion_rule` | String |
| 40 | `promotionRank` | 晋级名次 | `promotion_rank` | Integer |
| 41 | `eliminateQuantity` | 淘汰数量 | `eliminate_quantity` | Integer |
| 42 | `roundsStartPrice` | 起步价 | `rounds_start_price` | String |
| 43 | `roundsStep` | 价格调整幅度 | `rounds_step` | String |
| 44 | `bidDecryptionMonitor` | 是否需要解密监督 | `bid_decryption_monitor` | Integer |
| 45 | `bidRuleRoundVOList` | 竞拍规则轮次时间表 | `` | bc73d2f7-64be-4fa1-9bad-7ca1bbbf27a8 |
| 46 | `bidderHighQuantity` | 竞拍方数量高于 | `bidder_high_quantity` | Integer |
| 47 | `bidderLowQuantity` | 竞拍方数量低于 | `bidder_low_quantity` | Integer |
| 48 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 49 | `controlUnbalancedQuotation` | 是否控制不平衡报价 | `control_unbalanced_quotation` | Integer |
| 50 | `cpuBidauctionRuleMaterialVOList` | 竞拍规则物料表 | `` | 4e020ce8-293e-4091-a615-ad1729c786ba |
| 51 | `cpuBidauctionVO` | 竞拍模板 | `` | 5a2c2392-d09a-4209-ae16-dd1e1ede3947 |
| 52 | `createTime` | 创建时间 | `create_time` | DateTime |
| 53 | `createUserId` | 创建人id | `create_user_id` | Long |
| 54 | `createUserName` | 创建人姓名 | `create_user_name` | String |
| 55 | `currency_name` | 竞拍币种名称 | `currency_name` | String |
| 56 | `decryptionPersonId` | 解密监督人id | `decryption_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 57 | `decryptionPersonName` | 解密监督人姓名 | `decryption_person_name` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 58 | `dr` | dr | `dr` | Short |
| 59 | `eliminateRanking` | 淘汰名次 | `eliminate_ranking` | Decimal |
| 60 | `fixedRounds` | 固定多轮 | `fixed_rounds` | Integer |
| 61 | `hallId` | 竞价子厅id | `hall_id` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 62 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 63 | `modifier` | 修改人名称 | `modifier` | String |
| 64 | `projectDurationLimit` | 按项目统一控制时长 | `project_duration_limit` | Integer |
| 65 | `pubts` | 时间戳 | `pubts` | DateTime |
| 66 | `reacheGuidePrice` | 是否达到指导价 | `reache_guide_price` | Integer |
| 67 | `taxRateModifiable` | 税率可修改 | `tax_rate_modifiable` | Short |
| 68 | `ts` | 默认值 | `ts` | DateTime |
| 69 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `decryptionPersonName` | 解密监督人姓名 | `bd.staff.Staff` | Service |  |
| 2 | `cpuBidauctionRuleMaterialVOList` | 竞拍规则物料表 | `bcsourcing.bidauctionHall.CpuBidauctionRuleMaterialVO` | None | true |
| 3 | `hallId` | 竞价子厅id | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `bidSchemeId` | 竞拍方案id | `bcsourcing.bidauctionHall.CpuBidauctionVO` | None |  |
| 6 | `cpuBidauctionVO` | 竞拍模板 | `bcsourcing.bidauctionHall.CpuBidauctionVO` | None | true |
| 7 | `bidRuleRoundVOList` | 竞拍规则轮次时间表 | `bcsourcing.bidauctionHall.BidauctionRuleRoundVO` | None | true |
| 8 | `decryptionPersonId` | 解密监督人id | `bd.staff.Staff` | Service |  |
| 9 | `currency_id` | 币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
