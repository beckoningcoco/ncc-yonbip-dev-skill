---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.installPlanTpl.InstallJobsChild"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 安装作业 (`pes.installPlanTpl.InstallJobsChild`)

> IMP_PES | 物理表：`sms_installation_jobs_child`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 安装作业 |
| 物理表 | `sms_installation_jobs_child` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:46.4960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `code` | eb52c260-ba96-4244-9393-e7325b3f163a | 安装作业id |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lineNumber` | 行号 | `line_number` | Decimal |
| 2 | `code` | 安装作业id | `code` | eb52c260-ba96-4244-9393-e7325b3f163a |
| 3 | `installAssignmentId` | 安装作业标准分配id | `install_assignment_id` | 64ca3661-a2e6-4df4-b64f-00ba5bc77383 |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `createUser` | 创建者 | `create_user` | String |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 15 | `templateId` | 计划模板id | `template_id` | 8b360e39-a263-4733-b5c3-c5f5bf99cb47 |
| 16 | `name` | 名称 | `name` | String |
| 17 | `description` | 安装作业描述 | `description` | String |
| 18 | `remarks` | 备注 | `remarks` | String |
| 19 | `id` | id | `id` | String |
| 20 | `dr` | 逻辑删除 | `dr` | Integer |
| 21 | `tenant` | 租户ID | `tenant_id` | String |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `installAssignmentId` | 安装作业标准分配id | `pes.installStandard.InstallStandard` | None |  |
| 2 | `code` | 安装作业id | `pes.installJob.InstallJob` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `templateId` | 计划模板id | `pes.installPlanTpl.InstallPlanTpl` | None | true |
