---
tags: [BIP, 元数据, 数据字典, fa.facategory.FixedAssetsCategoryVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产类别 (`fa.facategory.FixedAssetsCategoryVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_category` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`71f65438-0a67-40be-b514-7f8150064d70`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产类别 |
| 物理表 | `fa_category` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 47 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `cat_struct_id` | `` |
| `parent_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `depr_method_id` | `yonbip-fi-efa.fa_depreciation_methodlistref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `unit_id` | `productcenter.pc_unitref_new` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `senior_depr_method_id` | `yonbip-fi-efa.fa_depreciation_methodlistref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |

## 继承接口 (8个, 22字段)

- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`
- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 47 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `description` | `description` | String | 描述 |
| `id` | `id` | String | id |
| `obj_id` | `obj_id` | String | 来源数据ID |
| `scrap_value_type` | `scrap_value_type` | String | 残值类型 |
| `use_scrap_value_type` | `use_scrap_value_type` | String | 使用权资产残值类型 |
| `version_no` | `version_no` | String | 版本号 |
| `auditnote` | `auditnote` | String | 审批批语 |
| `procinst_id` | `procinst_id` | String | 流程实例ID |
| `code` | `code` | String | 编码 |
| `path` | `path` | String | 路径 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accentity_id` | `accentity_id` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 会计主体 |
| `cat_struct_id` | `cat_struct_id` | 72c14eb5-b4c0-4bad-8437-02b1625bbe1c | 类别结构ID |
| `depr_method_id` | `depr_method_id` | eb9af85d-fe58-43d9-9cdd-febe330e11bc | 折旧方法id |
| `parent_id` | `parent_id` | e3a3baa9-5255-43e2-8378-505c497511fc | 上级分类 |
| `senior_depr_method_id` | `senior_depr_method_id` | eb9af85d-fe58-43d9-9cdd-febe330e11bc | 高级折旧方法id |
| `unit_id` | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 计量单位 |
| `auditor` | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 审批人 |
| `bustype` | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 交易类型 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `audit_time` | `audit_time` | DateTime | 审批日期 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `disablets` | `disablets` | DateTime | 停用时间 |
| `enablets` | `enablets` | DateTime | 启用时间 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bln_complement` | `bln_complement` | Boolean | 导入补数 |
| `bln_inventory` | `bln_inventory` | Boolean | 是否盘点 |
| `bln_lease` | `bln_lease` | Boolean | 使用权资产 |
| `bln_preset` | `bln_preset` | Boolean | 是否为预置数据 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `metering_mode` | `metering_mode` | MeteringMode | 计量模式 |
| `category_type` | `category_type` | CategoryType | 资产类型 |
| `verifystate` | `verifystate` | sys_verifystate | 单据状态 |
| `enable` | `enable` | sys_intboolean | 档案状态 |

### 整数 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `life_month` | `life_month` | Integer | 使用月(使用年限) |
| `life_year` | `life_year` | Integer | 使用年 |
| `level` | `level` | Integer | 层级 |
| `sort_num` | `sort_num` | Integer | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `ifend` | `ifend` | Short | 是否末级 |
| `dr` | `dr` | Short | 逻辑删除 |

### 数值字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `scrap_value_amount` | `scrap_value_amount` | Decimal | 残值金额 |
| `scrap_value_rate` | `scrap_value_rate` | Decimal | 残值率 |
| `use_scrap_value_amount` | `use_scrap_value_amount` | Decimal | 使用权资产残值金额 |
| `use_scrap_value_rate` | `use_scrap_value_rate` | Decimal | 使用权资产残值率 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `full_name` | `full_name` | String | 类别全称 |
| `name` | `name` | String | 分类名称 |
