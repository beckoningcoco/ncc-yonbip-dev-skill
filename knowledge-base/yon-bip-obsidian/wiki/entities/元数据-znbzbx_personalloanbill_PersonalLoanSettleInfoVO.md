---
tags: [BIP, 元数据, 数据字典, znbzbx.personalloanbill.PersonalLoanSettleInfoVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 个人借款单结算信息 (`znbzbx.personalloanbill.PersonalLoanSettleInfoVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_loansettleinfo` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 个人借款单结算信息 |
| 物理表 | `znbz_loansettleinfo` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 117 个 |
| 子表 | 1 个 |
| 关联引用 | 28 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `loansettleinfouserdefs` | `znbzbx.personalloanbill.PersonalLoanSettleInfoUserdefVO` | composition |

## 关联引用 (28个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_loanbill` | `` |
| `currency_opp` | `ucfbasedoc.bd_currencytenantref` |
| `pk_enterprisebankacct` | `ucfbasedoc.bd_enterprisebankacct` |
| `multiplebank` | `` |
| `rejectPsn` | `` |
| `pk_bankdoc` | `` |
| `centerpriseorg_caccountorg` | `` |
| `` | `` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `vsettlecurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_cusdocbank` | `` |
| `pk_enterprisecashacct` | `ucfbasedoc.bd_enterprisecashacct` |
| `pk_balatype` | `productcenter.aa_settlemethodref` |
| `pk_banktype` | `` |
| `tenant_id` | `` |
| `loanSettleInfoDcs` | `` |
| `pk_customerbank` | `` |
| `pk_currency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `pk_handlepsnbank` | `` |
| `pk_banktype_opp` | `` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `centerpriseorg` | `` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |
| `pk_bankdoc_opp` | `` |

## 字段列表（按类型分组）

> 共 117 个直连字段

### 文本字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accttype` | `accttype` | `accttype` | 账户类型 |
| `accttype_opp` | `accttype_opp` | `accttype_opp` | 付款账户类型 |
| `showoppositebanklineno` | `showoppositebanklineno` | `showoppositebanklineno` | 收款账户联行号 |
| `rejectremark` | `rejectremark` | `rejectremark` | 止付说明 |
| `` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `vbankaccname` | `vbankaccname` | `vbankaccname` | 收款方户名 |
| `vbankaccname_opp` | `vbankaccname_opp` | `vbankaccname_opp` | 付款账户户名 |
| `vbankaccount` | `vbankaccount` | `vbankaccount` | 收款方账号 |
| `vbankaccount_opp` | `vbankaccount_opp` | `vbankaccount_opp` | 付款方账号 |
| `vbankdocname` | `vbankdocname` | `vbankdocname` | 开户行名称 |
| `vbankdocname_opp` | `vbankdocname_opp` | `vbankdocname_opp` | 付款开户行名称 |
| `vbanktypename` | `vbanktypename` | `vbanktypename` | 银行类别名称 |
| `vbanktypename_opp` | `vbanktypename_opp` | `vbanktypename_opp` | 付款银行类别名称 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
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
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef20` | `vdef20` | `vdef20` | 自定义项20 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vmemo_opp` | `vmemo_opp` | `vmemo_opp` | 付款账户备注 |
| `wsettleStatus` | `wsettleStatus` | `wsettleStatus` | 财资待结算数据状态 |
| `expapportionrulelinkflagb` | `expapportionrulelinkflagb` | `expapportionrulelinkflagb` | 结算规则结算联动标识 |

### 引用字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `centerpriseorg` | `centerpriseorg` | `centerpriseorg` | 资金组织 |
| `multiplebank` | `multiplebank` | `multiplebank` | 银行账户 |
| `centerpriseorg_caccountorg` | `centerpriseorg_caccountorg` | `centerpriseorg_caccountorg` | 资金组织所属会计主体 |
| `rejectPsn` | `rejectPsn` | `rejectPsn` | 止付人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_balatype` | `pk_balatype` | `pk_balatype` | 结算方式 |
| `pk_bankdoc` | `pk_bankdoc` | `pk_bankdoc` | 收款方开户行 |
| `pk_bankdoc_opp` | `pk_bankdoc_opp` | `pk_bankdoc_opp` | 付款方开户行 |
| `pk_banktype` | `pk_banktype` | `pk_banktype` | 银行类别id |
| `pk_banktype_opp` | `pk_banktype_opp` | `pk_banktype_opp` | 付款银行类别 |
| `pk_currency` | `pk_currency` | `pk_currency` | 账户币种 |
| `currency_opp` | `currency_opp` | `pk_currency_opp` | 付款账户币种 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_cusdocbank` | `pk_cusdocbank` | `pk_cusdocbank` | 供应商银行账户 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `pk_customerbank` | `pk_customerbank` | `pk_customerbank` | 客户银行账户 |
| `pk_enterprisebankacct` | `pk_enterprisebankacct` | `pk_enterprisebankacct` | 企业银行账户 |
| `pk_enterprisecashacct` | `pk_enterprisecashacct` | `pk_enterprisecashacct` | 企业现金账户 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 借款人 |
| `pk_handlepsnbank` | `pk_handlepsnbank` | `pk_handlepsnbank` | 借款人银行账户 |
| `pk_loanbill` | `pk_loanbill` | `pk_loanbill` | 个人借款单主表id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vcurrency` | `vcurrency` | `vcurrency` | 借款币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `vsettlecurrency` | `vsettlecurrency` | `vsettlecurrency` | 结算币种 |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `distributionDate` | `distributionDate` | `distributionDate` | 止付日期 |
| `dexpectpaydate` | `dexpectpaydate` | `dexpectpaydate` | 期望结算日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `payDownData` | `payDownData` | `payDownData` | 实际结算日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bcansettlesysmodify` | `bcansettlesysmodify` | `bcansettlesysmodify` | 是否结算系统可修改 |
| `bjournalizing` | `bjournalizing` | `bjournalizing` | 是否登日记账 |

### 短整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balatypesrvattr` | `balatypesrvattr` | `balatypesrvattr` | 结算方式业务属性 |
| `stoptype` | `stoptype` | `stoptype` | 结算止付类型 |
| `returntype` | `returntype` | `returntype` | 是否退票 |
| `iaraptype` | `iaraptype` | `iaraptype` | 收付类型 |
| `igathertype` | `igathertype` | `igathertype` | 收款方类型 |
| `ipaystartpoint` | `ipaystartpoint` | `ipaystartpoint` | 付款起点 |
| `isettleresult` | `isettleresult` | `isettleresult` | 财资结算结果 |
| `isettlestatus` | `isettlestatus` | `isettlestatus` | 结算状态 |
| `settleform` | `settleform` | `settleform` | 结算形式 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | ID |

### 数值字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `natstoppedamount` | `natstoppedamount` | `natstoppedamount` | 实际结算止付金额-本币 |
| `returnamount` | `returnamount` | `returnamount` | 退票金额 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum10` | `ndefnum10` | `ndefnum10` | 自定义项(小数)10 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `ndefnum6` | `ndefnum6` | `ndefnum6` | 自定义项(小数)6 |
| `ndefnum7` | `ndefnum7` | `ndefnum7` | 自定义项(小数)7 |
| `ndefnum8` | `ndefnum8` | `ndefnum8` | 自定义项(小数)8 |
| `ndefnum9` | `ndefnum9` | `ndefnum9` | 自定义项(小数)9 |
| `nfinalsummny` | `nfinalsummny` | `nfinalsummny` | 实际结算金额 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币基准汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatfinalsummny` | `nnatfinalsummny` | `nnatfinalsummny` | 实际付款金额-本币 |
| `nnatsettlesummny` | `nnatsettlesummny` | `nnatsettlesummny` | 期望收款金额-本币 |
| `npaymentdays` | `npaymentdays` | `npaymentdays` | 账期天数 |
| `nsettlebaseexchrate` | `nsettlebaseexchrate` | `nsettlebaseexchrate` | 结算币种企业汇率 |
| `nsettleexchrate` | `nsettleexchrate` | `nsettleexchrate` | 结算币种汇率 |
| `nsettlesummny` | `nsettlesummny` | `nsettlesummny` | 期望收款金额 |
| `nsummny` | `nsummny` | `nsummny` | 付款金额 |
| `stoppedamount` | `stoppedamount` | `stoppedamount` | 实际结算止付金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nsettletime` | `nsettletime` | `nsettletime` | 实际结算时间 |
| `refundDate` | `refundDate` | `refundDate` | 退票时间 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `loanSettleInfoDcs` | `loanSettleInfoDcs` | `loanSettleInfoDcs` | 结算信息自定义项 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nsettlebaseexchrateOps` | `nsettlebaseexchrateOps` | `nsettlebaseexchrateOps` | 结算币种企业汇率折算方式 |
| `nsettleexchrateOps` | `nsettleexchrateOps` | `nsettleexchrateOps` | 结算币种汇率折算方式 |
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `loansettleinfouserdefs` | 个人借款单结算信息（自定义项）表 |
