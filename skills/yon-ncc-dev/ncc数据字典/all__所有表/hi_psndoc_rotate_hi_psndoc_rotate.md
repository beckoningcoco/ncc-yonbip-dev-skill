# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8668.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | begindate | begindate | begindate | varchar2(10) |
| 2 | enddate | enddate | enddate | varchar2(10) |
| 3 | lastflag | lastflag | lastflag | char(1) |
| 4 | pk_dephead | pk_dephead | pk_dephead | varchar2(20) |
| 5 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 6 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | varchar2(20) | √ |
| 7 | pk_rotatedept | pk_rotatedept | pk_rotatedept | varchar2(20) |
| 8 | pk_teaching | pk_teaching | pk_teaching | varchar2(20) |
| 9 | recordnum | recordnum | recordnum | number(38, 0) |
| 10 | creationtime | creationtime | creationtime | varchar2(19) |
| 11 | creator | creator | creator | varchar2(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |