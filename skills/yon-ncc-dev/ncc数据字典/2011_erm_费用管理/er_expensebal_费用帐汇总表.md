# |<<

**费用帐汇总表 (er_expensebal / nc.vo.erm.expenseaccount.ExpenseBalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1895.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expensebal | 主键 | pk_expensebal | char(20) | √ | 主键 (UFID) |
| 2 | billdate | 单据日期 | billdate | char(19) | √ | 日期 (UFDate) |
| 3 | accyear | 会计年度 | accyear | varchar(20) |  | 会计期间档案 (accperiod) |
| 4 | accmonth | 会计月份 | accmonth | char(2) |  | 字符串 (String) |
| 5 | billstatus | 单据状态 | billstatus | int | √ | 费用明细帐状态 (expenseaccount_status) |  | 0=暂存; |