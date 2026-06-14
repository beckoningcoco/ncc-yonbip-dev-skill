---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplystatuschange.SupplyStatusRelationBusiness"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商状态变更单关联业务参照表 (`cpu-supplymgr.supplystatuschange.SupplyStatusRelationBusiness`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_supply_status_relation_business` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplystatuschange.SupplyStatusRelationBusiness` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商状态变更单关联业务参照表 |
| 物理表 | `cpu_supply_status_relation_business` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `2c25dfd8-6ea8-471d-b232-54904c87a297` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:18.0960` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2025-10-24 23:19:36:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202509051641_metadata_cpu-supplymgr-supplystatuschange.zip`
- **安装人**: mongoTools
- **安装排名**: `503b1f52-b1b5-47a9-a868-17a150336696`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 10 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 2 | `id` | id | `id` | Long | `long` |  | ✓ |
| 3 | `relationBusinessCode` | 关联业务编码 | `relation_business_code` | String | `text` |  | ✓ |
| 4 | `relationBusinessId` | 关联业务 | `relation_business_id` | Long | `long` |  | ✓ |
| 5 | `relationBusinessName` | 关联业务名称 | `relation_business_name` | String | `text` |  | ✓ |
| 6 | `relationBusinessResId` | 多语 | `relation_business_res_id` | String | `text` |  | ✓ |
| 7 | `tenantId` | tenantId | `tenant_id` | String | `text` |  | ✓ |
| 8 | `ts` | 更新时间 | `ts` | DateTime | `timestamp` |  | ✓ |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 10 | `ytenantId` | ytenantId | `ytenant_id` | String | `text` |  | ✓ |

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
