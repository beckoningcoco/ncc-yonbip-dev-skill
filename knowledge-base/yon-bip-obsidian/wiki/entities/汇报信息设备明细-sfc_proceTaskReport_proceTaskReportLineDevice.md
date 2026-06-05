---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.proceTaskReport.proceTaskReportLineDevice"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 汇报信息设备明细 (`sfc.proceTaskReport.proceTaskReportLineDevice`)

> IMPSFC | 物理表：`imp_sfc_procetaskrep_device`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇报信息设备明细 |
| 物理表 | `imp_sfc_procetaskrep_device` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:26:14.9430` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `actualPrepareTime` | 实际准备工时 | `actual_prepare_time` | Decimal |
| 2 | `actualProcessTime` | 实际加工工时 | `actual_process_time` | Decimal |
| 3 | `deviceId` | 设备id | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `id` | ID | `id` | Long |
| 6 | `lineno` | 行号 | `lineno` | Decimal |
| 7 | `mainId` | 工序任务汇报id | `main_id` | 5b6b44a2-42c1-49e8-9351-f34ff6838c71 |
| 8 | `proceTaskLineId` | 工序任务汇报信息ID | `proce_task_line_id` | de66617d-1de0-4dca-8844-cfc180a45de8 |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `rowno` | 序号 | `rowno` | Integer |
| 11 | `selfDefineCharacter` | 工序任务汇报设备自定义项 | `self_define_character` | 678d01d0-44d6-428e-a6f4-8ccdf2f2b9ba |
| 12 | `timeType` | 工时类别 | `time_type` | Short |
| 13 | `userId` | 人员id | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `selfDefineCharacter` | 工序任务汇报设备自定义项 | `sfc.proceTaskReport.ProcTaskReportDeviceSelfDefineCharacter` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `proceTaskLineId` | 工序任务汇报信息ID | `sfc.proceTaskReport.proceTaskReportLine` | None | true |
| 4 | `mainId` | 工序任务汇报id | `sfc.proceTaskReport.proceTaskReport` | None |  |
| 5 | `deviceId` | 设备id | `aim.equip.EquipHeadVO` | Service |  |
| 6 | `userId` | 人员id | `bd.staff.Staff` | Service |  |
