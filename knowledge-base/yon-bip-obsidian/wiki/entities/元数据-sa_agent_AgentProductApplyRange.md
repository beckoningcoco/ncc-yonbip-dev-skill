---
tags: [BIP, 元数据, 数据字典, sa.agent.AgentProductApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户商品对照适用范围 (`sa.agent.AgentProductApplyRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`agentproductapplyrange` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户商品对照适用范围 |
| 物理表 | `agentproductapplyrange` |
| domain/服务域 | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 12 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `agentProductAppliedDetail` | `sa.agent.AgentProductApplyRangeDetail` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `agentProductId` | `` |
| `customerId` | `` |
| `shopId` | `` |
| `orgId` | `` |

## 继承接口 (2个, 2字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agentProductId` | `agentProductId` | `agentProductId` | 客户商品对照ID |
| `customerId` | `customerId` | `customerId` | 客户ID |
| `orgId` | `orgId` | `orgId` | 组织ID |
| `shopId` | `shopId` | `shopId` | 商家ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isApplied` | `isApplied` | `isApplied` | 是否被分配者使用 |
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iRangeType` | `iRangeType` | `rangeType` | 物料适用范围类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | Id |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `agentProductAppliedDetail` | 客户商品对照适用范围详情 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
