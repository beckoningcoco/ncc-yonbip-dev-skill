---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.supplycategory.SupplycategorySkuSensitive"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供货目录SKU敏感域自定义项实体 (`cpubase.supplycategory.SupplycategorySkuSensitive`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.supplycategory.SupplycategorySkuSensitive` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供货目录SKU敏感域自定义项实体 |
| 物理表 | `` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `a747781b-3318-482d-8ff5-ef29dfd46424` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:19:07.5670` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` |  |  |

## 部署信息

- **部署时间**: 2025-01-17 23:16:30:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202501132101_metadata_cpubase-supplycategory.zip`
- **安装人**: mongoTools
- **安装排名**: `ee59f0ee-c95f-4bf7-8dfc-09c9d3262ed3`

## 术语标记

`Sens::type::SkuSens`

## 直接属性（共 1 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `sensitiveType` | 敏感域类型 | `sensitive_type` | String | `text` |  | ✓ |

---

