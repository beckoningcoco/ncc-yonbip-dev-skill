---
tags: ["BIP", "元数据", "数据字典", "ycBase", "flow.flowdef.FlowDefBasicInfo"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 流程定义基本信息 (`flow.flowdef.FlowDefBasicInfo`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_flow_def_basic_info` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `flow.flowdef.FlowDefBasicInfo` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流程定义基本信息 |
| 物理表 | `cpu_flow_def_basic_info` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycBase` |
| 业务对象ID | `86eb302a-6633-4885-ab8f-3cfd4754fa95` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:05.9740` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 流程编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:56:19:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202512051303_metadata_flow-flowdef_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `52a22235-63ec-4c7c-93ad-02c3a373be3a`

## 业务场景

- `dataMultilanguage`
- `billcode`

## 术语标记

`isMain`, `MasterData`

## 约束

- **basicInfoTranslate** (transformKey): 业务流程翻译规则 — 唯一字段: `['code']`
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
| 3 | `code` | 流程编码 | `code` | String | `text` |  | ✓ |
| 4 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 6 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 7 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 8 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 10 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 11 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 12 | `flowDefSegments` | 流程定义环节信息 | `` | 3f3ebc3d-8762-4865-b0b7-ec8a504d6f04 | `` |  |  |
| 13 | `flowDesc` | 流程方案描述 | `flow_desc` | String | `text` |  | ✓ |
| 14 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 15 | `isSystem` | 是否系统预制模板 | `is_system` | Short | `short` |  | ✓ |
| 16 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 17 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 20 | `name` | 流程名称 | `name` | String | `multiLanguage` |  | ✓ |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 22 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 23 | `sceneDesc` | 场景说明 | `scene_desc` | String | `text` |  | ✓ |
| 24 | `sourceFlowId` | 来源流程ID | `source_flow_id` | Long | `long` |  | ✓ |
| 25 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `bizTypeId` | 业务类型 | `flow.basicbiz.BizType` | `biz_type_id` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 5 | `flowDefSegments` | 流程定义环节信息 | `flow.flowdef.FlowDefSegment` | `` | flowDefSegments → flowDefId | 1..n | true | None |  |

### Composition（子表）

- **flowDefSegments**: `flowDefSegments` → `flow.flowdef.FlowDefSegment` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
