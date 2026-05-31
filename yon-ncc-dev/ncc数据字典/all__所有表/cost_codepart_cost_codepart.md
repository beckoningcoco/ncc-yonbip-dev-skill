# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7684.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_codepart | pk_codepart | pk_codepart | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | enablestate | enablestate | enablestate | char(1) |
| 4 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 5 | idepttype | idepttype | idepttype | number(38, 0) |
| 6 | innercode | innercode | innercode | varchar2(50) |
| 7 | iouthis | iouthis | iouthis | number(38, 0) |
| 8 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 9 | maketime | maketime | maketime | char(19) |
| 10 | name | name | name | varchar2(50) |
| 11 | parentid | parentid | parentid | char(20) |
| 12 | parentname | parentname | parentname | varchar2(50) |
| 13 | pk_calat | pk_calat | pk_calat | varchar2(20) |  |  | '~' |
| 14 | pk_departclass | pk_departclass | pk_departclass | varchar2(20) |  |  | '~' |
| 15 | pk_deptpf | pk_deptpf | pk_deptpf | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | rowno | rowno | rowno | varchar2(50) |
| 20 | splevel | splevel | splevel | varchar2(20) |  |  | '~' |
| 21 | umedical | umedical | umedical | char(1) |
| 22 | uprodisease | uprodisease | uprodisease | char(1) |
| 23 | usplit | usplit | usplit | char(1) |
| 24 | vhelpcode | vhelpcode | vhelpcode | varchar2(50) |
| 25 | vmemo | vmemo | vmemo | varchar2(50) |
| 26 | def1 | def1 | def1 | varchar2(100) |
| 27 | def2 | def2 | def2 | varchar2(100) |
| 28 | def3 | def3 | def3 | varchar2(100) |
| 29 | def4 | def4 | def4 | varchar2(100) |
| 30 | def5 | def5 | def5 | varchar2(100) |
| 31 | def6 | def6 | def6 | varchar2(100) |
| 32 | def7 | def7 | def7 | varchar2(100) |
| 33 | def8 | def8 | def8 | varchar2(100) |
| 34 | def9 | def9 | def9 | varchar2(100) |
| 35 | def10 | def10 | def10 | varchar2(100) |
| 36 | def11 | def11 | def11 | varchar2(100) |
| 37 | def12 | def12 | def12 | varchar2(100) |
| 38 | def13 | def13 | def13 | varchar2(100) |
| 39 | def14 | def14 | def14 | varchar2(100) |
| 40 | def15 | def15 | def15 | varchar2(100) |
| 41 | def16 | def16 | def16 | varchar2(100) |
| 42 | def17 | def17 | def17 | varchar2(100) |
| 43 | def18 | def18 | def18 | varchar2(100) |
| 44 | def19 | def19 | def19 | varchar2(100) |
| 45 | def20 | def20 | def20 | varchar2(100) |
| 46 | creationtime | creationtime | creationtime | char(19) |
| 47 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 50 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |