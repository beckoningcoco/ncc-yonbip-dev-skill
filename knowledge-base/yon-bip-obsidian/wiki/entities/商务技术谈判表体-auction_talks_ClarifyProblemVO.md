---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.talks.ClarifyProblemVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商务技术谈判表体 (`auction.talks.ClarifyProblemVO`)

> ycSouringAuction | 物理表：`cpu_clarify_problem_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商务技术谈判表体 |
| 物理表 | `cpu_clarify_problem_detail` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:27:03.9540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidClarifyId` | 谈判单 | `bid_clarify_id` | dffcae36-3871-4d90-9ec5-ed563f559bd9 |
| 2 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 3 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 4 | `files` | 附件 | `files` | String |
| 5 | `id` | ID | `id` | Long |
| 6 | `problemCode` | 问题编码 | `problem_code` | String |
| 7 | `problemDetail` | 谈判内容 | `problem_detail` | String |
| 8 | `ytenantId` | 租户 | `ytenant_id` | String |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidClarifyId` | 谈判单 | `auction.talks.BidClarifyVO` | None |  |
