---
tags: [BIP, 元数据, 数据字典, aa, aa.merchant.AddressInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 地址信息 (`aa.merchant.AddressInfo`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `addressinfo` | 应用: `DPMCUS` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 地址信息 |
| 物理表 | `addressinfo` |
| 应用 | `DPMCUS` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `addressCode` | `cAddressCode` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:18:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0002_customer/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202602021528_metadata_aa-merchant.zip`

## 术语标记

`isAssigned`, `isExtend`, `MasterData`, `doc`, `DirectConnection`, `AllowBatchModify`

## 依赖接口（3 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IErp编码 (`IErpCode`) | `base.itf.IErpCode` | 73 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（34 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `merchantId` | merchantId | `imerchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` | false | true |
| 3 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 4 | `addressCode` | address编码 | `cAddressCode` | String | `text` | true | false |
| 5 | `shipregion` | shipregion | `shipregion` | 373171f0-f497-4bab-bda7-ff4b6489c13e | `quote` | false | true |
| 6 | `regionCode` | region编码 | `cRegionCode` | String | `text` | false | true |
| 7 | `address` | 地址 | `cAddress` | String | `text` | false | true |
| 8 | `longitude` | 经度 | `iLNG` | Decimal | `number` | false | true |
| 9 | `latitude` | 纬度 | `iLAT` | Decimal | `number` | false | true |
| 10 | `zipCode` | zip编码 | `cZipCode` | String | `text` | false | true |
| 11 | `receiver` | receiver | `cReceiver` | String | `text` | false | true |
| 12 | `mobile` | 手机号 | `cMobile` | String | `text` | false | true |
| 13 | `telePhone` | telePhone | `cTelePhone` | String | `text` | false | true |
| 14 | `email` | 邮箱 | `cEmail` | String | `text` | false | true |
| 15 | `qq` | qq | `cQQ` | String | `text` | false | true |
| 16 | `weChat` | weChat | `cWeChat` | String | `text` | false | true |
| 17 | `isDefault` | 是否Default | `bDefaultAddr` | Boolean | `switch` | true | false |
| 18 | `receivingWarehouse` | receivingWarehouse | `cReceivingWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` | false | true |
| 19 | `remarks` | remarks | `cRemarks` | String | `text` | false | true |
| 20 | `stopStatus` | stopStatus(状态) | `stop_status` | String | `text` | false | true |
| 21 | `addressInfoCharacter` | addressInfoCharacter | `address_info_character` | e45dd641-aaa9-422e-9e1b-789233874d6c | `UserDefine` | false | true |
| 22 | `deliveryAddressErpCode` | deliveryAddressErp编码 | `deliveryAddressErpCode` | String | `text` | false | true |
| 23 | `shippingAddressErpCode` | shippingAddressErp编码 | `cErp` | String | `text` | false | true |
| 24 | `mergerName` | merger名称 | `cMergerName` | String | `text` | false | true |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 26 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 27 | `country` | ountry | `cCountry` | String | `text` | false | true |
| 28 | `province` | province | `cProvince` | String | `text` | false | true |
| 29 | `area` | area | `cArea` | String | `text` | false | true |
| 30 | `city` | ity | `cCity` | String | `text` | false | true |
| 31 | `region` | region | `cRegion` | String | `text` | false | true |
| 32 | `addressId` | 地址ID | `oAddress_id` | 0d98e246-387e-4239-a8da-c372e94fff77 | `quote` | false | true |
| 33 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 34 | `addressInfoDefine` | addressInfoDefine | `` | 8748c0d7-6acc-4121-8560-633af4a50c2a | `` |  |  |

## 关联属性（8 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `addressInfoCharacter` | addressInfoCharacter | `aa.merchant.AddressInfoCharacter` | `address_info_character` | 外键 |  |  | None |  |
| 2 | `receivingWarehouse` | receivingWarehouse | `aa.warehouse.Warehouse` | `cReceivingWarehouse` | 外键 |  |  | None |  |
| 3 | `addressInfoDefine` | addressInfoDefine | `aa.merchant.AddressInfoDefine` | `` | addressInfoDefine → id | 1 | Y | None |  |
| 4 | `merchantId` | merchantId | `aa.merchant.Merchant` | `imerchantId` | merchantAddressInfos → merchantId | 0..n | Y | None |  |
| 5 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 6 | `shipregion` | shipregion | `base.shipregion.ShipRegion` | `shipregion` | 外键 |  |  | None |  |
| 7 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |
| 8 | `addressId` | 地址ID | `aa.regioncorp.RegionCorp` | `oAddress_id` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT id, imerchantId, erpCode, cAddressCode, shipregion, cRegionCode, cAddress, iLNG
FROM addressinfo
```