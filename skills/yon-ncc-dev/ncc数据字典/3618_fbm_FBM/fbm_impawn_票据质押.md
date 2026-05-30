# |<<

**票据质押 (fbm_impawn / nc.vo.fbm.impawn.ImpawnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2137.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_impawn | 主键 | pk_impawn | char(20) | √ | 主键 (UFID) |
| 2 | impawnno | 质押单编号 | impawnno | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 4 | pk_register | 登记表主键 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 5 | fbmbillno | 票据编号 | fbmbillno | varchar(100) |  | 字符串 (String) |
| 6 | evaluatevalue | 评估价值 | evaluatevalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | olcevaluatevalue | 组织本币评估价值 | olcevaluatevalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | glcevaluatevalue | 集团本币评估价值 | glcevaluatevalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | gllevaluatevalue | 全局本币评估价值 | gllevaluatevalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | evaluateunit | 评估单位 | evaluateunit | varchar(100) |  | 字符串 (String) |
| 11 | impawnbank | 质押银行 | impawnbank | varchar(20) |  | 银行档案 (bankdoc) |
| 12 | impawnrate | 质押率 | impawnrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | impawnable | 可质押价值 | impawnable | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | impawnunit | 质押单位 | impawnunit | varchar(20) |  | 客商 (custsupplier) |
| 15 | impawndate | 质押日期 | impawndate | char(19) |  | 日期 (UFDate) |
| 16 | impawnbackunit | 质押回收单位 | impawnbackunit | varchar(20) |  | 客商 (custsupplier) |
| 17 | impawnbackdate | 质押回收日期 | impawnbackdate | char(19) |  | 日期 (UFDate) |
| 18 | debitunit | 借款单位 | debitunit | varchar(20) |  | 客商 (custsupplier) |
| 19 | creditunit | 贷款单位 | creditunit | varchar(50) |  | 字符串 (String) |
| 20 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 21 | vbillstatus | 审批状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) | -1 | 0=审批未通过; |