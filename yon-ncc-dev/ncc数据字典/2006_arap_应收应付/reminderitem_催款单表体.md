# |<<

**催款单表体 (reminderitem / nc.vo.arap.reminder.ReminderItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4871.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reminderitem | 催款单表体pk | pk_reminderitem | varchar(20) | √ | 字符串 (String) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 4 | expiredate | 信用到期日 | expiredate | char(19) |  | 日期 (UFDate) |
| 5 | material | 物料 | material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | money_de | 发票金额 | money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | money_done | 已收款 | money_done | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | quantity_bal | 数量余额 | quantity_bal | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | money_bal | 原币余额 | money_bal | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 12 | invoiceno | 发票号 | invoiceno | varchar(50) |  | 字符串 (String) |
| 13 | outstoreno | 出库单号 | outstoreno | varchar(50) |  | 字符串 (String) |
| 14 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 15 | propertyid | 收付款协议id | propertyid | varchar(50) |  | 字符串 (String) |
| 16 | pk_recbill | 应收单单据pk | pk_recbill | varchar(50) |  | 字符串 (String) |
| 17 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 18 | anadate | 分析日期 | anadate | char(19) |  | 日期 (UFDate) |
| 19 | accage | 账龄 | accage | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | expiredmny | 已到期款项 | expiredmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | unexpiremny | 未到期款项 | unexpiremny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | project | 项目 | project | varchar(20) |  | 项目 (project) |