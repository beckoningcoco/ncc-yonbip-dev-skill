---
tags: [BIP, 元数据, 数据字典, drft.drftbillpoolagreemen.DrftBillPoolAgreemen]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 票据池协议 (`drft.drftbillpoolagreemen.DrftBillPoolAgreemen`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `drft_billpoolagreemen` | 应用: `DRFT`

## 属性（51 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accentity` | accentity | `accentity` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `protocolcode` | protocolcode | `protocolcode` | String | `text` |
| 4 | `code` | 编码 | `code` | String | `text` |
| 5 | `oldCode` | old编码 | `old_code` | String | `text` |
| 6 | `accentityRaw` | accentityRaw | `accentity_raw` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 7 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 9 | `returncount` | returncount | `returncount` | Short | `short` |
| 10 | `tplid` | tplid | `tplid` | Long | `long` |
| 11 | `status` | 状态 | `status` | Short | `short` |
| 12 | `createDate` | createDate | `create_date` | Date | `date` |
| 13 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 14 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 15 | `protocolname` | protocolname | `protocol_name` | String | `text` |
| 16 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 17 | `bankname` | bankname | `bankname` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 19 | `signupaccount` | signupaccount | `sign_up_account` | 96da623d-ced9-44d0-8448-45c389add0a1 | `quote` |
| 20 | `securityaccount` | securityaccount | `securityaccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 21 | `creditlimit` | creditlimit | `credit_limit` | Decimal | `number` |
| 22 | `creditlowwerlimit` | creditlowwerlimit | `credit_lowwer_limit` | Decimal | `number` |
| 23 | `signingdate` | signingdate | `signing_date` | Date | `date` |
| 24 | `basebilltype` | basebilltype | `basebilltype` | Short | `short` |
| 25 | `srcitem` | srcitem | `srcitem` | Short | `short` |
| 26 | `eventType` | eventType | `event_type` | Short | `short` |
| 27 | `effectivedate` | effectivedate | `effective_date` | Date | `date` |
| 28 | `bustype` | bustype | `trade_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 29 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 30 | `duedate` | duedate | `due_date` | Date | `date` |
| 31 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 32 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 33 | `isallowendorsame` | 是否allowendorsame | `isallowendorsame` | Boolean | `switch` |
| 34 | `canuseflow` | canuseflow | `canuseflow` | Boolean | `switch` |
| 35 | `isallowintopool` | 是否allowintopool | `is_allow_into_pool` | Boolean | `switch` |
| 36 | `auditDate` | auditDate | `audit_date` | Date | `date` |
| 37 | `remark` | remark | `remark` | String | `text` |
| 38 | `versions` | versions | `versions` | String | `text` |
| 39 | `isModify` | 是否Modify | `isModify` | Boolean | `switch` |
| 40 | `auditStatus` | auditStatus | `audit_status` | Short | `short` |
| 41 | `effectiveStatus` | effectiveStatus | `effective_status` | Short | `short` |
| 42 | `oldBillPoolId` | oldBillPoolID | `oldBillPoolId_id` | Long | `long` |
| 43 | `creator` | 创建人 | `creator` | String | `text` |
| 44 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 45 | `auditor` | auditor | `auditor` | String | `text` |
| 46 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 47 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 48 | `modifier` | 修改人 | `modifier` | String | `text` |
| 49 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 50 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 51 | `drftmembersoftheunit` | drftmembersoftheunit | `` | 8be89ef3-17e1-477e-a5d3-ace6b7ef8585 | `` |

## 关联（13 个）

- `securityaccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `accentityRaw` -> `aa.baseorg.OrgMV` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `accentity` -> `aa.baseorg.OrgMV` () 
- `bustype` -> `bd.bill.TransType` () 
- `auditorId` -> `base.user.User` () 
- `drftmembersoftheunit` -> `drft.drftbillpoolagreemen.DrftMembersOfTheUnit` (0..n) 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `bankname` -> `bd.bank.BankVO` () 
- `signupaccount` -> `tmsp.elebankaccountset.EleBankAccountSet` () 
- `tenant` -> `base.tenant.Tenant` () 
