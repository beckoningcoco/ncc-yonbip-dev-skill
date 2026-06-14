---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.quota.QuotaAgreeTempAllotVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 配额协议分配表体 (`cpubase.quota.QuotaAgreeTempAllotVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_qtagree_temp_alt` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.quota.QuotaAgreeTempAllotVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配额协议分配表体 |
| 物理表 | `cpu_qtagree_temp_alt` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:25:14.0700` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:52:49:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512232050_metadata_cpubase-quota_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `b170ff6e-726a-4397-addd-3e7346979e41`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 10 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `agreeId` | 配额协议模版子表主键 | `agree_id` | cc252c54-0707-4f32-b1b1-8de1539bed0c | `quote` |  | ✓ |
| 2 | `dimensionField` | 字段 | `dimension_field` | String | `text` |  | ✓ |
| 3 | `dimensionFieldCode` | 字段编码 | `dimension_field_code` | String | `text` |  | ✓ |
| 4 | `dimensionType` | 维度类型 | `dimension_type` | Long | `long` |  | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 7 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 9 | `quotaAgreeTepmAllotChdId` | 配额协议模版子表自定义项 | `tempchd_id` | 7355e1a5-089f-435c-aceb-24e85c120bc4 | `UserDefine` |  | ✓ |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `agreeId` | 配额协议模版子表主键 | `cpubase.quota.QuotaAgreeTemplateVO` | `agree_id` | QuotaAgreeAllotVOTempList → agreeId | 1..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `quotaAgreeTepmAllotChdId` | 配额协议模版子表自定义项 | `cpubase.quota.QuotaAgreeTempAllotChd` | `tempchd_id` |  →  |  |  | None |  |

### Composition（子表）

- **agreeId**: `QuotaAgreeAllotVOTempList` → `cpubase.quota.QuotaAgreeTemplateVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
