---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateShareSettingTransTypeRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账户使用规则交易类型记录表 (`voucher.rebate.RebateShareSettingTransTypeRecord`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `udh_rebatesharesetting_transtype_record` | 应用: `BBSMK` | 类型: `Class`

## 属性（7 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `createTime` | 创建时间 | `dCreateTime` | DateTime | `timestamp` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `modifyTime` | 修改时间 | `dModifyTime` | DateTime | `timestamp` |
| 4 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 5 | `rebateShareSettingId` | rebateShareSettingID | `iRebateShareSettingId` | 6353a3f1-4736-4c35-bc35-64ec2ea8bb7d | `quote` |
| 6 | `tradeType` | tradeType | `iTradeType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `rebateShareSettingId` -> `voucher.rebate.RebateShareSetting` (0..n)
- `tradeType` -> `bd.bill.TransType` ()
