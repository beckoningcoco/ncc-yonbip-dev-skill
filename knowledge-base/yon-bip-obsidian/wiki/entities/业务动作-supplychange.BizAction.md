---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplychange.BizAction"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务动作 (`cpu-supplymgr.supplychange.BizAction`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_pub_biz_action` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplychange.BizAction` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务动作 |
| 物理表 | `cpu_pub_biz_action` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `55d8ec39-7c4c-4e08-8eaf-7ddd2d54a41e` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:09.5390` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:46:00:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202603311154_metadata_cpu-supplymgr-supplychange_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `1f5cd665-d589-447f-b7ba-ab04d7f153f0`

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

## 直接属性（共 23 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `action` | 动作 | `action` | String | `text` |  | ✓ |
| 2 | `bizAction` | 业务动作 | `biz_action` | String | `text` |  | ✓ |
| 3 | `bizActionParser` | 业务动作解析服务 | `biz_action_parser` | String | `text` |  | ✓ |
| 4 | `bizBillnumProvider` | 业务单据号提供者服务 | `biz_billnum_provider` | String | `text` |  | ✓ |
| 5 | `bizRefCodeProvider` | 业务参照编码提供者服务 | `biz_refcode_provider` | String | `text` |  | ✓ |
| 6 | `bizService` | 业务服务标识 | `biz_service_id` | a1565efe-777f-42df-8aa9-1a7975042e64 | `quote` |  | ✓ |
| 7 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 8 | `comment` | 备注 | `comment` | String | `text` |  | ✓ |
| 9 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 11 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 14 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 15 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 19 | `name` | 名称 | `name` | String | `text` |  | ✓ |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 21 | `stopstatus` | 停用状态 | `stopstatus` | Boolean | `switch` |  | ✓ |
| 22 | `stoptime` | 停用时间 | `stop_time` | DateTime | `timestamp` |  | ✓ |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `bizService` | 业务服务标识 | `cpu-supplymgr.supplychange.BizService` | `biz_service_id` | actions → bizService | 0..n | true | None |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |

### Composition（子表）

- **bizService**: `actions` → `cpu-supplymgr.supplychange.BizService` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
