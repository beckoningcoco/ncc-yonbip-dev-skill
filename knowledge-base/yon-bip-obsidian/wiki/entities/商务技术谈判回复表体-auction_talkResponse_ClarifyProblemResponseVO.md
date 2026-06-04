---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "auction.talkResponse.ClarifyProblemResponseVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商务技术谈判回复表体 (`auction.talkResponse.ClarifyProblemResponseVO`)

> ycBusinessCenter | 物理表：`clarify_problem_response`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商务技术谈判回复表体 |
| 物理表 | `clarify_problem_response` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:26:49.3690` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 问题澄清 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidClarifyBidderId` | 谈判供应商 | `bid_clarify_bidder_id` | 21a7d9ba-783e-4848-aaa0-b95b280f37c5 |
| 2 | `bidClarifyId` | 谈判单 | `bid_clarify_id` | dffcae36-3871-4d90-9ec5-ed563f559bd9 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 6 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 7 | `files` | 答复附件 | `files` | String |
| 8 | `id` | 问题澄清 | `id` | Long |
| 9 | `problemId` | 问题 | `problem_id` | def2b65d-031d-4e40-8e97-2fec430ab64b |
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
| 1 | `bidClarifyId` | 谈判单 | `auction.talks.BidClarifyVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `bidClarifyBidderId` | 谈判供应商 | `auction.talkResponse.ClarifyBidderVO` | None | true |
| 4 | `problemId` | 问题 | `auction.talks.ClarifyProblemVO` | None |  |
