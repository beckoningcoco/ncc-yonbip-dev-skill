---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplysource.CpuSourceOpportunity"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商档案来源 (`cpu-supplymgr.supplysource.CpuSourceOpportunity`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_source_opportunity` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplysource.CpuSourceOpportunity` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商档案来源 |
| 物理表 | `cpu_source_opportunity` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `e088386e-aca0-4b85-946f-2779c7746761` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:12.5170` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2026-01-23 23:43:53:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202512161654_metadata_cpu-supplymgr-supplysource_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `0d716e13-df3b-4349-b09c-6c86aface0a4`

## 业务场景

- `dataMultilanguage`

## 术语标记

`ConfigData`

## 约束

- **codes_uniq** (transformKey): codes_uniq — 唯一字段: `['sourceCode', 'opportunityCode']`
- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 直接属性（共 22 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `appCode` | 所属应用编码 | `app_code` | String | `text` |  | ✓ |
| 2 | `appName` | 所属应用名称 | `app_name` | String | `text` |  | ✓ |
| 3 | `defCooperationCode` | 默认合作等级编码 | `def_cooperation_code` | String | `text` |  | ✓ |
| 4 | `defCooperationId` | 默认合作等级ID | `def_cooperation_id` | Long | `long` |  | ✓ |
| 5 | `defCooperationName` | 默认合作等级名称 | `def_cooperation_name` | String | `text` |  | ✓ |
| 6 | `defLifecycleCode` | 默认生命周期业务状态编码 | `def_lifecycle_code` | String | `text` |  | ✓ |
| 7 | `defLifecycleId` | 默认生命周期业务状态ID | `def_lifecycle_id` | Long | `long` |  | ✓ |
| 8 | `defLifecycleName` | 默认生命周期业务状态名称 | `def_lifecycle_name` | String | `text` |  | ✓ |
| 9 | `domainCode` | 领域编码 | `domain_code` | String | `text` |  | ✓ |
| 10 | `domainName` | 领域名称 | `domain_name` | String | `text` |  | ✓ |
| 11 | `enterpriseId` | 租户ID | `enterprise_id` | Long | `long` |  | ✓ |
| 12 | `id` | id | `id` | Long | `long` |  | ✓ |
| 13 | `opportunityCode` | 更新时机编码 | `opportunity_code` | String | `text` |  | ✓ |
| 14 | `opportunityName` | 更新时机名称 | `opportunity_name` | String | `multiLanguage` |  | ✓ |
| 15 | `opportunityNameResid` | 更新时机名称多语ID | `opportunity_name_resid` | String | `text` |  | ✓ |
| 16 | `potential` | 是否潜在 | `potential` | potential | `` |  | ✓ |
| 17 | `pubts` | pubts | `pubts` | DateTime | `timestamp` |  | ✓ |
| 18 | `sourceCode` | 来源编码 | `source_code` | String | `text` |  | ✓ |
| 19 | `sourceName` | 来源名称 | `source_name` | String | `multiLanguage` |  | ✓ |
| 20 | `sourceNameResid` | 来源名称多语ID | `source_name_resid` | String | `text` |  | ✓ |
| 21 | `tenantId` | tenantId | `tenant_id` | String | `text` |  | ✓ |
| 22 | `ytenantId` | tenantId | `ytenant_id` | String | `text` |  | ✓ |

---

