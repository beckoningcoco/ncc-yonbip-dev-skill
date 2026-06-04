---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.gdscenter.GdsourceMaterial"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 货源下单物料信息 (`cpubase.gdscenter.GdsourceMaterial`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_gdsource_material` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.gdscenter.GdsourceMaterial` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 货源下单物料信息 |
| 物理表 | `cpu_gdsource_material` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:25:07.3010` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:52:56:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202601191702_metadata_cpubase-gdscenter_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `f75641ce-0e9d-4e1e-89c2-571b4225a738`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 48 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `srcTranstypeId` | 来源单据交易类型id | `src_transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 2 | `pcunitId` | 采购单位id | `pcunit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 3 | `munitId` | 主单位id | `munit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 4 | `pirate` | 计价换算率 | `pirate` | Decimal | `number` |  | ✓ |
| 5 | `upLineno` | 上游单据行号 | `up_lineno` | String | `text` |  | ✓ |
| 6 | `upBillcode` | 上游单据单据号 | `up_billcode` | String | `text` |  | ✓ |
| 7 | `strategy` | 方案策略 | `strategy` | Integer | `int` |  | ✓ |
| 8 | `munitPrecision` | 主单位精度 | `munit_precision` | Integer | `int` |  | ✓ |
| 9 | `piunitPrecision` | 计价单位精度 | `piunit_precision` | Integer | `int` |  | ✓ |
| 10 | `pcunitPrecision` | 采购单位精度 | `pcunit_precision` | Integer | `int` |  | ✓ |
| 11 | `checkCurrency` | 是否严格匹配币种 | `check_currency` | String | `text` |  | ✓ |
| 12 | `GdsourceMaterialChmId` | 物料自由项特征组 | `chm_id` | 61ce8143-14d2-4201-a8c8-487c1a86b17f | `FreeCT` |  | ✓ |
| 13 | `GdsourceMaterialChdId` | 货源下单自定义项 | `chd_id` | 2335857c-f95d-495d-9acf-7d0e197228b8 | `UserDefine` |  | ✓ |
| 14 | `EbusinessType` | 业务场景 | `ebusiness_type` | String | `text` |  | ✓ |
| 15 | `businessDate` | 业务日期 | `business_date` | DateTime | `timestamp` |  | ✓ |
| 16 | `mnum` | 主数量 | `mnum` | Decimal | `number` |  | ✓ |
| 17 | `primaryId` | 来源表头id | `primary_id` | Long | `long` |  | ✓ |
| 18 | `BrandId` | 品牌 | `brand_id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |  | ✓ |
| 19 | `orgId` | 采购组织 | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 20 | `agreeId` | 配额协议ID | `agree_id` | 7c5859b8-7389-4dff-9fe8-4307e8557b30 | `quote` |  | ✓ |
| 21 | `pcrate` | 采购换算率 | `pcrate` | Decimal | `number` |  | ✓ |
| 22 | `operationId` | 工序主键 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 | `quote` |  | ✓ |
| 23 | `strategyId` | 货源策略ID | `strategy_id` | 7086e92b-1953-40ed-bdfc-4e889b76b562 | `quote` |  | ✓ |
| 24 | `currency` | 币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 25 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 27 | `piunitId` | 计价单位id | `piunit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 28 | `demandPerId` | 需求人id | `demand_Per_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 29 | `reqUapProjectId` | 需求项目 | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 30 | `materialClassId` | 物料分类id | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 31 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 32 | `billType` | 单据类型 | `bill_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |  | ✓ |
| 33 | `executablepqnum` | 可执行采购数量 | `executablepqnum` | Decimal | `number` |  | ✓ |
| 34 | `pcnum` | 采购数量 | `pcnum` | Decimal | `number` |  | ✓ |
| 35 | `childId` | 来源表体id | `child_id` | Long | `long` |  | ✓ |
| 36 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 37 | `gdsourceId` | 货源下单ID | `gdsource_id` | 9cb1ff2e-0170-49b2-8494-82ff2e65e82b | `quote` |  | ✓ |
| 38 | `pordersum` | 本次下单合计 | `pordersum` | Decimal | `number` |  | ✓ |
| 39 | `demandOrgId` | 需求组织id | `demand_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 40 | `pinum` | 计价数量 | `pinum` | Decimal | `number` |  | ✓ |
| 41 | `demandDate` | 需求时间 | `demand_date` | DateTime | `timestamp` |  | ✓ |
| 42 | `demandDepId` | 需求部门id | `demand_dep_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 43 | `businessType` | 业务类型 | `business_type` | String | `text` |  | ✓ |
| 44 | `gdsourceOrderdetails` | 货源下单详情 | `` | 7c32487b-b182-4e51-a446-1b86ec5573c8 | `` |  |  |
| 45 | `pcrateDen` | 采购换算率分母 | `pcrateden` | Decimal | `number` |  | ✓ |
| 46 | `pcrateNum` | 采购换算率分子 | `pcratenum` | Decimal | `number` |  | ✓ |
| 47 | `pirateDen` | 计价换算率分母 | `pirateden` | Decimal | `number` |  | ✓ |
| 48 | `pirateNum` | 计价换算率分子 | `piratenum` | Decimal | `number` |  | ✓ |

---

## 关联属性（共 22 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `demandPerId` | 需求人id | `bd.staff.Staff` | `demand_Per_id` |  →  |  |  | Service |  |
| 2 | `piunitId` | 计价单位id | `pc.unit.Unit` | `piunit_id` |  →  |  |  | Service |  |
| 3 | `munitId` | 主单位id | `pc.unit.Unit` | `munit_id` |  →  |  |  | Service |  |
| 4 | `pcunitId` | 采购单位id | `pc.unit.Unit` | `pcunit_id` |  →  |  |  | Service |  |
| 5 | `srcTranstypeId` | 来源单据交易类型id | `bd.bill.TransType` | `src_transtype_id` |  →  |  |  | Service |  |
| 6 | `reqUapProjectId` | 需求项目 | `bd.project.ProjectVO` | `req_uap_project_id` |  →  |  |  | Service |  |
| 7 | `materialClassId` | 物料分类id | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 8 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 9 | `gdsourceOrderdetails` | 货源下单详情 | `cpubase.gdscenter.GdsourceOrderdetail` | `` | gdsourceOrderdetails → gdsourceMaterialId | 0..n | true | None |  |
| 10 | `billType` | 单据类型 | `bd.bill.BillTypeVO` | `bill_type` |  →  |  |  | Service |  |
| 11 | `GdsourceMaterialChdId` | 货源下单自定义项 | `cpubase.gdscenter.GdsourceMaterialChd` | `chd_id` |  →  |  |  | None |  |
| 12 | `BrandId` | 品牌 | `pc.brand.Brand` | `brand_id` |  →  |  |  | Service |  |
| 13 | `materialId` | 物料id | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 14 | `gdsourceId` | 货源下单ID | `cpubase.gdscenter.Gdsource` | `gdsource_id` | gdsourceMaterials → gdsourceId | 0..n | true | None |  |
| 15 | `orgId` | 采购组织 | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |
| 16 | `demandOrgId` | 需求组织id | `org.func.BaseOrg` | `demand_org_id` |  →  |  |  | Service |  |
| 17 | `agreeId` | 配额协议ID | `cpubase.quota.QuotaAgreeVO` | `agree_id` |  →  |  |  | None |  |
| 18 | `GdsourceMaterialChmId` | 物料自由项特征组 | `cpubase.gdscenter.GdsourceMaterialChm` | `chm_id` |  →  |  |  | None |  |
| 19 | `operationId` | 工序主键 | `ed.operation.Operation` | `operation_id` |  →  |  |  | Service |  |
| 20 | `currency` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency` |  →  |  |  | Service |  |
| 21 | `strategyId` | 货源策略ID | `cpubase.quota.GoodsStrategyVO` | `strategy_id` |  →  |  |  | None |  |
| 22 | `demandDepId` | 需求部门id | `bd.adminOrg.AdminOrgVO` | `demand_dep_id` |  →  |  |  | Service |  |

### Composition（子表）

- **gdsourceOrderdetails**: `gdsourceOrderdetails` → `cpubase.gdscenter.GdsourceOrderdetail` | 0..n
- **gdsourceId**: `gdsourceMaterials` → `cpubase.gdscenter.Gdsource` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `demandPerId` (需求人id) | `bd.staff.Staff` | `demand_Per_id` |
| `piunitId` (计价单位id) | `pc.unit.Unit` | `piunit_id` |
| `munitId` (主单位id) | `pc.unit.Unit` | `munit_id` |
| `pcunitId` (采购单位id) | `pc.unit.Unit` | `pcunit_id` |
| `srcTranstypeId` (来源单据交易类型id) | `bd.bill.TransType` | `src_transtype_id` |
| `reqUapProjectId` (需求项目) | `bd.project.ProjectVO` | `req_uap_project_id` |
| `materialClassId` (物料分类id) | `pc.cls.ManagementClass` | `material_class_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `billType` (单据类型) | `bd.bill.BillTypeVO` | `bill_type` |
| `BrandId` (品牌) | `pc.brand.Brand` | `brand_id` |
| `materialId` (物料id) | `pc.product.Product` | `material_id` |
| `orgId` (采购组织) | `bd.adminOrg.BaseOrgVO` | `org_id` |
| `demandOrgId` (需求组织id) | `org.func.BaseOrg` | `demand_org_id` |
| `operationId` (工序主键) | `ed.operation.Operation` | `operation_id` |
| `currency` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency` |
| `demandDepId` (需求部门id) | `bd.adminOrg.AdminOrgVO` | `demand_dep_id` |
