---
tags: [BIP, 元数据, 数据字典, eia.accountparam.bizDimension]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务维度 (`eia.accountparam.bizDimension`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_account_param_bizDimension` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`cea17e61-e57b-4d5e-b936-933d3fb06130`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务维度 |
| 物理表 | `ia_account_param_bizDimension` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 14 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bizDimension_sumDimensionList` | `eia.accountparam.bizDimension_sumDimension` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `foreignerKey` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `fi_event_range` | `yonbip-fi-eeac.fieeac_fievent_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `` | `` |
| `sum_dimension` | `yonbip-fi-eia.sumDimension` |

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

> 共 14 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `foreignerKey` | `foreignerKey` | `foreignerKey` | 外键 |
| `fi_event_range` | `fi_event_range` | `fiEventRange` | 转出的会计事务范围 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_include_appoint_cost` | `is_include_appoint_cost` | `isIncludeAppointCost` | 是否包含指定成本 |
| `out_type` | `out_type` | `outType` | 转移方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sum_dimension` | `sum_dimension` | `sumDimension` | 汇总维度 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bizDimension_sumDimensionList` | 业务维度汇总维度 |
