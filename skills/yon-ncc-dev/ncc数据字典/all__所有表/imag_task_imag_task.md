# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9232.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_imagtask | pk_imagtask | pk_imagtask | char(20) | √ |
| 2 | begintime | begintime | begintime | char(19) |
| 3 | billid | billid | billid | varchar2(20) |
| 4 | billno | billno | billno | varchar2(50) |
| 5 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 6 | endtime | endtime | endtime | char(19) |
| 7 | packingtime | packingtime | packingtime | char(19) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | posttime | posttime | posttime | char(19) |
| 11 | scanner | scanner | scanner | varchar2(20) |  |  | '~' |
| 12 | signtime | signtime | signtime | char(19) |
| 13 | transtypecode | transtypecode | transtypecode | varchar2(50) |
| 14 | unpackingtime | unpackingtime | unpackingtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |