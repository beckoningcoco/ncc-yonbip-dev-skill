---
tags: [BIP, 元数据, 数据字典, ampub.ambase.LineParamVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线性参数 (`ampub.ambase.LineParamVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_line_param` | domain：`ucf-amc-ambd` | 应用：`AMBD` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线性参数 |
| 物理表 | `pam_line_param` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AMBD` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `classid` | `ucf-amc-ambd.ampub_entity_ref` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_category` | `` |
| `tenantid` | `` |
| `pk_measuredoc` | `productcenter.pc_unitref_new` |

## 继承接口 (3个, 3字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `archive_define_name` | `archive_define_name` | `archive_define_name` | 自定义档案名称name |
| `archive_return` | `archive_return` | `archive_return` | 档案返回值 |
| `sourceId` | `sourceId` | `sourceId` | 来源id |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `id` | `id` | `id` | ID |
| `archive_code` | `archive_code` | `archive_code` | 引用档案code |
| `archive_domain` | `archive_domain` | `archive_domain` | 引用档案domain |
| `archive_name` | `archive_name` | `archive_name` | 引用档案 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `classid` | `classid` | `classid` | 线性参数类型 |
| `pk_measuredoc` | `pk_measuredoc` | `pk_measuredoc` | 计量单位 |
| `pk_category` | `pk_category` | `pk_category` | 资产类别 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `input_length` | `input_length` | `input_length` | 输入长度 |
| `input_digit` | `input_digit` | `input_digit` | 精度 |
| `param_index` | `param_index` | `param_index` | 参数序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 线性参数自定义项 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `param_name` | `param_name` | `param_name` | 参数名称 |
