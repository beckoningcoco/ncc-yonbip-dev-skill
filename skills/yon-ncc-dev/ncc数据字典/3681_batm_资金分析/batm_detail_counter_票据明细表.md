# |<<

**票据明细表 (batm_detail_counter / nc.vo.batm.fbmvo.DetailCounterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/224.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_counter | 主键 | pk_counter | char(20) | √ | 主键 (UFID) |
| 2 | pk_register | 票据登记主键 | pk_register | char(20) | √ | 主键 (UFID) |
| 3 | pk_action | 票据动作主键 | pk_action | char(20) | √ | 主键 (UFID) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 6 | fbmbilltype | 票据类型 | fbmbilltype | varchar(20) |  | 票据类型 (notetype) |
| 7 | pk_curr | 币种 | pk_curr | varchar(20) |  | 币种 (currtype) |
| 8 | decreasemode | 减少方式 | decreasemode | varchar(50) |  | 字符串 (String) |
| 9 | fbmstate | 状态 | fbmstate | varchar(50) |  | 字符串 (String) |
| 10 | direction | 票据方向 | direction | int |  | 整数 (Integer) |
| 11 | money | 票据金额 | money | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | gatherdate | 收票日期 | gatherdate | char(19) |  | 日期 (UFDate) |
| 13 | invoicedate | 出票日期 | invoicedate | char(19) |  | 日期 (UFDate) |
| 14 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 15 | timelimit | 期限 | timelimit | varchar(50) |  | 字符串 (String) |
| 16 | registerstatus | 票据状态 | registerstatus | varchar(50) |  | 字符串 (String) |
| 17 | invoiceunit | 出票单位 | invoiceunit | varchar(20) |  | 客商 (custsupplier) |
| 18 | pk_invoiceunit | 签发出票单位 | pk_invoiceunit | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 19 | payunit | 付款单位 | payunit | varchar(50) |  | 字符串 (String) |
| 20 | paybankacc | 付款单位银行帐户 | paybankacc | varchar(50) |  | 字符串 (String) |
| 21 | paybank | 付款银行 | paybank | varchar(50) |  | 字符串 (String) |
| 22 | receiveunit | 收款单位 | receiveunit | varchar(50) |  | 字符串 (String) |
| 23 | receivebankacc | 收款单位银行账户 | receivebankacc | varchar(50) |  | 字符串 (String) |
| 24 | receivebank | 收款银行 | receivebank | varchar(50) |  | 字符串 (String) |
| 25 | keepunit | 存放地点 | keepunit | varchar(20) |  | 客商 (custsupplier) |
| 26 | keepunitname | 存放地点名称 | keepunitname | varchar(50) |  | 字符串 (String) |
| 27 | acceptanceno | 承兑协议编号 | acceptanceno | varchar(50) |  | 字符串 (String) |
| 28 | acceptperson | 承兑人 | acceptperson | varchar(50) |  | 字符串 (String) |
| 29 | contractno | 交易合同编号 | contractno | varchar(50) |  | 字符串 (String) |
| 30 | disableflag | 废票 | disableflag | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | glgx | 关联关系 | glgx | varchar(20) |  | 票据台帐子表 (fbm_counterbook_b) |
| 32 | initflag | 期初 | initflag | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 34 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 35 | invoiceunitname | 出票单位名称 | invoiceunitname | varchar(50) |  | 字符串 (String) |
| 36 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 37 | actiondate | 操作日期 | actiondate | char(19) |  | 日期 (UFDate) |
| 38 | actioncode | 动作编码 | actioncode | varchar(50) |  | 字符串 (String) |
| 39 | actionname | 操作 | actionname | varchar(50) |  | 字符串 (String) |
| 40 | serialnum | 序列号 | serialnum | int |  | 整数 (Integer) |
| 41 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 42 | paybillunit | 付票单位 | paybillunit | varchar(20) |  | 客户基本信息 (customer) |
| 43 | holdunit | 持票单位 | holdunit | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 44 | pk_keeporg | 托管资金组织 | pk_keeporg | varchar(50) |  | 字符串 (String) |
| 45 | holderacc | 持票单位银行帐号 | holderacc | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 46 | endorser | 背书单位 | endorser | varchar(20) |  | 供应商基本信息 (supplier) |
| 47 | endorsee | 被背书单位 | endorsee | varchar(20) |  | 供应商基本信息 (supplier) |
| 48 | consignbankacc | 托收银行账户 | consignbankacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 49 | consignbank | 托收银行 | consignbank | varchar(20) |  | 银行档案 (bankdoc) |
| 50 | discount_account | 贴现银行账户 | discount_account | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 51 | pk_discount_bank | 贴现银行 | pk_discount_bank | varchar(20) |  | 银行档案 (bankdoc) |
| 52 | discountyrate | 贴现年利率 | discountyrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | discountinterest | 贴现利息 | discountinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 54 | discountcharge | 贴现手续费 | discountcharge | decimal(28, 8) |  | 金额 (UFMoney) |
| 55 | storageunit | 托管单位 | storageunit | varchar(20) |  | 客商 (custsupplier) |
| 56 | storagebank | 托管银行 | storagebank | varchar(20) |  | 银行档案 (bankdoc) |
| 57 | outputunit | 领用单位 | outputunit | varchar(20) |  | 客商 (custsupplier) |
| 58 | pk_bill | 动作单据主键 | pk_bill | char(20) | √ | 主键 (UFID) |
| 59 | billtypename | 单据类型名称 | billtypename | varchar(50) |  | 字符串 (String) |
| 60 | actionperson | 操作人 | actionperson | varchar(20) |  | 用户 (user) |
| 61 | securityaccount | 保证金账户 | securityaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 62 | securityrate | 保证金比例 | securityrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 63 | securitymoney | 保证金金额 | securitymoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 64 | returnperson | 退票人 | returnperson | varchar(20) |  | 人员基本信息 (psndoc) |
| 65 | dreturndate | 退票日期 | dreturndate | char(19) |  | 日期 (UFDate) |
| 66 | olcmoney | 组织本币金额 | olcmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 67 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 金额 (UFMoney) |
| 68 | glcmoney | 集团本币金额 | glcmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 69 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 金额 (UFMoney) |
| 70 | gllcmoney | 全局本币金额 | gllcmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 71 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 金额 (UFMoney) |
| 72 | beginstatus | 开始状态 | beginstatus | varchar(50) |  | 字符串 (String) |
| 73 | endstatus | 结束状态 | endstatus | varchar(50) |  | 字符串 (String) |
| 74 | poundagemoney | 开票手续费 | poundagemoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 75 | pk_cctype | 使用授信品种 | pk_cctype | varchar(50) |  | 字符串 (String) |
| 76 | usedccamount | 使用授信额度 | usedccamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 77 | paybilldate | 开票日期 | paybilldate | char(19) |  | 日期 (UFDate) |
| 78 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 79 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 80 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 81 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 82 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 83 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 84 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 85 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 86 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 87 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 88 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 89 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 90 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 91 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |