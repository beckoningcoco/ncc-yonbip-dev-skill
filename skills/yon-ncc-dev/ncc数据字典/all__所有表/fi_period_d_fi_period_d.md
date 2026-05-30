# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8372.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_period_d | pk_period_d | pk_period_d | char(20) | √ |
| 2 | enddays | enddays | enddays | number(38, 0) |
| 3 | mrate | mrate | mrate | number(15, 8) |
| 4 | perioddetails | perioddetails | perioddetails | char(20) | √ |
| 5 | pk_ratechange | pk_ratechange | pk_ratechange | char(20) |
| 6 | rate | rate | rate | number(15, 8) |
| 7 | serial_number | serial_number | serial_number | number(38, 0) |
| 8 | yrate | yrate | yrate | number(15, 8) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |