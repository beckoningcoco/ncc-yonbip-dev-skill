---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionresult.CpuDecisionFreeDefine"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购结果主表表头自定义项 (`lawbid.decisionresult.CpuDecisionFreeDefine`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSouringBid 模块实体元数据字典。
> 物理表：`cpu_decision_freedefine` | 所属应用：`ycSouringBid`
> 来源：元数据API `queryByUri` 返回的 `lawbid.decisionresult.CpuDecisionFreeDefine` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购结果主表表头自定义项 |
| 物理表 | `cpu_decision_freedefine` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:25.1370` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | 1fc86047-2eea-424c-b46f-8fd24fdcc970 | 平行表主键 |

## 部署信息

- **部署时间**: 2026-01-23 23:56:26:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202512169999/0000-public-only/202512121037_metadata_lawbid-decisionresult_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `91d5e9b2-b999-4d25-a290-20f8fe1a4de5`

## 术语标记

`BusinessData`, `userdef`

## 约束

- **migration_id** (MetaClassPrimary): 平行表主键 — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 3 | 自由自定义项 (`AttrextItem`) | `base.itf.AttrextItem` | 1816 | 60 |

---

## 直接属性（共 64 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 2 | `define1` | 自定义项1 | `define1` | String | `text` |  | ✓ |
| 3 | `define10` | 自定义项10 | `define10` | String | `text` |  | ✓ |
| 4 | `define11` | 自定义项11 | `define11` | String | `text` |  | ✓ |
| 5 | `define12` | 自定义项12 | `define12` | String | `text` |  | ✓ |
| 6 | `define13` | 自定义项13 | `define13` | String | `text` |  | ✓ |
| 7 | `define14` | 自定义项14 | `define14` | String | `text` |  | ✓ |
| 8 | `define15` | 自定义项15 | `define15` | String | `text` |  | ✓ |
| 9 | `define16` | 自定义项16 | `define16` | String | `text` |  | ✓ |
| 10 | `define17` | 自定义项17 | `define17` | String | `text` |  | ✓ |
| 11 | `define18` | 自定义项18 | `define18` | String | `text` |  | ✓ |
| 12 | `define19` | 自定义项19 | `define19` | String | `text` |  | ✓ |
| 13 | `define2` | 自定义项2 | `define2` | String | `text` |  | ✓ |
| 14 | `define20` | 自定义项20 | `define20` | String | `text` |  | ✓ |
| 15 | `define21` | 自定义项21 | `define21` | String | `text` |  | ✓ |
| 16 | `define22` | 自定义项22 | `define22` | String | `text` |  | ✓ |
| 17 | `define23` | 自定义项23 | `define23` | String | `text` |  | ✓ |
| 18 | `define24` | 自定义项24 | `define24` | String | `text` |  | ✓ |
| 19 | `define25` | 自定义项25 | `define25` | String | `text` |  | ✓ |
| 20 | `define26` | 自定义项26 | `define26` | String | `text` |  | ✓ |
| 21 | `define27` | 自定义项27 | `define27` | String | `text` |  | ✓ |
| 22 | `define28` | 自定义项28 | `define28` | String | `text` |  | ✓ |
| 23 | `define29` | 自定义项29 | `define29` | String | `text` |  | ✓ |
| 24 | `define3` | 自定义项3 | `define3` | String | `text` |  | ✓ |
| 25 | `define30` | 自定义项30 | `define30` | String | `text` |  | ✓ |
| 26 | `define31` | 自定义项31 | `define31` | String | `text` |  | ✓ |
| 27 | `define32` | 自定义项32 | `define32` | String | `text` |  | ✓ |
| 28 | `define33` | 自定义项33 | `define33` | String | `text` |  | ✓ |
| 29 | `define34` | 自定义项34 | `define34` | String | `text` |  | ✓ |
| 30 | `define35` | 自定义项35 | `define35` | String | `text` |  | ✓ |
| 31 | `define36` | 自定义项36 | `define36` | String | `text` |  | ✓ |
| 32 | `define37` | 自定义项37 | `define37` | String | `text` |  | ✓ |
| 33 | `define38` | 自定义项38 | `define38` | String | `text` |  | ✓ |
| 34 | `define39` | 自定义项39 | `define39` | String | `text` |  | ✓ |
| 35 | `define4` | 自定义项4 | `define4` | String | `text` |  | ✓ |
| 36 | `define40` | 自定义项40 | `define40` | String | `text` |  | ✓ |
| 37 | `define41` | 自定义项41 | `define41` | String | `text` |  | ✓ |
| 38 | `define42` | 自定义项42 | `define42` | String | `text` |  | ✓ |
| 39 | `define43` | 自定义项43 | `define43` | String | `text` |  | ✓ |
| 40 | `define44` | 自定义项44 | `define44` | String | `text` |  | ✓ |
| 41 | `define45` | 自定义项45 | `define45` | String | `text` |  | ✓ |
| 42 | `define46` | 自定义项46 | `define46` | String | `text` |  | ✓ |
| 43 | `define47` | 自定义项47 | `define47` | String | `text` |  | ✓ |
| 44 | `define48` | 自定义项48 | `define48` | String | `text` |  | ✓ |
| 45 | `define49` | 自定义项49 | `define49` | String | `text` |  | ✓ |
| 46 | `define5` | 自定义项5 | `define5` | String | `text` |  | ✓ |
| 47 | `define50` | 自定义项50 | `define50` | String | `text` |  | ✓ |
| 48 | `define51` | 自定义项51 | `define51` | String | `text` |  | ✓ |
| 49 | `define52` | 自定义项52 | `define52` | String | `text` |  | ✓ |
| 50 | `define53` | 自定义项53 | `define53` | String | `text` |  | ✓ |
| 51 | `define54` | 自定义项54 | `define54` | String | `text` |  | ✓ |
| 52 | `define55` | 自定义项55 | `define55` | String | `text` |  | ✓ |
| 53 | `define56` | 自定义项56 | `define56` | String | `text` |  | ✓ |
| 54 | `define57` | 自定义项57 | `define57` | String | `text` |  | ✓ |
| 55 | `define58` | 自定义项58 | `define58` | String | `text` |  | ✓ |
| 56 | `define59` | 自定义项59 | `define59` | String | `text` |  | ✓ |
| 57 | `define6` | 自定义项6 | `define6` | String | `text` |  | ✓ |
| 58 | `define60` | 自定义项60 | `define60` | String | `text` |  | ✓ |
| 59 | `define7` | 自定义项7 | `define7` | String | `text` |  | ✓ |
| 60 | `define8` | 自定义项8 | `define8` | String | `text` |  | ✓ |
| 61 | `define9` | 自定义项9 | `define9` | String | `text` |  | ✓ |
| 62 | `id` | 平行表主键 | `id` | 1fc86047-2eea-424c-b46f-8fd24fdcc970 | `quote` |  | ✓ |
| 63 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 64 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `id` | 平行表主键 | `lawbid.decisionresult.CpuDecision` | `id` | define → id | 1 | true | None |  |

### Composition（子表）

- **id**: `define` → `lawbid.decisionresult.CpuDecision` | 1

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
