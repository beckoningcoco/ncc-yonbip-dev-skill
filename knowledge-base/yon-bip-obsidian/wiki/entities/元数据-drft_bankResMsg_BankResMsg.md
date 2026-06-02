---
tags: [BIP, 元数据, 数据字典, drft.bankResMsg.BankResMsg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 银行返回数据实体 (`drft.bankResMsg.BankResMsg`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `drft_bankResMsg` | 应用: `DRFT`

## 属性（61 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accentity` | accentity | `accentity` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 2 | `accto` | accto | `accto` | String | `text` |
| 3 | `auditDate` | auditDate | `audit_date` | Date | `date` |
| 4 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 5 | `auditor` | auditor | `auditor` | String | `text` |
| 6 | `billrangestart` | billrangestart | `billrangestart` | Long | `long` |
| 7 | `billrangeend` | billrangeend | `billrangeend` | Long | `long` |
| 8 | `billrange` | billrange | `billrange` | String | `text` |
| 9 | `circulateflag` | circulateflag | `circulateflag` | String | `text` |
| 10 | `transmoney` | transmoney | `transmoney` | Decimal | `number` |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 12 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 13 | `bankCode` | 银行编码 | `bank_code` | String | `text` |
| 14 | `bankNum` | bankNum | `bank_num` | String | `text` |
| 15 | `basebilltype` | basebilltype | `basebilltype` | BaseBillType | `` |
| 16 | `batNo` | batNo | `bat_no` | String | `text` |
| 17 | `billType` | 票据类型 | `bill_type` | String | `text` |
| 18 | `bill_id` | bill_id | `bill_id` | String | `text` |
| 19 | `bussDate` | bussDate | `buss_date` | Date | `date` |
| 20 | `bussTime` | bussTime | `buss_time` | DateTime | `timestamp` |
| 21 | `code` | 编码 | `code` | String | `text` |
| 22 | `createDate` | createDate | `create_date` | Date | `date` |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 24 | `creator` | 创建人 | `creator` | String | `text` |
| 25 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 26 | `ecdsStatus` | ecdsStatus | `ecds_status` | String | `text` |
| 27 | `electronicbill` | electronicbill | `electronicbill` | 96da623d-ced9-44d0-8448-45c389add0a1 | `quote` |
| 28 | `id` | ID | `id` | Long | `long` |
| 29 | `instructStatus` | instructStatus | `instruct_status` | Short | `short` |
| 30 | `instructionCode` | instruction编码 | `instruction_code` | String | `text` |
| 31 | `instructionMsg` | instructionMsg | `instruction_msg` | String | `text` |
| 32 | `instructionType` | instructionType | `instruction_type` | String | `text` |
| 33 | `isNew` | 是否New | `is_new` | Integer | `int` |
| 34 | `modifier` | 修改人 | `modifier` | String | `text` |
| 35 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 36 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 37 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 38 | `noteno` | noteno | `noteno` | String | `text` |
| 39 | `notestatus` | notestatus | `notestatus` | Short | `short` |
| 40 | `payResult` | payResult | `pay_result` | String | `text` |
| 41 | `pk_register` | pk_register | `pk_register` | 188a8035-1815-4024-b1f9-e60be16249fc | `quote` |
| 42 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 43 | `requestNo` | requestNo | `request_no` | String | `text` |
| 44 | `respondCode` | respond编码 | `respond_code` | String | `text` |
| 45 | `respondMsg` | respondMsg | `respond_msg` | String | `text` |
| 46 | `respondTime` | respondTime | `respond_time` | DateTime | `timestamp` |
| 47 | `resultStatus` | resultStatus | `result_status` | Short | `short` |
| 48 | `sendTime` | sendTime | `send_time` | DateTime | `timestamp` |
| 49 | `serialNum` | serialNum | `serial_num` | String | `text` |
| 50 | `srcitem` | srcitem | `srcitem` | Short | `short` |
| 51 | `status` | 状态 | `status` | Short | `short` |
| 52 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 53 | `tplid` | tplid | `tplid` | Long | `long` |
| 54 | `tranNo` | tranNo | `tran_no` | String | `text` |
| 55 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 56 | `changestatus` | changestatus | `change_status` | Short | `short` |
| 57 | `changetime` | changetime | `change_time` | DateTime | `timestamp` |
| 58 | `changeuserid` | changeuserid | `change_user_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 59 | `changeusername` | changeusername | `change_user_name` | String | `text` |
| 60 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 61 | `instructionNo` | instructionNo | `instruction_no` | Long | `long` |

## 关联（9 个）

- `auditorId` -> `base.user.User` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `changeuserid` -> `base.user.User` () 
- `pk_register` -> `drft.billno.Billno` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `accentity` -> `aa.baseorg.OrgMV` () 
- `electronicbill` -> `tmsp.elebankaccountset.EleBankAccountSet` () 
- `tenant` -> `base.tenant.Tenant` () 
