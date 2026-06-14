---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPACalendar"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工作日历临时表 (`mr.rpadata.RPACalendar`)

> MR | 物理表：`mr_rpa_calendar`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工作日历临时表 |
| 物理表 | `mr_rpa_calendar` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:04.3810` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `calendarId` | 日历ID | `calendar_id` | Long |
| 2 | `calendarName` | 日历名称 | `calendar_name` | String |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `date` | 非工作日 | `date` | DateTime |
| 8 | `docOrgId` | 组织档案 | `doc_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 9 | `dr` | 删除 | `dr` | Integer |
| 10 | `id` | ID | `id` | Long |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 16 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 17 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 20 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 21 | `year` | 年度 | `year` | Integer |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `docOrgId` | 组织档案 | `aa.baseorg.OrgMV` | Service |  |
| 2 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 7 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
