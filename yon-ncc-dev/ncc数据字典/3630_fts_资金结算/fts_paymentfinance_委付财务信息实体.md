# |<<

**委付财务信息实体 (fts_paymentfinance / nc.vo.fts.commissionpayment.PayFinanceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2319.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paymentfinance | 委付财务信息实体标识 | pk_paymentfinance | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 主键 (UFID) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 主键 (UFID) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 主键 (UFID) |
| 5 | amount | 付款金额 | amount | decimal(28, 8) | √ | 金额 (UFMoney) |
| 6 | olcamount | 本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | olcrate | 本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 8 | glcamount | 集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 10 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 11 | gllcamount | 全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | pk_financeorg_p | 付款方财务组织 | pk_financeorg_p | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 13 | pk_financeorg_v | 付款方财务组织版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 14 | pk_inneraccount_p | 付款方内部账户 | pk_inneraccount_p | varchar(20) |  | 内部账户 (bd_accid) |
| 15 | pk_company_r | 收款客商标识 | pk_company_r | varchar(20) |  | 客商 (custsupplier) |
| 16 | pk_bankaccount_r | 收款方银行帐号标识 | pk_bankaccount_r | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 17 | bankaccount_r | 收款方银行帐号 | bankaccount_r | varchar(200) |  | 字符串 (String) |
| 18 | custaccprop | 客商账户性质 | custaccprop | int |  | 账户性质 (accountproperty) |  | 0=公司; |