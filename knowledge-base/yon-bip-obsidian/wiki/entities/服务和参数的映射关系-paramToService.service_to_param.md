---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.paramToService.service_to_param"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 服务和参数的映射关系 (`bctask.paramToService.service_to_param`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`service_to_param` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.paramToService.service_to_param` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务和参数的映射关系 |
| 物理表 | `service_to_param` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 业务对象ID | `7c61407c-21c6-49a9-a44f-1359d7ea8ff2` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:13.5530` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` |  |  |

## 部署信息

- **部署时间**: 2025-10-25 00:18:14:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202509101023_metadata_bctask-paramToService_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `dc4a2b06-ce3f-49c1-9882-c7ee581030e6`

## 术语标记

`ConfigData`, `isMain`

## 直接属性（共 5 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `param_code` | 参数编码 | `param_code` | String | `text` |  | ✓ |
| 2 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 3 | `service_code` | 服务编码 | `service_code` | String | `text` |  | ✓ |
| 4 | `service_name` | 服务名称 | `service_name` | String | `text` |  | ✓ |
| 5 | `ytenant_id` | 租户id | `ytenant_id` | String | `text` |  | ✓ |

---

