---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planscheme.PlanSchemeOrg"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 组织范围 (`mr.planscheme.PlanSchemeOrg`)

> MR | 物理表：`mr_plan_scheme_org`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 组织范围 |
| 物理表 | `mr_plan_scheme_org` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:13.3330` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `pubts` | 时间戳 | `pubts` | DateTime |
| 3 | `schemeId` | 计划方案id | `scheme_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 4 | `stockOrgId` | 库存组织 | `stock_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `stockOrgId` | 库存组织 | `org.func.BaseOrg` | Service |  |
| 3 | `schemeId` | 计划方案id | `mr.planscheme.PlanScheme` | None | true |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
