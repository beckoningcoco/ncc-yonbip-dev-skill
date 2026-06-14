---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "business.rule.BusinessRuleScene"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务场景 (`business.rule.BusinessRuleScene`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_business_rule_scene` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `business.rule.BusinessRuleScene` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务场景 |
| 物理表 | `cpu_business_rule_scene` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `7707b871-97e0-4d98-9043-319b6958b26b` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:15:58.4480` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:38:04:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202511251647_metadata_business-rule_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `73e06e01-4ef1-4e77-8b3b-3b3b05ebaee6`

## 业务场景

- `dataMultilanguage`

## 术语标记

`ConfigData`

## 约束

- **BusinessRuleSceneCode** (transformKey): BusinessRuleSceneCode — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 22 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyBillTypes` | 业务场景适用单据类型 | `` | b6cb2df8-942b-4531-a8b8-2312553bb9d4 | `` |  |  |
| 2 | `businessType` | 业务类型 | `business_type` | Integer | `int` |  | ✓ |
| 3 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 4 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 7 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 8 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 9 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 10 | `microServiceCode` | 微服务编码 | `micro_service_code` | String | `text` |  | ✓ |
| 11 | `name` | 名称 | `name` | String | `multiLanguage` |  | ✓ |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 13 | `queryAdaptor` | 查询适配器 | `query_adaptor` | String | `text` |  | ✓ |
| 14 | `queryDomain` | 查询适配器服务域 | `query_domain` | String | `text` |  | ✓ |
| 15 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 16 | `returnFields` | 业务场景返回字段关系表 | `` | 55e47a6a-7178-4d04-b5f5-11b66c1bc040 | `` |  |  |
| 17 | `sceneClassId` | 业务场景分类 | `scene_class_id` | dd065850-fd3b-4393-a8e3-52032a2bbf1b | `quote` |  | ✓ |
| 18 | `sceneRecommendedQuantity` | 场景最大推荐数量 | `scene_recommended_quantity` | Integer | `int` |  | ✓ |
| 19 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 20 | `targetBillId` | 目标单据标识 | `target_bill_id` | a202589a-7c24-4fcd-b939-619be0591489 | `quote` |  | ✓ |
| 21 | `targetBillTypes` | 业务场景目标单据类型 | `` | 8727a12b-91c7-4d37-9172-2d70b3571c52 | `` |  |  |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `targetBillId` | 目标单据标识 | `business.rule.BusinessRuleBillType` | `target_bill_id` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `sceneClassId` | 业务场景分类 | `business.rule.BusinessRuleSceneClass` | `scene_class_id` |  →  |  |  | None |  |
| 4 | `returnFields` | 业务场景返回字段关系表 | `business.rule.BusinessRuleSceneReturnField` | `` | returnFields → sceneId | 0..n | true | None |  |
| 5 | `applyBillTypes` | 业务场景适用单据类型 | `business.rule.BusinessRuleSceneApplyBillType` | `` | applyBillTypes → sceneId | 1..n | true | None |  |
| 6 | `targetBillTypes` | 业务场景目标单据类型 | `business.rule.BusinessRuleSceneTargetBillType` | `` | targetBillTypes → sceneId | 0..n | true | None |  |

### Composition（子表）

- **returnFields**: `returnFields` → `business.rule.BusinessRuleSceneReturnField` | 0..n
- **applyBillTypes**: `applyBillTypes` → `business.rule.BusinessRuleSceneApplyBillType` | 1..n
- **targetBillTypes**: `targetBillTypes` → `business.rule.BusinessRuleSceneTargetBillType` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
