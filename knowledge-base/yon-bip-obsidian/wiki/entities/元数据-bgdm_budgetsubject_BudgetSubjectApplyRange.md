---
tags: [BIP, 元数据, 数据字典, bgdm.budgetsubject.BudgetSubjectApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预算科目适用范围 (`bgdm.budgetsubject.BudgetSubjectApplyRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bgdm_budgetsubject_applyrange` | domain：`yonbip-pm-commonbd` | 应用：`BGDM` | 业务对象ID：`f930d1d8-07d1-4b1d-b5f6-30ccb95a95a6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预算科目适用范围 |
| 物理表 | `bgdm_budgetsubject_applyrange` |
| 数据库 schema | `yonbip-pm-commonbd` |
| 所属应用 | `BGDM` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `subject_id` | `yonbip-pm-commonbd.bgdm_budget_ref` |

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

> 共 12 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgIda` | 使用组织 |
| `subject_id` | `subject_id` | `subjectId` | 外键 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isapplied` | `isapplied` | `isApplied` | 是否被分配者使用 |
| `iscreator` | `iscreator` | `isCreator` | 是否是创建者 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
