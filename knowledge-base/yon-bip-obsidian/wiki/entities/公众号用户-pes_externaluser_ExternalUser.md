---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.externaluser.ExternalUser"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 公众号用户 (`pes.externaluser.ExternalUser`)

> IMP_PES | 物理表：`pes_ss_external_user`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公众号用户 |
| 物理表 | `pes_ss_external_user` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:21.1720` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `equipmentId` | 设备ID | `equipment_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 6 | `id` | ID | `id` | Long |
| 7 | `memo` | 备注 | `memo` | String |
| 8 | `modifier` | 修改人名称 | `modifier` | String |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `name` | 用户名 | `name` | String |
| 13 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 14 | `phone` | 手机号 | `phone` | String |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `srcAppId` | 来源应用id | `src_app_id` | String |
| 17 | `srcAppName` | 来源应用名称 | `src_app_name` | String |
| 18 | `srcAppType` | 来源类型 | `src_app_type` | String |
| 19 | `srcOpenid` | 微信id | `src_openid` | String |
| 20 | `stopstatus` | 停用状态 | `stopstatus` | Boolean |
| 21 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 22 | `tenant` | 租户ID | `tenant_id` | String |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `equipmentId` | 设备ID | `aim.equip.EquipHeadVO` | Service |  |
| 5 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
