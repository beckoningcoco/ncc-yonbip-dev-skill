---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleModificationVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍规则变更表 (`yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleModificationVO`)

> ycSouring | 物理表：`cpu_bidauction_rule_modification`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍规则变更表 |
| 物理表 | `cpu_bidauction_rule_modification` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:42:49.9400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidauctionRuleId` | 竞拍规则表主表id | `bidauction_rule_id` | 7fc80044-d3dc-45e7-93a2-be1e14558b64 |
| 2 | `billSegment` | 单据环节 | `bill_segment` | String |
| 3 | `dr` | dr | `dr` | Short |
| 4 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 5 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 6 | `hallId` | 竞价大厅id | `hall_id` | Long |
| 7 | `id` | ID | `id` | Long |
| 8 | `modifyValue` | 规则项修改后值 | `modify_value` | String |
| 9 | `noticeId` | 公告id | `noticeId` | Long |
| 10 | `oldValue` | 规格项前值 | `old_value` | String |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `ruleItemName` | 规则项名称 | `rule_item_name` | String |
| 13 | `ts` | 默认值 | `ts` | DateTime |
| 14 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidauctionRuleId` | 竞拍规则表主表id | `yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
