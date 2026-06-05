---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.procPlan.ProcPlanStaff"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序作业计划人员 (`sfc.procPlan.ProcPlanStaff`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_device`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序作业计划人员 |
| 物理表 | `imp_sfc_proc_plan_device` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:24:24.0320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `deviceId` | 设备id | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `id` | ID | `id` | Long |
| 4 | `lineno` | 行号 | `lineno` | Decimal |
| 5 | `procPlanDetailId` | 工序作业计划明细 | `proc_plan_detail_id` | 7e33a4bf-edce-447c-8e6f-0717cec2b092 |
| 6 | `procPlanId` | 工序作业计划id | `proc_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `rowno` | 序号 | `rowno` | Integer |
| 9 | `staffId` | 人员id | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `procPlanId` | 工序作业计划id | `sfc.procPlan.ProcPlan` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `deviceId` | 设备id | `aim.equip.EquipHeadVO` | Service |  |
| 4 | `procPlanDetailId` | 工序作业计划明细 | `sfc.procPlan.ProcPlanDetail` | None |  |
| 5 | `staffId` | 人员id | `bd.staff.Staff` | Service |  |
