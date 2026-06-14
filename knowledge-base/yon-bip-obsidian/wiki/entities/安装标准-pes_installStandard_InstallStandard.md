---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.installStandard.InstallStandard"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 安装标准 (`pes.installStandard.InstallStandard`)

> IMP_PES | 物理表：`sms_stand_assignment`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 安装标准 |
| 物理表 | `sms_stand_assignment` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:47.2540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
| 3 | `standClassification` | 标准分类 | `stand_classification` | String |
| 4 | `serverType` | 服务类型ID | `server_type` | 792f6d8f-bf3b-4090-ac4d-a7f2e9230758 |
| 5 | `equipmentCategoryId` | 设备类型ID | `equipment_category_id` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 6 | `installJobId` | 安装作业id | `install_job_id` | eb52c260-ba96-4244-9393-e7325b3f163a |
| 7 | `enable` | 启用状态 | `enable` | Boolean |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `creator` | 创建人名称 | `creator` | String |
| 10 | `createUser` | 创建者 | `create_user` | String |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 19 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 20 | `id` | ID | `id` | String |
| 21 | `dr` | 逻辑删除 | `dr` | Integer |
| 22 | `tenant` | 租户ID | `tenant_id` | String |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `ts` | 版本号 | `ts` | String |
| 26 | `standardAssignmentIdList` | 安装标准子表 | `` | ce37cc99-8c8e-4992-badb-5739e1af5fa6 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `standardAssignmentIdList` | 安装标准子表 | `pes.installStandard.InstallStandardLine` | None | true |
| 2 | `equipmentCategoryId` | 设备类型ID | `ampub.ambase.CategoryVO` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `serverType` | 服务类型ID | `pes.tos.Tos` | None |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `installJobId` | 安装作业id | `pes.installJob.InstallJob` | None |  |
| 8 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
