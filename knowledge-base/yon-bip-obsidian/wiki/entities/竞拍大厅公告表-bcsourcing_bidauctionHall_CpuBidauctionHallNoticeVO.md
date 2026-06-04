---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.CpuBidauctionHallNoticeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍大厅公告表 (`bcsourcing.bidauctionHall.CpuBidauctionHallNoticeVO`)

> ycSouring | 物理表：`cpu_bidauction_hall_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍大厅公告表 |
| 物理表 | `cpu_bidauction_hall_notice` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:45:09.2510` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidauctionRuleId` | 竞拍规则表主表id | `bidauction_rule_id` | 6dc4b46c-19d3-4af2-bb73-6684309d3422 |
| 2 | `billId` | 标段id | `billId` | Long |
| 3 | `billNoticeId` | 业务单据公告id | `bill_notice_id` | Long |
| 4 | `billSegment` | 单据环节 | `bill_segment` | String |
| 5 | `billSource` | 单据来源 | `bill_source` | String |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `dr` | dr | `dr` | Short |
| 8 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 9 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 10 | `hallId` | 竞价子厅id | `hall_id` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 11 | `id` | ID | `id` | Long |
| 12 | `noticeType` | 公告类型 | `noticeType` | String |
| 13 | `publishTime` | 公告发布时间 | `publish_time` | DateTime |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `title` | 公告名称 | `title` | String |
| 16 | `ts` | 默认值 | `ts` | DateTime |
| 17 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidauctionRuleId` | 竞拍规则表主表id | `bcsourcing.bidauctionHall.CpuBidauctionRuleVO` | None |  |
| 2 | `hallId` | 竞价子厅id | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
