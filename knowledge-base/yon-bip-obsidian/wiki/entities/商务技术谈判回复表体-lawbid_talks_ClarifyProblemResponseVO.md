---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.talks.ClarifyProblemResponseVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商务技术谈判回复表体 (`lawbid.talks.ClarifyProblemResponseVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`clarify_problem_response`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商务技术谈判回复表体 |
| 物理表 | `clarify_problem_response` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:03:10.1270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 问题澄清 |

## 部署信息

- 部署时间: 2026-05-22 23:54:59:000

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidClarifyBidderId` | 谈判供应商 | `bid_clarify_bidder_id` | 3302bb43-825d-497a-8190-4c944ec8f7d3 |
| 2 | `bidClarifyId` | 谈判单 | `bid_clarify_id` | d318ae13-0f72-4ceb-84dc-25c79f08b220 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 6 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 7 | `files` | 答复附件 | `files` | String |
| 8 | `id` | 问题澄清 | `id` | Long |
| 9 | `problemId` | 问题 | `problem_id` | a6bb2a88-754b-43aa-8cac-d4556c80aac4 |
| 10 | `problemResponse` | 谈判答复内容 | `problem_response` | String |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `responseCode` | 回复编码 | `response_code` | String |
| 13 | `submitClarifyTime` | 提交时间 | `submit_clarify_time` | DateTime |
| 14 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidClarifyId` | 谈判单 | `lawbid.talks.BidClarifyVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `bidClarifyBidderId` | 谈判供应商 | `lawbid.talkResponse.ClarifyBidderVO` | None |  |
| 4 | `problemId` | 问题 | `lawbid.talks.ClarifyBidderDetailProblemVO` | None |  |
