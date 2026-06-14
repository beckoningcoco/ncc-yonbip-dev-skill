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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_noteinformation` | domain：`drft` | 应用：`DRFT` | 业务对象ID：`b5c84765-d112-4fe3-9499-f904cb7cf206`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据号 |
| 物理表 | `drft_noteinformation` |
| domain/服务域 | `drft` |
| schema | `ctmdrft` |
| 所属应用 | `DRFT` |
| 直连字段 | 138 个 |
| 子表 | 0 个 |
| 关联引用 | 61 个 |

## 关联引用 (61个)

| 字段名 | 引用类型 |
|--------|---------|
| `invoicerbysupp` | `` |
| `drftnoteinformation_def` | `` |
| `` | `` |
| `project` | `` |
| `accentity` | `` |
| `settlemodesec` | `` |
| `acceptopenbankname` | `` |
| `receiverbankaccbycust` | `` |
| `receiverbyfundobject` | `` |
| `principalPayAccount` | `` |
| `receiverbankaccbysupp` | `` |
| `acceptbankacc` | `` |
| `invoicerbyfundobject` | `` |
| `invoicerbycust` | `` |
| `acceptaccbyfundobject` | `` |
| `principalAccentity` | `` |
| `invoicerbyorg` | `` |
| `principalBillAccount` | `` |
| `tenant_id` | `` |
| `oripk_register` | `` |
| `receiverbycust` | `` |
| `cost_center` | `` |
| `transoutaccount` | `` |
| `acceptancerbyorg` | `` |
| `impawneraccbyfundobject` | `` |
| `receiverbyorg` | `` |
| `paybankaccbyobject` | `` |
| `receiverbankaccbyorg` | `` |
| `pk_bankmsg` | `` |
| `receiveraccbyobject` | `` |
| `acceptopenbank` | `` |
| `receiverbankacc` | `` |
| `elecsignacc` | `` |
| `acceptancerbybank` | `` |
| `securityaccount` | `` |
| `paybyfundobject` | `` |
| `paybankaccbysupp` | `` |
| `profit_center` | `` |
| `src_pk_impawn` | `` |
| `paybankaccbycust` | `` |
| `invoicerbankaccbyorg` | `` |
| `invoicerbankacc` | `` |
| `currency` | `` |
| `paycustomer` | `` |
| `notetype` | `` |
| `acceptancerbysupp` | `` |
| `paysupplier` | `` |
| `acceptbankaccbycust` | `` |
| `org` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `` |
| `acceptancerbycust` | `` |
| `invoiceraccbyobject` | `` |
| `dept` | `` |
| `acceptancerbyfundobject` | `` |
| `receiverbysupp` | `` |
| `invoicerbankaccbycust` | `` |
| `impawnerfundobject` | `` |
| `invoicerbankaccbysupp` | `` |
| `acceptbankaccbysupp` | `` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 138 个直连字段

### 文本字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acceptanceno` | `acceptanceno` | `acceptanceno` | 承兑协议号 |
| `acceptancerbyfundobjecttpye` | `acceptancerbyfundobjecttpye` | `acceptancerbyfundobjecttpye` | 承兑人资金业务对象类型 |
| `available_range` | `available_range` | `availableRange` | 可用区间/可用子票号 |
| `bill_range` | `bill_range` | `billRange` | 子票区间 |
| `contractno` | `contractno` | `contractno` | 交易合同号 |
| `` | `creator` | `creator` | 创建人名称 |
| `elecinvoicemode` | `elecinvoicemode` | `elecinvoicemode` | 票据方式 |
| `impawnerfundobjecttpye` | `impawnerfundobjecttpye` | `impawnerfundobjecttpye` | 质权人资金业务对象类型 |
| `invoicerbyfundobjecttpye` | `invoicerbyfundobjecttpye` | `invoicerbyfundobjecttpye` | 出票人资金业务对象类型 |
| `issuercreditcode` | `issuercreditcode` | `issuercreditcode` | 出票人统一社会信用代码 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `notedescription` | `notedescription` | `notedescription` | 票据备注 |
| `noteno` | `noteno` | `noteno` | 票据号 |
| `openserialno` | `openserialno` | `openserialno` | 开票线索号 |
| `paybyfundobjecttpye` | `paybyfundobjecttpye` | `paybyfundobjecttpye` | 付票人资金业务对象类型 |
| `payeecreditcode` | `payeecreditcode` | `payeecreditcode` | 收票人统一社会信用代码 |
| `paymentcommitmentletternumber` | `paymentcommitmentletternumber` | `paymentcommitmentletternumber` | 付款承诺函编号 |
| `receiverbyfundobjecttpye` | `receiverbyfundobjecttpye` | `receiverbyfundobjecttpye` | 收票人资金业务对象类型 |
| `showInvoiceOpenbankname` | `showInvoiceOpenbankname` | `showInvoiceOpenbankname` | 显示出票人开户行名 |
| `showReceiveOpenbankname` | `showReceiveOpenbankname` | `showReceiveOpenbankname` | 显示收票人开户行名 |
| `showacceptancer` | `showacceptancer` | `showacceptancer` | 显示承兑人 |
| `showacceptbankacc` | `showacceptbankacc` | `showacceptbankacc` | 显示承兑人银行账号 |
| `showacceptopenbank` | `showacceptopenbank` | `showacceptopenbank` | 显示承兑人开户银行 |
| `showacceptopenbankname` | `showacceptopenbankname` | `showacceptopenbankname` | 显示承兑人开户行名 |
| `showinvoicer` | `showinvoicer` | `showinvoicer` | 显示出票人 |
| `showinvoicerbankacc` | `showinvoicerbankacc` | `showinvoicerbankacc` | 显示出票人银行账号 |
| `showpaybankacc` | `showpaybankacc` | `showpaybankacc` | 显示付票人银行账号 |
| `showpayunit` | `showpayunit` | `showpayunit` | 付票单位 |
| `showreceiver` | `showreceiver` | `showreceiver` | 显示收款人 |
| `showreceiverbankacc` | `showreceiverbankacc` | `showreceiverbankacc` | 显示收款人银行账号 |
| `surplus_bill_range` | `surplus_bill_range` | `surplusBillRange` | 剩余质押区间 |

### 引用字段 (60个)

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
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `currency` | `currency` | `currency` | 币种 |
| `dept` | `dept` | `dept` | 部门 |
| `elecsignacc` | `elecsignacc` | `elecsignacc` | 电票账号 |
| `impawneraccbyfundobject` | `impawneraccbyfundobject` | `impawneraccbyfundobject` | 质权人资金业务对象账号 |
| `impawnerfundobject` | `impawnerfundobject` | `impawnerfundobject` | 质权人资金业务对象 |
| `invoiceraccbyobject` | `invoiceraccbyobject` | `invoiceraccbyobject` | 出票人资金业务对象账号 |
| `invoicerbankacc` | `invoicerbankacc` | `invoicerbankacc` | 出票人银行账号 |
| `invoicerbankaccbycust` | `invoicerbankaccbycust` | `invoicerbankaccbycust` | 出票人客户银行账号 |
| `invoicerbankaccbyorg` | `invoicerbankaccbyorg` | `invoicerbankaccbyorg` | 出票人企业银行账号 |
| `invoicerbankaccbysupp` | `invoicerbankaccbysupp` | `invoicerbankaccbysupp` | 出票人供应商银行账号 |
| `invoicerbycust` | `invoicerbycust` | `invoicerbycust` | 出票人客户 |
| `invoicerbyfundobject` | `invoicerbyfundobject` | `invoicerbyfundobject` | 出票人资金业务对象 |
| `invoicerbyorg` | `invoicerbyorg` | `invoicerbyorg` | 出票人本企业 |
| `invoicerbysupp` | `invoicerbysupp` | `invoicerbysupp` | 出票人供应商 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `notetype` | `notetype` | `notetype` | 票据类型 |
| `org` | `org` | `org` | 业务组织 |
| `oripk_register` | `oripk_register` | `oripk_register` | 业务收票主键 |
| `paybankaccbycust` | `paybankaccbycust` | `paybankaccbycust` | 付票人客户银行账号 |
| `paybankaccbyobject` | `paybankaccbyobject` | `paybankaccbyobject` | 付票人资金业务对象账号 |
| `paybankaccbysupp` | `paybankaccbysupp` | `paybankaccbysupp` | 付票人供应商银行账号 |
| `paybyfundobject` | `paybyfundobject` | `paybyfundobject` | 付票人资金业务对象 |
| `paycustomer` | `paycustomer` | `paycustomer` | 付票单位客户 |
| `paysupplier` | `paysupplier` | `paysupplier` | 付票单位供应商 |
| `pk_bankmsg` | `pk_bankmsg` | `pk_bankmsg` | 指令信息主键 |
| `principalAccentity` | `principalAccentity` | `principalAccentity` | 实际用票单位 |
| `principalBillAccount` | `principalBillAccount` | `principalBillAccount` | 内部票据户 |
| `principalPayAccount` | `principalPayAccount` | `principalPayAccount` | 内部扣款账号 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `project` | `project` | `project` | 项目 |
| `receiveraccbyobject` | `receiveraccbyobject` | `receiveraccbyobject` | 收票人资金业务对象账号 |
| `receiverbankacc` | `receiverbankacc` | `receiverbankacc` | 收款人银行账号 |
| `receiverbankaccbycust` | `receiverbankaccbycust` | `receiverbankaccbycust` | 收款人客户银行账号 |
| `receiverbankaccbyorg` | `receiverbankaccbyorg` | `receiverbankaccbyorg` | 收款人会计主体银行账号 |
| `receiverbankaccbysupp` | `receiverbankaccbysupp` | `receiverbankaccbysupp` | 收款人供应商银行账号 |
| `receiverbycust` | `receiverbycust` | `receiverbycust` | 收款人客户 |
| `receiverbyfundobject` | `receiverbyfundobject` | `receiverbyfundobject` | 收票人资金业务对象 |
| `receiverbyorg` | `receiverbyorg` | `receiverbyorg` | 收款人会计主体 |
| `receiverbysupp` | `receiverbysupp` | `receiverbysupp` | 收款人供应商 |
| `securityaccount` | `securityaccount` | `securityaccount` | 保证金账户 |
| `settlemodesec` | `settlemodesec` | `settlemodesec` | 结算方式 |
| `src_pk_impawn` | `src_pk_impawn` | `srcPkImpawn` | 原始质押单组件.ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `transoutaccount` | `transoutaccount` | `transoutaccount` | 转出银行账户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acceptdate` | `acceptdate` | `acceptdate` | 承兑日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `enddate` | `enddate` | `enddate` | 到期日期 |
| `gatherdate` | `gatherdate` | `gatherdate` | 收票日期 |
| `invoicedate` | `invoicedate` | `invoicedate` | 出票日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agentopennote` | `agentopennote` | `agentopennote` | 代理开票 |
| `buyerinterest` | `buyerinterest` | `buyerinterest` | 买方付息 |
| `hasUsedExclusiveBillPool` | `hasUsedExclusiveBillPool` | `hasUsedExclusiveBillPool` | 已使用(票据池独有字段) |
| `hasused` | `hasused` | `hasused` | 已使用 |
| `ifsepFlow` | `ifsepFlow` | `ifsepFlow` | 能否分包流转 |
| `iselec` | `iselec` | `iselec` | 是否直联 |
| `istransfer` | `istransfer` | `istransfer` | 可转让 |
| `new_note_flag` | `new_note_flag` | `newNoteFlag` | 是否新一代票据 |
| `securityflag` | `securityflag` | `securityflag` | 保证金 |
| `ticketCollectionEnd` | `ticketCollectionEnd` | `ticketCollectionEnd` | 收票完成 |

### 短整数 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acceptanceroles` | `acceptanceroles` | `acceptanceroles` | 承兑方 |
| `auditstatus` | `auditstatus` | `auditstatus` | 审批状态 |
| `billdirection` | `billdirection` | `billdirection` | 票据方向 |
| `einner_security_payee_roles` | `einner_security_payee_roles` | `einnerSecurityPayeeRoles` | 内部保证金收款方 |
| `integratestatus` | `integratestatus` | `integratestatus` | 集成使用状态 |
| `invoiceroles` | `invoiceroles` | `invoiceroles` | 出票方 |
| `notestatus` | `notestatus` | `notestatus` | 票据状态 |
| `payTime` | `payTime` | `payTime` | 扣款时机 |
| `paybillroles` | `paybillroles` | `paybillroles` | 付票方 |
| `receivebilltype` | `receivebilltype` | `receivebilltype` | 收票类型 |
| `receiveroles` | `receiveroles` | `receiveroles` | 收款方 |
| `securitymode` | `securitymode` | `securitymode` | 保证金来源 |
| `settlementStatus` | `settlementStatus` | `settlementStatus` | 结算状态 |
| `src_flag` | `src_flag` | `srcFlag` | 收票来源 |
| `ticket_holding_mode` | `ticket_holding_mode` | `ticketHoldingMode` | 持票模式 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `srcbillid` | `srcbillid` | `srcbillid` | 来源单据id |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `available_money` | `available_money` | `availableMoney` | 可用金额 |
| `notemoney` | `notemoney` | `notemoney` | 票面金额 |
| `olcrate` | `olcrate` | `olcrate` | 组织本币汇率 |
| `olcsecuritymoney` | `olcsecuritymoney` | `olcsecuritymoney` | 保证金组织本币 |
| `one_available_money` | `one_available_money` | `oneAvailableMoney` | 单笔可操作金额 |
| `securitymoney` | `securitymoney` | `securitymoney` | 保证金金额 |
| `securityrate` | `securityrate` | `securityrate` | 保证金比例% |
| `surplus_money` | `surplus_money` | `surplusMoney` | 剩余质押金额 |
| `usemoney` | `usemoney` | `usemoney` | 可用金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `drftnoteinformation_def` | `drftnoteinformation_def` | `drftNoteInformationDef` | 票据登记自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `noteflag` | `noteflag` | `noteflag` | 票据标识 |
