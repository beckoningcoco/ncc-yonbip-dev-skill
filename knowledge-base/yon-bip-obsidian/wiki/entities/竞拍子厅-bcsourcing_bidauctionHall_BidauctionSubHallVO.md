---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.BidauctionSubHallVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍子厅 (`bcsourcing.bidauctionHall.BidauctionSubHallVO`)

> ycSouring | 物理表：`cpu_bidauction_hall`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍子厅 |
| 物理表 | `cpu_bidauction_hall` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:44:10.8110` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（67个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidAuctionFinish` | 竞拍是否结束 | `bid_auction_finish` | String |
| 2 | `bidDecryptionMonitor` | 是否需要解密监督 | `bid_decryption_monitor` | Integer |
| 3 | `bidEndTime` | 竞拍结束时间 | `bid_end_time` | DateTime |
| 4 | `bidMaterialBillId` | 明细竞拍,规则物料行ID | `bid_material_bill_id` | Long |
| 5 | `bidProjectCode` | 采购方案编码 | `bid_project_code` | String |
| 6 | `bidProjectName` | 方案名称 | `bid_project_name` | String |
| 7 | `bidSchemeId` | 竞拍方案id | `bid_scheme_id` | Long |
| 8 | `bidSchemeName` | 方案名称 | `bid_scheme_name` | String |
| 9 | `bidSectionCode` | 标段编码 | `bid_section_code` | String |
| 10 | `bidSectionName` | 标段名称 | `bid_section_name` | String |
| 11 | `bidStartTime` | 竞拍开始时间 | `bid_start_time` | DateTime |
| 12 | `bidauctionRounds` | 竞拍类型 | `bidauction_rounds` | Integer |
| 13 | `bidauctionRuleId` | 竞拍规则主表id | `bidauction_rule_id` | 6dc4b46c-19d3-4af2-bb73-6684309d3422 |
| 14 | `biddingMaxRound` | 竞拍最大轮次 | `bidding_maxround` | Integer |
| 15 | `biddingRoundOver` | 是否终轮竞拍结束 | `bidding_round_over` | Boolean |
| 16 | `biddingTime` | 竞价时长 | `bidding_time` | Long |
| 17 | `billId` | 标段id | `bill_id` | Long |
| 18 | `billSegment` | 单据环节 | `bill_segment` | String |
| 19 | `billStatus` | 单据状态 | `bill_status` | String |
| 20 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 21 | `cpuBidauctionHallNoticeVOList` | 竞拍大厅公告表 | `` | b3541b05-da56-478d-9d92-95400c459755 |
| 22 | `cpuBidauctionRuleVOList` | 竞拍项目规则 | `` | 6dc4b46c-19d3-4af2-bb73-6684309d3422 |
| 23 | `cpuHallQuotationVOList` | 供应商最新报价表 | `` | 66390445-85fd-443a-9ef4-0e6b2ec2e908 |
| 24 | `createTime` | 创建时间 | `create_time` | DateTime |
| 25 | `createUserId` | 创建人id | `create_user_id` | Long |
| 26 | `createUserName` | 创建人姓名 | `create_user_name` | String |
| 27 | `currTypeSign` | 竞拍币种符号 | `currTypeSign` | String |
| 28 | `currencyCode` | 竞拍币种编码 | `currency_code` | String |
| 29 | `currencyId` | 竞拍币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 30 | `currencyName` | 竞拍币种名称 | `currency_name` | String |
| 31 | `currentRound` | 当前竞拍轮次 | `current_round` | Integer |
| 32 | `dataType` | 新老数据标识 | `data_category` | Integer |
| 33 | `decryptRecommendWin` | 是否已解密推荐中标方 | `decrypt_recommend_win` | Boolean |
| 34 | `delayBidSequence` | 延时报价次数 | `delay_bid_sequence` | Integer |
| 35 | `delayTime` | 延迟时长 | `delay_time` | Long |
| 36 | `dr` | dr | `dr` | Short |
| 37 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 38 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 39 | `gatherParentId` | 主大厅id | `gather_parent_id` | 35362db2-287c-4497-8f9d-ae4ce4c9de77 |
| 40 | `hallCategory` | 大厅分类 | `hall_category` | Integer |
| 41 | `hallType` | 大厅类型 | `hall_type` | Integer |
| 42 | `id` | ID | `id` | Long |
| 43 | `linkName` | 联系人姓名 | `link_name` | String |
| 44 | `linkPhone` | 联系电话 | `link_phone` | String |
| 45 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 46 | `modifier` | 修改人名称 | `modifier` | String |
| 47 | `moneyDigit` | 金额精度 | `money_digit` | Integer |
| 48 | `moneyRount` | 金额舍入规则 | `money_rount` | Integer |
| 49 | `previousRoundHallId` | 多轮时,记录上一轮竞拍大厅ID | `previous_round_hall_id` | Long |
| 50 | `priceDigit` | 单价精度 | `price_digit` | Integer |
| 51 | `priceRount` | 单价舍入规则 | `price_rount` | Integer |
| 52 | `pubts` | 时间戳 | `pubts` | DateTime |
| 53 | `quotationHistoryList` | 供应商报价历史表 | `` | c0b51096-cc84-48ff-a4db-4d6e1b420b6a |
| 54 | `recommendationRules` | 推荐规则 | `recommendation_rules` | String |
| 55 | `roundStatus` | 当前是否为最新轮次 | `round_status` | Boolean |
| 56 | `rowNo` | 行号 | `row_no` | Decimal |
| 57 | `serialNumber` | 排序编号 | `serial_number` | Integer |
| 58 | `sourceId` | 来源数据id | `source_id` | Long |
| 59 | `sourceType` | 来源数据类型 | `source_type` | Integer |
| 60 | `surplusTime` | 竞拍剩余时间 | `surplus_time` | Long |
| 61 | `suspendReason` | 暂停原因 | `suspend_reason` | String |
| 62 | `taskId` | 调度任务ID | `taskId` | String |
| 63 | `terminationReason` | 终止原因 | `termination_reason` | String |
| 64 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 65 | `ts` | 默认值 | `ts` | DateTime |
| 66 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 67 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `quotationHistoryList` | 供应商报价历史表 | `bcsourcing.bidauctionHall.CpuHallQuotationHistoryVO` | None | true |
| 2 | `gatherParentId` | 主大厅id | `bcsourcing.bidauctionHall.BidauctionMainHallVO` | None | true |
| 3 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `cpuHallQuotationVOList` | 供应商最新报价表 | `bcsourcing.bidauctionHall.CpuHallQuotationVO` | None | true |
| 5 | `bidauctionRuleId` | 竞拍规则主表id | `bcsourcing.bidauctionHall.CpuBidauctionRuleVO` | None |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `cpuBidauctionRuleVOList` | 竞拍项目规则 | `bcsourcing.bidauctionHall.CpuBidauctionRuleVO` | None | true |
| 8 | `currencyId` | 竞拍币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 9 | `cpuBidauctionHallNoticeVOList` | 竞拍大厅公告表 | `bcsourcing.bidauctionHall.CpuBidauctionHallNoticeVO` | None | true |
