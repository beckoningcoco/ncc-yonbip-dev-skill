---
tags: [BIP, 元数据, 数据字典, epub.basic.AccProperty]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计要素 (`epub.basic.AccProperty`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_accproperty` | domain：`fiepub` | 应用：`FP` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计要素 |
| 物理表 | `epub_accproperty` |
| 数据库 schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `character` | `` |
| `ytenant_id` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `accelement` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 会计要素编码 |
| `creator` | `creator` | `creator` | 创建人名称 |
| `description` | `description` | `description` | 描述 |
| `modifier` | `modifier` | `modifier` | 修改人名称 |
| `objid` | `objid` | `objid` | 友企连id |
| `sysid` | `sysid` | `sysid` | 来源主键 |
| `accelementtype` | `accelementtype` | `accelementType` | 会计要素性质 |
| `direction` | `direction` | `direction` | 余额方向 |
| `balanceformulaposition` | `balanceformulaposition` | `balanceformulaposition` | 平衡公式位置 |
| `accpropertyattribute` | `accpropertyattribute` | `accpropertyattribute` | 会计要素属性 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `accelement` | `accelement` | `accelement` | 手工码 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bincomestatement` | `bincomestatement` | `bincomestatement` | 是否损益科目 |
| `bleaf` | `bleaf` | `bleaf` | 是否叶子节点 |
| `boutchart` | `boutchart` | `boutchart` | 是否表外科目 |
| `bshowbalance` | `bshowbalance` | `bshowbalance` | 是否显示余额 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 会计要素名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character` | `character` | `character` | 会计要素特征属性 |
