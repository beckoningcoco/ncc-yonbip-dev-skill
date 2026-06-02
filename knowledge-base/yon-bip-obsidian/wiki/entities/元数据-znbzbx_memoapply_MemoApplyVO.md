---
tags: [BIP, 元数据, 数据字典, znbzbx.memoapply.MemoApplyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 事项申请单 (`znbzbx.memoapply.MemoApplyVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `znbz_memoapply` | 应用: `RBSM`

## 属性（165 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `writeprojectapplymnyfield` | writeprojectapplymnyfield | `writeprojectapplymnyfield` | String | `text` |
| 2 | `directPrintCount` | directPrintCount | `directPrintCount` | Integer | `int` |
| 3 | `previewPrintCount` | previewPrintCount | `previewPrintCount` | Integer | `int` |
| 4 | `toHrFalg` | toHrFalg | `toHrFalg` | Short | `short` |
| 5 | `iauditdealstatus` | iauditdealstatus | `iauditdealstatus` | Short | `short` |
| 6 | `iauditresult` | iauditresult | `iauditresult` | Short | `short` |
| 7 | `isapplyreffinished` | 是否applyreffinished | `isapplyreffinished` | Boolean | `switch` |
| 8 | `isprojectapply` | 是否projectapply | `isprojectapply` | Boolean | `switch` |
| 9 | `joblistid` | joblistid | `joblistid` | String | `text` |
| 10 | `napplyrefmny` | napplyrefmny | `napplyrefmny` | Decimal | `number` |
| 11 | `napplyrelmny` | napplyrelmny | `napplyrelmny` | Decimal | `number` |
| 12 | `pk_projectapply` | pk_projectapply | `pk_projectapply` | c89a2b73-7637-4642-abc1-c49bf1a5c460 | `quote` |
| 13 | `printCount` | printCount | `printCount` | Integer | `int` |
| 14 | `nnatestimatedamount` | nnatestimatedamount | `nnatestimatedamount` | Decimal | `number` |
| 15 | `imakebilltype` | imakebilltype | `imakebilltype` | Integer | `int` |
| 16 | `bizFlow` | bizFlow | `bizFlow` | String | `text` |
| 17 | `confirmstaffid` | confirmstaffid | `confirmstaffid` | String | `text` |
| 18 | `confirmstaffname` | confirmstaffname | `confirmstaffname` | String | `text` |
| 19 | `dexpectclosedate` | dexpectclosedate | `dexpectclosedate` | Date | `date` |
| 20 | `dclosedate` | dclosedate | `dclosedate` | Date | `date` |
| 21 | `iclosetype` | iclosetype | `iclosetype` | Short | `short` |
| 22 | `withholdingstatus` | withholdingstatus | `withholdingstatus` | Integer | `int` |
| 23 | `withholdingrule` | withholdingrule | `withholdingrule` | Integer | `int` |
| 24 | `ntranswithholdingmny` | ntranswithholdingmny | `ntranswithholdingmny` | Decimal | `number` |
| 25 | `nnattranswithholdingmny` | nnattranswithholdingmny | `nnattranswithholdingmny` | Decimal | `number` |
| 26 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 27 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 28 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 29 | `source` | source | `source` | String | `text` |
| 30 | `upcode` | upcode | `upcode` | String | `text` |
| 31 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 32 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |
| 33 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |
| 34 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 35 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 36 | `nestimatedamount` | nestimatedamount | `nestimatedamount` | Decimal | `number` |
| 37 | `submitTime` | submitTime | `submit_time` | DateTime | `dateTime` |
| 38 | `submitter` | submitter | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 39 | `withdrawTime` | withdrawTime | `withdraw_time` | DateTime | `dateTime` |
| 40 | `withdrawpp` | withdrawpp | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 41 | `cfinacecostcenter` | cfinacecostcenter | `cfinacecostcenter` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 42 | `chandlecostcenter` | chandlecostcenter | `chandlecostcenter` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 43 | `dbegintime` | dbegintime | `dbegintime` | String | `text` |
| 44 | `dendtime` | dendtime | `dendtime` | String | `text` |
| 45 | `isoverstd` | 是否overstd | `isoverstd` | Boolean | `switch` |
| 46 | `pk_dutyjob` | pk_dutyjob | `pk_dutyjob` | 9703c8bf-0092-4566-96bd-933cc03c0acd | `quote` |
| 47 | `pk_dutypost` | pk_dutypost | `pk_dutypost` | a06cee30-92b1-4a03-b399-3886f55e4ba1 | `quote` |
| 48 | `pk_dutyrank` | pk_dutyrank | `pk_dutyrank` | 7dfa7985-5073-4394-8f4f-cea8d1829b84 | `quote` |
| 49 | `thirdsysbill` | thirdsysbill | `thirdsysbill` | String | `text` |
| 50 | `thirdsysflag` | thirdsysflag | `thirdsysflag` | String | `text` |
| 51 | `code` | 编码 | `code` | String | `text` |
| 52 | `pk_billtype` | pk_billtype | `pk_billtype` | String | `text` |
| 53 | `cfinaceorg` | cfinaceorg | `cfinaceorg` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 54 | `vfinacedeptid` | vfinacedeptid | `vfinacedeptid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 55 | `caccountorg` | caccountorg | `caccountorg` | 4928db62-a46d-4829-a26a-1de4bb3bf98c | `quote` |
| 56 | `bustype` | bustype | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 57 | `dapplydate` | dapplydate | `dapplydate` | Date | `date` |
| 58 | `pk_handlepsn` | pk_handlepsn | `pk_handlepsn` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 59 | `vhandledeptid` | vhandledeptid | `vhandledeptid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 60 | `chandleorg` | chandleorg | `chandleorg` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 61 | `vhandlepsnphone` | vhandlepsnphone | `vhandlepsnphone` | String | `text` |
| 62 | `vhandlepsnmail` | vhandlepsnmail | `vhandlepsnmail` | String | `text` |
| 63 | `itranstools` | itranstools | `itranstools` | Integer | `int` |
| 64 | `dbegindate` | dbegindate | `dbegindate` | Date | `date` |
| 65 | `denddate` | denddate | `denddate` | Date | `date` |
| 66 | `nbusitravalday` | nbusitravalday | `nbusitravalday` | Integer | `int` |
| 67 | `pk_begaddr` | pk_begaddr | `pk_begaddr` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 68 | `vreason` | vreason | `vreason` | String | `text` |
| 69 | `vapplyname` | vapplyname | `vapplyname` | String | `text` |
| 70 | `pk_busimemo` | pk_busimemo | `pk_busimemo` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 71 | `pk_busimemotype` | pk_busimemotype | `pk_busimemotype` | f21b5eab-a129-49f6-ae72-9f9a2f415134 | `quote` |
| 72 | `pk_project` | pk_project | `pk_project` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 73 | `napplymny` | napplymny | `napplymny` | Decimal | `number` |
| 74 | `isclose` | 是否close | `isclose` | Boolean | `switch` |
| 75 | `isfinished` | 是否finished | `isfinished` | Boolean | `switch` |
| 76 | `nfinishmny` | nfinishmny | `nfinishmny` | Decimal | `number` |
| 77 | `isloanfinished` | 是否loanfinished | `isloanfinished` | Boolean | `switch` |
| 78 | `nloanmny` | nloanmny | `nloanmny` | Decimal | `number` |
| 79 | `ncavmny` | ncavmny | `ncavmny` | Decimal | `number` |
| 80 | `nreturnmny` | nreturnmny | `nreturnmny` | Decimal | `number` |
| 81 | `vmemo` | vmemo | `vmemo` | String | `text` |
| 82 | `irejectstatus` | irejectstatus | `irejectstatus` | Short | `short` |
| 83 | `ibillmakemethod` | ibillmakemethod | `ibillmakemethod` | Short | `short` |
| 84 | `vattachmentass` | vattachmentass | `vattachmentass` | String | `text` |
| 85 | `status` | 状态 | `status` | Short | `short` |
| 86 | `dbusidate` | dbusidate | `dbusidate` | Date | `date` |
| 87 | `id` | ID | `id` | Long | `long` |
| 88 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 89 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 90 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 91 | `returncount` | returncount | `returncount` | Short | `short` |
| 92 | `creator` | 创建人 | `creator` | String | `text` |
| 93 | `createDate` | createDate | `create_date` | Date | `date` |
| 94 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 95 | `modifier` | 修改人 | `modifier` | String | `text` |
| 96 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 97 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 98 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 99 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 100 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 101 | `auditor` | auditor | `auditor` | String | `text` |
| 102 | `auditDate` | auditDate | `audit_date` | Date | `date` |
| 103 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 104 | `vdef1` | vdef1 | `vdef1` | String | `text` |
| 105 | `vdef2` | vdef2 | `vdef2` | String | `text` |
| 106 | `vdef3` | vdef3 | `vdef3` | String | `text` |
| 107 | `vdef4` | vdef4 | `vdef4` | String | `text` |
| 108 | `vdef5` | vdef5 | `vdef5` | String | `text` |
| 109 | `vdef6` | vdef6 | `vdef6` | String | `text` |
| 110 | `vdef7` | vdef7 | `vdef7` | String | `text` |
| 111 | `vdef8` | vdef8 | `vdef8` | String | `text` |
| 112 | `vdef9` | vdef9 | `vdef9` | String | `text` |
| 113 | `vdef10` | vdef10 | `vdef10` | String | `text` |
| 114 | `ndefnum1` | ndefnum1 | `ndefnum1` | Decimal | `number` |
| 115 | `ndefnum2` | ndefnum2 | `ndefnum2` | Decimal | `number` |
| 116 | `ndefnum3` | ndefnum3 | `ndefnum3` | Decimal | `number` |
| 117 | `ndefnum4` | ndefnum4 | `ndefnum4` | Decimal | `number` |
| 118 | `ndefnum5` | ndefnum5 | `ndefnum5` | Decimal | `number` |
| 119 | `isapctfinished` | 是否apctfinished | `isapctfinished` | Boolean | `switch` |
| 120 | `napctmny` | napctmny | `napctmny` | Decimal | `number` |
| 121 | `napctfinishmny` | napctfinishmny | `napctfinishmny` | Decimal | `number` |
| 122 | `vdescription` | vdescription | `vdescription` | String | `text` |
| 123 | `ismulticurrency` | 是否multicurrency | `ismulticurrency` | Boolean | `switch` |
| 124 | `vcurrency` | vcurrency | `vcurrency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 125 | `vnatexchratetype` | vnatexchratetype | `vnatexchratetype` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 126 | `dnatexchratedate` | dnatexchratedate | `dnatexchratedate` | Date | `date` |
| 127 | `vnatcurrency` | vnatcurrency | `vnatcurrency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 128 | `nnatbaseexchrate` | nnatbaseexchrate | `nnatbaseexchrate` | Decimal | `number` |
| 129 | `nnatexchrate` | nnatexchrate | `nnatexchrate` | Decimal | `number` |
| 130 | `nnatapplymny` | nnatapplymny | `nnatapplymny` | Decimal | `number` |
| 131 | `nnatfinishmny` | nnatfinishmny | `nnatfinishmny` | Decimal | `number` |
| 132 | `nnatloanmny` | nnatloanmny | `nnatloanmny` | Decimal | `number` |
| 133 | `nnatcavmny` | nnatcavmny | `nnatcavmny` | Decimal | `number` |
| 134 | `nnatreturnmny` | nnatreturnmny | `nnatreturnmny` | Decimal | `number` |
| 135 | `isusebody` | 是否usebody | `isusebody` | Boolean | `switch` |
| 136 | `pk_endaddr` | pk_endaddr | `pk_endaddr` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 137 | `ibudgetexectype` | ibudgetexectype | `ibudgetexectype` | Integer | `int` |
| 138 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 139 | `isendbtrstype` | 是否endbtrstype | `isendbtrstype` | Short | `short` |
| 140 | `ibtrsdealtype` | ibtrsdealtype | `ibtrsdealtype` | Short | `short` |
| 141 | `vbtrsdealmsg` | vbtrsdealmsg | `vbtrsdealmsg` | String | `text` |
| 142 | `dcostdate` | dcostdate | `dcostdate` | Date | `date` |
| 143 | `ibudgetctrltype` | ibudgetctrltype | `ibudgetctrltype` | Short | `short` |
| 144 | `barCode` | bar编码 | `bar_code` | String | `text` |
| 145 | `closerId` | closerID | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 146 | `tplid` | tplid | `tplid` | Long | `long` |
| 147 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 148 | `closer` | closer | `closer` | String | `text` |
| 149 | `closeTime` | closeTime | `close_time` | DateTime | `timestamp` |
| 150 | `closeDate` | closeDate | `close_Date` | Date | `date` |
| 151 | `MemoApplyApctVO` | MemoApplyApctVO | `` | a4f0acfd-83bb-4d0e-9999-f9cc28c98837 | `` |
| 152 | `MemoApplyEndaddrVO` | MemoApplyEndaddrVO | `` | c00921a8-241e-4f47-adf2-8de812c73972 | `` |
| 153 | `MemoApplyGroupVO` | MemoApplyGroupVO | `` | 6d8b7c71-2905-4c75-a51c-fcebacc53348 | `` |
| 154 | `MemoApplyPlan` | MemoApplyPlan | `` | d162d3a3-aa0c-4d32-8d67-71e5cf847faa | `` |
| 155 | `MemoApplyUserdefVO` | MemoApplyUserdefVO | `` | 7fa385b5-f4e3-4fa7-aa90-4f74ba303537 | `` |
| 156 | `MemoapplyBVO` | MemoapplyBVO | `` | 0dd17389-d0ee-4f01-b34b-9a17be57afcb | `` |
| 157 | `MemoapplyStdVO` | MemoapplyStdVO | `` | 49c6cd4a-ae2d-412d-873a-3ed8fe210cec | `` |
| 158 | `beginningFlag` | beginningFlag | `beginning_flag` | Short | `short` |
| 159 | `expsubsidydetails` | expsubsidydetails | `` | dd454d59-947c-4ee1-a836-57539b4a2d83 | `` |
| 160 | `isquickfill` | 是否quickfill | `isquickfill` | Boolean | `switch` |
| 161 | `itplid` | itplid | `itplid` | String | `text` |
| 162 | `memoapplyibpmcurrentauditor` | memoapplyibpmcurrentauditor | `` | 36516d4a-0a15-48c0-89f6-1c7d1540622c | `` |
| 163 | `memoapplyibpmstep` | memoapplyibpmstep | `` | bb8da615-b067-43b9-b27b-873edea88a56 | `` |
| 164 | `nnatbaseexchrateOps` | nnatbaseexchrateOps | `nnatbaseexchrateOps` | ExchangeRateMethod | `` |
| 165 | `nnatexchrateOps` | nnatexchrateOps | `nnatexchrateOps` | ExchangeRateMethod | `` |

## 关联（41 个）

- `chandleorg` -> `org.func.BaseOrg` () 
- `vhandledeptid` -> `bd.adminOrg.AdminOrgVO` () 
- `submitter` -> `base.user.BipUser` () 
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `MemoapplyBVO` -> `znbzbx.memoapply.MemoApplyBVO` (0..n) 
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `pk_endaddr` -> `bd.region.BaseRegionVO` () 
- `pk_busimemotype` -> `bd.expenseitem.ExpenseItemType` () 
- `pk_project` -> `bd.project.ProjectVO` () 
- `chandlecostcenter` -> `bd.costcenter.CostCenter` () 
- `vcurrency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `pk_begaddr` -> `bd.region.BaseRegionVO` () 
- `MemoApplyPlan` -> `znbzbx.memoapply.MemoApplyPlan` (0..n) 
- `expsubsidydetails` -> `znbzbx.memoapply.ApplySubsidyDetailVO` (0..n) 
- `withdrawpp` -> `base.user.BipUser` () 
- `cfinaceorg` -> `org.func.BaseOrg` () 
- `pk_projectapply` -> `znbzbx.memoapply.MemoApplyVO` () 
- `memoapplyibpmcurrentauditor` -> `znbzbx.memoapply.MemoApplyIBpmCurrentAuditor` (0..n) 
- `closerId` -> `base.user.User` () 
- `MemoApplyGroupVO` -> `znbzbx.memoapply.MemoApplyGroupVO` (0..n) 
- `pk_dutypost` -> `bd.duty.Position` () 
- `tenant` -> `base.tenant.Tenant` () 
- `pk_dutyjob` -> `bd.duty.Duty` () 
- `memoapplyibpmstep` -> `znbzbx.memoapply.MemoApplyIBpmStep` (0..n) 
- `MemoApplyUserdefVO` -> `znbzbx.memoapply.MemoApplyUserdefVO` (1) 
- `pk_dutyrank` -> `bd.duty.Rank` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `MemoApplyApctVO` -> `znbzbx.memoapply.MemoApplyApctVO` (0..n) 
- `vfinacedeptid` -> `bd.adminOrg.AdminOrgVO` () 
- `bustype` -> `bd.bill.TransType` () 
- `pk_busimemo` -> `bd.expenseitem.ExpenseItem` () 
- `cfinacecostcenter` -> `bd.costcenter.CostCenter` () 
- `auditorId` -> `base.user.User` () 
- `caccountorg` -> `bd.adminOrg.FinanceOrgVO` () 
- `vnatcurrency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `MemoapplyStdVO` -> `znbzbx.memoapply.MemoApplyStdVO` (0..n) 
- `vnatexchratetype` -> `bd.exchangeRate.ExchangeRateTypeVO` () 
- `MemoApplyEndaddrVO` -> `znbzbx.memoapply.MemoApplyEndaddrVO` (0..n) 
- `pk_handlepsn` -> `bd.staff.Staff` () 
