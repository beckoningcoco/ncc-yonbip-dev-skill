# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8375.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rate_d | pk_rate_d | pk_rate_d | char(20) | √ |
| 2 | beginamount | beginamount | beginamount | number(28, 8) |
| 3 | begindays | begindays | begindays | number(38, 0) |
| 4 | details | details | details | char(20) | √ |
| 5 | moverrate | moverrate | moverrate | number(15, 8) |
| 6 | mrate | mrate | mrate | number(15, 8) |
| 7 | overrate | overrate | overrate | number(15, 8) |
| 8 | pk_ratechange | pk_ratechange | pk_ratechange | char(20) |
| 9 | rate | rate | rate | number(15, 8) |
| 10 | yoverrate | yoverrate | yoverrate | number(15, 8) |
| 11 | yrate | yrate | yrate | number(15, 8) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |