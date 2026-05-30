# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9717.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tracedata | pk_tracedata | pk_tracedata | char(20) | √ |
| 2 | classname | classname | classname | varchar2(100) |
| 3 | modulename | modulename | modulename | varchar2(50) |
| 4 | pk_group | pk_group | pk_group | char(20) |
| 5 | pk_org | pk_org | pk_org | char(20) |
| 6 | resdir | resdir | resdir | varchar2(30) |
| 7 | resid | resid | resid | varchar2(30) |
| 8 | tracedataname | tracedataname | tracedataname | varchar2(50) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | char(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | char(20) |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |