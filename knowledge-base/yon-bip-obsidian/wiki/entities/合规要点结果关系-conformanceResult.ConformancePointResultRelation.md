---
tags: ["BIP", "元数据", "数据字典", "ycBase", "conformance.conformanceResult.ConformancePointResultRelation"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合规要点结果关系 (`conformance.conformanceResult.ConformancePointResultRelation`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_conformance_point_result_type_relation` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `conformance.conformanceResult.ConformancePointResultRelation` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合规要点结果关系 |
| 物理表 | `cpu_conformance_point_result_type_relation` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 业务对象ID | `d63fc8d6-76ba-4e5b-ad2e-50343917faf1` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:01.7960` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` |  |  |

## 术语标记

`BusinessData`

## 直接属性（共 3 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `conformancePointResult` | 合规要点结果id | `conformance_point_result_id` | Long | `long` |  | ✓ |
| 2 | `relationResultId` | 要点关系结果id | `relation_result_id` | Long | `long` |  | ✓ |
| 3 | `relationResultType` | 要点关系类型 | `relation_result_type` | String | `text` |  | ✓ |

---

