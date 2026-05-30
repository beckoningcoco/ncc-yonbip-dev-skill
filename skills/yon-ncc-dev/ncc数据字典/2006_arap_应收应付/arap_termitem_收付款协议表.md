# |<<

**收付款协议表 (arap_termitem / nc.vo.arap.termitem.TermVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/199.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_termitem | 收付款协议表主键 | pk_termitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 主组织版本主键 | pk_org_v | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_bill | 单据主表ID | pk_bill | char(20) |  | 主键 (UFID) |
| 6 | pk_item | 单据辅表ID | pk_item | char(20) |  | 主键 (UFID) |
| 7 | expiredate | 信用到期日 | expiredate | char(19) |  | 日期 (UFDate) |
| 8 | innerctldeferdays | 内控到期日 | innerctldeferdays | char(19) |  | 日期 (UFDate) |
| 9 | money_de | 借方原币金额 | money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | local_money_de | 借方本币金额 | local_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | quantity_de | 借方数量 | quantity_de | decimal(20, 8) |  | 数值 (UFDouble) |
| 12 | money_cr | 贷方原币金额 | money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | local_money_cr | 贷方本币金额 | local_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | quantity_cr | 贷方数量 | quantity_cr | decimal(20, 8) |  | 数值 (UFDouble) |
| 15 | money_bal | 原币余额 | money_bal | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | local_money_bal | 本币余额 | local_money_bal | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | quantity_bal | 数量余额 | quantity_bal | decimal(20, 8) |  | 数值 (UFDouble) |
| 18 | grouplocal | 集团本币金额 | grouplocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | globallocal | 全局本币金额 | globallocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | groupdebit | 借方集团本币 | groupdebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | groupcredit | 贷方集团本币 | groupcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | globaldebit | 借方全局本币 | globaldebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | globalcredit | 贷方全局本币 | globalcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | groupbalance | 集团本币余额 | groupbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | globalbalance | 全局本币余额 | globalbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | lastdiscountdate | 最后折扣日期 | lastdiscountdate | char(19) |  | 日期 (UFDate) |
| 27 | lastdiscount | 最后折扣率 | lastdiscount | decimal(9, 6) |  | 数值 (UFDouble) |
| 28 | insurance | 质保金 | insurance | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | occupationmny | 预占用余额 | occupationmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | prepay | 预收付标志 | prepay | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | pk_term_b | 协议表体pk | pk_term_b | varchar(50) |  | 字符串 (String) |