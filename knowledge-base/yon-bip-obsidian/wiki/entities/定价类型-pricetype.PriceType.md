---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.pricetype.PriceType"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定价类型 (`aa.pricetype.PriceType`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_pricetype` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.pricetype.PriceType` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定价类型 |
| 物理表 | `cpu_price_pricetype` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `1f8d20d3-2ef1-455f-9be9-c80588c21d4a` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:19.1380` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `code` | `code` | String | 定价类型编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:01:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202603101359_metadata_aa-pricetype_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `bd4a8535-f480-4c9c-92ab-91e90a45709d`

## 业务场景

- `dataMultilanguage`
- `billcode`

## 术语标记

`ConfigData`, `isMain`

## 约束

- **code,ytenant_transform** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 4 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 5 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 6 | 系统预置 (`PreSet`) | `aa.pricestrategy.PreSet` | 14 | 1 |

---

## 直接属性（共 36 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 定价类型编码 | `code` | String | `text` |  | ✓ |
| 2 | `name` | 定价类型名称 | `name` | String | `multiLanguage` |  | ✓ |
| 3 | `priceItem` | 定价项 | `price_item` | PriceItem | `` |  | ✓ |
| 4 | `tax` | 是否含税 | `tax` | Ladder | `` |  | ✓ |
| 5 | `priceLevel` | 定价等级 | `price_level` | PriceLevel | `` |  | ✓ |
| 6 | `ladderNum` | 是否数量阶梯 | `ladder_num` | Ladder | `` |  | ✓ |
| 7 | `ladderNumType` | 阶梯数量类型 | `ladder_num_type` | LadderType | `` |  | ✓ |
| 8 | `id` | id | `id` | Long | `long` |  | ✓ |
| 9 | `bformula` | 公式变量 | `bformula` | Short | `short` |  | ✓ |
| 10 | `classId` | 定价类型分类 | `class_id` | 95fe9dd1-64c2-4846-8564-90ae3f011796 | `quote` |  | ✓ |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 12 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 13 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 14 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 15 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 16 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 17 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 18 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 20 | `orgId` | 管理组织 | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 21 | `preSet` | 是否系统预置 | `preSet` | String | `text` |  | ✓ |
| 22 | `priceOrderCode` | 定价类型编码 | `priceorder_code` | String | `text` |  | ✓ |
| 23 | `priceOrderName` | 定价类型名称 | `priceorder_name` | String | `text` |  | ✓ |
| 24 | `priceProcess` | 价格处理方式 | `price_process` | String | `text` |  | ✓ |
| 25 | `priceSource` | 价格目录价格来源 | `price_source` | String | `text` |  | ✓ |
| 26 | `priceType` | 价格来源类型 | `price_type` | Short | `short` |  | ✓ |
| 27 | `priceTypeObjectList` | 定价类型单据属性 | `` | 8f17e4a4-96ef-422b-b7c3-fa18e180ee14 | `` |  |  |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 29 | `souAttr` | 关联单据属性 | `sou_attr` | String | `text` |  | ✓ |
| 30 | `souAttrName` | 关联单据属性名称 | `sou_attr_name` | String | `text` |  | ✓ |
| 31 | `souAttrNameResid` | 关联单据属性名称多语资源码 | `sou_attr_name_resid` | String | `text` |  | ✓ |
| 32 | `souObject` | 关联单据 | `sou_object` | String | `text` |  | ✓ |
| 33 | `souObjectName` | 关联单据名称 | `sou_object_name` | String | `text` |  | ✓ |
| 34 | `souObjectNameResid` | 关联单据名称多语资源码 | `sou_object_name_resid` | String | `text` |  | ✓ |
| 35 | `valueSource` | 价格来源 | `value_source` | Short | `short` |  | ✓ |
| 36 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `classId` | 定价类型分类 | `aa.priceformula.PriceFactorClass` | `class_id` |  →  |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `priceTypeObjectList` | 定价类型单据属性 | `aa.pricetype.PriceTypeObject` | `` | priceTypeObjectList → priceType | 0..n | true | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 6 | `orgId` | 管理组织 | `org.func.BaseOrg` | `orgid` |  →  |  |  | Service |  |

### Composition（子表）

- **priceTypeObjectList**: `priceTypeObjectList` → `aa.pricetype.PriceTypeObject` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `orgId` (管理组织) | `org.func.BaseOrg` | `orgid` |
