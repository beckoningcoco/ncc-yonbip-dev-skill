---
tags: [BIP, 元数据, 数据字典, pmc, pmc.giftcard.GiftCard]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 礼品卡主表信息 (`pmc.giftcard.GiftCard`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mk_giftcard` | 应用: `PMC`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |

## 全部属性（31 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `allMemberLevel` | allMemberLevel | `allMemberLevel` | Short | `short` |  | true |
| 2 | `cOrgPath` | cOrgPath | `cOrgPath` | String | `text` |  | true |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 4 | `creator` | 创建人 | `creator` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 5 | `iEnterpriseID` | iEnterpriseID | `iEnterpriseID` | Long | `long` |  | true |
| 6 | `modifier` | 修改人 | `modifier` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 7 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 8 | `name` | 名称 | `name` | String | `text` |  | true |
| 9 | `productPicUrl` | productPicUrl | `productPicUrl` | String | `text` |  | true |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 11 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 12 | `cOrgId` | cOrgID | `cOrgId` | String | `text` |  | true |
| 13 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 14 | `styleId` | styleID | `styleId` | Integer | `int` |  | true |
| 15 | `cImgName` | cImg名称 | `cImgName` | String | `text` |  | true |
| 16 | `giftCardName` | 礼品卡名称 | `giftCardName` | String | `text` |  | true |
| 17 | `giftCardCode` | 礼品卡编码 | `giftCardCode` | String | `text` |  | true |
| 18 | `expireStartDate` | expireStartDate | `expireStartDate` | Date | `date` |  | true |
| 19 | `expireEndDate` | expireEndDate | `expireEndDate` | Date | `date` |  | true |
| 20 | `reduceAmount` | reduceAmount | `reduceAmount` | Decimal | `number` |  | true |
| 21 | `salePrice` | salePrice | `salePrice` | Decimal | `number` |  | true |
| 22 | `status` | 状态 | `status` | Integer | `int` |  | true |
| 23 | `isDelete` | 是否Delete | `isDelete` | Boolean | `switch` |  | true |
| 24 | `cFolder` | cFolder | `cFolder` | String | `text` |  | true |
| 25 | `cOriginalName` | cOriginal名称 | `cOriginalName` | String | `text` |  | true |
| 26 | `fontColor` | fontColor | `fontColor` | String | `text` |  | true |
| 27 | `directionForUse` | directionForUse | `directionForUse` | String | `text` |  | true |
| 28 | `iShopId` | iShopID | `iShopId` | Long | `long` |  | true |
| 29 | `mallcorp` | mallcorp | `iCorpId` | Long | `long` |  | true |
| 30 | `promotionClassId` | promotionClassID | `promotionClassId` | Long | `long` |  | true |
| 31 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（4 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `creator` | `base.user.User` | `creator` |  |  |  |
| 2 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 3 | `modifier` | `base.user.User` | `modifier` |  |  |  |
| 4 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |

## 依赖接口（6 个）

- `IMallcorp` → `base.itf.IMallcorp` (v73)
- `MultiMember` → `promotion.itf.MultiMember` (v16)
- `IMallshop` → `um.base.IMallshop` (v5)
- `IAuditInfo` → `promotion.itf.IAuditInfo` (v67)
- `ITenant` → `base.itf.ITenant` (v73)
- `IYTenantExt` → `ucfbase.ucfbaseItf.IYTenantExt` (v24)

## SQL 示例

```sql
SELECT allMemberLevel, cOrgPath, create_time, creator, iEnterpriseID, modifier, modify_time, name
FROM mk_giftcard
```