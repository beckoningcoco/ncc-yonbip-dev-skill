---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍方案 (`yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionVO`)

> ycSouring | 物理表：`cpu_bidauction_scheme`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍方案 |
| 物理表 | `cpu_bidauction_scheme` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:26:53.3600` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（44个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 3 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 4 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 5 | `schemeName` | 竞拍方案名称 | `bid_scheme_name` | String |
| 6 | `schemeCode` | 竞拍方案编码 | `code` | String |
| 7 | `bidauctionRuleId` | 竞拍方案规则ID | `bidauction_rule_id` | 7fc80044-d3dc-45e7-93a2-be1e14558b64 |
| 8 | `bidauctionPattern` | 竞拍模式 | `bidauction_pattern` | String |
| 9 | `bidauctionDirection` | 竞拍方向 | `bidauction_direction` | String |
| 10 | `bidauctionMode` | 竞拍方式 | `bidauction_mode` | String |
| 11 | `bidauctionType` | 竞拍类型 | `bidauction_type` | String |
| 12 | `bidauctionAccording` | 竞拍对象类型 | `bidauction_according` | String |
| 13 | `bidauctionOrder` | 竞拍顺序 | `bidauction_order` | String |
| 14 | `triedBidauction` | 试竞价 | `tried_bidauction` | Boolean |
| 15 | `billStatus` | 单据状态 | `bill_status` | Short |
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
| 28 | `recommendMode` | 推荐中标者方式 | `recommend_mode` | String |
| 29 | `recommendRanking` | 推荐名次 | `recommend_ranking` | Integer |
| 30 | `parentId` | 父节点id | `parent_id` | Long |
| 31 | `createOrgCode` | 创建组织编码 | `create_org_code` | String |
| 32 | `createOrgName` | 创建组织名称 | `create_org_name` | String |
| 33 | `applicableOrgName` | 适用组织范围 | `applicable_org_name` | String |
| 34 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 35 | `code` | 编码 | `code` | String |
| 36 | `createTime` | 创建时间 | `create_time` | DateTime |
| 37 | `createUserId` | 创建人id | `create_user_id` | Long |
| 38 | `createUserName` | 创建人姓名 | `create_user_name` | String |
| 39 | `dr` | dr | `dr` | Short |
| 40 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 41 | `modifier` | 修改人名称 | `modifier` | String |
| 42 | `pubts` | 时间戳 | `pubts` | DateTime |
| 43 | `ts` | 默认值 | `ts` | DateTime |
| 44 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidauctionRuleId` | 竞拍方案规则ID | `yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
