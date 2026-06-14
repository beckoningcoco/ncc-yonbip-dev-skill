---
tags: [BIP, 元数据, 数据字典, base.user.BipUser]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# BIP用户 (`base.user.BipUser`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ba_user` | domain：`u8c-auth` | 应用：`GZTACT` | 业务对象ID：`6cb18145-0fd2-4a46-a56b-6f95eb0438bc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | BIP用户 |
| 物理表 | `ba_user` |
| domain/服务域 | `u8c-auth` |
| schema | `iuap_apcom_auth` |
| 所属应用 | `GZTACT` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `staff_id` | `` |
| `id` | `` |
| `user_id` | `` |
| `org_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 用户账号 |
| `name` | `name` | `name` | 用户名称 |
| `mobile` | `mobile` | `mobile` | 手机账号 |
| `email` | `email` | `email` | 邮箱账号 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `name` | `name` | `userName` | 用户名 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_id` | `user_id` | `userId` | 用户ID |
| `staff_id` | `staff_id` | `staff` | 员工 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `id` | `id` | `id` | Id |
| `org_id` | `org_id` | `orgId` | 默认组织 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 移除状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `snowflake_id` | `snowflake_id` | `snowflake_id` | 雪花id |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
