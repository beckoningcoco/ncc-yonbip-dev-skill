# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8731.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplier | pk_supplier | pk_supplier | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | memo | memo | memo | varchar2(50) |
| 4 | name | name | name | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 8 | syscode | syscode | syscode | varchar2(20) |  |  | '~' |
| 9 | def1 | def1 | def1 | varchar2(101) |
| 10 | def2 | def2 | def2 | varchar2(101) |
| 11 | def3 | def3 | def3 | varchar2(101) |
| 12 | def4 | def4 | def4 | varchar2(101) |
| 13 | def5 | def5 | def5 | varchar2(101) |
| 14 | def6 | def6 | def6 | varchar2(101) |
| 15 | def7 | def7 | def7 | varchar2(101) |
| 16 | def8 | def8 | def8 | varchar2(101) |
| 17 | def9 | def9 | def9 | varchar2(101) |
| 18 | def10 | def10 | def10 | varchar2(101) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |