# |<<

**定额利率明细 (fi_ration_d / nc.vo.fi.rateconfig.RateRationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2205.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ration_d | 主键 | pk_ration_d | char(20) | √ | 主键 (UFID) |
| 2 | serial_number | 序号 | serial_number | int |  | 整数 (Integer) |
| 3 | beginsign | 起点关系符 | beginsign | varchar(20) |  | 字符串 (String) |
| 4 | beginamount | 起点金额 | beginamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | endsign | 终点关系符 | endsign | varchar(20) |  | 字符串 (String) |
| 6 | endamount | 终点金额 | endamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | yrate | 年利率% | yrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 8 | mrate | 月利率‰ | mrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 9 | rate | 日利率‰ | rate | decimal(15, 8) |  | 数值 (UFDouble) |
| 10 | pk_ratechange | 利率变更主键 | pk_ratechange | char(20) |  | 主键 (UFID) |
| 11 | yoverrate | 透支年利率% | yoverrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | moverrate | 透支月利率‰ | moverrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | overrate | 透支日利率‰ | overrate | decimal(28, 8) |  | 数值 (UFDouble) |