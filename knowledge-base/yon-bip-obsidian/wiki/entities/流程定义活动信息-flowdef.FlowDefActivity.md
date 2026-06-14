---
tags: ["BIP", "元数据", "数据字典", "ycBase", "flow.flowdef.FlowDefActivity"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 流程定义活动信息 (`flow.flowdef.FlowDefActivity`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_flow_def_activity` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `flow.flowdef.FlowDefActivity` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流程定义活动信息 |
| 物理表 | `cpu_flow_def_activity` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:18.8990` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-14 21:19:00:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202605132104_metadata_flow-flowdef_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `6f41ef91-0ece-4291-a379-b586794b2c80`

## 术语标记

`MasterData`

## 约束

- **code** (transformKey): 编码 — 唯一字段: `['sortNum', 'flowDefSegmentId', 'activityTypeId']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |

---

## 直接属性（共 13 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `activityTypeId` | 业务活动类型 | `activity_type_id` | 77fff09e-c451-45e4-a835-2e85fdbb5629 | `quote` |  | ✓ |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 4 | `flowDefPreActivityId` | 前置流程活动 | `flow_def_pre_activity_id` | Long | `long` |  | ✓ |
| 5 | `flowDefSegmentId` | 流程环节 | `flow_def_segment_id` | 3f3ebc3d-8762-4865-b0b7-ec8a504d6f04 | `quote` |  | ✓ |
| 6 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 7 | `isKeyActivity` | 是否关键活动 | `is_key_activity` | Short | `short` |  | ✓ |
| 8 | `isShow` | 是否显示 | `is_show` | Short | `short` |  | ✓ |
| 9 | `name` | 活动名称 | `name` | String | `multiLanguage` |  | ✓ |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 11 | `sortNum` | 排序 | `sort_num` | Integer | `int` |  | ✓ |
| 12 | `supplierOwnerName` | 供应商端活动名称 | `supplier_owner_name` | String | `multiLanguage` |  | ✓ |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `flowDefSegmentId` | 流程环节 | `flow.flowdef.FlowDefSegment` | `flow_def_segment_id` | flowDefActivitys → flowDefSegmentId | 1..n | true | None |  |
| 3 | `activityTypeId` | 业务活动类型 | `flow.basicbiz.BizActivity` | `activity_type_id` |  →  |  |  | None |  |

### Composition（子表）

- **flowDefSegmentId**: `flowDefActivitys` → `flow.flowdef.FlowDefSegment` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
