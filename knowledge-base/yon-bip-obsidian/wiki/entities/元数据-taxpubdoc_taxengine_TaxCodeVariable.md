---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxengine.TaxCodeVariable]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税码计税组件变量 (`taxpubdoc.taxengine.TaxCodeVariable`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_code_variable` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`c7f07235-05d9-4146-b7f4-75a995c45edc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 税码计税组件变量 |
| 物理表 | `tax_code_variable` |
| 数据库 schema | `yonbip-fi-taxpubdoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `calc_comp_var_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `tax_code_detail_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calc_comp_var_code` | `calc_comp_var_code` | `calcCompVarCode` | 变量编码 |
| `calc_comp_var_data_type` | `calc_comp_var_data_type` | `calcCompVarDataType` | 变量数据类型 |
| `calc_comp_var_name` | `calc_comp_var_name` | `calcCompVarName` | 变量名称 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calc_comp_var_id` | `calc_comp_var_id` | `calcCompVarId` | 计税组件变量id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tax_code_detail_id` | `tax_code_detail_id` | `taxCodeDetailId` | 税码明细 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `formula` | `formula` | `formula` | 变量取值公式 |
