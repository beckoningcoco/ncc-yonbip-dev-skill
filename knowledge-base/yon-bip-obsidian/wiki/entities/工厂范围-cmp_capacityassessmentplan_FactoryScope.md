---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityassessmentplan.FactoryScope"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工厂范围 (`cmp.capacityassessmentplan.FactoryScope`)

> DCRP | 物理表：`cmp_factory_scope`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工厂范围 |
| 物理表 | `cmp_factory_scope` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:53.8330` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `planId` | 能力评估方案 | `plan_id` | 041020b1-3648-445c-9ed9-4343313ab927 |
| 4 | `factoryId` | 工厂 | `factory_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `factoryId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 3 | `planId` | 能力评估方案 | `cmp.capacityassessmentplan.CapacityAssessmentPlan` | None | true |
