# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7693.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incomepro | pk_incomepro | pk_incomepro | char(20) | √ |
| 2 | code | code | code | varchar2(50) |  |  | '~' |
| 3 | enablestate | enablestate | enablestate | char(1) |
| 4 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 5 | grade | grade | grade | number(38, 0) |
| 6 | incoclassname | incoclassname | incoclassname | varchar2(50) |
| 7 | inforesourse | inforesourse | inforesourse | varchar2(50) |
| 8 | innercode | innercode | innercode | varchar2(50) |
| 9 | isbasicpro | isbasicpro | isbasicpro | char(1) |
| 10 | isdrug | isdrug | isdrug | char(1) |
| 11 | ismaterial | ismaterial | ismaterial | char(1) |
| 12 | isservice | isservice | isservice | char(1) |
| 13 | name | name | name | varchar2(50) |  |  | '~' |
| 14 | outp_hosp | outp_hosp | outp_hosp | number(38, 0) |
| 15 | parentid | parentid | parentid | varchar2(50) |
| 16 | parentname | parentname | parentname | varchar2(50) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 18 | pk_incomeclass | pk_incomeclass | pk_incomeclass | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | vmemo | vmemo | vmemo | varchar2(200) |
| 22 | def1 | def1 | def1 | varchar2(101) |
| 23 | def2 | def2 | def2 | varchar2(101) |
| 24 | def3 | def3 | def3 | varchar2(101) |
| 25 | def4 | def4 | def4 | varchar2(101) |
| 26 | def5 | def5 | def5 | varchar2(101) |
| 27 | def6 | def6 | def6 | varchar2(101) |
| 28 | def7 | def7 | def7 | varchar2(101) |
| 29 | def8 | def8 | def8 | varchar2(101) |
| 30 | def9 | def9 | def9 | varchar2(101) |
| 31 | def10 | def10 | def10 | varchar2(101) |
| 32 | creationtime | creationtime | creationtime | char(19) |
| 33 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 36 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |