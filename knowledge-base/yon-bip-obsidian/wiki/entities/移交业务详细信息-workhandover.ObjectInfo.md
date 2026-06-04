---
tags: ["BIP", "元数据", "数据字典", "ycBase", "workhandover.workhandover.ObjectInfo"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 移交业务详细信息 (`workhandover.workhandover.ObjectInfo`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_workhandover_object_info` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `workhandover.workhandover.ObjectInfo` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 移交业务详细信息 |
| 物理表 | `cpu_workhandover_object_info` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycBase` |
| 业务对象ID | `3679642e-151b-4993-8444-629e661b8157` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:59.0900` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:38:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512041721_metadata_workhandover-workhandover_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `cedcd135-6523-499e-93ec-902404f0a847`

## 业务场景

- `dataMultilanguage`

## 术语标记

`BusinessData`

## 约束

- **name_UK** (transformKey): name — 唯一字段: `['name']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 26 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `billNum` | 业务单据类型编码 | `bill_num` | String | `text` |  | ✓ |
| 2 | `calcApiUrl` | 移交数量计算API路径 | `calcApiUrl` | String | `text` |  | ✓ |
| 3 | `dataCodeField` | 业务数据编码字段 | `data_code_field` | String | `text` |  | ✓ |
| 4 | `dataIdField` | 业务数据主键字段 | `data_id_field` | String | `text` |  | ✓ |
| 5 | `dataNameField` | 业务数据名称字段 | `data_name_field` | String | `text` |  | ✓ |
| 6 | `dataRule` | 数据规则 | `data_rule` | String | `text` |  | ✓ |
| 7 | `detailEntityName` | 对应子表的entityName | `detail_entity_name` | String | `text` |  | ✓ |
| 8 | `detailFieldName` | 主表中对应业务list的字段名 | `detail_field_name` | String | `text` |  | ✓ |
| 9 | `domainKey` | 领域编码 | `domain_key` | String | `text` |  | ✓ |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 11 | `entityName` | 业务对象fullName | `entity_name` | String | `text` |  | ✓ |
| 12 | `eventSource` | 事件中心-事件源 | `event_source` | String | `text` |  | ✓ |
| 13 | `eventType` | 事件中心-事件类型 | `event_type` | String | `text` |  | ✓ |
| 14 | `extraCondition` | 扩展查询条件 | `extra_condition` | String | `text` |  | ✓ |
| 15 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 16 | `iorder` | 排序码--移交范围数据列表排序 | `iorder` | Integer | `int` |  | ✓ |
| 17 | `isMain` | 是否主业务对象 | `is_main` | Boolean | `switch` |  | ✓ |
| 18 | `name` | 名称 | `name` | String | `multiLanguage` |  | ✓ |
| 19 | `nameResid` | 名称多语 | `name_resid` | String | `text` |  | ✓ |
| 20 | `objIdFieldName` | 子表中对应业务的ID字段 | `obj_id_field_name` | String | `text` |  | ✓ |
| 21 | `objectCode` | 业务对象编码 | `object_code` | String | `text` |  | ✓ |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 23 | `rangeCode` | 移交范围编码 | `range_code` | String | `text` |  | ✓ |
| 24 | `relateObjectType` | 相关人员 | `relate_object_type` | String | `text` |  | ✓ |
| 25 | `serviceCode` | 服务编码 | `service_code` | String | `text` |  | ✓ |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 1 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
