---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍规则 (`yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleVO`)

> ycSouring | 物理表：`cpu_bidauction_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍规则 |
| 物理表 | `cpu_bidauction_rule` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:26:27.2350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（58个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 3 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 4 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 5 | `bidSchemeId` | 竞拍方案id | `bid_scheme_id` | 47f970ed-7918-4927-b6a9-d29a95005d42 |
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
| 17 | `bidStartPrice` | 起步价 | `bid_start_price` | Decimal |
| 18 | `highPrice` | 最高限价 | `high_price` | Decimal |
| 19 | `lowPrice` | 最低限价 | `low_price` | Decimal |
| 20 | `priceAdjustPattern` | 价格调整模式 | `price_adjust_pattern` | String |
| 21 | `priceAdjustMode` | 价格调整方式 | `price_adjust_mode` | String |
| 22 | `lowBiddingStep` | 价格调整幅度 | `low_bidding_step` | Decimal |
| 23 | `maxinumStepSize` | 最大步长限制 | `maxinum_step_size` | Decimal |
| 24 | `protectedPriceMode` | 保护价方式 | `protected_price_mode` | String |
| 25 | `protectedPriceType` | 保护价类型 | `protected_price_type` | String |
| 26 | `protectedPrice` | 保护价 | `protected_price` | Decimal |
| 27 | `priceRankingBasis` | 排名价格类型 | `price_ranking_basis` | String |
| 28 | `rankingAmountSummaryType` | 排名金额汇总方式 | `ranking_amount_summary_type` | String |
| 29 | `materialRankingBasis` | 明细排名方式 | `material_ranking_basis` | String |
| 30 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | Long |
| 31 | `bidderCanQuantity` | 投标人可否报数量 | `bidder_can_quantity` | Integer |
| 32 | `billId` | 主单据id | `bill_id` | Long |
| 33 | `realTimeAllocation` | 是否实时分摊 | `real_time_allocation` | String |
| 34 | `billSource` | 单据来源 | `bill_source` | String |
| 35 | `billSegment` | 单据环节 | `bill_segment` | String |
| 36 | `bidDecryptionMonitor` | 是否需要解密监督 | `bid_decryption_monitor` | Integer |
| 37 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 38 | `controlUnbalancedQuotation` | 是否控制不平衡报价 | `control_unbalanced_quotation` | Integer |
| 39 | `cpuBidauctionRuleMaterialVOList` | 竞拍规则物料表 | `` | 946c95a5-9f16-4096-91fb-70025d41826e |
| 40 | `cpuBidauctionVO` | 竞拍方案 | `` | 47f970ed-7918-4927-b6a9-d29a95005d42 |
| 41 | `createTime` | 创建时间 | `create_time` | DateTime |
| 42 | `createUserId` | 创建人id | `create_user_id` | Long |
| 43 | `createUserName` | 创建人姓名 | `create_user_name` | String |
| 44 | `currency_id` | 竞拍币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 45 | `currency_name` | 竞拍币种名称 | `currency_name` | String |
| 46 | `decryptionPersonId` | 解密监督人id | `decryption_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 47 | `decryptionPersonName` | 解密监督人姓名 | `decryption_person_name` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 48 | `dr` | dr | `dr` | Short |
| 49 | `eliminateRanking` | 淘汰名次 | `eliminate_ranking` | Decimal |
| 50 | `guidePrice` | 指导价 | `guide_price` | Decimal |
| 51 | `hallId` | 竞价大厅id | `hall_id` | Long |
| 52 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 53 | `modifier` | 修改人名称 | `modifier` | String |
| 54 | `projectDurationLimit` | 按项目统一控制时长 | `project_duration_limit` | Integer |
| 55 | `pubts` | 时间戳 | `pubts` | DateTime |
| 56 | `taxRateModifiable` | 税率可修改 | `tax_rate_modifiable` | Short |
| 57 | `ts` | 默认值 | `ts` | DateTime |
| 58 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `decryptionPersonName` | 解密监督人姓名 | `bd.staff.Staff` | Service |  |
| 2 | `cpuBidauctionRuleMaterialVOList` | 竞拍规则物料表 | `yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleMaterialVO` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `bidSchemeId` | 竞拍方案id | `yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionVO` | None |  |
| 5 | `cpuBidauctionVO` | 竞拍方案 | `yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionVO` | None | true |
| 6 | `decryptionPersonId` | 解密监督人id | `bd.staff.Staff` | Service |  |
| 7 | `currency_id` | 竞拍币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
