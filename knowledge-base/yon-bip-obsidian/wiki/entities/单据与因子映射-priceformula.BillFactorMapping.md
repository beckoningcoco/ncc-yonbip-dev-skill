---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.priceformula.BillFactorMapping"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 单据与因子映射 (`aa.priceformula.BillFactorMapping`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`bill_factor_mapping` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.priceformula.BillFactorMapping` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单据与因子映射 |
| 物理表 | `bill_factor_mapping` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `8da20156-bf1e-4015-8037-4d3fa4523d28` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:11.1720` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `mapping_attribute` | `mapping_attribute` | String | 映射单据属性字段（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:06:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604150925_metadata_aa-priceformula_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `cab57afe-8429-47c8-8eec-e01d4dc9effa`

## 术语标记

`ConfigData`

## 约束

- **id** (transformKey): 主键 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 2 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 31 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `formId` | 表单id | `form_id` | String | `text` |  | ✓ |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 4 | `billType` | 应用因子单据类型id | `bill_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |  | ✓ |
| 5 | `applyFactorType` | 应用因子类型 | `apply_factor_type` | ApplyFactorType | `` |  | ✓ |
| 6 | `factor` | 价格因子id | `factor` | 5cf7014b-8d50-40b9-b2a0-bc00ad18e423 | `quote` |  | ✓ |
| 7 | `forFacSouObj` | 因子来源对象 | `for_fac_sou_obj` | String | `multiLanguage` |  | ✓ |
| 8 | `forFacSouObjUri` | 因子来源对象URI | `for_fac_sou_obj_uri` | String | `text` |  | ✓ |
| 9 | `mappingEntityName` | 映射单据实体 | `mapping_entity_name` | String | `multiLanguage` |  | ✓ |
| 10 | `mappingAttributeName` | 映射单据属性 | `mapping_attribute_name` | String | `multiLanguage` |  | ✓ |
| 11 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 12 | `mappingAttribute` | 映射单据属性字段 | `mapping_attribute` | String | `text` |  | ✓ |
| 13 | `mappingEntityUri` | 映射单据实体Uri | `mapping_entity_uri` | String | `text` |  | ✓ |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 15 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 16 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 17 | `dimensionField` | 价表维度 | `dimension_field` | String | `text` |  | ✓ |
| 18 | `dimensionType` | 维度类型 | `dimension_type` | String | `text` |  | ✓ |
| 19 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 20 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 21 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 22 | `forFacSouObjAttribute` | 获取来源对象中的属性(一般是主表id外键) | `for_fac_sou_obj_attribute` | String | `text` |  | ✓ |
| 23 | `initialize` | 系统预置 | `initialize` | Initialize | `singleOption` |  | ✓ |
| 24 | `mappingAttributeNameResid` | 映射单据属性多语字段 | `mapping_attribute_name_resid` | String | `text` |  | ✓ |
| 25 | `mappingEntityNameResid` | 映射单据实体多语字段 | `mapping_entity_name_resid` | String | `text` |  | ✓ |
| 26 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 27 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 29 | `pathRoleaMulti` | 成员变量层级组合关系 | `pathRoleaMulti` | String | `text` |  | ✓ |
| 30 | `pathurlforgetvalue` | 成员变量层级关系 | `pathurlforgetvalue` | String | `text` |  | ✓ |
| 31 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `billType` | 应用因子单据类型id | `bd.bill.BillTypeVO` | `bill_type` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `factor` | 价格因子id | `aa.priceformula.PriceFactor` | `factor` |  →  |  |  | None |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `billType` (应用因子单据类型id) | `bd.bill.BillTypeVO` | `bill_type` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
