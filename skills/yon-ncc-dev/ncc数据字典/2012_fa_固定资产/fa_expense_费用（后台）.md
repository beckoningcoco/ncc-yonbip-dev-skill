# |<<

**费用（后台） (fa_expense / nc.vo.fa.assetcard.ExpenseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2020.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expense | 主键 | pk_expense | char(20) | √ | 主键 (UFID) |
| 2 | occur_date | 发生日期 | occur_date | char(19) |  | 日期 (UFDate) |
| 3 | pk_costsubj | 收支项目 | pk_costsubj | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 4 | digest | 摘要 | digest | varchar(80) |  | 字符串 (String) |
| 5 | money | 金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |
| 7 | pk_bill | 付款单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 8 | pk_bill_b | 付款单据表体主键 | pk_bill_b | varchar(20) |  | 字符串 (String) |
| 9 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |