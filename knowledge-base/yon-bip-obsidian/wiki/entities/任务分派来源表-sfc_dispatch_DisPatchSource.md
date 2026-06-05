---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.dispatch.DisPatchSource"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 任务分派来源表 (`sfc.dispatch.DisPatchSource`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_source`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务分派来源表 |
| 物理表 | `imp_sfc_proc_plan_source` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:35.3070` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `procPlanId` | 任务分派ID | `proc_plan_id` | 651c34e4-a23e-4bfd-89a7-f53f5d51e14e |
| 2 | `sourceType` | 来源单据类型 | `source_type` | String |
| 3 | `sourceId` | 来源单据 | `source_id` | String |
| 4 | `sourceLineNo` | 来源单据行 | `source_line_no` | String |
| 5 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 6 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 7 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 8 | `num` | 数量 | `num` | Decimal |
| 9 | `num1` | 件数 | `num1` | Decimal |
| 10 | `num2` | 数量(产出) | `num2` | Decimal |
| 11 | `groupKey` | 分组标识 | `group_key` | Long |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 15 | `rowno` | 行号 | `rowno` | Integer |
| 16 | `id` | ID | `id` | Long |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `procPlanId` | 任务分派ID | `sfc.dispatch.DisPatch` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 4 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 6 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
