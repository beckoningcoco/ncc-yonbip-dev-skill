# |<<

**逾期利率明细 (fi_over_d / nc.vo.fi.rateconfig.RateOverVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2200.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_headover_d | 主键 | pk_headover_d | char(20) | √ | 主键 (UFID) |
| 2 | pk_ratechange | 利率变更主键 | pk_ratechange | char(20) |  | 主键 (UFID) |
| 3 | serial_number | 序号 | serial_number | int |  | 整数 (Integer) |
| 4 | beginsign | 起点关系符 | beginsign | varchar(20) |  | 字符串 (String) |
| 5 | begindays | 起点天数 | begindays | int |  | 整数 (Integer) |
| 6 | endsign | 终点关系符 | endsign | varchar(20) |  | 字符串 (String) |
| 7 | enddays | 终点天数 | enddays | int |  | 整数 (Integer) |
| 8 | yrate | 年利率% | yrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 9 | mrate | 月利率‰ | mrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 10 | rate | 日利率‰ | rate | decimal(15, 8) |  | 数值 (UFDouble) |
| 11 | yoverrate | 透支年利率% | yoverrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 12 | moverrate | 透支月利率‰ | moverrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | overrate | 透支日利率‰ | overrate | decimal(15, 8) |  | 数值 (UFDouble) |