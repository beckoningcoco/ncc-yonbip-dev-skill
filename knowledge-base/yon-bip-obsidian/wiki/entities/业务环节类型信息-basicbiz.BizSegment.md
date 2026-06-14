---
tags: ["BIP", "元数据", "数据字典", "ycBase", "flow.basicbiz.BizSegment"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务环节类型信息 (`flow.basicbiz.BizSegment`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_flow_basic_biz_segment` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `flow.basicbiz.BizSegment` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务环节类型信息 |
| 物理表 | `cpu_flow_basic_biz_segment` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:18:53.9310` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 环节编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-14 21:19:00:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202605132105_metadata_flow-basicbiz_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `7587cd61-3c3f-4499-b1a6-b33fac2349be`

## 术语标记

`ConfigData`

## 约束

- **segmentTypeTranslate** (transformKey): 环节类型迁移 — 唯一字段: `['ownerType', 'code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 5 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |

---

## 直接属性（共 25 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `bizTypeId` | 业务类型 | `biz_type_id` | 6ae9bc98-6bf0-41c5-adb8-517540c6f76d | `quote` |  | ✓ |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 3 | `code` | 环节编码 | `code` | String | `text` |  | ✓ |
| 4 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 6 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 7 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 8 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 10 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 11 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 12 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 13 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 14 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 17 | `name` | 环节名称 | `name` | String | `multiLanguage` |  | ✓ |
| 18 | `ownerType` | 使用方 | `owner_type` | String | `text` |  | ✓ |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 20 | `relatedNodeCode` | 关联的看板节点编码 | `related_node_code` | String | `text` |  | ✓ |
| 21 | `relatedSegment` | 关联的环节 | `related_segment` | 94115b5f-d29b-468c-9cb3-ddc936b282a4 | `quote` |  | ✓ |
| 22 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 23 | `segmentDesc` | 环节描述 | `segment_desc` | String | `text` |  | ✓ |
| 24 | `sourceId` | 来源环节类型 | `source_id` | 94115b5f-d29b-468c-9cb3-ddc936b282a4 | `quote` |  | ✓ |
| 25 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `relatedSegment` | 关联的环节 | `flow.basicbiz.BizSegment` | `related_segment` |  →  |  |  | None |  |
| 2 | `sourceId` | 来源环节类型 | `flow.basicbiz.BizSegment` | `source_id` |  →  |  |  | None |  |
| 3 | `bizTypeId` | 业务类型 | `flow.basicbiz.BizType` | `biz_type_id` | bizSegments → bizTypeId | 0..n | true | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |

### Composition（子表）

- **bizTypeId**: `bizSegments` → `flow.basicbiz.BizType` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
