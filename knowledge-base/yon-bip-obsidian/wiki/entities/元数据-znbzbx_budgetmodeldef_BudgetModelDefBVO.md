---
tags: [BIP, 元数据, 数据字典, znbzbx.budgetmodeldef.BudgetModelDefBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预算模型定义子表 (`znbzbx.budgetmodeldef.BudgetModelDefBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_budgetmodeldef_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预算模型定义子表 |
| 物理表 | `znbz_budgetmodeldef_b` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 32 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_budgetmodeldef` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `refcode` | `refcode` | `refcode` | 编制参照 |
| `vfieldcode` | `vfieldcode` | `vfieldcode` | 字段编码 |
| `mappingfixedvalue` | `mappingfixedvalue` | `mappingfixedvalue` | 映射固定值 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |
| `dimension` | `dimension` | `dimension` | 编制维度 |
| `vfieldname2` | `vfieldname2` | `vfieldname2` | 字段名称（英语） |
| `vfieldname3` | `vfieldname3` | `vfieldname3` | 字段名称（繁体） |
| `vfieldname4` | `vfieldname4` | `vfieldname4` | 字段名称（印尼语） |
| `vfieldname5` | `vfieldname5` | `vfieldname5` | 字段名称（日语） |
| `vfieldname6` | `vfieldname6` | `vfieldname6` | 字段名称（韩语） |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `pk_budgetmodeldef` | `pk_budgetmodeldef` | `pk_budgetmodeldef` | 主表主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isactivedim` | `isactivedim` | `isactivedim` | 是否启动维度 |
| `isbequerycond` | `isbequerycond` | `isbequerycond` | 是否作为查询条件 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vfieldname` | `vfieldname` | `vfieldname` | 字段名称 |
