---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplyevaluate.EvaluateSynergy"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评价报告供应商得分表 (`cpu-supplymgr.supplyevaluate.EvaluateSynergy`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_evaluate_report_supply` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplyevaluate.EvaluateSynergy` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评价报告供应商得分表 |
| 物理表 | `cpu_evaluate_report_supply` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `9b8c9763-867b-4acd-af86-89162b144c6c` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:19.4730` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2026-05-22 23:45:58:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202601201940_metadata_cpu-supplymgr-supplyevaluate.zip`
- **安装人**: mongoTools
- **安装排名**: `381ec7c1-7af7-49f5-b852-fff1aee2ffcb`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 28 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyCode` | 评价任务编码 | `apply_code` | String | `text` |  | ✓ |
| 2 | `applyOrgName` | 客户名称 | `apply_org_name` | String | `text` |  | ✓ |
| 3 | `applyTitle` | 评价任务名称 | `apply_title` | String | `text` |  | ✓ |
| 4 | `approveStatus` | 审批状态 | `approve_status` | String | `text` |  | ✓ |
| 5 | `buyerName` | 采购商名称 | `buyer_name` | String | `text` |  | ✓ |
| 6 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String | `text` |  | ✓ |
| 7 | `createTime` | 评价时间 | `createtime` | DateTime | `dateTime` |  | ✓ |
| 8 | `evaAbilityDetailId` | 等级体系子表 | `ability_detial_id` | Long | `long` |  | ✓ |
| 9 | `evaAbilityDetailName` | 等级 | `ability_detial_name` | String | `text` |  | ✓ |
| 10 | `evaAbilityDetailStatus` | 等级状态 | `ability_status` | String | `text` |  | ✓ |
| 11 | `evaEndDate` | 评价截止日期 | `eva_end_date` | DateTime | `dateTime` |  | ✓ |
| 12 | `evaReportId` | 评价报告id | `eva_report_id` | 4adb01ab-5983-467b-a459-8c00966fa86e | `quote` |  | ✓ |
| 13 | `evaStartDate` | 评价开始日期 | `eva_start_date` | DateTime | `dateTime` |  | ✓ |
| 14 | `id` | id | `id` | Long | `long` |  | ✓ |
| 15 | `materialClassId` | 物料分类 | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 16 | `materialId` | 物料 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 17 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 18 | `purchaseClassId` | 采购品类ID | `purchase_class_id` | ec3f827d-4cff-462d-b74c-1dd556c96baa | `quote` |  | ✓ |
| 19 | `score` | 得分 | `score` | Decimal | `number` |  | ✓ |
| 20 | `supSynergy` | 是否协同供应商 | `sup_synergy` | String | `text` |  | ✓ |
| 21 | `supVisible` | 供应商是否可见 | `sup_visible` | String | `text` |  | ✓ |
| 22 | `supplyBillCode` | 单据号 | `supply_bill_code` | String | `text` |  | ✓ |
| 23 | `supplyBillName` | 业务单据 | `supply_bill_name` | String | `text` |  | ✓ |
| 24 | `supplydocCode` | 供应商档案编码 | `supply_doc_code` | String | `text` |  | ✓ |
| 25 | `supplydocId` | 供应商档案id | `supply_doc_id` | Long | `long` |  | ✓ |
| 26 | `supplydocName` | 供应商档案Name | `supply_doc_name` | String | `text` |  | ✓ |
| 27 | `vendorTenant` | 供应商租户id | `vendor_tenant_id` | String | `text` |  | ✓ |
| 28 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purchaseClassId` | 采购品类ID | `pc.cls.PurchaseClass` | `purchase_class_id` |  →  |  |  | Service |  |
| 2 | `materialClassId` | 物料分类 | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `evaReportId` | 评价报告id | `cpu-supplymgr.supplyevaluate.EvaluateReport` | `eva_report_id` |  →  |  |  | None |  |
| 5 | `materialId` | 物料 | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purchaseClassId` (采购品类ID) | `pc.cls.PurchaseClass` | `purchase_class_id` |
| `materialClassId` (物料分类) | `pc.cls.ManagementClass` | `material_class_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `materialId` (物料) | `pc.product.Product` | `material_id` |
