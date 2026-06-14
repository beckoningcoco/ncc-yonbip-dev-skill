---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.talks.ClarifyBidderDetailProblemVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 投标人商务技术谈判表体 (`lawbid.talks.ClarifyBidderDetailProblemVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_clarify_problem_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标人商务技术谈判表体 |
| 物理表 | `cpu_clarify_problem_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:16:56.8630` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 投标 |

## 部署信息

- 部署时间: 2026-05-22 23:54:59:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 投标 | `id` | Long |
| 2 | `bidClarifyId` | 投标澄清 | `bid_clarify_id` | d318ae13-0f72-4ceb-84dc-25c79f08b220 |
| 3 | `problemDetail` | 谈判内容 | `problem_detail` | String |
| 4 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 5 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 6 | `problemCode` | 问题编码 | `problem_code` | String |
| 7 | `files` | 附件 | `files` | String |
| 8 | `bidderDetailId` | 投标人 | `bidder_detail_id` | bba56d77-1d5d-4f71-8c6a-3659c6ea7242 |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `ytenantId` | 租户 | `ytenant_id` | String |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidderDetailId` | 投标人 | `lawbid.talks.ClarifyBidderVO` | None | true |
| 2 | `bidClarifyId` | 投标澄清 | `lawbid.talks.BidClarifyVO` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
