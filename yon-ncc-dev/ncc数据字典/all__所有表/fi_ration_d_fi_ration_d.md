# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8376.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ration_d | pk_ration_d | pk_ration_d | char(20) | √ |
| 2 | beginamount | beginamount | beginamount | number(28, 8) |
| 3 | beginsign | beginsign | beginsign | varchar2(50) |
| 4 | endamount | endamount | endamount | number(28, 8) |
| 5 | endsign | endsign | endsign | varchar2(50) |
| 6 | moverrate | moverrate | moverrate | number(28, 8) |
| 7 | mrate | mrate | mrate | number(15, 8) |
| 8 | overrate | overrate | overrate | number(28, 8) |
| 9 | pk_ratechange | pk_ratechange | pk_ratechange | char(20) |
| 10 | rate | rate | rate | number(15, 8) |
| 11 | rationdetails | rationdetails | rationdetails | char(20) | √ |
| 12 | serial_number | serial_number | serial_number | number(38, 0) |
| 13 | yoverrate | yoverrate | yoverrate | number(28, 8) |
| 14 | yrate | yrate | yrate | number(15, 8) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |