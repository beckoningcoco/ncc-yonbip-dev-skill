---
tags: [BIP, 元数据, 数据字典, bgdm.budgetsubject.BudgetSubjectItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预算科目 (`bgdm.budgetsubject.BudgetSubjectItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bgdm_budgetsubject_item` | domain：`yonbip-pm-commonbd` | 应用：`BGDM` | 业务对象ID：`f930d1d8-07d1-4b1d-b5f6-30ccb95a95a6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预算科目 |
| 物理表 | `bgdm_budgetsubject_item` |
| 数据库 schema | `yonbip-pm-commonbd` |
| 所属应用 | `BGDM` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `classifyid` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `budgetsubject_item_define_character` | `` |
| `orgId` | `` |

## 继承接口 (5个, 15字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 科目编码 |
| `external_id` | `external_id` | `externalId` | 外部档案id |
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 备注 |
| `name` | `name` | `name` | 科目名称 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `classifyid` | `classifyid` | `classifyid` | 所属分类 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `orgId` | `orgId` | `orgId` | 所属组织 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用 |
| `revenue_expense_type` | `revenue_expense_type` | `revenueExpenseType` | 收支类型 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isend` | `isend` | `isEnd` | 是否末级 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `standard_unit_price` | `standard_unit_price` | `standardUnitPrice` | 标准单价 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `budgetsubject_item_define_character` | `budgetsubject_item_define_character` | `budgetSubjectItemDefineCharacter` | 自定义项特征属性 |
