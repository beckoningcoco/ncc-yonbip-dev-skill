# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7581.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | caccountid | caccountid | caccountid | char(20) | √ |
| 2 | begindate | begindate | begindate | char(19) | √ |
| 3 | cperiod | cperiod | cperiod | varchar2(20) | √ |  | '~' |
| 4 | enddate | enddate | enddate | char(19) | √ |
| 5 | iaccountstatus | iaccountstatus | iaccountstatus | number(38, 0) | √ |  | 1 |
| 6 | periodcloseder | periodcloseder | periodcloseder | varchar2(20) |  |  | '~' |
| 7 | periodclosedtime | periodclosedtime | periodclosedtime | char(19) |
| 8 | perioduncloseder | perioduncloseder | perioduncloseder | varchar2(20) |  |  | '~' |
| 9 | periodunclosedtime | periodunclosedtime | periodunclosedtime | char(19) |
| 10 | pk_accperiodmonth | pk_accperiodmonth | pk_accperiodmonth | char(20) |
| 11 | pk_group | pk_group | pk_group | char(20) | √ |
| 12 | pk_org | pk_org | pk_org | char(20) | √ |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | char(20) | √ |  | '~' |
| 14 | speriod | speriod | speriod | varchar2(3) | √ |
| 15 | syear | syear | syear | varchar2(50) | √ |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |