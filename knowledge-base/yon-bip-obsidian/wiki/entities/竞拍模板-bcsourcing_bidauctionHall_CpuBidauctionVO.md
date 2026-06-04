---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.CpuBidauctionVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍模板 (`bcsourcing.bidauctionHall.CpuBidauctionVO`)

> ycSouring | 物理表：`cpu_bidauction_scheme`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍模板 |
| 物理表 | `cpu_bidauction_scheme` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:44:13.5710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（50个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 3 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 4 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 5 | `bidSchemeName` | 竞拍模板名称 | `bid_scheme_name` | String |
| 6 | `schemeCode` | 竞拍模板编号 | `code` | String |
| 7 | `bidauctionRuleId` | 竞拍方案规则ID | `bidauction_rule_id` | 6dc4b46c-19d3-4af2-bb73-6684309d3422 |
| 8 | `bidauctionPattern` | 竞拍模式 | `bidauction_pattern` | String |
| 9 | `bidauctionDirection` | 竞拍方向 | `bidauction_direction` | String |
| 10 | `bidauctionMode` | 竞拍方式 | `bidauction_mode` | String |
| 11 | `bidauctionType` | 竞拍类型 | `bidauction_type` | String |
| 12 | `bidauctionAccording` | 竞拍对象类型 | `bidauction_according` | String |
| 13 | `bidauctionOrder` | 竞拍顺序 | `bidauction_order` | String |
| 14 | `triedBidauction` | 试竞拍 | `tried_bidauction` | Boolean |
| 15 | `billStatus` | 单据状态 | `bill_status` | String |
| 16 | `bidauctionRounds` | 竞拍轮次 | `bidauction_rounds` | Integer |
| 17 | `bidauctionCurrency` | 竞拍币种 | `bidauction_currency` | String |
| 18 | `bidauctionCurrencyId` | 竞拍币种ID | `bidauction_currency_id` | String |
| 19 | `bidauctionCurrencyCode` | 竞拍币种编码 | `bidauction_currency_code` | String |
| 20 | `bidauctionHallDisplay` | 竞拍大厅显示 | `bidauction_hall_display` | String |
| 21 | `bidauctionHallMonitorDisplay` | 竞拍监控大厅显示 | `bidauction_monitor_hall_display` | String |
| 22 | `bidauctionResultPublicity` | 供应商端每轮结束公示信息 | `bidauction_result_publicity` | String |
| 23 | `bidquoteMode` | 出价方式 | `bidquote_mode` | String |
| 24 | `bidquoteStep` | 出价步长 | `bidquote_step` | Decimal |
| 25 | `eliminateMode` | 淘汰方式 | `eliminate_mode` | String |
| 26 | `eliminateRankingType` | 淘汰名次类型 | `eliminate_ranking_type` | String |
| 27 | `eliminateRanking` | 淘汰名次 | `eliminate_ranking` | Decimal |
| 28 | `recommendMode` | 授标方式 | `recommend_mode` | String |
| 29 | `recommendRanking` | 推荐名次 | `recommend_ranking` | Integer |
| 30 | `multipleRounds` | 是否多轮 | `multiple_rounds` | Integer |
| 31 | `multipleRoundsMode` | 多轮方式 | `multiple_rounds_mode` | String |
| 32 | `bidauctionMaxrounds` | 最大轮数 | `bidauction_maxrounds` | Integer |
| 33 | `parentId` | 父节点id | `parent_id` | Long |
| 34 | `createOrgCode` | 创建组织编码 | `create_org_code` | String |
| 35 | `createOrgName` | 创建组织名称 | `create_org_name` | String |
| 36 | `applicableOrgName` | 适用组织范围 | `applicable_org_name` | String |
| 37 | `applicableOrgId` | 组织id | `applicable_org_id` | String |
| 38 | `auctionOpenMode` | 大厅开启方式 | `auction_open_mode` | String |
| 39 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 40 | `createTime` | 创建时间 | `create_time` | DateTime |
| 41 | `createUserId` | 创建人id | `create_user_id` | Long |
| 42 | `createUserName` | 创建人姓名 | `create_user_name` | String |
| 43 | `departmentName` | 部门 | `department_name` | String |
| 44 | `dr` | dr | `dr` | Short |
| 45 | `hallId` | 竞价子厅id | `hall_id` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 46 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 47 | `modifier` | 修改人名称 | `modifier` | String |
| 48 | `pubts` | 时间戳 | `pubts` | DateTime |
| 49 | `ts` | 默认值 | `ts` | DateTime |
| 50 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidauctionRuleId` | 竞拍方案规则ID | `bcsourcing.bidauctionHall.CpuBidauctionRuleVO` | None | true |
| 2 | `hallId` | 竞价子厅id | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
