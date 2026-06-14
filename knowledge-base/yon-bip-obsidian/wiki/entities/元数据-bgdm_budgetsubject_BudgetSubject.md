---
tags: [BIP, 元数据, 数据字典, bgdm.budgetsubject.BudgetSubject]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 科目表 (`bgdm.budgetsubject.BudgetSubject`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bgdm_budgetsubject` | domain：`yonbip-pm-commonbd` | 应用：`BGDM` | 业务对象ID：`f930d1d8-07d1-4b1d-b5f6-30ccb95a95a6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 科目表 |
| 物理表 | `bgdm_budgetsubject` |
| domain/服务域 | `yonbip-pm-commonbd` |
| schema | `pmcloud` |
| 所属应用 | `BGDM` |
| 直连字段 | 21 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `budgetSubjectApplyRangeList` | `bgdm.budgetsubject.BudgetSubjectApplyRange` | composition |
| `items` | `bgdm.budgetsubject.BudgetSubjectItem` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `budgetsubject_define_character` | `` |
| `ytenant_id` | `` |
| `fin_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `orgId` | `` |

## 继承接口 (5个, 12字段)

- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 科目表编码 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fin_org_id` | `fin_org_id` | `finOrgId` | 会计主体 |
| `orgId` | `orgId` | `orgId` | 所属组织 |
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
| `revenue_expense_type` | `revenue_expense_type` | `revenueExpenseType` | 收支类型 |
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source` | `source` | `source` | 科目来源 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `budgetsubject_define_character` | `budgetsubject_define_character` | `budgetSubjectDefineCharacter` | 自定义项特征属性 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 科目表名称 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `items` | 预算科目 |
| `` | `` | `budgetSubjectApplyRangeList` | 预算科目适用范围 |
