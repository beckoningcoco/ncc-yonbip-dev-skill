---
tags: [BIP, 元数据, 数据字典, drft.impawnBean.ImpawnBean]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 票据质押 (`drft.impawnBean.ImpawnBean`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `drft_impawn` | 应用: `DRFT`

## 属性（121 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `impawnerfundobjecttpye` | impawnerfundobjecttpye | `impawnerfundobjecttpye` | String | `text` |
| 2 | `characterDefine` | characterDefine | `character_def` | 9f150757-a5fe-41fc-8991-d7a1af10664f | `UserDefine` |
| 3 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 4 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 5 | `billType` | 票据类型 | `bill_type` | 1ffb45b4-f3e9-4e02-8fa0-d3429c8d7fb4 | `quote` |
| 6 | `impawnbackbillmoney` | impawnbackbillmoney | `impawnbackbillmoney` | Decimal | `number` |
| 7 | `canuseflow` | canuseflow | `canuseflow` | Boolean | `switch` |
| 8 | `impawnbackperson` | impawnbackperson | `impawnbackperson` | String | `text` |
| 9 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 10 | `ecdsStatus` | ecdsStatus | `ecds_status` | String | `text` |
| 11 | `noteno` | noteno | `noteno` | String | `text` |
| 12 | `notemoney` | notemoney | `notemoney` | Decimal | `number` |
| 13 | `deptId` | deptID | `dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |
| 14 | `costCenter` | costCenter | `cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 15 | `profitCenter` | profitCenter | `profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 16 | `olcRateOps` | olcRateOps | `olc_rate_ops` | Short | `short` |
| 17 | `auditstatus` | auditstatus | `auditstatus` | Short | `short` |
| 18 | `olcimpawnbackbillmoney` | olcimpawnbackbillmoney | `olcimpawnbackbillmoney` | Decimal | `number` |
| 19 | `impawnbackpersonid` | impawnbackpersonid | `impawnbackpersonid` | String | `text` |
| 20 | `disableuserid` | disableuserid | `disableuserid` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 21 | `pkRegisterTran` | pkRegisterTran | `pk_register_tran` | 191bd349-caa8-487c-99ff-9dc66394b425 | `quote` |
| 22 | `billRangeStart` | billRangeStart | `bill_range_start` | Long | `long` |
| 23 | `billRangeEnd` | billRangeEnd | `bill_range_end` | Long | `long` |
| 24 | `billRange` | billRange | `bill_range` | String | `text` |
| 25 | `transMoney` | transMoney | `trans_money` | Decimal | `number` |
| 26 | `availableRange` | availableRange | `available_range` | String | `text` |
| 27 | `surplusBillRange` | surplusBillRange | `surplus_bill_range` | String | `text` |
| 28 | `surplusMoney` | surplusMoney | `surplus_money` | Decimal | `number` |
| 29 | `billStatus` | billStatus | `billstatus` | Short | `short` |
| 30 | `propertyStatus` | propertyStatus | `propertystatus` | Short | `short` |
| 31 | `generationType` | generationType | `generationtype` | Short | `short` |
| 32 | `isAll` | 是否All | `is_all` | Boolean | `switch` |
| 33 | `isUpload` | 是否Upload | `is_upload` | Boolean | `switch` |
| 34 | `outimpawnroles` | outimpawnroles | `outimpawnroles` | Short | `short` |
| 35 | `outImpawnPerson` | outImpawnPerson | `out_impawn_person` | String | `text` |
| 36 | `outSupplier` | outSupplier | `out_supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 37 | `outCustomer` | outCustomer | `out_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 38 | `outBank` | outBank | `out_bank` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 39 | `outimpawnkind` | outimpawnkind | `outimpawnkind` | String | `text` |
| 40 | `outimpawnbankaccbycust` | outimpawnbankaccbycust | `outimpawnbankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 41 | `outimpawnbankaccbysupp` | outimpawnbankaccbysupp | `outimpawnbankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 42 | `outimpawnaccount` | outimpawnaccount | `outimpawnaccount` | String | `text` |
| 43 | `outimpawnaccname` | outimpawnaccname | `outimpawnaccname` | String | `text` |
| 44 | `outimpawnbankname` | outimpawnbankname | `outimpawnbankname` | String | `text` |
| 45 | `outimpawnbankno` | outimpawnbankno | `outimpawnbankno` | String | `text` |
| 46 | `outimpawnerfundobjecttpye` | outimpawnerfundobjecttpye | `outimpawnerfundobjecttpye` | String | `text` |
| 47 | `outimpawnerfundobject` | outimpawnerfundobject | `outimpawnerfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 48 | `outimpawneraccbyfundobject` | outimpawneraccbyfundobject | `outimpawneraccbyfundobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 49 | `impawnDir` | impawnDir | `impawn_dir` | Short | `short` |
| 50 | `grmFlag` | grmFlag | `grm_flag` | Boolean | `switch` |
| 51 | `accentityRaw` | accentityRaw | `accentity_raw` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 52 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 53 | `impawnaccname` | impawnaccname | `impawnaccname` | String | `text` |
| 54 | `impawnaccount` | impawnaccount | `impawnaccount` | String | `text` |
| 55 | `impawnbankaccbycust` | impawnbankaccbycust | `impawnbankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 56 | `impawnbankaccbyorg` | impawnbankaccbyorg | `impawnbankaccbyorg` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 57 | `impawnbankaccbysupp` | impawnbankaccbysupp | `impawnbankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 58 | `impawnerfundobject` | impawnerfundobject | `impawnerfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 59 | `impawnbankname` | impawnbankname | `impawnbankname` | String | `text` |
| 60 | `impawnbankno` | impawnbankno | `impawnbankno` | String | `text` |
| 61 | `impawnbackmoney` | impawnbackmoney | `impawnbackmoney` | Decimal | `number` |
| 62 | `impawnkind` | impawnkind | `impawnkind` | String | `text` |
| 63 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 64 | `pk_org` | pk_org | `pk_org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 65 | `returncount` | returncount | `returncount` | Short | `short` |
| 66 | `impawneraccbyfundobject` | impawneraccbyfundobject | `impawneraccbyfundobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 67 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 68 | `tplid` | tplid | `tplid` | Long | `long` |
| 69 | `voucherstatus` | voucherstatus | `voucherstatus` | Short | `short` |
| 70 | `accentity` | accentity | `accentity` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 71 | `code` | 编码 | `code` | String | `text` |
| 72 | `bustype` | bustype | `trade_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 73 | `impawnDate` | impawnDate | `impawn_date` | Date | `date` |
| 74 | `pk_register` | pk_register | `pk_register` | 188a8035-1815-4024-b1f9-e60be16249fc | `quote` |
| 75 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 76 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 77 | `impawnroles` | impawnroles | `impawnroles` | Short | `short` |
| 78 | `unimpawnDate` | unimpawnDate | `unimpawn_date` | Date | `date` |
| 79 | `impawnPerson` | impawnPerson | `impawn_person` | String | `text` |
| 80 | `impawnToDate` | impawnToDate | `impawn_to_date` | Date | `date` |
| 81 | `isAccount` | 是否Account | `is_account` | Boolean | `switch` |
| 82 | `electronicbill` | electronicbill | `electronicbill` | 96da623d-ced9-44d0-8448-45c389add0a1 | `quote` |
| 83 | `eleAccount` | eleAccount | `ele_account` | String | `text` |
| 84 | `eleCode` | ele编码 | `ele_code` | String | `text` |
| 85 | `eleName` | ele名称 | `ele_name` | String | `text` |
| 86 | `eleBankName` | eleBank名称 | `ele_bankname` | String | `text` |
| 87 | `id` | ID | `id` | Long | `long` |
| 88 | `remark` | remark | `remark` | String | `text` |
| 89 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 90 | `status` | 状态 | `status` | Short | `short` |
| 91 | `instructStatus` | instructStatus | `instruct_status` | Short | `short` |
| 92 | `olccurrency` | olccurrency | `olccurrency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 93 | `olcrateType` | olcrateType | `olcratetype` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 94 | `olcrate` | olcrate | `olcrate` | Decimal | `number` |
| 95 | `olcnoteMoney` | olcnoteMoney | `olcnote_money` | Decimal | `number` |
| 96 | `creator` | 创建人 | `creator` | String | `text` |
| 97 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 98 | `createDate` | createDate | `create_date` | Date | `date` |
| 99 | `modifier` | 修改人 | `modifier` | String | `text` |
| 100 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 101 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 102 | `auditor` | auditor | `auditor` | String | `text` |
| 103 | `auditDate` | auditDate | `audit_date` | Date | `date` |
| 104 | `ticketId` | ticketID | `ticket_id` | String | `text` |
| 105 | `pk_bankmsg` | pk_bankmsg | `pk_bankmsg` | a8e8326a-317f-4dae-8e68-d372b1437163 | `quote` |
| 106 | `srcbillId` | srcbillID | `srcbill_id` | String | `text` |
| 107 | `pk_backbankmsg` | pk_backbankmsg | `pk_backbankmsg` | a8e8326a-317f-4dae-8e68-d372b1437163 | `quote` |
| 108 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 109 | `eventType` | eventType | `event_type` | Short | `short` |
| 110 | `backinstructStatus` | backinstructStatus | `backinstruct_status` | Short | `short` |
| 111 | `srcitem` | srcitem | `srcitem` | Short | `short` |
| 112 | `basebilltype` | basebilltype | `basebilltype` | Short | `short` |
| 113 | `isGather` | 是否Gather | `is_gather` | Boolean | `switch` |
| 114 | `customer` | customer | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 115 | `supplier` | supplier | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 116 | `bank` | bank | `bank` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 117 | `disableusername` | disableusername | `disableusername` | String | `text` |
| 118 | `disabletime` | disabletime | `disabletime` | DateTime | `timestamp` |
| 119 | `disabledate` | disabledate | `disabledate` | Date | `date` |
| 120 | `disablenote` | disablenote | `disablenote` | String | `text` |
| 121 | `defines` | defines | `` | 2176bb41-756d-4c99-a6bc-d7a81aab731e | `` |

## 关联（38 个）

- `outimpawnerfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `disableuserid` -> `base.user.User` () 
- `pkRegisterTran` -> `drft.drftnoteinformationtran.DrftNoteInformationTran` () 
- `outSupplier` -> `aa.vendor.Vendor` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `impawnbankaccbyorg` -> `bd.enterprise.OrgFinBankacctVO` () 
- `profitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
- `accentity` -> `aa.baseorg.OrgMV` () 
- `pk_org` -> `aa.baseorg.OrgMV` () 
- `defines` -> `drft.impawnBean.ImpawnBeanDefine` (1) 
- `bank` -> `bd.bank.BankDotVO` () 
- `outimpawnbankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `outBank` -> `bd.bank.BankDotVO` () 
- `supplier` -> `aa.vendor.Vendor` () 
- `outimpawneraccbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `tenant` -> `base.tenant.Tenant` () 
- `olccurrency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `costCenter` -> `bd.costcenter.CostCenter` () 
- `pk_register` -> `drft.billno.Billno` () 
- `accentityRaw` -> `aa.baseorg.OrgMV` () 
- `billType` -> `drft.billtype.BillType` () 
- `impawnbankaccbysupp` -> `aa.vendor.VendorBank` () 
- `deptId` -> `aa.baseorg.DeptMV` () 
- `olcrateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () 
- `impawneraccbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `outimpawnbankaccbysupp` -> `aa.vendor.VendorBank` () 
- `pk_backbankmsg` -> `drft.bankResMsg.BankResMsg` () 
- `bustype` -> `bd.bill.TransType` () 
- `electronicbill` -> `tmsp.elebankaccountset.EleBankAccountSet` () 
- `impawnbankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `characterDefine` -> `drft.impawnBean.ImpawnBeanCharacterDef` () 
- `auditorId` -> `base.user.User` () 
- `outCustomer` -> `aa.merchant.Merchant` () 
- `pk_bankmsg` -> `drft.bankResMsg.BankResMsg` () 
- `impawnerfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `customer` -> `aa.merchant.Merchant` () 
