---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.CpuBidauctionHallMsgVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞价大厅聊天表 (`bcsourcing.bidauctionHall.CpuBidauctionHallMsgVO`)

> ycSouring | 物理表：`cpu_bidauction_hall_msg`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞价大厅聊天表 |
| 物理表 | `cpu_bidauction_hall_msg` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:42:44.3130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `answerEnterpriseId` | 回复人的租户id | `answer_enterprise_id` | Long |
| 2 | `answerEnterpriseName` | 回复的租户名称 | `answer_enterprise_name` | String |
| 3 | `dr` | dr | `dr` | Short |
| 4 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 5 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 6 | `hallId` | 竞价大厅id | `hall_id` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 7 | `id` | ID | `id` | Long |
| 8 | `messageContent` | 消息内容 | `message_content` | String |
| 9 | `pubSupply` | 公开发布给供应商 | `pub_supply` | Boolean |
| 10 | `sendTime` | 消息发送时间 | `send_time` | DateTime |
| 11 | `ts` | 默认值 | `ts` | DateTime |
| 12 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `hallId` | 竞价大厅id | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
