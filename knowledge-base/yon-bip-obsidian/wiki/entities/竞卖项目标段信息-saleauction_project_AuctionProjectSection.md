---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.project.AuctionProjectSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞卖项目标段信息 (`saleauction.project.AuctionProjectSection`)

> ycAuction | 物理表：`cpu_project_section_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞卖项目标段信息 |
| 物理表 | `cpu_project_section_record` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycAuction` |
| 构建时间 | `2026-06-04 23:45:23.8940` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键ID | `id` | Long |
| 2 | `bidSectionId` | 标段ID | `bid_section_id` | 052621d8-fde7-4ab0-94bf-b179c720ce6d |
| 3 | `AuctionSystemId` | 原始ID | `lawbid_system_id` | Long |
| 4 | `AuctionSystemType` | 原始表 | `lawbid_system_type` | String |
| 5 | `bidProjectId` | 竞卖项目ID | `bid_project_id` | 9f8b9356-4cd6-4ae7-8dc0-c84dfecdda07 |
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
| 3 | `bidProjectId` | 竞卖项目ID | `saleauction.project.AuctionProject` | None | true |
| 4 | `bidSectionId` | 标段ID | `saleauction.project.AuctionSection` | None |  |
