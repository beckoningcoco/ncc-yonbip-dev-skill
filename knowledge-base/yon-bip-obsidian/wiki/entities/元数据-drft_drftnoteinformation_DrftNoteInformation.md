---
tags: [BIP, 元数据, 数据字典, drft.drftnoteinformation.DrftNoteInformation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 票据信息 (`drft.drftnoteinformation.DrftNoteInformation`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `drft_noteinformation` | 应用: `DRFT`

## 属性（355 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `acceptaccbyfundobject` | acceptaccbyfundobject | `acceptaccbyfundobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 2 | `acceptancerbyfundobject` | acceptancerbyfundobject | `acceptancerbyfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 3 | `chargetype` | chargetype | `chargetype` | 14b092f3-5d27-4a47-82a0-d6bad074c9f1 | `quote` |
| 4 | `impawneraccbyfundobject` | impawneraccbyfundobject | `impawneraccbyfundobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 5 | `impawnerfundobject` | impawnerfundobject | `impawnerfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 6 | `impawnerfundobjecttpye` | impawnerfundobjecttpye | `impawnerfundobjecttpye` | String | `text` |
| 7 | `invoiceraccbyobject` | invoiceraccbyobject | `invoiceraccbyobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 8 | `invoicerbyfundobject` | invoicerbyfundobject | `invoicerbyfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 9 | `invoicerbyfundobjecttpye` | invoicerbyfundobjecttpye | `invoicerbyfundobjecttpye` | String | `text` |
| 10 | `paybankaccbycust` | paybankaccbycust | `paybankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 11 | `paybankaccbyobject` | paybankaccbyobject | `paybankaccbyobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 12 | `paybankaccbysupp` | paybankaccbysupp | `paybankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 13 | `paybyfundobject` | paybyfundobject | `paybyfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 14 | `paybyfundobjecttpye` | paybyfundobjecttpye | `paybyfundobjecttpye` | String | `text` |
| 15 | `quicktype` | quicktype | `quicktype` | 14b092f3-5d27-4a47-82a0-d6bad074c9f1 | `quote` |
| 16 | `receiveraccbyobject` | receiveraccbyobject | `receiveraccbyobject` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 17 | `receiverbyfundobject` | receiverbyfundobject | `receiverbyfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 18 | `recallBankmsg` | recallBankmsg | `recallbankmsg` | a8e8326a-317f-4dae-8e68-d372b1437163 | `quote` |
| 19 | `receiverbyfundobjecttpye` | receiverbyfundobjecttpye | `receiverbyfundobjecttpye` | String | `text` |
| 20 | `withdrticketBankmsg` | withdrticketBankmsg | `withdrticketbankmsg` | a8e8326a-317f-4dae-8e68-d372b1437163 | `quote` |
| 21 | `settlementStatus` | settlementStatus | `settlementStatus` | Short | `short` |
| 22 | `showpaybankacc` | showpaybankacc | `showpaybankacc` | String | `text` |
| 23 | `availableQuota` | availableQuota | `available_quota` | Decimal | `number` |
| 24 | `bankName` | 银行名称 | `bankName` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 25 | `billPool` | billPool | `bill_pool` | b7708165-db7a-48aa-8852-0244ae7fa755 | `quote` |
| 26 | `drftNoteInformationDef` | drftNoteInformationDef | `drftnoteinformation_def` | 433716b8-04bf-43db-802d-699bca23f7a8 | `UserDefine` |
| 27 | `hasUsedExclusiveBillPool` | hasUsedExclusiveBillPool | `hasUsedExclusiveBillPool` | Boolean | `switch` |
| 28 | `impawnAmount` | impawnAmount | `impawnAmount` | Decimal | `number` |
| 29 | `impawnRate` | impawnRate | `impawnRate` | Decimal | `number` |
| 30 | `impawntype` | impawntype | `impawntype` | Short | `short` |
| 31 | `innerDate` | innerDate | `innerDate` | Date | `date` |
| 32 | `inpoolorg` | inpoolorg | `inpoolorg` | b7708165-db7a-48aa-8852-0244ae7fa755 | `quote` |
| 33 | `inpooluse` | inpooluse | `inpooluse` | Short | `short` |
| 34 | `holdbalance` | holdbalance | `holdbalance` | Decimal | `number` |
| 35 | `innerMarginPayIdentCode` | innerMarginPayIdent编码 | `inner_margin_pay_ident_code` | String | `text` |
| 36 | `identificationCode` | identification编码 | `identification_code` | String | `text` |
| 37 | `innerSettleAccount` | innerSettleAccount | `inner_settle_account` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 38 | `settleAmount` | settleAmount | `settle_amount` | Decimal | `number` |
| 39 | `innerMarginRecIdentCode` | innerMarginRecIdent编码 | `inner_margin_rec_ident_code` | String | `text` |
| 40 | `agentSecuritySettlementStatus` | agentSecuritySettlementStatus | `agent_security_settlement_status` | Short | `short` |
| 41 | `payInternalUnitId` | payInternalUnitID | `pay_internal_unit_id` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | `quote` |
| 42 | `payInternalUnitAccountId` | payInternalUnitAccountID | `pay_internal_unit_account_id` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 43 | `olcRateOps` | olcRateOps | `olc_rate_ops` | Short | `short` |
| 44 | `bankPoundageIdentCode` | bankPoundageIdent编码 | `bank_poundage_ident_code` | String | `text` |
| 45 | `innerPoundageIdentCode` | innerPoundageIdent编码 | `inner_poundage_ident_code` | String | `text` |
| 46 | `agentMarginIdentCode` | agentMarginIdent编码 | `agent_margin_ident_code` | String | `text` |
| 47 | `costCenter` | costCenter | `cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 48 | `profitCenter` | profitCenter | `profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 49 | `ticketbalance` | ticketbalance | `ticketbalance` | Decimal | `number` |
| 50 | `acceptancebalance` | acceptancebalance | `acceptancebalance` | Decimal | `number` |
| 51 | `einnerSecurityPayeeRoles` | einnerSecurityPayeeRoles | `einner_security_payee_roles` | Short | `short` |
| 52 | `innerSecurityPoundageAmount` | innerSecurityPoundageAmount | `inner_security_poundage_amount` | Decimal | `number` |
| 53 | `ninnerSecurityPoundageRate` | ninnerSecurityPoundageRate | `ninner_security_poundage_rate` | Decimal | `number` |
| 54 | `einnerSecuritySettlementStatus` | einnerSecuritySettlementStatus | `einner_security_settlement_status` | Short | `short` |
| 55 | `acceptcreditcode` | acceptcreditcode | `acceptcreditcode` | String | `text` |
| 56 | `securityType` | securityType | `securityType` | Short | `short` |
| 57 | `poundageRate` | poundageRate | `poundageRate` | Decimal | `number` |
| 58 | `settledSupplementType` | settledSupplementType | `settledSupplementType` | Short | `short` |
| 59 | `settleSuccBizTime` | settleSuccBizTime | `settleSuccBizTime` | Date | `date` |
| 60 | `circulateid` | circulateid | `circulateid` | 850c830c-e2fb-4730-b819-f30d5efce4b4 | `quote` |
| 61 | `pushSecurity` | pushSecurity | `pushSecurity` | Boolean | `switch` |
| 62 | `acceptancerbyfundobjecttpye` | acceptancerbyfundobjecttpye | `acceptancerbyfundobjecttpye` | String | `text` |
| 63 | `useStwb` | useStwb | `useStwb` | Boolean | `switch` |
| 64 | `olcusemoney` | olcusemoney | `olcusemoney` | Decimal | `number` |
| 65 | `occupyCreditAmount` | occupyCreditAmount | `occupycreditamount` | Decimal | `number` |
| 66 | `olcOccupyCreditAmount` | olcOccupyCreditAmount | `olcoccupycreditamount` | Decimal | `number` |
| 67 | `occupyContractAmount` | occupyContractAmount | `occupycontractamount` | Decimal | `number` |
| 68 | `olcoccupyContractAmount` | olcoccupyContractAmount | `olcoccupycontractamount` | Decimal | `number` |
| 69 | `integratestatus` | integratestatus | `integratestatus` | Short | `short` |
| 70 | `billRangeStart` | billRangeStart | `bill_range_start` | Long | `long` |
| 71 | `billRangeEnd` | billRangeEnd | `bill_range_end` | Long | `long` |
| 72 | `billRange` | billRange | `bill_range` | String | `text` |
| 73 | `availableRange` | availableRange | `available_range` | String | `text` |
| 74 | `availableMoney` | availableMoney | `available_money` | Decimal | `number` |
| 75 | `oneAvailableMoney` | oneAvailableMoney | `one_available_money` | Decimal | `number` |
| 76 | `srcFlag` | srcFlag | `src_flag` | Short | `short` |
| 77 | `srcPkRegister` | srcPkRegister | `src_pk_register` | Long | `long` |
| 78 | `newNoteFlag` | newNoteFlag | `new_note_flag` | Boolean | `switch` |
| 79 | `ifsepFlow` | ifsepFlow | `ifsepFlow` | Boolean | `switch` |
| 80 | `payPeriodUnit` | payPeriodUnit | `payperiodunit` | Short | `short` |
| 81 | `paymentDate` | paymentDate | `paymentdate` | String | `text` |
| 82 | `signnoteInstructType` | signnoteInstructType | `signnoteinstructtype` | Short | `short` |
| 83 | `vouchersEntryDate` | vouchersEntryDate | `vouchersEntryDate` | Date | `date` |
| 84 | `businessAccountDate` | businessAccountDate | `businessAccountDate` | Date | `date` |
| 85 | `entrustedPaybillroles` | entrustedPaybillroles | `entrustedPaybillroles` | Short | `short` |
| 86 | `entrustedPaycustomer` | entrustedPaycustomer | `entrustedPaycustomer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 87 | `entrustedPaysupplier` | entrustedPaysupplier | `entrustedPaysupplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 88 | `entrustedPaybyfundobject` | entrustedPaybyfundobject | `entrustedPaybyfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 89 | `entrustedShowpayunit` | entrustedShowpayunit | `entrustedShowpayunit` | String | `text` |
| 90 | `whitebill` | whitebill | `whitebill` | Boolean | `switch` |
| 91 | `invoiceno` | invoiceno | `invoiceno` | String | `text` |
| 92 | `acceptanceInBlackList` | acceptanceInBlackList | `acceptanceInBlackList` | Boolean | `switch` |
| 93 | `acceptanceInWhiteList` | acceptanceInWhiteList | `acceptanceInWhiteList` | Boolean | `switch` |
| 94 | `ticketCollectionEnd` | ticketCollectionEnd | `ticketCollectionEnd` | Boolean | `switch` |
| 95 | `settleEndDate` | settleEndDate | `settleEndDate` | Date | `date` |
| 96 | `surplusBillRange` | surplusBillRange | `surplus_bill_range` | String | `text` |
| 97 | `surplusMoney` | surplusMoney | `surplus_money` | Decimal | `number` |
| 98 | `srcPkImpawn` | srcPkImpawn | `src_pk_impawn` | 86a5af80-5358-4af9-8408-4a20e65ca366 | `quote` |
| 99 | `collecticketstatus` | collecticketstatus | `collecticketstatus` | Short | `short` |
| 100 | `auditsettlementdrive` | auditsettlementdrive | `auditsettlementdrive` | Boolean | `switch` |
| 101 | `checkresult` | checkresult | `checkresult` | Short | `short` |
| 102 | `pk_bankmsg2` | pk_bankmsg2 | `pk_bankmsg2` | a8e8326a-317f-4dae-8e68-d372b1437163 | `quote` |
| 103 | `signDate` | signDate | `signDate` | Date | `date` |
| 104 | `bankmsg2Status` | bankmsg2Status | `bankmsg2Status` | Short | `short` |
| 105 | `inPoolRange` | inPoolRange | `in_pool_range` | String | `text` |
| 106 | `inPoolMoney` | inPoolMoney | `in_pool_money` | Decimal | `number` |
| 107 | `securitySettlementStatus` | securitySettlementStatus | `securitySettlementStatus` | Short | `short` |
| 108 | `paymentway` | paymentway | `paymentway` | Short | `short` |
| 109 | `signRefuse` | signRefuse | `signRefuse` | Short | `short` |
| 110 | `refuseReason` | refuseReason | `refuseReason` | String | `text` |
| 111 | `sameAccentity` | sameAccentity | `sameAccentity` | Boolean | `switch` |
| 112 | `riskPriority` | riskPriority | `riskPriority` | Short | `short` |
| 113 | `oriPaybillroles` | oriPaybillroles | `oriPaybillroles` | Short | `short` |
| 114 | `oriPaycustomer` | oriPaycustomer | `oriPaycustomer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 115 | `oriPaysupplier` | oriPaysupplier | `oriPaysupplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 116 | `oriPaybyfundobject` | oriPaybyfundobject | `oriPaybyfundobject` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 117 | `oriShowpayunit` | oriShowpayunit | `oriShowpayunit` | String | `text` |
| 118 | `oripk_register` | oripk_register | `oripk_register` | 737084eb-cf3b-49c1-a37a-bc1caf8ebd63 | `quote` |
| 119 | `receivebilltype` | receivebilltype | `receivebilltype` | Short | `short` |
| 120 | `agentopennote` | agentopennote | `agentopennote` | Boolean | `switch` |
| 121 | `principalAccentity` | principalAccentity | `principalAccentity` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 122 | `principalBillAccount` | principalBillAccount | `principalBillAccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 123 | `payTime` | payTime | `payTime` | Short | `short` |
| 124 | `principalPayAccount` | principalPayAccount | `principalPayAccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 125 | `ticketHoldingMode` | ticketHoldingMode | `ticket_holding_mode` | Short | `short` |
| 126 | `ticketCollectionCompleted` | ticketCollectionCompleted | `ticket_collection_completed` | Boolean | `switch` |
| 127 | `initialRegister` | initialRegister | `initialRegister` | 737084eb-cf3b-49c1-a37a-bc1caf8ebd63 | `quote` |
| 128 | `namelistType` | namelistType | `namelistType` | String | `text` |
| 129 | `controlType` | controlType | `controlType` | String | `text` |
| 130 | `issuercreditcode` | 是否suercreditcode | `issuercreditcode` | String | `text` |
| 131 | `payeecreditcode` | payeecreditcode | `payeecreditcode` | String | `text` |
| 132 | `nextmerchantdesignated` | nextmerchantdesignated | `nextmerchantdesignated` | Boolean | `switch` |
| 133 | `designatedparty` | designatedparty | `designatedparty` | Short | `short` |
| 134 | `designatedperson` | designatedperson | `designatedperson` | String | `text` |
| 135 | `designatedpersoncreditcode` | designatedpersoncreditcode | `designatedpersoncreditcode` | String | `text` |
| 136 | `interestpaymentmode` | interestpaymentmode | `interestpaymentmode` | Short | `short` |
| 137 | `paymentcommitmentletternumber` | paymentcommitmentletternumber | `paymentcommitmentletternumber` | String | `text` |
| 138 | `paymenttermtype` | paymenttermtype | `paymenttermtype` | Short | `short` |
| 139 | `designatedpersonsupp` | designatedpersonsupp | `designatedpersonsupp` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 140 | `designatedpersoncust` | designatedpersoncust | `designatedpersoncust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 141 | `designatedpersonfund` | designatedpersonfund | `designatedpersonfund` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 142 | `checkresultacceptance` | checkresultacceptance | `checkresultacceptance` | Short | `short` |
| 143 | `poolresiduerelease` | poolresiduerelease | `poolresiduerelease` | Decimal | `number` |
| 144 | `oldnoteno` | oldnoteno | `oldnoteno` | String | `text` |
| 145 | `residuenoteno` | residuenoteno | `residuenoteno` | String | `text` |
| 146 | `securitypushtiming` | securitypushtiming | `securitypushtiming` | Short | `short` |
| 147 | `mainid` | mainid | `mainid` | 0b1d4ce9-842f-48c1-b832-05b8e0cf5b30 | `quote` |
| 148 | `budgetstatus` | budgetstatus | `budgetstatus` | Short | `short` |
| 149 | `budgetactualaction` | budgetactualaction | `budgetactualaction` | Short | `short` |
| 150 | `isHandledSupplement` | 是否HandledSupplement | `isHandledSupplement` | Boolean | `switch` |
| 151 | `handleResult` | handleResult | `handleResult` | Short | `short` |
| 152 | `settlesignstatus` | settlesignstatus | `settlesignstatus` | Short | `short` |
| 153 | `settlementOrg` | settlementOrg | `settlementOrg` | c8022140-b5fa-4f19-a0b2-2be0192eac18 | `quote` |
| 154 | `waitsettleoper` | waitsettleoper | `waitsettleoper` | Boolean | `switch` |
| 155 | `accentityRaw` | accentityRaw | `accentity_raw` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 156 | `reasonname` | reasonname | `reasonname` | String | `text` |
| 157 | `agentquicktype` | agentquicktype | `agentquicktype` | 14b092f3-5d27-4a47-82a0-d6bad074c9f1 | `quote` |
| 158 | `agentsettlemode` | agentsettlemode | `agentsettlemode` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 159 | `innersecurityaccount` | innersecurityaccount | `innersecurityaccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 160 | `innerreceiveraccount` | innerreceiveraccount | `innerreceiveraccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 161 | `innersecurityaccsum` | innersecurityaccsum | `innersecurityaccsum` | Decimal | `number` |
| 162 | `noteSettlementStatus` | noteSettlementStatus | `noteSettlementStatus` | Integer | `int` |
| 163 | `agentSettleDetailId` | agentSettleDetailID | `agentSettleDetailId` | Long | `long` |
| 164 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 165 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 166 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 167 | `iscontributelimit` | 是否contributelimit | `iscontributelimit` | Boolean | `switch` |
| 168 | `remainEndDate` | remainEndDate | `remainEndDate` | Date | `date` |
| 169 | `signacc` | signacc | `signacc` | 96da623d-ced9-44d0-8448-45c389add0a1 | `quote` |
| 170 | `signaccopenbank` | signaccopenbank | `signaccopenbank` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 171 | `acceptStatus` | acceptStatus | `accept_status` | Short | `short` |
| 172 | `acceptancerbycust` | acceptancerbycust | `acceptancerbycust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 173 | `acceptancerbysupp` | acceptancerbysupp | `acceptancerbysupp` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 174 | `acceptbankaccbycust` | acceptbankaccbycust | `acceptbankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 175 | `applyType` | applyType | `applytype` | Short | `short` |
| 176 | `acceptbankaccbysupp` | acceptbankaccbysupp | `acceptbankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 177 | `acceptdate` | acceptdate | `acceptdate` | Date | `date` |
| 178 | `acceptopenbanknumber` | acceptopenbanknumber | `acceptopenbanknumber` | String | `text` |
| 179 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 180 | `billdirection` | billdirection | `billdirection` | Short | `short` |
| 181 | `canuseflow` | canuseflow | `canuseflow` | Boolean | `switch` |
| 182 | `changecount` | changecount | `changecount` | Integer | `int` |
| 183 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 184 | `gatherdate` | gatherdate | `gatherdate` | Date | `date` |
| 185 | `hasimpawn` | hasimpawn | `hasimpawn` | Boolean | `switch` |
| 186 | `hasused` | hasused | `hasused` | Boolean | `switch` |
| 187 | `holddays` | holddays | `holddays` | Long | `long` |
| 188 | `impawnbankaccbybank` | impawnbankaccbybank | `impawnbankaccbybank` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 189 | `protocolno` | protocolno | `protocolno` | String | `text` |
| 190 | `impawnbankaccbycust` | impawnbankaccbycust | `impawnbankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 191 | `disabletime` | disabletime | `disabletime` | DateTime | `timestamp` |
| 192 | `impawnbankaccbysupp` | impawnbankaccbysupp | `impawnbankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 193 | `disabledate` | disabledate | `disabledate` | Date | `date` |
| 194 | `impawnbankdot` | impawnbankdot | `impawnbankdot` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 195 | `disablenote` | disablenote | `disablenote` | String | `text` |
| 196 | `impawndate` | impawndate | `impawndate` | Date | `date` |
| 197 | `billstatus` | billstatus | `billstatus` | Short | `short` |
| 198 | `impawnenddate` | impawnenddate | `impawnenddate` | Date | `date` |
| 199 | `impawnerbank` | impawnerbank | `impawnerbank` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 200 | `disableuserid` | disableuserid | `disableuserid` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 201 | `impawnercust` | impawnercust | `impawnercust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 202 | `impawnerother` | impawnerother | `impawnerother` | String | `text` |
| 203 | `disableusername` | disableusername | `disableusername` | String | `text` |
| 204 | `impawnersupp` | impawnersupp | `impawnersupp` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 205 | `impawnroles` | impawnroles | `impawnroles` | Short | `short` |
| 206 | `invoiceOpenbankname` | invoiceOpenbankname | `invoiceOpenbankname` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 207 | `invoicerbankaccbycust` | invoicerbankaccbycust | `invoicerbankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 208 | `invoicerbankaccbyorg` | invoicerbankaccbyorg | `invoicerbankaccbyorg` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 209 | `invoicerbankaccbysupp` | invoicerbankaccbysupp | `invoicerbankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 210 | `invoicerbycust` | invoicerbycust | `invoicerbycust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 211 | `invoicerbysupp` | invoicerbysupp | `invoicerbysupp` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 212 | `isAutoAccept` | 是否AutoAccept | `is_auto_accept` | Boolean | `switch` |
| 213 | `isEcdsSign` | 是否EcdsSign | `isEcdsSign` | Boolean | `switch` |
| 214 | `ispaybill` | 是否paybill | `ispaybill` | Boolean | `switch` |
| 215 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 216 | `paybilldate` | paybilldate | `paybilldate` | Date | `date` |
| 217 | `paybillroles` | paybillroles | `paybillroles` | Short | `short` |
| 218 | `paycustomer` | paycustomer | `paycustomer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 219 | `paysupplier` | paysupplier | `paysupplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 220 | `receiveOpenbankname` | receiveOpenbankname | `receiveOpenbankname` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 221 | `receiverbankaccbyorg` | receiverbankaccbyorg | `receiverbankaccbyorg` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 222 | `receiverbyorg` | receiverbyorg | `receiverbyorg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 223 | `returncount` | returncount | `returncount` | Short | `short` |
| 224 | `securitymode` | securitymode | `securitymode` | Short | `short` |
| 225 | `recallStatus` | recallStatus | `recallstatus` | Short | `short` |
| 226 | `senddate` | senddate | `senddate` | Date | `date` |
| 227 | `withdrticketStatus` | withdrticketStatus | `withdrticketstatus` | Short | `short` |
| 228 | `senderid` | senderid | `senderid` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 229 | `sendername` | sendername | `sendername` | String | `text` |
| 230 | `sendtime` | sendtime | `sendtime` | DateTime | `timestamp` |
| 231 | `serialNum` | serialNum | `serial_num` | String | `text` |
| 232 | `settleamt` | settleamt | `settleamt` | Decimal | `number` |
| 233 | `showInvoiceOpenbankname` | showInvoiceOpenbankname | `showInvoiceOpenbankname` | String | `text` |
| 234 | `showReceiveOpenbankname` | showReceiveOpenbankname | `showReceiveOpenbankname` | String | `text` |
| 235 | `showimpawnbankacc` | showimpawnbankacc | `showimpawnbankacc` | String | `text` |
| 236 | `showpayunit` | showpayunit | `showpayunit` | String | `text` |
| 237 | `signtype` | signtype | `signtype` | Short | `short` |
| 238 | `srcbillid` | srcbillid | `srcbillid` | Long | `long` |
| 239 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 240 | `tplid` | tplid | `tplid` | Long | `long` |
| 241 | `accentity` | accentity | `accentity` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 242 | `applydate` | applydate | `applydate` | Date | `date` |
| 243 | `impawnmode` | impawnmode | `impawnmode` | Short | `short` |
| 244 | `returnbill` | returnbill | `returnbill` | Boolean | `switch` |
| 245 | `org` | org | `org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 246 | `blackbill` | blackbill | `blackbill` | Boolean | `switch` |
| 247 | `dept` | dept | `dept` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |
| 248 | `operator` | operator | `operator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 249 | `costproject` | costproject | `costproject` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 250 | `project` | project | `project` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 251 | `description` | description | `description` | String | `text` |
| 252 | `bustype` | bustype | `tradetype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 253 | `srcitem` | srcitem | `srcitem` | Short | `short` |
| 254 | `srcbilltype` | srcbilltype | `srcbilltype` | Short | `short` |
| 255 | `billtype` | billtype | `billtype` | Short | `short` |
| 256 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 257 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 258 | `code` | 编码 | `code` | String | `text` |
| 259 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 260 | `status` | 状态 | `status` | Short | `short` |
| 261 | `auditstatus` | auditstatus | `auditstatus` | Short | `short` |
| 262 | `auditDate` | auditDate | `audit_date` | Date | `date` |
| 263 | `voucherstatus` | voucherstatus | `voucherstatus` | Short | `short` |
| 264 | `isinit` | 是否init | `isinit` | Boolean | `switch` |
| 265 | `pushbill` | pushbill | `pushbill` | Boolean | `switch` |
| 266 | `olccurrency` | olccurrency | `olccurrency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 267 | `olcratetype` | olcratetype | `olcratetype` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 268 | `olcrate` | olcrate | `olcrate` | Decimal | `number` |
| 269 | `olcnotemoney` | olcnotemoney | `olcnotemoney` | Decimal | `number` |
| 270 | `olcsecuritymoney` | olcsecuritymoney | `olcsecuritymoney` | Decimal | `number` |
| 271 | `olcpoundageamount` | olcpoundageamount | `olcpoundageamount` | Decimal | `number` |
| 272 | `iselec` | 是否elec | `iselec` | Boolean | `switch` |
| 273 | `elecsignacc` | elecsignacc | `elecsignacc` | 96da623d-ced9-44d0-8448-45c389add0a1 | `quote` |
| 274 | `elecinvoicemode` | elecinvoicemode | `elecinvoicemode` | String | `text` |
| 275 | `elecplanstatus` | elecplanstatus | `elecplanstatus` | String | `text` |
| 276 | `instructStatus` | instructStatus | `instruct_status` | Short | `short` |
| 277 | `ecdsStatus` | ecdsStatus | `ecds_status` | String | `text` |
| 278 | `notetype` | notetype | `notetype` | 1ffb45b4-f3e9-4e02-8fa0-d3429c8d7fb4 | `quote` |
| 279 | `noteno` | noteno | `noteno` | String | `text` |
| 280 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 281 | `invoicedate` | invoicedate | `invoicedate` | Date | `date` |
| 282 | `enddate` | enddate | `enddate` | Date | `date` |
| 283 | `notemoney` | notemoney | `notemoney` | Decimal | `number` |
| 284 | `elecinvoicetype` | elecinvoicetype | `elecinvoicetype` | String | `text` |
| 285 | `invoiceroles` | invoiceroles | `invoiceroles` | Short | `short` |
| 286 | `invoicerbyorg` | invoicerbyorg | `invoicerbyorg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 287 | `showinvoicer` | showinvoicer | `showinvoicer` | String | `text` |
| 288 | `invoicerbankacc` | invoicerbankacc | `invoicerbankacc` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 289 | `showinvoicerbankacc` | showinvoicerbankacc | `showinvoicerbankacc` | String | `text` |
| 290 | `elecinvoiceaccname` | elecinvoiceaccname | `elecinvoiceaccname` | String | `text` |
| 291 | `elecinvoicebankname` | elecinvoicebankname | `elecinvoicebankname` | String | `text` |
| 292 | `elecinvoicebanknum` | elecinvoicebanknum | `elecinvoicebanknum` | String | `text` |
| 293 | `receiveroles` | receiveroles | `receiveroles` | Short | `short` |
| 294 | `elecreceivetype` | elecreceivetype | `elecreceivetype` | String | `text` |
| 295 | `receiverbycust` | receiverbycust | `receiverbycust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 296 | `receiverbysupp` | receiverbysupp | `receiverbysupp` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 297 | `showreceiver` | showreceiver | `showreceiver` | String | `text` |
| 298 | `receiverbankacc` | receiverbankacc | `receiverbankacc` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 299 | `receiverbankaccbycust` | receiverbankaccbycust | `receiverbankaccbycust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 300 | `receiverbankaccbysupp` | receiverbankaccbysupp | `receiverbankaccbysupp` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 301 | `showreceiverbankacc` | showreceiverbankacc | `showreceiverbankacc` | String | `text` |
| 302 | `elecreceiveaccname` | elecreceiveaccname | `elecreceiveaccname` | String | `text` |
| 303 | `elecreceivebankname` | elecreceivebankname | `elecreceivebankname` | String | `text` |
| 304 | `elecreceivebanknum` | elecreceivebanknum | `elecreceivebanknum` | String | `text` |
| 305 | `elecreceiveotherbank` | elecreceiveotherbank | `elecreceiveotherbank` | String | `text` |
| 306 | `acceptanceroles` | acceptanceroles | `acceptanceroles` | Short | `short` |
| 307 | `elecaccepttype` | elecaccepttype | `elecaccepttype` | String | `text` |
| 308 | `acceptancerbybank` | acceptancerbybank | `acceptancerbybank` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 309 | `acceptancerbyorg` | acceptancerbyorg | `acceptancerbyorg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 310 | `showacceptancer` | showacceptancer | `showacceptancer` | String | `text` |
| 311 | `acceptbankacc` | acceptbankacc | `acceptbankacc` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 312 | `showacceptbankacc` | showacceptbankacc | `showacceptbankacc` | String | `text` |
| 313 | `elecacceptaccname` | elecacceptaccname | `elecacceptaccname` | String | `text` |
| 314 | `elecacceptbankname` | elecacceptbankname | `elecacceptbankname` | String | `text` |
| 315 | `elecacceptbanknum` | elecacceptbanknum | `elecacceptbanknum` | String | `text` |
| 316 | `acceptopenbank` | acceptopenbank | `acceptopenbank` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 317 | `showacceptopenbank` | showacceptopenbank | `showacceptopenbank` | String | `text` |
| 318 | `acceptopenbankname` | acceptopenbankname | `acceptopenbankname` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 319 | `showacceptopenbankname` | showacceptopenbankname | `showacceptopenbankname` | String | `text` |
| 320 | `acceptanceno` | acceptanceno | `acceptanceno` | String | `text` |
| 321 | `contractno` | contractno | `contractno` | String | `text` |
| 322 | `elecacceptowner` | elecacceptowner | `elecacceptowner` | Boolean | `switch` |
| 323 | `elecacceptotherbank` | elecacceptotherbank | `elecacceptotherbank` | String | `text` |
| 324 | `notedescription` | notedescription | `notedescription` | String | `text` |
| 325 | `noteflag` | noteflag | `noteflag` | Short | `short` |
| 326 | `istransfer` | 是否transfer | `istransfer` | Boolean | `switch` |
| 327 | `buyerinterest` | buyerinterest | `buyerinterest` | Boolean | `switch` |
| 328 | `notestatus` | notestatus | `notestatus` | Short | `short` |
| 329 | `securityflag` | securityflag | `securityflag` | Boolean | `switch` |
| 330 | `securityaccount` | securityaccount | `securityaccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 331 | `securityrate` | securityrate | `securityrate` | Decimal | `number` |
| 332 | `securitymoney` | securitymoney | `securitymoney` | Decimal | `number` |
| 333 | `transoutaccount` | transoutaccount | `transoutaccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 334 | `settlemodesec` | settlemodesec | `settlemodesec` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 335 | `poundageflag` | poundageflag | `poundageflag` | Boolean | `switch` |
| 336 | `poundageamount` | poundageamount | `poundageamount` | Decimal | `number` |
| 337 | `poundageaccount` | poundageaccount | `poundageaccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 338 | `openserialno` | openserialno | `openserialno` | String | `text` |
| 339 | `settlemodepound` | settlemodepound | `settlemodepound` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 340 | `id` | ID | `id` | Long | `long` |
| 341 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 342 | `creator` | 创建人 | `creator` | String | `text` |
| 343 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 344 | `createDate` | createDate | `create_date` | Date | `date` |
| 345 | `modifier` | 修改人 | `modifier` | String | `text` |
| 346 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 347 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 348 | `auditor` | auditor | `auditor` | String | `text` |
| 349 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 350 | `pk_bankmsg` | pk_bankmsg | `pk_bankmsg` | a8e8326a-317f-4dae-8e68-d372b1437163 | `quote` |
| 351 | `usemoney` | usemoney | `usemoney` | Decimal | `number` |
| 352 | `defines` | defines | `` | 35d14c1c-9c69-47d8-87e1-18c169326a44 | `` |
| 353 | `drftNoteInformationAgreement` | drftNoteInformationAgreement | `` | 920f918a-6d49-4ea1-9ade-8a5ff35cb07b | `` |
| 354 | `drftNoteInformationContract` | drftNoteInformationContract | `` | fa4b58aa-1f7d-4a4a-bbac-64c4730b29af | `` |
| 355 | `drftNoteInformationListReasons` | drftNoteInformationListReasons | `` | 034a4297-2e16-426e-989a-0d9373c3c348 | `` |

## 关联（116 个）

- `impawnersupp` -> `aa.vendor.Vendor` () 
- `modifierId` -> `base.user.User` () 
- `drftNoteInformationAgreement` -> `drft.drftnoteinformation.DrftNoteInformationAgreement` (0..n) 
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `accentity` -> `aa.baseorg.OrgMV` () 
- `settlemodepound` -> `aa.settlemethod.SettleMethod` () 
- `defines` -> `drft.drftnoteinformation.DrftNoteInformationDefine` (1) 
- `acceptopenbankname` -> `bd.bank.BankDotVO` () 
- `designatedpersoncust` -> `aa.merchant.Merchant` () 
- `principalPayAccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `receiverbankaccbysupp` -> `aa.vendor.VendorBank` () 
- `acceptbankacc` -> `bd.enterprise.OrgFinBankacctVO` () 
- `invoicerbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `invoicerbycust` -> `aa.merchant.Merchant` () 
- `mainid` -> `drft.drftbatchsignnote.BatchSignNote` () 
- `entrustedPaycustomer` -> `aa.merchant.Merchant` () 
- `invoicerbyorg` -> `aa.baseorg.OrgMV` () 
- `tenant` -> `base.tenant.Tenant` () 
- `costCenter` -> `bd.costcenter.CostCenter` () 
- `signaccopenbank` -> `bd.bank.BankDotVO` () 
- `transoutaccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `acceptancerbyorg` -> `aa.baseorg.OrgMV` () 
- `impawneraccbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `oriPaybyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `receiverbyorg` -> `aa.baseorg.OrgMV` () 
- `paybankaccbyobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `quicktype` -> `bd.paymenttype.PaymentTypeVO` () 
- `costproject` -> `bd.expenseitem.ExpenseItem` () 
- `auditorId` -> `base.user.User` () 
- `acceptopenbank` -> `bd.bank.BankDotVO` () 
- `receiverbankacc` -> `bd.enterprise.OrgFinBankacctVO` () 
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `paybankaccbysupp` -> `aa.vendor.VendorBank` () 
- `oriPaysupplier` -> `aa.vendor.Vendor` () 
- `invoicerbankaccbyorg` -> `bd.enterprise.OrgFinBankacctVO` () 
- `invoicerbankacc` -> `bd.enterprise.OrgFinBankacctVO` () 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `agentsettlemode` -> `aa.settlemethod.SettleMethod` () 
- `notetype` -> `drft.billtype.BillType` () 
- `acceptancerbysupp` -> `aa.vendor.Vendor` () 
- `paysupplier` -> `aa.vendor.Vendor` () 
- `acceptbankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `poundageaccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `payInternalUnitAccountId` -> `bd.enterprise.OrgFinBankacctVO` () 
- `dept` -> `aa.baseorg.DeptMV` () 
- `acceptancerbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `invoicerbankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `entrustedPaybyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `impawnbankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `senderid` -> `base.user.User` () 
- `designatedpersonsupp` -> `aa.vendor.Vendor` () 
- `entrustedPaysupplier` -> `aa.vendor.Vendor` () 
- `chargetype` -> `bd.paymenttype.PaymentTypeVO` () 
- `impawnbankaccbybank` -> `bd.enterprise.OrgFinBankacctVO` () 
- `invoicerbysupp` -> `aa.vendor.Vendor` () 
- `withdrticketBankmsg` -> `drft.bankResMsg.BankResMsg` () 
- `drftNoteInformationDef` -> `drft.drftnoteinformation.DrftNoteInformationDef` () 
- `designatedpersonfund` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `receiveOpenbankname` -> `bd.bank.BankDotVO` () 
- `project` -> `bd.project.ProjectVO` () 
- `operator` -> `bd.staff.Staff` () 
- `settlemodesec` -> `aa.settlemethod.SettleMethod` () 
- `receiverbankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `receiverbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `olcratetype` -> `bd.exchangeRate.ExchangeRateTypeVO` () 
- `impawnercust` -> `aa.merchant.Merchant` () 
- `acceptaccbyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `principalAccentity` -> `aa.baseorg.OrgMV` () 
- `principalBillAccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `oripk_register` -> `drft.drftnoteinformation.DrftNoteInformation` () 
- `receiverbycust` -> `aa.merchant.Merchant` () 
- `impawnerbank` -> `bd.bank.BankDotVO` () 
- `drftNoteInformationContract` -> `drft.drftnoteinformation.DrftNoteInformationContract` (0..n) 
- `innersecurityaccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `pk_bankmsg2` -> `drft.bankResMsg.BankResMsg` () 
- `receiverbankaccbyorg` -> `bd.enterprise.OrgFinBankacctVO` () 
- `pk_bankmsg` -> `drft.bankResMsg.BankResMsg` () 
- `receiveraccbyobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `agentquicktype` -> `bd.paymenttype.PaymentTypeVO` () 
- `initialRegister` -> `drft.drftnoteinformation.DrftNoteInformation` () 
- `innerSettleAccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `elecsignacc` -> `tmsp.elebankaccountset.EleBankAccountSet` () 
- `innerreceiveraccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `acceptancerbybank` -> `bd.bank.BankDotVO` () 
- `disableuserid` -> `base.user.User` () 
- `securityaccount` -> `bd.enterprise.OrgFinBankacctVO` () 
- `inpoolorg` -> `drft.drftbillpoolagreemen.DrftBillPoolagreemen` () 
- `billPool` -> `drft.drftbillpoolagreemen.DrftBillPoolagreemen` () 
- `recallBankmsg` -> `drft.bankResMsg.BankResMsg` () 
- `creatorId` -> `base.user.User` () 
- `paybyfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `bankName` -> `bd.bank.BankVO` () 
- `drftNoteInformationListReasons` -> `drft.drftnoteinformation.DrftNoteInformationListReasons` (0..n) 
- `profitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
- `srcPkImpawn` -> `drft.impawnBean.ImpawnBean` () 
- `payInternalUnitId` -> `org.func.FundsOrg` () 
- `settlementOrg` -> `org.func.SettlementOrg` () 
- `circulateid` -> `drft.drftbillcirculate.DrftBillCirculate` () 
- `invoiceOpenbankname` -> `bd.bank.BankDotVO` () 
- `paybankaccbycust` -> `aa.merchant.AgentFinancial` () 
- `paycustomer` -> `aa.merchant.Merchant` () 
- `impawnbankdot` -> `bd.bank.BankDotVO` () 
- `signacc` -> `tmsp.elebankaccountset.EleBankAccountSet` () 
- `olccurrency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `org` -> `aa.baseorg.OrgMV` () 
- `oriPaycustomer` -> `aa.merchant.Merchant` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `accentityRaw` -> `aa.baseorg.OrgMV` () 
- `impawnbankaccbysupp` -> `aa.vendor.VendorBank` () 
- `acceptancerbycust` -> `aa.merchant.Merchant` () 
- `invoiceraccbyobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () 
- `receiverbysupp` -> `aa.vendor.Vendor` () 
- `bustype` -> `bd.bill.TransType` () 
- `impawnerfundobject` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () 
- `invoicerbankaccbysupp` -> `aa.vendor.VendorBank` () 
- `acceptbankaccbysupp` -> `aa.vendor.VendorBank` () 
