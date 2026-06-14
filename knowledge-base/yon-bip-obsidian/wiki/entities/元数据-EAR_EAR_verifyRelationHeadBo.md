---
tags: [BIP, 元数据, 数据字典, EAR.EAR.verifyRelationHeadBo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 核销关系主表 (`EAR.EAR.verifyRelationHeadBo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_verify_relation` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`141584bb-8841-4642-8842-251bd8f09b5e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 核销关系主表 |
| 物理表 | `arap_verify_relation` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 32 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `EAR.EAR.verifyRelationBodyBo` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

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

> 共 32 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_id` | `business_id` | `businessId` | 业务核销线索唯一键 |
| `target_key` | `target_key` | `targetKey` | 对方查询关键词 |
| `src_key` | `src_key` | `srcKey` | 本方查询关键词 |
| `acc_date` | `acc_date` | `accDate` | 核销日期 |
| `busi_scene` | `busi_scene` | `busiScene` | 业务场景描述 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务状态 |
| `finance_org_id` | `finance_org_id` | `financeOrgId` | 会计主体 |
| `id` | `id` | `id` | ID |
| `order_id` | `order_id` | `orderId` | 订单ID |
| `src_event_type` | `src_event_type` | `srcEventType` | 本方事务类型 |
| `src_query_dimension` | `src_query_dimension` | `srcQueryDimension` | 本方查询维度 |
| `src_sort_dimension` | `src_sort_dimension` | `srcSortDimension` | 本方排序维度 |
| `target_event_type` | `target_event_type` | `targetEventType` | 对方事务类型 |
| `target_query_dimension` | `target_query_dimension` | `targetQueryDimension` | 对方查询维度 |
| `target_sort_dimension` | `target_sort_dimension` | `targetSortDimension` | 对方排序维度 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_different_currency` | `bln_different_currency` | `blnDifferentCurrency` | 是否为异币种 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balance_state` | `balance_state` | `balanceState` | 清账标识 |

### 整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_info_completed` | `bln_info_completed` | `blnInfoCompleted` | 核销信息是否完整 |
| `bln_permited` | `bln_permited` | `blnPermited` | 该关系类型是允许还是禁止 |
| `bln_src_use_occupy` | `bln_src_use_occupy` | `blnSrcUseOccupy` | 本方是否有预占用 |
| `bln_target_use_occupy` | `bln_target_use_occupy` | `blnTargetUseOccupy` | 对方是否有预占用 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局分布式事务ID |
| `src_query_dimension_hash` | `src_query_dimension_hash` | `srcQueryDimensionHash` | 本方查询维度的哈希值 |
| `target_query_dimension_hash` | `target_query_dimension_hash` | `targetQueryDimensionHash` | 对方查询维度的哈希值 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 核销关系子表 |
