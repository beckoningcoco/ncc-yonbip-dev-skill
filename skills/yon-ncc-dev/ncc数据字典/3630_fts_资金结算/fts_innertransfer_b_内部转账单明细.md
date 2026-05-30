# |<<

**内部转账单明细 (fts_innertransfer_b / nc.vo.fts.innertransfer.InnerTransferBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2314.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innertransfer_b | 内转单明细ID | pk_innertransfer_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_financeorg_r | 收款财务组织 | pk_financeorg_r | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_financeorg_r_v | 收款财务组织版本 | pk_financeorg_r_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_financeorg_p | 付款财务组织 | pk_financeorg_p | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_financeorg_p_v | 付款财务组织版本 | pk_financeorg_p_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_inneraccount_r | 收款内部账户 | pk_inneraccount_r | varchar(20) |  | 内部账户 (bd_accid) |
| 7 | pk_inneraccount_p | 付款内部账户 | pk_inneraccount_p | varchar(20) |  | 内部账户 (bd_accid) |
| 8 | amount | 托收原币金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | gllcamount | 托收全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glcamount | 托收集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | olcamount | 托收本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | payamount | 实付原币金额 | payamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | gllcpayamount | 实付全局本币金额 | gllcpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | glcpayamount | 实付集团本币金额 | glcpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | olcpayamount | 实付本币金额 | olcpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | unpayamount | 拒付原币金额 | unpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | gllcunpayamount | 拒付全局本币金额 | gllcunpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | glcunpayamount | 拒付集团本币金额 | glcunpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | olcunpayamount | 拒付本币金额 | olcunpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 21 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 22 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 23 | pk_payplanitem | 付方计划项目 | pk_payplanitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 24 | pk_getplanitem | 收方计划项目 | pk_getplanitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 25 | pk_paycostsubj | 付方收支项目 | pk_paycostsubj | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 26 | pk_getcostsubj | 收方收支项目 | pk_getcostsubj | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 27 | needacceptance | 是否需要承付 | needacceptance | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | isforceaccept | 是否强制承付 | isforceaccept | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | acceptancetype | 承付类型 | acceptancetype | int |  | 承付类型 (acceptancetype) |  | 0=全额承付; |