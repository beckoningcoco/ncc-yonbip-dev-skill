# |<<

**费用明细帐 (er_expenseaccount / nc.vo.erm.expenseaccount.ExpenseAccountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1894.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expenseaccount | 主键 | pk_expenseaccount | char(20) | √ | 主键 (UFID) |
| 2 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 3 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 4 | billstatus | 明细账状态 | billstatus | int |  | 费用明细帐状态 (expenseaccount_status) |  | 0=暂存; |