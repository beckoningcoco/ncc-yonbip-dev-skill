# |<<

**利率明细 (fi_rate_d / nc.vo.fi.rateconfig.RateItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2202.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rate_d | 主键 | pk_rate_d | char(20) | √ | 主键 (UFID) |
| 2 | beginamount | 透支起点金额 | beginamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 3 | begindays | 透支起点天数 | begindays | int |  | 整数 (Integer) |
| 4 | yrate | 年利率% | yrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 5 | mrate | 月利率‰ | mrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 6 | rate | 日利率‰ | rate | decimal(15, 8) |  | 数值 (UFDouble) |
| 7 | yoverrate | 透支年利率% | yoverrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 8 | moverrate | 透支月利率‰ | moverrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 9 | overrate | 透支日利率‰ | overrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 10 | pk_ratechange | 利率变更主键 | pk_ratechange | char(20) |  | 主键 (UFID) |