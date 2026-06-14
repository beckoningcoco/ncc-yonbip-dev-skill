---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.servicelevel.ServiceLevelVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务级别 (`pes.servicelevel.ServiceLevelVO`)

> IMP_PES | 物理表：`sms_serlevel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务级别 |
| 物理表 | `sms_serlevel` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:45.9190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
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
| 15 | `id` | ID | `id` | String |
| 16 | `dr` | 逻辑删除 | `dr` | Integer |
| 17 | `tenant` | 租户ID | `tenant_id` | String |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
