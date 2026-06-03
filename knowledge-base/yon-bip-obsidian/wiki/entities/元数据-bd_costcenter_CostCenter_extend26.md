---
tags: [BIP, 元数据, 数据字典, bd.costcenter.CostCenter_extend26]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# BIP用户多选引用子实体 (`bd.costcenter.CostCenter_extend26`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`iuap_quotelist_i92076_35254245285954382` | domain：`finbd` | 应用：`DPMACCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | BIP用户多选引用子实体 |
| 物理表 | `iuap_quotelist_i92076_35254245285954382` |
| 数据库 schema | `finbd` |
| 所属应用 | `DPMACCT` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `mainid` | `bip-usercenter.bip_user_ref` |
| `fkid_int` | `` |

## 继承接口 (5个, 9字段)

- **逻辑删除接口** (`common.base.LogicDelete`)
  - `dr` → `dr`
- **模版接口** (`common.base.Template`)
  - `pk_temp` → `pk_temp`
  - `version` → `version`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `pk_temp` | `pk_temp` | `pk_temp` | 模版 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `mainid` | `mainid` | `extend26` | BIP用户 |
| `fkid_int` | `fkid_int` | `fkid` | 外键 |
| `` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 版本 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
