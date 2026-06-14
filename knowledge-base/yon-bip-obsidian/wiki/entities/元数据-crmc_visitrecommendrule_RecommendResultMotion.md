---
tags: [BIP, 元数据, 数据字典, crmc.visitrecommendrule.RecommendResultMotion]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 推荐结果-推荐动作 (`crmc.visitrecommendrule.RecommendResultMotion`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_recommend_result_object` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 推荐结果-推荐动作 |
| 物理表 | `crmc_recommend_result_object` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `result_id` | `` |
| `ytenant_id` | `` |
| `object_id` | `` |

## 字段列表（按类型分组）

> 共 6 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `object_id` | `object_id` | `objectId` | 动作id |
| `result_id` | `result_id` | `resultId` | 结果id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `recommend_type` | `recommend_type` | `recommendType` | 推荐类型(2: 动作) |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
