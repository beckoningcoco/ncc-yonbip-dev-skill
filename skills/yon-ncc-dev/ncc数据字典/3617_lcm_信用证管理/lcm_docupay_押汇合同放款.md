# |<<

**押汇合同放款 (lcm_docupay / nc.vo.lcm.paydocubills.DocuPayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3563.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payrcpt | 押汇放款主键 | pk_payrcpt | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | isinitial | 期初标志 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 9 | pk_contract | 合同编号 | pk_contract | varchar(20) |  | 押汇合同 (lcm_LocuContract) |
| 10 | pk_payplan | 放款计划编号 | pk_payplan | varchar(20) |  | 放款计划 (lcm_LocuContractPayPlan) |
| 11 | pk_debitacct | 借款单位账户 | pk_debitacct | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 12 | paydate | 放款日期 | paydate | char(19) |  | 日期 (UFDate) |
| 13 | payamount | 放款金额 | payamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | olcrate | 汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 15 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 17 | olcpayamount | 放款本币金额 | olcpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | glcpayamount | 放款集团本币金额 | glcpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | gllcpayamount | 放款全局本币金额 | gllcpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | vbillstatus | 审批状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |