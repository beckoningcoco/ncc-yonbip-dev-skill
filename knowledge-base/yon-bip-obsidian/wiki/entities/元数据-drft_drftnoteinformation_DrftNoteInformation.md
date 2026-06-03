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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_noteinformation` | domain：`drft` | 应用：`DRFT` | 业务对象ID：`b9965bca-9226-4556-a216-0293d4f42e21`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据信息 |
| 物理表 | `drft_noteinformation` |
| 数据库 schema | `drft` |
| 所属应用 | `DRFT` |
| 直连字段 | 355 个 |
| 子表 | 4 个 |
| 关联引用 | 116 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `drftNoteInformationAgreement` | `drft.drftnoteinformation.DrftNoteInformationAgreement` | composition |
| `drftNoteInformationListReasons` | `drft.drftnoteinformation.DrftNoteInformationListReasons` | composition |
| `drftNoteInformationContract` | `drft.drftnoteinformation.DrftNoteInformationContract` | composition |
| `defines` | `drft.drftnoteinformation.DrftNoteInformationDefine` | composition |

## 关联引用 (116个)

| 字段名 | 引用类型 |
|--------|---------|
| `impawnersupp` | `yssupplier.aa_vendor` |
| `` | `` |
| `wbs` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `settlemodepound` | `productcenter.aa_settlemethodref` |
| `acceptopenbankname` | `ucfbasedoc.bd_bankdotref` |
| `designatedpersoncust` | `` |
| `principalPayAccount` | `` |
| `receiverbankaccbysupp` | `yssupplier.aa_vendorbankref` |
| `acceptbankacc` | `ucfbasedoc.bd_enterprisebankacctref` |
| `invoicerbyfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `invoicerbycust` | `productcenter.aa_merchantref` |
| `mainid` | `` |
| `entrustedPaycustomer` | `productcenter.aa_merchantref` |
| `invoicerbyorg` | `ucf-org-center.bd_financeorgtreeref_na` |
| `tenant_id` | `` |
| `cost_center` | `` |
| `signaccopenbank` | `ucfbasedoc.bd_bankdotref` |
| `transoutaccount` | `ucfbasedoc.bd_enterprisebankacctref` |
| `acceptancerbyorg` | `ucf-org-center.bd_financeorgtreeref_na` |
| `impawneraccbyfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `oriPaybyfundobject` | `` |
| `receiverbyorg` | `	ucf-org-center.bd_financeorgtreeref_na` |
| `paybankaccbyobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `quicktype` | `finbd.bd_paymenttyperef` |
| `costproject` | `finbd.bd_expenseitemref` |
| `acceptopenbank` | `ucfbasedoc.bd_bankcardref` |
| `receiverbankacc` | `bd_enterprisebankacctref` |
| `activity` | `` |
| `paybankaccbysupp` | `productcenter.aa_vendorbankref` |
| `oriPaysupplier` | `` |
| `invoicerbankaccbyorg` | `` |
| `invoicerbankacc` | `ucfbasedoc.bd_enterprisebankacctref` |
| `currency` | `ucfbasedoc.bd_currencytenantreflist` |
| `agentsettlemode` | `` |
| `notetype` | `drft.drft_billtyperef` |
| `acceptancerbysupp` | `yssupplier.aa_vendor` |
| `paysupplier` | `yssupplier.aa_vendor` |
| `acceptbankaccbycust` | `productcenter.aa_merchantbankref` |
| `poundageaccount` | `ucfbasedoc.bd_enterprisebankacctref` |
| `pay_internal_unit_account_id` | `` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `acceptancerbyfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `invoicerbankaccbycust` | `productcenter.aa_merchantbankref` |
| `entrustedPaybyfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `impawnbankaccbycust` | `productcenter.aa_merchantbankref` |
| `senderid` | `` |
| `designatedpersonsupp` | `` |
| `entrustedPaysupplier` | `yssupplier.aa_vendor` |
| `chargetype` | `finbd.bd_paymenttyperef` |
| `impawnbankaccbybank` | `bd_enterprisebankacctref` |
| `invoicerbysupp` | `yssupplier.aa_vendor` |
| `withdrticketbankmsg` | `drft.drft_instructRef` |
| `drftnoteinformation_def` | `` |
| `designatedpersonfund` | `` |
| `receiveOpenbankname` | `ucfbasedoc.bd_bankdotref` |
| `project` | `ucfbasedoc.bd_projectNewRef` |
| `operator` | `aa_operator` |
| `settlemodesec` | `productcenter.aa_settlemethodref` |
| `receiverbankaccbycust` | `yssupplier.aa_merchantbankref` |
| `receiverbyfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `olcratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `impawnercust` | `productcenter.aa_merchantref` |
| `acceptaccbyfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `principalAccentity` | `` |
| `principalBillAccount` | `` |
| `oripk_register` | `` |
| `receiverbycust` | `productcenter.aa_merchantref` |
| `impawnerbank` | `ucfbasedoc.bd_bankdotref` |
| `innersecurityaccount` | `` |
| `pk_bankmsg2` | `drft.drft_instructRef` |
| `receiverbankaccbyorg` | `ucfbasedoc.bd_enterprisebankacctref` |
| `pk_bankmsg` | `drft.drft_instructRef` |
| `receiveraccbyobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `agentquicktype` | `` |
| `initialRegister` | `` |
| `inner_settle_account` | `` |
| `elecsignacc` | `yonbip-fi-ctmtmsp.tmsp_elebankaccountref` |
| `innerreceiveraccount` | `` |
| `acceptancerbybank` | `ucfbasedoc.bd_bankdotref` |
| `disableuserid` | `` |
| `securityaccount` | `ucfbasedoc.bd_enterprisebankacctref` |
| `inpoolorg` | `drft.drft_billpoolagreemenref` |
| `bill_pool` | `drft.drft_billpoolagreemenref` |
| `recallbankmsg` | `drft.drft_instructRef` |
| `paybyfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `bankName` | `` |
| `profit_center` | `` |
| `src_pk_impawn` | `` |
| `pay_internal_unit_id` | `` |
| `settlementOrg` | `` |
| `circulateid` | `` |
| `invoiceOpenbankname` | `ucfbasedoc.bd_bankdotref` |
| `paybankaccbycust` | `productcenter.aa_merchantbankref` |
| `paycustomer` | `productcenter.aa_merchantref` |
| `impawnbankdot` | `ucfbasedoc.bd_bankdotref` |
| `signacc` | `yonbip-fi-ctmtmsp.tmsp_elebankaccountref` |
| `olccurrency` | `ucfbasedoc.bd_currencytenantreflist` |
| `org` | `aa_org` |
| `oriPaycustomer` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `impawnbankaccbysupp` | `aa_vendorbankref` |
| `acceptancerbycust` | `productcenter.aa_merchantref` |
| `invoiceraccbyobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `receiverbysupp` | `yssupplier.aa_vendor` |
| `tradetype` | `transtype.bd_billtyperef` |
| `impawnerfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `invoicerbankaccbysupp` | `productcenter.aa_vendorbankref` |
| `acceptbankaccbysupp` | `productcenter.aa_vendorbankref` |

## 继承接口 (4个, 10字段)

- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 355 个直连字段

### 文本字段 (78个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `impawnerfundobjecttpye` | `impawnerfundobjecttpye` | `impawnerfundobjecttpye` | 质权人资金业务对象类型 |
| `invoicerbyfundobjecttpye` | `invoicerbyfundobjecttpye` | `invoicerbyfundobjecttpye` | 出票人资金业务对象类型 |
| `paybyfundobjecttpye` | `paybyfundobjecttpye` | `paybyfundobjecttpye` | 付票人资金业务对象类型 |
| `receiverbyfundobjecttpye` | `receiverbyfundobjecttpye` | `receiverbyfundobjecttpye` | 收票人资金业务对象类型 |
| `showpaybankacc` | `showpaybankacc` | `showpaybankacc` | 显示付票人银行账号 |
| `inner_margin_pay_ident_code` | `inner_margin_pay_ident_code` | `innerMarginPayIdentCode` | 内部保证金付款对账码 |
| `identification_code` | `identification_code` | `identificationCode` | 财资统一对账码 |
| `inner_margin_rec_ident_code` | `inner_margin_rec_ident_code` | `innerMarginRecIdentCode` | 内部保证金收款对账码 |
| `bank_poundage_ident_code` | `bank_poundage_ident_code` | `bankPoundageIdentCode` | 银行手续费财资对账码 |
| `inner_poundage_ident_code` | `inner_poundage_ident_code` | `innerPoundageIdentCode` | 内部手续费财资对账码 |
| `agent_margin_ident_code` | `agent_margin_ident_code` | `agentMarginIdentCode` | 代理票款财资对账码 |
| `acceptcreditcode` | `acceptcreditcode` | `acceptcreditcode` | 承兑人统一社会信用代码 |
| `acceptancerbyfundobjecttpye` | `acceptancerbyfundobjecttpye` | `acceptancerbyfundobjecttpye` | 承兑人资金业务对象类型 |
| `bill_range` | `bill_range` | `billRange` | 显示区间 |
| `available_range` | `available_range` | `availableRange` | 可用区间/可用子票号 |
| `paymentdate` | `paymentdate` | `paymentDate` | 付款期 |
| `entrustedShowpayunit` | `entrustedShowpayunit` | `entrustedShowpayunit` | 被委托付票单位 |
| `invoiceno` | `invoiceno` | `invoiceno` | 发票号码 |
| `surplus_bill_range` | `surplus_bill_range` | `surplusBillRange` | 剩余质押区间 |
| `in_pool_range` | `in_pool_range` | `inPoolRange` | 在池区间 |
| `refuseReason` | `refuseReason` | `refuseReason` | 拒收原因 |
| `oriShowpayunit` | `oriShowpayunit` | `oriShowpayunit` | 显示最初付票单位 |
| `namelistType` | `namelistType` | `namelistType` | 名单类型 |
| `controlType` | `controlType` | `controlType` | 名单控制方式 |
| `issuercreditcode` | `issuercreditcode` | `issuercreditcode` | 出票人统一社会信用代码 |
| `payeecreditcode` | `payeecreditcode` | `payeecreditcode` | 收票人统一社会信用代码 |
| `designatedperson` | `designatedperson` | `designatedperson` | 被指定人 |
| `designatedpersoncreditcode` | `designatedpersoncreditcode` | `designatedpersoncreditcode` | 被指定人统一社会信用代码 |
| `paymentcommitmentletternumber` | `paymentcommitmentletternumber` | `paymentcommitmentletternumber` | 付款承诺函编号 |
| `oldnoteno` | `oldnoteno` | `oldnoteno` | 原供票编号 |
| `residuenoteno` | `residuenoteno` | `residuenoteno` | 剩余供票最新编号 |
| `reasonname` | `reasonname` | `reasonname` | 名单来源 |
| `acceptopenbanknumber` | `acceptopenbanknumber` | `acceptopenbanknumber` | 承兑人开户行行号(银行提供) |
| `protocolno` | `protocolno` | `protocolno` | 协议编号 |
| `disablenote` | `disablenote` | `disablenote` | 作废原因 |
| `impawnerother` | `impawnerother` | `impawnerother` | 质押人其他 |
| `disableusername` | `disableusername` | `disableusername` | 作废人 |
| `sendername` | `sendername` | `sendername` | 发送人名称 |
| `serial_num` | `serial_num` | `serialNum` | 业务流水号 |
| `showInvoiceOpenbankname` | `showInvoiceOpenbankname` | `showInvoiceOpenbankname` | 显示出票人开户行名 |
| `showReceiveOpenbankname` | `showReceiveOpenbankname` | `showReceiveOpenbankname` | 显示收票人开户行名 |
| `showimpawnbankacc` | `showimpawnbankacc` | `showimpawnbankacc` | 质权人账号其他 |
| `showpayunit` | `showpayunit` | `showpayunit` | 付票单位 |
| `description` | `description` | `description` | 备注 |
| `` | `code` | `code` | 单据编号 |
| `elecinvoicemode` | `elecinvoicemode` | `elecinvoicemode` | 票据方式 |
| `elecplanstatus` | `elecplanstatus` | `elecplanstatus` | 计划开票状态 |
| `ecds_status` | `ecds_status` | `ecdsStatus` | 银企联电票状态 |
| `noteno` | `noteno` | `noteno` | 票据号 |
| `elecinvoicetype` | `elecinvoicetype` | `elecinvoicetype` | 出票人类别 |
| `showinvoicer` | `showinvoicer` | `showinvoicer` | 出票人 |
| `showinvoicerbankacc` | `showinvoicerbankacc` | `showinvoicerbankacc` | 出票人银行账号 |
| `elecinvoiceaccname` | `elecinvoiceaccname` | `elecinvoiceaccname` | 出票人账户名称 |
| `elecinvoicebankname` | `elecinvoicebankname` | `elecinvoicebankname` | 出票人银行名称 |
| `elecinvoicebanknum` | `elecinvoicebanknum` | `elecinvoicebanknum` | 出票人银行代码 |
| `elecreceivetype` | `elecreceivetype` | `elecreceivetype` | 收款人类别 |
| `showreceiver` | `showreceiver` | `showreceiver` | 收款人 |
| `showreceiverbankacc` | `showreceiverbankacc` | `showreceiverbankacc` | 收款人银行账号 |
| `elecreceiveaccname` | `elecreceiveaccname` | `elecreceiveaccname` | 收款人账户名称 |
| `elecreceivebankname` | `elecreceivebankname` | `elecreceivebankname` | 收款人银行名称 |
| `elecreceivebanknum` | `elecreceivebanknum` | `elecreceivebanknum` | 收款人银行代码 |
| `elecreceiveotherbank` | `elecreceiveotherbank` | `elecreceiveotherbank` | 收款人跨行标志 |
| `elecaccepttype` | `elecaccepttype` | `elecaccepttype` | 承兑人类别 |
| `showacceptancer` | `showacceptancer` | `showacceptancer` | 承兑人 |
| `showacceptbankacc` | `showacceptbankacc` | `showacceptbankacc` | 承兑人银行账号 |
| `elecacceptaccname` | `elecacceptaccname` | `elecacceptaccname` | 承兑人账户名称 |
| `elecacceptbankname` | `elecacceptbankname` | `elecacceptbankname` | 承兑人银行名称 |
| `elecacceptbanknum` | `elecacceptbanknum` | `elecacceptbanknum` | 承兑人银行代码 |
| `showacceptopenbank` | `showacceptopenbank` | `showacceptopenbank` | 承兑人开户银行 |
| `showacceptopenbankname` | `showacceptopenbankname` | `showacceptopenbankname` | 承兑人开户行名 |
| `acceptanceno` | `acceptanceno` | `acceptanceno` | 承兑协议号 |
| `contractno` | `contractno` | `contractno` | 交易合同号 |
| `elecacceptotherbank` | `elecacceptotherbank` | `elecacceptotherbank` | 承兑人跨行标志 |
| `notedescription` | `notedescription` | `notedescription` | 票据备注 |
| `openserialno` | `openserialno` | `openserialno` | 开票线索号 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |

### 引用字段 (111个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acceptaccbyfundobject` | `acceptaccbyfundobject` | `acceptaccbyfundobject` | 承兑人资金业务对象账号 |
| `acceptancerbyfundobject` | `acceptancerbyfundobject` | `acceptancerbyfundobject` | 承兑人资金业务对象 |
| `chargetype` | `chargetype` | `chargetype` | 手续费款项类型 |
| `impawneraccbyfundobject` | `impawneraccbyfundobject` | `impawneraccbyfundobject` | 质权人资金业务对象账号 |
| `impawnerfundobject` | `impawnerfundobject` | `impawnerfundobject` | 质权人资金业务对象 |
| `invoiceraccbyobject` | `invoiceraccbyobject` | `invoiceraccbyobject` | 出票人资金业务对象账号 |
| `invoicerbyfundobject` | `invoicerbyfundobject` | `invoicerbyfundobject` | 出票人资金业务对象 |
| `paybankaccbycust` | `paybankaccbycust` | `paybankaccbycust` | 付票人客户银行账号 |
| `paybankaccbyobject` | `paybankaccbyobject` | `paybankaccbyobject` | 付票人资金业务对象账号 |
| `paybankaccbysupp` | `paybankaccbysupp` | `paybankaccbysupp` | 付票人供应商银行账号 |
| `paybyfundobject` | `paybyfundobject` | `paybyfundobject` | 付票人资金业务对象 |
| `quicktype` | `quicktype` | `quicktype` | 保证金款项类型 |
| `receiveraccbyobject` | `receiveraccbyobject` | `receiveraccbyobject` | 收票人资金业务对象账号 |
| `receiverbyfundobject` | `receiverbyfundobject` | `receiverbyfundobject` | 收票人资金业务对象 |
| `recallbankmsg` | `recallbankmsg` | `recallBankmsg` | 撤回指令信息主键 |
| `withdrticketbankmsg` | `withdrticketbankmsg` | `withdrticketBankmsg` | 撤票指令信息主键 |
| `bankName` | `bankName` | `bankName` | 签约银行 |
| `bill_pool` | `bill_pool` | `billPool` | 票据池 |
| `inpoolorg` | `inpoolorg` | `inpoolorg` | 入池机构 |
| `inner_settle_account` | `inner_settle_account` | `innerSettleAccount` | 内部清算账号 |
| `pay_internal_unit_id` | `pay_internal_unit_id` | `payInternalUnitId` | 付票方内部单位ID |
| `pay_internal_unit_account_id` | `pay_internal_unit_account_id` | `payInternalUnitAccountId` | 付票方内部单位账号ID |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `circulateid` | `circulateid` | `circulateid` | 票据流转信息 |
| `entrustedPaycustomer` | `entrustedPaycustomer` | `entrustedPaycustomer` | 被委托付票单位客户 |
| `entrustedPaysupplier` | `entrustedPaysupplier` | `entrustedPaysupplier` | 被委托付票单位供应商 |
| `entrustedPaybyfundobject` | `entrustedPaybyfundobject` | `entrustedPaybyfundobject` | 被委托付票人资金业务对象 |
| `src_pk_impawn` | `src_pk_impawn` | `srcPkImpawn` | 原始质押组件 |
| `pk_bankmsg2` | `pk_bankmsg2` | `pk_bankmsg2` | 不得转让撤销指令信息主键.ID |
| `oriPaycustomer` | `oriPaycustomer` | `oriPaycustomer` | 最初付票单位客户 |
| `oriPaysupplier` | `oriPaysupplier` | `oriPaysupplier` | 最初付票单位供应商 |
| `oriPaybyfundobject` | `oriPaybyfundobject` | `oriPaybyfundobject` | 最初付票人资金业务对象 |
| `oripk_register` | `oripk_register` | `oripk_register` | 业务收票主键 |
| `principalAccentity` | `principalAccentity` | `principalAccentity` | 实际用票单位 |
| `principalBillAccount` | `principalBillAccount` | `principalBillAccount` | 内部票据户 |
| `principalPayAccount` | `principalPayAccount` | `principalPayAccount` | 内部扣款账户 |
| `initialRegister` | `initialRegister` | `initialRegister` | 最初业务收票主键 |
| `designatedpersonsupp` | `designatedpersonsupp` | `designatedpersonsupp` | 被指定人供应商 |
| `designatedpersoncust` | `designatedpersoncust` | `designatedpersoncust` | 被指定人客户 |
| `designatedpersonfund` | `designatedpersonfund` | `designatedpersonfund` | 被指定人资金伙伴 |
| `mainid` | `mainid` | `mainid` | 票据签发id |
| `settlementOrg` | `settlementOrg` | `settlementOrg` | 结算中心 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `agentquicktype` | `agentquicktype` | `agentquicktype` | 代理款项类型 |
| `agentsettlemode` | `agentsettlemode` | `agentsettlemode` | 代理结算方式 |
| `innersecurityaccount` | `innersecurityaccount` | `innersecurityaccount` | 内部保证金账号 |
| `innerreceiveraccount` | `innerreceiveraccount` | `innerreceiveraccount` | 本方收款账号 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `signacc` | `signacc` | `signacc` | 签约账号 |
| `signaccopenbank` | `signaccopenbank` | `signaccopenbank` | 签约账号开户行 |
| `acceptancerbycust` | `acceptancerbycust` | `acceptancerbycust` | 承兑人客户 |
| `acceptancerbysupp` | `acceptancerbysupp` | `acceptancerbysupp` | 承兑人供应商 |
| `acceptbankaccbycust` | `acceptbankaccbycust` | `acceptbankaccbycust` | 承兑人客户银行账号 |
| `acceptbankaccbysupp` | `acceptbankaccbysupp` | `acceptbankaccbysupp` | 承兑人供应商银行账号 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `impawnbankaccbybank` | `impawnbankaccbybank` | `impawnbankaccbybank` | 质权人账号银行 |
| `impawnbankaccbycust` | `impawnbankaccbycust` | `impawnbankaccbycust` | 质权人账号客户 |
| `impawnbankaccbysupp` | `impawnbankaccbysupp` | `impawnbankaccbysupp` | 质权人账号供应商 |
| `impawnbankdot` | `impawnbankdot` | `impawnbankdot` | 质权人银行名称 |
| `impawnerbank` | `impawnerbank` | `impawnerbank` | 质押人银行 |
| `disableuserid` | `disableuserid` | `disableuserid` | 作废人id |
| `impawnercust` | `impawnercust` | `impawnercust` | 质押人客户 |
| `impawnersupp` | `impawnersupp` | `impawnersupp` | 质押人供应商 |
| `invoiceOpenbankname` | `invoiceOpenbankname` | `invoiceOpenbankname` | 出票人开户行名 |
| `invoicerbankaccbycust` | `invoicerbankaccbycust` | `invoicerbankaccbycust` | 出票人客户银行账号 |
| `invoicerbankaccbyorg` | `invoicerbankaccbyorg` | `invoicerbankaccbyorg` | 出票人企业银行账号 |
| `invoicerbankaccbysupp` | `invoicerbankaccbysupp` | `invoicerbankaccbysupp` | 出票人供应商银行账号 |
| `invoicerbycust` | `invoicerbycust` | `invoicerbycust` | 出票人客户 |
| `invoicerbysupp` | `invoicerbysupp` | `invoicerbysupp` | 出票人供应商 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `paycustomer` | `paycustomer` | `paycustomer` | 付票单位客户 |
| `paysupplier` | `paysupplier` | `paysupplier` | 付票单位供应商 |
| `receiveOpenbankname` | `receiveOpenbankname` | `receiveOpenbankname` | 收票人开户行名 |
| `receiverbankaccbyorg` | `receiverbankaccbyorg` | `receiverbankaccbyorg` | 收款人会计主体银行账号 |
| `receiverbyorg` | `receiverbyorg` | `receiverbyorg` | 收款人会计主体 |
| `senderid` | `senderid` | `senderid` | 发送人id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `org` | `org` | `org` | 业务组织id |
| `dept` | `dept` | `dept` | 部门id |
| `operator` | `operator` | `operator` | 业务员id |
| `costproject` | `costproject` | `costproject` | 费用项目id |
| `project` | `project` | `project` | 项目id |
| `tradetype` | `tradetype` | `bustype` | 交易类型id |
| `olccurrency` | `olccurrency` | `olccurrency` | 组织本币id |
| `olcratetype` | `olcratetype` | `olcratetype` | 组织本币汇率类型id |
| `elecsignacc` | `elecsignacc` | `elecsignacc` | 电票签约账户id |
| `notetype` | `notetype` | `notetype` | 票据类型id |
| `currency` | `currency` | `currency` | 币种id |
| `invoicerbyorg` | `invoicerbyorg` | `invoicerbyorg` | 出票人id |
| `invoicerbankacc` | `invoicerbankacc` | `invoicerbankacc` | 出票人银行账号id |
| `receiverbycust` | `receiverbycust` | `receiverbycust` | 收款人id |
| `receiverbysupp` | `receiverbysupp` | `receiverbysupp` | 收款人id |
| `receiverbankacc` | `receiverbankacc` | `receiverbankacc` | 收款人银行账号id |
| `receiverbankaccbycust` | `receiverbankaccbycust` | `receiverbankaccbycust` | 收款人银行账号id |
| `receiverbankaccbysupp` | `receiverbankaccbysupp` | `receiverbankaccbysupp` | 收款人银行账号id |
| `acceptancerbybank` | `acceptancerbybank` | `acceptancerbybank` | 承兑人id |
| `acceptancerbyorg` | `acceptancerbyorg` | `acceptancerbyorg` | 承兑人id |
| `acceptbankacc` | `acceptbankacc` | `acceptbankacc` | 承兑人银行账号id |
| `acceptopenbank` | `acceptopenbank` | `acceptopenbank` | 承兑人开户银行id |
| `acceptopenbankname` | `acceptopenbankname` | `acceptopenbankname` | 承兑人开户行名id |
| `securityaccount` | `securityaccount` | `securityaccount` | 保证金账户id |
| `transoutaccount` | `transoutaccount` | `transoutaccount` | 转出银行账号 |
| `settlemodesec` | `settlemodesec` | `settlemodesec` | 结算方式ID |
| `poundageaccount` | `poundageaccount` | `poundageaccount` | 手续费账户 |
| `settlemodepound` | `settlemodepound` | `settlemodepound` | 结算方式ID |
| `pk_bankmsg` | `pk_bankmsg` | `pk_bankmsg` | 指令信息主键 |

### 日期字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `innerDate` | `innerDate` | `innerDate` | 入池日期 |
| `settleSuccBizTime` | `settleSuccBizTime` | `settleSuccBizTime` | 结算成功业务时间 |
| `vouchersEntryDate` | `vouchersEntryDate` | `vouchersEntryDate` | 凭证登账日期 |
| `businessAccountDate` | `businessAccountDate` | `businessAccountDate` | 收票成功日期 |
| `settleEndDate` | `settleEndDate` | `settleEndDate` | 结算完成日期 |
| `signDate` | `signDate` | `signDate` | 签收日期 |
| `remainEndDate` | `remainEndDate` | `remainEndDate` | 距离到期日期 |
| `acceptdate` | `acceptdate` | `acceptdate` | 承兑日期 |
| `gatherdate` | `gatherdate` | `gatherdate` | 收票日期 |
| `disabledate` | `disabledate` | `disabledate` | 作废日期 |
| `impawndate` | `impawndate` | `impawndate` | 质押日期 |
| `impawnenddate` | `impawnenddate` | `impawnenddate` | 质押到期日 |
| `paybilldate` | `paybilldate` | `paybilldate` | 付票日期 |
| `senddate` | `senddate` | `senddate` | 发送日期 |
| `applydate` | `applydate` | `applydate` | 签发日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `invoicedate` | `invoicedate` | `invoicedate` | 出票日期 |
| `enddate` | `enddate` | `enddate` | 到期日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `hasUsedExclusiveBillPool` | `hasUsedExclusiveBillPool` | `hasUsedExclusiveBillPool` | 已使用(票据池独有字段) |
| `pushSecurity` | `pushSecurity` | `pushSecurity` | 是否推送保证金台账 |
| `useStwb` | `useStwb` | `useStwb` | 是否集成资金结算 |
| `new_note_flag` | `new_note_flag` | `newNoteFlag` | 新一代票据 |
| `ifsepFlow` | `ifsepFlow` | `ifsepFlow` | 设置能否分包流转 |
| `whitebill` | `whitebill` | `whitebill` | 是否白名单 |
| `acceptanceInBlackList` | `acceptanceInBlackList` | `acceptanceInBlackList` | 承兑人黑名单 |
| `acceptanceInWhiteList` | `acceptanceInWhiteList` | `acceptanceInWhiteList` | 承兑人白名单 |
| `ticketCollectionEnd` | `ticketCollectionEnd` | `ticketCollectionEnd` | 收票完成 |
| `auditsettlementdrive` | `auditsettlementdrive` | `auditsettlementdrive` | 审批流程是否由结算单驱动 |
| `sameAccentity` | `sameAccentity` | `sameAccentity` | 同会计主体收票 |
| `agentopennote` | `agentopennote` | `agentopennote` | 代理开票 |
| `ticket_collection_completed` | `ticket_collection_completed` | `ticketCollectionCompleted` | 收票完成 |
| `nextmerchantdesignated` | `nextmerchantdesignated` | `nextmerchantdesignated` | 是否指定下一手客商 |
| `isHandledSupplement` | `isHandledSupplement` | `isHandledSupplement` | 已办理补单 |
| `waitsettleoper` | `waitsettleoper` | `waitsettleoper` | 待取消结算 |
| `iscontributelimit` | `iscontributelimit` | `iscontributelimit` | 是否贡献额度 |
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `hasimpawn` | `hasimpawn` | `hasimpawn` | 已质押 |
| `hasused` | `hasused` | `hasused` | 已使用 |
| `is_auto_accept` | `is_auto_accept` | `isAutoAccept` | 是否自动承兑 |
| `isEcdsSign` | `isEcdsSign` | `isEcdsSign` | 由电票签收生成 |
| `ispaybill` | `ispaybill` | `ispaybill` | 已付票 |
| `returnbill` | `returnbill` | `returnbill` | 回头票 |
| `blackbill` | `blackbill` | `blackbill` | 黑名单 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |
| `isinit` | `isinit` | `isinit` | 是否期初 |
| `pushbill` | `pushbill` | `pushbill` | 已推单 |
| `iselec` | `iselec` | `iselec` | 是否直联 |
| `elecacceptowner` | `elecacceptowner` | `elecacceptowner` | 是否本人承兑 |
| `istransfer` | `istransfer` | `istransfer` | 可转让 |
| `buyerinterest` | `buyerinterest` | `buyerinterest` | 买方付息 |
| `securityflag` | `securityflag` | `securityflag` | 保证金 |
| `poundageflag` | `poundageflag` | `poundageflag` | 手续费 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `noteSettlementStatus` | `noteSettlementStatus` | `noteSettlementStatus` | 代理票款结算状态 |
| `changecount` | `changecount` | `changecount` | 转手次数 |

### 短整数 (59个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settlementStatus` | `settlementStatus` | `settlementStatus` | 结算状态 |
| `impawntype` | `impawntype` | `impawntype` | 质押方式 |
| `inpooluse` | `inpooluse` | `inpooluse` | 入池用途 |
| `agent_security_settlement_status` | `agent_security_settlement_status` | `agentSecuritySettlementStatus` | 代理保证金结算状态 |
| `olc_rate_ops` | `olc_rate_ops` | `olcRateOps` | 组织本币汇率折算方式 |
| `einner_security_payee_roles` | `einner_security_payee_roles` | `einnerSecurityPayeeRoles` | 内部保证金收款方 |
| `einner_security_settlement_status` | `einner_security_settlement_status` | `einnerSecuritySettlementStatus` | 内部手续费结算状态 |
| `securityType` | `securityType` | `securityType` | 保证金分类 |
| `settledSupplementType` | `settledSupplementType` | `settledSupplementType` | 保证金结算处理模式 |
| `integratestatus` | `integratestatus` | `integratestatus` | 集成使用状态 |
| `src_flag` | `src_flag` | `srcFlag` | 来源标识 |
| `payperiodunit` | `payperiodunit` | `payPeriodUnit` | 付款期单位 |
| `signnoteinstructtype` | `signnoteinstructtype` | `signnoteInstructType` | 指令类型 |
| `entrustedPaybillroles` | `entrustedPaybillroles` | `entrustedPaybillroles` | 被委托付票方 |
| `collecticketstatus` | `collecticketstatus` | `collecticketstatus` | 集票宝状态 |
| `checkresult` | `checkresult` | `checkresult` | 集票宝对账结果出票 |
| `bankmsg2Status` | `bankmsg2Status` | `bankmsg2Status` | 不得转让撤销指令状态 |
| `securitySettlementStatus` | `securitySettlementStatus` | `securitySettlementStatus` | 保证金结算状态 |
| `paymentway` | `paymentway` | `paymentway` | 付款方式 |
| `signRefuse` | `signRefuse` | `signRefuse` | 签收/拒收 |
| `riskPriority` | `riskPriority` | `riskPriority` | 风险策略 |
| `oriPaybillroles` | `oriPaybillroles` | `oriPaybillroles` | 最初付票方 |
| `receivebilltype` | `receivebilltype` | `receivebilltype` | 收票类型 |
| `payTime` | `payTime` | `payTime` | 扣款时机 |
| `ticket_holding_mode` | `ticket_holding_mode` | `ticketHoldingMode` | 持票模式 |
| `designatedparty` | `designatedparty` | `designatedparty` | 被指定方 |
| `interestpaymentmode` | `interestpaymentmode` | `interestpaymentmode` | 付息模式 |
| `paymenttermtype` | `paymenttermtype` | `paymenttermtype` | 承诺付款期类型 |
| `checkresultacceptance` | `checkresultacceptance` | `checkresultacceptance` | 集票宝对账结果承兑 |
| `securitypushtiming` | `securitypushtiming` | `securitypushtiming` | 推送保证金时机 |
| `budgetstatus` | `budgetstatus` | `budgetstatus` | 预算占用状态 |
| `budgetactualaction` | `budgetactualaction` | `budgetactualaction` | 预算实占动作 |
| `handleResult` | `handleResult` | `handleResult` | 办理结果 |
| `settlesignstatus` | `settlesignstatus` | `settlesignstatus` | 结算选择签发单状态 |
| `accept_status` | `accept_status` | `acceptStatus` | 承兑状态 |
| `applytype` | `applytype` | `applyType` | 申请方式 |
| `billdirection` | `billdirection` | `billdirection` | 票据方向 |
| `billstatus` | `billstatus` | `billstatus` | 单据状态 |
| `impawnroles` | `impawnroles` | `impawnroles` | 质押方 |
| `paybillroles` | `paybillroles` | `paybillroles` | 付票方 |
| `` | `returncount` | `returncount` | 退回次数 |
| `securitymode` | `securitymode` | `securitymode` | 保证金来源 |
| `recallstatus` | `recallstatus` | `recallStatus` | 撤回指令状态 |
| `withdrticketstatus` | `withdrticketstatus` | `withdrticketStatus` | 撤票指令状态 |
| `signtype` | `signtype` | `signtype` | 签收类型 |
| `impawnmode` | `impawnmode` | `impawnmode` | 担保方式 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `srcbilltype` | `srcbilltype` | `srcbilltype` | 事项类型 |
| `billtype` | `billtype` | `billtype` | 单据类型 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `status` | `status` | 单据状态 |
| `auditstatus` | `auditstatus` | `auditstatus` | 审批状态 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `instruct_status` | `instruct_status` | `instructStatus` | 指令状态 |
| `invoiceroles` | `invoiceroles` | `invoiceroles` | 出票方 |
| `receiveroles` | `receiveroles` | `receiveroles` | 收款方 |
| `acceptanceroles` | `acceptanceroles` | `acceptanceroles` | 承兑方 |
| `noteflag` | `noteflag` | `noteflag` | 票据标识 |
| `notestatus` | `notestatus` | `notestatus` | 票据状态 |

### 长整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_range_start` | `bill_range_start` | `billRangeStart` | 开始区间 |
| `bill_range_end` | `bill_range_end` | `billRangeEnd` | 结束区间 |
| `src_pk_register` | `src_pk_register` | `srcPkRegister` | 原始票据主键 |
| `agentSettleDetailId` | `agentSettleDetailId` | `agentSettleDetailId` | 代理待结算明细ID |
| `holddays` | `holddays` | `holddays` | 持票天数 |
| `srcbillid` | `srcbillid` | `srcbillid` | 来源单据id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `available_quota` | `available_quota` | `availableQuota` | 可用额度 |
| `impawnAmount` | `impawnAmount` | `impawnAmount` | 质押额度 |
| `impawnRate` | `impawnRate` | `impawnRate` | 质押率 |
| `holdbalance` | `holdbalance` | `holdbalance` | 持票余额 |
| `settle_amount` | `settle_amount` | `settleAmount` | 清算金额 |
| `ticketbalance` | `ticketbalance` | `ticketbalance` | 出票余额 |
| `acceptancebalance` | `acceptancebalance` | `acceptancebalance` | 承兑余额 |
| `inner_security_poundage_amount` | `inner_security_poundage_amount` | `innerSecurityPoundageAmount` | 内部手续费金额 |
| `ninner_security_poundage_rate` | `ninner_security_poundage_rate` | `ninnerSecurityPoundageRate` | 内部手续费比例% |
| `poundageRate` | `poundageRate` | `poundageRate` | 手续费比例% |
| `olcusemoney` | `olcusemoney` | `olcusemoney` | 组织本币可用金额 |
| `occupycreditamount` | `occupycreditamount` | `occupyCreditAmount` | 占授信金额 |
| `olcoccupycreditamount` | `olcoccupycreditamount` | `olcOccupyCreditAmount` | 组织本币占授信金额 |
| `occupycontractamount` | `occupycontractamount` | `occupyContractAmount` | 占担保金额 |
| `olcoccupycontractamount` | `olcoccupycontractamount` | `olcoccupyContractAmount` | 组织本币占担保金额 |
| `available_money` | `available_money` | `availableMoney` | 可用金额 |
| `one_available_money` | `one_available_money` | `oneAvailableMoney` | 最大单笔可操作金额 |
| `surplus_money` | `surplus_money` | `surplusMoney` | 剩余质押金额 |
| `in_pool_money` | `in_pool_money` | `inPoolMoney` | 在池金额 |
| `poolresiduerelease` | `poolresiduerelease` | `poolresiduerelease` | 票据池剩余可释放额度 |
| `innersecurityaccsum` | `innersecurityaccsum` | `innersecurityaccsum` | 保证金存入金额 |
| `settleamt` | `settleamt` | `settleamt` | 结算金额 |
| `olcrate` | `olcrate` | `olcrate` | 组织本币汇率 |
| `olcnotemoney` | `olcnotemoney` | `olcnotemoney` | 组织本币票面金额 |
| `olcsecuritymoney` | `olcsecuritymoney` | `olcsecuritymoney` | 组织本币保证金 |
| `olcpoundageamount` | `olcpoundageamount` | `olcpoundageamount` | 组织本币手续费 |
| `notemoney` | `notemoney` | `notemoney` | 票面金额 |
| `securityrate` | `securityrate` | `securityrate` | 保证金比例% |
| `securitymoney` | `securitymoney` | `securitymoney` | 保证金金额 |
| `poundageamount` | `poundageamount` | `poundageamount` | 手续费金额 |
| `usemoney` | `usemoney` | `usemoney` | 可兑付金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `drftnoteinformation_def` | `drftnoteinformation_def` | `drftNoteInformationDef` | 票据信息自定义项 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `disabletime` | `disabletime` | `disabletime` | 作废时间 |
| `sendtime` | `sendtime` | `sendtime` | 发送时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 票据信息自由自定义项 |
| `` | `` | `drftNoteInformationAgreement` | 授信信息 |
| `` | `` | `drftNoteInformationContract` | 担保信息 |
| `` | `` | `drftNoteInformationListReasons` | 名单来源 |
