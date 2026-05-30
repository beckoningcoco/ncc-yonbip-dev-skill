# |<<

**应付票据退票子表 (fbm_preturn_b / nc.vo.fbm.preturn.PReturnBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2145.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_preturn_b | 主键 | pk_preturn_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_preturn | 主表主键 | pk_preturn | char(20) |  | 主键 (UFID) |
| 3 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 4 | fbmbillno | 票据编号 | fbmbillno | varchar(100) |  | 主键 (UFID) |
| 5 | body_curr | 币种 | body_curr | varchar(20) |  | 币种 (currtype) |
| 6 | bodymoney | 原币金额 | bodymoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | olcmoney | 组织本币金额 | olcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | glcmoney | 集团本币金额 | glcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | gllcmoney | 全局本币金额 | gllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 11 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 12 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | billmoney | 票据票面金额 | billmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | billolcmoney | 票据组织本币金额 | billolcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | billolcrate | 票据组织本币汇率 | billolcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | billglcmoney | 票据集团本币金额 | billglcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | billglcrate | 票据集团本币汇率 | billglcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 18 | billgllcmoney | 票据全局本币金额 | billgllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | billgllcrate | 票据全局本币汇率 | billgllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 20 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 21 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 22 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 23 | invoicedate | 出票日期 | invoicedate | char(19) |  | 日期 (UFDate) |
| 24 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 25 | payunit | 出票人主键 | payunit | varchar(181) |  | 字符串 (String) |
| 26 | paybankacc | 出票人账号主键 | paybankacc | varchar(181) |  | 字符串 (String) |
| 27 | paybank | 出票人开户行主键 | paybank | varchar(181) |  | 字符串 (String) |
| 28 | hidepayunit | 出票人 | hidepayunit | varchar(20) |  | 客商 (custsupplier) |
| 29 | hidepaybankacc | 出票人账户 | hidepaybankacc | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 30 | hidepaybank | 出票人开户行 | hidepaybank | varchar(20) |  | 银行档案 (bankdoc) |
| 31 | receiveunit | 收款人主键 | receiveunit | varchar(181) |  | 字符串 (String) |
| 32 | receivebankacc | 收款人账号主键 | receivebankacc | varchar(181) |  | 字符串 (String) |
| 33 | receivebank | 收款开户行主键 | receivebank | varchar(181) |  | 字符串 (String) |
| 34 | hidereceiveunit | 收款人 | hidereceiveunit | varchar(20) |  | 客商 (custsupplier) |
| 35 | hidereceivebankacc | 收款人账号 | hidereceivebankacc | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 36 | hidereceivebank | 收款人开户行 | hidereceivebank | varchar(20) |  | 银行档案 (bankdoc) |
| 37 | signagrbank | 承兑人 | signagrbank | varchar(20) |  | 银行档案 (bankdoc) |
| 38 | signagrbanknum | 承兑人开户行号 | signagrbanknum | varchar(50) |  | 字符串 (String) |
| 39 | signagrbankname | 承兑人开户行名 | signagrbankname | varchar(300) |  | 字符串 (String) |
| 40 | acceptorname | 承兑人名称 | acceptorname | varchar(200) |  | 字符串 (String) |
| 41 | acceptoraccount | 承兑人账号 | acceptoraccount | varchar(50) |  | 字符串 (String) |
| 42 | note | 票面备注 | note | varchar(181) |  | 字符串 (String) |
| 43 | acceptanceno | 承兑协议编号 | acceptanceno | varchar(100) |  | 字符串 (String) |
| 44 | contractno | 交易合同编号 | contractno | varchar(100) |  | 字符串 (String) |
| 45 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |