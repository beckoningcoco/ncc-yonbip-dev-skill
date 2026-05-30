# |<<

**还款计划 (fd_repaymentplan / nc.vo.fd.fdmanage.fdreg.RepaymentplanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2185.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayplan | 主键 | pk_repayplan | char(20) | √ | 主键 (UFID) |
| 2 | planno | 还款计划编码 | planno | varchar(50) |  | 字符串 (String) |
| 3 | planrepaydate | 计划还款日期 | planrepaydate | char(19) |  | 日期 (UFDate) |
| 4 | prprincipal | 预计还本金 | prprincipal | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | olcprprincipal | 预计还本金本币 | olcprprincipal | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | grlcprprincipal | 预计还本集团本币金额 | grlcprprincipal | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | gllcprprincipal | 预计还本全局本币金额 | gllcprprincipal | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ppinterest | 预计付利息 | ppinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | olcppinterest | 预计付利息本币 | olcppinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | grlppinterest | 预计付利息集团本币金额 | grlppinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | gllppinterest | 预计付利息全局本币金额 | gllppinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |