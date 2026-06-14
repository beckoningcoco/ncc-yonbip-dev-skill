---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.constraint.CmponstraintScope"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 换产约束范围 (`cmp.constraint.CmponstraintScope`)

> DCRP | 物理表：`cmp_constraint_scope`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 换产约束范围 |
| 物理表 | `cmp_constraint_scope` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:18.3060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 工厂 | `org_id` | dcff4710-92a6-4b3a-85c0-553ad21aabc3 |
| 4 | `constraintId` | 约束ID | `constraint_id` | 2818292f-74e8-4f44-945f-ce856f03c73c |
| 5 | `constraintType` | 约束类型 | `constraint_type` | String |
| 6 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 7 | `productionLineId` | 生产线ID | `prod_line_id` | 651a9072-79c8-4f70-af37-2eed7063affe |
| 8 | `bussinessKey` | 业务主键 | `bussiness_key` | String |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `constraintId` | 约束ID | `cmp.constraint.ChangeOverConstraint` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 4 | `productionLineId` | 生产线ID | `ed.productionline.ProductionLine` | Service |  |
| 5 | `orgId` | 工厂 | `org.func.FactoryOrg` | Service |  |
