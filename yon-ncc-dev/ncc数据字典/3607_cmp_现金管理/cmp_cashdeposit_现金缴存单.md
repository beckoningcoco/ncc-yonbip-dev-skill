# |<<

**现金缴存单 (cmp_cashdeposit / nc.vo.cmp.cash.CashDepositVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1544.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashdeposit | 单据ID | pk_cashdeposit | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(0) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 6 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 8 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 9 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 10 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 11 | pk_cashaccount | 现金账户 | pk_cashaccount | varchar(20) |  | 现金账户 (cashaccount) |
| 12 | pk_bankaccount | 银行账户 | pk_bankaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 13 | isinneracc | 是否内部账户 | isinneracc | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_fundbankaccount | 资金组织银行账户 | pk_fundbankaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 15 | pk_fundorg | 资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 16 | money | 原币金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | olcmoney | 组织本币金额 | olcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | glcmoney | 集团本币金额 | glcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | gllcmoney | 全局本币金额 | gllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | billstatus | 单据状态 | billstatus | int |  | 单据状态 (BillStatusEnum) |  | 0=暂存; |