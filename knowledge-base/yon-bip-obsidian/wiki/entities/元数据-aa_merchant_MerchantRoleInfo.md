---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantRoleInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户角色信息 (`aa.merchant.MerchantRoleInfo`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchantroleinfo` | 应用: `DPMCUS` | 类型: `Class`

## 属性（17 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `merchantId` | merchantID | `imerchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `merchantOptions` | merchantOptions | `cMerchantOptions` | Boolean | `switch` |
| 4 | `businessRole` | businessRole | `cBusinessRole` | String | `text` |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 6 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 7 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 8 | `businessAccount` | businessAccount | `cBusinessAccount` | String | `text` |
| 9 | `cardOwnerName` | cardOwner名称 | `cCardOwnerName` | String | `text` |
| 10 | `cardType` | cardType | `cCardType` | CardType | `` |
| 11 | `finalSettlementDate` | finalSettlementDate | `dFinalSettlementDate` | DateTime | `timestamp` |
| 12 | `receivingBank` | receivingBank | `cReceivingBank` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 13 | `settlementCycle` | settlementCycle | `bSsettlementCycle` | Integer | `int` |
| 14 | `settlementMethod` | settlementMethod | `settlementMethod` | SettlementMethod | `` |
| 15 | `toBImmigrationMode` | toBImmigrationMode | `toBImmigrationMode` | ToBImmigrationMode | `` |
| 16 | `uMappExpireDate` | uMappExpireDate | `dUMappExpireDate` | DateTime | `timestamp` |
| 17 | `uOrderExpireDate` | uOrderExpireDate | `dUOrderExpireDate` | DateTime | `timestamp` |

## 关联（4 个）

- `merchantId` -> `aa.merchant.Merchant` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `receivingBank` -> `bd.bank.BankVO` ()
- `tenant` -> `base.tenant.Tenant` ()
