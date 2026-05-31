# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8251.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ops_log | pk_ops_log | pk_ops_log | char(20) | √ |
| 2 | args | args | args | blob |
| 3 | content | content | content | blob |
| 4 | instance | instance | instance | varchar2(50) | √ |
| 5 | method | method | method | varchar2(50) | √ |
| 6 | server | server | server | varchar2(50) | √ |
| 7 | thread | thread | thread | varchar2(50) | √ |
| 8 | transaction | transaction | transaction | varchar2(50) | √ |
| 9 | userid | userid | userid | varchar2(30) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |