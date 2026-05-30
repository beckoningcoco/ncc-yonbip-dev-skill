# |<<

**月余额汇总日志 (arap_balancelog / nc.vo.arap.tally.BalanceLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/151.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancelog | 主键 | pk_balancelog | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 3 | balance_month | 已汇总月份 | balance_month | char(6) |  | 字符串 (String) |
| 4 | create_date | 完成时间 | create_date | char(19) |  | 日期 (UFDate) |