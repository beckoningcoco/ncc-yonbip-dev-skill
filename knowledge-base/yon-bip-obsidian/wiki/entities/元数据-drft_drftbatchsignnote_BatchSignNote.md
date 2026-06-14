---
tags: [BIP, 元数据, 数据字典, drft.drftbatchsignnote.BatchSignNote]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 票据签发主表 (`drft.drftbatchsignnote.BatchSignNote`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_batchsignnote` | domain：`drft` | 应用：`DRFT` | 业务对象ID：`be14078a-5c8f-4b0c-a577-2195ed4ccbf2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据签发主表 |
| 物理表 | `drft_batchsignnote` |
| domain/服务域 | `drft` |
| schema | `ctmdrft` |
| 所属应用 | `DRFT` |
| 直连字段 | 150 个 |
| 子表 | 4 个 |
| 关联引用 | 55 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `drftNoteInformationAgreement` | `drft.drftbatchsignnote.BatchSignNoteAgreement` | composition |
| `drftNoteInformationBillPool` | `drft.drftbatchsignnote.BatchSignNoteBillPool` | composition |
| `drftNoteInformationContract` | `drft.drftbatchsignnote.BatchSignNoteContract` | composition |
| `drftNoteInformationBillDetail` | `drft.drftbatchsignnote.BatchSignNoteBillDetail` | composition |

## 关联引用 (55个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `project` | `ucfbasedoc.bd_projectNewRef` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `operator` | `ucf-staff-center.bd_staff_ref` |
| `settlemodepound` | `productcenter.aa_settlemethodref` |
| `settlemodesec` | `productcenter.aa_settlemethodref` |
| `acceptopenbankname` | `ucfbasedoc.bd_bankdotref` |
| `principalPayAccount` | `ucfbasedoc.bd_enterprisebankacctnomc` |
| `olcratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `acceptbankacc` | `ucfbasedoc.bd_enterprisebankacctnomc` |
| `acceptaccbyfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `principalAccentity` | `aa_org` |
| `invoicerbyorg` | `aa_org` |
| `principalBillAccount` | `ucfbasedoc.bd_enterprisebankacctnomc` |
| `tenant_id` | `` |
| `transoutaccount` | `ucfbasedoc.bd_enterprisebankacctnomc` |
| `acceptancerbyorg` | `aa_org` |
| `innersecurityaccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `costproject` | `finbd.bd_expenseitemref` |
| `acceptopenbank` | `ucfbasedoc.bd_bankdotref` |
| `agentquicktype` | `finbd.bd_paymenttyperef` |
| `elecsignacc` | `yonbip-fi-ctmtmsp.tmsp_elebankaccountref` |
| `innerreceiveraccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `acceptancerbybank` | `ucfbasedoc.bd_bankdotref` |
| `activity` | `yonbip-pm-projectme.project_activity_ref` |
| `securityaccount` | `ucfbasedoc.bd_enterprisebankacctnomc` |
| `settlementOrg` | `ucf-org-center.bd_fundsorg_na` |
| `invoiceOpenbankname` | `ucfbasedoc.bd_bankdotref` |
| `invoicerbankaccbyorg` | `ucfbasedoc.bd_enterprisebankacctnomc` |
| `invoicerbankacc` | `ucfbasedoc.bd_enterprisebankacctnomc` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `agentsettlemode` | `productcenter.aa_settlemethodref` |
| `olccurrency` | `ucfbasedoc.bd_currencytenantref` |
| `notetype` | `drft_billtyperef` |
| `acceptancerbysupp` | `yssupplier.aa_vendor` |
| `acceptbankaccbycust` | `aa_merchantbankref` |
| `org` | `aa_org` |
| `ytenant_id` | `` |
| `poundageaccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `acceptancerbycust` | `productcenter.aa_merchantref` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `acceptancerbyfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `drftBatchSignNoteDef` | `` |
| `invoicerbankaccbycust` | `aa_merchantbankref` |
| `tradetype` | `transtype.bd_billtyperef` |
| `invoicerbankaccbysupp` | `aa_vendorbankref` |
| `acceptbankaccbysupp` | `aa_vendorbankref` |

## 继承接口 (5个, 18字段)

- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 150 个直连字段

### 文本字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 备注 |
| `nopostreason` | `nopostreason` | `nopostreason` | 不过账原因 |
| `elecinvoicemode` | `elecinvoicemode` | `elecinvoicemode` | 出票方式 |
| `paymentdate` | `paymentdate` | `paymentDate` | 付款期 |
| `showinvoicer` | `showinvoicer` | `showinvoicer` | 显示出票人 |
| `issuercreditcode` | `issuercreditcode` | `issuercreditcode` | 出票人统一社会信用代码 |
| `showinvoicerbankacc` | `showinvoicerbankacc` | `showinvoicerbankacc` | 显示出票人银行账号 |
| `showInvoiceOpenbankname` | `showInvoiceOpenbankname` | `showInvoiceOpenbankname` | 显示出票人开户行名 |
| `showacceptancer` | `showacceptancer` | `showacceptancer` | 显示承兑人 |
| `namelistType` | `namelistType` | `namelistType` | 名单类型 |
| `controlType` | `controlType` | `controlType` | 名单控制方式 |
| `acceptorcreditcode` | `acceptorcreditcode` | `acceptorcreditcode` | 承兑人统一社会信用代码 |
| `showacceptbankacc` | `showacceptbankacc` | `showacceptbankacc` | 显示承兑人银行账号 |
| `elecacceptaccname` | `elecacceptaccname` | `elecacceptaccname` | 承兑人账户名称 |
| `showacceptopenbank` | `showacceptopenbank` | `showacceptopenbank` | 显示承兑人开户银行 |
| `showacceptopenbankname` | `showacceptopenbankname` | `showacceptopenbankname` | 显示承兑人开户行名 |
| `acceptanceno` | `acceptanceno` | `acceptanceno` | 承兑协议号 |
| `contractno` | `contractno` | `contractno` | 交易合同号 |
| `invoiceno` | `invoiceno` | `invoiceno` | 发票号码 |
| `elecacceptbankname` | `elecacceptbankname` | `elecacceptbankname` | 承兑人银行名称 |
| `elecacceptbanknum` | `elecacceptbanknum` | `elecacceptbanknum` | 承兑人银行代码 |
| `openserialno` | `openserialno` | `openserialno` | 开票线索号 |
| `bank_poundage_ident_code` | `bank_poundage_ident_code` | `bankPoundageIdentCode` | 银行手续费对账码 |
| `inner_margin_pay_ident_code` | `inner_margin_pay_ident_code` | `innerMarginPayIdentCode` | 内部保证金付款对账码 |
| `inner_margin_rec_ident_code` | `inner_margin_rec_ident_code` | `innerMarginRecIdentCode` | 内部保证金收款对账码 |
| `inner_security_handle_mode` | `inner_security_handle_mode` | `innerSecurityHandleMode` | 内部保证金处理方式 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `` | `code` | `code` | 编码 |

### 引用字段 (50个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `elecsignacc` | `elecsignacc` | `elecsignacc` | 电票账号 |
| `org` | `org` | `org` | 业务组织 |
| `dept` | `dept` | `dept` | 部门 |
| `operator` | `operator` | `operator` | 业务员 |
| `costproject` | `costproject` | `costproject` | 费用项目 |
| `project` | `project` | `project` | 项目 |
| `notetype` | `notetype` | `notetype` | 票据类型 |
| `invoicerbyorg` | `invoicerbyorg` | `invoicerbyorg` | 出票人本企业 |
| `invoicerbankacc` | `invoicerbankacc` | `invoicerbankacc` | 出票人银行账号 |
| `invoicerbankaccbycust` | `invoicerbankaccbycust` | `invoicerbankaccbycust` | 出票人客户银行账号 |
| `invoicerbankaccbysupp` | `invoicerbankaccbysupp` | `invoicerbankaccbysupp` | 出票人供应商银行账号 |
| `invoicerbankaccbyorg` | `invoicerbankaccbyorg` | `invoicerbankaccbyorg` | 出票人企业银行账号 |
| `invoiceOpenbankname` | `invoiceOpenbankname` | `invoiceOpenbankname` | 出票人开户行名 |
| `acceptancerbycust` | `acceptancerbycust` | `acceptancerbycust` | 承兑人客户 |
| `acceptancerbysupp` | `acceptancerbysupp` | `acceptancerbysupp` | 承兑人供应商 |
| `acceptancerbybank` | `acceptancerbybank` | `acceptancerbybank` | 承兑人银行 |
| `acceptancerbyorg` | `acceptancerbyorg` | `acceptancerbyorg` | 承兑人本企业 |
| `acceptancerbyfundobject` | `acceptancerbyfundobject` | `acceptancerbyfundobject` | 承兑人资金业务对象 |
| `acceptbankacc` | `acceptbankacc` | `acceptbankacc` | 承兑人银行账号 |
| `acceptbankaccbycust` | `acceptbankaccbycust` | `acceptbankaccbycust` | 承兑人客户银行账号 |
| `acceptbankaccbysupp` | `acceptbankaccbysupp` | `acceptbankaccbysupp` | 承兑人供应商银行账号 |
| `acceptaccbyfundobject` | `acceptaccbyfundobject` | `acceptaccbyfundobject` | 承兑人资金业务对象账号 |
| `acceptopenbank` | `acceptopenbank` | `acceptopenbank` | 承兑人开户银行 |
| `acceptopenbankname` | `acceptopenbankname` | `acceptopenbankname` | 承兑人开户行名 |
| `principalAccentity` | `principalAccentity` | `principalAccentity` | 实际用票单位 |
| `principalBillAccount` | `principalBillAccount` | `principalBillAccount` | 内部票据户 |
| `principalPayAccount` | `principalPayAccount` | `principalPayAccount` | 内部扣款账号 |
| `securityaccount` | `securityaccount` | `securityaccount` | 保证金账号 |
| `transoutaccount` | `transoutaccount` | `transoutaccount` | 转出银行账号 |
| `settlemodesec` | `settlemodesec` | `settlemodesec` | 结算方式-保证金 |
| `poundageaccount` | `poundageaccount` | `poundageaccount` | 手续费账号 |
| `settlemodepound` | `settlemodepound` | `settlemodepound` | 结算方式-手续费 |
| `olccurrency` | `olccurrency` | `olccurrency` | 组织本币 |
| `olcratetype` | `olcratetype` | `olcratetype` | 组织本币汇率类型 |
| `currency` | `currency` | `currency` | 币种 |
| `settlementOrg` | `settlementOrg` | `settlementOrg` | 结算中心 |
| `agentquicktype` | `agentquicktype` | `agentquicktype` | 代理款项类型 |
| `agentsettlemode` | `agentsettlemode` | `agentsettlemode` | 代理结算方式 |
| `innersecurityaccount` | `innersecurityaccount` | `innersecurityaccount` | 内部保证金账号 |
| `innerreceiveraccount` | `innerreceiveraccount` | `innerreceiveraccount` | 本方收款账号 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `tradetype` | `tradetype` | `bustype` | 交易类型 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoicedate` | `invoicedate` | `invoicedate` | 出票日期 |
| `enddate` | `enddate` | `enddate` | 到期日期 |
| `settleSuccBizTime` | `settleSuccBizTime` | `settleSuccBizTime` | 结算成功业务时间 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `backfill` | `backfill` | `backfill` | 事后补录 |
| `iselec` | `iselec` | `iselec` | 是否直联 |
| `ispaybill` | `ispaybill` | `ispaybill` | 已付票 |
| `ifsepFlow` | `ifsepFlow` | `ifsepFlow` | 能否分包流转 |
| `istransfer` | `istransfer` | `istransfer` | 可转让 |
| `agentopennote` | `agentopennote` | `agentopennote` | 代理开票 |
| `pushSecurity` | `pushSecurity` | `pushSecurity` | 是否已推送保证金台账 |
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `elecacceptowner` | `elecacceptowner` | `elecacceptowner` | 承兑人是否为本人 |
| `agentPushSecurity` | `agentPushSecurity` | `agentPushSecurity` | 是否推送保证金存入支取单(开票单位) |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 短整数 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `processresult` | `processresult` | `processresult` | 办理结果 |
| `signnoteinstructtype` | `signnoteinstructtype` | `signnoteInstructType` | 指令类型 |
| `billstatus` | `billstatus` | `billstatus` | 单据状态 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `srcbilltype` | `srcbilltype` | `srcbilltype` | 事项类型 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `paymenttermtype` | `paymenttermtype` | `paymenttermtype` | 到期日类型 |
| `payperiodunit` | `payperiodunit` | `payPeriodUnit` | 付款期单位 |
| `invoiceroles` | `invoiceroles` | `invoiceroles` | 出票方 |
| `acceptanceroles` | `acceptanceroles` | `acceptanceroles` | 承兑方 |
| `interestpaymentmode` | `interestpaymentmode` | `interestpaymentmode` | 付息模式 |
| `payTime` | `payTime` | `payTime` | 扣款时机 |
| `paymentway` | `paymentway` | `paymentway` | 付款方式 |
| `securitypushtiming` | `securitypushtiming` | `securitypushtiming` | 推送保证金时机 |
| `securitySettlementStatus` | `securitySettlementStatus` | `securitySettlementStatus` | 保证金结算状态 |
| `settlementStatus` | `settlementStatus` | `settlementStatus` | 手续费结算状态 |
| `pushChargeState` | `pushChargeState` | `pushChargeState` | 推送手续费结算状态 |
| `billdetailnum` | `billdetailnum` | `billdetailnum` | 明细数 |
| `billtype` | `billtype` | `billtype` | 单据类型 |
| `agentSecuritySettlementStatus` | `agentSecuritySettlementStatus` | `agentSecuritySettlementStatus` | 代理保证金结算状态 |
| `securityType` | `securityType` | `securityType` | 保证金分类 |
| `settledSupplementType` | `settledSupplementType` | `settledSupplementType` | 结算处理模式 |
| `einner_security_payee_roles` | `einner_security_payee_roles` | `einnerSecurityPayeeRoles` | 内部保证金收款方 |
| `olc_rate_ops` | `olc_rate_ops` | `olcRateOps` | 组织本币汇率折算方式 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `settle_integration` | `settle_integration` | `settleIntegration` | 资金结算集成 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主键 |

### 数值字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applysignamount` | `applysignamount` | `applysignamount` | 申请签发金额 |
| `onsignamount` | `onsignamount` | `onsignamount` | 在签发金额 |
| `signedamount` | `signedamount` | `signedamount` | 已签发金额 |
| `inpayamount` | `inpayamount` | `inpayamount` | 在付票金额 |
| `paidamount` | `paidamount` | `paidamount` | 已付票金额 |
| `voidedamount` | `voidedamount` | `voidedamount` | 已作废撤票金额 |
| `securityrate` | `securityrate` | `securityrate` | 保证金比例% |
| `securitymoney` | `securitymoney` | `securitymoney` | 保证金金额 |
| `poundageamount` | `poundageamount` | `poundageamount` | 手续费金额 |
| `olcrate` | `olcrate` | `olcrate` | 组织本币汇率 |
| `olcnotemoney` | `olcnotemoney` | `olcnotemoney` | 组织本币签发金额合计 |
| `innersecurityaccsum` | `innersecurityaccsum` | `innersecurityaccsum` | 保证金存入金额 |
| `poundageRate` | `poundageRate` | `poundageRate` | 手续费比例% |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `drftBatchSignNoteDef` | `drftBatchSignNoteDef` | `drftBatchSignNoteDef` | 批量签发主表自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `drftNoteInformationAgreement` | 授信信息 |
| `` | `` | `drftNoteInformationBillDetail` | 票据明细 |
| `` | `` | `drftNoteInformationBillPool` | 票据池信息 |
| `` | `` | `drftNoteInformationContract` | 担保信息 |
