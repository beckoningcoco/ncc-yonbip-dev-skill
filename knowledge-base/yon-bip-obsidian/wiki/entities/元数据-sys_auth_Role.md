---
tags: [BIP, 元数据, 数据字典, sys.auth.Role]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 角色 (`sys.auth.Role`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`role` | domain：`u8c-auth` | 应用：`GZTACT` | 业务对象ID：`2e637139-d6fa-4100-8600-e0b02a65bee9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 角色 |
| 物理表 | `role` |
| domain/服务域 | `u8c-auth` |
| schema | `iuap_apcom_auth` |
| 所属应用 | `GZTACT` |
| 直连字段 | 48 个 |
| 子表 | 5 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rolekanbans` | `sys.auth.RoleKanBan` | composition |
| `auths` | `sys.auth.RoleAuth` | composition |
| `groups` | `sys.auth.RoleGroupRelation` | composition |
| `marks` | `sys.auth.MarkRole` | composition |
| `rolesensdatas` | `sys.auth.RoleSensData` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `tenantcenter_id` | `` |
| `` | `` |
| `org_id` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |
| `group_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 48 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 角色id |
| `org_name` | `org_name` | `orgName` | 组织 |
| `code` | `code` | `code` | 角色编码 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `creator` | `creator` | `creator` | 创建人 |
| `label` | `label` | `label` | 标签 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `multilingual_desc2` | `multilingual_desc2` | `multilingualDesc2` | 备注多语2 |
| `multilingual_desc3` | `multilingual_desc3` | `multilingualDesc3` | 备注多语3 |
| `multilingual_desc4` | `multilingual_desc4` | `multilingualDesc4` | 备注多语4 |
| `multilingual_desc5` | `multilingual_desc5` | `multilingualDesc5` | 备注多语5 |
| `multilingual_desc6` | `multilingual_desc6` | `multilingualDesc6` | 备注多语6 |
| `name` | `name` | `name` | 名称 |
| `note` | `note` | `note` | 备注 |
| `role_name2` | `role_name2` | `roleName2` | 名称多语2 |
| `role_name3` | `role_name3` | `roleName3` | 名称多语3 |
| `role_name4` | `role_name4` | `roleName4` | 名称多语4 |
| `role_name5` | `role_name5` | `roleName5` | 名称多语5 |
| `role_name6` | `role_name6` | `roleName6` | 名称多语6 |
| `sub_tenant_id` | `sub_tenant_id` | `subTenantId` | 子租户ID |
| `system_code` | `system_code` | `systemCode` | 系统标识 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `orgId` | 组织id |
| `group_id` | `group_id` | `group` | 角色组id |
| `org_id` | `org_id` | `org` | 组织 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `tenantcenter_id` | `tenantcenter_id` | `yhtTenant` | 友互通租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `hide_role` | `hide_role` | `hideRole` | 是否隐藏 |
| `sys_role` | `sys_role` | `sysRole` | 系统角色标识 |

### 整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `default_role` | `default_role` | `defaultRole` | 默认角色 |
| `edit_mode` | `edit_mode` | `editMode` | 调整模式 |
| `enable` | `enable` | `enable` | 启用状态 |
| `field_auth_control` | `field_auth_control` | `fieldAuthControl` | 字段权限控制标识 |
| `isactive` | `isactive` | `isactive` | 是否激活 |
| `role_type` | `role_type` | `roleType` | 角色类型 |
| `three_member_type` | `three_member_type` | `threeMemberType` | 三员标识 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `snowflake_id` | `snowflake_id` | `snowflakeId` | 雪花ID |
| `version_num` | `version_num` | `versionNum` | 版本 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `role_name` | `role_name` | `roleName` | 角色名称 |
| `multilingual_desc` | `multilingual_desc` | `multilingualDesc` | 角色描述 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `auths` | 角色权限 |
| `` | `` | `groups` | 角色组关系 |
| `` | `` | `marks` | 标签角色管理 |
| `` | `` | `rolekanbans` | 看板权限 |
| `` | `` | `rolesensdatas` | 角色敏感数据 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
