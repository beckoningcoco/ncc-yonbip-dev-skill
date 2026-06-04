---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.BidauctionHallControlVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍控制表 (`bcsourcing.bidauctionHall.BidauctionHallControlVO`)

> ycSouring | 物理表：`cpu_bidauction_hall_control`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍控制表 |
| 物理表 | `cpu_bidauction_hall_control` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:42:48.4870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `dr` | dr | `dr` | Short |
| 4 | `enterpriseId` | 采购商ID | `enterprise_id` | Long |
| 5 | `enterpriseName` | 采购商名称 | `enterprise_name` | String |
| 6 | `fixedRanking` | 固定名次 | `fixed_ranking` | Integer |
| 7 | `gatherHallId` | 主大厅id | `gather_hall_id` | 35362db2-287c-4497-8f9d-ae4ce4c9de77 |
| 8 | `hallId` | 竞价子厅id | `hall_id` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 9 | `id` | ID | `id` | Long |
| 10 | `noticeCount` | 已通知次数 | `notice_count` | Integer |
| 11 | `publishAll` | 公布全部 | `publish_all` | Boolean |
| 12 | `publishContent` | 公告内容项 | `publish_content` | String |
| 13 | `publishEndRanking` | 公布范围结束 | `publish_end_ranking` | Integer |
| 14 | `publishStartRanking` | 公布范围起始 | `publish_start_ranking` | Integer |
| 15 | `triggerCount` | 触发次数 | `trigger_count` | Integer |
| 16 | `ts` | 默认值 | `ts` | DateTime |
| 17 | `version` | 版本号 | `version` | Integer |
| 18 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `hallId` | 竞价子厅id | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `gatherHallId` | 主大厅id | `bcsourcing.bidauctionHall.BidauctionMainHallVO` | None |  |
