# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12888.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_period | pk_wa_period | pk_wa_period | char(20) | √ |
| 2 | caccperiod | caccperiod | caccperiod | char(2) |
| 3 | caccyear | caccyear | caccyear | char(4) |
| 4 | cenddate | cenddate | cenddate | char(10) | √ |
| 5 | cperiod | cperiod | cperiod | char(2) | √ |
| 6 | cstartdate | cstartdate | cstartdate | char(10) | √ |
| 7 | cyear | cyear | cyear | char(4) | √ |
| 8 | pk_periodscheme | pk_periodscheme | pk_periodscheme | char(20) |
| 9 | taxperiod | taxperiod | taxperiod | char(2) |
| 10 | taxyear | taxyear | taxyear | char(4) |
| 11 | vcalmonth | vcalmonth | vcalmonth | char(2) |
| 12 | vcalyear | vcalyear | vcalyear | char(4) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |