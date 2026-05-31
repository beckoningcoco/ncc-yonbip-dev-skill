# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8370.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_headover_d | pk_headover_d | pk_headover_d | char(20) | √ |
| 2 | begindays | begindays | begindays | number(38, 0) |
| 3 | beginsign | beginsign | beginsign | varchar2(50) |
| 4 | enddays | enddays | enddays | number(38, 0) |
| 5 | endsign | endsign | endsign | varchar2(50) |
| 6 | headdetails | headdetails | headdetails | char(20) | √ |
| 7 | mrate | mrate | mrate | number(15, 8) |
| 8 | pk_ratechange | pk_ratechange | pk_ratechange | char(20) |
| 9 | rate | rate | rate | number(15, 8) |
| 10 | serial_number | serial_number | serial_number | number(38, 0) |
| 11 | yrate | yrate | yrate | number(15, 8) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |