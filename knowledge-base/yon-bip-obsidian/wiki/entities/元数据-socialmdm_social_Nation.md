---
tags: [BIP, 元数据, 数据字典, socialmdm.social.Nation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 民族 (`socialmdm.social.Nation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mdm_nationtb` | domain：`hrcloud-staff-mgr` | 应用：`HRED` | 业务对象ID：`a26c5374-70d5-4a99-9b36-9315bfcb8dec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 民族 |
| 物理表 | `mdm_nationtb` |
| domain/服务域 | `hrcloud-staff-mgr` |
| 所属应用 | `HRED` |
| 直连字段 | 27 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `country` | `hred.ethnicgroup.Country` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `user_define_character` | `` |
| `ytenant_id` | `` |

## 继承接口 (5个, 10字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `naid` | `naid` | `naid` | 民族UUID（废弃） |
| `update_at` | `update_at` | `updateAt` | 更新时间（废弃） |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 友户通租户id（废弃） |
| `sys_id` | `sys_id` | `sysid` | 系统标识 |
| `code` | `code` | `code` | 编码 |
| `treeref_foreignkey` | `treeref_foreignkey` | `treeRefForeignKey` | 树外键（废弃） |
| `name_resid` | `name_resid` | `nameResId` | 多语平台资源编码（废弃） |
| `pk_mdm` | `pk_mdm` | `id` | ID |
| `mdm_parentcode` | `mdm_parentcode` | `mdmParentCode` | 父编码（废弃） |
| `mdm_code` | `mdm_code` | `mdmCode` | 编码（废弃） |
| `tenant_id` | `tenant_id` | `tenant` | 租户ID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ispreset` | `ispreset` | `ispreset` | 是否预置 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sortnum` | `sortnum` | `sortnum` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `userDefineCharacter` | 特征 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `description` | `description` | `description` | 描述 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `country` | 国家/地区 |
