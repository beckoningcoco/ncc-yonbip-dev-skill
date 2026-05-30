# |<<

**期间利率明细 (fi_period_d / nc.vo.fi.rateconfig.RatePeriodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2201.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_period_d | 主键 | pk_period_d | char(20) | √ | 主键 (UFID) |
| 2 | enddays | 期间起点天数 | enddays | int |  | 整数 (Integer) |
| 3 | yrate | 年利率% | yrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 4 | rate | 日利率‰ | rate | decimal(15, 8) |  | 数值 (UFDouble) |
| 5 | mrate | 月利率‰ | mrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 6 | serial_number | 序号 | serial_number | int |  | 整数 (Integer) |
| 7 | pk_ratechange | 利率变更主键 | pk_ratechange | char(20) |  | 主键 (UFID) |