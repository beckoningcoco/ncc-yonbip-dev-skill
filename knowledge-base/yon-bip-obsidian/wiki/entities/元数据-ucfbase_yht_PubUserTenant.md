---
tags: [BIP, 元数据, 数据字典, ucfbase.yht.PubUserTenant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 友互通用户租户 (`ucfbase.yht.PubUserTenant`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`idx_user_relation` | domain：`esdomain` | 应用：`` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 友互通用户租户 |
| 物理表 | `idx_user_relation` |
| domain/服务域 | `esdomain` |
| schema | `iuap_uuas_usercenter` |
| 所属应用 | `` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_id` | `user_id` | `id` | ID |
| `user_id` | `user_id` | `pubUserID` | 用户表中用户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户id |
| `type_id` | `type_id` | `typeID` | 用户类型 |
| `user_code` | `user_code` | `userCode` | 用户编码 |
| `user_id` | `user_id` | `userIDDeprecated` | 要废弃的字段，切勿引用 |
| `user_id` | `user_id` | `userId` | 业务日志用用户ID |
| `user_name` | `user_name` | `userName` | 用户名称 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_ts` | `user_ts` | `ts` | 用户创建时间 |
