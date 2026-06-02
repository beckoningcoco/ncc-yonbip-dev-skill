---
tags: [BIP, 元数据, 数据字典, aa, aa.merchant.MerchantApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 客户适用范围 (`aa.merchant.MerchantApplyRange`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchantapplyrange` | 应用: `DPMCUS` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户适用范围 |
| 物理表 | `merchantapplyrange` |
| 应用 | `DPMCUS` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |

## 部署信息

- 部署时间: 2026-05-22 23:00:18:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0002_customer/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202602021528_metadata_aa-merchant.zip`

## 术语标记

`isAssigned`, `isExtend`, `data_auth`, `MasterData`, `report`, `DirectConnection`

## 依赖接口（3 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IShop (`IShop`) | `base.itf.IShop` | 65 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（28 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `merchantId` | merchantId | `merchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` | true | false |
| 3 | `merchantDetailId` | merchantDetailId | `merchant_detail_id` | 1f145dee-55c4-4ad6-a699-873c8ecc096e | `quote` | false | true |
| 4 | `orgId` | 组织ID | `orgId` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` | false | true |
| 5 | `allocatorId` | allocatorId | `allocator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` | false | true |
| 6 | `allocatorName` | allocator名称 | `allocator_name` | String | `text` | false | true |
| 7 | `allocateTime` | allocateTime(时间) | `allocate_time` | DateTime | `timestamp` | false | true |
| 8 | `shopId` | shopId | `ishopId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` | false | true |
| 9 | `allocateSource` | allocateSource | `allocate_source` | String | `text` | false | true |
| 10 | `rangeType` | rangeType(类型) | `iRangeType` | Integer | `int` | false | true |
| 11 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` | false | true |
| 12 | `isApplied` | 是否Applied | `isApplied` | Boolean | `switch` | false | true |
| 13 | `isSalesOrg` | 是否SalesOrg | `isSalesOrg` | Boolean | `switch` | false | true |
| 14 | `isPotential` | 是否Potential | `ispotential` | Boolean | `switch` | false | true |
| 15 | `noFollowTime` | noFollowTime(时间) | `nofollowtime` | String | `text` | false | true |
| 16 | `recentlyFollowTime` | recentlyFollowTime(时间) | `recentlyfollowtime` | DateTime | `timestamp` | false | true |
| 17 | `positivePeople` | positivePeople | `positivepeople` | String | `text` | false | true |
| 18 | `positiveTime` | positiveTime(时间) | `positivetime` | DateTime | `timestamp` | false | true |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 20 | `controlRuleVersion` | ontrolRuleVersion | `control_rule_version` | Integer | `int` | false | true |
| 21 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 22 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 23 | `shop` | shop | `iShopID` | Long | `long` |  | true |
| 24 | `customerAreas` | ustomerAreas | `` | 978ad259-ade5-4fb3-8aba-cecf550ec9d6 | `` |  |  |
| 25 | `invoicingCustomerss` | nvoicingCustomerss(ID) | `` | d26147af-40a2-464a-a1d5-ff65a15918d3 | `` |  |  |
| 26 | `merchantAppliedDetail` | merchantAppliedDetail | `` | 0b0dd8bc-6aa8-4eed-96d2-4a105e8df8fc | `` |  |  |
| 27 | `merchantDetailForCrm` | merchantDetailForCrm | `` | 6972f9fb-67ad-4183-a43d-dbf1cd61cf10 | `` |  |  |
| 28 | `principals` | principals | `` | 7fdf2726-3ab2-4540-aa0c-4856d76467af | `` |  |  |

## 关联属性（12 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `invoicingCustomerss` | nvoicingCustomerss(ID) | `aa.merchant.InvoicingCustomers` | `` | invoicingCustomerss → merchantApplyRangeId | 0..n | Y | None |  |
| 2 | `merchantId` | merchantId | `aa.merchant.Merchant` | `merchantId` | merchantApplyRanges → merchantId | 1..n | Y | None |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 4 | `merchantDetailForCrm` | merchantDetailForCrm | `aa.merchant.MerchantDetailForCRM` | `` | merchantDetailForCrm → merchantApplyRangeId | 1 | Y | None |  |
| 5 | `merchantAppliedDetail` | merchantAppliedDetail | `aa.merchant.MerchantApplyRangeDetail` | `` | merchantAppliedDetail → merchantApplyRangeId | 1 | Y | None |  |
| 6 | `principals` | principals | `aa.merchant.Principal` | `` | principals → merchantApplyRangeId | 0..n | Y | None |  |
| 7 | `merchantDetailId` | merchantDetailId | `aa.merchant.MerchantDetail` | `merchant_detail_id` | 外键 |  |  | None |  |
| 8 | `shopId` | shopId | `aa.merchant.Merchant` | `ishopId` | 外键 |  |  | None |  |
| 9 | `customerAreas` | ustomerAreas | `aa.merchant.CustomerArea` | `` | customerAreas → merchantApplyRangeId | 0..n | Y | None |  |
| 10 | `allocatorId` | allocatorId | `base.user.User` | `allocator_id` | 外键 |  |  | Service |  |
| 11 | `orgId` | 组织ID | `aa.baseorg.OrgMV` | `orgId` | 外键 |  |  | Service |  |
| 12 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT id, merchantId, merchant_detail_id, orgId, allocator_id, allocator_name, allocate_time, ishopId
FROM merchantapplyrange
```