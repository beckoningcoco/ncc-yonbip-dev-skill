# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10172.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_brsmember | pk_brsmember | pk_brsmember | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | idx | idx | idx | number(38, 0) |
| 4 | innercode | innercode | innercode | varchar2(200) |
| 5 | membertype | membertype | membertype | number(38, 0) | √ |
| 6 | pk_brs | pk_brs | pk_brs | char(20) | √ |
| 7 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 8 | pk_fatherdept | pk_fatherdept | pk_fatherdept | varchar2(20) |  |  | '~' |
| 9 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 10 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(101) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(101) | √ |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |