---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.project.AuctionProjectSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍项目标段信息 (`auction.project.AuctionProjectSection`)

> ycSouringAuction | 物理表：`cpu_project_section_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍项目标段信息 |
| 物理表 | `cpu_project_section_record` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:59.3090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `AuctionSystemId` | 原始ID | `lawbid_system_id` | Long |
| 2 | `AuctionSystemType` | 原始表 | `lawbid_system_type` | String |
| 3 | `bidProjectId` | 竞拍项目ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `id` | 主键ID | `id` | Long |
| 10 | `bidSectionId` | 标段ID | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 11 | `tenantId` | tenant租户 | `tenant_id` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `bidProjectId` | 竞拍项目ID | `auction.project.AuctionProject` | None | true |
| 4 | `bidSectionId` | 标段ID | `auction.project.AuctionSection` | None |  |
