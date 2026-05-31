# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9693.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_status | pk_status | pk_status | char(20) | √ |
| 2 | aloneid | aloneid | aloneid | varchar2(50) |
| 3 | exceptioninfo | exceptioninfo | exceptioninfo | varchar2(1000) |
| 4 | executime | executime | executime | varchar2(50) |
| 5 | executor | executor | executor | varchar2(50) |
| 6 | pk_hbflow | pk_hbflow | pk_hbflow | varchar2(20) |  |  | '~' |
| 7 | pk_hbstep | pk_hbstep | pk_hbstep | varchar2(50) |
| 8 | prestatus | prestatus | prestatus | varchar2(20) |
| 9 | stepstatus | stepstatus | stepstatus | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |