# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6892.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | colaccpk | colaccpk | colaccpk | varchar2(20) | √ |
| 2 | timedim | timedim | timedim | varchar2(20) | √ |
| 3 | colhalfyear | colhalfyear | colhalfyear | varchar2(20) |
| 4 | colmonth | colmonth | colmonth | varchar2(20) |
| 5 | colquarter | colquarter | colquarter | varchar2(20) |
| 6 | coltimetype | coltimetype | coltimetype | varchar2(20) |
| 7 | colyear | colyear | colyear | varchar2(20) |
| 8 | dishalfyear | dishalfyear | dishalfyear | varchar2(200) |
| 9 | dismonth | dismonth | dismonth | varchar2(200) |
| 10 | disquarter | disquarter | disquarter | varchar2(200) |
| 11 | disyear | disyear | disyear | varchar2(200) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |