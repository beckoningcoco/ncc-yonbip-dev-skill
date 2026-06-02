---
tags: [BIP, 元数据, 数据字典, drft.billno.Billno]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 票据号 (`drft.billno.Billno`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `drft_noteinformation` | 应用: `DRFT`

## 属性（138 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accentity` | accentity | `accentity` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 2 | `accentityRaw` | accentityRaw | `accentity_raw` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 3 | `acceptaccbyfundobject` | acceptaccbyfundobject | `acceptaccbyfundobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 4 | `acceptanceno` | acceptanceno | `acceptanceno` | String | `text` |
| 5 | `acceptancerbybank` | acceptancerbybank | `acceptancerbybank` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 6 | `acceptancerbycust` | acceptancerbycust | `acceptancerbycust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 7 | `acceptancerbyfundobject` | acceptancerbyfundobject | `acceptancerbyfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 8 | `acceptancerbyfundobjecttpye` | acceptancerbyfundobjecttpye | `acceptancerbyfundobjecttpye` | String | `text` |
| 9 | `acceptancerbyorg` | acceptancerbyorg | `acceptancerbyorg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 10 | `acceptancerbysupp` | acceptancerbysupp | `acceptancerbysupp` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 11 | `acceptanceroles` | acceptanceroles | `acceptanceroles` | Short | `short` |
| 12 | `acceptbankacc` | acceptbankacc | `acceptbankacc` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 13 | `acceptbankaccbycust` | acceptbankaccbycust | `acceptbankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 14 | `acceptbankaccbysupp` | acceptbankaccbysupp | `acceptbankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 15 | `acceptdate` | acceptdate | `acceptdate` | Date | `date` |
| 16 | `acceptopenbank` | acceptopenbank | `acceptopenbank` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 17 | `acceptopenbankname` | acceptopenbankname | `acceptopenbankname` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 18 | `agentopennote` | agentopennote | `agentopennote` | Boolean | `switch` |
| 19 | `auditstatus` | auditstatus | `auditstatus` | Short | `short` |
| 20 | `availableMoney` | availableMoney | `available_money` | Decimal | `number` |
| 21 | `availableRange` | availableRange | `available_range` | String | `text` |
| 22 | `billRange` | billRange | `bill_range` | String | `text` |
| 23 | `billdirection` | billdirection | `billdirection` | Short | `short` |
| 24 | `buyerinterest` | buyerinterest | `buyerinterest` | Boolean | `switch` |
| 25 | `contractno` | contractno | `contractno` | String | `text` |
| 26 | `costCenter` | costCenter | `cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 27 | `createDate` | createDate | `create_date` | Date | `date` |
| 28 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 29 | `creator` | 创建人 | `creator` | String | `text` |
| 30 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 31 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 32 | `dept` | dept | `dept` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |
| 33 | `drftNoteInformationDef` | drftNoteInformationDef | `drftnoteinformation_def` | 433716b8-04bf-43db-802d-699bca23f7a8 | `UserDefine` |
| 34 | `einnerSecurityPayeeRoles` | einnerSecurityPayeeRoles | `einner_security_payee_roles` | Short | `short` |
| 35 | `elecinvoicemode` | elecinvoicemode | `elecinvoicemode` | String | `text` |
| 36 | `elecsignacc` | elecsignacc | `elecsignacc` | 96da623d-ced9-44d0-8448-45c389add0a1 | `quote` |
| 37 | `enddate` | enddate | `enddate` | Date | `date` |
| 38 | `gatherdate` | gatherdate | `gatherdate` | Date | `date` |
| 39 | `hasUsedExclusiveBillPool` | hasUsedExclusiveBillPool | `hasUsedExclusiveBillPool` | Boolean | `switch` |
| 40 | `hasused` | hasused | `hasused` | Boolean | `switch` |
| 41 | `id` | ID | `id` | Long | `long` |
| 42 | `ifsepFlow` | ifsepFlow | `ifsepFlow` | Boolean | `switch` |
| 43 | `impawneraccbyfundobject` | impawneraccbyfundobject | `impawneraccbyfundobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 44 | `impawnerfundobject` | impawnerfundobject | `impawnerfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 45 | `impawnerfundobjecttpye` | impawnerfundobjecttpye | `impawnerfundobjecttpye` | String | `text` |
| 46 | `integratestatus` | integratestatus | `integratestatus` | Short | `short` |
| 47 | `invoicedate` | invoicedate | `invoicedate` | Date | `date` |
| 48 | `invoiceraccbyobject` | invoiceraccbyobject | `invoiceraccbyobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 49 | `invoicerbankacc` | invoicerbankacc | `invoicerbankacc` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 50 | `invoicerbankaccbycust` | invoicerbankaccbycust | `invoicerbankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 51 | `invoicerbankaccbyorg` | invoicerbankaccbyorg | `invoicerbankaccbyorg` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 52 | `invoicerbankaccbysupp` | invoicerbankaccbysupp | `invoicerbankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 53 | `invoicerbycust` | invoicerbycust | `invoicerbycust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 54 | `invoicerbyfundobject` | invoicerbyfundobject | `invoicerbyfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 55 | `invoicerbyfundobjecttpye` | invoicerbyfundobjecttpye | `invoicerbyfundobjecttpye` | String | `text` |
| 56 | `invoicerbyorg` | invoicerbyorg | `invoicerbyorg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 57 | `invoicerbysupp` | invoicerbysupp | `invoicerbysupp` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 58 | `invoiceroles` | invoiceroles | `invoiceroles` | Short | `short` |
| 59 | `iselec` | 是否elec | `iselec` | Boolean | `switch` |
| 60 | `issuercreditcode` | 是否suercreditcode | `issuercreditcode` | String | `text` |
| 61 | `istransfer` | 是否transfer | `istransfer` | Boolean | `switch` |
| 62 | `modifier` | 修改人 | `modifier` | String | `text` |
| 63 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 64 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 65 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 66 | `newNoteFlag` | newNoteFlag | `new_note_flag` | Boolean | `switch` |
| 67 | `notedescription` | notedescription | `notedescription` | String | `text` |
| 68 | `noteflag` | noteflag | `noteflag` | NoteFlag | `` |
| 69 | `notemoney` | notemoney | `notemoney` | Decimal | `number` |
| 70 | `noteno` | noteno | `noteno` | String | `text` |
| 71 | `notestatus` | notestatus | `notestatus` | Short | `short` |
| 72 | `notetype` | notetype | `notetype` | 1ffb45b4-f3e9-4e02-8fa0-d3429c8d7fb4 | `quote` |
| 73 | `olcrate` | olcrate | `olcrate` | Decimal | `number` |
| 74 | `olcsecuritymoney` | olcsecuritymoney | `olcsecuritymoney` | Decimal | `number` |
| 75 | `oneAvailableMoney` | oneAvailableMoney | `one_available_money` | Decimal | `number` |
| 76 | `openserialno` | openserialno | `openserialno` | String | `text` |
| 77 | `org` | org | `org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 78 | `oripk_register` | oripk_register | `oripk_register` | 737084eb-cf3b-49c1-a37a-bc1caf8ebd63 | `quote` |
| 79 | `payTime` | payTime | `payTime` | Short | `short` |
| 80 | `paybankaccbycust` | paybankaccbycust | `paybankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 81 | `paybankaccbyobject` | paybankaccbyobject | `paybankaccbyobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 82 | `paybankaccbysupp` | paybankaccbysupp | `paybankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 83 | `paybillroles` | paybillroles | `paybillroles` | Short | `short` |
| 84 | `paybyfundobject` | paybyfundobject | `paybyfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 85 | `paybyfundobjecttpye` | paybyfundobjecttpye | `paybyfundobjecttpye` | String | `text` |
| 86 | `paycustomer` | paycustomer | `paycustomer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 87 | `payeecreditcode` | payeecreditcode | `payeecreditcode` | String | `text` |
| 88 | `paymentcommitmentletternumber` | paymentcommitmentletternumber | `paymentcommitmentletternumber` | String | `text` |
| 89 | `paysupplier` | paysupplier | `paysupplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 90 | `pk_bankmsg` | pk_bankmsg | `pk_bankmsg` | a8e8326a-317f-4dae-8e68-d372b1437163 | `quote` |
| 91 | `principalAccentity` | principalAccentity | `principalAccentity` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 92 | `principalBillAccount` | principalBillAccount | `principalBillAccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 93 | `principalPayAccount` | principalPayAccount | `principalPayAccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 94 | `profitCenter` | profitCenter | `profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 95 | `project` | project | `project` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 96 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 97 | `receivebilltype` | receivebilltype | `receivebilltype` | Short | `short` |
| 98 | `receiveraccbyobject` | receiveraccbyobject | `receiveraccbyobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 99 | `receiverbankacc` | receiverbankacc | `receiverbankacc` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 100 | `receiverbankaccbycust` | receiverbankaccbycust | `receiverbankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 101 | `receiverbankaccbyorg` | receiverbankaccbyorg | `receiverbankaccbyorg` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 102 | `receiverbankaccbysupp` | receiverbankaccbysupp | `receiverbankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 103 | `receiverbycust` | receiverbycust | `receiverbycust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 104 | `receiverbyfundobject` | receiverbyfundobject | `receiverbyfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 105 | `receiverbyfundobjecttpye` | receiverbyfundobjecttpye | `receiverbyfundobjecttpye` | String | `text` |
| 106 | `receiverbyorg` | receiverbyorg | `receiverbyorg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 107 | `receiverbysupp` | receiverbysupp | `receiverbysupp` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 108 | `receiveroles` | receiveroles | `receiveroles` | Short | `short` |
| 109 | `securityaccount` | securityaccount | `securityaccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 110 | `securityflag` | securityflag | `securityflag` | Boolean | `switch` |
| 111 | `securitymode` | securitymode | `securitymode` | Short | `short` |
| 112 | `securitymoney` | securitymoney | `securitymoney` | Decimal | `number` |
| 113 | `securityrate` | securityrate | `securityrate` | Decimal | `number` |
| 114 | `settlementStatus` | settlementStatus | `settlementStatus` | Short | `short` |
| 115 | `settlemodesec` | settlemodesec | `settlemodesec` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 116 | `showInvoiceOpenbankname` | showInvoiceOpenbankname | `showInvoiceOpenbankname` | String | `text` |
| 117 | `showReceiveOpenbankname` | showReceiveOpenbankname | `showReceiveOpenbankname` | String | `text` |
| 118 | `showacceptancer` | showacceptancer | `showacceptancer` | String | `text` |
| 119 | `showacceptbankacc` | showacceptbankacc | `showacceptbankacc` | String | `text` |
| 120 | `showacceptopenbank` | showacceptopenbank | `showacceptopenbank` | String | `text` |
| 121 | `showacceptopenbankname` | showacceptopenbankname | `showacceptopenbankname` | String | `text` |
| 122 | `showinvoicer` | showinvoicer | `showinvoicer` | String | `text` |
| 123 | `showinvoicerbankacc` | showinvoicerbankacc | `showinvoicerbankacc` | String | `text` |
| 124 | `showpaybankacc` | showpaybankacc | `showpaybankacc` | String | `text` |
| 125 | `showpayunit` | showpayunit | `showpayunit` | String | `text` |
| 126 | `showreceiver` | showreceiver | `showreceiver` | String | `text` |
| 127 | `showreceiverbankacc` | showreceiverbankacc | `showreceiverbankacc` | String | `text` |
| 128 | `srcFlag` | srcFlag | `src_flag` | Short | `short` |
| 129 | `srcPkImpawn` | srcPkImpawn | `src_pk_impawn` | 86a5af80-5358-4af9-8408-4a20e65ca366 | `quote` |
| 130 | `srcbillid` | srcbillid | `srcbillid` | Long | `long` |
| 131 | `surplusBillRange` | surplusBillRange | `surplus_bill_range` | String | `text` |
| 132 | `surplusMoney` | surplusMoney | `surplus_money` | Decimal | `number` |
| 133 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 134 | `ticketCollectionEnd` | ticketCollectionEnd | `ticketCollectionEnd` | Boolean | `switch` |
| 135 | `ticketHoldingMode` | ticketHoldingMode | `ticket_holding_mode` | Short | `short` |
| 136 | `transoutaccount` | transoutaccount | `transoutaccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 137 | `usemoney` | usemoney | `usemoney` | Decimal | `number` |
| 138 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（61 个）

- `invoicerbysupp` -> `aa.vendor.Vendor` () 
- `drftNoteInformationDef` -> `drft.drftnoteinformation.DrftNoteInformationDef` () 
- `modifierId` -> `base.user.User` () 
- `project` -> `bd.project.ProjectVO` () 
- `accentity` -> `aa.baseorg.OrgMV` () 
- `settlemodesec` -> `aa.settlemethod.SettleMethod` () 
- `acceptopenbankname` -> `bd.bank.BankDotVO` () 
- `receiverbankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `receiverbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `principalPayAccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `receiverbankaccbysupp` -> `aa.vendor.VendorBank` () 
- `acceptbankacc` -> `bd.enterprise.OrgFinBankacctVO` () 
- `invoicerbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `invoicerbycust` -> `aa.merchant.Merchant` () 
- `acceptaccbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `principalAccentity` -> `aa.baseorg.OrgMV` () 
- `invoicerbyorg` -> `aa.baseorg.OrgMV` () 
- `principalBillAccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `tenant` -> `base.tenant.Tenant` () 
- `oripk_register` -> `drft.drftnoteinformation.DrftNoteInformation` () 
- `receiverbycust` -> `aa.merchant.Merchant` () 
- `costCenter` -> `bd.costcenter.CostCenter` () 
- `transoutaccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `acceptancerbyorg` -> `aa.baseorg.OrgMV` () 
- `impawneraccbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `receiverbyorg` -> `aa.baseorg.OrgMV` () 
- `paybankaccbyobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `receiverbankaccbyorg` -> `bd.enterprise.OrgFinBankacctVO` () 
- `pk_bankmsg` -> `drft.bankResMsg.BankResMsg` () 
- `receiveraccbyobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `acceptopenbank` -> `bd.bank.BankVO` () 
- `receiverbankacc` -> `bd.enterprise.OrgFinBankacctVO` () 
- `elecsignacc` -> `tmsp.elebankaccountset.EleBankAccountSet` () 
- `acceptancerbybank` -> `bd.bank.BankDotVO` () 
- `securityaccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `creatorId` -> `base.user.User` () 
- `paybyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `paybankaccbysupp` -> `aa.vendor.VendorBank` () 
- `profitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
- `srcPkImpawn` -> `drft.impawnBean.ImpawnBean` () 
- `paybankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `invoicerbankaccbyorg` -> `bd.enterprise.OrgFinBankacctVO` () 
- `invoicerbankacc` -> `bd.enterprise.OrgFinBankacctVO` () 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `paycustomer` -> `aa.merchant.Merchant` () 
- `notetype` -> `drft.billtype.BillType` () 
- `acceptancerbysupp` -> `aa.vendor.Vendor` () 
- `paysupplier` -> `aa.vendor.Vendor` () 
- `acceptbankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `org` -> `aa.baseorg.OrgMV` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `accentityRaw` -> `aa.baseorg.OrgMV` () 
- `acceptancerbycust` -> `aa.merchant.Merchant` () 
- `invoiceraccbyobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `dept` -> `aa.baseorg.DeptMV` () 
- `acceptancerbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `receiverbysupp` -> `aa.vendor.Vendor` () 
- `invoicerbankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `impawnerfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `invoicerbankaccbysupp` -> `aa.vendor.VendorBank` () 
- `acceptbankaccbysupp` -> `aa.vendor.VendorBank` () 
