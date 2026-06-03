---
tags: [BIP, 元数据, 数据字典, fa.fieventfaadd.FIEventAssetSubjectAssignInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 科目分配信息 (`fa.fieventfaadd.FIEventAssetSubjectAssignInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_ledger_b_subject` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`2d7ac6c6-fb0a-40f2-a698-265f837e1637`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 科目分配信息 |
| 物理表 | `fa_ledger_b_subject` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `event_master_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `ytenant_id` | `` |
| `subject_id` | `fiepub.fiepub_accsubjectref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体ID |
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `header_id` | `header_id` | `headerId` | 主表ID |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `acc_period_code` | `acc_period_code` | `period` | 会计期间编码 |
| `direction` | `direction` | `direction` | 方向 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `event_master_id` | `event_master_id` | `eventMasterId` | 财务事务主表ID |
| `subject_vid` | `subject_vid` | `subjectVid` | 折旧费用科目 |
| `subject_id` | `subject_id` | `subjectId` | 折旧费用科目-原始版本 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
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

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `acc_period_id` | `acc_period_id` | `periodId` | 会计期间ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ratio` | `ratio` | `unit` | 比例 |
