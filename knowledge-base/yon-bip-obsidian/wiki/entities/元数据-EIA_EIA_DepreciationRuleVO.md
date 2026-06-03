---
tags: [BIP, 元数据, 数据字典, EIA.EIA.DepreciationRuleVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计提方案 (`EIA.EIA.DepreciationRuleVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_depreciation_rule` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`47f78086-1309-4f81-bda6-94a32b36886d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计提方案 |
| 物理表 | `ia_depreciation_rule` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 23 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `DepreciationRuleBodyVOList` | `EIA.EIA.DepreciationRuleBodyVO` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `depreciation_range_id` | `yonbip-fi-eia.fieia_DepreciationScope_ref` |
| `` | `` |

## 继承接口 (5个, 12字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `depreciation_range` | `depreciation_range` | `depreciationRange` | 计提范围 |
| `depreciation_scale` | `depreciation_scale` | `depreciationScale` | 计提比例 |
| `description` | `description` | `description` | 备注 |
| `rule_type` | `rule_type` | `ruleType` | 计提方式 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `depreciation_range_id` | `depreciation_range_id` | `depreciationRangeId` | 计提范围 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `depreciation_scale_item` | `depreciation_scale_item` | `depreciationScaleItem1` | 计提范围输入 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dimension` | `dimension` | `dimension` | 计提维度 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 计提方案名称 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `DepreciationRuleBodyVOList` | 计提方案子表 |
