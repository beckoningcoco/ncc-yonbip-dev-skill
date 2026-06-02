---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctCounterparty]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同相对方 (`apct.contract.ApctCounterparty`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_counterparty` | 应用: `APCT`

## 属性（22 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `creator` | 创建人 | `creator` | String | `text` |
| 2 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 3 | `apctCounterpartyDcs` | apctCounterpartyDcs | `apctCounterpartyDcs` | bc5cf9c6-3ccb-4ad0-b0e8-00df2f3f3efb | `UserDefine` |
| 4 | `payAccountId` | payAccountID | `pay_account_id` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 5 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 6 | `supplierId` | supplierID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 7 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 9 | `modifier` | 修改人 | `modifier` | String | `text` |
| 10 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 11 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 12 | `mailAddress` | mailAddress | `mail_address` | String | `text` |
| 13 | `counterpartyType` | counterpartyType | `counterparty_type` | String | `text` |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 15 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 17 | `customerId` | customerID | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 18 | `contactNumber` | contactNumber | `contact_number` | String | `text` |
| 19 | `id` | ID | `id` | Long | `long` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 21 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 22 | `createDate` | createDate | `create_date` | Date | `date` |

## 关联（9 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `payAccountId` -> `aa.vendor.VendorBank` () 
- `supplierId` -> `aa.vendor.Vendor` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `customerId` -> `aa.merchant.Merchant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `apctCounterpartyDcs` -> `apct.contract.ApctCounterpartyDcsVo` () 
- `tenant` -> `base.tenant.Tenant` () 
