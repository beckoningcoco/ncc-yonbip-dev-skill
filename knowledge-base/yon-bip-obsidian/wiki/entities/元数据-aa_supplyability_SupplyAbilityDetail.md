---
tags: [BIP, 元数据, 数据字典, aa.supplyability.SupplyAbilityDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商等级体系子表 (`aa.supplyability.SupplyAbilityDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_supplyability_detail` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商等级体系子表 |
| 物理表 | `aa_supplyability_detail` |
| 数据库 schema | `yssupplier` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `supplyability_detail_character` | `` |
| `supplyability_id` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `supplyability_name` | `supplyability_name` | `supplyabilityName` | 供应商等级体系主表称 |
| `is_system` | `is_system` | `isSystem` | 是否系统预制(1是0否) |
| `stop_status` | `stop_status` | `stopStatus` | 状态:1启用 0停用 |
| `status` | `status` | `status` | 是否合格:合格(1);不合格(0) |
| `score_dim` | `score_dim` | `scoreDim` | 维度 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `supplyability_id` | `supplyability_id` | `supplyabilityId` | 供应商等级体系主表ID |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `include_max` | `include_max` | `includeMax` | 是否包含最高分 |
| `include_min` | `include_min` | `includeMin` | 是否包含最低分 |
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `min_score` | `min_score` | `minScore` | 最低分数 |
| `max_score` | `max_score` | `maxScore` | 最高分数 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `createtime` | `createtime` | `createtime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | ts |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `supplyability_detail_character` | `supplyability_detail_character` | `supplyabilityDetailCharacter` | 供应商等级体系子表特征 |
