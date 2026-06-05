---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SoReport"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工单汇报子表 (`pes.sos.SoReport`)

> IMP_PES | 物理表：`sms_so_report`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工单汇报子表 |
| 物理表 | `sms_so_report` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:20.2160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `address` | 详细地址 | `address` | String |
| 2 | `endReportDate` | 汇报结束时间 | `end_reportdate` | String |
| 3 | `fileList` | 附件 | `file_list` | String |
| 4 | `log` | 经度 | `log` | String |
| 5 | `lot` | 纬度 | `lot` | String |
| 6 | `memo` | 描述 | `memo` | String |
| 7 | `regionId` | 区域ID | `region_id` | 95577e23-979f-4f09-a629-61fea93e576d |
| 8 | `reporter` | 汇报人 | `reporter` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 9 | `reportTime` | 汇报时间 | `report_time` | Date |
| 10 | `reportType` | 汇报类型 | `report_type` | String |
| 11 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 12 | `startReportDate` | 汇报开始时间 | `start_reportdate` | String |
| 13 | `workingHours` | 工时 | `working_hours` | Decimal |
| 14 | `tenant` | 租户ID | `tenant_id` | String |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `id` | ID | `id` | Long |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `userDefineCharacter` | 自定义项特征 | `user_define_character` | 3c17063a-0152-48b2-a979-f61dce05b210 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `soId` | 工单Id | `pes.sos.SmsSos` | None | true |
| 2 | `userDefineCharacter` | 自定义项特征 | `pes.sos.SmsSoReportDefineCharacter` | None |  |
| 3 | `regionId` | 区域ID | `bd.region.BaseRegionVO` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `reporter` | 汇报人 | `bd.staff.Staff` | Service |  |
