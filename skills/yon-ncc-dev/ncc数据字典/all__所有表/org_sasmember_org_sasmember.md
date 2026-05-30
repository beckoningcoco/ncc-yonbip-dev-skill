# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10300.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sasmember | pk_sasmember | pk_sasmember | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | idx | idx | idx | number(38, 0) |
| 4 | innercode | innercode | innercode | varchar2(200) |
| 5 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 6 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | char(20) | √ |
| 8 | pk_sas | pk_sas | pk_sas | char(20) | √ |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |