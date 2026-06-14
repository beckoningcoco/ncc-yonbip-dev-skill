---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "suppliermgr.target.Target"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 指标主表 (`suppliermgr.target.Target`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_target` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `suppliermgr.target.Target` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 指标主表 |
| 物理表 | `cpu_target` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `a1d38d4b-6677-4d2f-b58d-f86e444157fa` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:47.6520` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:45:59:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202603050941_metadata_suppliermgr-target_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `036d4a71-02a2-416d-9c06-60c7ebb51884`

## 业务场景

- `extdevelop`
- `FieldAuth`
- `UITemplate`
- `DataAuth`
- `imextmp`
- `billcode`
- `userdefine`

## 术语标记

`isMain`, `MasterData`

## 约束

- **target** (transformKey): 指标 — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 停用信息 (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| 3 | 档案状态 (`Enable`) | `common.base.Enable` | 98 | 3 |
| 4 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 直接属性（共 36 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `algorithmLinkID` | 算法链接 | `algorithm_link` | String | `text` |  | ✓ |
| 2 | `autoTarget` | 自动指标 | `auto_target` | String | `text` |  | ✓ |
| 3 | `autoTargetSource` | 自动指标来源 | `autoTarget_source` | AutoTargetSource | `` |  | ✓ |
| 4 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 5 | `description` | 指标描述 | `description` | String | `text` |  | ✓ |
| 6 | `details` | 指标管理明细表 | `` | ca4e8b7d-09ec-4ef5-8ca1-899ff746f42f | `` |  |  |
| 7 | `disablets` | 停用时间 | `disablets` | DateTime | `timestamp` |  | ✓ |
| 8 | `enable` | 状态:1启用 0停用 | `enable` | String | `text` |  | ✓ |
| 9 | `enablets` | 启用时间 | `enablets` | DateTime | `timestamp` |  | ✓ |
| 10 | `extend` | 指标管理扩展表 | `` | 88ce2d4e-3597-49ef-8fd3-06f12e732dcb | `` |  |  |
| 11 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 12 | `indDefaultScore` | 默认值 | `ind_default_score` | String | `text` |  | ✓ |
| 13 | `isSys` | 是否预置 | `is_sys` | Short | `short` |  | ✓ |
| 14 | `name` | 指标名称 | `name` | String | `text` |  | ✓ |
| 15 | `orgId` | 组织ID | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 16 | `parentCategoryId` | 所属分类 | `parent_id` | ad912949-efeb-43a5-9a00-1de3af2b3f0c | `quote` |  | ✓ |
| 17 | `platformTargetCode` | 对应平台指标编码 | `platform_target_code` | String | `text` |  | ✓ |
| 18 | `platformTargetID` | 对应平台指标 | `platform_target` | Long | `long` |  | ✓ |
| 19 | `platformTargetMetric` | 维度 | `platform_target_metric` | String | `text` |  | ✓ |
| 20 | `platformTargetName` | 对应平台指标名称 | `platform_target_name` | String | `text` |  | ✓ |
| 21 | `priceFormulaID` | 价格公式 | `price_formula` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 | `quote` |  | ✓ |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 23 | `rangeUnit` | 值域单位 | `range_unit` | String | `text` |  | ✓ |
| 24 | `reviewType` | 评审类型:0评审 1投票 | `review_type` | String | `text` |  | ✓ |
| 25 | `rowDataLinkID` | 原始数据链接 | `row_dataLink` | String | `text` |  | ✓ |
| 26 | `scoreClass` | 评分类 | `score_class` | String | `text` |  | ✓ |
| 27 | `scoringBasis` | 评分依据 | `scoring_basis` | String | `text` |  | ✓ |
| 28 | `starShowMode` | 展示方式:0星形 1心形 | `star_show_mode` | String | `text` |  | ✓ |
| 29 | `starTotal` | 总星级 | `star_total` | Integer | `int` |  | ✓ |
| 30 | `stopstatus` | 停用状态 | `stopstatus` | Boolean | `switch` |  | ✓ |
| 31 | `stoptime` | 停用时间 | `stop_time` | DateTime | `timestamp` |  | ✓ |
| 32 | `targetType` | 指标类型 | `target_type` | TargetType | `` |  | ✓ |
| 33 | `tenantId` | tenantId | `tenant_id` | String | `text` |  | ✓ |
| 34 | `userDefineCharacter` | 指标管理特征实体 | `user_define_character` | bb2852dc-bfee-41e5-bbd1-861d3fec4bb1 | `UserDefine` |  | ✓ |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 36 | `ytenantId` | ytenantId | `ytenant_id` | String | `text` |  | ✓ |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `extend` | 指标管理扩展表 | `suppliermgr.target.TargetExtend` | `` | extend → id | 1 | true | None |  |
| 2 | `priceFormulaID` | 价格公式 | `aa.priceformula.PriceFormula` | `price_formula` |  →  |  |  | Service |  |
| 3 | `userDefineCharacter` | 指标管理特征实体 | `suppliermgr.target.TargetCharacter` | `user_define_character` |  →  |  |  | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `parentCategoryId` | 所属分类 | `suppliermgr.target.TargetClass` | `parent_id` | classes → parentCategoryId | 0..n | true | None |  |
| 6 | `details` | 指标管理明细表 | `suppliermgr.target.TargetDetail` | `` | details → mainId | 0..n | true | None |  |
| 7 | `orgId` | 组织ID | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **extend**: `extend` → `suppliermgr.target.TargetExtend` | 1
- **parentCategoryId**: `classes` → `suppliermgr.target.TargetClass` | 0..n
- **details**: `details` → `suppliermgr.target.TargetDetail` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `priceFormulaID` (价格公式) | `aa.priceformula.PriceFormula` | `price_formula` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `orgId` (组织ID) | `bd.adminOrg.BaseOrgVO` | `org_id` |
