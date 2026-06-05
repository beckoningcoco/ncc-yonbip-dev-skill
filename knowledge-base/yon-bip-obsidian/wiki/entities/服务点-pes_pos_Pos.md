---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.pos.Pos"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务点 (`pes.pos.Pos`)

> IMP_PES | 物理表：`sms_pos`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务点 |
| 物理表 | `sms_pos` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:59.1100` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（40个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `smspospersonsList` | 服务点人员 | `` | 8e2531a1-f353-4fbe-8add-cd21fee6307d |
| 2 | `serviceOrgId` | 服务组织 | `service_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 3 | `code` | 编码 | `code` | String |
| 4 | `name` | 名称 | `name` | String |
| 5 | `posType` | 服务点类型 | `pos_type` | String |
| 6 | `posTypeName` | 服务类型名称 | `pos_type_name` | String |
| 7 | `providerId` | 服务供应商 | `provider_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 8 | `provider` | 提供方 | `provider` | String |
| 9 | `personId` | 负责人 | `person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 10 | `deptId` | 负责部门 | `dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 11 | `address` | 详细地址 | `address` | String |
| 12 | `phone` | 联系电话 | `phone` | String |
| 13 | `memo` | 备注 | `memo` | String |
| 14 | `isEffective` | 生效 | `is_effective` | Integer |
| 15 | `log` | 经度 | `log` | String |
| 16 | `lot` | 纬度 | `lot` | String |
| 17 | `country` | 国家 | `country` | String |
| 18 | `province` | 省份 | `province` | String |
| 19 | `city` | 城市 | `city` | String |
| 20 | `district` | 区域 | `district` | 95577e23-979f-4f09-a629-61fea93e576d |
| 21 | `street` | 街道 | `street` | String |
| 22 | `userDefineCharacter` | 自定义项特征 | `user_define_character` | 05aa3dc0-2ab8-484e-8add-f349f06a573b |
| 23 | `id` | ID | `id` | String |
| 24 | `dr` | DR | `dr` | Short |
| 25 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 26 | `createTime` | 创建时间 | `create_time` | DateTime |
| 27 | `createDate` | 创建日期 | `create_date` | Date |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 30 | `creator` | 创建人名称 | `creator` | String |
| 31 | `modifier` | 修改人名称 | `modifier` | String |
| 32 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 33 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 34 | `tenant` | 租户ID | `tenant_id` | String |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 36 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 37 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 38 | `createUser` | 创建者 | `create_user` | String |
| 39 | `ts` | 版本号 | `ts` | String |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `userDefineCharacter` | 自定义项特征 | `pes.pos.SmsPosDefineCharacter` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `providerId` | 服务供应商 | `aa.vendor.Vendor` | Service |  |
| 4 | `district` | 区域 | `bd.region.BaseRegionVO` | Service |  |
| 5 | `deptId` | 负责部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `serviceOrgId` | 服务组织 | `org.func.BaseOrg` | Service |  |
| 9 | `personId` | 负责人 | `bd.staff.Staff` | Service |  |
| 10 | `smspospersonsList` | 服务点人员 | `pes.pos.PosPerson` | None | true |
| 11 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
