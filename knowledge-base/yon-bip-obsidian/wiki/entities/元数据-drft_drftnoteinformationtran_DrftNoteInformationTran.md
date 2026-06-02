---
tags: [BIP, 元数据, 数据字典, drft.drftnoteinformationtran.DrftNoteInformationTran]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 票据信息子表 (`drft.drftnoteinformationtran.DrftNoteInformationTran`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `drft_noteinformation_tran` | 应用: `DRFT`

## 属性（31 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `cancelFlag` | cancelFlag | `cancel_flag` | Boolean | `switch` |
| 2 | `accentity` | accentity | `accentity` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 3 | `pk_register` | pk_register | `pk_register` | 188a8035-1815-4024-b1f9-e60be16249fc | `quote` |
| 4 | `pk_business` | pk_business | `pk_business` | Long | `long` |
| 5 | `billRangeStart` | billRangeStart | `bill_range_start` | Long | `long` |
| 6 | `billRangeEnd` | billRangeEnd | `bill_range_end` | Long | `long` |
| 7 | `transMoney` | transMoney | `trans_money` | Decimal | `number` |
| 8 | `noteStatus` | noteStatus | `note_status` | Short | `short` |
| 9 | `splitFlag` | splitFlag | `split_flag` | Boolean | `switch` |
| 10 | `iselec` | 是否elec | `iselec` | Boolean | `switch` |
| 11 | `outerhid` | outerhid | `outerhid` | String | `text` |
| 12 | `outerbid` | outerbid | `outerbid` | String | `text` |
| 13 | `checkresult` | checkresult | `checkresult` | Short | `short` |
| 14 | `upstreamhid` | upstreamhid | `upstreamhid` | String | `text` |
| 15 | `upstreambid` | upstreambid | `upstreambid` | String | `text` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 17 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 18 | `tplid` | tplid | `tplid` | Long | `long` |
| 19 | `status` | 状态 | `status` | Short | `short` |
| 20 | `code` | 编码 | `code` | String | `text` |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 22 | `createDate` | createDate | `create_date` | Date | `date` |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 24 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 25 | `creator` | 创建人 | `creator` | String | `text` |
| 26 | `modifier` | 修改人 | `modifier` | String | `text` |
| 27 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 28 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 29 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 30 | `id` | ID | `id` | Long | `long` |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（6 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `pk_register` -> `drft.billno.Billno` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `accentity` -> `aa.baseorg.OrgMV` () 
- `tenant` -> `base.tenant.Tenant` () 
