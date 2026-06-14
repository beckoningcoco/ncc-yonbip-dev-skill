---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.installStandard.InstallStandardLine"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 安装标准子表 (`pes.installStandard.InstallStandardLine`)

> IMP_PES | 物理表：`sms_child_stand`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 安装标准子表 |
| 物理表 | `sms_child_stand` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:47.9220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `serverId` | 服务标准ID | `server_id` | 98445ec1-4f62-4ff1-8586-5f434484ce2e |
| 2 | `isEffective` | 启用状态 | `is_effective` | Integer |
| 3 | `memo` | 备注 | `memo` | String |
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
| 15 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 16 | `standardAssignmentId` | 安装标准 | `standard_assignment_id` | 64ca3661-a2e6-4df4-b64f-00ba5bc77383 |
| 17 | `valueTypeId` | 指标值类型 | `value_type_id` | String |
| 18 | `operatorId` | 比较符 | `operator_id` | String |
| 19 | `valueStd` | 标准值 | `value_std` | Decimal |
| 20 | `valueMax` | 指标上限 | `value_max` | Decimal |
| 21 | `valueMin` | 指标下限 | `value_min` | Decimal |
| 22 | `uomId` | 单位 | `uom_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 23 | `id` | ID | `id` | String |
| 24 | `dr` | 逻辑删除 | `dr` | Integer |
| 25 | `tenant` | 租户ID | `tenant_id` | String |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime |
| 28 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `standardAssignmentId` | 安装标准 | `pes.installStandard.InstallStandard` | None | true |
| 5 | `uomId` | 单位 | `pc.unit.Unit` | Service |  |
| 6 | `serverId` | 服务标准ID | `pes.serviceProject.ServiceStandard` | None |  |
| 7 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
