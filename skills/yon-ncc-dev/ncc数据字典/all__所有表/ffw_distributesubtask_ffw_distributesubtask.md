# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8246.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributesubtask | pk_distributesubtask | pk_distributesubtask | char(20) | √ |
| 2 | begintime | begintime | begintime | char(19) |
| 3 | endtime | endtime | endtime | char(19) |
| 4 | exception | exception | exception | blob |
| 5 | exceptionmsg | exceptionmsg | exceptionmsg | varchar2(1000) |
| 6 | execosttime | execosttime | execosttime | varchar2(50) |
| 7 | executor_ip | executor_ip | executor_ip | varchar2(50) |
| 8 | pk_distributetask | pk_distributetask | pk_distributetask | char(20) | √ |
| 9 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 10 | servername | servername | servername | varchar2(50) |
| 11 | taskstatus | taskstatus | taskstatus | number(38, 0) |
| 12 | variableobj | variableobj | variableobj | blob |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |