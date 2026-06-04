---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.announcement.AuctionAnnouncementQualify"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 发标资格审核条件 (`saleauction.announcement.AuctionAnnouncementQualify`)

> ycAuction | 物理表：`cpu_bid_pjt_qualify`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发标资格审核条件 |
| 物理表 | `cpu_bid_pjt_qualify` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycAuction` |
| 构建时间 | `2026-06-04 23:44:39.9590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 3 | `announcementId` | 公告主表ID | `announcement_id` | ba0cbbbd-ef81-4f06-9fb0-e40a40cde1fa |
| 4 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `bidSectionId` | 标段包Id | `bid_section_id` | 052621d8-fde7-4ab0-94bf-b179c720ce6d |
| 6 | `qualifyId` | 资质id | `qualify_id` | Long |
| 7 | `qualifyNo` | 资质编码 | `qualify_no` | String |
| 8 | `qualifyName` | 资质名称 | `qualify_name` | String |
| 9 | `qualifyExplain` | 资质描述 | `qualify_explain` | String |
| 10 | `isMustUpload` | 是否必须上传 | `is_must_upload` | Short |
| 11 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 14 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 15 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `announcementId` | 公告主表ID | `saleauction.announcement.AuctionAnnouncement` | None | true |
| 3 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `bidSectionId` | 标段包Id | `saleauction.project.AuctionSection` | None |  |
