---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.procPlan.ProcPlanDispatch"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序作业计划派工信息 (`sfc.procPlan.ProcPlanDispatch`)

> IMPSFC | 物理表：`imp_sfc_plan_dispatch`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序作业计划派工信息 |
| 物理表 | `imp_sfc_plan_dispatch` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:24:11.7140` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `id` | ID | `id` | Long |
| 3 | `procPlanId` | 工序作业计划 | `proc_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `rowno` | 序号 | `rowno` | Integer |
| 6 | `shiftId` | 班次 | `shift_id` | 566d5ab9-aeca-4f63-a0d1-1b98a161c6bc |
| 7 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 8 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `deviceId` | 设备ID | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 11 | `staffId` | 人员ID | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 12 | `dispatchNum` | 分派数量 | `dispatch_num` | Decimal |
| 13 | `scheduleStartTime` | 计划开工时间 | `schedule_start_time` | DateTime |
| 14 | `scheduleEndTime` | 计划完工时间 | `schedule_end_time` | DateTime |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `shiftId` | 班次 | `calendar.platformShift.PlatformShift` | Service |  |
| 2 | `procPlanId` | 工序作业计划 | `sfc.procPlan.ProcPlan` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 5 | `deviceId` | 设备ID | `aim.equip.EquipHeadVO` | Service |  |
| 6 | `staffId` | 人员ID | `bd.staff.Staff` | Service |  |
| 7 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
