---
tags: [BIP, 元数据, 数据字典, znbzbx.paymentapply.PaymentApplySettleVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 挂账付款申请单结算信息 (`znbzbx.paymentapply.PaymentApplySettleVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_payapplysettleinfo` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 挂账付款申请单结算信息 |
| 物理表 | `znbz_payapplysettleinfo` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 120 个 |
| 子表 | 0 个 |
| 关联引用 | 30 个 |

## 关联引用 (30个)

| 字段名 | 引用类型 |
|--------|---------|
| `sourcebustype` | `bd_billtyperef` |
| `currency_opp` | `ucfbasedoc.bd_currencytenantref` |
| `pk_enterprisebankacct` | `ucfbasedoc.bd_enterprisebankacct` |
| `multiplebank` | `` |
| `rejectPsn` | `ucf-staff-center.bd_staff_ref` |
| `pk_bankdoc` | `` |
| `centerpriseorg_caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_expensebill` | `znbzbx_expensebill_settleref` |
| `pk_cusdocbank` | `` |
| `paymentApplySettleDcs` | `` |
| `pk_enterprisecashacct` | `ucfbasedoc.bd_enterprisecashacct` |
| `pk_balatype` | `productcenter.aa_settlemethodref` |
| `pk_banktype` | `` |
| `tenant_id` | `` |
| `pk_customerbank` | `` |
| `pk_paymentapply` | `` |
| `pk_currency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `pk_handlepsnbank` | `bd_staff_bankacct_ref` |
| `pk_expsettleinfo` | `` |
| `tax_code_id` | `` |
| `pk_banktype_opp` | `` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `centerpriseorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |
| `pk_bankdoc_opp` | `` |

## 继承接口 (3个, 9字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``

## 字段列表（按类型分组）

> 共 120 个直连字段

### 文本字段 (40个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expbill_code` | `expbill_code` | `expbill_code` | 源单单据编号 |
| `showoppositebanklineno` | `showoppositebanklineno` | `showoppositebanklineno` | 收款账户联行号 |
| `rejectremark` | `rejectremark` | `rejectremark` | 止付说明 |
| `` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `pk_sourcebilltype` | `pk_sourcebilltype` | `pk_sourcebilltype` | 源单据类型 |
| `vbanktypename` | `vbanktypename` | `vbanktypename` | 银行类别名称 |
| `vbankaccount` | `vbankaccount` | `vbankaccount` | 收款方帐号 |
| `vbankaccname` | `vbankaccname` | `vbankaccname` | 收款方户名 |
| `vbankdocname` | `vbankdocname` | `vbankdocname` | 开户行名称 |
| `accttype` | `accttype` | `accttype` | 账户类型 |
| `vbankaccname_opp` | `vbankaccname_opp` | `vbankaccname_opp` | 付款账户户名 |
| `vbankaccount_opp` | `vbankaccount_opp` | `vbankaccount_opp` | 付款银行账号 |
| `vbankdocname_opp` | `vbankdocname_opp` | `vbankdocname_opp` | 付款开户行名称 |
| `vbanktypename_opp` | `vbanktypename_opp` | `vbanktypename_opp` | 付款银行类别名称 |
| `accttype_opp` | `accttype_opp` | `accttype_opp` | 付款账户类型 |
| `vmemo_opp` | `vmemo_opp` | `vmemo_opp` | 付款账户备注 |
| `wsettleStatus` | `wsettleStatus` | `wsettleStatus` | 待结算数据状态 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |
| `vdef11` | `vdef11` | `vdef11` | 自定义项11 |
| `vdef12` | `vdef12` | `vdef12` | 自定义项12 |
| `vdef13` | `vdef13` | `vdef13` | 自定义项13 |
| `vdef14` | `vdef14` | `vdef14` | 自定义项14 |
| `vdef15` | `vdef15` | `vdef15` | 自定义项15 |
| `vdef16` | `vdef16` | `vdef16` | 自定义项16 |
| `vdef17` | `vdef17` | `vdef17` | 自定义项17 |
| `vdef18` | `vdef18` | `vdef18` | 自定义项18 |
| `vdef19` | `vdef19` | `vdef19` | 自定义项19 |
| `vdef20` | `vdef20` | `vdef20` | 自定义项20 |

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `multiplebank` | `multiplebank` | `multiplebank` | 银行账户 |
| `centerpriseorg_caccountorg` | `centerpriseorg_caccountorg` | `centerpriseorg_caccountorg` | 资金组织所属会计主体 |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `rejectPsn` | `rejectPsn` | `rejectPsn` | 止付人 |
| `sourcebustype` | `sourcebustype` | `sourcebustype` | 源单交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `pk_paymentapply` | `pk_paymentapply` | `pk_paymentapply` | 付款申请单id |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 源单单据主键 |
| `pk_expsettleinfo` | `pk_expsettleinfo` | `pk_expsettleinfo` | 源单结算信息id |
| `pk_banktype` | `pk_banktype` | `pk_banktype` | 银行类别PK |
| `pk_bankdoc` | `pk_bankdoc` | `pk_bankdoc` | 开户行PK |
| `pk_balatype` | `pk_balatype` | `pk_balatype` | 结算方式 |
| `pk_handlepsnbank` | `pk_handlepsnbank` | `pk_handlepsnbank` | 报销人银行账户 |
| `pk_cusdocbank` | `pk_cusdocbank` | `pk_cusdocbank` | 供应商银行账户 |
| `pk_customerbank` | `pk_customerbank` | `pk_customerbank` | 客户银行账户 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 申请人 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商id |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户id |
| `pk_currency` | `pk_currency` | `pk_currency` | 账户币种 |
| `centerpriseorg` | `centerpriseorg` | `centerpriseorg` | 资金组织 |
| `pk_enterprisebankacct` | `pk_enterprisebankacct` | `pk_enterprisebankacct` | 企业银行账户PK |
| `pk_enterprisecashacct` | `pk_enterprisecashacct` | `pk_enterprisecashacct` | 企业现金账户PK |
| `pk_bankdoc_opp` | `pk_bankdoc_opp` | `pk_bankdoc_opp` | 付款开户行PK |
| `pk_banktype_opp` | `pk_banktype_opp` | `pk_banktype_opp` | 付款银行类别PK |
| `currency_opp` | `currency_opp` | `pk_currency_opp` | 付款账户币种 |
| `vcurrency` | `vcurrency` | `vcurrency` | 申请币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `payDownData` | `payDownData` | `payDownData` | 结算完成日期 |
| `distributionDate` | `distributionDate` | `distributionDate` | 止付日期 |
| `dexpectpaydate` | `dexpectpaydate` | `dexpectpaydate` | 期望结算日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bcansettlesysmodify` | `bcansettlesysmodify` | `bcansettlesysmodify` | 是否结算系统可修改 |
| `bjournalizing` | `bjournalizing` | `bjournalizing` | 是否登日记账 |

### 短整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stoptype` | `stoptype` | `stoptype` | 结算止付类型 |
| `returntype` | `returntype` | `returntype` | 是否退票 |
| `settleform` | `settleform` | `settleform` | 结算形式 |
| `balatypesrvattr` | `balatypesrvattr` | `balatypesrvattr` | 结算方式业务属性 |
| `igathertype` | `igathertype` | `igathertype` | 收款类型 |
| `iaraptype` | `iaraptype` | `iaraptype` | 收付类型 |
| `ipaystartpoint` | `ipaystartpoint` | `ipaystartpoint` | 付款起点 |
| `isettleresult` | `isettleresult` | `isettleresult` | 财资结算结果 |
| `isettlestatus` | `isettlestatus` | `isettlestatus` | 结算状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `wht_parentid` | `wht_parentid` | `wht_parentid` | 与代扣税孙表关联的明细表字段(代扣税孙表也有这个字段) |
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |

### 数值字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `napplypaymny` | `napplypaymny` | `napplypaymny` | 申请金额 |
| `natstoppedamount` | `natstoppedamount` | `natstoppedamount` | 结算止付金额-本币 |
| `napplymny` | `napplymny` | `napplymny` | 申请金额 |
| `nnatapplymny` | `nnatapplymny` | `nnatapplymny` | 申请金额-本币 |
| `nwhtax_amount` | `nwhtax_amount` | `nwhtax_amount` | 代扣税税额 |
| `nnatwhtax_amount` | `nnatwhtax_amount` | `nnatwhtax_amount` | 本币代扣税税额 |
| `returnamount` | `returnamount` | `returnamount` | 退票金额 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `npaymentdays` | `npaymentdays` | `npaymentdays` | 账期天数 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatapplypaymny` | `nnatapplypaymny` | `nnatapplypaymny` | 申请金额-本币 |
| `nfinalsummny` | `nfinalsummny` | `nfinalsummny` | 实际付款金额 |
| `nnatfinalsummny` | `nnatfinalsummny` | `nnatfinalsummny` | 实际付款金额-本币 |
| `stoppedamount` | `stoppedamount` | `stoppedamount` | 结算止付金额 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `ndefnum6` | `ndefnum6` | `ndefnum6` | 自定义项(小数)6 |
| `ndefnum7` | `ndefnum7` | `ndefnum7` | 自定义项(小数)7 |
| `ndefnum8` | `ndefnum8` | `ndefnum8` | 自定义项(小数)8 |
| `ndefnum9` | `ndefnum9` | `ndefnum9` | 自定义项(小数)9 |
| `ndefnum10` | `ndefnum10` | `ndefnum10` | 自定义项(小数)10 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `paymentApplySettleDcs` | `paymentApplySettleDcs` | `paymentApplySettleDcs` | 挂账付款申请单结算信息自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `refundDate` | `refundDate` | `refundDate` | 退票时间 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `nsettletime` | `nsettletime` | `nsettletime` | 实际结算时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
