---
tags: ["BIP", "元数据", "数据字典", "ycBase", "purchase.message.PurchaseMessageMaterialClass"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商机信息物料明细 (`purchase.message.PurchaseMessageMaterialClass`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_purchase_message_material_class` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `purchase.message.PurchaseMessageMaterialClass` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商机信息物料明细 |
| 物理表 | `cpu_purchase_message_material_class` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:18:57.9970` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-07-18 23:53:24:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202506242124_metadata_purchase-message.zip`
- **安装人**: mongoTools
- **安装排名**: `f7cb81e3-d5cd-4719-9e1a-4c82ff546bfc`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 9 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `purchaseMessageId` | 商机信息 | `purchase_message_id` | d00e95ea-360f-4b63-ad2b-ff639d133ff1 | `quote` |  | ✓ |
| 2 | `materialClassId` | 物料分类 | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 3 | `reqOrgId` | 需求组织 | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 4 | `receiveOrgId` | 收货组织 | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 5 | `materialId` | 物料 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purchaseMessageId` | 商机信息 | `purchase.message.PurchaseMessage` | `purchase_message_id` | materialClassList → purchaseMessageId | 0..n | true | None |  |
| 2 | `receiveOrgId` | 收货组织 | `org.func.BaseOrg` | `receive_org_id` |  →  |  |  | Service |  |
| 3 | `materialClassId` | 物料分类 | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `materialId` | 物料 | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 6 | `reqOrgId` | 需求组织 | `org.func.BaseOrg` | `req_org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **purchaseMessageId**: `materialClassList` → `purchase.message.PurchaseMessage` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `receiveOrgId` (收货组织) | `org.func.BaseOrg` | `receive_org_id` |
| `materialClassId` (物料分类) | `pc.cls.ManagementClass` | `material_class_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `materialId` (物料) | `pc.product.Product` | `material_id` |
| `reqOrgId` (需求组织) | `org.func.BaseOrg` | `req_org_id` |
