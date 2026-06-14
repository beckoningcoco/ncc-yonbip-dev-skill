---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.installJob.InstallJob"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 安装作业 (`pes.installJob.InstallJob`)

> IMP_PES | 物理表：`sms_installation_jobs`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 安装作业 |
| 物理表 | `sms_installation_jobs` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:37.5800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `Code` | String |
| 2 | `name` | 名称 | `Name` | String |
| 3 | `remarks` | 安装作业描述 | `Remarks` | String |
| 4 | `smsProjectsId` | 服务项目id | `sms_projects_id` | 80e2a9ee-50bc-440b-97c0-694cf5697ccc |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `creator` | 创建人名称 | `creator` | String |
| 7 | `createUser` | 创建者 | `create_user` | String |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 16 | `lineNumber` | 行号 | `line_number` | Integer |
| 17 | `orgId` | 组织ID | `Org_ID` | 14302233-1394-4a70-94e1-bed51636f312 |
| 18 | `templateId` | 安装作业模板id | `template_id` | String |
| 19 | `installAssignmentId` | 安装作业标准分配id | `install_assignment_id` | String |
| 20 | `description` | 描述 | `description` | String |
| 21 | `id` | ID | `id` | String |
| 22 | `dr` | 逻辑删除 | `dr` | Integer |
| 23 | `tenant` | 租户ID | `tenant_id` | String |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |
| 26 | `ts` | 版本号 | `ts` | String |
| 27 | `disablets` | 停用时间 | `disablets` | DateTime |
| 28 | `enable` | 启用 | `enable` | sys_intboolean |
| 29 | `enablets` | 启用时间 | `enablets` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `smsProjectsId` | 服务项目id | `pes.serviceProject.ServiceProject` | None |  |
| 5 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
