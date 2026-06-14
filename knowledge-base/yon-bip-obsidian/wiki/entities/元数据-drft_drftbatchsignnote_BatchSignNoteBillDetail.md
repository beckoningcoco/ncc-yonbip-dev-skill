---
tags: [BIP, 元数据, 数据字典, drft.drftbatchsignnote.BatchSignNoteBillDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 票据明细 (`drft.drftbatchsignnote.BatchSignNoteBillDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_noteinformation` | domain：`drft` | 应用：`DRFT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据明细 |
| 物理表 | `drft_noteinformation` |
| domain/服务域 | `drft` |
| schema | `ctmdrft` |
| 所属应用 | `DRFT` |
| 直连字段 | 328 个 |
| 子表 | 0 个 |
| 关联引用 | 106 个 |

## 关联引用 (106个)

| 字段名 | 引用类型 |
|--------|---------|
| `impawnersupp` | `` |
| `wbs` | `` |
| `accentity` | `` |
| `settlemodepound` | `` |
| `acceptopenbankname` | `` |
| `designatedpersoncust` | `` |
| `principalPayAccount` | `` |
| `receiverbankaccbysupp` | `` |
| `acceptbankacc` | `` |
| `invoicerbyfundobject` | `` |
| `invoicerbycust` | `` |
| `mainid` | `` |
| `entrustedPaycustomer` | `` |
| `invoicerbyorg` | `` |
| `tenant_id` | `` |
| `cost_center` | `` |
| `signaccopenbank` | `` |
| `transoutaccount` | `` |
| `acceptancerbyorg` | `` |
| `impawneraccbyfundobject` | `` |
| `oriPaybyfundobject` | `` |
| `receiverbyorg` | `` |
| `paybankaccbyobject` | `` |
| `quicktype` | `` |
| `costproject` | `` |
| `acceptopenbank` | `` |
| `receiverbankacc` | `` |
| `activity` | `` |
| `paybankaccbysupp` | `` |
| `oriPaysupplier` | `` |
| `invoicerbankaccbyorg` | `` |
| `invoicerbankacc` | `` |
| `currency` | `` |
| `agentsettlemode` | `` |
| `notetype` | `` |
| `acceptancerbysupp` | `` |
| `paysupplier` | `` |
| `acceptbankaccbycust` | `` |
| `poundageaccount` | `` |
| `dept` | `` |
| `acceptancerbyfundobject` | `` |
| `invoicerbankaccbycust` | `` |
| `entrustedPaybyfundobject` | `` |
| `impawnbankaccbycust` | `` |
| `senderid` | `` |
| `designatedpersonsupp` | `` |
| `entrustedPaysupplier` | `` |
| `chargetype` | `` |
| `impawnbankaccbybank` | `` |
| `invoicerbysupp` | `` |
| `withdrticketbankmsg` | `` |
| `drftnoteinformation_def` | `` |
| `designatedpersonfund` | `` |
| `receiveOpenbankname` | `` |
| `project` | `` |
| `operator` | `` |
| `settlemodesec` | `` |
| `receiverbankaccbycust` | `` |
| `receiverbyfundobject` | `` |
| `olcratetype` | `` |
| `impawnercust` | `` |
| `acceptaccbyfundobject` | `` |
| `principalAccentity` | `` |
| `principalBillAccount` | `` |
| `oripk_register` | `` |
| `receiverbycust` | `` |
| `impawnerbank` | `` |
| `innersecurityaccount` | `` |
| `pk_bankmsg2` | `` |
| `receiverbankaccbyorg` | `` |
| `pk_bankmsg` | `` |
| `receiveraccbyobject` | `` |
| `agentquicktype` | `` |
| `initialRegister` | `` |
| `elecsignacc` | `` |
| `innerreceiveraccount` | `` |
| `acceptancerbybank` | `` |
| `disableuserid` | `` |
| `securityaccount` | `` |
| `inpoolorg` | `` |
| `bill_pool` | `` |
| `recallbankmsg` | `` |
| `paybyfundobject` | `` |
| `bankName` | `` |
| `profit_center` | `` |
| `src_pk_impawn` | `` |
| `settlementOrg` | `` |
| `circulateid` | `` |
| `invoiceOpenbankname` | `` |
| `paybankaccbycust` | `` |
| `paycustomer` | `` |
| `impawnbankdot` | `` |
| `signacc` | `` |
| `olccurrency` | `` |
| `org` | `` |
| `oriPaycustomer` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `` |
| `impawnbankaccbysupp` | `` |
| `acceptancerbycust` | `` |
| `invoiceraccbyobject` | `` |
| `receiverbysupp` | `` |
| `tradetype` | `` |
| `impawnerfundobject` | `` |
| `invoicerbankaccbysupp` | `` |
| `acceptbankaccbysupp` | `` |

## 继承接口 (4个, 7字段)

- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``

## 字段列表（按类型分组）

> 共 328 个直连字段

### 文本字段 (73个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acceptanceno` | `acceptanceno` | `acceptanceno` | 承兑协议号 |
| `acceptancerbyfundobjecttpye` | `acceptancerbyfundobjecttpye` | `acceptancerbyfundobjecttpye` | 承兑人资金业务对象类型 |
| `acceptcreditcode` | `acceptcreditcode` | `acceptcreditcode` | 承兑人统一社会信用代码 |
| `acceptopenbanknumber` | `acceptopenbanknumber` | `acceptopenbanknumber` | 承兑人开户行行号(银行提供) |
| `agent_margin_ident_code` | `agent_margin_ident_code` | `agentMarginIdentCode` | 代理票款财资对账码 |
| `available_range` | `available_range` | `availableRange` | 可用区间 |
| `bank_poundage_ident_code` | `bank_poundage_ident_code` | `bankPoundageIdentCode` | 银行手续费财资对账码 |
| `bill_range` | `bill_range` | `billRange` | 显示区间 |
| `code` | `code` | `code` | 单据编号 |
| `contractno` | `contractno` | `contractno` | 交易合同号 |
| `controlType` | `controlType` | `controlType` | 名单控制方式 |
| `description` | `description` | `description` | 备注 |
| `designatedperson` | `designatedperson` | `designatedperson` | 被指定客商 |
| `designatedpersoncreditcode` | `designatedpersoncreditcode` | `designatedpersoncreditcode` | 被指定客商统一社会信用代码 |
| `disablenote` | `disablenote` | `disablenote` | 作废原因 |
| `disableusername` | `disableusername` | `disableusername` | 作废人名称 |
| `ecds_status` | `ecds_status` | `ecdsStatus` | 银企联电票状态 |
| `elecacceptaccname` | `elecacceptaccname` | `elecacceptaccname` | 承兑人账户名称 |
| `elecacceptbankname` | `elecacceptbankname` | `elecacceptbankname` | 承兑人银行名称 |
| `elecacceptbanknum` | `elecacceptbanknum` | `elecacceptbanknum` | 承兑人银行代码 |
| `elecacceptotherbank` | `elecacceptotherbank` | `elecacceptotherbank` | 承兑人跨行标志 |
| `elecaccepttype` | `elecaccepttype` | `elecaccepttype` | 承兑人类别 |
| `elecinvoiceaccname` | `elecinvoiceaccname` | `elecinvoiceaccname` | 出票人账户名称 |
| `elecinvoicebankname` | `elecinvoicebankname` | `elecinvoicebankname` | 出票人银行名称 |
| `elecinvoicebanknum` | `elecinvoicebanknum` | `elecinvoicebanknum` | 出票人银行代码 |
| `elecinvoicemode` | `elecinvoicemode` | `elecinvoicemode` | 票据方式 |
| `elecinvoicetype` | `elecinvoicetype` | `elecinvoicetype` | 出票人类别 |
| `elecplanstatus` | `elecplanstatus` | `elecplanstatus` | 计划开票状态 |
| `elecreceiveaccname` | `elecreceiveaccname` | `elecreceiveaccname` | 收票人账户名称 |
| `elecreceivebankname` | `elecreceivebankname` | `elecreceivebankname` | 收票人银行名称 |
| `elecreceivebanknum` | `elecreceivebanknum` | `elecreceivebanknum` | 收票人银行代码 |
| `elecreceiveotherbank` | `elecreceiveotherbank` | `elecreceiveotherbank` | 收票人跨行标志 |
| `elecreceivetype` | `elecreceivetype` | `elecreceivetype` | 收票人类别 |
| `entrustedShowpayunit` | `entrustedShowpayunit` | `entrustedShowpayunit` | 被委托付票单位 |
| `impawnerfundobjecttpye` | `impawnerfundobjecttpye` | `impawnerfundobjecttpye` | 质权人资金业务对象类型 |
| `impawnerother` | `impawnerother` | `impawnerother` | 质押人其他 |
| `in_pool_range` | `in_pool_range` | `inPoolRange` | 在池区间 |
| `inner_margin_pay_ident_code` | `inner_margin_pay_ident_code` | `innerMarginPayIdentCode` | 内部保证金付款对账码 |
| `inner_margin_rec_ident_code` | `inner_margin_rec_ident_code` | `innerMarginRecIdentCode` | 内部保证金收款对账码 |
| `inner_poundage_ident_code` | `inner_poundage_ident_code` | `innerPoundageIdentCode` | 内部手续费财资对账码 |
| `invoiceno` | `invoiceno` | `invoiceno` | 发票号码 |
| `invoicerbyfundobjecttpye` | `invoicerbyfundobjecttpye` | `invoicerbyfundobjecttpye` | 出票人资金业务对象类型 |
| `issuercreditcode` | `issuercreditcode` | `issuercreditcode` | 出票人统一社会信用代码 |
| `namelistType` | `namelistType` | `namelistType` | 名单类型 |
| `notedescription` | `notedescription` | `notedescription` | 票据备注 |
| `noteno` | `noteno` | `noteno` | 票号 |
| `oldnoteno` | `oldnoteno` | `oldnoteno` | 原供票编号 |
| `openserialno` | `openserialno` | `openserialno` | 开票线索号 |
| `oriShowpayunit` | `oriShowpayunit` | `oriShowpayunit` | 显示最初付票单位 |
| `paybyfundobjecttpye` | `paybyfundobjecttpye` | `paybyfundobjecttpye` | 付票人资金业务对象类型 |
| `payeecreditcode` | `payeecreditcode` | `payeecreditcode` | 收票人统一社会信用代码 |
| `paymentdate` | `paymentdate` | `paymentDate` | 付款期 |
| `paymentcommitmentletternumber` | `paymentcommitmentletternumber` | `paymentcommitmentletternumber` | 付款承诺函编号 |
| `protocolno` | `protocolno` | `protocolno` | 协议编号 |
| `receiverbyfundobjecttpye` | `receiverbyfundobjecttpye` | `receiverbyfundobjecttpye` | 收票人资金业务对象类型 |
| `refuseReason` | `refuseReason` | `refuseReason` | 拒收原因 |
| `residuenoteno` | `residuenoteno` | `residuenoteno` | 剩余供票最新编号 |
| `sendername` | `sendername` | `sendername` | 发送人名称 |
| `serial_num` | `serial_num` | `serialNum` | 业务流水号 |
| `showInvoiceOpenbankname` | `showInvoiceOpenbankname` | `showInvoiceOpenbankname` | 显示出票人开户行名 |
| `showReceiveOpenbankname` | `showReceiveOpenbankname` | `showReceiveOpenbankname` | 显示收票人开户行名 |
| `showacceptancer` | `showacceptancer` | `showacceptancer` | 显示承兑人 |
| `showacceptbankacc` | `showacceptbankacc` | `showacceptbankacc` | 显示承兑人银行账号 |
| `showacceptopenbank` | `showacceptopenbank` | `showacceptopenbank` | 显示承兑人开户银行 |
| `showacceptopenbankname` | `showacceptopenbankname` | `showacceptopenbankname` | 显示承兑人开户行名 |
| `showimpawnbankacc` | `showimpawnbankacc` | `showimpawnbankacc` | 质权人账号其他 |
| `showinvoicer` | `showinvoicer` | `showinvoicer` | 显示出票人 |
| `showinvoicerbankacc` | `showinvoicerbankacc` | `showinvoicerbankacc` | 显示出票人银行账号 |
| `showpaybankacc` | `showpaybankacc` | `showpaybankacc` | 显示付票人银行账号 |
| `showpayunit` | `showpayunit` | `showpayunit` | 付票单位 |
| `showreceiver` | `showreceiver` | `showreceiver` | 显示收票人 |
| `showreceiverbankacc` | `showreceiverbankacc` | `showreceiverbankacc` | 显示收票人银行账号 |
| `surplus_bill_range` | `surplus_bill_range` | `surplusBillRange` | 剩余质押区间 |

### 引用字段 (105个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `acceptaccbyfundobject` | `acceptaccbyfundobject` | `acceptaccbyfundobject` | 承兑人资金业务对象账号 |
| `acceptancerbybank` | `acceptancerbybank` | `acceptancerbybank` | 承兑人银行 |
| `acceptancerbycust` | `acceptancerbycust` | `acceptancerbycust` | 承兑人客户 |
| `acceptancerbyfundobject` | `acceptancerbyfundobject` | `acceptancerbyfundobject` | 承兑人资金业务对象 |
| `acceptancerbyorg` | `acceptancerbyorg` | `acceptancerbyorg` | 承兑人本企业 |
| `acceptancerbysupp` | `acceptancerbysupp` | `acceptancerbysupp` | 承兑人供应商 |
| `acceptbankacc` | `acceptbankacc` | `acceptbankacc` | 承兑人银行账号 |
| `acceptbankaccbycust` | `acceptbankaccbycust` | `acceptbankaccbycust` | 承兑人客户银行账号 |
| `acceptbankaccbysupp` | `acceptbankaccbysupp` | `acceptbankaccbysupp` | 承兑人供应商银行账号 |
| `acceptopenbank` | `acceptopenbank` | `acceptopenbank` | 承兑人开户银行 |
| `acceptopenbankname` | `acceptopenbankname` | `acceptopenbankname` | 承兑人开户行名 |
| `activity` | `activity` | `activity` | 活动 |
| `agentquicktype` | `agentquicktype` | `agentquicktype` | 代理款项类型 |
| `agentsettlemode` | `agentsettlemode` | `agentsettlemode` | 代理结算方式 |
| `bankName` | `bankName` | `bankName` | 签约银行 |
| `bill_pool` | `bill_pool` | `billPool` | 票据池 |
| `tradetype` | `tradetype` | `bustype` | 交易类型 |
| `chargetype` | `chargetype` | `chargetype` | 手续费款项类型 |
| `circulateid` | `circulateid` | `circulateid` | 票据流转信息 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `costproject` | `costproject` | `costproject` | 费用项目 |
| `currency` | `currency` | `currency` | 币种 |
| `dept` | `dept` | `dept` | 部门 |
| `designatedpersoncust` | `designatedpersoncust` | `designatedpersoncust` | 被指定人客户 |
| `designatedpersonfund` | `designatedpersonfund` | `designatedpersonfund` | 被指定人资金伙伴 |
| `designatedpersonsupp` | `designatedpersonsupp` | `designatedpersonsupp` | 被指定人供应商 |
| `disableuserid` | `disableuserid` | `disableuserid` | 作废人 |
| `elecsignacc` | `elecsignacc` | `elecsignacc` | 电票账户 |
| `entrustedPaybyfundobject` | `entrustedPaybyfundobject` | `entrustedPaybyfundobject` | 被委托付票人资金业务对象 |
| `entrustedPaycustomer` | `entrustedPaycustomer` | `entrustedPaycustomer` | 被委托付票单位客户 |
| `entrustedPaysupplier` | `entrustedPaysupplier` | `entrustedPaysupplier` | 被委托付票单位供应商 |
| `impawnbankaccbybank` | `impawnbankaccbybank` | `impawnbankaccbybank` | 质权人账号银行 |
| `impawnbankaccbycust` | `impawnbankaccbycust` | `impawnbankaccbycust` | 质权人账号客户 |
| `impawnbankaccbysupp` | `impawnbankaccbysupp` | `impawnbankaccbysupp` | 质权人账号供应商 |
| `impawnbankdot` | `impawnbankdot` | `impawnbankdot` | 质权人银行名称 |
| `impawneraccbyfundobject` | `impawneraccbyfundobject` | `impawneraccbyfundobject` | 质权人资金业务对象账号 |
| `impawnerbank` | `impawnerbank` | `impawnerbank` | 质押人银行 |
| `impawnercust` | `impawnercust` | `impawnercust` | 质押人客户 |
| `impawnerfundobject` | `impawnerfundobject` | `impawnerfundobject` | 质权人资金业务对象 |
| `impawnersupp` | `impawnersupp` | `impawnersupp` | 质押人供应商 |
| `initialRegister` | `initialRegister` | `initialRegister` | 最初业务收票主键 |
| `innerreceiveraccount` | `innerreceiveraccount` | `innerreceiveraccount` | 本方收款账号 |
| `innersecurityaccount` | `innersecurityaccount` | `innersecurityaccount` | 内部保证金账号 |
| `inpoolorg` | `inpoolorg` | `inpoolorg` | 入池机构 |
| `invoiceOpenbankname` | `invoiceOpenbankname` | `invoiceOpenbankname` | 出票人开户行名 |
| `invoiceraccbyobject` | `invoiceraccbyobject` | `invoiceraccbyobject` | 出票人资金业务对象账号 |
| `invoicerbankacc` | `invoicerbankacc` | `invoicerbankacc` | 出票人银行账号 |
| `invoicerbankaccbycust` | `invoicerbankaccbycust` | `invoicerbankaccbycust` | 出票人客户银行账号 |
| `invoicerbankaccbyorg` | `invoicerbankaccbyorg` | `invoicerbankaccbyorg` | 出票人企业银行账号 |
| `invoicerbankaccbysupp` | `invoicerbankaccbysupp` | `invoicerbankaccbysupp` | 出票人供应商银行账号 |
| `invoicerbycust` | `invoicerbycust` | `invoicerbycust` | 出票人客户 |
| `invoicerbyfundobject` | `invoicerbyfundobject` | `invoicerbyfundobject` | 出票人资金业务对象 |
| `invoicerbyorg` | `invoicerbyorg` | `invoicerbyorg` | 出票人本企业 |
| `invoicerbysupp` | `invoicerbysupp` | `invoicerbysupp` | 出票人供应商 |
| `mainid` | `mainid` | `mainid` | 票据签发id |
| `notetype` | `notetype` | `notetype` | 票据类型 |
| `olccurrency` | `olccurrency` | `olccurrency` | 组织本币 |
| `olcratetype` | `olcratetype` | `olcratetype` | 组织本币汇率类型 |
| `operator` | `operator` | `operator` | 业务员 |
| `org` | `org` | `org` | 业务组织 |
| `oriPaybyfundobject` | `oriPaybyfundobject` | `oriPaybyfundobject` | 最初付票人资金业务对象 |
| `oriPaycustomer` | `oriPaycustomer` | `oriPaycustomer` | 最初付票单位客户 |
| `oriPaysupplier` | `oriPaysupplier` | `oriPaysupplier` | 最初付票单位供应商 |
| `oripk_register` | `oripk_register` | `oripk_register` | 业务收票主键 |
| `paybankaccbycust` | `paybankaccbycust` | `paybankaccbycust` | 付票人客户银行账号 |
| `paybankaccbyobject` | `paybankaccbyobject` | `paybankaccbyobject` | 付票人资金业务对象账号 |
| `paybankaccbysupp` | `paybankaccbysupp` | `paybankaccbysupp` | 付票人供应商银行账号 |
| `paybyfundobject` | `paybyfundobject` | `paybyfundobject` | 付票人资金业务对象 |
| `paycustomer` | `paycustomer` | `paycustomer` | 付票单位客户 |
| `paysupplier` | `paysupplier` | `paysupplier` | 付票单位供应商 |
| `pk_bankmsg` | `pk_bankmsg` | `pk_bankmsg` | 指令信息主键 |
| `pk_bankmsg2` | `pk_bankmsg2` | `pk_bankmsg2` | 不得转让撤销指令信息主键.ID |
| `poundageaccount` | `poundageaccount` | `poundageaccount` | 手续费账户 |
| `principalAccentity` | `principalAccentity` | `principalAccentity` | 实际用票单位 |
| `principalBillAccount` | `principalBillAccount` | `principalBillAccount` | 内部票据户 |
| `principalPayAccount` | `principalPayAccount` | `principalPayAccount` | 内部扣款账号 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `project` | `project` | `project` | 项目 |
| `quicktype` | `quicktype` | `quicktype` | 保证金款项类型 |
| `recallbankmsg` | `recallbankmsg` | `recallBankmsg` | 撤回指令信息主键 |
| `receiveOpenbankname` | `receiveOpenbankname` | `receiveOpenbankname` | 收票人开户行名 |
| `receiveraccbyobject` | `receiveraccbyobject` | `receiveraccbyobject` | 收票人资金业务对象账号 |
| `receiverbankacc` | `receiverbankacc` | `receiverbankacc` | 收票人银行账号 |
| `receiverbankaccbycust` | `receiverbankaccbycust` | `receiverbankaccbycust` | 收票人客户银行账号 |
| `receiverbankaccbyorg` | `receiverbankaccbyorg` | `receiverbankaccbyorg` | 收票人会计主体银行账号 |
| `receiverbankaccbysupp` | `receiverbankaccbysupp` | `receiverbankaccbysupp` | 收票人供应商银行账号 |
| `receiverbycust` | `receiverbycust` | `receiverbycust` | 收票人客户 |
| `receiverbyfundobject` | `receiverbyfundobject` | `receiverbyfundobject` | 收票人资金业务对象 |
| `receiverbyorg` | `receiverbyorg` | `receiverbyorg` | 收票人会计主体 |
| `receiverbysupp` | `receiverbysupp` | `receiverbysupp` | 收票人供应商 |
| `securityaccount` | `securityaccount` | `securityaccount` | 保证金账户 |
| `senderid` | `senderid` | `senderid` | 发送人id |
| `settlementOrg` | `settlementOrg` | `settlementOrg` | 结算中心 |
| `settlemodepound` | `settlemodepound` | `settlemodepound` | 结算方式 |
| `settlemodesec` | `settlemodesec` | `settlemodesec` | 结算方式 |
| `signacc` | `signacc` | `signacc` | 签约账号 |
| `signaccopenbank` | `signaccopenbank` | `signaccopenbank` | 签约账号开户行 |
| `src_pk_impawn` | `src_pk_impawn` | `srcPkImpawn` | 原始质押组件 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `transoutaccount` | `transoutaccount` | `transoutaccount` | 转出银行账户 |
| `wbs` | `wbs` | `wbs` | WBS |
| `withdrticketbankmsg` | `withdrticketbankmsg` | `withdrticketBankmsg` | 撤票指令信息主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acceptdate` | `acceptdate` | `acceptdate` | 承兑日期 |
| `applydate` | `applydate` | `applydate` | 签发日期 |
| `businessAccountDate` | `businessAccountDate` | `businessAccountDate` | 业务记账日期 |
| `disabledate` | `disabledate` | `disabledate` | 作废日期 |
| `enddate` | `enddate` | `enddate` | 到期日期 |
| `gatherdate` | `gatherdate` | `gatherdate` | 收票日期 |
| `impawndate` | `impawndate` | `impawndate` | 质押日期 |
| `impawnenddate` | `impawnenddate` | `impawnenddate` | 质押到期日 |
| `innerDate` | `innerDate` | `innerDate` | 入池日期 |
| `invoicedate` | `invoicedate` | `invoicedate` | 出票日期 |
| `paybilldate` | `paybilldate` | `paybilldate` | 付票日期 |
| `remainEndDate` | `remainEndDate` | `remainEndDate` | 距离到期日期 |
| `senddate` | `senddate` | `senddate` | 发送日期 |
| `settleEndDate` | `settleEndDate` | `settleEndDate` | 结算完成日期 |
| `settleSuccBizTime` | `settleSuccBizTime` | `settleSuccBizTime` | 结算成功业务时间 |
| `signDate` | `signDate` | `signDate` | 签收日期 |
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |
| `vouchersEntryDate` | `vouchersEntryDate` | `vouchersEntryDate` | 凭证登账日期 |

### 布尔字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acceptanceInBlackList` | `acceptanceInBlackList` | `acceptanceInBlackList` | 承兑人黑名单 |
| `acceptanceInWhiteList` | `acceptanceInWhiteList` | `acceptanceInWhiteList` | 承兑人白名单 |
| `agentopennote` | `agentopennote` | `agentopennote` | 代理开票 |
| `auditsettlementdrive` | `auditsettlementdrive` | `auditsettlementdrive` | 审批流程是否由结算单驱动 |
| `blackbill` | `blackbill` | `blackbill` | 是否黑名单 |
| `buyerinterest` | `buyerinterest` | `buyerinterest` | 买方付息 |
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `elecacceptowner` | `elecacceptowner` | `elecacceptowner` | 承兑人是否为本人 |
| `hasUsedExclusiveBillPool` | `hasUsedExclusiveBillPool` | `hasUsedExclusiveBillPool` | 已使用(票据池独有字段) |
| `hasimpawn` | `hasimpawn` | `hasimpawn` | 已质押 |
| `hasused` | `hasused` | `hasused` | 已使用 |
| `ifsepFlow` | `ifsepFlow` | `ifsepFlow` | 能否分包流转 |
| `is_auto_accept` | `is_auto_accept` | `isAutoAccept` | 是否自动承兑 |
| `isEcdsSign` | `isEcdsSign` | `isEcdsSign` | 由电票签收生成 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `iscontributelimit` | `iscontributelimit` | `iscontributelimit` | 是否贡献额度 |
| `iselec` | `iselec` | `iselec` | 是否直联 |
| `isinit` | `isinit` | `isinit` | 是否期初 |
| `ispaybill` | `ispaybill` | `ispaybill` | 已付票 |
| `istransfer` | `istransfer` | `istransfer` | 可转让 |
| `new_note_flag` | `new_note_flag` | `newNoteFlag` | 新一代票据 |
| `nextmerchantdesignated` | `nextmerchantdesignated` | `nextmerchantdesignated` | 是否指定下一手客商 |
| `poundageflag` | `poundageflag` | `poundageflag` | 手续费 |
| `pushSecurity` | `pushSecurity` | `pushSecurity` | 是否推送保证金台账 |
| `pushbill` | `pushbill` | `pushbill` | 已推单 |
| `returnbill` | `returnbill` | `returnbill` | 回头票 |
| `sameAccentity` | `sameAccentity` | `sameAccentity` | 同会计主体收票 |
| `securityflag` | `securityflag` | `securityflag` | 保证金 |
| `ticket_collection_completed` | `ticket_collection_completed` | `ticketCollectionCompleted` | 收票完成 |
| `ticketCollectionEnd` | `ticketCollectionEnd` | `ticketCollectionEnd` | 收票完成 |
| `useStwb` | `useStwb` | `useStwb` | 是否集成资金结算 |
| `waitsettleoper` | `waitsettleoper` | `waitsettleoper` | 待取消结算 |
| `whitebill` | `whitebill` | `whitebill` | 是否白名单 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `changecount` | `changecount` | `changecount` | 转手次数 |
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (59个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accept_status` | `accept_status` | `acceptStatus` | 承兑状态 |
| `acceptanceroles` | `acceptanceroles` | `acceptanceroles` | 承兑方 |
| `agent_security_settlement_status` | `agent_security_settlement_status` | `agentSecuritySettlementStatus` | 代理保证金结算状态 |
| `applytype` | `applytype` | `applyType` | 申请方式 |
| `auditstatus` | `auditstatus` | `auditstatus` | 审批状态 |
| `bankmsg2Status` | `bankmsg2Status` | `bankmsg2Status` | 不得转让撤销指令状态 |
| `billdirection` | `billdirection` | `billdirection` | 票据方向 |
| `billstatus` | `billstatus` | `billstatus` | 单据状态 |
| `billtype` | `billtype` | `billtype` | 单据类型 |
| `budgetactualaction` | `budgetactualaction` | `budgetactualaction` | 预算实占动作 |
| `budgetstatus` | `budgetstatus` | `budgetstatus` | 预算占用状态 |
| `checkresult` | `checkresult` | `checkresult` | 集票宝对账结果出票 |
| `checkresultacceptance` | `checkresultacceptance` | `checkresultacceptance` | 集票宝对账结果承兑 |
| `collecticketstatus` | `collecticketstatus` | `collecticketstatus` | 集票宝状态 |
| `designatedparty` | `designatedparty` | `designatedparty` | 被指定方 |
| `einner_security_payee_roles` | `einner_security_payee_roles` | `einnerSecurityPayeeRoles` | 内部保证金收款方 |
| `einner_security_settlement_status` | `einner_security_settlement_status` | `einnerSecuritySettlementStatus` | 内部手续费结算状态 |
| `entrustedPaybillroles` | `entrustedPaybillroles` | `entrustedPaybillroles` | 被委托付票方 |
| `impawnmode` | `impawnmode` | `impawnmode` | 担保方式 |
| `impawnroles` | `impawnroles` | `impawnroles` | 质押方 |
| `impawntype` | `impawntype` | `impawntype` | 质押方式 |
| `inpooluse` | `inpooluse` | `inpooluse` | 入池用途 |
| `instruct_status` | `instruct_status` | `instructStatus` | 签发指令状态 |
| `integratestatus` | `integratestatus` | `integratestatus` | 集成使用状态 |
| `interestpaymentmode` | `interestpaymentmode` | `interestpaymentmode` | 付息模式 |
| `invoiceroles` | `invoiceroles` | `invoiceroles` | 出票方 |
| `noteSettlementStatus` | `noteSettlementStatus` | `noteSettlementStatus` | 代理票款结算状态 |
| `noteflag` | `noteflag` | `noteflag` | 票据标识 |
| `notestatus` | `notestatus` | `notestatus` | 票据状态 |
| `olc_rate_ops` | `olc_rate_ops` | `olcRateOps` | 组织本币汇率折算方式 |
| `oriPaybillroles` | `oriPaybillroles` | `oriPaybillroles` | 最初付票方 |
| `payperiodunit` | `payperiodunit` | `payPeriodUnit` | 付款期单位 |
| `payTime` | `payTime` | `payTime` | 扣款时机 |
| `paybillroles` | `paybillroles` | `paybillroles` | 付票方 |
| `paymenttermtype` | `paymenttermtype` | `paymenttermtype` | 到期日类型 |
| `paymentway` | `paymentway` | `paymentway` | 付款方式 |
| `recallstatus` | `recallstatus` | `recallStatus` | 撤回指令状态 |
| `receivebilltype` | `receivebilltype` | `receivebilltype` | 收票类型 |
| `receiveroles` | `receiveroles` | `receiveroles` | 收票方 |
| `` | `returncount` | `returncount` | 退回次数 |
| `riskPriority` | `riskPriority` | `riskPriority` | 风险策略 |
| `securitySettlementStatus` | `securitySettlementStatus` | `securitySettlementStatus` | 保证金结算状态 |
| `securityType` | `securityType` | `securityType` | 保证金分类 |
| `securitymode` | `securitymode` | `securitymode` | 保证金来源 |
| `securitypushtiming` | `securitypushtiming` | `securitypushtiming` | 推送保证金时机 |
| `settledSupplementType` | `settledSupplementType` | `settledSupplementType` | 结算处理模式 |
| `settlementStatus` | `settlementStatus` | `settlementStatus` | 结算状态 |
| `settlesignstatus` | `settlesignstatus` | `settlesignstatus` | 结算选择签发单状态 |
| `signRefuse` | `signRefuse` | `signRefuse` | 签收/拒收 |
| `signnoteinstructtype` | `signnoteinstructtype` | `signnoteInstructType` | 指令类型 |
| `signtype` | `signtype` | `signtype` | 签收类型 |
| `src_flag` | `src_flag` | `srcFlag` | 来源标识 |
| `srcbilltype` | `srcbilltype` | `srcbilltype` | 事项类型 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `status` | `status` | `status` | 单据状态 |
| `ticket_holding_mode` | `ticket_holding_mode` | `ticketHoldingMode` | 持票模式 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `withdrticketstatus` | `withdrticketstatus` | `withdrticketStatus` | 撤票指令状态 |

### 长整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agentSettleDetailId` | `agentSettleDetailId` | `agentSettleDetailId` | 代理结算明细ID |
| `bill_range_end` | `bill_range_end` | `billRangeEnd` | 结束区间 |
| `bill_range_start` | `bill_range_start` | `billRangeStart` | 开始区间 |
| `holddays` | `holddays` | `holddays` | 持票天数 |
| `id` | `id` | `id` | ID |
| `src_pk_register` | `src_pk_register` | `srcPkRegister` | 原始票据主键 |
| `srcbillid` | `srcbillid` | `srcbillid` | 来源单据id |

### 数值字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `available_money` | `available_money` | `availableMoney` | 可用金额 |
| `available_quota` | `available_quota` | `availableQuota` | 可用额度 |
| `impawnAmount` | `impawnAmount` | `impawnAmount` | 质押额度 |
| `impawnRate` | `impawnRate` | `impawnRate` | 质押率 |
| `in_pool_money` | `in_pool_money` | `inPoolMoney` | 在池金额 |
| `inner_security_poundage_amount` | `inner_security_poundage_amount` | `innerSecurityPoundageAmount` | 内部手续费金额 |
| `innersecurityaccsum` | `innersecurityaccsum` | `innersecurityaccsum` | 保证金存入金额 |
| `ninner_security_poundage_rate` | `ninner_security_poundage_rate` | `ninnerSecurityPoundageRate` | 内部手续费比例% |
| `notemoney` | `notemoney` | `notemoney` | 票面金额 |
| `occupycontractamount` | `occupycontractamount` | `occupyContractAmount` | 占担保金额 |
| `occupycreditamount` | `occupycreditamount` | `occupyCreditAmount` | 占授信金额 |
| `olcoccupycreditamount` | `olcoccupycreditamount` | `olcOccupyCreditAmount` | 组织本币占授信金额 |
| `olcnotemoney` | `olcnotemoney` | `olcnotemoney` | 组织本币签发金额合计 |
| `olcoccupycontractamount` | `olcoccupycontractamount` | `olcoccupyContractAmount` | 组织本币占担保金额 |
| `olcpoundageamount` | `olcpoundageamount` | `olcpoundageamount` | 手续费组织本币 |
| `olcrate` | `olcrate` | `olcrate` | 组织本币汇率 |
| `olcsecuritymoney` | `olcsecuritymoney` | `olcsecuritymoney` | 保证金组织本币 |
| `olcusemoney` | `olcusemoney` | `olcusemoney` | 组织本币可用金额 |
| `one_available_money` | `one_available_money` | `oneAvailableMoney` | 最大单笔可操作金额 |
| `poolresiduerelease` | `poolresiduerelease` | `poolresiduerelease` | 票据池剩余可释放额度 |
| `poundageRate` | `poundageRate` | `poundageRate` | 手续费比例% |
| `poundageamount` | `poundageamount` | `poundageamount` | 手续费 |
| `securitymoney` | `securitymoney` | `securitymoney` | 保证金金额 |
| `securityrate` | `securityrate` | `securityrate` | 保证金比例% |
| `settleamt` | `settleamt` | `settleamt` | 结算金额 |
| `surplus_money` | `surplus_money` | `surplusMoney` | 剩余质押金额 |
| `usemoney` | `usemoney` | `usemoney` | 可兑付金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `disabletime` | `disabletime` | `disabletime` | 作废时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `sendtime` | `sendtime` | `sendtime` | 发送时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `drftnoteinformation_def` | `drftnoteinformation_def` | `drftNoteInformationDef` | 票据登记自定义项 |
