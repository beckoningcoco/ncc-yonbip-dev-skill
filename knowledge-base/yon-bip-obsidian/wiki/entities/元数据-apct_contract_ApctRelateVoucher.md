---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctRelateVoucher]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 下游关联单据 (`apct.contract.ApctRelateVoucher`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_relate_voucher` | 应用: `APCT`

## 属性（44 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `billDate` | billDate | `bill_date` | Date | `date` |
| 2 | `billNum` | billNum | `bill_num` | String | `text` |
| 3 | `billStatus` | billStatus | `bill_status` | String | `text` |
| 4 | `billType` | billType | `bill_type` | String | `text` |
| 5 | `planCode` | plan编码 | `plan_code` | String | `text` |
| 6 | `outbillRowId` | outbillRowID | `outbillrow_id` | Long | `long` |
| 7 | `outbillType` | outbillType | `out_bill_type` | String | `text` |
| 8 | `outbustype` | outbustype | `out_bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 9 | `outbillNo` | outbillNo | `outbill_no` | String | `text` |
| 10 | `outbillDate` | outbillDate | `outbill_date` | Date | `date` |
| 11 | `outbillStatus` | outbillStatus | `out_bill_status` | Short | `short` |
| 12 | `outsettleStatus` | outsettleStatus | `out_settle_status` | Short | `short` |
| 13 | `outoriginalAmt` | outoriginalAmt | `out_original_amt` | Decimal | `number` |
| 14 | `outProject` | outProject | `out_project` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 15 | `outBusimemo` | outBusimemo | `out_busimemo` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 16 | `outMaterial` | outMaterial | `out_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 17 | `localAmt` | localAmt | `local_amt` | Decimal | `number` |
| 18 | `contractDirection` | contractDirection | `contract_direction` | Short | `short` |
| 19 | `nsummny` | nsummny | `nsummny` | Decimal | `number` |
| 20 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 21 | `bustype` | bustype | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 22 | `createDate` | createDate | `create_date` | Date | `date` |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 24 | `creator` | 创建人 | `creator` | String | `text` |
| 25 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 26 | `ctCode` | ct编码 | `ct_code` | String | `text` |
| 27 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 28 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 29 | `domain` | domain | `domain` | String | `text` |
| 30 | `id` | ID | `id` | Long | `long` |
| 31 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 32 | `location` | location | `location` | String | `text` |
| 33 | `marginId` | marginID | `margin_id` | 9b101166-8c8d-46f3-ba77-8b8b92992aaf | `quote` |
| 34 | `modifier` | 修改人 | `modifier` | String | `text` |
| 35 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 36 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 37 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 38 | `originalAmt` | originalAmt | `original_amt` | Decimal | `number` |
| 39 | `outbillId` | outbillID | `outbill_id` | Long | `long` |
| 40 | `planId` | planID | `plan_id` | f6f2aec8-fae4-49c4-83cd-0399d152fa6f | `quote` |
| 41 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 42 | `settleStatus` | settleStatus | `settle_status` | String | `text` |
| 43 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 44 | `beforeUpdateAmt` | beforeUpdateAmt | `before_update_amt` | Decimal | `number` |

## 关联（13 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `outProject` -> `bd.project.ProjectVO` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `marginId` -> `apct.contract.ApctMargin` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `outBusimemo` -> `bd.expenseitem.ExpenseItem` () 
- `bustype` -> `bd.bill.TransType` () 
- `outbustype` -> `bd.bill.TransType` () 
- `planId` -> `apct.contract.ApctPlan` () 
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () 
- `tenant` -> `base.tenant.Tenant` () 
- `outMaterial` -> `pc.product.Product` () 
