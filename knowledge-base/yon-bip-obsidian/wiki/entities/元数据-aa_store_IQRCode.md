---
tags: [BIP, 元数据, 数据字典, aa.store.IQRCode]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 渠道 (`aa.store.IQRCode`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_entchannel` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `cAppID` | cAppID | `cAppID` | String | `text` |
| 2 | `cChannelCode` | cChannel编码 | `cChannelCode` | String | `text` |
| 3 | `cChannelName` | cChannel名称 | `cChannelName` | String | `text` |
| 4 | `cChannelScope` | cChannelScope | `cChannelScope` | String | `text` |
| 5 | `iBizId` | iBizID | `iBizId` | String | `text` |
| 6 | `iChannelType` | iChannelType | `iChannelType` | Integer | `int` |
| 7 | `iQRCodeSceneId` | iQRCodeSceneID | `iQRCodeSceneId` | Integer | `int` |
| 8 | `iQRCodeType` | iQRCodeType | `iQRCodeType` | IQRCodeType | `` |
| 9 | `iStoreId` | iStoreID | `iStoreId` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 10 | `id` | ID | `id` | Long | `long` |
| 11 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `iStoreId` -> `aa.store.Store` (1)
- `tenant` -> `base.tenant.Tenant` ()
