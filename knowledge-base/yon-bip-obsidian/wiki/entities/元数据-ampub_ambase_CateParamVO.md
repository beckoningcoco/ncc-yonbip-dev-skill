---
tags: [BIP, 元数据, 数据字典, ampub.ambase.CateParamVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产类别技术参数 (`ampub.ambase.CateParamVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_cate_param` | domain：`ucf-amc-ambd` | 应用：`AMBD` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产类别技术参数 |
| 物理表 | `pam_cate_param` |
| 数据库 schema | `ucf-amc-ambd` |
| 所属应用 | `AMBD` |
| 直连字段 | 28 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `ampub.ambase.CateParamVODefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `classid` | `ucf-amc-ambd.ampub_entity_ref` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_category` | `` |
| `tenantid` | `` |
| `pk_measuredoc` | `productcenter.pc_unitref_new` |
| `` | `` |

## 继承接口 (4个, 6字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **ERP来源信息** (`baseapp.itf.IErpInfo`)
  - `erpcode` → `erpcode`
  - `erpid` → `erpid`
  - `gatewayid` → `gatewayid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceId` | `sourceId` | `sourceId` | 来源id |
| `default_value` | `default_value` | `default_value` | 默认值 |
| `default_value_id` | `default_value_id` | `default_value_id` | 默认值id |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `id` | `id` | `id` | ID |
| `archive_domain` | `archive_domain` | `archive_domain` | 来源域code |
| `archive_define_name` | `archive_define_name` | `archive_define_name` | 自定义档案名称name |
| `erpcode` | `erpcode` | `erpcode` | erp系统编码 |
| `archive_return` | `archive_return` | `archive_return` | 档案返回值 |
| `archive_code` | `archive_code` | `archive_code` | 引用档案参照code |
| `archive_name` | `archive_name` | `archive_name` | 基础档案名称name |
| `erpid` | `erpid` | `erpid` | erp系统主键 |
| `gatewayid` | `gatewayid` | `gatewayid` | 网关主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_measuredoc` | `pk_measuredoc` | `pk_measuredoc` | 计量单位 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `classid` | `classid` | `classid` | 技术参数类型 |
| `pk_category` | `pk_category` | `pk_category` | 资产类别 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nullflag` | `nullflag` | `nullflag` | 必输 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `param_index` | `param_index` | `param_index` | 参数序号 |
| `input_length` | `input_length` | `input_length` | 输入长度 |
| `input_digit` | `input_digit` | `input_digit` | 精度 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 资产类别技术参数自定义项 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `param_name` | `param_name` | `param_name` | 参数名称 |
| `show_name` | `show_name` | `show_name` | 显示名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 技术参数自定义项 |
