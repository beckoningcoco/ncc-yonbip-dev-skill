---
tags: ["BIP", "元数据", "数据字典", "ycBase", "flow.basicbiz.BizActivity"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务活动类型信息 (`flow.basicbiz.BizActivity`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_flow_basic_biz_activity` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `flow.basicbiz.BizActivity` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务活动类型信息 |
| 物理表 | `cpu_flow_basic_biz_activity` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:18:52.5700` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 活动编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-14 21:19:00:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202605132105_metadata_flow-basicbiz_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `7587cd61-3c3f-4499-b1a6-b33fac2349be`

## 术语标记

`ConfigData`

## 约束

- **activityTransalte** (transformKey): 活动类型迁移 — 唯一字段: `['ownerType', 'code']`
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

## 直接属性（共 26 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `activityDesc` | 活动描述 | `activity_desc` | String | `text` |  | ✓ |
| 2 | `billNo` | 对应单据编码 | `bill_no` | String | `text` |  | ✓ |
| 3 | `bizTypeId` | 业务类型 | `biz_type_id` | 6ae9bc98-6bf0-41c5-adb8-517540c6f76d | `quote` |  | ✓ |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 5 | `code` | 活动编码 | `code` | String | `text` |  | ✓ |
| 6 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 8 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 9 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 10 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 12 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 13 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 14 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 15 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 16 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 19 | `name` | 活动名称 | `name` | String | `multiLanguage` |  | ✓ |
| 20 | `ownerType` | 使用方 | `owner_type` | String | `text` |  | ✓ |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 22 | `relatedActivity` | 关联的活动 | `related_activity` | 77fff09e-c451-45e4-a835-2e85fdbb5629 | `quote` |  | ✓ |
| 23 | `relatedNodeCode` | 关联的看板节点编码 | `related_node_code` | String | `text` |  | ✓ |
| 24 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 25 | `sourceId` | 来源活动类型 | `source_id` | 77fff09e-c451-45e4-a835-2e85fdbb5629 | `quote` |  | ✓ |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `sourceId` | 来源活动类型 | `flow.basicbiz.BizActivity` | `source_id` |  →  |  |  | None |  |
| 2 | `bizTypeId` | 业务类型 | `flow.basicbiz.BizType` | `biz_type_id` | bizActivitys → bizTypeId | 0..n | true | None |  |
| 3 | `relatedActivity` | 关联的活动 | `flow.basicbiz.BizActivity` | `related_activity` |  →  |  |  | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |

### Composition（子表）

- **bizTypeId**: `bizActivitys` → `flow.basicbiz.BizType` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
