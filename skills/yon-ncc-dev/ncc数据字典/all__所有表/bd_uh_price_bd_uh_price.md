# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7206.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_price | pk_price | pk_price | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 4 | func | func | func | varchar2(200) |
| 5 | innercode | innercode | innercode | varchar2(50) |
| 6 | name | name | name | varchar2(200) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | sysflag | sysflag | sysflag | char(1) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |