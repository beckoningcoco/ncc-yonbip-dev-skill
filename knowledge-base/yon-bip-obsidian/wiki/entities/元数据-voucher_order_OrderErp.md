---
tags: [BIP, 元数据, 数据字典, voucher.order.OrderErp]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单erp (`voucher.order.OrderErp`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `orders_erp` | 应用: `SCMSA` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `cOrderNo` | String | `text` |
| 2 | `download` | download | `bDownload` | Boolean | `switch` |
| 3 | `downloadDate` | downloadDate | `dDownloadDate` | Date | `date` |
| 4 | `downloadMsg` | downloadMsg | `cDownloadMsg` | String | `text` |
| 5 | `erpTS` | erpTS | `cErpTS` | String | `text` |
| 6 | `id` | ID | `id` | Long | `long` |
| 7 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 8 | `outSysKey` | outSysKey | `cOutSysKey` | String | `text` |
| 9 | `outSysType` | outSysType | `iOutSysType` | Short | `short` |
| 10 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 11 | `success` | success | `bSuccess` | Boolean | `switch` |
| 12 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 13 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（1 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
