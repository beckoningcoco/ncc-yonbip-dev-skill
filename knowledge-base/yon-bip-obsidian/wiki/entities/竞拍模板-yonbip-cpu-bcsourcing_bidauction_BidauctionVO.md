---
tags: ["BIP", "元数据", "数据字典", "yonbip-cpu-bcsourcing.bidauction.BidauctionVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍模板 (`yonbip-cpu-bcsourcing.bidauction.BidauctionVO`)

>  | 物理表：`cpu_bidauction_scheme`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍模板 |
| 物理表 | `cpu_bidauction_scheme` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 23:26:21.6750` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 竞拍模板编码 |

---

## 直接属性（49个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 3 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 4 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 5 | `bidSchemeName` | 竞拍模板名称 | `bid_scheme_name` | String |
| 6 | `bidauctionCurrency` | 竞拍币种 | `bidauction_currency` | String |
| 7 | `code` | 竞拍模板编码 | `code` | String |
| 8 | `bidauctionDirection` | 竞拍方向 | `bidauction_direction` | String |
| 9 | `bidauctionMode` | 竞拍方式 | `bidauction_mode` | String |
| 10 | `bidauctionType` | 竞拍类型 | `bidauction_type` | String |
| 11 | `bidauctionAccording` | 竞拍对象类型 | `bidauction_according` | String |
| 12 | `bidauctionOrder` | 竞拍顺序 | `bidauction_order` | String |
| 13 | `triedBidauction` | 试竞拍 | `tried_bidauction` | Boolean |
| 14 | `billStatus` | 状态 | `bill_status` | String |
| 15 | `bidauctionRounds` | 竞拍轮次 | `bidauction_rounds` | Integer |
| 16 | `bidauctionPattern` | 竞拍模式 | `bidauction_pattern` | String |
| 17 | `bidauctionCurrencyCode` | 竞拍币种编码 | `bidauction_currency_code` | String |
| 18 | `bidauctionCurrencyId` | 竞拍币种id | `bidauction_currency_id` | String |
| 19 | `bidauctionHallDisplay` | 竞拍大厅显示 | `bidauction_hall_display` | String |
| 20 | `bidauctionHallMonitorDisplay` | 竞拍监控大厅显示 | `bidauction_monitor_hall_display` | String |
| 21 | `bidauctionResultPublicity` | 供应商端每轮结束公示信息 | `bidauction_result_publicity` | String |
| 22 | `bidquoteMode` | 出价方式 | `bidquote_mode` | String |
| 23 | `bidquoteStep` | 出价间隔（分钟） | `bidquote_step` | Decimal |
| 24 | `eliminateMode` | 每轮淘汰供应商方式 | `eliminate_mode` | String |
| 25 | `eliminateRankingType` | 淘汰名次类型 | `eliminate_ranking_type` | String |
| 26 | `eliminateRanking` | 淘汰名次 | `eliminate_ranking` | Decimal |
| 27 | `recommendMode` | 授标方式 | `recommend_mode` | String |
| 28 | `recommendRanking` | 推荐名次 | `recommend_ranking` | Integer |
| 29 | `createUserId` | 创建人id | `create_user_id` | Long |
| 30 | `multipleRounds` | 是否多轮 | `multiple_rounds` | Integer |
| 31 | `createUserName` | 创建人姓名 | `create_user_name` | String |
| 32 | `createTime` | 创建时间 | `create_time` | DateTime |
| 33 | `multipleRoundsMode` | 多轮方式 | `multiple_rounds_mode` | String |
| 34 | `bidauctionMaxrounds` | 最大轮数 | `bidauction_maxrounds` | Integer |
| 35 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 36 | `parentId` | 父节点id | `parent_id` | Long |
| 37 | `createOrgCode` | 创建组织编码 | `create_org_code` | String |
| 38 | `createOrgName` | 创建组织名称 | `create_org_name` | String |
| 39 | `applicableOrgName` | 适用组织范围 | `applicable_org_name` | String |
| 40 | `applicableOrgId` | 组织id | `applicable_org_id` | String |
| 41 | `auctionOpenMode` | 大厅开启方式 | `auction_open_mode` | String |
| 42 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 43 | `cpuBidauctionSchemeOrgVOList` | 竞拍模板适用组织表 | `` | e0d62072-e917-4cfb-b9d5-e8cbb09f5255 |
| 44 | `departmentName` | 部门 | `department_name` | String |
| 45 | `dr` | dr | `dr` | Short |
| 46 | `modifier` | 修改人名称 | `modifier` | String |
| 47 | `pubts` | 时间戳 | `pubts` | DateTime |
| 48 | `ts` | 默认值 | `ts` | DateTime |
| 49 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `cpuBidauctionSchemeOrgVOList` | 竞拍模板适用组织表 | `yonbip-cpu-bcsourcing.bidauction.CpuBidauctionSchemeOrgVO` | None | true |
