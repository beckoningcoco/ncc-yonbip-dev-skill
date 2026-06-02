---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, aa.goodsposition.GoodsPosition]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 货位档案 (`aa.goodsposition.GoodsPosition`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_goodsposition` | 应用: `DPMSI`

## 属性（32 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `barCode` | bar编码 | `barCode` | String | `text` |
| 2 | `charger` | charger | `charger` | String | `text` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `createDate` | create日期 | `create_date` | Date | `date` |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 6 | `creator` | 创建人 | `creator` | String | `text` |
| 7 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 8 | `defineCharacter` | defineCharacter | `defineCharacter` | fdcfc20d-b825-4525-be65-dbb184a87910 | `UserDefine` |
| 9 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 10 | `iCustID` | iCustID | `iCustID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 11 | `id` | ID | `id` | Long | `long` |
| 12 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 13 | `isFastAdd` | 是否FastAdd | `isFastAdd` | Boolean | `switch` |
| 14 | `level` | level | `level` | Integer | `int` |
| 15 | `modifier` | 修改人 | `modifier` | String | `text` |
| 16 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 17 | `modifyDate` | modify日期 | `modify_date` | Date | `date` |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 19 | `name` | 名称 | `name` | String | `multiLanguage` |
| 20 | `parent` | parent | `parent` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc | `quote` |
| 21 | `path` | path | `path` | String | `text` |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 23 | `remark` | remark | `remark` | String | `text` |
| 24 | `sort` | sort | `sort` | Integer | `int` |
| 25 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 26 | `stoptime` | stoptime | `stoptime` | DateTime | `timestamp` |
| 27 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 28 | `volume` | volume | `volume` | String | `text` |
| 29 | `warehouseId` | warehouseID | `warehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 30 | `goodsProductsComparisons` | goodsProductsComparisons | `` | 0ab19a86-6669-4cc5-8ba7-b4b347b79aaa | `` |
| 31 | `headDefine` | headDefine | `` | 288eb11a-6acd-4462-8d60-a2d4694f2bf7 | `` |
| 32 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（10 个）

- `parent` -> `aa.goodsposition.GoodsPosition` () 
- `headDefine` -> `aa.goodsposition.GoodsPositionDefine` (1) 
- `warehouseId` -> `aa.warehouse.Warehouse` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `defineCharacter` -> `aa.goodsposition.GoodsPositionDefineCharacter` () 
- `goodsProductsComparisons` -> `aa.goodsposition.GoodsProductsComparison` (0..n) 
- `iCustID` -> `aa.merchant.Merchant` () 
- `tenant` -> `base.tenant.Tenant` () 
