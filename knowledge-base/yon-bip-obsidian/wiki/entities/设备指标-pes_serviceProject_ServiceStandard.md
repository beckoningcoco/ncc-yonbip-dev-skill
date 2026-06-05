---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceProject.ServiceStandard"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 设备指标 (`pes.serviceProject.ServiceStandard`)

> IMP_PES | 物理表：`sms_stds`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 设备指标 |
| 物理表 | `sms_stds` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:25.9420` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
| 3 | `valueTypeId` | 指标值类型 | `value_type_id` | String |
| 4 | `equOperationStatus` | 设备运行状态 | `equ_operation_status` | Integer |
| 5 | `operatorId` | 比较符 | `operator_id` | String |
| 6 | `valueStd` | 标准值 | `value_std` | Decimal |
| 7 | `valueMax` | 指标上限 | `value_max` | Decimal |
| 8 | `valueMin` | 指标下限 | `value_min` | Decimal |
| 9 | `uomId` | 单位ID | `uom_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 10 | `isVisible` | 标准值显示 | `is_visible` | Boolean |
| 11 | `isEffective` | 启用状态 | `is_effective` | Boolean |
| 12 | `isRequired` | 实际值必填 | `is_required` | Integer |
| 13 | `memo` | 备注 | `memo` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `creator` | 创建人 | `creator` | String |
| 16 | `createUser` | 创建者 | `create_user` | String |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime |
| 18 | `createDate` | 创建日期 | `create_date` | Date |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `modifier` | 修改人 | `modifier` | String |
| 21 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 24 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 25 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 26 | `isResultDefault` | 执行结果默认值 | `is_result_default` | Integer |
| 27 | `id` | ID | `id` | String |
| 28 | `dr` | 逻辑删除 | `dr` | Integer |
| 29 | `tenant` | 租户ID | `tenant_id` | String |
| 30 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime |
| 32 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `uomId` | 单位ID | `pc.unit.Unit` | Service |  |
| 5 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
