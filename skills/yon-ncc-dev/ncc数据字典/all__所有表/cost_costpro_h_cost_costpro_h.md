# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7688.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costpro | pk_costpro | pk_costpro | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | costvalue | costvalue | costvalue | number(38, 0) |
| 4 | enablestate | enablestate | enablestate | char(1) |
| 5 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 6 | grade | grade | grade | number(38, 0) |
| 7 | inforesourse | inforesourse | inforesourse | varchar2(50) |
| 8 | innercode | innercode | innercode | varchar2(200) |
| 9 | name | name | name | varchar2(50) |
| 10 | parentid | parentid | parentid | varchar2(20) |  |  | '~' |
| 11 | parentname | parentname | parentname | varchar2(20) |  |  | '~' |
| 12 | pk_costclass | pk_costclass | pk_costclass | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | uprodisease | uprodisease | uprodisease | char(1) |
| 17 | vmemo | vmemo | vmemo | varchar2(50) |
| 18 | def1 | def1 | def1 | varchar2(100) |
| 19 | def2 | def2 | def2 | varchar2(100) |
| 20 | def3 | def3 | def3 | varchar2(100) |
| 21 | def4 | def4 | def4 | varchar2(100) |
| 22 | def5 | def5 | def5 | varchar2(100) |
| 23 | def6 | def6 | def6 | varchar2(100) |
| 24 | def7 | def7 | def7 | varchar2(100) |
| 25 | def8 | def8 | def8 | varchar2(100) |
| 26 | def9 | def9 | def9 | varchar2(100) |
| 27 | def10 | def10 | def10 | varchar2(100) |
| 28 | def11 | def11 | def11 | varchar2(100) |
| 29 | def12 | def12 | def12 | varchar2(100) |
| 30 | def13 | def13 | def13 | varchar2(100) |
| 31 | def14 | def14 | def14 | varchar2(100) |
| 32 | def15 | def15 | def15 | varchar2(100) |
| 33 | def16 | def16 | def16 | varchar2(100) |
| 34 | def17 | def17 | def17 | varchar2(100) |
| 35 | def18 | def18 | def18 | varchar2(100) |
| 36 | def19 | def19 | def19 | varchar2(100) |
| 37 | def20 | def20 | def20 | varchar2(100) |
| 38 | creationtime | creationtime | creationtime | char(19) |
| 39 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 42 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |