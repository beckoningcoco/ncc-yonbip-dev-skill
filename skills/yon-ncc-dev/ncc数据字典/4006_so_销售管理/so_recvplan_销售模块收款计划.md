# |<<

**销售模块收款计划 (so_recvplan / nc.vo.so.pub.entry.RecvPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5428.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | vbillcode | 订单号 | vbillcode | varchar(50) | √ | 字符串 (String) |
| 2 | cpaytermid | 收款协议号 | cpaytermid | varchar(20) |  | 收款协议 (income) |
| 3 | iaccounttermno | 收款期 | iaccounttermno | varchar(50) |  | 字符串 (String) |
| 4 | dbegindate | 账期起算日 | dbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 5 | dinsideenddate | 内控到期日 | dinsideenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 6 | nrate | 收款比例 | nrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | norigmny | 金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | bpreflag | 预收标记 | bpreflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | corigcurrencyid | 原币 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |