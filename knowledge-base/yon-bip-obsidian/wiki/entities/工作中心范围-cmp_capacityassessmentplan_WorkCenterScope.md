---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityassessmentplan.WorkCenterScope"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工作中心范围 (`cmp.capacityassessmentplan.WorkCenterScope`)

> DCRP | 物理表：`cmp_work_center_scope`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工作中心范围 |
| 物理表 | `cmp_work_center_scope` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:57.8420` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `workCenterScope` | 工作中心 | `work_center_scope` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 5 | `planId` | 能力评估方案 | `plan_id` | 041020b1-3648-445c-9ed9-4343313ab927 |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `planId` | 能力评估方案 | `cmp.capacityassessmentplan.CapacityAssessmentPlan` | None | true |
| 3 | `workCenterScope` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
