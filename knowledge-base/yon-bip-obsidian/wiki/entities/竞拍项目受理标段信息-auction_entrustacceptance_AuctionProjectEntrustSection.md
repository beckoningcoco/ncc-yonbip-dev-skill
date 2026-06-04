---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.entrustacceptance.AuctionProjectEntrustSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍项目受理标段信息 (`auction.entrustacceptance.AuctionProjectEntrustSection`)

> ycSouringAuction | 物理表：`cpu_project_section_apt_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍项目受理标段信息 |
| 物理表 | `cpu_project_section_apt_record` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:58.0480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键ID | `id` | Long |
| 2 | `bidSectionId` | 标段ID | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 3 | `AuctionSystemId` | 原始ID | `lawbid_system_id` | Long |
| 4 | `AuctionSystemType` | 原始表 | `lawbid_system_type` | String |
| 5 | `bidProjectId` | 竞拍项目受理ID | `bid_project_id` | 112566c3-981c-47e7-a9f9-701d0dccf82e |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `tenantId` | tenant租户 | `tenant_id` | String |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `bidProjectId` | 竞拍项目受理ID | `auction.entrustacceptance.AuctionProjectEntrust` | None | true |
| 4 | `bidSectionId` | 标段ID | `auction.project.AuctionSection` | None |  |
