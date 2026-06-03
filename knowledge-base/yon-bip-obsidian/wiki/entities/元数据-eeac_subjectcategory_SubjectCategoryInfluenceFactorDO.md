---
tags: [BIP, 元数据, 数据字典, eeac.subjectcategory.SubjectCategoryInfluenceFactorDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 科目分类影响因素 (`eeac.subjectcategory.SubjectCategoryInfluenceFactorDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_subject_cat_influence` | domain：`yonbip-fi-eeac` | 应用：`EVNT` | 业务对象ID：`ab370190-1090-4cb9-854f-6bd8fe4cf577`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 科目分类影响因素 |
| 物理表 | `epub_subject_cat_influence` |
| 数据库 schema | `yonbip-fi-eeac` |
| 所属应用 | `EVNT` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `influence_factor_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `subject_cat_id` | `yonbip-fi-eeac.RefTable_2c31e15e31` |
| `ytenant_id` | `` |

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

> 共 11 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `influence_factor_id` | `influence_factor_id` | `influenceFactorId` | 影响因素 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `subject_cat_id` | `subject_cat_id` | `subjectCategoryId` | 科目分类 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_default` | `bln_default` | `blnDefault` | 是否默认 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
