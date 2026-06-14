---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.supplycategoryapplication.SupplycategoryApplicationBodyVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供货目录申请表体 (`cpubase.supplycategoryapplication.SupplycategoryApplicationBodyVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_supplycategory_application_body` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.supplycategoryapplication.SupplycategoryApplicationBodyVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供货目录申请表体 |
| 物理表 | `cpu_supplycategory_application_body` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:25:18.5850` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |

## 部署信息

- **部署时间**: 2025-07-18 23:44:19:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202506181507_metadata_cpubase-supplycategoryapplication_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `7b0abdba-f82c-4b7a-998d-eef445e2de0b`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 29 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `supAppliId` | 供货目录申请id | `supappli_id` | c137e94f-4c7a-4201-9b4a-5f9afb15aa5e | `quote` |  | ✓ |
| 2 | `operationStatus` | 操作类型 | `operation_status` | String | `text` |  | ✓ |
| 3 | `materialClassId` | 物料分类 | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 4 | `SupplycategoryApplicationDetailDefineCharacter` | 供货目录申请表体自定义项 | `defineCharacter` | 7e16399c-9afe-4aee-94ae-e05a986c73c5 | `UserDefine` |  | ✓ |
| 5 | `purchaseClassId` | 采购分类 | `purchase_class_id` | ec3f827d-4cff-462d-b74c-1dd556c96baa | `quote` |  | ✓ |
| 6 | `materialId` | 物料 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 7 | `productsku` | 物料SKU | `productsku_specitem` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | ✓ |
| 8 | `supplierId` | 供应商id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 9 | `productUnitId` | 物料单位 | `productUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 10 | `minOrderQuantity` | 最小起订量 | `min_order_quantity` | Decimal | `number` |  | ✓ |
| 11 | `purchaseMultiple` | 采购倍量 | `purchase_multiple` | Decimal | `number` |  | ✓ |
| 12 | `projectId` | 项目id | `projectId` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 13 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 14 | `transtype` | 业务类型 | `trans_type` | String | `text` |  | ✓ |
| 15 | `applyScope` | 适用范围 | `apply_scope` | String | `multipleOption` |  | ✓ |
| 16 | `validtime` | 过期时间 | `validtime` | DateTime | `timestamp` |  | ✓ |
| 17 | `sourceId` | 供货目录id | `source_id` | String | `text` |  | ✓ |
| 18 | `SupplycategoryApplicationFreeCharacteristics` | 物料自由项特征组 | `freeCharacteristics` | 1a3f1447-463c-40e1-910b-bb37b15185ce | `FreeCT` |  | ✓ |
| 19 | `vaddType` | 供货目录来源单据类型 | `vaddType` | String | `text` |  | ✓ |
| 20 | `bizStatus` | 有效状态 | `biz_status` | String | `text` |  | ✓ |
| 21 | `productCode` | 供应商物料编码 | `product_code` | String | `text` |  | ✓ |
| 22 | `productName` | 供应商物料名称 | `product_name` | String | `text` |  | ✓ |
| 23 | `productSpec` | 供应商物料规格型号 | `product_spec` | String | `text` |  | ✓ |
| 24 | `supplycategoryOrg` | 来源组织 | `supplycategory_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 25 | `supplycategoryOrgName` | 来源组织名称 | `supplycategory_org_name` | String | `text` |  | ✓ |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 27 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 28 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |

---

## 关联属性（共 12 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purchaseClassId` | 采购分类 | `pc.cls.PurchaseClass` | `purchase_class_id` |  →  |  |  | Service |  |
| 2 | `supplycategoryOrg` | 来源组织 | `org.func.BaseOrg` | `supplycategory_org` |  →  |  |  | Service |  |
| 3 | `productsku` | 物料SKU | `pc.product.ProductSKU` | `productsku_specitem` |  →  |  |  | Service |  |
| 4 | `supAppliId` | 供货目录申请id | `cpubase.supplycategoryapplication.SupplycategoryApplicationVO` | `supappli_id` | application_bodyvos → supAppliId | 1..n | true | None |  |
| 5 | `supplierId` | 供应商id | `aa.vendor.Vendor` | `supplier_id` |  →  |  |  | Service |  |
| 6 | `materialClassId` | 物料分类 | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 7 | `SupplycategoryApplicationFreeCharacteristics` | 物料自由项特征组 | `cpubase.supplycategoryapplication.SupplycategoryApplicationCharacteristicsDefine` | `freeCharacteristics` |  →  |  |  | None |  |
| 8 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 9 | `materialId` | 物料 | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 10 | `projectId` | 项目id | `bd.project.ProjectVO` | `projectId` |  →  |  |  | Service |  |
| 11 | `productUnitId` | 物料单位 | `pc.unit.Unit` | `productUnitId` |  →  |  |  | Service |  |
| 12 | `SupplycategoryApplicationDetailDefineCharacter` | 供货目录申请表体自定义项 | `cpubase.supplycategoryapplication.SupplycategoryApplicationDetailDefineNew` | `defineCharacter` |  →  |  |  | None |  |

### Composition（子表）

- **supAppliId**: `application_bodyvos` → `cpubase.supplycategoryapplication.SupplycategoryApplicationVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purchaseClassId` (采购分类) | `pc.cls.PurchaseClass` | `purchase_class_id` |
| `supplycategoryOrg` (来源组织) | `org.func.BaseOrg` | `supplycategory_org` |
| `productsku` (物料SKU) | `pc.product.ProductSKU` | `productsku_specitem` |
| `supplierId` (供应商id) | `aa.vendor.Vendor` | `supplier_id` |
| `materialClassId` (物料分类) | `pc.cls.ManagementClass` | `material_class_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `materialId` (物料) | `pc.product.Product` | `material_id` |
| `projectId` (项目id) | `bd.project.ProjectVO` | `projectId` |
| `productUnitId` (物料单位) | `pc.unit.Unit` | `productUnitId` |
