---
tags: [BIP, 元数据, 数据字典, EIA.calRow.CalRowsVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 待计算行清单 (`EIA.calRow.CalRowsVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_cal_rows` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`862f1a7e-9900-4b72-88ff-50509a47c871`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 待计算行清单 |
| 物理表 | `ia_cal_rows` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 21 个 |
| 子表 | 1 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `CalRowsBodyVOList` | `EIA.calRow.CalRowsBodyVO` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `executor` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `accbook_id` | `fiepub.fiepub_accountbook_all_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_all` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 继承接口 (3个, 6字段)

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

> 共 21 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计期间年编码 |
| `exec_record_id` | `exec_record_id` | `execRecord` | 执行记录ID |
| `calculate_mode` | `calculate_mode` | `calculateMode` | 计算模式 |
| `period_code` | `period_code` | `periodCode` | 会计期间编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计期间年ID |
| `executor` | `executor` | `executor` | 执行人 |
| `period_id` | `period_id` | `period` | 会计期间ID |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exec_time` | `exec_time` | `execTime` | 执行时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exec_status` | `exec_status` | `execStatus` | 执行状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `CalRowsBodyVOList` | 待计算行清单子表 |
