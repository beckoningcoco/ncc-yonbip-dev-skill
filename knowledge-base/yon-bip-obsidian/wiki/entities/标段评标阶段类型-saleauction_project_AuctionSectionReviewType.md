---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.project.AuctionSectionReviewType"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 标段评标阶段类型 (`saleauction.project.AuctionSectionReviewType`)

> ycAuction | 物理表：`cpu_project_section_reviewtype`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标段评标阶段类型 |
| 物理表 | `cpu_project_section_reviewtype` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycAuction` |
| 构建时间 | `2026-06-04 23:45:30.6150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidStageId` | 阶段id | `bid_stage_id` | d066e210-edd3-4f46-a5f5-3aeb7e046c55 |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `id` | ID | `id` | Long |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `reviewTypeCode` | 评分类型编码 | `review_type_code` | String |
| 8 | `reviewTypeId` | 评分类型ID | `review_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |
| 9 | `reviewTypeName` | 评分类型 | `review_type_name` | String |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `bidStageId` | 阶段id | `saleauction.project.AuctionSectionStage` | None | true |
| 4 | `reviewTypeId` | 评分类型ID | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
