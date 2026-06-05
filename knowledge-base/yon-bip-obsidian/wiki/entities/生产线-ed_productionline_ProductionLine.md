---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.productionline.ProductionLine"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产线 (`ed.productionline.ProductionLine`)

> ED | 物理表：`ed_prod_line`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产线 |
| 物理表 | `ed_prod_line` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:33:16.2500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `deptId` | 所属部门 | `dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 7 | `id` | ID | `id` | Long |
| 8 | `memo` | 备注 | `memo` | String |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `name` | 名称 | `name` | String |
| 14 | `orgId` | 组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 15 | `outputUnit` | 产量单位 | `output_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 16 | `powerUnitType` | 能力单位类型 | `power_unit_type` | String |
| 17 | `productionLineDct` | 自定义项特征属性组 | `production_line_dct` | f9f249ed-b18c-4047-b7f8-c3814a16847d |
| 18 | `productionRate` | 生产速率 | `production_rate` | Decimal |
| 19 | `productionRateUnit` | 生产速率单位 | `production_rate_unit` | String |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `standardOutput` | 标准产量 | `standard_output` | Decimal |
| 22 | `stopstatus` | 停用状态 | `stopstatus` | Boolean |
| 23 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 24 | `timeUnit` | 时间单位 | `time_uint` | String |
| 25 | `workCalendar` | 工作日历 | `work_calendar` | String |
| 26 | `workCalendarName` | 工作日历名称 | `work_calendar_name` | String |
| 27 | `workTime` | 工作时间 | `work_time` | Decimal |
| 28 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `outputUnit` | 产量单位 | `pc.unit.Unit` | Service |  |
| 3 | `deptId` | 所属部门 | `aa.baseorg.DeptMV` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `productionLineDct` | 自定义项特征属性组 | `ed.productionline.ProductionLineDct` | None |  |
| 7 | `orgId` | 组织 | `aa.baseorg.OrgMV` | Service |  |
