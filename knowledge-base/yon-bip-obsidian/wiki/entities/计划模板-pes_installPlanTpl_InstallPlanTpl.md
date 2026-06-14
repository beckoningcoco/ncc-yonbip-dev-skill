---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.installPlanTpl.InstallPlanTpl"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划模板 (`pes.installPlanTpl.InstallPlanTpl`)

> IMP_PES | 物理表：`sms_install_template`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划模板 |
| 物理表 | `sms_install_template` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:36.1330` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `name` | String | 名称 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 创建组织id | `create_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `equipmentType` | 设备类别id | `equipment_type` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 3 | `name` | 名称 | `name` | String |
| 4 | `enable` | 启用状态 | `enable` | Boolean |
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
| 16 | `autoPlan` | 自动安装计划 | `auto_plan` | Boolean |
| 17 | `id` | id | `id` | String |
| 18 | `transactionType` | 交易类型 | `transaction_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 19 | `dr` | 逻辑删除 | `dr` | Integer |
| 20 | `tenant` | 租户ID | `tenant_id` | String |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `ts` | 版本号 | `ts` | String |
| 24 | `installPlanTplList` | 安装作业 | `` | 2deaf02f-ff10-4f16-8d1a-367dc366f2f7 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transactionType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `installPlanTplList` | 安装作业 | `pes.installPlanTpl.InstallJobsChild` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `equipmentType` | 设备类别id | `ampub.ambase.CategoryVO` | Service |  |
| 7 | `orgId` | 创建组织id | `org.func.BaseOrg` | Service |  |
