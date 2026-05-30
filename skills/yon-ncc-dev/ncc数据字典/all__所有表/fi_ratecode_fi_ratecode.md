# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8374.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratecode | pk_ratecode | pk_ratecode | char(20) | √ |
| 2 | beginamount | beginamount | beginamount | number(28, 8) |
| 3 | begindays | begindays | begindays | number(38, 0) |
| 4 | dayofyear | dayofyear | dayofyear | varchar2(50) |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |
| 6 | finance_rate_type | finance_rate_type | finance_rate_type | varchar2(50) |  |  | '1' |
| 7 | inputdate | inputdate | inputdate | char(19) |
| 8 | moverrate | moverrate | moverrate | number(15, 8) |
| 9 | mrate | mrate | mrate | number(15, 8) |
| 10 | note | note | note | varchar2(200) |
| 11 | overrate | overrate | overrate | number(15, 8) |
| 12 | pk_alter | pk_alter | pk_alter | varchar2(50) |
| 13 | pk_corp | pk_corp | pk_corp | varchar2(20) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(255) |
| 17 | rate | rate | rate | number(15, 8) |
| 18 | rateclass | rateclass | rateclass | number(38, 0) |
| 19 | rateid | rateid | rateid | varchar2(50) |
| 20 | ratename | ratename | ratename | varchar2(300) |
| 21 | ratename2 | ratename2 | ratename2 | varchar2(300) |
| 22 | ratename3 | ratename3 | ratename3 | varchar2(300) |
| 23 | ratename4 | ratename4 | ratename4 | varchar2(300) |
| 24 | ratename5 | ratename5 | ratename5 | varchar2(300) |
| 25 | ratename6 | ratename6 | ratename6 | varchar2(300) |
| 26 | rateprop | rateprop | rateprop | varchar2(50) |
| 27 | ratetype | ratetype | ratetype | varchar2(50) |
| 28 | rate_bound | rate_bound | rate_bound | varchar2(50) |
| 29 | revisedate | revisedate | revisedate | char(19) |
| 30 | serial_number | serial_number | serial_number | number(38, 0) |
| 31 | vdef | vdef | vdef | varchar2(101) |
| 32 | yoverrate | yoverrate | yoverrate | number(15, 8) |
| 33 | yrate | yrate | yrate | number(15, 8) |
| 34 | creationtime | creationtime | creationtime | char(19) |
| 35 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 38 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |