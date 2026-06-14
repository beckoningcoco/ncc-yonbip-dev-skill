---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.BidauctionMainHallVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍大厅 (`bcsourcing.bidauctionHall.BidauctionMainHallVO`)

> ycSouring | 物理表：`cpu_bidauction_hall`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍大厅 |
| 物理表 | `cpu_bidauction_hall` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:42:59.8270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（64个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 采购商租户id | `enterprise_id` | Long |
| 3 | `enterpriseName` | 采购商租户名称 | `enterprise_name` | String |
| 4 | `recommendationRules` | 推荐规则 | `recommendation_rules` | String |
| 5 | `billStatus` | 竞拍主厅状态 | `bill_status` | String |
| 6 | `bidAuctionFinish` | 竞拍是否结束 | `bid_auction_finish` | String |
| 7 | `bidDecryptionPwd` | 解密监督人密码 | `bid_decryption_pwd` | String |
| 8 | `bidDecryptionSendTime` | 解密监督人密码发送时间 | `bid_decryption_sendTime` | DateTime |
| 9 | `bidEndTime` | 竞拍结束时间 | `bid_end_time` | DateTime |
| 10 | `bidMaterialBillId` | 明细竞拍,规则物料行ID | `bid_material_bill_id` | Long |
| 11 | `bidProjectCode` | 采购方案编码 | `bid_project_code` | String |
| 12 | `bidProjectName` | 方案名称 | `bid_project_name` | String |
| 13 | `bidSchemeId` | 竞拍方案id | `bid_scheme_id` | Long |
| 14 | `bidSchemeName` | 方案名称 | `bid_scheme_name` | String |
| 15 | `bidSectionCode` | 标段编码 | `bid_section_code` | String |
| 16 | `bidSectionName` | 标段名称 | `bid_section_name` | String |
| 17 | `bidStartTime` | 竞拍开始时间 | `bid_start_time` | DateTime |
| 18 | `bidauctionRounds` | 竞拍类型 | `bidauction_rounds` | Integer |
| 19 | `bidauctionRuleId` | 竞拍规则主表id | `bidauction_rule_id` | 6dc4b46c-19d3-4af2-bb73-6684309d3422 |
| 20 | `biddingMaxRound` | 竞拍最大轮次 | `bidding_maxround` | Integer |
| 21 | `biddingRoundOver` | 是否终轮竞拍结束 | `bidding_round_over` | Boolean |
| 22 | `biddingTime` | 竞价时长 | `bidding_time` | Long |
| 23 | `billId` | 标段id | `bill_id` | Long |
| 24 | `billSegment` | 单据环节 | `bill_segment` | String |
| 25 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 26 | `cpuHallQuotationRecommendVOList` | 竞拍大厅推荐中标方表 | `` | fdf5ebd3-575c-4cf9-b0dd-ccf340ff9961 |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `createUserId` | 创建人id | `create_user_id` | Long |
| 29 | `createUserName` | 创建人姓名 | `create_user_name` | String |
| 30 | `currTypeSign` | 竞拍币种符号 | `currTypeSign` | String |
| 31 | `currencyCode` | 竞拍币种编码 | `currency_code` | String |
| 32 | `currencyId` | 竞拍币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 33 | `currencyName` | 竞拍币种名称 | `currency_name` | String |
| 34 | `currentRound` | 当前竞拍轮次 | `current_round` | Integer |
| 35 | `dataType` | 新老数据标识 | `data_category` | Integer |
| 36 | `decryptRecommendWin` | 是否已解密推荐中标方 | `decrypt_recommend_win` | Boolean |
| 37 | `delayBidSequence` | 延时报价次数 | `delay_bid_sequence` | Integer |
| 38 | `delayTime` | 延迟时长 | `delay_time` | Long |
| 39 | `dr` | dr | `dr` | Short |
| 40 | `hallCategory` | 大厅分类 | `hall_category` | Integer |
| 41 | `hallType` | 大厅类型 | `hall_type` | Integer |
| 42 | `linkName` | 联系人姓名 | `link_name` | String |
| 43 | `linkPhone` | 联系电话 | `link_phone` | String |
| 44 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 45 | `modifier` | 修改人名称 | `modifier` | String |
| 46 | `moneyDigit` | 金额精度 | `money_digit` | Integer |
| 47 | `moneyRount` | 金额舍入规则 | `money_rount` | Integer |
| 48 | `previousRoundHallId` | 多轮时,记录上一轮竞拍大厅ID | `previous_round_hall_id` | Long |
| 49 | `priceDigit` | 单价精度 | `price_digit` | Integer |
| 50 | `priceRount` | 单价舍入规则 | `price_rount` | Integer |
| 51 | `pubts` | 时间戳 | `pubts` | DateTime |
| 52 | `roundStatus` | 当前是否为最新轮次 | `round_status` | Boolean |
| 53 | `serialNumber` | 排序编号 | `serial_number` | Integer |
| 54 | `sourceId` | 来源数据id | `source_id` | Long |
| 55 | `sourceType` | 来源数据类型 | `source_type` | Integer |
| 56 | `subHallList` | 竞拍子厅 | `` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 57 | `surplusTime` | 竞拍剩余时间 | `surplus_time` | Long |
| 58 | `suspendReason` | 暂停原因 | `suspend_reason` | String |
| 59 | `taskId` | 调度任务ID | `taskId` | String |
| 60 | `terminationReason` | 终止原因 | `termination_reason` | String |
| 61 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 62 | `ts` | 默认值 | `ts` | DateTime |
| 63 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 64 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuHallQuotationRecommendVOList` | 竞拍大厅推荐中标方表 | `bcsourcing.bidauctionHall.CpuHallQuotationRecommendVO` | None | true |
| 2 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 3 | `bidauctionRuleId` | 竞拍规则主表id | `bcsourcing.bidauctionHall.CpuBidauctionRuleVO` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `subHallList` | 竞拍子厅 | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None | true |
| 6 | `currencyId` | 竞拍币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
