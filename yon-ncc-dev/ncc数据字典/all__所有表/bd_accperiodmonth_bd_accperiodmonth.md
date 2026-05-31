# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6728.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accperiodmonth | pk_accperiodmonth | pk_accperiodmonth | char(20) | √ |
| 2 | accperiodmth | accperiodmth | accperiodmth | varchar2(3) |
| 3 | begindate | begindate | begindate | char(19) |
| 4 | beginmonth | beginmonth | beginmonth | varchar2(20) |  |  | '~' |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 6 | enddate | enddate | enddate | char(19) |
| 7 | endmonth | endmonth | endmonth | varchar2(20) |  |  | '~' |
| 8 | isadj | isadj | isadj | char(1) |  |  | 'N' |
| 9 | pk_accperiod | pk_accperiod | pk_accperiod | varchar2(20) |  |  | '~' |
| 10 | pk_accperiodscheme | pk_accperiodscheme | pk_accperiodscheme | varchar2(20) | √ |
| 11 | pk_org | pk_org | pk_org | char(20) | √ |
| 12 | yearmth | yearmth | yearmth | varchar2(10) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |