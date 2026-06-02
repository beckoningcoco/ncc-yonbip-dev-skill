---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctThirdVoucher]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 中间表数据标的物和付款计划 (`apct.contract.ApctThirdVoucher`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_third_voucher` | 应用: `APCT`

## 属性（20 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 2 | `planId` | planID | `plan_id` | f6f2aec8-fae4-49c4-83cd-0399d152fa6f | `quote` |
| 3 | `relateVoucherId` | relateVoucherID | `relate_voucher_id` | Long | `long` |
| 4 | `materialId` | materialID | `material_id` | Long | `long` |
| 5 | `outbillId` | outbillID | `outbill_id` | Long | `long` |
| 6 | `outbillRowId` | outbillRowID | `outbillrow_id` | Long | `long` |
| 7 | `originalAmt` | originalAmt | `original_amt` | Decimal | `number` |
| 8 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 9 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 11 | `createDate` | createDate | `create_date` | Date | `date` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 13 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 14 | `creator` | 创建人 | `creator` | String | `text` |
| 15 | `modifier` | 修改人 | `modifier` | String | `text` |
| 16 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 17 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 18 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 19 | `id` | ID | `id` | Long | `long` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（6 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `planId` -> `apct.contract.ApctPlan` () 
- `tenant` -> `base.tenant.Tenant` () 
