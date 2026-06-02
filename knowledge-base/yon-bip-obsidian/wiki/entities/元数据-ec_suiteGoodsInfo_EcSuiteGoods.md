---
tags: [BIP, 元数据, 数据字典, ec, ec.suiteGoodsInfo.EcSuiteGoods]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 套件商品 (`ec.suiteGoodsInfo.EcSuiteGoods`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ec_suite_goods` | 应用: `SDOC` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 套件商品 |
| 物理表 | `ec_suite_goods` |
| 应用 | `SDOC` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `id` | `id` | |

## 部署信息

- 部署时间: 2025-10-24 23:48:01:000
- 安装来源: `/app/omsdata/SRC/dst-service/scripts/db/patch/mongodb/V5_R0_2507/0001_oms/0010_iuap_common/DML/0270_iuap_metadata/202509/20250905/202509051935_metadata_ec-suiteGoodsInfo.zip`

## 术语标记

`MasterData`

## 依赖接口（3 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

---

## 全部属性（20 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `product` | product | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true |
| 2 | `productSku` | productSku | `productsku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | true |
| 3 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 5 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 7 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 8 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 9 | `cust` | ust | `cust_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 10 | `ecSuiteGoods` | ecSuiteGoods | `` | 2279ec57-3af9-4baa-9b35-745e7bdebda9 | `` |  |  |
| 11 | `ecSuiteGoodsCustomCharacter` | ecSuiteGoodsCustomCharacter | `oms_suiteGoods_custom_character` | 19bdb00e-ec7c-4672-9100-e2658c843766 | `UserDefine` |  | true |
| 12 | `itemType` | itemType(类型) | `item_type` | Integer | `int` |  | true |
| 13 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 14 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 17 | `suiteStatus` | suiteStatus(状态) | `suite_status` | EnumEnable | `` |  | true |
| 18 | `synSuitegooddata` | synSuitegooddata | `synSuitegooddata` | Short | `short` |  | true |
| 19 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 20 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（9 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `product` | product | `pc.product.Product` | `product_id` | 外键 |  |  | Service |  |
| 2 | `productSku` | productSku | `pc.product.ProductSKU` | `productsku_id` | 外键 |  |  | Service |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 4 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 5 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 6 | `ecSuiteGoodsCustomCharacter` | ecSuiteGoodsCustomCharacter | `ec.suiteGoodsInfo.EcSuiteGoodsCustomCharacter` | `oms_suiteGoods_custom_character` | 外键 |  |  | None |  |
| 7 | `cust` | ust | `aa.merchant.Merchant` | `cust_id` | 外键 |  |  | Service |  |
| 8 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |
| 9 | `ecSuiteGoods` | ecSuiteGoods | `ec.suiteGoodsInfo.EcSuiteGoodsSub` | `` | ecSuiteGoods → suiteGood | 1..n | Y | None |  |

---

## SQL 示例

```sql
SELECT product_id, productsku_id, id, pubts, create_date, create_time, creator, creatorId
FROM ec_suite_goods
```