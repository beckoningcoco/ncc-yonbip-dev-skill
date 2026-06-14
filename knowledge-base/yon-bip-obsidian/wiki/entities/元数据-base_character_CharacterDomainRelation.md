---
tags: [BIP, 元数据, 数据字典, base.character.CharacterDomainRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 特征域关联特征 (`base.character.CharacterDomainRelation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`base_character_domain_relation` | domain：`u8c-userdefine` | 应用：`CHARACTER` | 业务对象ID：`4c0384bb-041f-4fa8-83a0-455241bb4dd2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征域关联特征 |
| 物理表 | `base_character_domain_relation` |
| domain/服务域 | `u8c-userdefine` |
| schema | `iuap_metadata_extendservice` |
| 所属应用 | `CHARACTER` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `character_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `character_domain_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |

## 继承接口 (4个, 7字段)

- **排序** (`base.character.IOrder`)
  - `iOrder` → `iOrder`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character_id` | `character_id` | `character` | 特征 |
| `character_domain_id` | `character_domain_id` | `characterDomain` | 特征域 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `order` | 排序 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
