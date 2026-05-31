# |<<

**工资指令明细 (ebank_dfgz_b / nc.vo.obm.payroll.DfgzBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1759.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dfgz_b | 代发工资单子表主键 | pk_dfgz_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_dfgz | 代发工资单主表主键 | pk_dfgz | char(20) |  | 主键 (UFID) |
| 3 | paypackageid | 支付批次流水 | paypackageid | varchar(50) |  | 字符串 (String) |
| 4 | headpackageid | 主包流水号 | headpackageid | varchar(30) |  | 字符串 (String) |
| 5 | childpackageid | 子交易流水号 | childpackageid | varchar(30) |  | 字符串 (String) |
| 6 | personname | 员工姓名 | personname | varchar(40) |  | 字符串 (String) |
| 7 | identitynum | 证件号码 | identitynum | varchar(30) |  | 字符串 (String) |
| 8 | crtacc | 收款银行账户 | crtacc | varchar(40) |  | 字符串 (String) |
| 9 | crtaccname | 户名 | crtaccname | varchar(100) |  | 字符串 (String) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | amount | 工资金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | paystate | 支付状态 | paystate | int |  | 指令支付状态 (paystaeEnum) |  | 0=支付成功; |