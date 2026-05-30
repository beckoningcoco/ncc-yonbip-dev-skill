# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6448.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_driver | pk_driver | pk_driver | char(20) | √ |
| 2 | driverclass | driverclass | driverclass | varchar2(300) |
| 3 | drivername | drivername | drivername | varchar2(100) |
| 4 | dsname | dsname | dsname | varchar2(30) |
| 5 | metatype | metatype | metatype | varchar2(30) |
| 6 | modifytime | modifytime | modifytime | char(19) |
| 7 | note | note | note | varchar2(300) |
| 8 | resdir | resdir | resdir | varchar2(20) |
| 9 | resid | resid | resid | varchar2(20) |
| 10 | seqnumber | seqnumber | seqnumber | number(38, 0) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |