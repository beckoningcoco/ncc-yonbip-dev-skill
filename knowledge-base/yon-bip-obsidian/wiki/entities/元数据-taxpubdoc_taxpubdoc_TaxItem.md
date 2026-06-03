---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxpubdoc.TaxItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税目 (`taxpubdoc.taxpubdoc.TaxItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_item` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`23aeb218-b0aa-4261-b833-a5320fc9a772`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 税目 |
| 物理表 | `tax_item` |
| 数据库 schema | `yonbip-fi-taxpubdoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `taxrate_id` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |
| `tax_bureau_id` | `yonbip-fi-taxpubdoc.RefTable_457b0fd24` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `define` | `` |
| `ytenant_id` | `` |
| `tax_category_id` | `yonbip-fi-taxpubdoc.RefTable_c271791694` |

## 继承接口 (4个, 9字段)

- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `item_code` | `item_code` | `itemCode` | 编码 |
| `tax_rate_name` | `tax_rate_name` | `taxRateName` | 税率描述 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country` | `country` | `country` | 国家地区 |
| `tax_bureau_id` | `tax_bureau_id` | `taxBureauId` | 税制 |
| `tax_category_id` | `tax_category_id` | `taxCategoryId` | 税种 |
| `taxrate_id` | `taxrate_id` | `taxrateId` | 税率编码 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `with_hold_remit` | `with_hold_remit` | `withholdRemit` | 是否代扣代缴 |
| `enable` | `enable` | `enable` | 档案状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `precision` | `precision` | `precision` | 精度 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define` | `define` | `define` | 自定义项 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_item` | `tax_item` | `taxItem` | 税目 |
| `tax_sub_item` | `tax_sub_item` | `taxSubItem` | 子目 |
