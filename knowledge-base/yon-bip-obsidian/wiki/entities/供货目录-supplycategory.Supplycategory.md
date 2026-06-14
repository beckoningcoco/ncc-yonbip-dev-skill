---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.supplycategory.Supplycategory"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供货目录 (`cpubase.supplycategory.Supplycategory`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_supplycategory` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.supplycategory.Supplycategory` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供货目录 |
| 物理表 | `cpu_supplycategory` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `45d9f5de-bb3b-4789-a9ec-e1d398962fd4` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:17:59.6610` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:37:56:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509251502_metadata_cpubase-supplycategory_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `cc01aaa1-2868-417b-bd30-61d6eef422ba`

## 业务场景

- `FieldAuth`
- `workflow`
- `UITemplate`
- `DataAuth`
- `imextmp`
- `report`
- `ruleengine`
- `userdefine`
- `api`

## 术语标记

`isAssigned`, `isExtend`, `data_auth`, `MasterData`, `dataAuth`, `doc`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口(扩展) (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

---

## 直接属性（共 104 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `allowsaleId` | 允销申请ID | `allowsale_id` | Long | `long` |  | ✓ |
| 2 | `authenticationLevelSystem` | 认证等级体系 | `authentication_level_system` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 3 | `applyDate` | 申请日期 | `apply_date` | DateTime | `timestamp` |  | ✓ |
| 4 | `cooperationLevel` | 合作等级 | `cooperation_level` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 5 | `applyScope` | 适用范围 | `apply_scope` | String | `text` |  | ✓ |
| 6 | `evaluationLevelSystem` | 评价等级体系 | `evaluation_level_system` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 7 | `authenticationLevel` | 认证等级 | `authentication_level` | String | `text` |  | ✓ |
| 8 | `lifeCycleStatus` | 生命周期状态 | `life_cycle_status` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 9 | `materialClassId` | 物料分类ID | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 10 | `authenticationStatus` | 认证状态 | `authentication_status` | String | `text` |  | ✓ |
| 11 | `materialId` | 物料Id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 12 | `blacklistReason` | 加入黑名单原因 | `blacklist_reason` | String | `text` |  | ✓ |
| 13 | `materialSkuId` | 物料SKU | `material_sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | ✓ |
| 14 | `blacklistTime` | 黑名单日期 | `blacklist_time` | DateTime | `timestamp` |  | ✓ |
| 15 | `materialUnit` | 物料单位 | `material_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 16 | `busiScope` | 业务类型 | `busi_scope` | String | `text` |  | ✓ |
| 17 | `project` | 项目id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 18 | `chanelid` | 电商渠道 | `chanelid` | Long | `long` |  | ✓ |
| 19 | `purchaseClassId` | 采购分类Id | `purchase_class_id` | ec3f827d-4cff-462d-b74c-1dd556c96baa | `quote` |  | ✓ |
| 20 | `commonName` | 行业通用名称 | `common_name` | String | `text` |  | ✓ |
| 21 | `purchaseOrgId` | 所属组织ID | `purchase_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 22 | `sourceBillType` | 来源单据类型 | `source_bIll_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |  | ✓ |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 24 | `sourceTransType` | 来源交易类型 | `source_trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 25 | `creator` | 创建人姓名 | `creator` | String | `text` |  | ✓ |
| 26 | `supplierId` | 供应商企业ID | `supplier_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 27 | `customerName` | 采购商企业名称 | `customer_name` | String | `text` |  | ✓ |
| 28 | `supplyDocClass` | 供应商分类ID | `supply_doc_class` | 59ec0b4d-4e38-483d-9bdd-e7aa44176ce8 | `quote` |  | ✓ |
| 29 | `docCode` | 来源单据号 | `doc_code` | String | `text` |  | ✓ |
| 30 | `supplyDocId` | 供应商档案 | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 31 | `docId` | 单据id | `doc_id` | Long | `long` |  | ✓ |
| 32 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | ✓ |
| 33 | `docName` | 单据名称 | `doc_Name` | String | `text` |  | ✓ |
| 34 | `dr` | 逻辑删除标记位 | `dr` | Integer | `int` |  | ✓ |
| 35 | `evaluationLevel` | 评价等级 | `evaluation_level` | String | `text` |  | ✓ |
| 36 | `evaluationScore` | 评价得分 | `evaluation_score` | String | `text` |  | ✓ |
| 37 | `evaluationStatus` | 评价状态 | `evaluation_status` | String | `text` |  | ✓ |
| 38 | `frozenLink` | 冻结环节 | `frozen_link` | String | `text` |  | ✓ |
| 39 | `freezingEndTime` | 冻结结束时间 | `freezing_end_time` | DateTime | `timestamp` |  | ✓ |
| 40 | `freezingReason` | 冻结原因 | `freezing_reason` | String | `text` |  | ✓ |
| 41 | `freezingStartTime` | 冻结开始时间 | `freezing_start_time` | DateTime | `timestamp` |  | ✓ |
| 42 | `gradeId` | 等级id | `grade_id` | Long | `long` |  | ✓ |
| 43 | `gradeName` | 等级名称 | `grade_name` | String | `text` |  | ✓ |
| 44 | `gradeValueId` | 等级对应的值的id | `grade_value_id` | Long | `long` |  | ✓ |
| 45 | `gradeValueName` | 等级对应的值的名称 | `grade_value_name` | String | `text` |  | ✓ |
| 46 | `hideInHead` | 是否参与首页展示 | `hide_in_head` | Boolean | `switch` |  | ✓ |
| 47 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 48 | `imgurl` | 图片路径 | `imgurl` | String | `text` |  | ✓ |
| 49 | `innercode` | 超市类目层级码 | `innercode` | String | `text` |  | ✓ |
| 50 | `isPushedERP` | 是否已推送ERP 1是 0否 | `is_pushed_erp` | Boolean | `switch` |  | ✓ |
| 51 | `keyData` | 关键数据项 | `key_data` | String | `text` |  | ✓ |
| 52 | `lookat` | 维度 | `lookat` | String | `text` |  | ✓ |
| 53 | `mallclassId` | 超市类目ID | `mallclass_id` | Long | `long` |  | ✓ |
| 54 | `materialSpec` | 物料规格 | `material_spec` | Long | `long` |  | ✓ |
| 55 | `materialUnitName` | 物料单位名称 | `material_unit_name` | String | `text` |  | ✓ |
| 56 | `maximumPrice` | 最高限价 | `maximum_price` | Decimal | `number` |  | ✓ |
| 57 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 58 | `minOrderQuantity` | 最小起订量 | `min_order_quantity` | Decimal | `number` |  | ✓ |
| 59 | `modifiedtime` | 创建时间 | `modified_time` | DateTime | `timestamp` |  | ✓ |
| 60 | `modifier` | 修改人姓名 | `modifier` | String | `text` |  | ✓ |
| 61 | `oldprice` | 上次价格 | `oldprice` | Decimal | `number` |  | ✓ |
| 62 | `openPrice` | 公开未税价 | `open_price` | Decimal | `number` |  | ✓ |
| 63 | `openTaxprice` | 公开含税价 | `open_taxprice` | Decimal | `number` |  | ✓ |
| 64 | `price` | 未税价 | `price` | Decimal | `number` |  | ✓ |
| 65 | `priceId` | 价格协议ID | `price_id` | Long | `long` |  | ✓ |
| 66 | `productCode` | 商品编码 | `product_code` | String | `text` |  | ✓ |
| 67 | `productId` | 商品ID | `product_id` | Long | `long` |  | ✓ |
| 68 | `productName` | 商品名称 | `product_name` | String | `text` |  | ✓ |
| 69 | `productSpec` | 商品规格 | `product_spec` | String | `text` |  | ✓ |
| 70 | `productSubject` | 商品标题 | `product_subject` | String | `text` |  | ✓ |
| 71 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 72 | `purchaseMultiple` | 采购倍量 | `purchase_multiple` | Decimal | `number` |  | ✓ |
| 73 | `purchaseOrgName` | 所属组织名称 | `purchase_org_name` | String | `text` |  | ✓ |
| 74 | `purchasetype` | 供货类型 | `purchasetype` | String | `text` |  | ✓ |
| 75 | `quotaType` | 报价方式 | `quota_type` | String | `text` |  | ✓ |
| 76 | `riskStatus` | 风险状态 | `risk_status` | String | `text` |  | ✓ |
| 77 | `salesVolume` | 销量 | `sales_volume` | Long | `long` |  | ✓ |
| 78 | `showingLable` | 电商渠道名称 | `showing_lable` | String | `text` |  | ✓ |
| 79 | `skucode` | sku编码 | `skucode` | String | `text` |  | ✓ |
| 80 | `skuid` | skuid | `skuid` | Long | `long` |  | ✓ |
| 81 | `source` | 数据来源 | `source` | String | `text` |  | ✓ |
| 82 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 83 | `sourceId` | 来源单据id | `source_id` | String | `text` |  | ✓ |
| 84 | `status` | 状态 | `status` | String | `text` |  | ✓ |
| 85 | `stock` | 库存量 | `stock` | Decimal | `number` |  | ✓ |
| 86 | `supplierName` | 供应商企业名称 | `supplier_name` | String | `text` |  | ✓ |
| 87 | `supplyablity` | 供货说明 | `supplyablity` | String | `text` |  | ✓ |
| 88 | `SupplycategoryDefineCharacter` | 供货目录自定义项 | `defineCharacter` | 6f69e7cd-4418-4593-bf98-eae5ef5e3380 | `UserDefine` |  | ✓ |
| 89 | `SupplycategoryFreeCharacteristics` | 物料自由项特征组 | `instance_id` | d9ef4887-e009-4b18-96d4-6df2f214ac01 | `FreeCT` |  | ✓ |
| 90 | `taxprice` | 含税价 | `taxprice` | Decimal | `number` |  | ✓ |
| 91 | `taxrate` | 税率 | `taxrate` | Decimal | `number` |  | ✓ |
| 92 | `title` | 商品名称 | `title` | String | `text` |  | ✓ |
| 93 | `transparentPurchaseNo` | 阳光流水号 | `transparent_purchase_no` | String | `text` |  | ✓ |
| 94 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 95 | `type` | 允销类型 | `type` | String | `text` |  | ✓ |
| 96 | `unit` | 商品单位 | `unit` | String | `text` |  | ✓ |
| 97 | `validtime` | 有效期 | `validtime` | DateTime | `timestamp` |  | ✓ |
| 98 | `v_materialClassId` | 虚拟字段 | `v_materialClassId` | Long | `long` |  | ✓ |
| 99 | `v_materialId` | 虚拟字段 | `v_materialId` | Long | `long` |  | ✓ |
| 100 | `v_purchaseClassId` | 虚拟字段 | `v_purchaseClassId` | Long | `long` |  | ✓ |
| 101 | `v_supplyDocId` | 虚拟字段 | `v_supplyDocId` | Long | `long` |  | ✓ |
| 102 | `increType` | 操作类型 | `incre_type` | String | `text` |  | ✓ |
| 103 | `defines` | 供货目录自定义项 | `` | 143f7b0c-e966-45ac-8a2d-c24671ecc171 | `` |  |  |
| 104 | `supplyCategopry` | 供货目录子表 | `` | b6ab87f9-4e96-4f02-b554-1aae67464053 | `` |  |  |

---

## 关联属性（共 21 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purchaseClassId` | 采购分类Id | `pc.cls.PurchaseClass` | `purchase_class_id` |  →  |  |  | Service |  |
| 2 | `supplyCategopry` | 供货目录子表 | `cpubase.supplycategory.SupplycategoryBody` | `` | supplyCategopry → supplycategoryId | 0..n | true | None |  |
| 3 | `supplierId` | 供应商企业ID | `cpu-privilege.enterprise.EnterprisePOJO` | `supplier_id` |  →  |  |  | Service |  |
| 4 | `authenticationLevelSystem` | 认证等级体系 | `aa.supplyability.SupplyAbilityDetail` | `authentication_level_system` |  →  |  |  | Service |  |
| 5 | `materialClassId` | 物料分类ID | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 6 | `materialSkuId` | 物料SKU | `pc.product.ProductSKU` | `material_sku_id` |  →  |  |  | Service |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 8 | `cooperationLevel` | 合作等级 | `aa.supplyability.SupplyAbilityDetail` | `cooperation_level` |  →  |  |  | Service |  |
| 9 | `SupplycategoryDefineCharacter` | 供货目录自定义项 | `cpubase.supplycategory.DefineCharacter` | `defineCharacter` |  →  |  |  | None |  |
| 10 | `evaluationLevelSystem` | 评价等级体系 | `aa.supplyability.SupplyAbilityDetail` | `evaluation_level_system` |  →  |  |  | Service |  |
| 11 | `project` | 项目id | `bd.project.ProjectVO` | `project_id` |  →  |  |  | Service |  |
| 12 | `supplyDocId` | 供应商档案 | `aa.vendor.Vendor` | `supply_doc_id` |  →  |  |  | Service |  |
| 13 | `purchaseOrgId` | 所属组织ID | `org.func.BaseOrg` | `purchase_org_id` |  →  |  |  | Service |  |
| 14 | `sourceTransType` | 来源交易类型 | `bd.bill.TransType` | `source_trans_type` |  →  |  |  | Service |  |
| 15 | `materialId` | 物料Id | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 16 | `materialUnit` | 物料单位 | `pc.unit.Unit` | `material_unit` |  →  |  |  | Service |  |
| 17 | `defines` | 供货目录自定义项 | `cpubase.supplycategory.SupplycategoryDefine` | `` | defines → id | 1 | true | None | ⚠️ |
| 18 | `SupplycategoryFreeCharacteristics` | 物料自由项特征组 | `cpubase.supplycategory.SupplycategoryCharacteristicsDefine` | `instance_id` |  →  |  |  | None |  |
| 19 | `supplyDocClass` | 供应商分类ID | `aa.vendorclass.VendorClass` | `supply_doc_class` |  →  |  |  | Service |  |
| 20 | `sourceBillType` | 来源单据类型 | `bd.bill.BillTypeVO` | `source_bIll_type` |  →  |  |  | Service |  |
| 21 | `lifeCycleStatus` | 生命周期状态 | `aa.supplyability.SupplyAbilityDetail` | `life_cycle_status` |  →  |  |  | Service |  |

### Composition（子表）

- **supplyCategopry**: `supplyCategopry` → `cpubase.supplycategory.SupplycategoryBody` | 0..n
- **defines**: `defines` → `cpubase.supplycategory.SupplycategoryDefine` | 1 ⚠️ 已废弃

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purchaseClassId` (采购分类Id) | `pc.cls.PurchaseClass` | `purchase_class_id` |
| `supplierId` (供应商企业ID) | `cpu-privilege.enterprise.EnterprisePOJO` | `supplier_id` |
| `authenticationLevelSystem` (认证等级体系) | `aa.supplyability.SupplyAbilityDetail` | `authentication_level_system` |
| `materialClassId` (物料分类ID) | `pc.cls.ManagementClass` | `material_class_id` |
| `materialSkuId` (物料SKU) | `pc.product.ProductSKU` | `material_sku_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `cooperationLevel` (合作等级) | `aa.supplyability.SupplyAbilityDetail` | `cooperation_level` |
| `evaluationLevelSystem` (评价等级体系) | `aa.supplyability.SupplyAbilityDetail` | `evaluation_level_system` |
| `project` (项目id) | `bd.project.ProjectVO` | `project_id` |
| `supplyDocId` (供应商档案) | `aa.vendor.Vendor` | `supply_doc_id` |
| `purchaseOrgId` (所属组织ID) | `org.func.BaseOrg` | `purchase_org_id` |
| `sourceTransType` (来源交易类型) | `bd.bill.TransType` | `source_trans_type` |
| `materialId` (物料Id) | `pc.product.Product` | `material_id` |
| `materialUnit` (物料单位) | `pc.unit.Unit` | `material_unit` |
| `supplyDocClass` (供应商分类ID) | `aa.vendorclass.VendorClass` | `supply_doc_class` |
| `sourceBillType` (来源单据类型) | `bd.bill.BillTypeVO` | `source_bIll_type` |
| `lifeCycleStatus` (生命周期状态) | `aa.supplyability.SupplyAbilityDetail` | `life_cycle_status` |
