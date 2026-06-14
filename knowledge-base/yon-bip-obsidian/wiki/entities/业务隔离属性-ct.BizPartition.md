---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.ct.BizPartition"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务隔离属性 (`aa.ct.BizPartition`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_pub_biz_partition` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.ct.BizPartition` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务隔离属性 |
| 物理表 | `cpu_pub_biz_partition` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `130db27d-f23a-4dac-851e-6572b33f0916` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:38.9050` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-10-24 23:29:23:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509141337_metadata_aa-ct.zip`
- **安装人**: mongoTools
- **安装排名**: `c05a5553-c756-429a-93ab-758ed17d8d57`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 4 | 停用信息 (`IStopping`) | `base.itf.IStopping` | 111 | 2 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `bizScene` | 业务场景标识 | `biz_scene_id` | 226ce555-40c4-4999-9170-c8bbd2314f32 | `quote` |  | ✓ |
| 2 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 4 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 7 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 8 | `isValid` | 是否有效 | `is_valid` | Boolean | `switch` |  | ✓ |
| 9 | `keyField` | 隔离属性键字段 | `key_field` | String | `text` |  | ✓ |
| 10 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 15 | `stopstatus` | 停用状态 | `stopstatus` | Boolean | `switch` |  | ✓ |
| 16 | `stoptime` | 停用时间 | `stop_time` | DateTime | `timestamp` |  | ✓ |
| 17 | `valueField` | 隔离属性值字段 | `value_field` | String | `text` |  | ✓ |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 4 | `bizScene` | 业务场景标识 | `aa.ct.BizScene` | `biz_scene_id` | partitions → bizScene | 0..n | true | None |  |

### Composition（子表）

- **bizScene**: `partitions` → `aa.ct.BizScene` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
