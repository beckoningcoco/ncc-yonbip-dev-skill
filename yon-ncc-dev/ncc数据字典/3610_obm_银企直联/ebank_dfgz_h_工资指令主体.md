# |<<

**工资指令主体 (ebank_dfgz_h / nc.vo.obm.payroll.DfgzHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1760.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dfgz | 工资单主键 | pk_dfgz | char(20) | √ | 主键 (UFID) |
| 2 | yurref | 支付参考号 | yurref | varchar(50) |  | 字符串 (String) |
| 3 | paypackageid | 支付批次流水 | paypackageid | varchar(50) |  | 字符串 (String) |
| 4 | salaryperiod | 发放期间 | salaryperiod | varchar(50) |  | 字符串 (String) |
| 5 | persontotal | 支付总笔数 | persontotal | int |  | 整数 (Integer) |
| 6 | paytotalnum | 支付总金额 | paytotalnum | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 8 | pk_bankaccsub | 付款账号 | pk_bankaccsub | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | dbtacc | 付款银行账号 | dbtacc | varchar(40) |  | 字符串 (String) |
| 11 | dbtaccname | 付款账户户名 | dbtaccname | varchar(100) |  | 字符串 (String) |
| 12 | dbtaccbkn | 付款账户联行号 | dbtaccbkn | varchar(30) |  | 字符串 (String) |
| 13 | bbknbr | 付款开户银行 | bbknbr | varchar(100) |  | 字符串 (String) |
| 14 | nbanktype | 支付接口银行 | nbanktype | varchar(50) |  | 字符串 (String) |
| 15 | paydate | 支付日期 | paydate | char(19) |  | 日期 (UFDate) |
| 16 | paymsg | 支付信息 | paymsg | varchar(500) |  | 字符串 (String) |
| 17 | billpaystate | 支付状态 | billpaystate | int |  | 指令支付状态 (paystaeEnum) |  | 0=支付成功; |