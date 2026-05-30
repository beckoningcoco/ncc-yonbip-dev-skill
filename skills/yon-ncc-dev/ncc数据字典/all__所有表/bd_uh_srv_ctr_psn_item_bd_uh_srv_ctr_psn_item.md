# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7228.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvctrtypeitem | pk_srvctrtypeitem | pk_srvctrtypeitem | char(20) | √ |
| 2 | dt_psnsrvtype | dt_psnsrvtype | dt_psnsrvtype | varchar2(50) |
| 3 | note | note | note | varchar2(256) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_psnsrvtype | pk_psnsrvtype | pk_psnsrvtype | varchar2(20) |  |  | '~' |
| 7 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 8 | quan_limit | quan_limit | quan_limit | number(14, 2) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |