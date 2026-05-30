# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7178.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paticate | pk_paticate | pk_paticate | char(20) | √ |
| 2 | code | code | code | varchar2(30) | √ |
| 3 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 4 | innercode | innercode | innercode | varchar2(50) |
| 5 | mnecode | mnecode | mnecode | varchar2(50) |
| 6 | name | name | name | varchar2(50) | √ |
| 7 | pk_cred | pk_cred | pk_cred | varchar2(20) |  |  | '~' |
| 8 | pk_disc | pk_disc | pk_disc | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |