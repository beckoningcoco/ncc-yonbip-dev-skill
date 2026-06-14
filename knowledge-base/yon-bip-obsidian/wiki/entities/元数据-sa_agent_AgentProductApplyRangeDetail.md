---
tags: [BIP, 元数据, 数据字典, sa.agent.AgentProductApplyRangeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户商品对照适用范围详情 (`sa.agent.AgentProductApplyRangeDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`agentproductapplyrangedetail` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户商品对照适用范围详情 |
| 物理表 | `agentproductapplyrangedetail` |
| domain/服务域 | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 11 个 |
| 子表 | 1 个 |
| 关联引用 | 3 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `sa.agent.AgentProductApplyRangeDefine` | composition |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `id` | `` |

## 继承接口 (3个, 4字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAgentProductCode` | `cAgentProductCode` | `agentProductCode` | 客户商品编码 |
| `cAgentProductName` | `cAgentProductName` | `agentProductName` | 客户商品名称 |
| `cAgentSkuCode` | `cAgentSkuCode` | `agentSkuCode` | 客户sku编码 |
| `cAgentSkuName` | `cAgentSkuName` | `agentSkuName` | 客户sku名称 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 适用范围ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 客户商品适用范围自定义项 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
