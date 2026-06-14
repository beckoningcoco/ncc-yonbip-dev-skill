---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.quota.GoodsStrategyOrgVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 货源策略适用范围 (`cpubase.quota.GoodsStrategyOrgVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_gdstrgy_org` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.quota.GoodsStrategyOrgVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 货源策略适用范围 |
| 物理表 | `cpu_gdstrgy_org` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:25:08.8440` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 明细子表id |

## 部署信息

- **部署时间**: 2026-05-22 23:53:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604031343_metadata_cpubase-quota_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `695fa371-431c-415a-afbe-4801b7de8f30`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 7 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 2 | `id` | 明细子表id | `id` | Long | `long` |  | ✓ |
| 3 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | ✓ |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 5 | `strategyId2` | 外键 | `strategy_id` | 7086e92b-1953-40ed-bdfc-4e889b76b562 | `quote` |  | ✓ |
| 6 | `vhash` | 组织和物料的MD5hash | `vhash` | String | `text` |  | ✓ |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `strategyId2` | 外键 | `cpubase.quota.GoodsStrategyVO` | `strategy_id` | strategyOrgs → strategyId2 | 1..n | true | None |  |
| 3 | `orgId` | 组织id | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **strategyId2**: `strategyOrgs` → `cpubase.quota.GoodsStrategyVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `orgId` (组织id) | `org.func.BaseOrg` | `org_id` |
