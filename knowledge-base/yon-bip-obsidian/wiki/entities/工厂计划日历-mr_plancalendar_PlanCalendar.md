---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.plancalendar.PlanCalendar"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工厂计划日历 (`mr.plancalendar.PlanCalendar`)

> MR | 物理表：`mr_plan_calendar`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工厂计划日历 |
| 物理表 | `mr_plan_calendar` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:25.0730` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 计划组织ID | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `factoryOrgId` | 工厂组织id | `factory_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 6 | `planningCalendar` | 计划日历id | `planning_calendar` | String |
| 7 | `planningCalendarName` | 计划日历 | `planning_calendar_name` | String |
| 8 | `remark` | 备注 | `remark` | String |
| 9 | `datasub` | 应用来源 | `datasub` | String |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `creator` | 创建人 | `creator` | String |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifier` | 修改人 | `modifier` | String |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `orgId` | 计划组织ID | `aa.baseorg.OrgMV` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 6 | `factoryOrgId` | 工厂组织id | `aa.baseorg.OrgMV` | Service |  |
