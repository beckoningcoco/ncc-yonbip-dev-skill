---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplychange.BizScene"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务场景 (`cpu-supplymgr.supplychange.BizScene`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_pub_biz_scene` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplychange.BizScene` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务场景 |
| 物理表 | `cpu_pub_biz_scene` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `4ea28b1d-b41b-4d5d-bc57-cadf96c08e75` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:05.0370` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:46:04:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202605121644_metadata_cpu-supplymgr-supplychange_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `cb5dbaad-473f-45dc-a4a2-f18bff65e42a`

## 术语标记

`BusinessData`

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

## 直接属性（共 26 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `billnum` | 单据号 | `billnum` | String | `text` |  | ✓ |
| 2 | `bizAction` | 业务动作 | `biz_action` | String | `text` |  | ✓ |
| 3 | `bizActionParser` | 业务动作解析服务 | `biz_action_parser` | String | `text` |  | ✓ |
| 4 | `bizPartitionProvider` | 业务隔离属性提供者服务 | `biz_partition_provider` | String | `text` |  | ✓ |
| 5 | `bizService` | 业务服务 | `biz_service` | String | `text` |  | ✓ |
| 6 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 7 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 9 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 12 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 13 | `isSupportCrossTenant` | 是否支持跨租户 | `is_support_cross_tenant` | Boolean | `switch` |  | ✓ |
| 14 | `isSupportMultiPartition` | 是否支持多隔离属性 | `is_support_multi_partition` | Boolean | `switch` |  | ✓ |
| 15 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 19 | `name` | 名称 | `name` | String | `text` |  | ✓ |
| 20 | `partitions` | 业务隔离属性 | `` | 6f354de9-b235-4d03-9f6b-363ec628c9bd | `` |  |  |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 22 | `refCode` | 参照编码 | `ref_code` | String | `text` |  | ✓ |
| 23 | `serviceCode` | 服务编码 | `service_code` | String | `text` |  | ✓ |
| 24 | `stopstatus` | 停用状态 | `stopstatus` | Boolean | `switch` |  | ✓ |
| 25 | `stoptime` | 停用时间 | `stop_time` | DateTime | `timestamp` |  | ✓ |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `partitions` | 业务隔离属性 | `cpu-supplymgr.supplychange.BizPartition` | `` | partitions → bizScene | 0..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |

### Composition（子表）

- **partitions**: `partitions` → `cpu-supplymgr.supplychange.BizPartition` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
