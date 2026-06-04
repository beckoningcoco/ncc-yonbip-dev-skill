---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.announcement.LawbidAnnouncementChannel"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购公告外部发布渠道 (`lawbid.announcement.LawbidAnnouncementChannel`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_announcement_channel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购公告外部发布渠道 |
| 物理表 | `cpu_bid_announcement_channel` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:21.3730` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:48:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `announcementId` | 公告ID | `announcement_id` | c8caefa3-7f5b-4560-bb77-c2962503e2df |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `channelCode` | 发布渠道编码 | `channel_code` | String |
| 4 | `channelId` | 发布渠道ID | `channel_id` | 754d1115-1be9-405b-9511-a78c64c73d1e |
| 5 | `channelName` | 发布渠道名称 | `channel_name` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `id` | ID | `id` | Long |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `announcementId` | 公告ID | `lawbid.announcement.LawbidAnnouncement` | None | true |
| 3 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `channelId` | 发布渠道ID | `tender.cebitem.TenderPlatformConfig` | Service |  |
